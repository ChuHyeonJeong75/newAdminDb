package com.example.newAdminDb.repository;

import com.example.newAdminDb.model.controller.GetController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@WebMvcTest(GetController.class)
public class GetControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getTest() throws Exception{
        //localhost:8080/Admin/get?account=블랙캣

        var param = new LinkedMultiValueMap<String, String>();

        param.put("account", List.of("블랙캣"));
        param.put("pwd", List.of("1005"));

        URI uri = UriComponentsBuilder
                .newInstance()
                .path("/Admin/getParam")
                .queryParams(param)
                .build()
                .toUri();

        mockMvc.perform(get(uri))
                .andExpect(status().isOk())
                .andExpect(content().string("블랙캣"))
                .andExpectAll()
                .andDo(print());

    }
}
