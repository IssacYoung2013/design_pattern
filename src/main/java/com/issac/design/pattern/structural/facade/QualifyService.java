package com.issac.design.pattern.structural.facade;

/**
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过！");
        return true;
    }
}
