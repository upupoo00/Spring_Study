package com.example.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;

@ControllerAdvice
public class MyResponseBodyAdvice  implements ResponseBodyAdvice {

//    @Autowired
//    private ObjjectMapper objectMapper;


    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object o,
                                  MethodParameter methodParameter,
                                  MediaType mediaType, Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("status",0);
        map.put("data",o);
        map.put("msg","");
//        if(o instanceof String){
//            //后端接口
//            //当前方法要给前端返回一个json字符串
//            serverHttpResponse.getHeaders().setContentType(MediaType.APPLICATION_JSON);
//            //返回一个json字符串
//            return objectMapper.writeValueAsString(map);
//        }
        return map;
    }
}
