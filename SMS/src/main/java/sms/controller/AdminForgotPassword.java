package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Admin;
import sms.model.AdminDao;
import sms.service.GenerateOtp;
import sms.service.SendPassword;

/**
 * Servlet implementation class AdminForgotPassword
 */
@WebServlet("/sms.controller.AdminForgotPassword")
public class AdminForgotPassword extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		Admin a = new Admin();
		a.setEmailid(emailid);

		char[] otp = GenerateOtp.adminForgotPassword(5);
		String otp1 = String.valueOf(otp);
		a.setOtp(otp1);
		SendPassword p = new SendPassword();
		p.sendAdminForgotPassword(a);

		int status = AdminDao.setOtp(a);

		response.sendRedirect("adminVerify.jsp?emailid=" + emailid);

	}

}
