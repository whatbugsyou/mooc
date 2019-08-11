package com.mooc.service;

import java.util.List;

import com.mooc.entity.Course;

public interface SubscribeService {

	List<Course> getSubscribeCourseList(int uid);

	int cancelSubscribe(int cid, int uid);

}
