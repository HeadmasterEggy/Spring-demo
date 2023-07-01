package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
public class RequestController {
    //简单参数
    @RequestMapping("/SimpleParam")
    public String SimpleParam(User user) {
        System.out.println(user);
        return "OK";
    }

    //数组参数
    @RequestMapping("/ArrayParam")
    public String ArrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    //日期时间参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime.toString());
        return "OK";
    }

    //json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam1(@PathVariable Integer id) {
        System.out.println(id);
        return "OK";
    }
    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + "=" + name);
        return "OK";
    }
}
