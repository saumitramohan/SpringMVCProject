<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>
</head>
<body>

	<h1>Student Information Display Form :: ${headerMsg}</h1>
	<p>Details submitted by you</p>
	<table>
		<tr>
			<td>Student Name : </td>
			<td>${student.getStudentName()}</td>
		</tr>
		<tr>
			<td> Student Hobby : </td>
			<td> ${student.getStudentHobby()}</td>
		</tr>
		<tr>
			<td> Student Mobile Number : </td>
			<td> ${student.getStudentMobile()}</td>
		</tr>
		<tr>
			<td> Student DOB  : </td>
			<td> ${student.getDOB()}</td>
		</tr>
		<tr>
			<td> Student Skills  : </td>
			<td> ${student.studentSkills}</td>
		</tr>
		<tr>
			<td> Student address</td> 
		</tr>
		<tr>
			<td>	Country :  ${student.studentAddress.country}</td>
			<td>	City :     ${student.studentAddress.city} </td>
			<td>	Street :   ${student.studentAddress.street}</td>
			<td>	Pincode :  ${student.studentAddress.pincode}</td>
		</tr>
	</table>
</body>
</html>