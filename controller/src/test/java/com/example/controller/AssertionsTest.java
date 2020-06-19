package com.example.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class AssertionsTest {

    @Test
    @Disabled(value = "disabled until learn mocking bro ;)")
    void assertExamples(){
        assertEquals("index", "index");
        //assertEquals("index", "sdjbfusf", "Wrong match Returned");
        //assertEquals("index", "asdasdasda", () -> "Another Expensive Message " + "Make me only if you have to");
    }

    @DisplayName("grouping assert example is applied.")
    @Test
    void assertGroupExamples(){
        //given
        Map<String, String> data = new HashMap<>();
        data.put("name", "John");
        data.put("surname", "Wick");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(data.get("name"), "John"),
                () -> assertEquals(data.get("surname"), "Wick"));

        assertAll("Test Props Set",
                () -> assertEquals(data.get("name"), "John", "upsss"),
                () -> assertEquals(data.get("surname"), "Wick", "whattt!!!"));
    }


    @Test
    void dependentAssertions() {

        Map<String, String> data = new HashMap<>();
        data.put("name", "Joe");
        data.put("surname", "Buck");
        data.put("city", "Gotham");
        data.put("phone","1231231234");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", data.get("name"), "First Name Did not Match"),
                        () -> assertEquals("Buck", data.get("surname"))),
                () -> assertAll("data Properties",
                        () -> assertEquals("Gotham", data.get("city"), "City Did Not Match"),
                        () -> assertEquals("1231231234", data.get("phone"))
                ));
    }

    @Test
    @DisplayName("Test exception")
    void AssertException() {
        assertThrows(RuntimeException.class, () -> {
             throw new RuntimeException("runnnnnn");
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOut() {

        assertTimeout(Duration.ofMillis(5500), () -> {
            Thread.sleep(5000);

            System.out.println("I got here");
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOutPrempt() {

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);

            System.out.println("I got here 2342342342342");
        });
    }

    @Test
    void testAssumptionTrueAssumptionIsTrue() {
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }
}
