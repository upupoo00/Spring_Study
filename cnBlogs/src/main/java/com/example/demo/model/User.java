package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String photo;
    private List<ArticleInfo> alist;
}
