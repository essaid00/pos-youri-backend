package com.ruoyi.pos.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@ToString
public class PosCategory extends BaseEntity   {


    private static final long serialVersionUID = 1L;

    private Integer cid;
    private String cname;
    private float discount;
    private Date privilegeTime;
    private String image;

}