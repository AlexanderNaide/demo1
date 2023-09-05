package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.model.RequestCreateUser;
import com.example.demo.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

//@SpringBootTest // Так запустится веё окружение
@SpringBootTest(classes = UserService.class) // А так только этот класс
class ServiceTests {

    @Autowired
    public UserService userService;
    @MockBean
    public UserRepository userRepository;


    @Test
    void ResponseNewUserTest() {
        RequestCreateUser requestCreateUser = new RequestCreateUser();
        String userName = "Vova";
        String firstname = "Tupolev";

        requestCreateUser.setUsername(userName);
        requestCreateUser.setFirstname(firstname);

        User user = new User();
        user.setId(1L);
        user.setUsername(userName);
        user.setFirstname(firstname);

        User nullUser = new User();
        nullUser.setUsername(userName);
        nullUser.setFirstname(firstname);

        Mockito.doReturn(user).when(userRepository).save(nullUser);

        Assertions.assertEquals(nullUser, userService.createUser(requestCreateUser));
        Mockito.verify(userRepository, Mockito.times(1)).save(ArgumentMatchers.eq(nullUser));
    }

}
