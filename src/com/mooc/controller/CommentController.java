package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mooc.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private static CommentService commentService;
}
