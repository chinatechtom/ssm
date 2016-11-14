 <%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
 <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">会员中心</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">会员管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">会员查询</a></li>
                <li><a href="#">会员资料修改</a></li>
                <li><a href="#">团队管理</a></li> 
              </ul>
              </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">积分管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">积分查询</a></li>
                <li><a href="#">积分兑换</a></li>
                <li><a href="#">买入积分</a></li>
                <li><a href="#">卖出积分</a></li> 
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">分红管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">分红查询</a></li>
                <li><a href="#">添加分红奖励</a></li>
                <li><a href="#">修改分红奖励</a></li>
                <li><a href="#">删除分红奖励</a></li> 
              </ul>
            </li>
           
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">系统管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">增加管理员</a></li>
                <li><a href="#">管理员查询</a></li>
                <li><a href="#">修改管理员</a></li>
                <li><a href="#">删除管理员</a></li> 
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="../logout.do">退出</a></li> 
            <li><a href="../changePass.do">修改密码</a></li>
          </ul>
        </div> 
    </nav> 