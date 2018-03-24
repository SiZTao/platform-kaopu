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

import com.platform.entity.CmsArticleEntity;
import com.platform.service.CmsArticleService;
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
@RequestMapping("cmsarticle")
public class CmsArticleController {
    @Autowired
    private CmsArticleService cmsArticleService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("cmsarticle:list")
    @ResponseBody
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<CmsArticleEntity> cmsArticleList = cmsArticleService.queryList(query);
        int total = cmsArticleService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(cmsArticleList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }

    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("cmsarticle:info")
    @ResponseBody
    public R info(@PathVariable("id") Integer id) {
        CmsArticleEntity cmsArticle = cmsArticleService.queryObject(id);

        return R.ok().put("cmsArticle", cmsArticle);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("cmsarticle:save")
    @ResponseBody
    public R save(@RequestBody CmsArticleEntity cmsArticle) {
        cmsArticleService.save(cmsArticle);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("cmsarticle:update")
    @ResponseBody
    public R update(@RequestBody CmsArticleEntity cmsArticle) {
        cmsArticleService.update(cmsArticle);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("cmsarticle:delete")
    @ResponseBody
    public R delete(@RequestBody Integer[]ids) {
        cmsArticleService.deleteBatch(ids);

        return R.ok();
    }

    /**
     * 查看所有列表
     */
    @RequestMapping("/queryAll")
    @ResponseBody
    public R queryAll(@RequestParam Map<String, Object> params) {

        List<CmsArticleEntity> list = cmsArticleService.queryList(params);

        return R.ok().put("list", list);
    }
}
