package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysRoleUser;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}