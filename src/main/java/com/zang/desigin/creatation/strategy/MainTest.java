package com.zang.desigin.creatation.strategy;

/**
 * @author 臧臧 on 2022/4/21
 */
public class MainTest {
    public static void main(String[] args) {
        TeamGNR teamGNR = new TeamGNR(new SteadyStrategy());
        teamGNR.startGame();
    }
}