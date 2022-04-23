package com.zang.desigin.creatation.medictor;

/**
 * 湖南8778
 *
 * @author 臧臧 on 2022/4/21
 */
public class XC9527 extends Captain{
    @Override
    void fly() {
        System.out.println("XC9527请求起飞");
        if (ControlTower.getControlTower().acceptRequest(this,"fly")) {
            System.out.println("XC9527可以起飞");
        }else {
            System.out.println("XC9527不能起飞");
        }

    }

    @Override
    void land() {
        System.out.println("XC9527请求降落");
        if (ControlTower.getControlTower().acceptRequest(this,"land")) {
            System.out.println("XC9527可以降落");
        }else {
            System.out.println("XC9527不能起飞");
        }
    }

    @Override
    void success() {
        ControlTower.getControlTower().acceptRequest(this,"success");
        System.out.println("XC9527完成");
    }
}