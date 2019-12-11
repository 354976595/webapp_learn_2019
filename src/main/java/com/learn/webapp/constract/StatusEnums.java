package com.learn.webapp.constract;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.core.enums.IEnum;

public enum StatusEnums implements IEnum<Integer> {
    ENABLE("状态优良", 0),
    DESABLE("垃圾", 1);
    private String des;
    @EnumValue
    private Integer index;

    private StatusEnums(String des, int i) {
        this.des = des;
        this.index = i;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 枚举数据库存储值
     */
    @Override
    public Integer getValue() {
        return this.getIndex();
    }
}
