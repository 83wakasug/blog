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
   public Optional<PostBlogEntity> postBlogEntity;

    @GetMapping("/{id}")
    public String ShowBlog(@PathVariable Long id){
        postBlogEntity = postService.getBlogById(id);
        return postBlogEntity.get().getBody();

    }


    @PostMapping("/")
    public String Updateblog(String blogContents){

        return "hello";
    }



}
