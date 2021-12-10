package com.zp.dps.singleton;

/**
 * 饿汉式:指全局的单例实例在类装载时构建。
 * @author ZP
 * @date 2021/12/10
 */
public class SingletonNoLazy {

    private static final SingletonNoLazy INSTANCE = new SingletonNoLazy();

    /**
     * 静态代码块
     */
    /*static {
        INSTANCE = new Singleton();
    }*/

    // Private constructor
    // default public constructor
    private SingletonNoLazy() {};

    public synchronized static SingletonNoLazy getInstance() {
        return INSTANCE;
    }


    public static void main(String[] args) {
        SingletonNoLazy instance = SingletonNoLazy.getInstance();
        SingletonNoLazy instance1 = SingletonNoLazy.getInstance();
        System.out.println(instance == instance1);
    }
}
