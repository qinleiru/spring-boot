package com.example.springboot.controller;

import com.example.springboot.domain.User;
import com.example.springboot.service.UserService;
import com.example.springboot.tool.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {

/*    @PostMapping ("login")
    public Object login(String username,String pwd){
        System.out.println("username="+username+" pwd="+pwd);
        return JsonData.buildSuccess("");
    }*/

    @Autowired
    public UserService userService;

    @PostMapping ("login")
    public Object login(@RequestBody User user){
        System.out.println("user"+user.toString());
        String token=userService.login(user.getUsername(), user.getPwd());
        return token!=null?JsonData.buildSuccess(token):JsonData.buildError("账号密码错误");
    }
}
