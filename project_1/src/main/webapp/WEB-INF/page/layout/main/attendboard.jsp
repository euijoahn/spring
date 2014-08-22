<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
	<form method="post" action="/swe/attendBoardcomplete.do">
		<table border="0" width='100%' height='95%'>
			<tr bgcolor='bbbbbb'>
				<td><center>게시판 이름</center> </td><td><input type="text" name="board"></td>
			</tr>
			<tr bgcolor='bbbbbb'>
				<td><center>ID</center> </td><td><input type="text" name="id"></td>
			</tr>
		</table>
			<center><input type="submit" value="complete"></center>
	</form>
	</div>
</html>