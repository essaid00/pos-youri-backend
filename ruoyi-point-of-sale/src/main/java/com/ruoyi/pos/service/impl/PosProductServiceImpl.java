package com.ruoyi.pos.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.pos.domain.PosProduct;
import com.ruoyi.pos.mapper.PosProductMapper;
import com.ruoyi.pos.service.IPosProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */
@Service
public class PosProductServiceImpl implements IPosProductService
{
    private static final Logger log = LoggerFactory.getLogger(PosProductServiceImpl.class);

    @Autowired
    private PosProductMapper posProductMapper;




    @Override
    public List<PosProduct> selectProductList(PosProduct posProduct) {
        return posProductMapper.selectProductList(posProduct);
    }

    @Override
    public List<PosProduct> selectCategoriesById(Long categId) {
        return posProductMapper.selectCategoriesById(categId);
    }
}
