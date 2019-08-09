package com.mooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mooc.entity.Course;

@Repository
public interface CourseMapper {


	List<Course> selectLikeCname(String name);

	List<Course> selectAll();

}
