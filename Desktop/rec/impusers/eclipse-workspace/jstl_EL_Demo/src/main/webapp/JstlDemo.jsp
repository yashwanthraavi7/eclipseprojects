<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
    <!--jstl main tag link   -->
    <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<% List<Integer> numList = new ArrayList<Integer>() ;
		numList.add(10);
		numList.add(20);
		numList.add(30);
		
		request.setAttribute("numList", numList);
	%>

	<c:out value="${'Hello World'}" />
	<br>
	<br>

	<c:set var="number" value="${1000}"></c:set>

	<c:out value="${number * 10}"></c:out>
	<br>
	<br>

	<c:forEach var="j" begin="1" end="3">
		<c:out value="${j}"></c:out>
		<br>
	</c:forEach>

	<c:forEach var="num" items="${numList}">
		<c:out value="${num}"></c:out>
		<br>
	</c:forEach>

</body>
</html>