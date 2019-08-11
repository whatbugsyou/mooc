package com.mooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mooc.entity.Course;
import com.mooc.entity.Coursetype;
import com.mooc.entity.Video;

@Repository
public interface CourseMapper {


	List<Course> selectLikeCname(String name);

	List<Course> selectAll();

	List<Coursetype> selectAllType();

	List<Course> selectCourseByCtid(int ctid);

	List<Course> selectByCplayvolume();



}
