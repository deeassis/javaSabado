<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1>Hello World!</H1>
	<%
			out.println("Hello world!");
	%>
	
	%>
	<form method="POST" action="index.jsp">
	
	<label>me diga seu nome</label>
	<input name="nometxt" type="text" />
	<input type="submit" placeholder="enviar" />
	</form>
	<%
		String nome = request.getParameter("nometxt");
		out.println("seu nome é " + nome);
	%>	
</body>
</html>