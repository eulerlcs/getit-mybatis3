package com.github.eulerlcs.study.mybatis3.get02.dao;

import com.github.eulerlcs.study.mybatis3.get02.dto.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();

    Teacher selectByPK(int id);
}
