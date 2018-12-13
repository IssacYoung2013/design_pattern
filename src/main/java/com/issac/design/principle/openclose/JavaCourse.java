package com.issac.design.principle.openclose;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class JavaCourse implements ICourse{

    private Integer Id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

//    @Override
//    public Double getDiscountPrice() {
//        return this.price * 0.8;
//    }
}
