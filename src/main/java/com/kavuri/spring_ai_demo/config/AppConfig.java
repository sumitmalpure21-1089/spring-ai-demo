package com.kavuri.spring_ai_demo.config;

import com.kavuri.spring_ai_demo.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope
    PaymentService paymentService(){
        System.out.println("Inside payment service config");
        return new PaymentService();
    }
}
