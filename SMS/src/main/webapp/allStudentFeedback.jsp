<!DOCTYPE html>
<%@page import="sms.model.StudentFeedbackDao"%>
<%@page import="sms.db.FeedbackStudent"%>
<%@page import="java.util.Iterator"%>
<%@page import="sms.model.StudentDao"%>
<%@page import="sms.db.Student"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">
<head>
<title>Student Feedback</title>
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

				<div class="row header">

					<div class="cell">Regd No</div>
					<div class="cell">Emailid</div>
					<div class="cell">Message</div>
				</div>
				<%
					ArrayList<FeedbackStudent> all = StudentFeedbackDao.fetchStudentFeedback();
					Iterator it = all.iterator();
					while (it.hasNext()) {
						FeedbackStudent fs = (FeedbackStudent) it.next();
				%>
				<div class="row">

					<div class="cell" data-title="Age">
						<%=fs.getRegdno()%>
					</div>
					<div class="cell" data-title="Job Title">
						<%=fs.getEmailid()%>
					</div>
					<div class="cell" data-title="Location">
						<%=fs.getMessage()%>
					</div>
				</div>

				<%
					}
				%>

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