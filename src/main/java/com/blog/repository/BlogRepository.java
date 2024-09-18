package com.blog.repository;

import com.blog.entity.Login;
import com.blog.entity.PostBlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<PostBlogEntity, Login> {


}
