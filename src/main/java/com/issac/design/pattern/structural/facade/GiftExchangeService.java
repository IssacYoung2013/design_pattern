package com.issac.design.pattern.structural.facade;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift) {
        if(qualifyService.isAvailable(pointsGift)) {
            // 资格校验通过
            if(pointsPaymentService.pay(pointsGift)) {
              // 如果支付积分成功
              String shippingOrderNo = shippingService.shipGift(pointsGift);
              System.out.println("物流系统下单:" + shippingOrderNo);
            }
        }
    }
}

