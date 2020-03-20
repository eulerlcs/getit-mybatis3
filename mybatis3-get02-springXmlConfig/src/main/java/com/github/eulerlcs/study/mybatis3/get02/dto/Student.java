package com.github.eulerlcs.study.mybatis3.get02.dto;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
