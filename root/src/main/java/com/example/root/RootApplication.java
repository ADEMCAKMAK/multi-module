package com.example.root;

import com.example.root.config.RootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {RootConfig.class})
//@ServletComponentScan
public class RootApplication /*extends SpringBootServletInitializer */{

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

/*
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RootApplication.class);
    }
*/

}
