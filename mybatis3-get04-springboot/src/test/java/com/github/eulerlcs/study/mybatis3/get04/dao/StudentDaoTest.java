package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//@MybatisTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
@ComponentScan(basePackageClasses = {com.github.eulerlcs.study.mybatis3.get04.Mybatis3Get04SpringbootApplication.class})
class StudentDaoTest {

    @Autowired
    private StudentMapper studentDao;

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

    @Test
    @Transactional
    @Commit
    void crud() {
        Student student = new Student();
        student.setId(10);
        student.setName("test insert");
        student.setTid(4);

        System.out.println(studentDao.insert(student));
        System.out.println(studentDao.selectByPK(10));

        System.out.println(studentDao.deleteByPK(10));
        System.out.println(studentDao.selectAll());
    }
}