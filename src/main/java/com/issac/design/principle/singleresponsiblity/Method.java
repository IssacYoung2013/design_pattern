package com.issac.design.principle.singleresponsiblity;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Method {
    public void updateUserInfo(String userName,String address) {
        userName = "issac";
        address = "hangzhou";
    }

    public void updateUserInfo(String userName,String... properties) {
        userName = "issac";
//        address = "hangzhou";
    }

    public void updateUsername(String userName) {
        userName = "issac";
    }

    public void updateAddress(String address) {
        address = "hangzhou";
    }

    public void updateUserInfo(String userName,String address,boolean bool) {
        if(bool) {
            //todo something1

        } else  {
            //todo something2
        }
        userName = "issac";
        address = "hangzhou";
    }
}
