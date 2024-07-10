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

/**
 * Servlet implementation class AdminChangePassword
 */
@WebServlet("/sms.controller.AdminChangePassword")
public class AdminChangePassword extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		// get data from presentation
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		String confirmpassword = request.getParameter("confirmpassword");

		HttpSession session = request.getSession();
		String emailid = (String) session.getAttribute("emailid");

		// Set data to POJO class
		Admin a = new Admin();
		a.setEmailid(emailid);
		a.setPassword(oldpassword);
		int status = AdminDao.validate(a);
		if (status > 0) {
			if (newpassword.equals(confirmpassword)) {
				a.setPassword(newpassword);
				int result = AdminDao.updatePassword(a);
				response.sendRedirect("adminWelcome.jsp?msg=Password Changed Sucessfully");

			} else
				response.sendRedirect("adminWelcome.jsp?msg=New Password or Confirm Password mismatch");
		} else
			response.sendRedirect("adminWelcome.jsp?msg=Invalid Old Password Entered");
	}
}
