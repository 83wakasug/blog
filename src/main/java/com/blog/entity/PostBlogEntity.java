package com.blog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class PostBlogEntity {
    @Id
    private Long id;

    Date createdAT;


}
