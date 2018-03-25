package com.datagrand.webdemo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
@RequestMapping("")
public class SpingbootdemoApplication {

	
	
		@RequestMapping(value="/user", method=RequestMethod.GET)
		@ResponseBody
		public String User(HttpServletRequest request) {
			
			return "Hello world Im Spring Boot." + request.getParameter("userid");
		}
		
		// must set requset content type as : "content-Type":"application/json"
		@RequestMapping(value="/user1", method=RequestMethod.POST)
		@ResponseBody
		public String User1(@RequestBody Map<String, Object> params) {
			System.out.println(params);
			return "Hello world Im Spring Boot."+params.toString();
		}
		
		@RequestMapping(value="/user2/{age}", method=RequestMethod.POST)
		@ResponseBody
		public String User2(@PathVariable String age) {
			return "user age:"+age;
		}

		@RequestMapping(value="/user3", method=RequestMethod.POST)
		@ResponseBody
		public Message User3() {
			Message msg = new Message();

			System.out.println("=====");
			System.out.println(msg);
			return msg;
		}
		
}
