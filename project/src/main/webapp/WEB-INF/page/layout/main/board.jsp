<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
	<div id="blogMenu">
		<ul>
			<li><a href="/swe/insertBoard.do?title=${title}">insert</a></li>
			<li><a href="/swe/deleteattendedBoard.do?title=${title}" >delete</a></li>
		</ul>
	</div>

	<form>
		<center><h1>${title}</h1></center>
		<TABLE border='0' width='600' cellpadding='0' cellspacing='0' ALIGN="center" VALIGN="center">
			<TR>
				<TD>
					<hr size='1' noshade>
				</TD>
 			</TR>
		</TABLE>
		<TABLE border='0' cellspacing=1 cellpadding=2 width='600' ALIGN="center"ALIGN="center" VALIGN="center">      
			<TR bgcolor='bbbbbb'>      
				<TD width ="5%"><font size=2><center><b>No</b></center></font></TD>      
				<TD width = "30%"><font size=2><center><b>Title</b></center></font></TD>      
				<TD width = "15%"><font size=2><center><b>Name</b></center></font></TD>      
				<TD width = "20%"><font size=2><center><b>Date</b></center></font></TD>      
				<TD width = "10%"><font size=2><center><b>Hit</b></center></font></TD>
			</TR> 
		</TABLE>
		<TABLE border='0' cellspacing=1 cellpadding=2 width='600' ALIGN="center" VALIGN="center">
			<c:forEach items="${result}" var="board">
				<tr>				
					<td width ="5%"><font size=2><center><b>${board.contentAttributeNum}</b></center></font></td>      
					<td width = "30%"><font size=2><center><b><a href="/swe/selectBoard.do?num=${board.contentAttributeNum}&param=${board.boardAttributeNum}">${board.contentTitle}</a></b></center></font></td>      
					<td width = "15%"><font size=2><center><b>${board.creator}</b></center></font></td>      
					<td width = "20%"><font size=2><center><b>${board.createDate}</b></center></font></td>
					<td width = "10%"><font size=2><center><b>${board.hit}</b></center></font></td>
				</tr>
			</c:forEach>
		</TABLE>
	</form>
</body>
</html>