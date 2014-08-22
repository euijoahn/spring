<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
</head>
<body>
<a href="/swe/deleteattendedBoard.do?title=${title}" >delete</a>
<h1>${title} ${result2}</h1>
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
	</TR> 
</TABLE>
<TABLE border='0' cellspacing=1 cellpadding=2 width='600' ALIGN="center" VALIGN="center">
	<c:forEach items="${result}" var="board">
		<tr>				
			<td width ="5%"><font size=2><center><b>${board.contentAttributeNum}</b></center></font></td>      
			<td width = "30%"><font size=2><center><b><a href="/swe/selectBoard.do?num=${board.contentAttributeNum}">${board.contentTitle}</a></b></center></font></td>      
			<td width = "15%"><font size=2><center><b>${board.creator}</b></center></font></td>      
			<td width = "20%"><font size=2><center><b>${board.createDate}</b></center></font></td>
		</tr>
	</c:forEach>
</TABLE>
<a href="/swe/insertBoard.do?title=${title}">insert</a>
</body>
</html>