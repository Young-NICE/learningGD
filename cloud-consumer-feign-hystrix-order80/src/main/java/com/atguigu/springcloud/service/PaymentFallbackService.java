package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: 13720
 * @date: 2020/7/16
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbcakService fall back-paymentInfo_OK,正常的异常返回";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---PaymentFallbcakService fall back-paymentInfo_OK,异常的异常返回";
    }
}
