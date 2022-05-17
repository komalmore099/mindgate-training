<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!String message="Multiplication Table of :" ; %>
<%! int num; %>
<%
num=Integer.parseInt(request.getParameter("txtname"));
%>
<%
out.println(message);
%>

<table border="1">
<%
for (int i=1;i<=10;i++)
{
	%>
	<tr>
	<td><%=num %></td>
	<td> <%=i%></td>
	<td><%=num * i %></td>
	</tr> 
	<%
	}
%>


</table>
</body>
</html>