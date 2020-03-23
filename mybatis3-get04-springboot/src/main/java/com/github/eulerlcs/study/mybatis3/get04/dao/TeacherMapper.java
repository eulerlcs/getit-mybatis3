package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List<Teacher> selectAll();

    Teacher selectByPK(@Param("id") int id);
}
