<!DOCTYPE html>
<%@page import="sms.model.StudentAttendanceDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="sms.model.StudentDao"%>
<%@page import="sms.db.Student"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">
<head> 
	<title>Take Attendence</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor2/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor2/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor2/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/css/main.css">
<!--===============================================================================================-->

<div class="row header">
<form action="sms.controller.TakeAttendance">
							<div class="cell">
								Date:<input type="date" name="attendancedate">
							</div>
							<div class="cell">
								Semester:
								<select name="semester">
										<option value="7th">7th</option>
										<option value="8th">8th</option>
									
											</select>
							</div>
							<div class="cell">
								Branch: 
								<select name="branch">
									<option value="CSE" >CSE</option>
									<option>IT</option>
								
										</select>
							</div>
							<div class="cell">
								Subject:
								<select name="subject">
										<option value="Java">Java</option>
										<option>Oracle</option>
									
											</select>
							</div>
							<div class="cell">
								<input type="submit" value="Submit"></button>
							</div>
				
					</form>
						</div>

	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
					<div class="table">

						<div class="row header">
							<div class="cell">
								Full Name
							</div>
							<div class="cell">
								Regd No
							</div>
							<div class="cell">
								Emailid
							</div>
							<div class="cell">
								Attendance
							</div>
						</div>
<%
	String branch = (String)session.getAttribute("branch");
	String semester = (String)session.getAttribute("semester");
	String subject = (String)session.getAttribute("subject");
	String attendancedate = (String)session.getAttribute("attendancedate");
	
	ArrayList<Student> all = StudentDao.fetchStudentAttendence(branch,semester);
	Iterator it = all.iterator();
	while(it.hasNext())
	{
		Student s1 = (Student)it.next();
		String emailid= s1.getEmailid();
		
%>
						<div class="row">
							<div class="cell" data-title="Full Name">
								<%=s1.getName() %>
							</div>
							<div class="cell" data-title="Age">
								<%=s1.getRegdno() %>
							</div>
							<div class="cell" data-title="Job Title">
								<%=s1.getEmailid() %>
							</div>
							<div class="cell" data-title="Location">
							<%
							String status = StudentAttendanceDao.getStatus(emailid,branch,semester,subject,attendancedate);
							System.out.println(status);
								if(status!=null)
								{
									if(status.equals("1"))
									{
										%>
										Present
										<%
									}
									if(status.equals("0"))
									{
										%>
										Absent
										<%
									}
								}
								else
								{
							%>
							
								<a href="sms.controller.RegisterAttendence?name=<%=s1.getName()%>&regdno=<%=s1.getRegdno()%>&emailid=<%=s1.getEmailid()%>&status=1">Present</a> 
								<a href="sms.controller.RegisterAttendence?name=<%=s1.getName()%>&regdno=<%=s1.getRegdno()%>&emailid=<%=s1.getEmailid()%>&status=0">Absent</a>
							<%
							
								}
							%>
							
							
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