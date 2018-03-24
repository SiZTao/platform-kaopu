package com.platform.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.platform.entity.CmsCategoryEntity;
import com.platform.service.CmsCategoryService;
import com.platform.utils.PageUtils;
import com.platform.utils.Query;
import com.platform.utils.R;

/**
 * Controller
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
@Controller
@RequestMapping("cmscategory")
public class CmsCategoryController {
    @Autowired
    private CmsCategoryService cmsCategoryService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("cmscategory:list")
    @ResponseBody
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<CmsCategoryEntity> cmsCategoryList = cmsCategoryService.queryList(query);
        int total = cmsCategoryService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(cmsCategoryList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }

    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("cmscategory:info")
    @ResponseBody
    public R info(@PathVariable("id") Integer id) {
        CmsCategoryEntity cmsCategory = cmsCategoryService.queryObject(id);

        return R.ok().put("cmsCategory", cmsCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("cmscategory:save")
    @ResponseBody
    public R save(@RequestBody CmsCategoryEntity cmsCategory) {
        cmsCategoryService.save(cmsCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("cmscategory:update")
    @ResponseBody
    public R update(@RequestBody CmsCategoryEntity cmsCategory) {
        cmsCategoryService.update(cmsCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("cmscategory:delete")
    @ResponseBody
    public R delete(@RequestBody Integer[]ids) {
        cmsCategoryService.deleteBatch(ids);

        return R.ok();
    }

    /**
     * 查看所有列表
     */
    @RequestMapping("/queryAll")
    @ResponseBody
    public R queryAll(@RequestParam Map<String, Object> params) {

        List<CmsCategoryEntity> list = cmsCategoryService.queryList(params);

        return R.ok().put("list", list);
    }
}
