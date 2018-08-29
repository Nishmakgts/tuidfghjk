<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body style="background-color:teal;">
<h2 align="center">IDBI BANK</h2>
<form action="CustomerServlet" method="post">
<strong>Name:</strong><br>
 <input type="text" name="customerName" align="middle"><br>
<strong>CustmerID:</Strong><br>
<input type="text" name="customerID" align="middle"><br>
<strong>Address:</strong><br>
<input type="text" name="address" align="middle"><br>
<strong>IdentificationNumber:</Strong><br>
 <input list="identification" name="identification">
 <datalist id="identification">
    <option value="PAN CARD">
    <option value="AADHAR CARD">
    <option value="DRIVING LICENCE">
  </datalist>
<input type="text" name="contact" align="middle"><br>
<strong>Choose any of the given account!</strong><br>
<input type="radio" name="account" value="current" align="middle">Current Account<br>
<input type="radio" name="account" value="savings" align="middle">Savings Account<br>
<input type="submit" value="submit" align="middle">
</form>
</body>
</html>