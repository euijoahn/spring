<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<style type="text/css">
	.lnb {
  	width: 200px;
  	margin: 0; 
  	padding: 0; 
 	}
 	
	.lnb li {
  	list-style-type: none;
  	margin-bottom: 2px; 
 	}
 	
	.lnb li a { 
 	 display: block;
  	width: 100%; 
 	 padding: 5px 0; 
 	 text-indent: 8px; 
 	 text-decoration: none; 
 	 color: #666; 
  	font-family:arial;; 
  	background: #ccc; 
  	border: 1px solid #aaa;
  	-moz-border-radius:15px; 
  	-webkit-border-radius:15px; 
  	-border-radius:15px; 
	} 
	.lnb li a:hover { 
	  background: #666;
	  color: #fff; 
	}
	.lnb li.last a { 
	  border: 1px solid red; 
	}
	</style>
</head>

<body>
	<div>
		<ul class="lnb">
		<c:forEach items="${board}" var="board">				
			<li>
				<center><a href="/swe/board.do?Title=${board.boardTitle}&id=${member.ID}"> ${board.boardTitle}</a></center>
			</li>
		</c:forEach>
		<li><center><a href="/swe/attendBoard.do">attend new board</a></center></li>
		</ul>
	</div>    
</body>
</html>