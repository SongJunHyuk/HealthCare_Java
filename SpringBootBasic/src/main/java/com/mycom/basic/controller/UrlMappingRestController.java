package com.mycom.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // => @Controller + @ResponseBody
public class UrlMappingRestController {
	   @RequestMapping("/hi") // value 생략
	   public String m1() {
	      System.out.println("/hi");
	      return "/hi"; // No Circular view path [hello]
	   }
	   
	   @RequestMapping("/hi/url") // value 생략
	   public String m2() {
	      System.out.println("/hi/url");
	      return "/hi/url";
	   }
	   
	   @RequestMapping(value="/method", method=RequestMethod.GET)
	   public String m3() {
	      System.out.println("/get");
	      return "/get";
	   }
	   
	   @RequestMapping(value="/method", method=RequestMethod.POST)
	   public String m4() {
	      System.out.println("/post");
	      return "/post";
	   }
	   
	   @RequestMapping(value="/method/{num}", method=RequestMethod.PUT)
	   public String m5(@PathVariable int num) {
	      System.out.println("/put");
	      System.out.println("num : " + num);
	      return "/method/{num}";
	   }
	   
	   @RequestMapping(value="/method/{num}/and/{str}", method=RequestMethod.PUT)
	   public String m6(@PathVariable int num, @PathVariable String str) {
	      System.out.println("/put");
	      System.out.println("num : " + num);
	      System.out.println("str : " + str);
	      return "/method/{num}/and/{str}";
	   }
	   
	   @GetMapping(value="/getmapping")
	   public String m8() {
	      System.out.println("/getmapping");
	      return "/getmapping";
	   }
	   
	   @PostMapping(value="/postmapping")
	   public String m9() {
	      System.out.println("/postmapping");
	      return "/postmapping";
	   }
	   
	   
}
