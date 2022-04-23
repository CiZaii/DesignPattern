package com.zang.desigin.creatation.state;

/**
 * 无敌牛肉面状态
 * @author 臧臧 on 2022/4/21
 */
public class BeefNoodleState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("老板来一碗牛肉面......，闹肚子输游戏了");
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}