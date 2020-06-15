package com.example.root.config;


import com.example.controller.config.CommonControllerConfig;
import com.example.service.config.CommonServiceConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.example.root", "com.example.service", "com.example.controller"})
@EnableWebMvc
@EnableCaching
@Import(value = {CommonServiceConfig.class, CommonControllerConfig.class})
public class CommonConfig {

}
