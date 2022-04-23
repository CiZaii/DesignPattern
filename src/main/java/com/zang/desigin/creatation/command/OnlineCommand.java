package com.zang.desigin.creatation.command;

/**
 * 上课命令实现
 * @author 臧臧 on 2022/4/23
 */
public class OnlineCommand extends Command{
    ZangReceiver zangReceiver =  new ZangReceiver();
    @Override
    void execute() {
        System.out.println("上课命令");
        zangReceiver.online();
    }
}