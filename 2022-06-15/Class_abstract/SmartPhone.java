package Class_abstract;

//실체 클래스
public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void InternetSearch(){
		System.out.println("인터넷을 검색합니다.");
	}
}
