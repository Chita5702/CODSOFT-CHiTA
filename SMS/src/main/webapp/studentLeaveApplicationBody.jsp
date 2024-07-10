<!DOCTYPE html>
<%@page import="sms.db.Student"%>
<%@page import="sms.model.StudentDao"%>
<html lang="en">
<head>
	<title> Student Leave Application</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	
	<link rel="stylesheet" type="text/css" href="fonts3/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor3/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor3/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor3/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor3/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor3/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css3/util.css">
	<link rel="stylesheet" type="text/css" href="css3/main.css">
<!--===============================================================================================-->
</head>
<body>
<%
	String emailid = (String)session.getAttribute("emailid");
	Student s1 = StudentDao.getDetails(emailid);
%>


	<div class="container-contact100">

		<div class="wrap-contact100">
			<form class="contact100-form validate-form" action="sms.controller.StudentLeaveApplication" method="post">
				<span class="contact100-form-title">
					Leave Application
				</span>
				
				
				<div class="wrap-input100 validate-input" data-validate="Please enter your regdno">
					
					<input class="input100" type="text" name="regdno" placeholder="Regd No" value="<%= s1.getRegdno()%>" readonly="readonly" >
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Please enter your email: e@a.x">
					<input class="input100" type="text" name="emailid" placeholder="E-mail" value="<%= s1.getEmailid()%>" readonly="readonly">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Please enter your date">
					<input class="input100" type="date" name="to" placeholder="To" >
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Please enter your date">
					<input class="input100" type="date" name="from" placeholder="From">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Please enter your message">
					<textarea class="input100" name="message" placeholder="Your Message"></textarea>
					<span class="focus-input100"></span>
				</div>

				<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						<span>
							<i class="fa fa-paper-plane-o m-r-6" aria-hidden="true"></i>
							Send
						</span>
					</button>
				</div>
			</form>
		</div>
	</div>



	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="vendor3/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor3/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor3/bootstrap/js/popper.js"></script>
	<script src="vendor3/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor3/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor3/daterangepicker/moment.min.js"></script>
	<script src="vendor3/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor3/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js3/main.js"></script>

<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
