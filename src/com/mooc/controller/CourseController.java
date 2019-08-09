package com.mooc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mooc.entity.Course;
import com.mooc.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping("/searchcourse.do")
	public  List<Course> searchcourse( String searchtext){
		System.out.println(searchtext);
		 List<Course> list =courseService.searchcourse(searchtext);
		 System.out.println(list);
		return list;
		
	}
	@RequestMapping("/show.do")
	public  List<Course> searchcourse(){
		 List<Course> list =courseService.show();
		 System.out.println(list);
		return list;
		
	}

}
