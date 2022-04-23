package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory factory = new WuLingRacingCarFactory();
        AbstractCar abstractCar = factory.newCar();
        abstractCar.run();
        factory = new WuLingMinCarFactory();
        abstractCar.run();


    }
}