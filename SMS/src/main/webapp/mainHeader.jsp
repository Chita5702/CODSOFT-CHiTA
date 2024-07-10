<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Educational Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--// Meta tag Keywords -->
<!-- css files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all">
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<!-- //css files -->
<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i&subset=latin-ext" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Covered+By+Your+Grace" rel="stylesheet">
<!-- //online-fonts -->
</head>
<body>
<div class="main-w3layouts" id="home">
	<!--top-bar-->
	<div class="top-search-bar">
		<div class="header-top-nav">
			<ul>
				<li><a href="#" data-toggle="modal" data-target="#myModal1"><i class="fa fa-key" aria-hidden="true"></i><b>ADMIN</b></a></li>
				<li><a href="#" data-toggle="modal" data-target="#myModal3"><i class="fa fa-key" aria-hidden="true"></i><b>STUDENT</b></a></li>
				<li><a href="#" data-toggle="modal" data-target="#myModal4"><i class="fa fa-key" aria-hidden="true"></i><b>TEACHER</b></a></li>
			</ul>
		</div>
	</div>
	
	<!-- Modal1 -->
		<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4>Admin Login Account</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.AdminLogin" method="post">
								<input type="email" placeholder="Email" required="" name="emailid">
								<input type="password" placeholder="Password" name="password">
								<input type="submit" value="Login">
								<p style="text-align: center;">Click here for <a href="#" data-toggle="modal" data-target="#myModal5">Forget Password</a></p>
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
			<div class="clearfix"></div>
			
			<!-- Admin forgot password -->
			<div class="modal fade" id="myModal5" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4>Admin Forgot Password</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.AdminForgotPassword" method="post">
								<input type="email" placeholder="Email" required="" name="emailid">
								<input type="submit" value="Send">
								
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
			<div class="clearfix"></div>
	<!-- //Modal1 -->
	
	<!-- Modal3 -->
		<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4>Student Login Account</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.StudentLogin" method="post">
								<input type="email" placeholder="Emailid" required="" name="emailid">
								<input type="password" placeholder="Password" name="password">
								<input type="submit" value="Login">
								<p style="text-align:center;">Click here for <a href="#" data-toggle="modal" data-target="#myModal6">Forget password</a></p>
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
			<div class="clearfix"></div>
			
			<!-- Student forgot password -->
			<div class="modal fade" id="myModal6" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4>Student Forgot Password</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.StudentForgotPassword" method="post">
								<input type="email" placeholder="Emailid" required="" name="emailid">
								<input type="submit" value="Send">
								
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
			<div class="clearfix"></div>
	<!-- //Modal3 -->

	<!-- Modal4 -->
		<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4> Teacher Login Account</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.TeacherLogin" method="post">
								<input type="email" placeholder="Emailid" required="" name="emailid">
								<input type="password" placeholder="Password" name="password">
								<input type="submit" value="Login">
								<p style="text-align: center;">Click here for <a href="#"data-toggle="modal" data-target="#myModal7" >Forget password</a></p>							
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
			<div class="clearfix"></div>
			<!--Teacher Forgot Password-->
			<div class="modal fade" id="myModal7" tabindex="-1" role="dialog" >
			<div class="modal-dialog" role="document">
			<!-- Modal content-->
				<div class="modal-content news-w3l">
						<div class="modal-header">
							<button type="button" class="close w3l" data-dismiss="modal">&times;</button>
							<h4> Teacher Forgot Password</h4>
							<!--Login-->
							<div class="login-main wthree">
							  <form action="sms.controller.TeacherForgotPassword" method="post">
								<input type="email" placeholder="Emailid" required="" name="emailid">
								<input type="submit" value="send">															
							</form>
							</div>
						<!--//Login-->			
						</div>
					</div>
				</div>
			 </div>
		
	<!-- //Modal4 -->

				<!-- <!-- <div class="search">
						<form action="#" method="post">
							<input type="search" placeholder="Search Here..." required="" />
							<input type="submit" value=" ">
						</form>
				</div> --> -->
					<div class="clearfix"></div>
	<!--//top-bar-->
	<!-- navigation -->
			<div class ="top-nav">
				<nav class="navbar navbar-default">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							
						</div>
						<!-- navbar-header -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav navbar-right">
								<li><a href="index.html" class="hvr-underline-from-center active">Home</a></li>
								<li><a href="#about" class="hvr-underline-from-center scroll">About Us</a></li>
								
								<li><a href="#gallery" class="hvr-underline-from-center scroll">Gallery</a></li>
								<li><a href="#team" class="hvr-underline-from-center scroll">Our Team</a></li>
								<li><a href="#events" class="hvr-underline-from-center scroll">Events</a></li>
								<li><a href="#contact" class="hvr-underline-from-center scroll">Contact Us</a></li>
							</ul>
						</div>
						<div class="clearfix"> </div>	
				</nav>
			</div>
	<!-- //navigation -->
