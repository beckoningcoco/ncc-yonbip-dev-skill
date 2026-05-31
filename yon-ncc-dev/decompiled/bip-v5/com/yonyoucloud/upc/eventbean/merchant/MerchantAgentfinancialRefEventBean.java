/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.MerchantCommonRefUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantAgentfinancialRefEventBean")
public class MerchantAgentfinancialRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(MerchantAgentfinancialRefEventBean.class);
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        FilterVO gridFilter = (FilterVO)refpara.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
        Pager pager = (Pager)result;
        if (pager == null || pager.getRecordList() == null) {
            return;
        }
        List recordList = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            if (!"aa_merchantagentfinancialref".equals(refEntity.refType)) {
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
                log.error("\u5ba2\u6237\u94f6\u884c\u53c2\u7167\u6570\u636e\u9519\u8bef" + e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_QUERY_AGENT_FINANCIAL_ERROR);
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

