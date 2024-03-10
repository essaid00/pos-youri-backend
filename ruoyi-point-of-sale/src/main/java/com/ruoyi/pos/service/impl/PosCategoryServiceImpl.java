package com.ruoyi.pos.service.impl;

import com.ruoyi.pos.domain.PosCategory;
import com.ruoyi.pos.domain.PosProduct;
import com.ruoyi.pos.mapper.PosCategoryMapper;
import com.ruoyi.pos.mapper.PosProductMapper;
import com.ruoyi.pos.service.IPosCategoryService;
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
public class PosCategoryServiceImpl implements IPosCategoryService
{
    private static final Logger log = LoggerFactory.getLogger(PosCategoryServiceImpl.class);

    @Autowired
    private PosCategoryMapper posCategoryMapper ;




    @Override
    public List<PosCategory> selectProductList(PosCategory posCategory) {
        return posCategoryMapper.selectCategoryList(posCategory);
    }
}
