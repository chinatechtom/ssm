package com.huet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huet.entity.User;

@Controller
@RequestMapping("/func")
public class FuncController {
	
	@ResponseBody
	@RequestMapping(value="defi/{func_id}",method=RequestMethod.GET)
	public Object funcDefinition(@PathVariable String func_id){
		System.out.println(func_id);
		User user = new User();
		
		user.setUserName("test");
		user.setUserStatus("0"); 
		return user;
	}
	
	@RequestMapping("call/{func_id}")
	@ResponseBody
	public Object callFunc(){
		User user = new User(); 
		user.setUserName("test");
		user.setUserStatus("0");
		System.out.println("test");
		return user;
	}
}
