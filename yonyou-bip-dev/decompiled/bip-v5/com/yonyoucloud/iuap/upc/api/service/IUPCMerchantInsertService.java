/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import java.util.Map;

public interface IUPCMerchantInsertService {
    public void saveOrUpdate(ApiDto var1) throws Exception;

    public ResultList deleteContacters(ApiDto var1) throws Exception;

    public Map saleSyncMerchantAddress(BillDataDto var1) throws Exception;

    public ResultList merchantBusinessSave(Map var1) throws Exception;

    public ResultList merchantRelationSave(Map var1) throws Exception;
}

