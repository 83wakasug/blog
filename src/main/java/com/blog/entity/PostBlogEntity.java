package com.blog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class PostBlogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    private LocalDateTime createdAT;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "userInfo_id", referencedColumnName = "id" , nullable = false)
    private UserInfo userInfo;


}
