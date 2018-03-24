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

import com.platform.entity.CmsMenuEntity;
import com.platform.service.CmsMenuService;
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
@RequestMapping("cmsmenu")
public class CmsMenuController {
    @Autowired
    private CmsMenuService cmsMenuService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("cmsmenu:list")
    @ResponseBody
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<CmsMenuEntity> cmsMenuList = cmsMenuService.queryList(query);
        int total = cmsMenuService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(cmsMenuList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }

    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("cmsmenu:info")
    @ResponseBody
    public R info(@PathVariable("id") Integer id) {
        CmsMenuEntity cmsMenu = cmsMenuService.queryObject(id);

        return R.ok().put("cmsMenu", cmsMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("cmsmenu:save")
    @ResponseBody
    public R save(@RequestBody CmsMenuEntity cmsMenu) {
        cmsMenuService.save(cmsMenu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("cmsmenu:update")
    @ResponseBody
    public R update(@RequestBody CmsMenuEntity cmsMenu) {
        cmsMenuService.update(cmsMenu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("cmsmenu:delete")
    @ResponseBody
    public R delete(@RequestBody Integer[]ids) {
        cmsMenuService.deleteBatch(ids);

        return R.ok();
    }

    /**
     * 查看所有列表
     */
    @RequestMapping("/queryAll")
    @ResponseBody
    public R queryAll(@RequestParam Map<String, Object> params) {

        List<CmsMenuEntity> list = cmsMenuService.queryList(params);

        return R.ok().put("list", list);
    }
}
