package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
//MyBatis配置类
@Configurable
@MapperScan("com.example.mall.mbg.mapper")
public class MyBatisConfig {
}
