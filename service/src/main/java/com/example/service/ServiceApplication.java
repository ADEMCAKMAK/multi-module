package com.example.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.example.service"})
public class ServiceApplication implements WebMvcConfigurer {

/*
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
*/

}
