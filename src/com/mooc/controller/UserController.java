package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mooc.entity.User;
import com.mooc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private static UserService userService;
	
	@PostMapping("/login.do")
	public @ResponseBody String login(@RequestBody User user) {
		System.out.println();
		if(userService.login(user)) {
			return "ok";
		}else {
			return "false";
		}

	}
}
