package com.zang.desigin.creatation.inerator;

/**
 * @author 臧臧 on 2022/4/23
 */
public class MainTest {
    public static void main(String[] args) {
        ZangfulMan zangfulMan = new ZangfulMan();
        zangfulMan.likeYou("张三");
        zangfulMan.likeYou("赵四");
        zangfulMan.likeYou("王五");
        Itr iterator = zangfulMan.getIterator();
        System.out.println(iterator.firstLove());
        System.out.println(iterator.currentLove());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}