<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>반복작업</h2>
	<hr/>
	<c:forEach var = "num" begin="1" end="10" step="2" varStatus="mystatus">
		<h2>${num}, index=${mystatus.index}, first=${mystatus.first},
			last=${mystatus.last},begin=${mystatus.begin},end=${mystatus.end},
			step=${mystatus.step}</h2>	
	</c:forEach>
	
	
	<h2>7단 출력</h2>
	<hr/>
	<c:forEach var ="i" begin="1" end="9">
		<h3>7*${i}=${7*i}</h3>
	</c:forEach>
	

</body>
</html>