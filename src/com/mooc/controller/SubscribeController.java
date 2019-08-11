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
	 * �鿴�ҵĶ���
	 * @return ���ص�ǰ�û��Ķ�����Ƶ���� 
	 * @author ����
	 */
	@PostMapping("/getMySubscribe.do")
	public @ResponseBody List<Course> getMySubscribe() {
//		��session��ȡ����user��Ϣ
//		User user = request.getSession().getAttribute("user");	
		List<Course> courseList = subscribeService.getSubscribeCourseList(1);
		System.out.println(courseList);
		return courseList;
	}
	
	
	/**
	 * ȡ��ĳ�����ĵ���Ƶ
	 * @param ����һ���γ�id
	 * @return ȡ���ɹ�����1
	 * @author ����
	 */
	@PostMapping("/cancelSubscribeCourse.do")
	public @ResponseBody int cancelSubscribeCourse(int cid) {
//		��session��ȡ����user��Ϣ
//		User user = request.getSession().getAttribute("user");	
		if (subscribeService.cancelSubscribe(cid,1)==1) {
			return 1;
		} else {
			return 0;
		}
	}
}
