package com.zp.dps.factory;

import com.zp.dps.entity.AbstractStation;
import com.zp.dps.entity.SyStation;

/**
 * @author ZP
 * @date 2021/12/13
 */
public class SyFactory implements IFactory {

    /**
     * 创建工厂对象
     *
     * @return f
     */
    @Override
    public AbstractStation create() {
        return new SyStation();
    }
}
