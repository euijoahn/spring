<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login</title>
	<style type="text/css">
	*{ 
		margin: 0; 
		padding: 0; 
	}
	body{ 
		font-family: arial;
	}

	.clear{ 
		clear: both; 
	}

	form{ 
		width: 400px; 
		margin: 100px auto 0; 
	}

	legend{ 
		display: none; 
	}

	fieldset{ 
		border: 0; 
	}

	label{ 
		width: 115px; 
		text-align: right; 
		float: left; 
		margin: 0 10px 0 0; 
		padding: 9px 0 0 0; 
		font-size: 16px; 
	}

	input{ 
		width: 220px; 
		display: block; 
		padding: 4px; 
		margin: 0 0 10px 0; 
		font-size: 18px;
		color: #3a3a3a; 
		font-family: Georgia, serif;
	}
	</style>
</head>

<body>
	<form method="post" action="/swe/logincheck.do">
		<fieldset>
			<center><h1>Login</h1></center>
			<P>
				<label>ID : </label>
				<input type = "text" name = "ID" value = "ID">
			</P>
		
			<P>
				<label>Password : </label>
				<input type = "password" name = "Password" value = "Password">
			</P>
	
			<center><input type = "submit" value = "Login"></center>
		</fieldset>
	</form>
		<center><a href="/swe/join.do"><input type="button" value="Join"/></a></center>
		<center><p>login fail</p></center>
		
</body>
</html>