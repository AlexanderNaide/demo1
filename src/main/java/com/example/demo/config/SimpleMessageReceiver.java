package com.example.demo.config;

import com.example.demo.entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SimpleMessageReceiver {


    public void receiveMessage(byte[] message) throws IOException {
        System.out.println("Received from topic <" + new String(message) + ">");

        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(message, User.class);
        byte[] bytes = objectMapper.writeValueAsBytes(user);
    }
}