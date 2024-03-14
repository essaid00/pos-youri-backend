package com.ruoyi.web.controller.posofsale;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.pos.domain.PosCategory;
import com.ruoyi.pos.domain.PosProduct;
import com.ruoyi.pos.service.IPosCategoryService;
import com.ruoyi.pos.service.IPosProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/pos/category")
public class PosCategoryController extends BaseController
{
    /** service de categories */
    @Autowired
    private IPosCategoryService  posCategoryService;

    /**
     * lister tout les categories
     */
  //  @PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(PosCategory posCategory)
    {
        startPage();
        List<PosCategory> list = posCategoryService.selectProductList(posCategory);
        return getDataTable(list);
    }

    /**
     * lister tout les categories par id
     */

    @GetMapping(value = "/{categId}")
    public AjaxResult getInfo(@PathVariable Long categId)
    {

        return success(posCategoryService.selectCategoriesById(categId));
    }

}
