<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<title>Home</title>

</head>
<body>
	<div style="border:solid 10px green; margin:0 auto;  width:1000px;height:70px">
	<tiles:insertAttribute name="header" />
	</div>
	<hr />
	<div style="margin-top:50px; margin-bottom:50px;">
		<div style="border:solid 10px green; float:left; margin:0 auto; width:150px; height:300px">
			<tiles:insertAttribute name="left" />
		</div>

		<div style="border:solid 10px green; margin:0 auto; width:800px; height: 400px; text-align:center" >
			<tiles:insertAttribute name="main" />
		</div>
	</div>
	<hr />
	<div style="border:solid 10px green;">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>