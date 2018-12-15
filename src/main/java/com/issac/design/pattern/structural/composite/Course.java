package com.issac.design.pattern.structural.composite;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称：" + this.name + ",课程价格:" + this.price);
    }
}
