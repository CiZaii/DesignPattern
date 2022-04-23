package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public abstract class Man extends Human{
    @Override
    public abstract void printColor();

    @Override
    public abstract void talk();
    public void sex(){
        System.out.println("我是男人");
    }
}