package com.zang.desigin.creatation.command;

/**
 * 武汉出差的实现
 * @author 臧臧 on 2022/4/23
 */
public class WuHanTravelCommand extends Command{
    ZangReceiver zangReceiver =  new ZangReceiver();
    @Override
    void execute() {
        System.out.println("去出差的命令");
        zangReceiver.travel();
    }
}