package com.zang.desigin.creatation.observer;

/**
 * @author 臧臧 on 2022/4/22
 */
public class RobotFans extends AbstractFans{
    @Override
    void acceptMsg(String msg) {
        System.out.println("呸........");
    }
}