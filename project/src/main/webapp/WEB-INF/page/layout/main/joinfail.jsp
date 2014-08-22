<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Join</title>
	<style type="text/css">
	* { 
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
	<form method="post" action="/swe/joincheck.do">
		<fieldset>
		<center><h1>Join</h1></center>
			<P>
				<label>ID : </label>
				<input type = "text" name = "inputID">
			</P>
		
			<P>
				<label>Password : </label>
				<input type = "password" name = "inputPassword">
			</P>
			<P>
				<label>Name : </label>
				<input type = "text" name = "Name">
			</P>
			<P>
				<label>Phone number : </label>
				<input type = "text" name = "Phonenum">
			</P>
	
			<center><input type = "submit" value = "complete"></center>
		</fieldset>
		<center><p>Join Fail</p></center>
	</form>
</body>
</html>