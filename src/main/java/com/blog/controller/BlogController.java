package com.blog.controller;

import com.blog.entity.PostBlogEntity;
import com.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/blog/index")
@RequiredArgsConstructor

public class BlogController {

   private final PostService postService;

    @GetMapping("/")
    public Optional<PostBlogEntity> ShowBlog(Long id){

        return postService.getBlogById(id);

    }


    @PostMapping("/")
    public String Updateblog(String blogContents){

        return "hello";
    }



}
