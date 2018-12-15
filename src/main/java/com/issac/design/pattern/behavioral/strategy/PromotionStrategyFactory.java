package com.issac.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManjianPromotionStrategory());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanxianPromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy == null ? NON_PROMOTION: promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN ="LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
