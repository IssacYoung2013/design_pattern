package com.issac.design.pattern.behavioral.strategy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
