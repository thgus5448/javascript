/* DAO(Data Access Object)
 * 데이터베이스에 접근하여 CRUD 작업을 수행하기 위한 객체
 */
package model1.board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletContext;

import common.JDBConnect;

public class BoardDAO extends JDBConnect{

	// 생성자
	public BoardDAO(ServletContext application) {
		super(application);	//BoardDAO의 생성자에서 부모 클래스(JDBConnect)의 생성자를 호출
	}
	
	// 검색 조건에 맞는 게시물의 개수를 반환
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;	// 결과(게시물의 수)를 담을 변수
		
		/* 게시물 수를 얻어오는 쿼리문 
		 * SELECT COUNT(*) PROM board WHERE title(searchField) LIKE '%홍길동(SearchWord)%' */
		String query = "SELECT COUNT(*) FROM board";
		if( map.get("searchWord") != null ) { //검색어를 입력했다면
			query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("SearchWord") + "%'"; 
		}
		
		try {
			stmt = con.createStatement();	// 쿼리문 생성
			rs = stmt.executeQuery(query);	//쿼리 실행
			rs.next();	// 커서를 첫 번째 행으로 이동
			totalCount = rs.getInt(1);	// 첫 번째 컬럼 값을 가져옴
		} catch (Exception e) {
			System.out.println("게시물 수를 구하는 중 예외 발생");
			e.printStackTrace();
		}
		
		return totalCount;
	}
	
	// 검색 조건에 맞는 게시물 목록을 반환
	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<BoardDTO>();	// 결과(게시물 목록)를 담을 변수
		/* ★ 테이블에서 레코드(=row)를 가져올 때는 항상 List 계열의 컬렉션에 저장한다.
		 * List 컬렉션에는 데이터가 순서대로 저장되어 인덱스를 통해 가져올 수 있기 때문
		 * ★ Vector를 사용했지만 ArrayList나 LinkedList 등 List 계열의 컬렉션이라면 모두 동일하게 사용 가능
		 * ★ ArrayList와 vector 비교
		 * 공통점 : 내부에 값이 추가되면 자동으로 크기 조절. 그 다음 객체들은 한 자리씩 뒤로 이동.
		 * 차이점 : vector는 동기화된 메소드로 구성 = 멀티스레드가 동시에 이 메소드들을 실행할 수 없다.
		 */
		
		/* 게시물 목록을 가져오는 쿼리문 
		 * SELECT * FROM board WHERE (searchField) LIKE %(searchWord)% ORDER BY num DESC";
		 */
		String query =	"SELECT * FROM board";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " + "LIKE '%" + map.get("searchWord") + "%'";
		}
		query += " ORDER BY num DESC";	// num 컬럼을 내림차순(DESC)순으로 정렬
		
		try {
			stmt = con.createStatement();	//쿼리문 생성
			rs = stmt.executeQuery(query);	//쿼리문 실행
			
			while (rs.next()) {	//결과를 순화하며...
				//한 행(게시물 하나)의 내용을 DTO에 저장
				BoardDTO dto = new BoardDTO();
				
				dto.setNum(rs.getString("num"));				// 일련번호
				dto.setTitle(rs.getString("title"));			// 제목
				dto.setContent(rs.getString("content"));		// 내용
				dto.setPostdate(rs.getDate("postdate"));		// 작성일
				dto.setId(rs.getString("id"));					// 작성자 아이디
				dto.setVisitcount(rs.getString("visitcount"));	// 조회수
				
				bbs.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		
		return bbs;
 	}

	// 게시글 데이터를 받아 DB에 추가
	public int insertWrite(BoardDTO dto) {
		int result = 0;
		
		try {
			//INSERT 쿼리문 작성 : INSERT INTO board (num, title, contnt, id, visitcount) VALUES (seq_board_num.NEXTVAL, ?, ?, ?, 0);
			String query = "INSERT INTO board (num, title, content, id, visitcount)"
						 + "VALUES (seq_board_num.NextVAL, ?, ?, ?, 0)";
			
			psmt = con.prepareStatement(query);	//동적 쿼리문 생성
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			
			//성공적으로 추가한 행의 개수를 돌려준다.
			result = psmt.executeUpdate();	//executeUpdate() : 반영된 레코드(행)의 건수를 반환
		} catch (Exception e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;	//성공적으로 추가항 행의 개수를 jsp로 반환
	}

	// 지정한 게시물을 찾아 내용을 반환(=게시물 조회)
	 public BoardDTO selectView(String num) {
		 BoardDTO dto = new BoardDTO();
	 
		 // 쿼리문 준비
		 // SELCET B.*, M.NAME FROM member M INNER JOIN board B ON M.id=B.id WHERE num=?"
		 String query = "SELECT B.*, M.name "
				 	  + " FROM member M INNER JOIN board B "
				 	  + " ON M.id=B.id "
				 	  + " WHERE num=?";
		 
		 try {
			 psmt = con.prepareStatement(query);
			 psmt.setString(1, num);	// 인파라미터를 일련번호로 설정
			 rs = psmt.executeQuery();	// 쿼리 실행
			 
			 // 결과 처리
			 if(rs.next()) {
				 dto.setNum(rs.getString(1));
				 dto.setTitle(rs.getString(2));
				 dto.setContent(rs.getString("content"));
				 dto.setPostdate(rs.getDate("postdate"));
				 dto.setId(rs.getString("id"));
				 dto.setVisitcount(rs.getString(6));
				 dto.setName(rs.getString("name"));
			 }
		 } catch (Exception e) {
			System.out.println("게시물 상세보기 중 예외 발생");
			e.printStackTrace();
		}
		 
		 return dto;
	 }

	 // 지정한 게시물의 조회수를 1 증가
	 public void updateVisitCount(String num) {
		 // 쿼리문 준비
		 String query = "UPDATE Board SET " 
				 	  + "visitcount=visitcount+1 "
				 	  + " WHERE num=?";
		 try {
			 psmt = con.prepareStatement(query);
			 psmt.setString(1, num);	// 인파라미터를 일련번호로 설정
			 psmt.executeQuery();		// 쿼리 실행 - executeUpdate() 메소드는 업데이트가 적용된 행의 개수를 알 필요가 있을때 사용. 무방하다면 executeQuery()를 사용해도 됨
		} catch (Exception e) {
			System.out.println("게시물 조회수 증가 중 예외 발생");
			e.printStackTrace();
		}
	 }
}
