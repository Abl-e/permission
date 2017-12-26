package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysRoleAcl;

public interface SysRoleAclMapper {
    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);
}