package com.zang.desigin.creatation.state;

/**
 * @author 臧臧 on 2022/4/21
 */
public class MainTest {
    public static void main(String[] args) {
        SKTTeam sktTeam = new SKTTeam();
        sktTeam.setTeamState(new VocationState());
        sktTeam.startGame();
        sktTeam.next();
        sktTeam.startGame();
    }
}