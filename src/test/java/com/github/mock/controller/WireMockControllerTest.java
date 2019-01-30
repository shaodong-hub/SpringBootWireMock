package com.github.mock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * <p>
 * 创建时间为 下午2:13-2019/1/30
 * 项目名称 SpringBootWireMock
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@AutoConfigureWireMock(stubs = "classpath:/templates", port = 8081)
public class WireMockControllerTest {


    @Autowired
    private MockMvc mvc;

    @Test
    public void bothServicesDoStuff() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.get("/get"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World"));
    }
}