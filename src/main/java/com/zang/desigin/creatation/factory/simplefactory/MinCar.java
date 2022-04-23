package com.zang.desigin.creatation.factory.simplefactory;

/**
 * @author 臧臧 on 2022/4/18
 */
public class MinCar extends AbstractCar{
    public MinCar(){
        this.engine = "四缸水平对置";
    }
    @Override
    public void run() {
        System.out.println(engine+"嘟嘟嘟");
    }
}