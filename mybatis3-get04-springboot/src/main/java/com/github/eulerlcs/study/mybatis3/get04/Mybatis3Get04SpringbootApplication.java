package com.github.eulerlcs.study.mybatis3.get04;

import com.github.eulerlcs.study.mybatis3.get04.dao.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mybatis3Get04SpringbootApplication implements CommandLineRunner {

    private final StudentDao studentDao;

    public Mybatis3Get04SpringbootApplication(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Get04SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(studentDao.selectAll());
    }
}
