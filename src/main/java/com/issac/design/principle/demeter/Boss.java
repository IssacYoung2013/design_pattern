package com.issac.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
