package com.kavuri.spring_ai_demo;

import com.kavuri.spring_ai_demo.service.NotificationService;
import com.kavuri.spring_ai_demo.service.PaymentService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class SpringAiDemoApplication implements CommandLineRunner {

    @Autowired(required = false)
    PaymentService paymentService;

    @Autowired
    Map<String, NotificationService> notificationServiceMap =  new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(SpringAiDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
        for(Map.Entry<String, NotificationService> entrySet:notificationServiceMap.entrySet()){
            entrySet.getValue().send("DI is working with "+entrySet.getKey());
        }
    }

    /*
    @Bean
    public CommandLineRunner runner(ChatClient.Builder builder) {
        return args -> {
            ChatClient chatClient = builder.build();
            String response = chatClient.prompt("Who are you?").call().content();
            System.out.println(response);
        };
    }*/
}
