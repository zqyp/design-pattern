package com.zp.dps.factory;

import com.zp.dps.entity.AbstractStation;
import com.zp.dps.entity.SyStation;
import com.zp.dps.entity.WhStation;
import com.zp.dps.entity.XaStation;

/**
 * @author ZP
 * @date 2021/12/13
 */
public class SimpleStationFactory {

    private static final int XA = 1;
    private static final int SY = 2;
    private static final int WH = 3;


    public static AbstractStation createStation(int type) {
        switch (type) {
            case XA:
                return new XaStation();
            case SY:
                return new SyStation();
            case WH:
                return new WhStation();
            default:
                throw new RuntimeException("类型不匹配");
        }
    }


    /**
     * 反射
     * @param clz
     * @param <T>
     * @return
     */
    @SuppressWarnings("all")
    public static <T extends AbstractStation> T creatStationByRef(Class clz) {
        T res = null;
        try {
            res = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //以下是多方法工厂

    public static AbstractStation createXa() {
        return new XaStation();
    }

    public static AbstractStation createSy() {
        return new SyStation();
    }

    public static AbstractStation createWh() {
        return new WhStation();
    }
}
