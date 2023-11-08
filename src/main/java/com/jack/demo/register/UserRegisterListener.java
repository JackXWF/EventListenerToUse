package com.jack.demo.register;


import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 用户注册监听器
 */
@Component
public class UserRegisterListener {
    @EventListener
    //@Order(1)
    public void sendMail(UserRegisterEvent event) {
        System.out.printf("【%s】给用户【%s】发送注册成功邮件!%n", Thread.currentThread(), event.getUserName());
    }

    @EventListener
    //@Order(0) //设置监听器执行的顺序 小的先执行
    public void sendCompon(UserRegisterEvent event) {
        System.out.printf("【%s】给用户【%s】发送优惠券!%n", Thread.currentThread(), event.getUserName());
    }
}
