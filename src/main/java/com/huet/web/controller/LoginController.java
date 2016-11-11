package com.huet.web.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huet.entity.MenuItem;
import com.huet.entity.User;
import com.huet.service.inter.IMenuService;
import com.huet.service.inter.IUserService;

@Controller
@RequestMapping("login")
public class LoginController {
 
	
	@Autowired
	private IUserService userService ;
	
	@Autowired
	private IMenuService menuService ;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("userName"); 
		String password = request.getParameter("password");

		
		User user = userService.getUserByUserCode(userName) ;
		
		if(null == user  ){
			request.setAttribute("error_code", "-1");
			request.setAttribute("error_msg",  "员工不存在！");
			return "error";
		}
		
		if(! "1".equals( user.getUserStatus()) ){
			request.setAttribute("error_code", "-2");
			request.setAttribute("error_msg",  "员工状态错误！"+user.getUserStatus());
			return "error";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("login", true);
		session.setAttribute("logintime", new Date().toString());
		 
		ArrayList<MenuItem> menuItemList = (ArrayList<MenuItem>) menuService.getUserMenus(userName );
		String jsonMenu = menuService.makeJsonMenu(menuItemList) ;
		//menu 转换成 json 格式。
		request.setAttribute("menus", jsonMenu);
		
		return "index";
	}
}
