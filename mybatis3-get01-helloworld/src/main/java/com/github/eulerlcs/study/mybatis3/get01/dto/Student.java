package com.github.eulerlcs.study.mybatis3.get01.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("student")
public class Student {
    private int id;
    private String name;
    private int tid;
}
