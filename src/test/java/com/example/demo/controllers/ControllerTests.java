package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.model.RequestCreateUser;
import com.example.demo.model.ResponseNewUser;
import com.example.demo.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ControllerTests {

    @Autowired
    public Controller controller;

    @MockBean
    public UserService userService;

    @Test
    void ResponseNewUserTest() {
        RequestCreateUser requestCreateUser = new RequestCreateUser();
        requestCreateUser.setUsername("Vova");
        requestCreateUser.setFirstname("Tupolev");

        User user = new User();
        user.setId(1L);
        user.setUsername("Vova");
        user.setFirstname("Tupolev");

        ResponseNewUser responseNewUser = new ResponseNewUser(user.getId(), user.getUsername(), user.getFirstname());

        Mockito.doReturn(user).when(userService).createUser(requestCreateUser);

        Assertions.assertEquals(responseNewUser, controller.createUser(requestCreateUser));
        Mockito.verify(userService, Mockito.times(1)).createUser(ArgumentMatchers.eq(requestCreateUser));
    }

}
