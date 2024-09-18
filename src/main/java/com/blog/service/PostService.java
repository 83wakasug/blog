package com.blog.service;

import com.blog.entity.PostBlogEntity;
import com.blog.repository.PostBlogRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor
public class PostService {


    private final PostBlogRepository postBlogRepository;

    public Optional<PostBlogEntity> getBlogById(Long id){

        postBlogRepository.getReferenceById(id);

        return Optional.of(postBlogRepository.getReferenceById(id));

    }




}
