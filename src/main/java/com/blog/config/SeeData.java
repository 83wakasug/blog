package com.blog.config;

import com.blog.entity.PostBlogEntity;
import com.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SeeData implements CommandLineRunner {


    private final PostService service;

    @Override
    public void run(String... args) throws Exception{
        List<PostBlogEntity> posts = service.getAll();

        if(posts.size() == 0){

            PostBlogEntity post = new PostBlogEntity();
            post.setTitle("title of post");
            post.setBody("this is the body for post1");
            PostBlogEntity post2 = new PostBlogEntity();
            post2.setTitle("title of post");
            post2.setBody("this is the body for post1");

            service.save(post);
            service.save(post2);
        }


    }



}
