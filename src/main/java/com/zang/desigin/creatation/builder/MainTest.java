package com.zang.desigin.creatation.builder;

/**
 * @author 臧臧 on 2022/4/18
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder= new XiaoMiBuilder();
        abstractBuilder.customCpu("晓龙999");
        abstractBuilder.customCam("50亿");
        abstractBuilder.customDisk("1T");
        abstractBuilder.customMem("16G");
        Phone product = abstractBuilder.getProduct();
        System.out.println(product);
        XiaoMiBuilder builder = new XiaoMiBuilder();
        Phone phone = builder.customCam("99亿")
                .customMem("16G")
                .customDisk("12T")
                .customCpu("晓龙1000")
                .getProduct();
        System.out.println(phone);
    }
}