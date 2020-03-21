package com.github.eulerlcs.study.mybatis3.get02.dao;

import com.github.eulerlcs.study.mybatis3.get02.dto.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao implements StudentMapper {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<Student> selectAll() {
        return sqlSession.getMapper(StudentMapper.class).selectAll();
    }

    @Override
    public Student selectByPK(int id) {
        return sqlSession.getMapper(StudentMapper.class).selectByPK(id);
    }
}
