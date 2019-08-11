package com.mooc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mooc.entity.Course;
import com.mooc.entity.User;
import com.mooc.service.SubscribeService;

@Controller
public class SubscribeController {
	@Autowired
	private SubscribeService subscribeService;
	
	/**
	 * 查看我的订阅
	 * @return 返回当前用户的订阅视频集合 
	 * @author 国国
	 */
	@PostMapping("/getMySubscribe.do")
	public @ResponseBody List<Course> getMySubscribe() {
//		从session中取出来user信息
//		User user = request.getSession().getAttribute("user");	
		List<Course> courseList = subscribeService.getSubscribeCourseList(1);
		System.out.println(courseList);
		return courseList;
	}
	
	
	/**
	 * 取消某个订阅的视频
	 * @param 传入一个课程id
	 * @return 取消成功返回1
	 * @author 国国
	 */
	@PostMapping("/cancelSubscribeCourse.do")
	public @ResponseBody int cancelSubscribeCourse(int cid) {
//		从session中取出来user信息
//		User user = request.getSession().getAttribute("user");	
		if (subscribeService.cancelSubscribe(cid,1)==1) {
			return 1;
		} else {
			return 0;
		}
	}
}
