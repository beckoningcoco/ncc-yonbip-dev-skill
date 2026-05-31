/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.service.UPCBillService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="pc.billApiService")
public class BillApiService
extends UPCBillService {
    @Autowired
    BizCache cache;

    @Override
    public List querytree(BillDataDto bill) throws Exception {
        return super.querytree(bill);
    }

    @Override
    public Pager queryByPage(BillDataDto bill) throws Exception {
        return super.queryByPage(bill);
    }

    @Override
    public Map getBizObject(String fullName, Long id) throws Exception {
        if (id == null || id == 0L) {
            return null;
        }
        Map data = this.cache.get(fullName, id, Map.class);
        if (data == null && (data = super.getBizObject(fullName, id)) != null) {
            this.cache.set(fullName, id, data);
        }
        return data;
    }
}

