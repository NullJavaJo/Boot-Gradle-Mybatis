package com.yoon.practice.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoon.practice.domain.User;
import com.yoon.practice.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(Model model) throws Exception {
		User user = userService.getUser("admin");
		model.addAttribute("user",user);
		System.out.println(user);
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginTest(@Param("userId") String userId, @Param("password") String password) throws Exception{
		System.out.println("user ID = "+userId+"/n password = "+password);
		
		return "login";
	}
	
	@RequestMapping("calendar")	//FullCalendar Test
	public String test() throws Exception{
		System.out.println("calendar test");
		return "fullCalendar";	
	}
}
 