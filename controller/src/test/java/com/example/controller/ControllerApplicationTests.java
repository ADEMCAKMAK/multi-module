package com.example.controller;

import com.example.controller.core.BasicControllerTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration
@SpringBootTest(classes = {AssertionsTest.class, BasicControllerTest.class})
class ControllerApplicationTests {

    @Test
    void contextLoads() {
    }

}
