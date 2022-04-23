package com.zang.desigin.creatation.medictor;

import java.util.ArrayList;
import java.util.List;

/**
 * 塔台
 *
 * @author 臧臧 on 2022/4/21
 */
public class ControlTower {
    private List<Captain> hardstand = new ArrayList<>();
    private ControlTower(){

    }
    private static volatile ControlTower controlTower = null;
    public static ControlTower getControlTower(){
        if (controlTower==null){
            synchronized (ControlTower.class){
                if (controlTower==null){
                    controlTower = new ControlTower();
                }
            }
        }
        return controlTower;
    }
    public boolean acceptRequest(Captain captain,String state){
        if ("fly".equals(state)){
            if (hardstand.size()<2&&!hardstand.contains(captain)){
                hardstand.add(captain);
                return true;
            }
            return false;
        }else if ("land".equals(state)){
            if(hardstand.size()<2&&hardstand.contains(captain)){
                System.out.println("还没有起飞啊");
                return false;
            }
            return false;
        }else {
            hardstand.remove(captain);
            return true;
        }

    }
}