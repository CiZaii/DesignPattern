package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class WhiteHuman extends Human{
    @Override
    public void printColor() {
        System.out.println("白人");
    }
    @Override
    public void talk() {
        System.out.println("我是白人");
    }
}