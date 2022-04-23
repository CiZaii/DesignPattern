package com.zang.desigin.creatation.state;

/**
 * 环境类
 *
 * @author 臧臧 on 2022/4/21
 */
public class SKTTeam {

    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    public void startGame(){
        //状态不同会导致不同的游戏结果
        teamState.playGame();
    }
    public void next(){
       teamState =  teamState.next();
    }
}