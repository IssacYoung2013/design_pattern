package com.issac.design.pattern.structural.facade;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {

        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");

        return true;
    }
}
