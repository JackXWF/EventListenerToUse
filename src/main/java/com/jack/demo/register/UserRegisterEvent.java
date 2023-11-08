package com.jack.demo.register;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {
    //用户名
    private String userName;

    public UserRegisterEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }

}