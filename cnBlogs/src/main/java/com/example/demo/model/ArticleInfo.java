package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleInfo {
    private int id;
    private String title;
    private String content;
    private Date createtime;
    private Date updatetime;
    private int uid;
    private int rcount;
    private String state;
    private User user;
}
