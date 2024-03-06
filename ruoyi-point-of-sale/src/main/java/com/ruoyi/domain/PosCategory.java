package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class PosCategory extends BaseEntity   {


    private static final long serialVersionUID = 1L;

    private Integer cid;
    private String cname;
    private float discount;
    private Date privilegeTime;
    private Set<PosCategorySecond> categorySeconds = new HashSet<PosCategorySecond>();
    private PosTicket ticket;


}