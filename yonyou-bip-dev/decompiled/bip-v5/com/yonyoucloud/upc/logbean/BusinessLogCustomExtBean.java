/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.logbean;

import com.alibaba.fastjson.JSON;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="businessLogCustomExtBean")
public class BusinessLogCustomExtBean
implements IBusinessLogCustomExt {
    private static final Logger log = LoggerFactory.getLogger(BusinessLogCustomExtBean.class);

    public Map getCustomBusinessLogDataForMdf(BillContext billContext, BizObject bizObject) {
        try {
            HashMap<String, Object> params = new HashMap<String, Object>();
            Long productApplyRangeId = null;
            if (bizObject.get("productApplyRangeId") != null) {
                if (bizObject.get("productApplyRangeId") instanceof String) {
                    productApplyRangeId = Long.parseLong((String)bizObject.get("productApplyRangeId"));
                } else if (bizObject.get("productApplyRangeId") instanceof Long) {
                    productApplyRangeId = (Long)bizObject.get("productApplyRangeId");
                }
            }
            Boolean isCreator = (Boolean)bizObject.get("isCreator");
            Boolean isApplied = (Boolean)bizObject.get("isApplied");
            params.put("@productApplyRangeId", productApplyRangeId);
            params.put("isCreator", isCreator == null ? false : isCreator);
            params.put("isApplied", isApplied == null ? false : isApplied);
            String billnum = this.getBillNum(billContext);
            if ("aa_merchant".equals(billnum) || "aa_merchantdetail".equals(billnum)) {
                params.put("@merchantApplyRangeId", bizObject.get("merchantApplyRangeId") == null ? Integer.valueOf(0) : bizObject.get("merchantApplyRangeId"));
            }
            if ("pc_managementclass".equals(billnum)) {
                params.put("managementClassApplyRangesId", bizObject.get("managementClassApplyRangesId") == null ? Integer.valueOf(0) : bizObject.get("managementClassApplyRangesId"));
            }
            if ("aa_custcategory".equals(billnum)) {
                params.put("custCategoryApplyRangesId", bizObject.get("custCategoryApplyRangesId") == null ? Integer.valueOf(0) : bizObject.get("custCategoryApplyRangesId"));
            }
            if ("aa_salearea".equals(billnum)) {
                params.put("saleAreaApplyRangeId", bizObject.get("saleAreaApplyRangeId") == null ? Integer.valueOf(0) : bizObject.get("saleAreaApplyRangeId"));
            }
            BillDataDto bill = new BillDataDto(billnum, bizObject.getId().toString());
            bill.setMapCondition(params);
            bill.setGroupSchemaId((Long)bizObject.get("groupSchemaId"));
            Map mapString = (Map)JSON.parse((String)ResultMessage.data((Object)BillBiz.detail((BillDataDto)bill)));
            return (Map)mapString.get("data");
        }
        catch (Exception e) {
            log.info("warn : ", (Throwable)e);
            return null;
        }
    }

    private String getBillNum(BillContext billContext) {
        return StringUtils.isBlank((CharSequence)billContext.getCardKey()) ? billContext.getBillnum() : billContext.getCardKey();
    }
}

