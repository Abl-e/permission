package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysAcl;

public interface SysAclMapper {
    int insert(SysAcl record);

    int insertSelective(SysAcl record);
}