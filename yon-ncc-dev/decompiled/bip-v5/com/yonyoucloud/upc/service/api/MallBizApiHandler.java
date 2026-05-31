/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.service.api.BaseBizApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mall-biz")
public class MallBizApiHandler
extends BaseBizApiHandler {
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;

    public Object test(BillDataDto dto) {
        return dto;
    }

    public ResultList save(BillDataDto dto) throws Exception {
        return this.upcBillService.batchSave(dto);
    }

    public ResultList saveProudctClass(BillDataDto dto) throws Exception {
        return this.upcBillService.batchSave(dto);
    }
}

