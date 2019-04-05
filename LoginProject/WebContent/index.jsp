<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome</h1>
	<form action="login" method="get">
		UserName : <input type="text" name="uname">
		Password : <input type="password" name="upwd">
		<input type="submit" value="LoginApp">
	</form>
	
	<%
		out.println("Test");
		out.println(session.getAttribute("MyLearning"));
	%>
	
	
	<%! int xaxis = 100; %>
	
	<h1>The Current xaixs Location is : </h1><%= xaxis %>

</body>
</html>