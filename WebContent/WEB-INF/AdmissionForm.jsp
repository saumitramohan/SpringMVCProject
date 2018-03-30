<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix= "form" uri= "http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Admission Form</title>
</head>

<body>
	<form:errors path= "student.*" />
	<form action="/SpringMVCProject/submitAdmissionForm.html" method="post">

		<h1>Student Admission Form</h1>
		<table>
			<tr>
				<td>Student's Name</td>
				<td><input type="text" name="studentName" /></td>
			</tr>

			<tr>
				<td>Student's Grade</td>
				<td><input type="text" name="studentGrade" /></td>
			</tr>

			<tr>
				<td>Student's Mobile</td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>

			<tr>
				<td>Student's DOB</td>
				<td><input type="text" name="DOB" /></td>
			</tr>

			<tr>
				<td>Student's Skill Set</td>
				<td><select name="studentSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select>
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td> Country </td>
				<td><input type="text" name="studentAddress.country"></td>
			<tr>
			<tr>
				<td>City </td>
				<td><input type="text" name="studentAddress.city"></td>
			<tr>
			<tr>
				<td> Street Address </td>
				<td><input type="text" name="studentAddress.street"></td>
			<tr>
			<tr>
				<td> Pincode </td>
				<td><input type="text" name="studentAddress.pincode"></td>
			<tr>
			
				<td><input type="submit"
					value="Submit this form by clicking here" /></td>
			</tr>
		</table>
	</form>
</body>
</html>