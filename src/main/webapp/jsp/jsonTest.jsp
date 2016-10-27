<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>JsonTest</title>
<script>
/* $.each(data, function(i, item) {
    $("#info").append(
            "<div>" + item.userId + "</div>" + 
            "<div>" + item.userName    + "</div>" +
            "<div>" + item.userSalary + "</div><hr/>");
}); */
function loadInfo() {
	    $("#info").html("");//清空info内容
        $.getJSON("../jsonTest/test", function(data) {
	       alert(data.userId);
        });
        $("#info").html("test");//清空info内容
        //alert("tet");
}
</script>
</head>
<body>
<div id="info">this is info </div>
<button onclick="loadInfo()">获取信息</button>
</body>
<script src="../js/jquery-3.0.0.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</html>