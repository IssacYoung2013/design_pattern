package com.issac.design.pattern.structural.proxy.staticproxy;

import com.issac.design.pattern.structural.proxy.IOrderService;
import com.issac.design.pattern.structural.proxy.Order;
import com.issac.design.pattern.structural.proxy.OrderServiceImpl;
import com.issac.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);

        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    public void beforeMethod(Order order) {
        System.out.println("静态代理 before code");

        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置 dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    public void afterMethod() {
        System.out.println("静态代理 after code");
    }

}
