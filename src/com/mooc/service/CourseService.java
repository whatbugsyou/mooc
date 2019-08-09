package com.mooc.service;

import java.util.List;

import com.mooc.entity.Course;

public interface CourseService {

	List<Course> searchcourse(String searchtext);

	List<Course> show();

}
