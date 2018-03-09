package com.coocaa.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Intercept extends HandlerInterceptorAdapter {

    public static int count = 1;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (count == 2 || count == 4){
            count++;
            System.out.println("Intercept");
            String uri = request.getRequestURL().toString();
            Cookie cookie = new Cookie("prev_url", uri);
            cookie.setPath("/");
            response.addCookie(cookie);
            String path = request.getContextPath();
            int port = request.getServerPort();
            String basePath = request.getScheme() + "://" + request.getServerName() + (port == 80 ? "" : ":" + port) + path;
            System.out.println(basePath);
            response.sendRedirect(basePath + "/test.html");
            return false;
        }
        count++;
        System.out.println( "count: " + count);
        return true;
    }
}
