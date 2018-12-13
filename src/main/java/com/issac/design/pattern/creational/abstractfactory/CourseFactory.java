package com.issac.design.pattern.creational.abstractfactory;


/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();

//    Object makeVideo();
}
