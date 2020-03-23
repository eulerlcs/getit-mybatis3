package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ComponentScan(basePackageClasses = {com.github.eulerlcs.study.mybatis3.get04.Mybatis3Get04SpringbootApplication.class})
class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    void selectAll() {
        List<Student> studentList = studentDao.selectAll();
        studentList.forEach(System.out::println);
    }

    @Test
    void selectByPK() {
        Student student = studentDao.selectByPK(1);
        System.out.println(student);
    }
}