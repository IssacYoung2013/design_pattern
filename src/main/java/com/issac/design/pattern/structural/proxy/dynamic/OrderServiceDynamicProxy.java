package com.issac.design.pattern.structural.proxy.dynamic;

import com.issac.design.pattern.structural.proxy.Order;
import com.issac.design.pattern.structural.proxy.db.DataSourceContextHolder;
import org.aspectj.weaver.ast.Or;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,argObject);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置 dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    public void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
