package com.zang.desigin.creatation.flyweight;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 足疗店：相当于享元工厂
 *          店里很多服务员
 * @author 臧臧 on 2022/4/20
 */
public class FootMassageShop {
    private static Map<Integer, BeautifulWaitress> pool = new HashMap<>();
    static {
        BeautifulWaitress waitress = new BeautifulWaitress(1, "张三", 18, true);
        BeautifulWaitress waitress1 = new BeautifulWaitress(2, "李四", 20, true);
        pool.put(waitress.getId(),waitress);
        pool.put(waitress1.getId(),waitress1);
    }

    public void addWaitress(BeautifulWaitress beautifulWaitress){
        pool.put(beautifulWaitress.getId(),beautifulWaitress);
    }
    public BeautifulWaitress getWaitress(Integer id){
        BeautifulWaitress waitress = pool.get(id);
        List<BeautifulWaitress> list = new ArrayList<>();
        if (waitress==null){
            Optional<BeautifulWaitress> any = pool.values().stream().filter(BeautifulWaitress::isCanService).findAny();
            if (any.isPresent()) {
                waitress = any.get();
            }else {
                return null;
            }
        }
        return waitress;

        //.get((int) (Math.random()*list.size()))
    }

}