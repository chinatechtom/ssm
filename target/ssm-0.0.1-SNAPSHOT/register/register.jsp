<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <!-- <link href="signin.css" rel="stylesheet"> -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container"> 
      <form class="form-horizontal" action="register.do" method="post" role="form" id="regiForm">
        <h2 class="form-signin-heading">请填写注册信息</h2>
        <div class="form-group">
        	<label class="col-sm-2 control-label">用户名</label>
       		 <div class="col-sm-10">
        	<input type="text" id="inputUserName" name="userName" class="form-control" placeholder="用户名" required autofocus>
        	 </div>
        </div>
        
        <div class="form-group">
       	 	<label class="col-sm-2 control-label" >推荐人</label>
       	 	 <div class="col-sm-10">
      	    <input type="text" id="inputUserName" name="reference" class="form-control" placeholder="推荐人" required autofocus>
        	</div>
        </div>
        
        <div class="form-group">
	        <label  class="col-sm-2 control-label">真实姓名</label>
	       	<div class="col-sm-10">
	        <input type="text" id="inputUserName" name="realName" class="form-control" placeholder="真实姓名" required autofocus>
	        </div>
        </div>
        
        
       <div class="form-group">
	        <label  class="col-sm-2 control-label">手机号</label>
         	 <div class="col-sm-10">
         	 <input type="text" id="inputUserName" name="mobile" class="form-control" placeholder="手机号" required autofocus>
         	 </div>
        </div>
        
        <div class="form-group">        
	         <label  class="col-sm-2 control-label">收货地址</label>
	         <div class="col-sm-10">
	        <input type="text" id="inputUserName" name="address" class="form-control" placeholder="收货地址" required autofocus>
	        </div>
        </div>
        
         <div class="form-group">
	        <label class="col-sm-2 control-label" >登录密码</label>
	         <div class="col-sm-10">
	        <input type="password" id="inputPassword" name="loginPassword" class="form-control" placeholder="登录密码" required>
          </div>
        </div>
        
        <div class="form-group">
	        <label class="col-sm-2 control-label" >登录密码确认</label>
	        <div class="col-sm-10">
	        <input type="password" id="inputPasswordCheck" name="checkLoginPassword" class="form-control" placeholder="登录密码确认" required>
	        </div>
        </div>
        
        <div class="form-group">        
	        <label class="col-sm-2 control-label" >二级密码</label>
	        <div class="col-sm-10">
	        <input type="password" id="inputSubPassword" name="tradePassword" class="form-control" placeholder="二级密码" required>
	        </div>
        </div>
        
         <div class="form-group">
	        <label class="col-sm-2 control-label" >二级密码确认</label>
	         <div class="col-sm-10">
	        <input type="password" id="inputSubPasswordCheck" name="checkTradePassword" class="form-control" placeholder="二级密码确认" required>
			</div>
        </div>        
        <button class="btn btn-sm btn-primary btn-block" type="submit">注册</button>
      </form>

    </div> <!-- /container -->
<script type="text/javascript">
$(function () {
    $('form').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户名验证失败',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 18,
                        message: '用户名长度必须在6到18位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只能包含大写、小写、数字和下划线'
                    }
                }
            },
            mobile: {
                validators: {
                    notEmpty: {
                        message: '手机不能为空'
                    },
                    stringLength: {
                        min: 11,
                        max: 11,
                        message: '手机号错误'
                    }
                }
            },
            loginPassword: {
                validators: {
                    notEmpty: {
                        message: '登录密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 20,
                        message: '密码最少6位'
                    }
                }
            },
            tradePassword: {
                validators: {
                    notEmpty: {
                        message: '交易密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 20,
                        message: '密码最少6位'
                    }
                }
            },
        }
    });
});
 </script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
