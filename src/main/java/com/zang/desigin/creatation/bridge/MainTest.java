package com.zang.desigin.creatation.bridge;

/**
 * @author 臧臧 on 2022/4/19
 */
public class MainTest {
    public static void main(String[] args) {
        HWIphone hwIphone = new HWIphone();
        hwIphone.setSale(new OfflineSale("线下",9999));
        String phone = hwIphone.getPhone();
        System.out.println(phone);
    }
}