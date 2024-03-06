package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;


import java.util.Date;

/**
 * 商品的实体对象
 */

public class PosProduct extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private Integer pid;
    private String pname;
    private Float market_price;
    private Float shop_price;
    private Integer inventory;
    private String image;
    private String pdesc;
    private Integer is_hot;
    private Date pdate;

    private PosCategorySecond categorySecond;


}
