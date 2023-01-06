package com.mycom.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UrlMappingController {
	   @RequestMapping("/hello") // value 생략
	   public String m1() {
	      System.out.println("/hello");
//	      return "hello"; // Circular view path [hello]
	      return "hello.html";
	   }

	   @RequestMapping(value="/login", method=RequestMethod.GET)
	   public String m3() {
	      System.out.println("/get");
	      return "login.html";
	   }
}
