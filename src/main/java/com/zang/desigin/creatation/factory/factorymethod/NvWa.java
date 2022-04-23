package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = null;
        factory = new BlackHumanFactory();
        WoMan woManHuman = factory.createWoManHuman();
        woManHuman.printColor();
        woManHuman.talk();
        woManHuman.sex();
        Man manHuman = factory.createManHuman();
        manHuman.printColor();
        manHuman.sex();
        manHuman.talk();

    }
}