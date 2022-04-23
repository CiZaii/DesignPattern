package com.zang.desigin.creatation.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 臧臧 on 2022/4/22
 */
public class MMTikToker extends AbstractTikToker{
    List<AbstractFans> fansList = new ArrayList<>();
    void startSell(){
        System.out.println("臧臧开始直播了");
        notifyFans("亲爱的您关注的臧臧正在直播邀请你去观看");
    }
    void endSell(){
        System.out.println("臧臧结束直播了");
        notifyFans("感谢您的观看");
    }

    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    @Override
    void notifyFans(String msg) {
        fansList.forEach((f)->f.acceptMsg(msg));
    }
}