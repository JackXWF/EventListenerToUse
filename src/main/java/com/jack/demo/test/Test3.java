package com.jack.demo.test;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Test3 {

    @Async("generateThreadPool")
    public void compute() {
        System.out.printf("[%s],方法1执行了 %n", Thread.currentThread());
    }



    @Async("generateThreadPool")
    public void compute2() {
        System.out.printf("[%s],方法2执行了", Thread.currentThread());
    }

}
