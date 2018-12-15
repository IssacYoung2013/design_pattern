package com.issac.design.pattern.behavioral.strategy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
