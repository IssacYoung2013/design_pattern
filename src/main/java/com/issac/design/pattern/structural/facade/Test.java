package com.issac.design.pattern.structural.facade;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
