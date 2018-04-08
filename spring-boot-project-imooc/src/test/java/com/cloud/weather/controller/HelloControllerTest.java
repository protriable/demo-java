package com.cloud.weather.controller;

import com.cloud.weather.StartApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author protry
 */
public class HelloControllerTest extends StartApplicationTests {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().string("Hello World"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}