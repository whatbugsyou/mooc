package com.mooc.service;

import java.util.List;

import com.mooc.entity.Course;
import com.mooc.entity.Coursetype;

public interface CourseService {

	List<Course> selectLikeCname(String searchtext);

	List<Course> selectAll();

	List<Coursetype> selectAllType();

	List<Course> selectCourseByCtid(int ctid);

	List<Course> selectByCplayvolume();

}
