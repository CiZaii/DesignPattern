package com.zang.desigin.creatation.template;

/**
 * @author 臧臧 on 2022/4/21
 */
public class AutoCookMachine extends CookTemplate{
    @Override
    public void addFood() {
        System.out.println("放了西红柿和鸡蛋");
    }

    @Override
    public void addSalt() {
        System.out.println("放了盐");
    }
}