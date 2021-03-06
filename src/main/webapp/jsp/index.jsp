<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/bootstrap.min.css" rel="stylesheet"> 
<title>menu</title>
 
</head>
<body>
<!--  <div class="btn">
<input name="" type="button" id="btn_open" value="全部展开" />&nbsp;&nbsp;
<input name="" type="button" id="btn_close" value="全部收缩" />
</div>  -->

<div class="row"> 
	<div id="menuTree" class="col-sm-4"></div>
	<div id="menuWindow" class="col-sm-8"></div>
</div>
</body>
</html>

<script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">
var json =<%=request.getAttribute("menus")  %>  ;
/*递归实现获取无级树数据并生成DOM结构*/
var str = "";
var forTree = function(o){
	for(var i=0;i<o.length;i++){
		var urlstr = "";
		try{
			if(typeof o[i]["function_id"] == "undefined"){
				urlstr = "<div><span class=\"panel panel-primary\">"+ o[i]["menu_name"] +"</span><ul>";
			}else{
				//urlstr = "<div><span><a href=../func/defi/"+ o[i]["function_id"] +">"+ o[i]["menu_name"] +"</a></span><ul>";	
				urlstr = "<div><span><li>"+ o[i]["menu_name"] +"</li></span><ul>";
			}
			str += urlstr;
			if(o[i]["sub_menus"] != null){
				forTree(o[i]["sub_menus"]);
			}
			str += "</ul></div>";
		}catch(e){}
	}
	return str;
}
/*添加无级树*/
document.getElementById("menuTree").innerHTML = forTree(json);

/*树形菜单*/
///var menuTree = function(){
	//给有子对象的元素加[+-]
	$("#menuTree ul").each(function(index, element) {
		var ulContent = $(element).html();
		var spanContent = $(element).siblings("span").html();
        if(ulContent){
			$(element).siblings("span").html("[+] " + spanContent)	
		}
    });
	
	$("#menuTree").find("div span").click(function(){
		var ul = $(this).siblings("ul");
		var spanStr = $(this).html();
		var spanContent = spanStr.substr(3,spanStr.length);
		if(ul.find("div").html() != null){
			if(ul.css("display") == "none"){
				ul.show(300);
				$(this).html("[-] " + spanContent);
			}else{
				ul.hide(300);
				$(this).html("[+] " + spanContent);
			}
		}
	})
//}()
	$("#menuTree ul").hide(300);
	curzt("+");
/*展开*/
$("#btn_open").click(function(){
	$("#menuTree ul").show(300);
	curzt("-");
})
/*收缩*/
$("#btn_close").click(function(){
	$("#menuTree ul").hide(300);
	curzt("+");
})
function curzt(v){
	$("#menuTree span").each(function(index, element) {
		var ul = $(this).siblings("ul");
        var spanStr = $(this).html();
		var spanContent = spanStr.substr(3,spanStr.length);
		if(ul.find("div").html() != null){
			$(this).html("["+ v +"] " + spanContent);
		}
    });	
}
 
$(function(){
    $('li').click(function(){
         $.ajax({
             type: "GET",
             url: "../func/defi/"+$(this).html,
             dataType: "json",
             success: function(data){
                         $('#menuWindow').empty();   //清空resText里面的所有内容
                         var html = ''; 
                         
                         $('#menuWindow').html(html);
                      }
         });
    });
    return false;
}); 
</script>