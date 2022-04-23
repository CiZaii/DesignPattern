package com.zang.desigin.creatation.factory.factorymethod;

public class BlackManHuman extends Man {
    @Override
    public void printColor() {
        System.out.println("黑色");
    }
    @Override
    public void talk() {
        System.out.println("我是黑人");
    }
}