package com.issac.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class CourseCatalog extends CatalogComponent {
    List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent) ;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println("目录名称：" + this.name);

        for (CatalogComponent catalogComponent :
                items) {
            if(this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("   ");
                }
            }
            catalogComponent.print();
        }
    }
}
