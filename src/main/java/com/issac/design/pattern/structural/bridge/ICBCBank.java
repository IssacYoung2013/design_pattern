package com.issac.design.pattern.structural.bridge;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }

    @Override
    void showAccountType() {

    }
}
