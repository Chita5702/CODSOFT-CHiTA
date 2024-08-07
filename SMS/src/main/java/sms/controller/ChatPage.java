package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sms.controller.ChatPage")
public class ChatPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String emailid = request.getParameter("emailid");
		
		HttpSession session = request.getSession();
		session.setAttribute("receiverEmailid", emailid);
		session.setAttribute("receiverName", name);
		
		response.sendRedirect("chatPage.jsp");
	}

}
