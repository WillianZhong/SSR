package com.study.service.impl;

import com.study.mapper.SysPermissionInitMapper;
import com.study.model.SysPermissionInit;
import com.study.service.SysPermissionInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @ClassName: $TYPE_NAME$
 * @Description: url过滤
 * @author: gzlx
 * @date: 2018-11-07 11:19
 * @Version: 1.0
 */
@Service
public class SysPermissionInitServiceImpl implements SysPermissionInitService {

    @Autowired
    private SysPermissionInitMapper sysPermissionInitMapper;


    @Override
    public List<SysPermissionInit> selectAll() {
        return sysPermissionInitMapper.selectAll();
    }
}
