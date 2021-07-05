package com.example.springboot.controller;

import com.example.springboot.service.VideoService;
import com.example.springboot.tool.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller 返回不会序列化会JSON字符串
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //@RequestMapping("list")
    @GetMapping("list")
    public Object list(){

        return JsonData.buildSuccess(videoService.listVideo());
    }
}
