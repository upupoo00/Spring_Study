package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	private UserMapper userMapper;

	@Test
	void contextLoads() {

		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date=new Date();

	}

}
