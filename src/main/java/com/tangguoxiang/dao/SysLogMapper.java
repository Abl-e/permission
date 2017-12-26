package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysLogWithBLOBs;

public interface SysLogMapper {
    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);
}