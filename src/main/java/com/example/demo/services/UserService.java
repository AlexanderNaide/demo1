package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.model.RequestCreateUser;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepository userRepository;

    public User createUser(RequestCreateUser user){
        User entity = new User();
        entity.setUsername(user.getUsername());
        entity.setFirstname(user.getFirstname());
        userRepository.save(entity);
        System.out.printf("User - %s, id - %d", entity.getUsername(), entity.getId());
        return entity;
    }
}
