package com.blog.service;

import com.blog.repository.BlogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    private final BlogRepository blogRepository;




}
