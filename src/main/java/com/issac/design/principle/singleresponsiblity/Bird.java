package com.issac.design.principle.singleresponsiblity;

/**
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
