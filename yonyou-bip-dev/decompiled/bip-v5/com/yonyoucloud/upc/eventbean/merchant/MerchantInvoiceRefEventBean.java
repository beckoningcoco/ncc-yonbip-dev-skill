/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantInvoiceRefEventBean")
public class MerchantInvoiceRefEventBean
implements IRefEvent {
    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        Pager pager = (Pager)result;
        if (pager == null || pager.getRecordList() == null) {
            return;
        }
        List recordList = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            if (!"aa_merchantinvoiceref".equals(refEntity.refType)) {
                return;
            }
            ArrayList<String> merchantIdList = new ArrayList<String>(recordList.size() * 2);
            for (HashMap record : recordList) {
                if (record.get("merchantId") == null) continue;
                merchantIdList.add(record.get("merchantId").toString());
            }
            if (CollectionUtils.isEmpty(merchantIdList)) {
                return;
            }
            QuerySchema schema = QuerySchema.create().addSelect("id, merchantId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false)}));
            List merchantApplyRangeList = null;
            try {
                merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_QUERY_INVOICE_ERROR, new Object[]{e.getMessage()});
            }
            HashMap<String, String> applyRangeIdMapMerchantId = null;
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                applyRangeIdMapMerchantId = new HashMap<String, String>(merchantApplyRangeList.size() * 2);
                for (Map applyRange : merchantApplyRangeList) {
                    applyRangeIdMapMerchantId.put(applyRange.get("merchantId").toString(), applyRange.get("id").toString());
                }
                for (HashMap record : recordList) {
                    record.put("merchantApplyRangeId", applyRangeIdMapMerchantId.get(record.get("merchantId").toString()));
                }
            }
        }
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}

