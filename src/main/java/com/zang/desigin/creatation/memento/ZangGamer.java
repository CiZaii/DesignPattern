package com.zang.desigin.creatation.memento;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.Data;


/**
 * 游戏者：游戏发起人
 * 当前游戏信息
 * @author 臧臧 on 2022/4/23
 */
@Data
public class ZangGamer {
    Integer coin;//剩余金币
    Integer hp;//血量
    Integer mp;//蓝量
    Integer level;//等级
    //以上是内部状态，我们需要记录保存的信息

    GameService gameService = new GameService();
    //打印当前信息
    void getCurrent(){
        System.out.println("coid:"+coin+"\t"+"hp:"+hp+"\t"+"mp:"+mp);
    }
    //保存游戏信息
    void saveGameRecord(){
        GameRecord gameRecord = new GameRecord();
        BeanUtil.copyProperties(this,gameRecord);
        gameService.add(gameRecord);
        System.out.println("正在保存当前记录");
    }
    //从备忘录获取游戏历史存档
    ZangGamer getFromMemento(Integer id){
        System.out.println("获取历史存档信息");
        ZangGamer record = gameService.getRecord(id);
        return record;
    }
    //玩游戏
    void playGame(){
        int i = RandomUtil.randomInt(1, 10000);
        System.out.println(".............(*^▽^*)............."+i);

        coin = i;
        hp = i;
        mp = i;
        level = i;
    }
    //退出游戏
    void exitGame(){
        System.out.println("退出&存档");
        saveGameRecord();
    }
}