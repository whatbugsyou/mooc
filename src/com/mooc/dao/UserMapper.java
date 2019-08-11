package com.mooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.mooc.entity.User;

@Repository
public interface UserMapper {
	@Options(useGeneratedKeys=true,keyProperty = "uid", keyColumn = "uid")
	@Insert("insert into user(account,password,portrait,signature) values(#{account},#{password},#{portrait},#{signature})")
	public int insertUser(User user);
	
	@Delete("delete from user where uid=#{uid}")
	public int deleteUserByUid(int uid);
	
	@Delete("<script> delete from user where uid in <foreach collection='array' open='(' close=')' separator=',' item='uid' > #{uid} </foreach> </script> ")
	public int deleteUserByIdList(int[] uidList);
	
<<<<<<< HEAD
	@Update("update user set account=#{account}, password=#{password}, signature=#{signature}, portrait=#{portrait} where uid = #{uid}")
=======
	@Update("update user set account=#{account} password=#{password} signature=#{signature} portrait=#{portrait} where uid=#{uid}")
>>>>>>> 3497af9915ef59150abfc8e8712463831cfd00d6
	public int updateUser(User user);
	
	
	
	@Select("select * from user")
	public List<User> selectAlluser();
	
	@Select("select * from user where uid=#{uid}")
	public User selectUserByUid(int uid);
	
	@Select("select * from user where account=#{account}")
	public User selectUserByAccount(String account);
	
	@Select("select count(*) from user")
	public int selectUserCount();
}
