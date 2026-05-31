/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery;

import com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryConditionDetail;
import java.util.List;

public class FreedomQueryCondition {
    private Integer pageIndex;
    private Integer pageSize;
    private String[] fields;
    List<FreedomQueryConditionDetail> qryDTOList;

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setQryDTOList(List<FreedomQueryConditionDetail> qryDTOList) {
        this.qryDTOList = qryDTOList;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String[] getFields() {
        return this.fields;
    }

    public List<FreedomQueryConditionDetail> getQryDTOList() {
        return this.qryDTOList;
    }
}

