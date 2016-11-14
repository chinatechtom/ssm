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

    <title>注册</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrapValidator.min.css" rel="stylesheet">

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
       		 <div class="col-sm-6">
        	<input type="text" id="inputUserName" name="userName" class="form-control" placeholder="用户名"  autofocus>
        	 </div> 
        </div>
        
        <div class="form-group">
       	 	<label class="col-sm-2 control-label" >推荐人</label>
       	 	 <div class="col-sm-6">
      	    <input type="text" id="inputReference" name="reference" class="form-control" placeholder="推荐人"   autofocus>
        	</div>
        </div>
        
        <div class="form-group">
	        <label  class="col-sm-2 control-label">真实姓名</label>
	       	<div class="col-sm-6">
	        <input type="text" id="inputRealName" name="realName" class="form-control" placeholder="真实姓名"   autofocus>
	        </div>
        </div>
        
        
       <div class="form-group">
	        <label  class="col-sm-2 control-label">手机号</label>
         	 <div class="col-sm-6">
         	 <input type="text" id="inputMobile" name="mobile" class="form-control" placeholder="手机号"   autofocus>
         	 </div>
        </div>
        
        <div class="form-group">        
	         <label  class="col-sm-2 control-label">收货地址</label>
	         <div class="col-sm-6">
	        <input type="text" id="inputAddress" name="address" class="form-control" placeholder="收货地址"   autofocus>
	        </div>
        </div>

        <div class="form-group">        
	         <label  class="col-sm-2 control-label">电子邮箱</label>
	         <div class="col-sm-6">
	        <input type="text" id="inputEmail" name="email" class="form-control" placeholder="电子邮箱"   autofocus>
	        </div>
        </div>        
        
        <div class="form-group">        
	         <label  class="col-sm-2 control-label">微信号</label>
	         <div class="col-sm-6">
	        <input type="text" id="inputWeiChat" name="weiChat" class="form-control" placeholder="微信号"  autofocus>
	        </div>
        </div>
         <div class="form-group">
	        <label class="col-sm-2 control-label" >登录密码</label>
	         <div class="col-sm-6">
	        <input type="password" id="inputLoginPassword" name="loginPassword" class="form-control" placeholder="登录密码"  >
          </div>
        </div>
        
        <div class="form-group">
	        <label class="col-sm-2 control-label" >登录密码确认</label>
	        <div class="col-sm-6">
	        <input type="password" id="inputcheckLoginPassword" name="checkLoginPassword" class="form-control" placeholder="登录密码确认"  >
	        </div>
        </div>
        
        <div class="form-group">        
	        <label class="col-sm-2 control-label" >交易密码</label>
	        <div class="col-sm-6">
	        <input type="password" id="inputTradePassword" name="tradePassword" class="form-control" placeholder="二级密码"  >
	        </div>
        </div>
        
         <div class="form-group">
	        <label class="col-sm-2 control-label" >交易密码确认</label>
	         <div class="col-sm-6">
	        <input type="password" id="inputCheckTradePassword" name="checkTradePassword" class="form-control" placeholder="二级密码确认"  >
			</div>
        </div>        
        <button class="btn btn-sm btn-primary btn-block" type="submit">注册</button>
      </form>

    </div> <!-- /container -->
    
<script type="text/javascript" src="../js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/bootstrapValidator.min.js"></script>
<script src="../js/ie10-viewport-bug-workaround.js"></script>

<script type="text/javascript">
$(document).ready(function() {
//$(function () {
    $('#regiForm').bootstrapValidator({
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
            reference: {
                validators: {
                    notEmpty: {
                        message: '推荐人不能为空'
                    } 
                }
            },
            realName: {
                validators: {
                    notEmpty: {
                        message: '真实姓名不能为空'
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
            address: {
                validators: {
                    notEmpty: {
                        message: '收货地址不能为空'
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
                    },
                    identical: {//相同
                        field: 'loginPassword',
                        message: '两次登录密码不一致'
                    }
                }
            },
            checkLoginPassword: {
                validators: {
                    notEmpty: {
                        message: '登录密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 20,
                        message: '登录密码最少6位'
                    },
                    identical: {//相同
                        field: 'loginPassword',
                        message: '两次登录密码不一致'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: '邮件不能为空'
                    },
                    emailAddress: {
                        message: '请输入正确的邮件地址如：123@qq.com'
                    }
                }
            },
            tradePassword: {
                message:'交易密码无效',
                validators: {
                    notEmpty: {
                        message: '交易密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '密码必须在6到30之间'
                    },
                    identical: {//相同
                        field: 'tradePassword', //需要进行比较的input name值
                        message: '两次交易密码不一致'
                    } /* ,
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: 'The username can only consist of alphabetical, number, dot and underscore'
                    } */
                }
            },
            checkTradePassword: {
                message: '交易密码无效',
                validators: {
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '交易密码长度必须在6到30之间'
                    },
                    identical: {//相同
                        field: 'tradePassword',
                        message: '两次交易密码不一致'
                    } 
                }
            }
        }
    });
});
 </script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
  </body>
</html>
