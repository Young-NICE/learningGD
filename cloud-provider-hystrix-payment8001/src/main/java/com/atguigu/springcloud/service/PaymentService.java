package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {

    public String paymentInfo_OK(@PathVariable("id") Integer id);

    public String paymentInfo_Timeout(@PathVariable("id") Integer id);

    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);
}
