package com.ruoyi.pos.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

/**
 * 商品的实体对象
 */
@Getter
@Setter
public class PosProduct extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private Integer pid;
    private String pname;
    private Float marketPrice;
    private Float shopPrice;
    private Integer inventory;
    private String image;
    private String pdesc;
    private Integer isHot;
    private Date pdate;
    private PosCategory category;


}
