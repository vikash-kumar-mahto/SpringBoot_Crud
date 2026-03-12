package com.springboot.aop.Spring_AOP.Repo;

import com.springboot.aop.Spring_AOP.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student();
        s1.setSId(1);
        s1.setSName("Vikash");
        s1.setBranch("CSE");
        s1.setCgpa(7.8);

        Student s2 = new Student();
        s2.setSId(2);
        s2.setSName("Abhinav");
        s2.setBranch("CSE");
        s2.setCgpa(8.2);

        Student s3 = new Student();
        s3.setSId(3);
        s3.setSName("Ankit");
        s3.setBranch("IT");
        s3.setCgpa(7.5);


        Student s4 = new Student();
        s4.setSId(4);
        s4.setSName("Abhay");
        s4.setBranch("ECE");
        s4.setCgpa(8.2);

        studentRepo.saveAll(Arrays.asList(s1, s2, s3, s4));


        System.out.println("=====================================");
        studentRepo.getAllStudent()
                .forEach(System.out::println);

        System.out.println("==============================================");
        studentRepo.getAllStudentByBranch("CSE")
                .forEach(System.out::println);

        System.out.println("============================================");
        studentRepo.getAllStudentByBranch()
                .forEach(System.out::println);

        System.out.println("====================================================");
        studentRepo.sortByName()
                .forEach(System.out::println);


    }
}
