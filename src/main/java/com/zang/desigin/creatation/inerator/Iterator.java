package com.zang.desigin.creatation.inerator;

/**
 * @author 臧臧 on 2022/4/23
 */
public class Iterator implements Itr{
    //指针
    private int cursor = 0;
    private BeautifulMan beautifulMan;

    public Iterator(BeautifulMan beautifulMan) {
        this.beautifulMan = beautifulMan;
    }
    @Override
    public boolean hasNext() {
        return cursor!=beautifulMan.girlFriends.size();
    }

    @Override
    public String next() {
        String s = beautifulMan.girlFriends.get(cursor);
        cursor++;
        return s;
    }

    @Override
    public String firstLove() {
        return beautifulMan.girlFriends.get(0);
    }

    @Override
    public String currentLove() {
        return beautifulMan.girlFriends.get(beautifulMan.girlFriends.size()-1);
    }
}