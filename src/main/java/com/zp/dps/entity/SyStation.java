package com.zp.dps.entity;

/**
 * @author ZP
 * @date 2021/12/13
 */
public class SyStation extends AbstractStation {


    /**
     * 发工况
     *
     * @param aimIp   ip
     * @param aimPort port
     */
    @Override
    public void sendWorkCondition(String aimIp, Integer aimPort) {
        System.out.println("sy发送工况");
    }
}
