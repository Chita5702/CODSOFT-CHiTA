<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String emailid = request.getParameter("emailid");
	%>
	<h1>Verify OTP</h1>
	<form action="sms.controller.VerifyStudentOTP" method="post">
		<input type="hidden" name="emailid" value="<%=emailid%>"> OTP
		: <input type="text" name="otp"><br> <input type="submit"
			value="Verify">
	</form>
</body>
</html>