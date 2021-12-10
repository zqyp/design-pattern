package com.zp.dps.singleton;

/**
 * 静态内部类
 * @author ZP
 * @date 2021/12/10
 */
public class SingletonLazySafe2 {

    static class SingletonHolder {
        private static final SingletonLazySafe2 INSTANCE = new SingletonLazySafe2();
    }

    public static SingletonLazySafe2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
