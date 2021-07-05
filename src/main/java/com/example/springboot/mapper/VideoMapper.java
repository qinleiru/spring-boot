package com.example.springboot.mapper;

import com.example.springboot.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {
    //模拟内存数据，临时这样写
    private static Map<Integer, Video> videoMapper=new HashMap<>();
    static {
        videoMapper.put(1,new Video(1,"java基础教程"));
        videoMapper.put(2,new Video(2,"SpringBoot"));
        videoMapper.put(3,new Video(3,"微服务"));
        videoMapper.put(4,new Video(4,"支付"));
        videoMapper.put(5,new Video(5,"教程"));

    }

    public List<Video> listVideo(){
        List<Video> list=new ArrayList<>();
        list.addAll(videoMapper.values());
        return list;
    }
}
