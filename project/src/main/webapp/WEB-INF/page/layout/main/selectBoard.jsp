<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<style type="text/css">
		#blogMenu {
		float:right;
		margin:0px 5px 3px 5px;
		padding:0 0 3px 0;
		box-shadow: 0px 0px 15px rgba(0,0,0,.3);
		-moz-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
		-webkit-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
		-o-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
		-moz-border-radius: 3px;
		-khtml-border-radius: 3px;
		-webkit-border-radius: 3px;
		border-radius: 3px;
		background-color:#5c5c5c;
	}
	</style>
</head>

<body>
	<table border="1" width='100%' height='60%'>
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
	<div id="blogmenu" align="right">
		<ul>
			<a href="/swe/deleteBoard.do?num=${oneboard.contentAttributeNum}&param=${oneboard.boardAttributeNum}">delete</a>
			<a href="/swe/editBoard.do?num=${oneboard.contentAttributeNum}&param=${oneboard.boardAttributeNum}">edit</a>
		</ul>
	</div>
</html>