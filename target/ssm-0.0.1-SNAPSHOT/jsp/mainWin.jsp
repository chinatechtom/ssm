<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="zh">
<head> 
	<link href="../css/bootstrap.min.css" rel="stylesheet"> 
	 <link href="../css/navbar-fixed-top.css" rel="stylesheet">
	<title>sky</title>
</head>
<body> 
   <%@include file="nav.jsp"%>  

<div class="container">
	<table class="table table-condensed">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
  </div>
</body>
	<script type="text/javascript" src="../js/jquery-3.0.0.min.js"></script>
	<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</html>

 