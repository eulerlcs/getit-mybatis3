package com.github.eulerlcs.study.mybatis3.get02.dao;

import com.github.eulerlcs.study.mybatis3.get02.dto.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("/applicationContext.xml")
@SpringJUnitConfig(locations = "/applicationContext.xml")
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