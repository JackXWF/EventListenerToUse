package com.jack.demo.config;

import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.jack.demo.test.TableInfoContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MybatisConfiguration {

    @Bean
    public DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor() {
        Map<String, TableNameHandler> map = new HashMap<>(1);
        map.put("person", (sql, tableName) -> TableInfoContext.getInfo() == null ? "person" : TableInfoContext.getInfo()); //只要是操作 person 这张表 就会走这个拦截器 ，然后进行相关操作
        return new DynamicTableNameInnerInterceptor(map);
    }

}