package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);

}
