package com.mooc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.CourseMapper;
import com.mooc.dao.SubscribeMapper;
import com.mooc.entity.Course;
import com.mooc.service.SubscribeService;
@Service
public class SubscribeServiceImpl implements SubscribeService {
	@Autowired
	private SubscribeMapper subscribeMapper;
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> getSubscribeCourseList(int uid) {
		List<Course> courseList = new ArrayList<Course>();
		int[] courseByList = subscribeMapper.selectSubscribeCourseByUid(uid);
		for (int i : courseByList) {
			Course course = courseMapper.selectCourseByCid(i);
			courseList.add(course);
		}
		return courseList;
	}

	@Override
	public int cancelSubscribe(int cid, int uid) {
		return subscribeMapper.deleteSubscribe(cid, uid);
	}
}
