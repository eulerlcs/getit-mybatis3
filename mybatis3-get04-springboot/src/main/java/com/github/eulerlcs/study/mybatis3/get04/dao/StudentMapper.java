package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> selectAll();

    @Select("select * from student where id = #{id}")
    Student selectByPK(int id);
}
