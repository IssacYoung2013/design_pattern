package com.issac.design.pattern.structural.facade;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() +  "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
