package com.zang.desigin.creatation.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 靠它维护链表
 * @author 臧臧 on 2022/4/23
 */
public class FilterChain {
    List<Filter> filtersChain = new ArrayList<>();
    My target;

    public void setTarget(My target) {
        this.target = target;
    }

    public My getTarget() {
        return target;
    }
    //添加filter
    void addFilter(Filter filter){
        filtersChain.add(filter);
    }
}