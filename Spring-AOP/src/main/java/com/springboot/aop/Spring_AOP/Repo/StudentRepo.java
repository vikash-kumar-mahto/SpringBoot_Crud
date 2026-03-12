package com.springboot.aop.Spring_AOP.Repo;

import com.springboot.aop.Spring_AOP.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("FROM Student s")// HQL
//    @Query("SLEECT s FROM Student s") // JPQL
    List<Student> getAllStudent();


    @Query("SELECT s FROM Student s WHERE s.branch= :branch")
    List<Student> getAllStudentByBranch(String branch);

    @Query("SELECT s FROM Student s WHERE s.cgpa > 8 ")
    List<Student> getAllStudentByBranch();


    @Query("SELECT s FROM Student s ORDER BY s.sName ")
    List<Student> sortByName();

}
