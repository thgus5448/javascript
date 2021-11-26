package servlet;

import java.io.IOException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GuGudanServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get.........");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int dan = Integer.parseInt( req.getParameter( getServletInfo() ) );
		String msg="";
				
		System.out.println("post........." + dan);
		for(int i=1 ; i<10 ; i++) {
			msg += String.format("%s * %s = %s<br>");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("./servlet/servlet_test");
		req.setAttribute("msg", msg);
		rd.forward(req, resp);
	}

	/*
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("get or post.........");
	}
	*/
	
}
