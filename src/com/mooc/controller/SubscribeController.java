package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mooc.service.SubscribeService;

@Controller
public class SubscribeController {
	@Autowired
	private SubscribeService subscribeService;
}
