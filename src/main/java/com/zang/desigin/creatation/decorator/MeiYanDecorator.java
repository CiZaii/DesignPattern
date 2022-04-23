package com.zang.desigin.creatation.decorator;

/**
 * @author 臧臧 on 2022/4/19
 */
public class MeiYanDecorator implements TikTokDecorator{
    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        enabledMeiYan();
        manTikTok.tiktok();

    }

    @Override
    public void enabledMeiYan() {
        System.out.println("看这个美女");
    }
}