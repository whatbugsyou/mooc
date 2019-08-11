package com.mooc.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface SubscribeMapper {

	@Select("select cid from subscribe where uid=#{uid}")
	public int[] selectSubscribeCourseByUid(int uid);
	
	@Delete("delete from subscribe where cid=#{cid} and uid=#{uid}")
	public int deleteSubscribe(@Param("cid") int cid,@Param("uid") int uid);
}
