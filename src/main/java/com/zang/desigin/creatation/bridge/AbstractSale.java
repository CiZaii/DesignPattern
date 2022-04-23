package com.zang.desigin.creatation.bridge;

/**
 * @author 臧臧 on 2022/4/19
 */
public abstract class AbstractSale {
    private String type;
    private Integer price;
    public AbstractSale(String type,Integer price){
        this.type = type;
        this.price = price;
    }

    String getSaleInfo(){
        return "渠道"+type+"价格"+price;
    }
}