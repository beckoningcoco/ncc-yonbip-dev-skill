/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.MerchantCommonRefUtils
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.Map;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantMasterRefEventBean")
public class MerchantMasterRefEventBean
implements IRefEvent {
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        LoginUser currentUser;
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        FilterVO gridFilter = (FilterVO)refpara.get("condition");
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (null == (currentUser = AppContext.getCurrentUser())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_LOGIN);
        }
        if (!this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            Set<String> result = this.orgPermissionsUtil.getOrgPermissions("aa_merchant");
            if (!CollectionUtils.isEmpty(result)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "in", result)});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
            }
            if (masterOrgValue != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "in", (Object)masterOrgValue.toString())});
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
            }
        } else {
            MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
        }
        if (currentUser.getUserType() != null) {
            switch (currentUser.getUserType()) {
                case ShopAdminUser: 
                case ShopUser: {
                    if (currentUser.getShop() == null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SHOP_ID_NULL, (Object[])currentUser.getId());
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)3)});
                    if (AppContext.getCurrentUser().get("singleOrgId") == null) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SHOP_ORG_NULL);
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.orgId", "eq", (Object)Long.valueOf((String)AppContext.getCurrentUser().get("singleOrgId")))});
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
                    break;
                }
            }
        }
        refpara.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}

