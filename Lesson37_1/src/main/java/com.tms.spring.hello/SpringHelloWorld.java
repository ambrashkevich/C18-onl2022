package com.tms.spring.hello;

public class SpringHelloWorld {

    private String helloMessage;

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void getHelloMessage() {
        System.out.println("Hello message: " + helloMessage);
    }
}