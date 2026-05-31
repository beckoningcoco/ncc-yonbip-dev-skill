/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils
 *  com.yonyou.iuap.mc.docunique.dto.DocUniqueRule
 *  com.yonyou.iuap.mc.docunique.dto.UniqueScopeOrgResult
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.core.model.Constraint
 *  org.imeta.core.model.ConstraintTypeEnum
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.customerapply;

import com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils;
import com.yonyou.iuap.mc.docunique.dto.DocUniqueRule;
import com.yonyou.iuap.mc.docunique.dto.UniqueScopeOrgResult;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.CustomerApplyService;
import com.yonyoucloud.upc.service.productapply.ProductApplyCheckService;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.core.model.Constraint;
import org.imeta.core.model.ConstraintTypeEnum;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CustomerApplyCheckService {
    public static final int UNIQUE_CHECK_BATCH_NUM = 500;
    @Autowired
    private CustomerApplyService customerApplyService;
    @Autowired
    private ProductApplyCheckService productApplyCheckService;
    @Autowired
    MCServiceUntils mcServiceUntils;
    @Autowired
    ProductApplyCheckService productApplyService;

    public void uniqueCheckWithCustomerApply(BizObject merchant, CustomerApply customerApply) throws Exception {
        int pageIndex = 1;
        int pageSize = 500;
        int customerApplyCountNum = this.customerApplyService.getCustomerApplyCountByVerifyState(customerApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()));
        int pageCount = customerApplyCountNum % pageSize == 0 ? customerApplyCountNum / pageSize : customerApplyCountNum / pageSize + 1;
        Entity entity = MetaDaoHelper.getEntity((String)"aa.merchant.Merchant");
        for (int i = 0; i < pageCount; ++i) {
            List<CustomerApply> customerApplyList = this.customerApplyService.listCustomerApplyByVerifyState(customerApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()), pageIndex, pageSize);
            this.uniqueCompareWithCustomerApply(merchant, customerApplyList, entity);
            ++pageIndex;
        }
    }

    public void uniqueCompareWithCustomerApply(BizObject merchant, List<CustomerApply> customerApplys, Entity entity) {
        if (merchant == null || CollectionUtils.isEmpty(customerApplys) || entity == null) {
            return;
        }
        List docUniqueRules = this.mcServiceUntils.getDocUniqueWithField("aa.merchant.Merchant");
        UniqueScopeOrgResult uniqueScopeOrg = this.mcServiceUntils.getUniqueScopeOrgIds("aa.merchant.Merchant", merchant.get("createOrg") != null ? merchant.get("createOrg").toString() : null);
        List uniqueConstraints = entity.getUniqueConstraints().stream().filter(constraint -> ConstraintTypeEnum.Unique.equals((Object)constraint.getConstraintType())).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(uniqueConstraints) && (CollectionUtils.isEmpty((Collection)docUniqueRules) || null == uniqueScopeOrg || !uniqueScopeOrg.isAll() && CollectionUtils.isEmpty((Collection)uniqueScopeOrg.getOrgIds()))) {
            return;
        }
        for (CustomerApply apply : customerApplys) {
            Collection orgIds;
            if (StringUtils.isBlank((CharSequence)apply.getCustomerData()) || merchant.getId() != null && apply.getApplyCustomer() != null && merchant.getId().toString().equals(apply.getApplyCustomer().toString())) continue;
            Merchant merchantTarget = (Merchant)Objectlizer.decodeObj((Json)new Json(apply.getCustomerData()), (String)"aa.merchant.Merchant");
            for (Constraint constraint2 : uniqueConstraints) {
                this.productApplyCheckService.uniqueCheckWithBizObject(merchant, (BizObject)merchantTarget, constraint2, entity);
            }
            if (CollectionUtils.isEmpty((Collection)docUniqueRules) || null == uniqueScopeOrg || !uniqueScopeOrg.isAll() && (uniqueScopeOrg.isAll() || CollectionUtils.isEmpty((Collection)uniqueScopeOrg.getOrgIds())) || !uniqueScopeOrg.isAll() && !(orgIds = uniqueScopeOrg.getOrgIds()).contains(merchantTarget.getCreateOrg())) continue;
            for (DocUniqueRule docUniqueRule : docUniqueRules) {
                this.productApplyService.uniqueCheckWithBizObject(merchant, (BizObject)merchantTarget, docUniqueRule);
            }
        }
    }
}

