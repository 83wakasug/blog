package com.blog.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;

@Data
@Entity
public class UserInfo {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String email;
  private String password;
  private String firstName;
  private String lastName;

  @OneToMany(mappedBy = "userInfo")
 private List<UserInfo> userInfoList;


}
