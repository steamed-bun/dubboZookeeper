package com.wx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-servlet.xml","classpath:remote-provider.xml");
        context.start();
        System.in.read();	//	按任意键退出
//        com.alibaba.dubbo.container.Main.main(args);
    }

}