package com.zang.desigin.creatation.memento;

/**
 * @author 臧臧 on 2022/4/23
 */
public class MainTest {
    public static void main(String[] args) {
        ZangGamer zangGamer = new ZangGamer();
        zangGamer.playGame();
        //第一次保存
        zangGamer.saveGameRecord();
        zangGamer.playGame();
        zangGamer.saveGameRecord();
        zangGamer.playGame();
        zangGamer = zangGamer.getFromMemento(1);
        zangGamer.getCurrent();

    }
}