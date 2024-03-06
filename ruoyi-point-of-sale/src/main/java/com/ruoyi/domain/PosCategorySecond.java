package com.ruoyi.domain;


import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 二级分类的实体
 */

public class PosCategorySecond extends BaseEntity {




    private Integer csid;
    private String csname;
    private PosCategory category;
       private Set<PosProduct> products = new HashSet<PosProduct>();

}
