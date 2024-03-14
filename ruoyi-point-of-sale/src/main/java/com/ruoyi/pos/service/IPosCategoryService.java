package com.ruoyi.pos.service;

import com.ruoyi.pos.domain.PosCategory;
import com.ruoyi.pos.domain.PosProduct;

import java.util.List;


public interface IPosCategoryService
{

    public List<PosCategory> selectProductList(PosCategory posCategory);


    PosCategory selectCategoriesById(Long deptId);
}
