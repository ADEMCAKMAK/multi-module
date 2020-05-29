package com.example.root.config;

import com.example.controller.ControllerApplication;
import com.example.service.ServiceApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(value = {"com.example.root"})
@Import(value = {ServiceApplication.class, ControllerApplication.class})
public class CommonConfig implements WebMvcConfigurer {


}
