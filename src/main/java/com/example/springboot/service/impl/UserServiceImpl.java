package com.example.springboot.service.impl;

import com.example.springboot.domain.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static Map<String,User> sessionMap=new HashMap<>();

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String pwd) {
        User user=userMapper.login(username,pwd);
        if(user==null){
            return null;
        }else{
            /**最简单的session的管理适合单机，如果分布式需要使用redis**/
            String token=UUID.randomUUID().toString();
            sessionMap.put(token,user);
            return token;
        }
    }
}
