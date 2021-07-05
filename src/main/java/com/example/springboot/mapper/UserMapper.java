package com.example.springboot.mapper;

import com.example.springboot.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {
    private static Map<Integer, User> userMapper=new HashMap<>();

    static {
        userMapper.put(1,new User(1,"jack","123"));
        userMapper.put(1,new User(1,"weihao","12345"));
        userMapper.put(1,new User(1,"tom","12334568"));
    }
}
