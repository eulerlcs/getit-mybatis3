package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao implements StudentMapper {
    private SqlSessionTemplate sqlSession;

    @Autowired
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<Student> selectAll() {
        return sqlSession.getMapper(StudentMapper.class).selectAll();
    }

    @Override
    public Student selectByPK(int id) {
        return sqlSession.getMapper(StudentMapper.class).selectByPK(id);
    }

    @Override
    public int insert(Student student) {
        return sqlSession.getMapper(StudentMapper.class).insert(student);
    }

    @Override
    public int deleteByPK(int id) {
        return sqlSession.getMapper(StudentMapper.class).deleteByPK(id);
    }
}
