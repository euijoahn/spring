<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
	<table border="1" width='100%' height='95%'>
		<tr>
			<td><center>글번호</center> </td><td>${oneboard.contentAttributeNum}</td>
		</tr>
		<tr bgcolor='bbbbbb'>
			<td><center>글제목</center> </td><td>${oneboard.contentTitle}</td>
		</tr>
		<tr>
			<td><center>작성자</center> </td><td>${oneboard.creatorID}</td>
		</tr>
		<tr>
			<td><center>작성일</center> </td><td>${oneboard.createDate}</td>
		</tr>
		<tr>
			<td rowspan="15"><center>글내용</center>  </td><td rowspan="15" colspan="15">${oneboard.content}</td>
		</tr>
	</table>
	<div align="right">
		<ul>
			<a href="/swe/deleteBoard.do?num=${oneboard.contentAttributeNum}">delete</a>
			<a href="/swe/editBoard.do?num=${oneboard.contentAttributeNum}">edit</a>
		</ul>
	</div>
</html>