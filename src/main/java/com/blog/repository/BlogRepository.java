package com.blog.repository;

import com.blog.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Long, Login> {


}
