<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = (String)request.getAttribute("name");
	String color = (String)request.getAttribute("color");
	String stone = (String)request.getAttribute("stone");
	String hero = (String)request.getAttribute("hero");
	String movie = (String)request.getAttribute("movie");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Your Result</title>
<style>span{color:skyblue; font-weight:bold;}</style>
</head>
<body>
<h1>Result by JSP</h1>
<span>Name : <%=name%></span><br>
<span>Color : <%=color%></span><br>
<span>Hero : <%=hero%></span><br>
<span>Movie : <%=movie%></span><br>
<hr>
<p>Your Infinity Stone is <%=stone%>.</p>
</body>
</html>