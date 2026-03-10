package com.springboot.aop.Spring_AOP.Repo;

import com.springboot.aop.Spring_AOP.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class EmpoyeeRunner implements CommandLineRunner {
    @Autowired
    EmpRepo empRepo;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setEId(1);
        employee.setEName("Vikash");
        employee.setDesignation("Manager");
        employee.setSalary(100000);

        Employee employee1 = new Employee();
        employee1.setEId(2);
        employee1.setEName("Abhinav");
        employee1.setDesignation("Team Lead");
        employee1.setSalary(80000);

        Employee employee2 = new Employee();
        employee2.setEId(3);
        employee2.setEName("Ankit");
        employee2.setDesignation("SWE");
        employee2.setSalary(70000);

        empRepo.saveAll(Arrays.asList(employee, employee1, employee2));
        Sort sort = Sort.by("eName");
        List<Employee> sortByName = empRepo.findAll(sort);
        sortByName.forEach(System.out::println);




    }
}
