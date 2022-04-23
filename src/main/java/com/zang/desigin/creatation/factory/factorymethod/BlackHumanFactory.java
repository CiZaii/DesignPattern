package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Man createManHuman() {
        return new BlackManHuman();
    }

    @Override
    public WoMan createWoManHuman() {
        return new BlackWoManHuman();
    }
}