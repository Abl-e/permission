package com.tangguoxiang.dao;

import com.tangguoxiang.model.SysDept;

public interface SysDeptMapper {
    int insert(SysDept record);

    int insertSelective(SysDept record);
}