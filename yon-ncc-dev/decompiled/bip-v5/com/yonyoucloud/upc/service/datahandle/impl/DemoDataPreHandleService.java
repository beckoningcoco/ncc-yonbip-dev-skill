/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyoucloud.upc.utils.BillDataDtoDataHandleUtil
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.datahandle.impl;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.upc.enums.BillNumAndActionEnum;
import com.yonyoucloud.upc.service.datahandle.BillDataPreHandleService;
import com.yonyoucloud.upc.utils.BillDataDtoDataHandleUtil;
import java.util.List;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoDataPreHandleService
implements BillDataPreHandleService {
    private static final Logger logger = LoggerFactory.getLogger(DemoDataPreHandleService.class);

    @Override
    public BillNumAndActionEnum getBillNumAndActionEnum() {
        return BillNumAndActionEnum.PRODUCT_SAVE;
    }

    @Override
    public void dataPreHandle(BillDataDto bill) {
        try {
            List bizObjects = BillDataDtoDataHandleUtil.dataHandle((BillDataDto)bill);
            for (BizObject bizObject : bizObjects) {
            }
        }
        catch (Exception e) {
            logger.error(e.getMessage(), (Throwable)e);
        }
    }
}

