package com.example.controller.core;


import com.example.service.core.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/greetingFromService", method = RequestMethod.GET)
    public ResponseEntity<?> greetingFromService(){
        return ResponseEntity.ok(greetingService.greeting());
    }

}