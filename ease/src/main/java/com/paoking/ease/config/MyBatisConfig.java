package com.paoking.ease.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类.
 */
@Configuration
@MapperScan("com.paoking.ease.mbg.mapper")
public class MyBatisConfig {
}
