package com.zang.desigin.creatation.state;

/**
 * 抽象状态
 */
public interface TeamState {
    void playGame();
    //切换到下一个状态
    TeamState next();
}
