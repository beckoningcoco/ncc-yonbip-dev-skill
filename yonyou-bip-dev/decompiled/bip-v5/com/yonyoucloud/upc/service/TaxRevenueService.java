/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.tax.TaxRevenue
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.tax.TaxRevenue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class TaxRevenueService {
    public ResultList saveTaxRevenue(List<TaxRevenue> dataList) throws Exception {
        ResultList resultList = new ResultList();
        ArrayList<Map> failInfos = new ArrayList<Map>();
        ArrayList<TaxRevenue> updateData = new ArrayList<TaxRevenue>();
        if (dataList.size() > 100) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800963);
        }
        for (TaxRevenue taxRevenue : dataList) {
            this.getTaxRevenueInDB(taxRevenue, updateData, failInfos);
        }
        if (!CollectionUtils.isEmpty(updateData)) {
            MetaDaoHelper.update((String)"pc.tax.TaxRevenue", updateData);
            resultList.setSucessCount(updateData.size());
        }
        if (!CollectionUtils.isEmpty(failInfos)) {
            resultList.addFailInfo(failInfos);
            resultList.setFailCount(failInfos.size());
        }
        return resultList;
    }

    private void getTaxRevenueInDB(TaxRevenue taxRevenue, List<TaxRevenue> updateData, List<Map> failInfos) throws Exception {
        HashMap<String, String> resultMap;
        if (null == taxRevenue.getCode()) {
            resultMap = new HashMap<String, String>();
            resultMap.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408030A", (String)"\u7a0e\u6536\u7f16\u7801\u4e0d\u80fd\u4e3a\u7a7a"));
            failInfos.add(resultMap);
        }
        if (null != this.getTaxRevenueInDB(taxRevenue.getCode())) {
            TaxRevenue updataTaxRe = new TaxRevenue();
            updataTaxRe.setId((Object)taxRevenue.getCode());
            updataTaxRe.setCode(taxRevenue.getCode());
            updataTaxRe.setSimpleName(taxRevenue.getSimpleName());
            updataTaxRe.setSimpleName2(taxRevenue.getSimpleName2());
            updataTaxRe.setSimpleName3(taxRevenue.getSimpleName3());
            updataTaxRe.setSimpleName4(taxRevenue.getSimpleName4());
            updataTaxRe.setSimpleName5(taxRevenue.getSimpleName5());
            if (null != taxRevenue.getTaxrate()) {
                updataTaxRe.setTaxrate(taxRevenue.getTaxrate());
            }
            updataTaxRe.setEntityStatus(EntityStatus.Update);
            updateData.add(updataTaxRe);
        } else {
            resultMap = new HashMap();
            resultMap.put("code", taxRevenue.getCode());
            resultMap.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408030B", (String)"\u4e0d\u5b58\u5728\u5f53\u524d\u7f16\u7801\u7684\u7a0e\u6536\u7801"));
            failInfos.add(resultMap);
        }
    }

    private String getTaxRevenueInDB(String code) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)});
        String selectField = "id";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List resultDatas = MetaDaoHelper.query((String)"pc.tax.TaxRevenue", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)resultDatas)) {
            return null;
        }
        return ((Map)resultDatas.get(0)).get("id").toString();
    }
}

