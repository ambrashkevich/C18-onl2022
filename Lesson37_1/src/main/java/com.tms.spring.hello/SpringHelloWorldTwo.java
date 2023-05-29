package com.tms.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringHelloWorldTwo {

    @Autowired
    private String helloMessage;

    public void getHelloMessage() {
        System.out.println("Hello message: " + helloMessage);
    }
}
