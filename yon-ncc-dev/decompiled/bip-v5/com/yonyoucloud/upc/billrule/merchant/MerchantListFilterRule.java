/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.QueryPerspective
 *  com.yonyoucloud.upc.utils.MerchantCommonRefUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.QueryPerspective;
import com.yonyoucloud.upc.service.MerchantCommonRefQueryService;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantListFilterRule")
public class MerchantListFilterRule
extends AbstractCommonRule {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private MerchantCommonRefQueryService merchantCommonRefQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        LoginUser user = AppContext.getCurrentUser();
        Map obj = (Map)billDataDto.getExternalData();
        billContext.setQueryJoin("[{\"name\":\"customerAreas\",\"join\":\".isDefault=1&&.merchantApplyRangeId=merchantApplyRanges.id\"},{\"name\":\"principals\",\"join\":\".isDefault=1&&.merchantApplyRangeId=merchantApplyRanges.id\"}]");
        if (obj != null && !obj.isEmpty() && obj.containsKey("actionName") && "batchoutput".equalsIgnoreCase(obj.get("actionName").toString())) {
            String merchantApplyRangeIds;
            if (!this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
                billDataDto.setMasterOrgField("merchantApplyRanges.orgId");
            }
            if ("".equals(merchantApplyRangeIds = obj.get("merchantApplyRangeIds").toString())) {
                FilterVO gridFilter = billDataDto.getCondition();
                if (gridFilter == null) {
                    gridFilter = new FilterVO();
                }
                if ("aa_merchantlist".equals(billContext.getBillnum())) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isCreator", "eq", (Object)1)});
                }
                if (user.getUserType() == UserType.ShopAdminUser || user.getUserType() == UserType.ShopUser) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)3)});
                } else {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)1)});
                }
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isPotential", "eq", (Object)false)});
                billDataDto.setCondition(gridFilter);
                return new RuleExecuteResult();
            }
            FilterVO gridFilter = new FilterVO();
            ArrayList<Long> rangesIdLong = new ArrayList<Long>();
            if (StringUtils.isNotBlank((CharSequence)merchantApplyRangeIds) && merchantApplyRangeIds.contains(",")) {
                List<String> rangesId = Arrays.asList(StringUtils.split((String)merchantApplyRangeIds, (String)","));
                rangesId.forEach(rangeId -> rangesIdLong.add(Long.valueOf(rangeId.toString())));
            } else {
                rangesIdLong.add(Long.valueOf(merchantApplyRangeIds));
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.id", "in", rangesIdLong)});
            billDataDto.setCondition(gridFilter);
            this.putParam(paramMap, billDataDto);
            return new RuleExecuteResult();
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        int queryType = 0;
        if (billDataDto.getCondition() != null) {
            FilterCommonVO[] vos = billDataDto.getCondition().getCommonVOs();
            if (vos != null) {
                for (FilterCommonVO vo : vos) {
                    if (!"QueryType".equalsIgnoreCase(vo.getItemName())) continue;
                    queryType = (Integer)vo.getValue1();
                    break;
                }
            }
            if (queryType > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800076);
            }
        }
        if (this.upcControlRuleService.checkProductLine().booleanValue()) {
            if (!this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
                billDataDto.setMasterOrgField("merchantApplyRanges.orgId");
            } else {
                MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)true);
            }
            if ("aa_merchantlist".equals(billContext.getBillnum()) && !CollectionUtils.isEmpty((Map)obj) && obj.containsKey("queryPerspective")) {
                String queryPerspective = String.valueOf(obj.get("queryPerspective"));
                if (QueryPerspective.ManagementPerspective.getValue().equals(queryPerspective)) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isCreator", "eq", (Object)1)});
                }
            }
            switch (user.getUserType()) {
                case ShopAdminUser: 
                case ShopUser: {
                    if (user.get("shop") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800078, (Object[])user.getId());
                    }
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)3)});
                    break;
                }
                default: {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.rangeType", "eq", (Object)1)});
                }
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantApplyRanges.isPotential", "eq", (Object)false)});
        }
        billDataDto.setCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

