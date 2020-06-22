package com.github.eulerlcs.study.mybatis3.get01;

import com.github.eulerlcs.study.mybatis3.common.MybatisUtil;
import com.github.eulerlcs.study.mybatis3.get01.dao.StudentMapper;
import com.github.eulerlcs.study.mybatis3.get01.dao.TeacherMapper;
import com.github.eulerlcs.study.mybatis3.get01.dto.Student;
import com.github.eulerlcs.study.mybatis3.get01.dto.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

@Slf4j
public class App {
    public static void main(String[] args) {
        stu.selectAll();
        log.warn("-----------------------");
        stu.selectByPK();
        log.warn("#######################");
        log.warn("#######################");
        tch.selectAll();
        log.warn("-----------------------");
        tch.selectByPK();
    }

    private static class tch {
        public static void selectAll() {
            try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
                TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
                List<Teacher> teacherList = teacherMapper.selectAll();
                teacherList.forEach(System.out::println);
            }
        }

        public static void selectByPK() {
            try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
                TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
                Teacher teacher = teacherMapper.selectByPK(1);
                System.out.println(teacher);
            }
        }
    }

    private static class stu {
        public static void selectAll() {
            try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
                StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
                List<Student> studentList = studentMapper.selectAll();
                studentList.forEach(System.out::println);
            }
        }

        public static void selectByPK() {
            try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
                StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
                Student student = studentMapper.selectByPK(1);
                System.out.println(student);
            }
        }
    }
}