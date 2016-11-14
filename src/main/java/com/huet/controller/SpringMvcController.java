package com.huet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class SpringMvcController {
	
	@RequestMapping("/hello")
    public String hello(){        
        return "jsonTest";
    }
}
