<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>swe Login</title>
<style>
input {
  border: 1px solid #bcbcbc;
  border-radius: 0px;
  -webkit-appearance: none;
  height: 30px;
​}
</style>
</head>
<body>

	<h1>
		Login  
	</h1>
	<div>
	<form method="post" action="/swe/Logincheck.do">
		<fieldset style="width:240; height:180; margin:0 auto">
			<P>
			<input type = "text" name = "ID" value = "ID">
			</P>
		
			<P>
			<input type = "password" name = "Password" value = "Password">
			</P>
	
			<input type = "submit" value = "Login">
		</fieldset>
	</form>
	</div>
	<div>
	<form method="post" action="/swe/Join.do">
		<fieldset >
			<P>
				<input type="submit" value="Join">
			</P>
		</fieldset>
	</form>
	</div>
	<P>
		Login failed
	</P>
</body>
</html>