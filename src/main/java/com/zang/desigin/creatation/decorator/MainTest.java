package com.zang.desigin.creatation.decorator;


/**
 * 核心:想要不改变原来接口的情况下扩展新功能，或者增强方法
 * @author 臧臧 on 2022/4/19
 */
public class MainTest {
    public static void main(String[] args) {
        ZangTikTok zangTikTok = new ZangTikTok();
        //JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(new MoviePlayer());
        MeiYanDecorator decorator = new MeiYanDecorator(zangTikTok);
        decorator.tiktok();

    }
}