package com.mooc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mooc.entity.User;
import com.mooc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login.do")
	public @ResponseBody String login( User user,HttpServletRequest req) {
		if(userService.login(user)) {
			req.getSession().setAttribute("user", user);
			return "ok";
		}else {
			return "false";
		}

	}
	@PostMapping("/register.do")
	public @ResponseBody String register( User user) {
		if(userService.register(user)) {
			return "ok";
		}else {
			return "false";
		}
	}
	@RequestMapping("/isLogin.do")
	public @ResponseBody  User isLogin(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("user");
		return user;
	}
}
