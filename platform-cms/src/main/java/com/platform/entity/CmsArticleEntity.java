package com.platform.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 实体
 * 表名 cms_article
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
public class CmsArticleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //
    private String title;
    //
    private String banner;
    //
    private Integer categoryId;
    //
    private Integer userId;
    //
    private Date createTime;
    //
    private Date updateTime;
    //
    private String author;
    //
    private String contend;
    //
    private Integer likenum;
    //
    private Integer readnum;
    //原文链接
    private String fromurl;
    //类型 1 原创 2 转载
    private Integer type;
    //
    private Integer menuId;
    //
    private String categoryName;

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
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取：
     */
    public String getTitle() {
        return title;
    }
    /**
     * 设置：
     */
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * 获取：
     */
    public String getBanner() {
        return banner;
    }
    /**
     * 设置：
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取：
     */
    public Integer getCategoryId() {
        return categoryId;
    }
    /**
     * 设置：
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取：
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * 设置：
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * 设置：
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：
     */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
     * 设置：
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取：
     */
    public String getAuthor() {
        return author;
    }
    /**
     * 设置：
     */
    public void setContend(String contend) {
        this.contend = contend;
    }

    /**
     * 获取：
     */
    public String getContend() {
        return contend;
    }
    /**
     * 设置：
     */
    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    /**
     * 获取：
     */
    public Integer getLikenum() {
        return likenum;
    }
    /**
     * 设置：
     */
    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    /**
     * 获取：
     */
    public Integer getReadnum() {
        return readnum;
    }
    /**
     * 设置：原文链接
     */
    public void setFromurl(String fromurl) {
        this.fromurl = fromurl;
    }

    /**
     * 获取：原文链接
     */
    public String getFromurl() {
        return fromurl;
    }
    /**
     * 设置：类型 1 原创 2 转载
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取：类型 1 原创 2 转载
     */
    public Integer getType() {
        return type;
    }
    /**
     * 设置：
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取：
     */
    public Integer getMenuId() {
        return menuId;
    }
    /**
     * 设置：
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取：
     */
    public String getCategoryName() {
        return categoryName;
    }
}
