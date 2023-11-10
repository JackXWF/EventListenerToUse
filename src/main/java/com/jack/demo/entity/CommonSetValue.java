package com.jack.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用@ConfigurationProperties注解获取配置文件参数
 */


@Data
@ConfigurationProperties(prefix = "common.data")
public class CommonSetValue {
    private String username;

    private String password;
}
