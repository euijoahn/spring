<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
	<ul>
		<c:forEach items="${board}" var="board">				
			<li>
				<a href="/swe/board.do?Title=${board.boardTitle}"> ${board.boardTitle}</a>
			</li>
		</c:forEach>
		<li><a href="/swe/attendBoard.do">attend new board</a></li>
	</ul>
</div>    