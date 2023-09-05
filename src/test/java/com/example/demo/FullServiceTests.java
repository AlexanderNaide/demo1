package com.example.demo;

import com.example.demo.model.RequestCreateUser;
import com.example.demo.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static net.bytebuddy.matcher.ElementMatchers.is;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FullServiceTests {

    @Autowired
    public MockMvc mvc;

    @MockBean
    public UserRepository userRepository;

    @Test
    void fullRestTest() throws Exception {

        RequestCreateUser rqu = new RequestCreateUser();
        rqu.setUsername("Vova");
        rqu.setFirstname("Nevova");
        ObjectMapper om = new ObjectMapper();


        // Что-то тут не проходит
        mvc.perform(post("/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(om.writeValueAsBytes(rqu)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect((ResultMatcher) jsonPath("$.username", is(rqu.getUsername())));
    }

}
