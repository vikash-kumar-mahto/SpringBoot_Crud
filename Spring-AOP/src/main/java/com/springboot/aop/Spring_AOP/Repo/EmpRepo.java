package com.springboot.aop.Spring_AOP.Repo;

import com.springboot.aop.Spring_AOP.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository <Employee, Integer>{

}
