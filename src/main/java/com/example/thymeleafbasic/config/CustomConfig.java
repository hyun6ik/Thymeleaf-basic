package com.example.thymeleafbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("helloBean")
public class CustomConfig {

    public String hello(String data) {
        return "Hello " + data;
    }

}
