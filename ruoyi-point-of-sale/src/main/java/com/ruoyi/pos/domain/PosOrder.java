package com.ruoyi.pos.domain;

import com.ruoyi.common.core.domain.BaseEntity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class PosOrder extends BaseEntity {

    private Integer oid;
    private Float total;
    private Date ordertime;
    private Integer state;// 1:未付款   2:订单已经付款   3:已经发货   4:订单结束
    private String name;
    private String phone;
    private String addr;


     private Set<PosOrderItem> orderItems = new HashSet<PosOrderItem>();


}
