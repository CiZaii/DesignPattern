package com.zang.desigin.creatation.prototype;

/**
 * 测试
 *
 * @author 臧臧 on 2022/4/18
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ZangMyBatis myBatis = new ZangMyBatis();
        User user = myBatis.getUser("臧臧");
        System.out.println(user);
        user.setName("lisi");
        System.out.println(user);
        User user1 = myBatis.getUser("xiaoming");
        System.out.println(user1);
        User user2 = myBatis.getUser("臧臧");
        System.out.println(user2);
        User user3 = myBatis.getUser("臧臧");
        System.out.println(user3);
    }
}