package com.ruoyi.pos.domain;


import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * Created by Joryun on 2016/11/30.
 */


public class PosTicket extends BaseEntity {

    private Integer tid;
    private Float privilege;
    private Float consume;
    private Date useTime;


     private PosCategory category;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Float getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Float privilege) {
        this.privilege = privilege;
    }

    public Float getConsume() {
        return consume;
    }

    public void setConsume(Float consume) {
        this.consume = consume;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public PosCategory getCategory() {
        return category;
    }

    public void setCategory(PosCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", privilege=" + privilege +
                ", consume=" + consume +
                ", useTime=" + useTime +
                ", category=" + category +
                '}';
    }
}
