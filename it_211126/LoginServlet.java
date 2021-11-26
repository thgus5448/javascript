package servlet;

import java.io.IOException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "*.log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//mid, pwd를 req에서 가져옴
		String mid = req.getParameter("mid");
		String pwd = req.getParameter("pwd");
		MemberVo vo = null;
		
		HttpServlet
		
		//LoginDao.login(mid,pwd)를 실행하여 관련 데이터가 있는지 비교
		MemberDao dao = new MemberDao();
		vo = dao.login(mid, pwd);
		HttpSession session = req.getSession();
		
		//있으면 MemberVo값을 설정하여 req.setAttribute에 담아 반환
		session.setAttribute("vo", vo);
		
		//forwarding...
		Request.
		
	}
	
}
