package com.github.eulerlcs.study.mybatis3.get03.dto;

import lombok.Data;

import java.util.List;

@Data
//@Alias("Teacher")
public class Teacher {
    private int id;
    private String name;
    private String email;
    private List<Student> studentList;
}
