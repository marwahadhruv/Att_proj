<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form method="POST" id="countForm" name="countForm"
			action="/welcome">
<table>
<tr>
<td>
	<label>School:</label>
</td>
<td>
    <select>
  		<option value="AFGJI">AFGJI</option>
  		<option value="DPS">DPS</option>
  		<option value="DAV">DAV</option>
  		<option value="Sachdeva Public School">Sachdeva Public School</option>
  		<option value="Carmel Convent">Carmel Convent</option>
	</select>
<td>
<c:set var="loginModel.schoolName" scope="session"  value="${param.schoolName}" />
</tr>
<tr>
<td><input type="submit" id="loginAdmin" name = "loginAdmin" />
</td>
<td><input type="button" id="loginTeacher" name = "loginTeacher"/></td>
</tr>
</table>
</form>
</body>
</html>