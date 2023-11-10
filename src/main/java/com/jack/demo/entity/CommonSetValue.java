package com.jack.demo.entity;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用@ConfigurationProperties注解获取配置文件参数
 */


@Data
@ConfigurationProperties(prefix = "common.data")
public class CommonSetValue {
    private String username;

    private String password;
}
