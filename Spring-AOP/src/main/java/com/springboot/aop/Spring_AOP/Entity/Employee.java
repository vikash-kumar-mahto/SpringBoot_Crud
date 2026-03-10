package com.springboot.aop.Spring_AOP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    private  int eId;
    private String eName;
    private  String designation;
    private double salary;

}
