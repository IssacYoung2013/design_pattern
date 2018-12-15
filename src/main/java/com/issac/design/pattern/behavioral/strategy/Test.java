package com.issac.design.pattern.behavioral.strategy;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LijianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanxianPromotionStrategy());
//
//        promotionActivity618.executePromotion();
//        promotionActivity1111.executePromotion();
//    }

    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "0";

        promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotion();

    }
}
