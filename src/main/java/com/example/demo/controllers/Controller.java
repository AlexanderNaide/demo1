package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.model.RequestCreateUser;
import com.example.demo.model.ResponseNewUser;
import com.example.demo.services.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class Controller {

    public final UserService userService;
//    public final RabbitTemplate rabbitTemplate;

    @PostMapping("/create")
    public ResponseNewUser createUser(@RequestBody RequestCreateUser user){
        System.out.println(user.getUsername());
        System.out.println(user.getFirstname());
        User newUser = userService.createUser(user);
        return Stream.of(newUser).filter(Objects::nonNull).map(e -> new ResponseNewUser(e.getId(), e.getUsername(), e.getFirstname())).findFirst().get();
    }

    //Получение http запроса и перенаправление его в очередь RMQ
//    @RequestMapping(value = "/queue/{key}/set", method = RequestMethod.GET)
/*    @GetMapping("/queue/{key}/set")
    public void queueProcessor(@PathVariable String key, @RequestParam String message){
        rabbitTemplate.convertAndSend(queue, key, "task from server: " + message);
    }*/

}
