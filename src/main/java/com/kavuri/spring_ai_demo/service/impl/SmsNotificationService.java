package com.kavuri.spring_ai_demo.service.impl;

import com.kavuri.spring_ai_demo.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Message sending: "+message);
    }
}
