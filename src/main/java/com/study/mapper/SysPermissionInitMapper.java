package com.study.mapper;

import com.study.model.SysPermissionInit;
import com.study.util.MyMapper;

import java.util.List;

public interface SysPermissionInitMapper extends MyMapper<SysPermissionInit> {

    @Override
    public List<SysPermissionInit> selectAll();

}