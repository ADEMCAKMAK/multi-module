package com.example.controller.core;


import com.example.service.core.AdviceService;
import com.example.service.core.GreetingService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BasicControllerTest extends ControllerTests{

    @Mock
    GreetingService greetingService;

    @Mock
    AdviceService adviceService;

    @InjectMocks
    BasicController basicController;

    @Override
    @BeforeAll
    public void beforeAll() {
        super.beforeAll();
/*
        adviceService = new AdviceService();
        greetingService = new GreetingService();
        basicController = new BasicController(adviceService, greetingService);
*/

        //MockitoAnnotations.initMocks(this);
    }

    @Override
    @AfterAll
    void afterAll() {
        super.afterAll();
    }

    @Test
    void basicControllerGreetingFromServiceTest(){
        basicController.greetingFromService();
        verify(greetingService, times(1)).greeting();
        //verifyNoMoreInteractions(greetingService);
    }

    @Test
    void basicControllerAdvisingFromServiceTest(){
        basicController.advisingFromService();
        verify(adviceService, times(1)).advising();
        //verifyNoMoreInteractions(adviceService);
    }
}
