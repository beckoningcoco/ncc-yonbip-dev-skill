/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IRefApi
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.service.MddExtRefApiService
 *  com.yonyou.ypd.bill.utils.IrisRpcUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.api.interfaces.rpc.IRefApi;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.service.MddExtRefApiService;
import com.yonyou.ypd.bill.utils.IrisRpcUtil;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="coreDocMddExtRefApiService")
public class CoreDocMddExtRefApiService
extends MddExtRefApiService {
    private static final Logger logger = LoggerFactory.getLogger(CoreDocMddExtRefApiService.class);

    public Object getRefData(BillContext billContext, Object refEntity, Map<String, Object> refpara) throws Exception {
        RefEntity refModel;
        String code;
        if (refEntity instanceof RefEntity && ("pc_taxrevenueref".equals(code = (refModel = (RefEntity)refEntity).getCode()) || "pc_taxrevenuepolicyref".equals(code))) {
            logger.error("[TaxRevenueRef forward] CoreDocMddExtRefApiService#getRefData params - billContext:{}\uff0crefEntity:{}\uff0crefpara:{}", new Object[]{billContext, refEntity, refpara});
            IRefApi refAPI = (IRefApi)IrisRpcUtil.getIrisReference((String)"yonbip-fi-taxpubdoc", IRefApi.class);
            if (refAPI != null) {
                return refAPI.getRefData(billContext, refEntity, refpara);
            }
        }
        return super.getRefData(billContext, refEntity, refpara);
    }
}

