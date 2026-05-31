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
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.eventbean.cust;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="custcategoryRefEventBean")
public class CustcategoryRefEventBean
implements IRefEvent {
    private static final Logger log = LoggerFactory.getLogger(CustcategoryRefEventBean.class);
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private PubOptionService pubOptionService;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {
        Boolean isOrgGlobalShare;
        Object masterOrgValue = refpara.get("masterOrgValue");
        SQLInjectionCheckUtil.checkMasterOrg((Object)masterOrgValue);
        refEntity.setDatasourceType("custcategoryRef");
        FilterVO gridFilter = (FilterVO)refpara.get("treeCondition");
        SimpleFilterVO[] simpleFilterVO = new SimpleFilterVO[]{};
        boolean mark = true;
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
        if (extMap != null && extMap.get("level") != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "eq", (Object)Integer.valueOf(extMap.get("level").toString()))});
            refpara.put("treeCondition", gridFilter);
        }
        if ((isOrgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory")).booleanValue()) {
            FilterVO filter = (FilterVO)refpara.get("treeCondition");
            this.orgPermissionsUtil.ignoreOrgId(filter, isOrgGlobalShare);
            return;
        }
        if (simpleFilterVO != null && simpleFilterVO.length != 0) {
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                if (simpleFilterVO[i].getField() != null && simpleFilterVO[i].getField().equals("custCategoryApplyRanges.orgId")) {
                    mark = false;
                    continue;
                }
                if (simpleFilterVO[i].getConditions() == null || simpleFilterVO[i].getConditions().size() == 0) continue;
                List simpleFilterVOList = simpleFilterVO[i].getConditions();
                for (SimpleFilterVO simpleFilterVO1 : simpleFilterVOList) {
                    if (simpleFilterVO1.getField() == null || !simpleFilterVO1.getField().equals("custCategoryApplyRanges.orgId")) continue;
                    mark = false;
                }
            }
        }
        if (mark) {
            if (extMap != null && extMap.get("orgId") != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("custCategoryApplyRanges.orgId", "eq", extMap.get("orgId"))});
            } else {
                this.handleFilter(refpara, gridFilter, masterOrgValue);
            }
            refpara.put("treeCondition", gridFilter);
        }
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> refpara, Object result) {
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object result) {
    }

    private void handleFilter(Map<String, Object> refpara, FilterVO gridFilter, Object masterOrgValue) {
        Map externalData = null;
        externalData = refpara.get("externalData") != null && refpara.get("externalData") instanceof Map ? (Map)refpara.get("externalData") : new HashMap();
        String shopType = null;
        if (externalData.get("shopType") != null) {
            shopType = externalData.get("shopType").toString();
        }
        String billnum = null;
        if (externalData.get("billnum") != null) {
            billnum = externalData.get("billnum").toString();
        }
        if (ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) == 3 && "0".equals(shopType) && ("aa_merchant".equals(billnum) || "aa_merchantdetail".equals(billnum) || "aa_merchantlist".equals(billnum) || "aa_merchantlist_query".equals(billnum))) {
            Map queryOne = null;
            ArrayList<String> orgIds = new ArrayList<String>();
            orgIds.add(AppContext.getCurrentUser().getShop().toString());
            try {
                QuerySchema schema = QuerySchema.create().addSelect("parentManageOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)AppContext.getCurrentUser().getShop().toString())}));
                queryOne = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schema);
            }
            catch (Exception e) {
                log.error("\u67e5\u8be2\u5546\u5bb6\u4e0a\u7ea7\u7ec4\u7ec7\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUST_CATEGOTRY_QUERY_MERCHANT_ERROR);
            }
            if (queryOne != null && queryOne.get("parentManageOrg") != null) {
                orgIds.add(queryOne.get("parentManageOrg").toString());
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("custCategoryApplyRanges.orgId", "in", orgIds)});
        } else if (masterOrgValue != null) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("custCategoryApplyRanges.orgId", "in", Arrays.asList(masterOrgValue.toString().split(",")))});
        } else {
            Set<Object> result = new HashSet();
            if (!this.orgPermissionsUtil.isTenantAdminByInvocation()) {
                result = this.orgPermissionsUtil.getOrgPermissions("aa_custcategory");
            }
            if (!CollectionUtils.isEmpty(result)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("custCategoryApplyRanges.orgId", "in", result)});
            }
        }
    }
}

