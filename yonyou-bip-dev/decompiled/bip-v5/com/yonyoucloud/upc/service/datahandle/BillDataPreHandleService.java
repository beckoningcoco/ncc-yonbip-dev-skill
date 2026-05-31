/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.upc.service.datahandle;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.upc.enums.BillNumAndActionEnum;

public interface BillDataPreHandleService {
    public BillNumAndActionEnum getBillNumAndActionEnum();

    public void dataPreHandle(BillDataDto var1);
}

