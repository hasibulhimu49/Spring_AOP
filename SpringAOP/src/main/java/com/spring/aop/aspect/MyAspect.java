//package com.spring.aop.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.After;
//@Aspect
//public class MyAspect {
//
//    @Before("execution(* com.spring.aop.service.PaymentService.makePayment())")
//    public void beforePayment() {
//        System.out.println("📌 [AOP] Payment Started...");
//    }
//
//    @After("execution(* com.spring.aop.service.PaymentService.makePayment())")
//    public void afterPayment() {
//        System.out.println("📌 [AOP] Payment Ended...");
//    }
//}
