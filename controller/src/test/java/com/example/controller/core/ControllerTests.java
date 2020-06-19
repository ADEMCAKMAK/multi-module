package com.example.controller.core;


import org.junit.jupiter.api.*;


@Tag("controllers")
public abstract class ControllerTests {

    @BeforeAll
    static void beforeAll(){
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
    static void afterAll(){
        System.out.println("Lets do something here after all");
    }
}
