package com.example.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication

@Configuration
@ComponentScan(basePackages = {"com.example.service"})
@EnableAutoConfiguration
public class ServiceApplication {
    public ServiceApplication() {
        System.out.println(
                "Created Service module beans ..."
        );
    }

    /*
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
*/

}
