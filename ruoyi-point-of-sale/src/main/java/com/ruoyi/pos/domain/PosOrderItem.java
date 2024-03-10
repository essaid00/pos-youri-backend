package com.ruoyi.pos.domain;

import com.ruoyi.common.core.domain.BaseEntity;




public class PosOrderItem extends BaseEntity {

    private Integer itemid;

    private Integer count;

    private Float subtotal;


    private PosProduct product;


}
