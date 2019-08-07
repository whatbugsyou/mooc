package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mooc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private static UserService userService;
}
