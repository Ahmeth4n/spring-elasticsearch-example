package com.magnakod.kratos.controller;

import com.magnakod.kratos.document.Users;
import com.magnakod.kratos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(path = "/api/user")
    public void save(@RequestBody final Users users){
        userService.save(users);
    }

    @PostMapping(path = "/api/user/update")
    public void update(@RequestBody final Users users){
        userService.findById(users.getId());
    }



}
