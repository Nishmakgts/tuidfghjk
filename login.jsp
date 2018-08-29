<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:teal;">
<h2 align="center">IDBI BANK</h2>
<form action="LoginServlet" method="post">
<table>
<tr>
<td align="right">Username:</td>
<td align="right"><input type="text" name="username"></td>
</tr>
<tr>
<td align="right">PassWord:</td>
<td align="right"><input type="password" name="password"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="submit"></td>
<td><a href="Register.jsp">New user</a></td>
<% 
   if(request.getAttribute("msg")!=null){
    out.println(request.getAttribute("msg")); 
   }
%>
</tr>
</table>
</form>


</body>
</html>