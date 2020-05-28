package com.example.service.core;


import org.springframework.stereotype.Service;

@Service
public class AdviceService {

    public String greeting(){
        return "advising something from service module";
    }
}
