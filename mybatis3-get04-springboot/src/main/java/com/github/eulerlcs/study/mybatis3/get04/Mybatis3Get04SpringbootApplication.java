package com.github.eulerlcs.study.mybatis3.get04;

import com.github.eulerlcs.study.mybatis3.get04.dao.StudentDao;
import com.github.eulerlcs.study.mybatis3.get04.dto.Student;
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
    //   @Transactional
    public void run(String... args) {
//        insert();
//        insert();
        System.out.println(studentDao.selectAll());
    }

    void insert() {
        Student student = new Student();
        student.setId(10);
        student.setName("test insert");
        student.setTid(4);

        int ret = studentDao.insert(student);
        System.out.println(ret);
    }
}
