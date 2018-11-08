package com.study.model;

import javax.persistence.*;

@Table(name = "sys_permission_init")
public class SysPermissionInit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 需要具备的权限
     */
    @Column(name = "permission_init")
    private String permissionInit;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取需要具备的权限
     *
     * @return permission_init - 需要具备的权限
     */
    public String getPermissionInit() {
        return permissionInit;
    }

    /**
     * 设置需要具备的权限
     *
     * @param permissionInit 需要具备的权限
     */
    public void setPermissionInit(String permissionInit) {
        this.permissionInit = permissionInit;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}