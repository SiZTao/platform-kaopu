package com.platform.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 实体
 * 表名 cms_category
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
public class CmsCategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //栏目名称
    private String name;
    //链接
    private String href;
    //
    private Integer isShow;
    //
    private Integer status;
    //
    private String remark;
    //
    private Long createUserId;
    //
    private Date createTime;
    //
    private Long totalnum;
    //
    private Integer parentId;

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
     * 设置：栏目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：栏目名称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：链接
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取：链接
     */
    public String getHref() {
        return href;
    }
    /**
     * 设置：
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取：
     */
    public Integer getIsShow() {
        return isShow;
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
    /**
     * 设置：
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 设置：
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取：
     */
    public Long getCreateUserId() {
        return createUserId;
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
    public void setTotalnum(Long totalnum) {
        this.totalnum = totalnum;
    }

    /**
     * 获取：
     */
    public Long getTotalnum() {
        return totalnum;
    }
    /**
     * 设置：
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取：
     */
    public Integer getParentId() {
        return parentId;
    }
}
