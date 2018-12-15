package com.issac.design.pattern.structural.bridge;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class DepositeAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositeAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
