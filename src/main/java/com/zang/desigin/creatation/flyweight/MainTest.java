package com.zang.desigin.creatation.flyweight;

/**
 * @author 臧臧 on 2022/4/21
 */
public class MainTest {
    public static void main(String[] args) {
        FootMassageShop shop = new FootMassageShop();
        BeautifulWaitress waitress = shop.getWaitress(1);
        waitress.service();
        System.out.println(waitress);
        BeautifulWaitress waitress1 = shop.getWaitress(3);
        waitress1.service();
        System.out.println(waitress1);
        BeautifulWaitress waitress2 = shop.getWaitress(3);
        waitress2.service();
        System.out.println(waitress2);
        shop.addWaitress(new BeautifulWaitress(5,"王五",20,true));
        BeautifulWaitress waitress3 = shop.getWaitress(6);
        waitress3.service();
        System.out.println(waitress3);
    }
}