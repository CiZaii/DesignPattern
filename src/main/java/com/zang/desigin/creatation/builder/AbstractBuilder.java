package com.zang.desigin.creatation.builder;

/**
 * @author 臧臧 on 2022/4/18
 */
public abstract class AbstractBuilder {
    Phone phone;
    public Phone getProduct(){
        return phone;
    }
    public abstract AbstractBuilder customCpu(String cpu);
    public abstract AbstractBuilder customMem(String mem);
    public abstract AbstractBuilder customDisk(String disk);
    public abstract AbstractBuilder customCam(String cam);
}