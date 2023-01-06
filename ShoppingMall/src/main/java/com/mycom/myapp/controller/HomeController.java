package com.mycom.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	   private String index() {
	      return "/index.html";
	   }

	   @GetMapping(value = "/login")
	   private String login() {
	      return "/login.html";
	   }

	   @GetMapping(value = "/register")
	   private String register() {
	      return "/register.html";
	   }

	   @GetMapping(value = "/product")
	   private String home() {
	      return "/product.html";
	   }

	   @GetMapping(value = "/logout")
	   public String logout(HttpSession session) {

	      session.invalidate();
	      return "/login.html";
	   }
	   
}