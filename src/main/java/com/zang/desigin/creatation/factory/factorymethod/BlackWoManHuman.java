package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class BlackWoManHuman extends WoMan{
    @Override
    public void printColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("我是白人");
    }
}