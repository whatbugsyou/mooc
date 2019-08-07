package com.mooc.dao;

import com.mooc.entity.Coursetype;
import com.mooc.entity.CoursetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursetypeMapper {
    int countByExample(CoursetypeExample example);

    int deleteByExample(CoursetypeExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(Coursetype record);

    int insertSelective(Coursetype record);

    List<Coursetype> selectByExample(CoursetypeExample example);

    Coursetype selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByExample(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByPrimaryKeySelective(Coursetype record);

    int updateByPrimaryKey(Coursetype record);
}