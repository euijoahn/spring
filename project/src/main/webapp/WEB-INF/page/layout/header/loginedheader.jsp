<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
	<head>
		<style type="text/css">
		div, ul, li { margin:0; padding:0; }
		
		#name{
		font-family:arial;
		float:left;
		}
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

	#blogMenu ul li {
		float:left;
		list-style-type:none;
	}

	#blogMenu a {
		height:16px;
		color:#f1f1f1;
		font-family:arial;
		font-size:12px;
		padding:0 10px 0 10px;
		text-decoration:none;
	}

	#blogMenu a:hover {
		color:#D4F4FA;
		border-bottom:3px solid #FAED7D;
	}	
	</style>
</head>

<body>
	<div id="name">
		<h1><a href="/swe/index.do">project</a></h1>
	</div>
	<div id="blogMenu">
		<ul>
			<li>${member.ID}님 반갑습니다.</li>
			<li><a href="/swe/logout.do?id=${member.ID}">로그아웃</a></li>
			<li><a href="#">도움말</a></li>
		</ul>
	</div>
</body>
</html>