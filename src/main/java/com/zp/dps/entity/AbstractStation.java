package com.zp.dps.entity;

/**
 * @author ZP
 * @date 2021/12/13
 */
public abstract class AbstractStation {

    /**
     * 发工况
     * @param aimIp ip
     * @param aimPort port
     */
    public abstract void sendWorkCondition(String aimIp, Integer aimPort);
}
