package com.ruoyi.pos.mapper;

import com.ruoyi.pos.domain.PosProduct;

import java.util.List;


public interface PosProductMapper
{

    public List<PosProduct> selectProductList(PosProduct posProduct);


    List<PosProduct> selectCategoriesById(Long categId);
}
