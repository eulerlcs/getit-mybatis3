package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootTest
@ComponentScan(basePackageClasses = {com.github.eulerlcs.study.mybatis3.get04.Mybatis3Get04SpringbootApplication.class})
class TeacherMapperTest {
    @Autowired
    private TeacherMapper teacherDao;

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