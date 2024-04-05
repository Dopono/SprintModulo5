<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h1><%=request.getParameter("msg") %></h1>
	<input type="button" value="Volver atrás" onclick="window.location.href='Inicio.jsp'">
</body>
</html>