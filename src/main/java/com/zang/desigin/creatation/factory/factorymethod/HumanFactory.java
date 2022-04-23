package com.zang.desigin.creatation.factory.factorymethod;

/**
 * @author 臧臧 on 2022/4/18
 */
public class HumanFactory {
    public Human createHuman(String color){
        if ("white".equals(color)){
            return  new WhiteHuman();
        }else if ("black".equals(color)){
            return new BlackManHuman();
        }else {
            return null;
        }
    }
}