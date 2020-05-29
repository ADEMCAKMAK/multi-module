package com.example.controller;

import com.example.service.core.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SpringBootApplication

@Configuration
@ComponentScan(basePackages = {"com.example.controller"})
public class ControllerApplication implements WebMvcConfigurer {

/*
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }
*/

}
