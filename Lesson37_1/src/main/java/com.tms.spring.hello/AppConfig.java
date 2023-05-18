package com.tms.spring.hello;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "springHelloWorldTwo")
    public SpringHelloWorldTwo getSpringHelloWorldTwo() {
        return new SpringHelloWorldTwo();
    }

    @Bean(name = "message")
    public String getMessage() {
        String message = "Hello tms team!";
        return message;
    }
}
