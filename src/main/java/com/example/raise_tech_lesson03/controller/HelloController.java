package com.example.raise_tech_lesson03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    // rootからのURLをマッピングして指定のhtml名を返す
    @RequestMapping("/hello0")
    public String hello0(){
        return "hello0.html";
    }

    @RequestMapping("/hello1")
    public String hello1(){
        return "hello1.html";
    }
}
