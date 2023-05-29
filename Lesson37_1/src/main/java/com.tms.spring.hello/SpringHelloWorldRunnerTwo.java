package com.tms.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloWorldRunnerTwo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpringHelloWorldTwo springHelloWorldTwo = context.getBean("springHelloWorldTwo", SpringHelloWorldTwo.class);
        springHelloWorldTwo.getHelloMessage();
    }
}
