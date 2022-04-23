package com.zang.desigin.creatation.prototype;

import java.util.HashMap;
import java.util.Map;


/**
 * @author 臧臧 on 2022/4/18
 */
public class ZangMyBatis {
    //缓存User
    private Map<String, User> userCache = new HashMap<>();
    /**
     * 从数据查数据
     * @return
     */
    public User getUser(String name) throws CloneNotSupportedException {
        User user = null;
        //缓存中没有
        if (!userCache.containsKey(name)){
            //从数据库查数据
            user = getUserFromDB(name);
        }else {
            user = userCache.get(name);
            //从user对象中快速获得一个克隆体
            user = (User)user.clone();
        }
        return user;
    }
    private User getUserFromDB(String name){
        System.out.println("从数据库查数据了"+name);
        User user = new User();
        user.setAge(18).setName(name);
        try {
            userCache.put(name,(User) user.clone());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return user;
    }
}