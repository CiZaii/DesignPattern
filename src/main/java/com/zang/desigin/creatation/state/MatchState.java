package com.zang.desigin.creatation.state;

/**竞赛状态
 * @author 臧臧 on 2022/4/21
 */
public class MatchState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("全力以赴打比赛......");
    }

    //状态流转
    @Override
    public TeamState next() {
        return new VocationState();
    }
}