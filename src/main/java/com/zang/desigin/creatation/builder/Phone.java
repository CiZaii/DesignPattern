package com.zang.desigin.creatation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 臧臧 on 2022/4/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String cpu;
    private String mem;
    private String disk;
    private String cam;
}