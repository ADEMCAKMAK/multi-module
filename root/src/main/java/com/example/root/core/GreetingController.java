package com.example.root.core;


import com.example.service.core.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(value = "/greetingFromService", method = RequestMethod.GET)
    public ResponseEntity<?> greetingFromService(){
        return ResponseEntity.ok(greetingService.greeting());
    }

}
