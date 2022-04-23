package com.zang.desigin.creatation.observer;

/**
 * @author 臧臧 on 2022/4/22
 */
public abstract class AbstractFans {
    abstract void acceptMsg(String msg);

    void follow(AbstractTikToker tikToker){
        tikToker.addFans(this);
    }
}