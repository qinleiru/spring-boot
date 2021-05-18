package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller 返回不会序列化会JSON字符串
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @RequestMapping("list")
    //@GetMapping("list")
    //@PostMapping("list")
    public Object list(){
        Map<String,String> map=new HashMap<>();
        map.put("1","面试专题课程");
        map.put("2","SpringBoot微服务课程");
        return map;

    }
}
