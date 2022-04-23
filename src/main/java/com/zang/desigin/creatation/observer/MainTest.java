package com.zang.desigin.creatation.observer;

/**
 * @author 臧臧 on 2022/4/22
 */
public class MainTest {
    public static void main(String[] args) {
        MMTikToker mmTikToker = new MMTikToker();
        RobotFans robotFans = new RobotFans();
        robotFans.follow(mmTikToker);
        HumanFans humanFans = new HumanFans();
        humanFans.follow(mmTikToker);
        mmTikToker.startSell();
        System.out.println("----------------------------");
        mmTikToker.endSell();
    }
}