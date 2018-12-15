package com.issac.design.pattern.structural.bridge;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositeAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBanc = new ABCBank(new DepositeAccount());
        Account abcAccount = abcBanc.openAccount();
        abcAccount.showAccountType();
    }
}
