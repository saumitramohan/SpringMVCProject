<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Admission Form</title>
</head>
<body>
	<h1>Student Admission Form</h1>
	<form action="/SpringMVCProject/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="studentName" />
		</p>
		<p>
			Student's Grade : <input type="text" name="studentGrade" />
		</p>
		<input type="submit" value="Submit this form by clicking here" />
	</form>
</body>
</html>