<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<h1>
		Join  
	</h1>
	<div>
	<form method="post" action="/swe/Joincheck.do">
		<fieldset style="width:240; height:240; margin:0 auto" >
			<P>
			<input type = "text" name = "ID" value = "ID">
			</P>
		
			<P>
			<input type = "password" name = "Password" value = "Password">
			</P>
			<P>
			<input type = "text" name = "Name" value = "Name">
			</P>
			<P>
			<input type = "text" name = "Phonenum" value = "Phone Number">
			</P>
	
			<input type = "submit" value = "complete">
		</fieldset>
	</form>
	<P>Join failed</P>
	</div>
</body>
</html>