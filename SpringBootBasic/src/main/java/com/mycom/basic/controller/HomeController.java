package com.mycom.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String home() {
//		return "home";
//	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home.html");
		return "home.html";
	}
	
//	@RequestMapping("/login")
//	public String login() {
//		System.out.println("login.html");
//		return "login.html";
//	}
}
