<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
	<form method="post" action="/swe/editCompleteBoard.do?num=${board1.contentAttributeNum}">
		<table border="0" width='100%' height='95%'>
			<tr>
				<td><center>글번호</center> </td><td>${board1.contentAttributeNum}</td>
			</tr>
			<tr bgcolor='bbbbbb'>
				<td><center>글제목</center> </td><td><input type="text" name="title" value=${board1.contentTitle}></td>
			</tr>
			<tr>
				<td><center>작성자</center> </td><td>${board1.creatorID}</td>
			</tr>
			<tr>
				<td><center>작성일</center> </td><td>${board1.createDate}</td>
			</tr>
			<tr>
				<td rowspan="15"><center>글내용</center>  </td><td rowspan="15" colspan="15"><input type="text" name="context" value=${board1.content}></td>
			</tr>
		</table>
			<center><input type="submit" value="complete"></center>
	</form>
	</div>
</html>