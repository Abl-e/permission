package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysUser;

public interface SysUserMapper {
    int insert(SysUser record);

    int insertSelective(SysUser record);
}