package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog/index")


public class BlogController {


    @GetMapping("/")
    public String login(String username,String password){


        return "hello";
    }




}
