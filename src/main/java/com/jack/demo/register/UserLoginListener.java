package com.jack.demo.register;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 用户登陆监听器
 */
@Component
public class UserLoginListener {

    @EventListener
    public void userLogin(UserRegisterEvent event) {
        if ("jack".equals(event.getUserName())) {
            System.out.printf("【%s】用户【%s】登陆了!%n", Thread.currentThread(), event.getUserName());
        }
    }


}
