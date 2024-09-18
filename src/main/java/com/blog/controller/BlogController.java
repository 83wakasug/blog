package com.blog.controller;

import jakarta.persistence.Table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog/index")


public class BlogController {

    @GetMapping("/")
    public List<String> ShowBlog(){

        return

    }


    @PostMapping("/")
    public String Updateblog(String blogContents){

    }



}
