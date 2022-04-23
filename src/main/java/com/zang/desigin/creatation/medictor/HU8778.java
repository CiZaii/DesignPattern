package com.zang.desigin.creatation.medictor;

/**
 * 湖南8778
 *
 * @author 臧臧 on 2022/4/21
 */
public class HU8778 extends Captain{
    @Override
    void fly() {
        System.out.println("HU8778请求起飞");
        if (ControlTower.getControlTower().acceptRequest(this,"fly")) {
            System.out.println("HU8778可以起飞");
        }else {
            System.out.println("HU8778不能起飞");
        }
    }

    @Override
    void land() {
        System.out.println("HU8778请求降落");
        if (ControlTower.getControlTower().acceptRequest(this,"land")) {
            System.out.println("HU8778可以降落");
        }else {
            System.out.println("XC9527不能起飞");
        }
    }

    @Override
    void success() {
        ControlTower.getControlTower().acceptRequest(this,"success");
        System.out.println("HU8778完成");
    }
}