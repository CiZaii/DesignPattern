package com.zang.desigin.creatation.memento;

import lombok.Data;

/**
 * @author 臧臧 on 2022/4/23
 */
@Data
public class GameRecord {
    Integer id;//代表生成记录的id
    Integer coin;//剩余金币
    Integer hp;//血量
    Integer mp;//蓝量
    Integer level;//等级

}