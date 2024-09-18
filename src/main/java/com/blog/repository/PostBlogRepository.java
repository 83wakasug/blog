package com.blog.repository;

import com.blog.entity.Login;
import com.blog.entity.PostBlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostBlogRepository extends JpaRepository<PostBlogEntity, Long> {

   Optional<PostBlogEntity> findById(Long id);

}
