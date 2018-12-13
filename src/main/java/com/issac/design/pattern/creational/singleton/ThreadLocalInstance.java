package com.issac.design.pattern.creational.singleton;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class ThreadLocalInstance {
    public static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>() {

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
