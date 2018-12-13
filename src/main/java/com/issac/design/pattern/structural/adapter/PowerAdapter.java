package com.issac.design.pattern.structural.adapter;

/**
 *
 * author:  ywy
 * date:    2018-12-13
 * desc:
 */
public class PowerAdapter implements  DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int output5V() {

        int adapterInput = ac220.outputAC220V();

        // 变压器
        int adapterOutput =  adapterInput / 44;

        System.out.println("使用PowerAdapter 输入AC：" + adapterInput + ",输出：" + adapterOutput);
        
        return adapterOutput;
    }
}
