package com.kavuri.spring_ai_demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void pay(){
        System.out.println("Paying....");
    }

    @PostConstruct
    public void postInit(){
        System.out.println("Payment Service is initialized");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Before destroying payment service");
    }
}
