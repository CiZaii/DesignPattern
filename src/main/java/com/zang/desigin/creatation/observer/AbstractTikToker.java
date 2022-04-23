package com.zang.desigin.creatation.observer;

/**
 * @author 臧臧 on 2022/4/22
 */
public abstract class AbstractTikToker {
    //添加粉丝
    abstract void addFans(AbstractFans fans);
    //通知粉丝
    abstract void notifyFans(String msg);
}