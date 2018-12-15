package com.issac.design.pattern.behavioral.strategy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class ManjianPromotionStrategory implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20");
    }
}
