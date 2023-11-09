package com.jack.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ThreadPoolTest {


    @Bean
    public Executor generateThreadPool() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //核心线程数
        taskExecutor.setCorePoolSize(2);
        //最大线程池大小
        taskExecutor.setMaxPoolSize(5);
        //队列大小
        taskExecutor.setQueueCapacity(200);
        //线程名称
        taskExecutor.setThreadNamePrefix("test-thread-");
        //拒绝策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        //初始化
        taskExecutor.initialize();

        return taskExecutor;
    }
}
