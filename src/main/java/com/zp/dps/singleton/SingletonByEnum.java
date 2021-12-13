package com.zp.dps.singleton;

/**
 * @author ZP
 * @date 2021/12/12
 */
public class SingletonByEnum {

    private SingletonByEnum() {}

    private enum SingletonEnum {

        /**
         * 实例
         */
        INSTANCE;

        private final SingletonByEnum instance;
        private SingletonEnum() {
            instance = new SingletonByEnum();
        }

        private SingletonByEnum getInstance() {
            return instance;
        }
    }

    public static SingletonByEnum getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

}
