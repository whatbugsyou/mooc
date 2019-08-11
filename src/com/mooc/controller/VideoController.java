package com.mooc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mooc.entity.Course;
import com.mooc.entity.Video;
import com.mooc.service.CourseService;
import com.mooc.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	private VideoService videoService;

	//点击视频后执行这个方法
	@RequestMapping("/showvideo.do")
	@ResponseBody 
	public List<Video> selectVidioByCid(int cid){
		List<Video> list = 	videoService.selectVidioByCid(cid);		
		videoService.insertPlayColum(cid);
		return list;	
	}
	
	@RequestMapping("/showVideoByvid.do")
	@ResponseBody
	public Video showVideoByvid(int vid){
		Video video = 	videoService.showVideoByvid(vid);		
		return video;	
	}
}
