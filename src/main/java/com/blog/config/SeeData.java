package com.blog.config;

import com.blog.entity.PostBlogEntity;
import com.blog.entity.UserInfo;
import com.blog.service.PostService;
import com.blog.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SeeData implements CommandLineRunner {


    private final PostService service;
    private final UserInfoService userInfoService;

    @Override
    public void run(String... args) throws Exception{
        List<PostBlogEntity> posts = service.getAll();

        if(posts.size() == 0){
            UserInfo user1 = new UserInfo();
            UserInfo user2 = new UserInfo();

            user1.setFirstName("user");
            user1.setLastName("userlastname");
            user1.setCountry("seweden");
            user1.setEmail("user1@gmail.com");
            user1.setPassword("test");

            user2.setFirstName("user2");
            user2.setLastName("user2lastname");
            user2.setCountry("USA");
            user2.setEmail("user2@gmail.com");
            user2.setPassword("test2");


            userInfoService.save(user1);
            userInfoService.save(user2);


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
