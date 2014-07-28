<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  contentType="text/html; charset=UTF-8"  language="java"%>
<%@ page import="com.kt.swe.mybatis.*" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<ul>
<c:forEach items="${list}" var="member">
	<li>
	${member.ID} 
	${member.password} 
	${member.name} 
	${member.phone_num}	
	</li>
</c:forEach>
</ul>
</body>
</html>
