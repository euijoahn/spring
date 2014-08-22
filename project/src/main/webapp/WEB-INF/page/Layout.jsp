<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
body {
   margin:0;
   padding:0;
   height:100%;
}
#container {
   min-height:100%;
   position:relative;
}
#left{
   	position:absolute;
	float:left;
	reft:0px;
	bottom:60px;
	top:150px;
	width:150px;
	background:white;
}
#header {
   position:absolute;
   width:100%;
   height:100px;
   background:gray;
   padding:10px;
}
#main {
   float:right;
   width:80%;
   padding:10px;
   padding-top:120px;
   padding-bottom:60px;   /* Height of the footer */
}
#footer {
   position:absolute;
   bottom:0;
   width:100%;
   height:60px;   /* Height of the footer */
   background:gray;
}
</style>
</head>
<body id="container">
	<div id="header" >
	<tiles:insertAttribute name="header" />
	</div>
	<hr />
	<div>
		<div id="left">
			<tiles:insertAttribute name="left" />
		</div>

		<div id="main" >
			<tiles:insertAttribute name="main" />
		</div>
	</div>
	<hr />
	<div id="footer" >
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>