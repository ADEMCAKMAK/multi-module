package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication

@Configuration
@ComponentScan(basePackages = {"com.example.controller"})
@EnableAutoConfiguration
public class ControllerApplication {
    public ControllerApplication() {
        System.out.println(
                "Created Controller module beans ..."
        );
    }

/*
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }
*/

}
