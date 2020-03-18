package com.github.eulerlcs.study.mybatis3.get01.dao;

import com.github.eulerlcs.study.mybatis3.get01.dto.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAll();

    Student selectByPK(int id);
}
