package sms.service;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import sms.db.Admin;
import sms.db.Student;
import sms.db.Teacher;

public class SendPassword {

	public String sendStudentPassword(Student s) {
		String to = s.getEmailid();
		String subject = "OTP Sent";
		char[] msg1 = otp_ForStudent(5);
		String otp1 = String.valueOf(msg1);
		System.out.println(otp1);
		String message = "Dear student Please Login Using " + s.getEmailid() + "& password is:" + otp1;

		String from = "thetechpoint.project@gmail.com";
		String password = "thetechpoint1";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
		return otp1;
	}

	private char[] otp_ForStudent(int len) {
		System.out.println("Generating OTP using random():");
		System.out.println("Your new OTP is:");

		String numbers = "123456789";
		Random r = new Random();
		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
		}

		return otp;
	}

	public String sendTeacherPassword(Teacher s) {
		String to = s.getEmailid();
		String subject = "OTP Sent";
		char[] msg1 = otp_ForTeacher(5);
		String otp1 = String.valueOf(msg1);
		System.out.println(otp1);
		String message = "Dear student Please Login Using " + s.getEmailid() + "& password is:" + otp1;

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
		return otp1;
	}

	private char[] otp_ForTeacher(int len) {
		System.out.println("Generating OTP using random():");
		System.out.println("Your new OTP is:");

		String numbers = "123456789";
		Random r = new Random();
		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
		}

		return otp;
	}

	public void sendAdminForgotPassword(Admin a) {
		String to = a.getEmailid();
		String subject = "OTP Sent";

		String message = "Dear Admin Please verify OTP " + a.getOtp();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
	}

	public static void sendAdminLoginPassword(Admin db) {
		String to = db.getEmailid();
		String subject = "Password Sent";

		String message = "Dear Admin Your Password is " + db.getPassword();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}

	public void sendStudentForgotOtp(Student a) {
		String to = a.getEmailid();
		String subject = "OTP Sent";

		String message = "Dear Student Please verify OTP " + a.getOtp();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}

	public static void sendStudentLoginPassword(Student db) {
		String to = db.getEmailid();
		String subject = "Password Sent";

		String message = "Dear Student Your Password is " + db.getPassword();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}

	public void sendTeacherForgotOtp(Teacher a) {

		String to = a.getEmailid();
		String subject = "OTP Sent";

		String message = "Dear Teacher Please verify OTP " + a.getOtp();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}

	public static void sendTeacherLoginPassword(Teacher db) {
		String to = db.getEmailid();
		String subject = "Password Sent";

		String message = "Dear Teacher Your Password is " + db.getPassword();

		String from = "lit.lab.project@gmail.com";
		String password = "litproject2018";

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}

}
