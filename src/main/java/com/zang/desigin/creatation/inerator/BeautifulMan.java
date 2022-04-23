package com.zang.desigin.creatation.inerator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 * @author 臧臧 on 2022/4/23
 */
public abstract class BeautifulMan {
    List<String> girlFriends = new ArrayList<>();

    void likeYou(String name){
        girlFriends.add(name);
    }
    void sayBye(String name){
        girlFriends.remove(name);
    }
    /**
     * 获取迭代器
     * @return 迭代器
     */
    public Itr getIterator(){
        return new Iterator(this);
    }
}