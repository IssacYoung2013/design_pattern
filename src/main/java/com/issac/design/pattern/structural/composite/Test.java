package com.issac.design.pattern.structural.composite;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowCourse = new Course("windows课程",20);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);

        CatalogComponent mmallCourse = new Course("电商一期",55);
        CatalogComponent mmallCourse2 = new Course("电商二期",66);
        CatalogComponent designCourse = new Course("设计模式",77);

        javaCourseCatalog.add(mmallCourse);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designCourse);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网主目录",1);

        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();

    }
}
