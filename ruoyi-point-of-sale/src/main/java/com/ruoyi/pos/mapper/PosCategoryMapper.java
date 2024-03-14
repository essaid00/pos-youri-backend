package com.ruoyi.pos.mapper;

import com.ruoyi.pos.domain.PosCategory;
import com.ruoyi.pos.domain.PosProduct;

import java.util.List;


public interface PosCategoryMapper
{

    public List<PosCategory> selectCategoryList(PosCategory posCategory);


    PosCategory selectCategoriesById(Long categId);
}
