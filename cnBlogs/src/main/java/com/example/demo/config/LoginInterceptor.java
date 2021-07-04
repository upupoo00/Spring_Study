package com.example.demo.config;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginInterceptor implements HandlerInterceptor {
    /** * 重写preHandle方法，表示请求路径最终匹配到某个Controller时，在调用控制器
      * 方法前，先执行本拦截器的前置处理逻辑
      */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        //session不为空，表示已登录
        if(session != null && session.getAttribute(AppFinal.USERINFO_SESSIONKEY) != null ){
            //返回true，允许继续执行Controller中的方法
            return true;
        }
        //响应状态码设置为401
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        //返回false，不再执行Controller中的方法，直接响应一个空的响应体
        return false;
    }
}
