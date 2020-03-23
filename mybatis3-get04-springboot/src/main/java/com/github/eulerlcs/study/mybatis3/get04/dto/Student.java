package com.github.eulerlcs.study.mybatis3.get04.dto;

import lombok.Data;

import java.io.Serializable;

@Data
// @Alias("Student")
public class Student implements Serializable {
    private int id;
    private String name;
    private int tid;
}
