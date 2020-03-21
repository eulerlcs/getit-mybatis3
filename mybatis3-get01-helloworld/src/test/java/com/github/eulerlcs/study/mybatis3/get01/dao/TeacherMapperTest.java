package com.github.eulerlcs.study.mybatis3.get01.dao;

import com.github.eulerlcs.study.mybatis3.common.MybatisUtil;
import com.github.eulerlcs.study.mybatis3.get01.dto.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

class TeacherMapperTest {

    @Test
    void selectAll() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teacherList = teacherMapper.selectAll();
            teacherList.forEach(System.out::println);
        }
    }

    @Test
    void selectByPK() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = teacherMapper.selectByPK(1);
            System.out.println(teacher);
        }
    }
}