<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="小说阅读网站">
    <meta name="author" content="huet">
    <link rel="icon" href="../favicon.ico">
	<title>test</title>
	 <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../js/ie-emulation-modes-warning.js"></script>
</head>
 <!-- 一个顶层logo，下面一个跑马灯的区域，一级菜单 -->
 <div class="container"  > 
  <div class="row">LOGO</div>
  <div class="row">RUNNING HORSE</div>
  <div class="container"></div>
 </div>
 <!-- 左侧显示一级菜单下的菜单树 -->
<body>
<% System.out.println(request.getAttribute("menus")); %>
</body>
</html>