package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysRole;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);
}