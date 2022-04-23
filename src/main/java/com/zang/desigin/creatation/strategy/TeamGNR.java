package com.zang.desigin.creatation.strategy;

/**
 * 环境类
 * @author 臧臧 on 2022/4/21
 */
public class TeamGNR {
    private GameStrategy gameStrategy;

    public TeamGNR(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame(){
        System.out.println("游戏开始");
        //游戏策略
        gameStrategy.warStrategy();
        System.out.println("win+......");
    }
}