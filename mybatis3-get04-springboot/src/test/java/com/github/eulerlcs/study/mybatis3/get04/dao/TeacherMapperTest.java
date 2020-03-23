package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherMapperTest {
    @Autowired
    private TeacherDao teacherDao;

    @Test
    void selectAll() {
        List<Teacher> teacherList = teacherDao.selectAll();
        teacherList.forEach(System.out::println);
    }

    @Test
    void selectByPK() {
        Teacher teacher = teacherDao.selectByPK(1);
        System.out.println(teacher);
    }
}