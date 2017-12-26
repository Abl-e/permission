package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysAclModule;

public interface SysAclModuleMapper {
    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);
}