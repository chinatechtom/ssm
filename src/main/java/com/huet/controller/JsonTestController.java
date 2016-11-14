package com.huet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huet.entity.User;

@Controller
@RequestMapping("/jsonTest")
public class JsonTestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public Object test(){
		User user = new User();
		user.setUserName("test");
		user.setAddress("0");
		System.out.println("test");
		return user;
	}
}
