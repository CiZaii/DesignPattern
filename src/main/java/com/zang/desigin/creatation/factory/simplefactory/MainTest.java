package com.zang.desigin.creatation.factory.simplefactory;

/**
 * @author 臧臧 on 2022/4/18
 */
public class MainTest {
    public static void main(String[] args) {
        WuLinSimpleFactory factory = new WuLinSimpleFactory();
        AbstractCar van = factory.newCar("van");
        AbstractCar mini = factory.newCar("mini");
        AbstractCar zz = factory.newCar("zz");
        System.out.println(van);
        System.out.println(mini);
        System.out.println(zz);
    }
}