package com.zp.dps.singleton;

/**
 * @author ZP
 * @date 2021/12/10
 */
public class SingletonLazySafe {

    /**
     * volatile 有两个作用：1. 线程间的可见性 2. 防止指令重排
     * 这里是防止指令重排
     */
    private static volatile SingletonLazySafe INSTANCE;

    private SingletonLazySafe() {}

    /**
     * 1. 加syn锁,但是多个线程同时获取，会阻塞,效率太低
     * 2. 双重锁模式
     */
    public static SingletonLazySafe getInstance() {
        int a = 10;
        if(INSTANCE == null) {
            synchronized (SingletonLazySafe.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonLazySafe();
                }
            }
        }
        return INSTANCE;
    }
}
