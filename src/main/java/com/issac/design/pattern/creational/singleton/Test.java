package com.issac.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * author:  ywy
 * date:    2018-12-10
 * desc:
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

//        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        EnumInstance newInstance = (EnumInstance)ois.readObject();
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

//        Class objectClass = HungrySingleton.class;
//        Class.forName(HungrySingleton.class.getName());
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;
          Class objectClass = EnumInstance.class;

//
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumInstance instance = (EnumInstance)constructor.newInstance("issac",29);
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();
//        EnumInstance.INSTANCE.printTest();
//
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton)constructor.newInstance();

//        LazySingleton newInstance = (LazySingleton)constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

    }
}
