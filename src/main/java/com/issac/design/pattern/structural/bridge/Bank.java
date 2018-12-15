package com.issac.design.pattern.structural.bridge;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

    abstract void showAccountType();
}
