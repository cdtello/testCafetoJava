package com.platzi.market;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import com.platzi.market.web.controller.ApiController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ApiController.class)
class HelloControllerIntTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void hello() throws Exception {
        RequestBuilder request = get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello world", result.getResponse().getContentAsString());
    }

    @Test
    public void testHelloWithName() throws Exception {
        mvc.perform(get("/status?status=true"))
                .andExpect(content().string("OK"));
    }
}
