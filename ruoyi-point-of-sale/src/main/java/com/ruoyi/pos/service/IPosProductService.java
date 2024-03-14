package com.ruoyi.pos.service;

import com.ruoyi.pos.domain.PosProduct;

import java.util.List;


public interface IPosProductService
{

    public List<PosProduct> selectProductList(PosProduct posProduct);


    List<PosProduct> selectCategoriesById(Long categId);
}
