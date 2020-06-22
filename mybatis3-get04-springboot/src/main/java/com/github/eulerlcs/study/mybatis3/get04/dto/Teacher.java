package com.github.eulerlcs.study.mybatis3.get04.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

@Data
@Alias("Teacher")
public class Teacher implements Serializable {
    private int id;
    private String name;
    private String email;
    private List<Student> studentList;
}
