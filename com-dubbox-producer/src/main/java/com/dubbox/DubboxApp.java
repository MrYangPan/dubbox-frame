package com.dubbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Mr.PanYang on 2018/8/21.
 */
public class DubboxApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbox-producer.xml");
        app.start();
        System.out.println("dubbox 发布成功...");
        System.in.read();
    }
}
