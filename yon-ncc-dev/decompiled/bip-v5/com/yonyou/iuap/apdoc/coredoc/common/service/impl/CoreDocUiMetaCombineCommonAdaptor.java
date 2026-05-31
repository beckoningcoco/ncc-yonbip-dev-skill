/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.iuap.yms.processor.ColumnProcessor
 *  com.yonyou.ucf.mdf.core.adapter.UiMetaCombineCommonAdaptor
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.apdoc.coredoc.common.service.impl;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.iuap.yms.processor.ColumnProcessor;
import com.yonyou.ucf.mdf.core.adapter.UiMetaCombineCommonAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service(value="uiMetaCombineCommonAdaptor")
public class CoreDocUiMetaCombineCommonAdaptor
extends UiMetaCombineCommonAdaptor {
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;
    private static final String SQL_SELECT_COUNT_BILL_BASE = " select count(*) as  cNumber from bill_base where cbillno= ? AND tenant_id= ? ";

    public Object getUiUsedTenantId(String billNo) {
        return this.existBillBase(billNo, Long.parseLong(InvocationInfoProxy.getYxyTenantid())) ? Long.parseLong(InvocationInfoProxy.getYxyTenantid()) : 0L;
    }

    public Boolean shouldQueryUnion(String billNo) {
        return super.shouldQueryUnion(billNo);
    }

    private boolean existBillBase(Object billNo, Object tenant_id) {
        SQLParameter sqlParameter = new SQLParameter();
        sqlParameter.addParam(billNo);
        sqlParameter.addParam(tenant_id);
        Long count = (Long)this.ymsJdbcApi.queryForObject(SQL_SELECT_COUNT_BILL_BASE, sqlParameter, (ResultSetProcessor)new ColumnProcessor());
        return count.intValue() > 0;
    }
}

