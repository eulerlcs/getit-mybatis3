package com.github.eulerlcs.study.mybatis3.get04.dao;

import com.github.eulerlcs.study.mybatis3.get04.dto.Teacher;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDao implements TeacherMapper {
    private SqlSessionTemplate sqlSession;

    @Autowired
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Teacher> selectAll() {
        return sqlSession.getMapper(TeacherMapper.class).selectAll();
    }

    @Override
    public Teacher selectByPK(int id) {
        return sqlSession.getMapper(TeacherMapper.class).selectByPK(id);
    }
}
