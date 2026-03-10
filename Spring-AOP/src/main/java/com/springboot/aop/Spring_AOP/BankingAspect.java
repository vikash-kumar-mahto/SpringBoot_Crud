//package com.springboot.aop.Spring_AOP;
//
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class BankingAspect {
//    @Before("execution(String com.springboot.aop.Spring_AOP.BankingService.transferMoney(..))")
//    public void validateUserBeforeExecution() {
//        System.out.println("validate user before transferring");
//    }
//
//    @After("execution(String com.springboot.aop.Spring_AOP.BankingService.transferMoney(..))")
//    public void validateUserAfterExecution() {
//        System.out.println("validate user after transferring");
//    }
//
//    @AfterReturning(pointcut = "execution(String com.springboot.aop.Spring_AOP.BankingService.transferMoney(..))",
//            returning = "result")
//    public void afterReturnMethod(Object result) {
//        System.out.println("Transaction status :" + result);
//    }
//
//    @AfterThrowing(pointcut = "execution(String com.springboot.aop.Spring_AOP.BankingService.transferMoney(..))",
//            throwing = "e")
//    public void afterThrowMethod(Exception e) {
//        // err used to print the error in red color
//        System.err.println("Exeption occured:" + e.getMessage());
//    }
//
//
//}
