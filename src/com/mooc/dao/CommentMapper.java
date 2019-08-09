package com.mooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mooc.entity.Comment;

@Repository
public interface CommentMapper {
	@Select("select * from comment")
	public List<Comment> selectAllcomment();
}
