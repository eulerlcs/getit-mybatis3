package com.github.eulerlcs.study.mybatis3.get01.dao;

import com.github.eulerlcs.study.mybatis3.get01.dto.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();

    Teacher selectByPK(int id);
}
