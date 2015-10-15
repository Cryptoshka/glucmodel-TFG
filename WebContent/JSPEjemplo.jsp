<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<p>Desde un JSP podemos acceder a request, response, out, session, etc.
		
		<h2> Tipos de Scriptlets </h2>
		
		<h3> 1. Scriptlet normal </h3>
		<% out.println("Tu dirección IP es: " + request.getRemoteAddr()); %>
		
		<h3> 2. Declaraciones </h3>
		<p> Son un tipo especial de scriptlets que permiten declarar variables o métodos para usarlos más adelante </p>
		<%! int i = 0;  %>
		
		<h3> 3. Expresiones </h3>
		<p> Este tipo de scriptlet contiene fragmentos java que se evalúan como expresiones, se convierten en String
			y se incluyen en el documento resultante. </p>
		<p> Hoy es <%= (new java.util.Date()).toLocaleString() %> </p>
	</body>
</html>