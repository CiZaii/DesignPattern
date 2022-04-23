package com.zang.desigin.creatation.builder;

/**
 * @author 臧臧 on 2022/4/18
 */
public class XiaoMiBuilder extends AbstractBuilder{
    public XiaoMiBuilder(){
        phone = new Phone();
    }

    /**
     * 定制cpu
     * @param cpu cpu型号
     */
    @Override
    public AbstractBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    /**
     * 定制内存
     * @param mem 内存大小
     */
    @Override
    public AbstractBuilder customMem(String mem) {
        phone.setMem(mem);
        return this;
    }

    /**
     * 定制磁盘
     * @param disk 磁盘大小
     */
    @Override
    public AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    /**
     * 定制像素
     * @param cam 像素
     */
    @Override
    public AbstractBuilder customCam(String cam) {
        phone.setCam(cam);
        return this;
    }
}