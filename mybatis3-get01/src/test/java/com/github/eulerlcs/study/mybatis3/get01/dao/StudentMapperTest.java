package com.github.eulerlcs.study.mybatis3.get01.dao;

import com.github.eulerlcs.study.mybatis3.common.MybatisUtil;
import com.github.eulerlcs.study.mybatis3.get01.dto.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

class StudentMapperTest {

    @Test
    void selectAll() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList = studentMapper.selectAll();
            studentList.forEach(System.out::println);
        }
    }

    @Test
    void selectByPK() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = studentMapper.selectByPK(1);
            System.out.println(student);
        }
    }

}