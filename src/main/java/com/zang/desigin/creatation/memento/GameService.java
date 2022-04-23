package com.zang.desigin.creatation.memento;

import cn.hutool.core.bean.BeanUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 游戏服务器
 * 管理者
 * @author 臧臧 on 2022/4/23
 */
public class GameService {
    //管理备忘录信息的
    Map<Integer,GameRecord> records = new HashMap<>();
    int i = 1;
    /**
     * 添加一个存档
     * @param gameRecord 要添加的存档
     */
    void add(GameRecord gameRecord){
        gameRecord.id = i++;
        records.put(gameRecord.id,gameRecord);
    }

    /**
     * 根据存档信息id获得存档信息
     * @param id 存档信息id
     * @return 对应存档
     */
    ZangGamer getRecord(Integer id){
        GameRecord gameRecord = records.get(id);
        ZangGamer zangGamer = new ZangGamer();
        BeanUtil.copyProperties(gameRecord,zangGamer,"id");
        return zangGamer;
    }
}