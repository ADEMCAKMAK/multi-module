package com.example.controller.core;


import com.example.service.core.AdviceService;
import com.example.service.core.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@WebMvcTest(BasicController.class)
public class BasicControllerMockMvcTest extends ControllerTests {

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setup(){
    }

    @Test
    void basicControllerGreetingFromServiceTest() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .request(HttpMethod.GET, "/multi-module/api/greetingFromService")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andReturn();
    }

    @Test
    void basicControllerAdvisingFromServiceTest() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .request(HttpMethod.GET, "/advisingFromService")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }


}
