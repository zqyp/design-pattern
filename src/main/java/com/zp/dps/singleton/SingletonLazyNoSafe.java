package com.zp.dps.singleton;

/**
 * 懒汉式：指全局的单例实例在第一次被使用时构建。
 * @author ZP
 * @date 2021/12/10
 */
public class SingletonLazyNoSafe {

    private static SingletonLazyNoSafe INSTANCE;

    private SingletonLazyNoSafe() {}

    /**
     * 加syn锁,但是多个线程同时获取，会阻塞
     */
    public static SingletonLazyNoSafe getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonLazyNoSafe();
        }
        return INSTANCE;
    }
}
