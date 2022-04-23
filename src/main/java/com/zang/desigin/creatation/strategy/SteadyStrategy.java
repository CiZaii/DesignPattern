package com.zang.desigin.creatation.strategy;

import javax.sound.midi.Soundbank;

/**
 * @author 臧臧 on 2022/4/21
 */
public class SteadyStrategy implements GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("各路小心....及时支援");
    }
}