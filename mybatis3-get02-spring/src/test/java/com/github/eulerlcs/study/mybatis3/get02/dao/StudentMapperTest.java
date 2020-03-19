package com.github.eulerlcs.study.mybatis3.get02.dao;

import com.github.eulerlcs.study.mybatis3.get02.dto.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/applicationContext.xml")
class StudentMapperTest {

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