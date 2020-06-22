package com.example.root;

import com.example.controller.ControllerApplication;
import com.example.service.ServiceApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {
        ServiceApplication.class, ControllerApplication.class
})
class RootApplicationTests {

    @Test
    void contextLoads() {
    }

}
