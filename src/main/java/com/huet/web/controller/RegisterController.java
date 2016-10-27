package com.huet.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huet.entity.RegiUser;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.POST)
	public String post(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");

		System.out.println(userName);
		System.out.println("post");
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String get(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");

		System.out.println(userName);
		System.out.println("get");
		return "index";
	}

	@RequestMapping(value="/printParam", method = RequestMethod.POST)
	public String printParam(@RequestParam("userName") String userName, @RequestParam("email") String email,
			@RequestParam("telephone") String telephone) {
		System.out.println(userName);
		return "index";
	}
	@RequestMapping(value="/printParam/{userName}/{email}/{telephone}", method = RequestMethod.GET)
	public String printParam2(@PathVariable  String userName, @PathVariable  String email,
			@RequestParam("telephone") String telephone) {
		System.out.println(userName);
		return "index";
	}
	
	
	@RequestMapping(value="/printParamPojo", method = RequestMethod.POST)
	public String getParamByPOJO( @ModelAttribute("regiUser") RegiUser regiUser) {
		System.out.println(regiUser.getUserName());
		return "index";
	}
	
	
}
