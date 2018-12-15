package com.issac.design.pattern.structural.proxy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
