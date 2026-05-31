/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService
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
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.uretail.sys.pubItf.IOrgPermissionService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantAddressRefEventBean")
public class MerchantAddressRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(MerchantAddressRefEventBean.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private IOrgPermissionService iOrgPermissionService;

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
        if (!CollectionUtils.isEmpty((Collection)recordList) && "aa_merchantaddressref".equals(refEntity.refType)) {
            try {
                this.setRangeIdsForRefEdit(recordList);
            }
            catch (Exception e) {
                log.error("\u5ba2\u6237\u5730\u5740\u53c2\u7167\u6570\u636e\u9519\u8bef" + e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_QUERY_ADDRESS_ERROR);
            }
        }
    }

    public void setRangeIdsForRefEdit(List<HashMap<String, Object>> recordList) throws Exception {
        ArrayList<String> merchantIdList = new ArrayList<String>(recordList.size() * 2);
        for (HashMap<String, Object> record : recordList) {
            if (record.get("merchantId") == null) continue;
            merchantIdList.add(record.get("merchantId").toString());
        }
        if (CollectionUtils.isEmpty(merchantIdList)) {
            return;
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, merchantId, orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIdList), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        List merchantApplyRangeList = null;
        merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        HashMap<String, String> applyRangeIdMapMerchantId = null;
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            Boolean singleOrg = this.upcControlRuleService.checkSingleOrg();
            applyRangeIdMapMerchantId = new HashMap<String, String>(merchantApplyRangeList.size() * 2);
            if (singleOrg.booleanValue()) {
                for (Map map : merchantApplyRangeList) {
                    applyRangeIdMapMerchantId.put(map.get("merchantId").toString(), map.get("id").toString());
                }
            } else {
                Set<String> orgIdSet = this.getMerchantChildRefAuthOrg() ? this.iOrgPermissionService.getOrgPermissions("aa_merchant") : this.orgPermissionsUtil.getOrgPermissions("aa_merchant");
                if (CollectionUtils.isEmpty(orgIdSet)) {
                    return;
                }
                for (Map applyRange : merchantApplyRangeList) {
                    if (applyRange.get("orgId") == null || !orgIdSet.contains(applyRange.get("orgId").toString())) continue;
                    applyRangeIdMapMerchantId.put(applyRange.get("merchantId").toString(), applyRange.get("id").toString());
                }
            }
            for (HashMap hashMap : recordList) {
                hashMap.put("merchantApplyRangeId", applyRangeIdMapMerchantId.get(hashMap.get("merchantId").toString()));
            }
        }
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }

    public boolean getMerchantChildRefAuthOrg() {
        try {
            Object optionValue = OptionUtils.getOptionByName((String)"productcenter", (String)"merchantChildRefAuthOrg", null);
            if (optionValue == null) {
                return false;
            }
            return BooleanUtil.isTrue((Object)optionValue);
        }
        catch (Exception e) {
            log.error("getMerchantChildRefAuthOrg_error:{}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }
}

