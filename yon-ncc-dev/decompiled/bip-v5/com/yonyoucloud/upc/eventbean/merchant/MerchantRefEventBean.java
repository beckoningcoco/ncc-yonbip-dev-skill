/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
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
 *  org.imeta.core.lang.BooleanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.merchant;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.utils.MerchantCommonRefUtils;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.core.lang.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="merchantRefEventBean")
public class MerchantRefEventBean
implements IRefEvent {
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        Map externalData;
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        FilterVO gridFilter = (FilterVO)refpara.get("condition");
        SimpleFilterVO[] simpleFilterVO = new SimpleFilterVO[]{};
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        } else {
            simpleFilterVO = gridFilter.getSimpleVOs();
        }
        JSONObject extMap = null;
        String extendCondition = (String)refpara.get("extendCondition");
        if (!StringUtils.isEmpty((Object)extendCondition)) {
            extMap = JSON.parseObject((String)extendCondition);
        }
        if (extMap != null && !extMap.isEmpty() && BooleanUtils.b(extMap.get("isTransType"))) {
            return;
        }
        if (simpleFilterVO != null && simpleFilterVO.length != 0) {
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                if (simpleFilterVO[i].getField() != null && simpleFilterVO[i].getField().equals("merchantAppliedDetail.stopstatus")) {
                    simpleFilterVO[i].setOp("eq");
                    if (simpleFilterVO[i].getValue1() instanceof List) {
                        if (CollectionUtils.isEmpty((Collection)((List)simpleFilterVO[i].getValue1()))) continue;
                        if (((List)simpleFilterVO[i].getValue1()).size() == 2) {
                            SimpleFilterVO or = new SimpleFilterVO(ConditionOperator.or);
                            if ("0".equals(((List)simpleFilterVO[i].getValue1()).get(0).toString())) {
                                or.addCondition(new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.stopstatus", "eq", (Object)0)});
                            } else if ("1".equals(((List)simpleFilterVO[i].getValue1()).get(0).toString())) {
                                or.addCondition(new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.stopstatus", "eq", (Object)1)});
                            }
                            if ("0".equals(((List)simpleFilterVO[i].getValue1()).get(1).toString())) {
                                or.addCondition(new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.stopstatus", "eq", (Object)0)});
                            } else if ("1".equals(((List)simpleFilterVO[i].getValue1()).get(1).toString())) {
                                or.addCondition(new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.stopstatus", "eq", (Object)1)});
                            }
                            SimpleFilterVO and = new SimpleFilterVO(ConditionOperator.and);
                            and.addCondition(new SimpleFilterVO[]{or});
                            simpleFilterVO[i] = and;
                            continue;
                        }
                        if ("0".equals(((List)simpleFilterVO[i].getValue1()).get(0).toString())) {
                            simpleFilterVO[i].setValue1((Object)0);
                            continue;
                        }
                        if (!"1".equals(((List)simpleFilterVO[i].getValue1()).get(0).toString())) continue;
                        simpleFilterVO[i].setValue1((Object)1);
                        continue;
                    }
                    if (!(simpleFilterVO[i].getValue1() instanceof String)) continue;
                    if ("0".equals(simpleFilterVO[i].getValue1())) {
                        simpleFilterVO[i].setValue1((Object)0);
                        continue;
                    }
                    if (!"1".equals(simpleFilterVO[i].getValue1())) continue;
                    simpleFilterVO[i].setValue1((Object)1);
                    continue;
                }
                if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                List simpleFilterVOList = simpleFilterVO[i].getConditions();
                for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                    if (simpleFilterVO1.getField() != null && !simpleFilterVO1.getField().equals("merchantAppliedDetail.stopstatus")) continue;
                }
            }
        }
        MerchantCommonRefUtils.ignoreOrgId((FilterVO)gridFilter, (boolean)this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant"));
        boolean isChannelType = true;
        if (extMap != null && !extMap.isEmpty() && extMap.containsKey("isChannType")) {
            if (extMap.get("isChannType") instanceof Integer && Long.parseLong(extMap.get("isChannType").toString()) == 1L) {
                isChannelType = false;
            } else if ("1".equals(extMap.get("isChannType"))) {
                isChannelType = false;
            }
        }
        if (isChannelType) {
            LoginUser currentUser = AppContext.getCurrentUser();
            if (null == currentUser) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_NO_LOGIN);
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
                        break;
                    }
                    default: {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.rangeType", "eq", (Object)1)});
                    }
                }
            }
        }
        if (refpara.get("externalData") != null && refpara.get("externalData") instanceof Map && (externalData = (Map)refpara.get("externalData")).containsKey("isTradeCustomers") && externalData.get("isTradeCustomers") instanceof String) {
            if ("0".equals(externalData.get("isTradeCustomers"))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.isTradeCustomers", "eq", (Object)"0")});
            } else if ("1".equals(externalData.get("isTradeCustomers"))) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.isTradeCustomers", "eq", (Object)"1")});
            }
        }
        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantAppliedDetail.merchantApplyRangeId.isPotential", "eq", (Object)false)});
        refpara.put("condition", gridFilter);
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }
}

