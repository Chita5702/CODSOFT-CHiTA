package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Contact;
import sms.model.ContactDao;

/**
 * Servlet implementation class ContactUs
 */
@WebServlet("/sms.controller.ContactUs")
public class ContactUs extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String emailid = request.getParameter("emailid");
		String message = request.getParameter("message");

		Contact c = new Contact();
		c.setName(name);
		c.setEmailid(emailid);
		c.setMessage(message);

		int status = ContactDao.register(c);
		if (status > 0)
			response.sendRedirect("index.jsp?msg=Contact success");
		else
			response.sendRedirect("index.jsp?msg=Invalid");

	}

}
