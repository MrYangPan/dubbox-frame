package com.dubbox;

import com.dubbox.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mr.PanYang on 2018/8/21.
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbox-consumer.xml");
        app.start();
        UserService userService = (UserService) app.getBean("userService");
        String result = userService.getUserById(2);
        System.out.println(result);
    }
}
