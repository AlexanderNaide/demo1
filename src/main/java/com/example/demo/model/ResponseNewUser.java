package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseNewUser {

    private Long id;
    private String username;
    private String firstname;

}
