package com.mooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mooc.entity.Course;
import com.mooc.entity.Coursetype;
import com.mooc.entity.Video;

@Repository
public interface CourseMapper {


	List<Course> selectLikeCname(String name);

	List<Course> selectAll();
	
	
	@Select("select * from course where cid=#{cid}")
	public Course selectCourseByCid(int cid);

	List<Coursetype> selectAllType();

	List<Course> selectCourseByCtid(int ctid);

	List<Course> selectByCplayvolume();



}
