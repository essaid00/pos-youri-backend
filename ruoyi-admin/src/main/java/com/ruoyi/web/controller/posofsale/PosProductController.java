package com.ruoyi.web.controller.posofsale;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.pos.domain.PosProduct;
import com.ruoyi.pos.service.IPosProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/pos/product")
public class PosProductController extends BaseController
{
    /** 系统基础配置 */
    @Autowired
    private IPosProductService posProductService;

    /**
     * 访问首页，提示语
     */
  //  @PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(PosProduct posProduct)
    {
        startPage();
        List<PosProduct> list = posProductService.selectProductList(posProduct);
        return getDataTable(list);
    }
    /**
     * lister tout les produits  par idcategories
     */

    @GetMapping(value = "/{categId}")
    public AjaxResult getInfo(@PathVariable Long categId)
    {

        return success(posProductService.selectCategoriesById(categId));
    }

}
