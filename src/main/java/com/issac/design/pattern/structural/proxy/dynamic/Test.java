package com.issac.design.pattern.structural.proxy.dynamic;

import com.issac.design.pattern.structural.proxy.IOrderService;
import com.issac.design.pattern.structural.proxy.Order;
import com.issac.design.pattern.structural.proxy.OrderServiceImpl;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);

    }
}
