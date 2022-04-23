package com.zang.desigin.creatation.command;

/**
 * 命令调用者
 * @author 臧臧 on 2022/4/23
 */
public  class BossInvoker{
    Command command;
    public void call(Command command){
        command.execute();
    }
}