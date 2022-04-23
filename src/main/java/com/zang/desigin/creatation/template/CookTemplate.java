package com.zang.desigin.creatation.template;

/**
 * @author 臧臧 on 2022/4/21
 */
public abstract class CookTemplate {
    /**
     * 定义指定顺序
     */
    public void cook(){
        heating();
        addFood();
        addSalt();
        stirFly();
        end();
    }
    //加热方式
    public void heating(){
        System.out.println("开火");
    }
    //添加食品
    public abstract void addFood();
    //放的调料
    public abstract void addSalt();
    //翻炒
    public void stirFly(){
        System.out.println("翻炒");
    }
    //出锅
    public void end(){
        System.out.println("出锅");
    }

}