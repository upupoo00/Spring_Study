package com.example.demo.mapper;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
        //保证方法可以正常执行，并且不会存储到数据库中
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void addUser() {

    }

    @Test
    void getUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    void getUserByNameAndPassword() {
        User user = userMapper.getUserByNameAndPassword("八戒","123");
        System.out.println(user);
    }

    @Test
    void getAll() {
    }

    @Test
    void delById() {
    }

    @Test
    void upUser() {
    }

    @Test
    void getList() {
    }

    @Test
    void getListByName() {
    }

    @Test
    void getListByName2() {
    }

    @Test
    void getFullUser() {
    }
}