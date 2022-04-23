package com.zang.desigin.creatation.bridge;

/**
 * @author 臧臧 on 2022/4/19
 */
public class HWIphone extends AbstractPhone{
    @Override
    String getPhone() {
        return "HWIphone:"+sale.getSaleInfo();
    }


}