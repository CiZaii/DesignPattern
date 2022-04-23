package com.zang.desigin.creatation.inerator;

public interface Itr {
    /**
     * 是否有下一个
     * @return true 有/false 没有
     */
    boolean hasNext();

    /**
     * 返回下一个
     * @return 下一任女友
     */
    String next();

    /**
     * 返回初恋
     * @return 初恋
     */
    String firstLove();

    /**
     * 返回现任
     * @return 现任
     */
    String currentLove();
}
