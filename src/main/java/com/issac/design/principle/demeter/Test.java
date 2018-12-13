package com.issac.design.principle.demeter;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
