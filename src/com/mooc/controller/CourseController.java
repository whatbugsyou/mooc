package com.mooc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.mooc.entity.Course;
import com.mooc.entity.Coursetype;
import com.mooc.entity.Video;
import com.mooc.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
//通过关键名查询课程，展现课程
	@RequestMapping("/searchcourse.do")
	@ResponseBody 
	public  List<Course> searchcourse( String searchtext){
		 List<Course> list =courseService.selectLikeCname(searchtext);
		return list;
		
	}
	//展示课程卡，默认按上传时间排序
	@RequestMapping("/show.do")
	@ResponseBody 
	public  List<Course> show(){
		 List<Course> list =courseService.selectAll();
		return list;	
	}
	
	//按点击量排序展现课程卡
	@RequestMapping("/hot.do")
	@ResponseBody 
	public  List<Course> hot(){
		System.out.println("有进这个功能吗？");
		 List<Course> list =courseService.selectByCplayvolume();
		 for (Course course : list) {
			System.out.println(course.getCname()+"----有返回值");
		}
		return list;	
	}
	//展示课程类型
	@RequestMapping("/showType.do")
	@ResponseBody
	public  List<Coursetype> showType(){
		 List<Coursetype> list =courseService.selectAllType();
		return list;	
	}
	//通过课程类型展示课程
	@RequestMapping("/selectCourseByType.do")
	@ResponseBody
	public  List<Course> selectCourseByType(int ctid){
		 List<Course> list =courseService.selectCourseByCtid(ctid);
		return list;	
	}

}
