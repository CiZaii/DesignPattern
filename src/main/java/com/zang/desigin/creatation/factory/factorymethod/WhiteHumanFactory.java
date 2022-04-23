package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class WhiteHumanFactory extends AbstractHumanFactory{

    @Override
    public Man createManHuman() {
        return new WhiteManHuman();
    }

    @Override
    public WoMan createWoManHuman() {
        return new WhiteWoManHuman();
        }
    }
