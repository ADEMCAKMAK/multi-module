package com.example.service.core;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting(){
        return "greeting from service module";
    }
}
