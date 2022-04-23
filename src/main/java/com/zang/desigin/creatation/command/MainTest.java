package com.zang.desigin.creatation.command;

/**
 * @author 臧臧 on 2022/4/23
 */
public class MainTest {
    public static void main(String[] args) {
        BossInvoker bossInvoker = new BossInvoker();
        bossInvoker.call(new WuHanTravelCommand());
    }
}