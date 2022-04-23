package com.zang.desigin.creatation.flyweight;

/**
 * @author 臧臧 on 2022/4/20
 */
public abstract class AbstractWaitressFlyweight {
    /**
     * 正在服务。 享元的不可共享属性留给外部进行改变的接口
     */
    abstract void service();
    /**
     * 服务完成。 享元的不可共享属性留给外部进行改变的接口
     */
    abstract void end();
}