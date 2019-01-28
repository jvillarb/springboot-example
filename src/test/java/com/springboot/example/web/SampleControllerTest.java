package com.springboot.example.web;

import com.springboot.example.service.SampleService;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SampleControllerTest {
    private SampleController sampleController;

    private SampleService sampleService;

    @Before
    public void init(){
        sampleService = mock(SampleService.class);
        sampleController = new SampleController(sampleService);
    }

    @Test
    public void sampleControllerShouldCallService() {
        String userName = "nroales";
        String expectedMessage = "message";

        when(sampleService.welcome(userName)).thenReturn(expectedMessage);

        String message = sampleController.welcome(userName);

        verify(sampleService).welcome(userName);
        assertEquals(message, expectedMessage);
    }
}
