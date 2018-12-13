package com.issac.design.pattern.creational.singleton;

/**
 *
 * author:  ywy
 * date:    2018-12-10
 * desc:
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
               if(lazyDoubleCheckSingleton == null) {
                   lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                   // 1. 分配内存
                   // 3. 设置lazyDoubleCheckSingleton 指向刚分配的内存
                   // 2. 初始化对象
                        // intra-thread semantics
                        // -------// 3. 设置lazyDoubleCheckSingleton 指向刚分配的内存
               }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
