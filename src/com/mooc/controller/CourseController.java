package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mooc.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private static CourseService courseService;
}
