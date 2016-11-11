<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>FORM TEST</title>
</head>
<body>
	<form class="form-horizontal" role="form" method="get"
		action="../register/printParam/6/6/6">
		<div class="form-group">
			<label for="userName" class="col-sm-2 control-label">用户名</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="userName" name="userName"
					placeholder="请输入用户名">
			</div>
		</div>
		<div class="form-group">
			<label for="email" class="col-sm-2 control-label">电子邮箱</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="email" name="email"
					placeholder="请输入电子邮箱">
			</div>
		</div>
		<div class="form-group">
			<label for="telephone" class="col-sm-2 control-label">手机号码</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="telephone" name="telephone"
					placeholder="请输入手机号码">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">注册</button>
			</div>
		</div>
	</form>
</body>
<script src="../js/jquery-3.0.0.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</html>