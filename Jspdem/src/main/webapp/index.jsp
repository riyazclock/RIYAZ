<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
  
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>

 
    <input type="text" placeholder="name" name="fname"/>


    <input type="text" placeholder="hobby" name="hobby" />


    <input type="text" placeholder="ambition" name="ambition"/>


    
    <input type="submit" name="submit" value="submit"/>
  
</form>
<%   if(request.getParameter("submit")!=null){%>
       <jsp:useBean id="user" class="com.to.User" scope="request"></jsp:useBean>
       <jsp:setProperty property="*" name="user"/>
       <jsp:forward page="RegisterServ" ></jsp:forward>
<%}%>
</body>
</html>