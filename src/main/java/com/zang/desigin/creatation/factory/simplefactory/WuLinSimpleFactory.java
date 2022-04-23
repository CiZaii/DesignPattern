package com.zang.desigin.creatation.factory.simplefactory;

/**
 * 简单工厂
 * @author 臧臧 on 2022/4/18
 */
public class WuLinSimpleFactory {
    public AbstractCar newCar(String type){
        if ("van".equals(type)){
            return new VarCar();
        }else if ("mini".equals(type)){
            return new MinCar();
        }
        return null;
    }
}