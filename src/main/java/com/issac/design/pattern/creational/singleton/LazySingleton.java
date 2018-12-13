package com.issac.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * author:  ywy
 * date:    2018-12-10
 * desc:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    // static synchronized 锁的是this对象
    // synchronized 堆内存生成锁
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static  LazySingleton getInstance() {
//        synchronized (LazySingleton.class) {
//            if(lazySingleton == null) {
//                lazySingleton = new LazySingleton();
//            }
//            return lazySingleton;
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        
        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1,true);
        LazySingleton o2 = (LazySingleton) constructor.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }

}
