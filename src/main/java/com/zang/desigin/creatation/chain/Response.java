package com.zang.desigin.creatation.chain;

import lombok.Data;

/**
 * @author 臧臧 on 2022/4/23
 */
@Data
public class Response {
    private String content;

    public Response(String content) {
        this.content = content;
    }
}