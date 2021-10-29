<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   Hello from html<br/>
<%= " Hello from jsp " %>

<% 
int i=5;
%>
<input type="text" value=<%=i%>><br/>
<% for(i=0;i<5;i++){
		out.print("i="+i+"<br/>");}
%>

<form action="">
Enter name:<input type="text" name="fname">
<input type="submit" name="click" value="click me">
</form>
<%
if(request.getParameter("click")!=null){
	out.print(request.getParameter("fname"));}


%>
<%@include file="footer.html" %>
<%=new Date() %>

</body>
</html>