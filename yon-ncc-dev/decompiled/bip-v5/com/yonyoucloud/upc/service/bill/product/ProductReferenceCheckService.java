/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ObjectUtils
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyoucloud.upc.service.bill.BillFieldUpdateInfoDTO;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductReferenceCheckService {
    public void productFieldUpdateReferenceCheck(List<BillFieldUpdateInfoDTO> fieldUpdateInfos) {
        if (ObjectUtils.isNotEmpty(fieldUpdateInfos)) {
            for (BillFieldUpdateInfoDTO fieldUpdateInfo : fieldUpdateInfos) {
                this.productFieldUpdateReferenceCheck(fieldUpdateInfo);
            }
        }
    }

    public void productFieldUpdateReferenceCheck(BillFieldUpdateInfoDTO fieldUpdateInfo) {
        if (ObjectUtils.isNotEmpty((Object)fieldUpdateInfo)) {
            // empty if block
        }
    }
}

