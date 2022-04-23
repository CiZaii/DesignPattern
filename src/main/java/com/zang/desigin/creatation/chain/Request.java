package com.zang.desigin.creatation.chain;

import lombok.Data;

/**
 * @author 臧臧 on 2022/4/23
 */
@Data
public class Request {
    private String msg;
    public Request(String msg){
        this.msg = msg;
    }
}