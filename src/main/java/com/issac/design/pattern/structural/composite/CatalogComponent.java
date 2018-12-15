package com.issac.design.pattern.structural.composite;

import sun.tools.tree.DoubleExpression;

/**
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void  print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
