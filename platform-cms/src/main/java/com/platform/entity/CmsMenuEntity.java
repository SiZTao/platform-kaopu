package com.platform.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 实体
 * 表名 cms_menu
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
public class CmsMenuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //
    private String name;
    //
    private String menu;
    //
    private String href;
    //
    private Integer status;

    /**
     * 设置：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置：
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    /**
     * 获取：
     */
    public String getMenu() {
        return menu;
    }
    /**
     * 设置：
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取：
     */
    public String getHref() {
        return href;
    }
    /**
     * 设置：
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：
     */
    public Integer getStatus() {
        return status;
    }
}
