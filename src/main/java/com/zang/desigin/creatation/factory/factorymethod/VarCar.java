package com.zang.desigin.creatation.factory.factorymethod;

/**
 * 具体产品
 * @author 臧臧 on 2022/4/18
 */
public class VarCar extends AbstractCar {
    public VarCar(){
        this.engine = "单缸柴油机";
    }
    @Override
    public void run() {
        System.out.println(engine+"哒哒哒");
    }
}