<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name; %>
<%
   name=request.getParameter("txtname");
   //out.println("Hello " +name );
   %>
     
      <h3>
      		Hello  <%= name %>
      		</h3>
 

</body>
</html>