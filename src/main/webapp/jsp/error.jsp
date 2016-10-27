<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
 
<title>Insert title here</title>
</head>
<body>
<div class="container">
<%
out.println(request.getAttribute("error_msg"));
%>
</body>
 <script src="../js/jquery-3.0.0.min.js"></script>
 <script src="../js/bootstrap.min.js"></script>
</html>