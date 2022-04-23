package com.zang.desigin.creatation.state;

/**
 * 休闲状态
 * @author 臧臧 on 2022/4/21
 */
public class VocationState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("三亚旅游真舒服....饿了...不打游戏");
    }

    @Override
    public TeamState next() {
        return new BeefNoodleState();
    }
}