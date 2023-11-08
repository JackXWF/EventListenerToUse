package com.jack.demo;

import com.jack.demo.config.MainConfig2;
import com.jack.demo.service.UserRegisterService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserRegisterService service;


    @Test
    void contextLoads() {
        service.registerUser("jack");
    }


    @Test
    void test2() {
        int i = 1;
        int j = 1;
        int a = i++;

        int b = ++j;

        System.out.println(a + "-----" + b);

        System.out.printf(i+"----"+j);
    }

}
