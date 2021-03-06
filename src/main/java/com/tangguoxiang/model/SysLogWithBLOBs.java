package com.tangguoxiang.model;

import java.util.Date;

public class SysLogWithBLOBs extends SysLog {
    private String oldValue;

    private String newValue;

    public SysLogWithBLOBs(Integer id, Integer type, Integer targetId, String operator, Date operatorTime, String operatorIp, Integer status, String oldValue, String newValue) {
        super(id, type, targetId, operator, operatorTime, operatorIp, status);
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public SysLogWithBLOBs() {
        super();
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }
}