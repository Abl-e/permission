package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysRoleUser;

public interface SysRoleUserMapper {
    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);
}