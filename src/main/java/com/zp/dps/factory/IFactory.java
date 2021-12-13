package com.zp.dps.factory;

import com.zp.dps.entity.AbstractStation;

/**
 * 工厂接口
 * @author ZP
 * @date 2021/12/13
 */
public interface IFactory {

    /**
     * 创建监测站
     * @return f
     */
    public AbstractStation create();
}
