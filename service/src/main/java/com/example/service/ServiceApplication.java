package com.example.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
@ComponentScan(basePackages = {"com.example.service"})
public class ServiceApplication {

/*
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
*/

}
