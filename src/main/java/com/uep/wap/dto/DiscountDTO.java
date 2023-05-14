package com.uep.wap.dto;

public class DiscountDTO {

    private String name;
    private String desc;
    private float disc_percent;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getDisc_percent() {
        return disc_percent;
    }

    public void setDisc_percent(float disc_percent) {
        this.disc_percent = disc_percent;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
