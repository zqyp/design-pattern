package com.zp.dps.factory;

import com.zp.dps.entity.AbstractStation;
import com.zp.dps.entity.GzStation;

/**
 * @author ZP
 * @date 2021/12/13
 */
public class GzFactory implements IFactory {

    /**
     * 创建监测站
     *
     * @return f
     */
    @Override
    public AbstractStation create() {
        return new GzStation();
    }
}
