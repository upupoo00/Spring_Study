package com.example.demo.controller;

import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RequestMapping("/user")
@RestController
@Slf4j
public class UserController  {

    // 创建一个当前类日志对象
//    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/sayhi")
    public String getIndex(){
        log.error("我的日志信息，级别：error");
        log.warn("我的日志信息，级别：warn");
        log.info("我的日志信息，级别：info");
        log.debug("我的日志信息，级别：debug");
        log.trace("我的日志信息，级别：trace");
        return "你好，SpringBoot";
    }

    @RequestMapping("/login")
    @ResponseBody // 当前方法返回的为数据而非视图
    public Object login(User user, HttpServletRequest request){
        // 返回的对象
        HashMap<String,Object> map = new HashMap<>();
        int status = -1; // 非正常返回
        String msg = "未知错误";
        String data  = "登录失败";
        if(user!=null &&
                user.getUsername().equals("root") &&
                user.getPassword().equalsIgnoreCase("root")){
            // 登录信息存储到 Session
            HttpSession session = request.getSession();
            session.setAttribute("userinfo",user);
            status = 0;
            msg = "";
            data = "登录成功";
        }else{
            status = 0;
            msg = "用户名错误";
            data = "登录失败";
        }
        map.put("status",status);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }

    @RequestMapping("/login2")
    @ResponseBody // 当前方法返回的为数据而非视图
    public Object login2(@RequestParam String name, HttpServletRequest request){
        // 返回的对象
        HashMap<String,Object> map = new HashMap<>();
        int status = -1; // 非正常返回
        String msg = "未知错误";
        String data  = "登录失败";
        if(name.equals("root")){
            // 登录信息存储到 Session
            HttpSession session = request.getSession();
            session.setAttribute("name",name);
            status = 0;
            msg = "";
            data = "登录成功";
        }else{
            status = 0;
            msg = "用户名错误";
            data = "登录失败";
        }
        map.put("status",status);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }
}
