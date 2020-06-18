package com.example.controller.core;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controllers")
public abstract class ControllerTests {

    @BeforeAll
    void beforeAll(){
        System.out.println("Lets do something here before all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Lets do something here before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Lets do something here after each");
    }

    @AfterAll
    void afterAll(){
        System.out.println("Lets do something here after all");
    }
}
