package com.example.controller.core;


import com.example.service.core.AdviceService;
import com.example.service.core.GreetingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class BasicControllerTest extends ControllerTests {

    @Mock
    AdviceService adviceService;

    @Mock
    GreetingService greetingService;

    @InjectMocks
    BasicController basicController;

    @Test
    void basicControllerGreetingFromServiceTest(){

        // This part settings inputs and dependent class
        // given
        String expected = "greeting from service module";

        // when
        when(greetingService.greeting()).thenReturn(expected);

        // then
        String actual = (String) basicController.greetingFromService().getBody();

        // checking results
        assertThat(actual).isNotNull();

        verify(greetingService).greeting();
        verifyNoMoreInteractions(greetingService);

        // compare
        assertEquals(expected,  actual);
    }

    @Test
    void basicControllerAdvisingFromServiceTest(){

        // This part settings inputs and dependent class
        // given
        String expected = "advising from service module";

        // when
        when(adviceService.advising()).thenReturn(expected);

        // then
        String actual = (String) basicController.advisingFromService().getBody();

        // checking results
        assertThat(actual).isNotNull();

        verify(adviceService).advising();
        verifyNoMoreInteractions(adviceService);

        // compare
        assertEquals(expected,  actual);
    }
}
