package com.github.eulerlcs.study.mybatis3.get03.dao;

import com.github.eulerlcs.study.mybatis3.get03.dto.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();

    Teacher selectByPK(@Param("id") int id);
}
