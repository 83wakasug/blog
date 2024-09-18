package com.blog.service;

import com.blog.entity.PostBlogEntity;
import com.blog.repository.PostBlogRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
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


    public List<PostBlogEntity> getAll(){
        return postBlogRepository.findAll();

    }

    public PostBlogEntity save(PostBlogEntity postBlogEntity){

        if(postBlogEntity.getId() == null){

            postBlogEntity.setCreatedAT(LocalDateTime.now());

        }

        return postBlogRepository.save(postBlogEntity);
    }




}
