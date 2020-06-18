package com.example.service.core;


import org.springframework.stereotype.Service;

@Service
public class AdviceService {

    public String advising(){
        return "advising from service module";
    }
}
