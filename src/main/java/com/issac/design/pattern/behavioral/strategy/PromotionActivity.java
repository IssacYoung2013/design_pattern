package com.issac.design.pattern.behavioral.strategy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion() {
        this.promotionStrategy.doPromotion();
    }
}
