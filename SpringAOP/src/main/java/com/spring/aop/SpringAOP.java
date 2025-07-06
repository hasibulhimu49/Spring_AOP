package com.spring.aop;

import com.spring.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAOP {

    public static void main(String[] args) {
        //System.out.println("Hello World
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObject=context.getBean("payment",PaymentService.class);
        
        //auth, print:PaymentStarted
        paymentObject.makePayment();
    }
}
