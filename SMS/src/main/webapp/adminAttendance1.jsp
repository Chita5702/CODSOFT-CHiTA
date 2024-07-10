<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="sms.model.StudentDao"%>
<%@page import="sms.db.Student"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">
<head>
<title>Student Attendance</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor2/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor2/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor2/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/css/main.css">
<!--===============================================================================================-->




<div class="limiter">
	<div class="container-table100">
		<div class="wrap-table100">
			<div class="table">
				<form action="sms.controller.AdminStudentAttendance" method="post">
					<div class="row header">
						<div class="cell">
							Date: <input type="date" name="attendancedate">
						</div>
						<div class="cell">
							Branch: <select name="branch">
								<option value="CSE">CSE</option>
								<option value="Civil">Civil</option>
								<option value="MEC">ME</option>
								<option value="EEE">EEE</option>
								<option value="EE">EE</option>
							</select>
						</div>
						<div class="cell">
							Semester: <select name="semester">
								<option value="1st Semester">1st</option>
								<option value="2nd Semester">2nd</option>
								<option value="3rd Semester">3rd</option>
								<option value="4th Semester">4th</option>
								<option value="5th Semester">5th</option>
								<option value="6th Semester">6th</option>
								<option value="7th Semester">7th</option>
								<option value="8th  Semester">8th</option>
							</select>
						</div>
						<div class="cell">
							Subject: <select name="subject">
								<option value="Java">Java</option>
							</select>
						</div>
						<div class="cell">
							<input type="submit" value="Submit">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>




<!--===============================================================================================-->
<script src="vendor2/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="vendor2/vendor/bootstrap/js/popper.js"></script>
<script src="vendor2/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="vendor2/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="js/js/main.js"></script>
</body>
</html>