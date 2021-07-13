package com.example.springboot.controller;

import com.example.springboot.domain.User;
import com.example.springboot.domain.Video;
import com.example.springboot.service.VideoService;
import com.example.springboot.tool.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller 返回不会序列化会JSON字符串
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //@RequestMapping("list")
    @GetMapping("list")
    public JsonData list(){
        List<Video> list=videoService.listVideo();
        System.out.println(111);
        return JsonData.buildSuccess(videoService.listVideo());
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideo(@RequestBody Video video){
        System.out.println(video.toString());
       return JsonData.buildSuccess("");
    }
}
