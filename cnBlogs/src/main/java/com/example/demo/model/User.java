package com.example.demo.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String photo;
    private List<ArticleInfo> alist;
}
