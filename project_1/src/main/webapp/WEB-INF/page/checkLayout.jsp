<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
</head>
<body>
	<div>
	<tiles:insertAttribute name="header" />
	</div>
	<div>
		<div>
			<tiles:insertAttribute name="left" />
		</div>

		<div>
			<tiles:insertAttribute name="main" />
		</div>
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>