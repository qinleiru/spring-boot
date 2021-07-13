package com.example.springboot.mapper;

import com.example.springboot.domain.User;
import com.example.springboot.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMapper=new HashMap<>();

    static {
        userMapper.put("jack",new User(1,"jack","123"));
        userMapper.put("weihao",new User(2,"weihao","12345"));
        userMapper.put("tom",new User(3,"tom","12334568"));
    }

    public User  login(String username,String pwd){
        User user=userMapper.get(username);
        if(user==null) return null;
        if(user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }
}
