package com.example.root;


import com.example.root.config.CommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@EnableAspectJAutoProxy
@ServletComponentScan
@Import(value = {CommonConfig.class})
public class RootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RootApplication.class);
    }
}
