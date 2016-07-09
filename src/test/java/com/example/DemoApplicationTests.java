package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = DefaultDateController.class)
public class DemoApplicationTests {

    @Autowired
    MockMvc mockMvc;


    @Test
    public void contextLoads() {
    }


    @Test
    public void testControllers() throws Exception {
        Date date = new Date();
        mockMvc.perform(
                get("/putDate").param("from", "01/01/2012"))
                .andExpect(status().isOk());
    }


}
