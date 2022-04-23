package com.zang.desigin.creatation.bridge;

/**
 * @author 臧臧 on 2022/4/19
 */
public abstract class AbstractPhone {
    //在此桥接
    AbstractSale sale;//分离渠道
    abstract String getPhone();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }

}