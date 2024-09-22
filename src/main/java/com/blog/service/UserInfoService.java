package com.blog.service;

import com.blog.entity.UserInfo;
import com.blog.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    public UserInfo save(UserInfo userinfo){

        return userInfoRepository.save(userinfo);

    }


}
