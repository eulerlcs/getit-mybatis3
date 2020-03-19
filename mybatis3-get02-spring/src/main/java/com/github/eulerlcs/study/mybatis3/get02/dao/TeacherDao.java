package com.github.eulerlcs.study.mybatis3.get02.dao;

import com.github.eulerlcs.study.mybatis3.get02.dto.Teacher;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

public class TeacherDao extends SqlSessionDaoSupport implements TeacherMapper {
    @Override
    public List<Teacher> selectAll() {
        return getSqlSession().getMapper(TeacherMapper.class).selectAll();
    }

    @Override
    public Teacher selectByPK(int id) {
        return getSqlSession().getMapper(TeacherMapper.class).selectByPK(id);
    }
}
