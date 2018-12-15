package com.issac.design.pattern.structural.proxy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
