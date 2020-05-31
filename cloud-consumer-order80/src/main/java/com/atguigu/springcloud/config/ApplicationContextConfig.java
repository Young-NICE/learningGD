package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 13720
 * @date: 2020/5/25
 * @description:
 */
@Configuration
public class ApplicationContextConfig {
    /*
    * 相当于 applicationContext.xml <bean id="" class="">
    * */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
