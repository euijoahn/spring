<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>com.kt.swe</title>

<style type="text/css">
#mainMenu{
  list-style: none;
  margin: 0; padding: 0 0 25px 5px;
  background-color: #000000; border-bottom: 1px solid #ffcc00;
 }
#mainMenu li{
  float: right;
  margin: 0; padding: 0 10px;
}
#mainMenu a{
  display: block;
  margin: 0; padding: 5px 0 4px 0;  
  height: 16px;
  font-family: verdana; font-size: 9px; color: #ffffff; font-weight: bold;
  text-decoration:none; 
}
#mainMenu a:visited{ color: #ffffff; }
#mainMenu a:hover{ color: #ff6600; }
#mainMenu a:active{ color: #0066ff; }
#mainMenu a:hover, #mainMenu a:active{
  background: url(images/line_dot.gif) no-repeat 50% 100%;
}

body {
	margin: 0;
}
header {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	height: 100px;
	background-color: #ccc;
}
article {
	position: absolute;
	top: 100px;
	bottom: 50px;
	left: 0;
	right: 200px;
	overflow: auto;
}
aside {
	position: absolute;
	top: 100px;
	bottom: 50px;
	left: 0;
	width: 200px;
	overflow: auto;
	background-color: #eee;
}
</style>
</head>
	<header>
		<div id="menu" style="float:right; background: #DAE0D2 ;line-height:normal;">
			<ul id="mainMenu">
				<li><a href="/swe/Login.do">Login</a></li>
			</ul>
		</div>
		<P>header</P>
	</header>
	<article></article>
<body>