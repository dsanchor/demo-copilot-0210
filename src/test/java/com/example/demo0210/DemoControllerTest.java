package com.example.demo0210;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello world from Spring Boot!"));
    }

    @Test
    public void testReverseText() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse").param("text", "hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("olleh"));
    }

    @Test
    public void testReverseTextEmpty() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse").param("text", ""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

    @Test
    public void testRemoveVowels() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/removeVowels").param("text", "hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hll"));
    }
}