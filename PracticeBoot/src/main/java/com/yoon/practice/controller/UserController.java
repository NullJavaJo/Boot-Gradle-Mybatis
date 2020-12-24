package com.yoon.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoon.practice.domain.User;
import com.yoon.practice.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("login")
	public String login(Model model) throws Exception {
		User user = userService.getUser("admin");
		model.addAttribute("user",user);
		System.out.println(user);
		return "login";
	}
}
