package com.issac.design.pattern.structural.proxy;

import com.issac.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy serviceStaticProxy = new OrderServiceStaticProxy();
        serviceStaticProxy.saveOrder(order);
    }
}
