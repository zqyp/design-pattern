package com.zp.dps.factory;

import com.zp.dps.entity.AbstractStation;
import com.zp.dps.entity.XaStation;

/**
 * @author ZP
 * @date 2021/12/13
 */
public class XaFactory implements IFactory {

    /**
     * 创建工厂对象
     *
     * @return f
     */
    @Override
    public AbstractStation create() {
        return new XaStation();
    }
}
