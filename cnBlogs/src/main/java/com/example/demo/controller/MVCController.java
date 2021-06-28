package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller // spring 初始化此类
// @Controller+@ResponseBody = @RestController 返回字符串而不是视图
//@ResponseBody
@RequestMapping("/mvc")
@Slf4j
public class MVCController {

    @GetMapping("/index4")
    public String getIndex4(){
        log.error("我是 index4.html");
        return "/index.html";
    }

    @RequestMapping("/index")
    public String getIndex(){
        log.error("我是 index.html");
        return "redirect:/index.html";
    }

    @RequestMapping("/index2")
    public String getIndex2(){
        log.error("我是请求转发");
        return "forward:/index.html";
    }

    /**
     * 实现 301 跳转
     * @param response
     * @return
     */
    @RequestMapping("/index3")
    public String getIndex3(HttpServletResponse response){
        response.setStatus(301);
//        response.setHeader("Location","http://localhost:8081/index.html");
        response.setHeader("Location","/index.html");
        return null;
    }

}
