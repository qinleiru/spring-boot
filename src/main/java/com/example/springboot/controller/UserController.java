package com.example.springboot.controller;

import com.example.springboot.domain.User;
import com.example.springboot.tool.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {

/*    @PostMapping ("login")
    public Object login(String username,String pwd){
        System.out.println("username="+username+" pwd="+pwd);
        return JsonData.buildSuccess("");
    }*/

    @PostMapping ("login")
    public Object login(User user){
        System.out.println(user.toString());
        return JsonData.buildSuccess("");
    }
}
