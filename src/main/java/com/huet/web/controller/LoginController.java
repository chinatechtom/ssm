package com.huet.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huet.entity.User;
import com.huet.service.inter.IMenuService;
import com.huet.service.inter.IUserService;
import com.mysql.jdbc.log.LogFactory;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/signin/login")
public class LoginController {

	private Logger logger =  Logger.getLogger(LoginController.class);
	
	@Autowired
	private IUserService userService ;
	
	@Autowired
	private IMenuService menuService ;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("userName"); 
		String password = request.getParameter("password");

		//判断用户名密码
		User user = userService.getUserById(userName) ;
		
		if(null == user || user.getUserStatus() !="0"){
			request.setAttribute("error_code", "-1");
			request.setAttribute("error_msg",  "操作员状态错误!");
			return "error";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("login", true);
		session.setAttribute("logintime", new Date().toString());
		//返回菜单信息 
		
		request.setAttribute("menus", "menul_level");
		
		return "index";
	}
}
