package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication

@Component
@ComponentScan(basePackages = {"com.example.controller"})
public class ControllerApplication {

/*
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }
*/

}
