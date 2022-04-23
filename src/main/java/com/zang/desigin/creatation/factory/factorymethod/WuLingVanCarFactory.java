package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class WuLingVanCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VarCar();
    }
}