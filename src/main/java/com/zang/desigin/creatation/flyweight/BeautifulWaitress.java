package com.zang.desigin.creatation.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 按摩小妹
 * @author 臧臧 on 2022/4/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{
    private Integer id;//员工号
    private String name;//姓名
    private Integer age;//年龄

    private boolean canService = true;//能否服务
    @Override
    void service() {
        System.out.println("开始服务");
        this.canService = !canService;
    }

    @Override
    void end() {
        System.out.println("结束服务");
        this.canService = !canService;
    }
}