package com.zang.desigin.creatation.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 实现
 * @author 臧臧 on 2022/4/18
 */
@Accessors(chain = true)
@AllArgsConstructor
@Data
public class User implements Cloneable {
    public User(){
        System.out.println("User对象创建");
    }
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}