package sms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sms.db.Admin;
import sms.model.AdminDao;
import sms.model.StudentDao;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/sms.controller.DeleteStudent")
public class DeleteStudent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String emailid = request.getParameter("emailid");

		int status = StudentDao.deleteStudent(emailid);
		if (status > 0) {
			response.sendRedirect("deleteStudent.jsp?msg=Deleted");
		} else {
			response.sendRedirect("deleteStudent.jsp?msg=Error");
		}

	}

}
