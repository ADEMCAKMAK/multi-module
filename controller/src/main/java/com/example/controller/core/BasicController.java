package com.example.controller.core;


import com.example.service.core.AdviceService;
import com.example.service.core.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private final AdviceService adviceService;

    private final GreetingService greetingService;

    public BasicController(AdviceService adviceService, GreetingService greetingService) {
        this.adviceService = adviceService;
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/greetingFromService", method = RequestMethod.GET)
    public ResponseEntity<?> greetingFromService(){
        return ResponseEntity.ok(greetingService.greeting());
    }

    @RequestMapping(value = "/advisingFromService", method = RequestMethod.GET)
    public ResponseEntity<?> advisingFromService(){
        return ResponseEntity.ok(adviceService.advising());
    }
}
