package com.springboot.aop.Spring_AOP.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
   private  int sId;
   private String  sName;
   private  String branch;
   private  Double cgpa;

}
