package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class RacingCar extends AbstractCar{
    public RacingCar(){
        this.engine = "V8";
    }
    @Override
    public void run() {
        System.out.println(engine+"chuachuachua");
    }
}