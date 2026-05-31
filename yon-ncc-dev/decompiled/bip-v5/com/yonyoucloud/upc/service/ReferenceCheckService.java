/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.org.dto.RefCheckDTO
 *  com.yonyou.ucf.org.ref.api.DeptRefCheckApi
 *  com.yonyou.ucf.org.ref.api.OrgRefCheckApi
 *  com.yonyoucloud.upc.common.UpcReferenceCheck
 *  com.yonyoucloud.upc.data.upcReferenceCheck.UpcReferenceCheckDao
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.org.dto.RefCheckDTO;
import com.yonyou.ucf.org.ref.api.DeptRefCheckApi;
import com.yonyou.ucf.org.ref.api.OrgRefCheckApi;
import com.yonyoucloud.upc.common.UpcReferenceCheck;
import com.yonyoucloud.upc.data.upcReferenceCheck.UpcReferenceCheckDao;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ReferenceCheckService
implements OrgRefCheckApi,
DeptRefCheckApi {
    Logger logger = LoggerFactory.getLogger(ReferenceCheckService.class);
    @Autowired
    private UpcReferenceCheckDao upcReferenceCheckDao;
    @Autowired
    OrgExternalQryService orgExternalQryService;

    public List<RefCheckDTO> deleteCheckOrgInUse(List<String> orgIdList, String tenantId) {
        String message = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D2", (String)"\u7ec4\u7ec7\u88ab%s\u5f15\u7528");
        return this.refCheckResult(orgIdList, "org", message, "org.func.BaseOrg");
    }

    public List<RefCheckDTO> deleteCheckDeptInUse(List<String> deptIdList, String tenantId) {
        String message = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D7", (String)"\u90e8\u95e8\u88ab%s\u5f15\u7528");
        return this.refCheckResult(deptIdList, "department", message, "org.func.BaseDept");
    }

    public List<RefCheckDTO> deleteCheckProductInUse(String productId, String code, String productApplyRangeOrgId) {
        List<RefCheckDTO> checkResult = new ArrayList<RefCheckDTO>();
        if (this.queryProductIsApplied(productId, productApplyRangeOrgId)) {
            ArrayList<String> productIdList = new ArrayList<String>();
            productIdList.add(productId);
            String message = code + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19C4B9A00448000F", (String)"\u6b64\u7269\u6599\u5df2\u88ab%s\u5f15\u7528\uff0c\u4e0d\u80fd\u5220\u9664\uff1b");
            checkResult = this.refCheckResult(productIdList, "product", message, "");
        }
        return checkResult;
    }

    public List<RefCheckDTO> refCheckResult(List<String> idList, String typeCode, String message, String uri) {
        ArrayList<RefCheckDTO> refCheckDTOList = new ArrayList<RefCheckDTO>();
        List<UpcReferenceCheck> upcReferenceCheckRedisList = this.getUpcReferenceCheck(typeCode);
        if (!CollectionUtils.isEmpty(upcReferenceCheckRedisList)) {
            for (UpcReferenceCheck upcReferenceCheck : upcReferenceCheckRedisList) {
                if (!this.commonCheckQuery(typeCode, upcReferenceCheck.getFullName(), upcReferenceCheck.getAttributeName(), idList)) continue;
                RefCheckDTO refCheckDTO = new RefCheckDTO();
                String lableName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D4", (String)"\u6570\u5b57\u5316\u5efa\u6a21");
                refCheckDTO.setLabelName(lableName);
                String appName = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807D6", (String)"\u57fa\u7840\u6570\u636e");
                refCheckDTO.setAppName(appName);
                String moduleName = InternationalUtils.getMessageWithDefault((String)upcReferenceCheck.getModuleName_resid(), (String)upcReferenceCheck.getModuleName());
                refCheckDTO.setServiceName(moduleName);
                refCheckDTO.setMessage(String.format(message, moduleName));
                refCheckDTO.setServiceCode(upcReferenceCheck.getServiceCode());
                refCheckDTO.setUri(uri);
                refCheckDTOList.add(refCheckDTO);
            }
        }
        return refCheckDTOList;
    }

    private boolean commonCheckQuery(String typeCode, String fullName, String attributeName, List<String> idList) {
        int num;
        if (("org".equals(typeCode) || "department".equals(typeCode)) && CollectionUtils.isEmpty(idList = this.handleOrgIdList(idList))) {
            return false;
        }
        if ("product".equals(typeCode) && "pc.product.ProductSKU".equals(fullName) && this.isDefaultSKU(idList.get(0))) {
            return false;
        }
        if ("product".equals(typeCode) && "pc.productapply.ProductApply".equals(fullName)) {
            return this.isCheckProductApply(idList.get(0));
        }
        boolean isCheck = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("count(id) as num");
        String[] attributes = attributeName.split(",");
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        for (String attribute : attributes) {
            conditionExpressions.add(QueryCondition.name((String)attribute).in(idList));
        }
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup condition = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
        QueryConditionGroup conditions = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{condition});
        querySchema.addCondition((ConditionExpression)conditions);
        Map materialList = new HashMap();
        try {
            materialList = MetaDaoHelper.queryOne((String)fullName, (QuerySchema)querySchema);
        }
        catch (Exception e) {
            this.logger.error("\u67e5\u8be2\u6570\u636e\u5f02\u5e38" + e.getMessage() + e.getMessage(), (Throwable)e);
        }
        if (!CollectionUtils.isEmpty(materialList) && materialList.containsKey("num") && (num = Integer.parseInt(materialList.get("num").toString())) != 0) {
            isCheck = true;
        }
        return isCheck;
    }

    private List<UpcReferenceCheck> getUpcReferenceCheck(String typeCode) {
        List upcReferenceCheckList = this.upcReferenceCheckDao.getUpcReferenceCheckByTypeCode(typeCode);
        if (!CollectionUtils.isEmpty((Collection)upcReferenceCheckList)) {
            return upcReferenceCheckList;
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800523, new Object[]{typeCode});
    }

    private Long changeId(String yhtTenantId) {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.setPartitionable(false);
        if (StringUtils.isBlank((CharSequence)yhtTenantId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801050);
        }
        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)yhtTenantId)}));
        Map stringObjectMap = new HashMap();
        try {
            stringObjectMap = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)querySchema);
        }
        catch (Exception e) {
            this.logger.error("\u67e5\u8be2\u6570\u636e\u5f02\u5e38" + e.getMessage() + e.getMessage(), (Throwable)e);
        }
        Long tenanttId = null;
        if (stringObjectMap != null && !stringObjectMap.isEmpty()) {
            tenanttId = (Long)stringObjectMap.get("id");
        }
        return tenanttId;
    }

    private List<String> handleOrgIdList(List<String> orgIdList) {
        if (CollectionUtils.isEmpty(orgIdList)) {
            return orgIdList;
        }
        Map results = this.orgExternalQryService.queryExternalOrgFlagByIds((String)AppContext.getYTenantId(), orgIdList);
        if (!CollectionUtils.isEmpty((Map)results)) {
            for (String orgId : results.keySet()) {
                if (!((Boolean)results.get(orgId)).booleanValue()) continue;
                orgIdList.remove(orgId);
            }
        }
        return orgIdList;
    }

    public boolean isDefaultSKU(String id) {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)id)});
        QuerySchema schema = QuerySchema.create().addSelect("isSKU").addCondition((ConditionExpression)queryConditionGroup);
        List skuInDb = null;
        try {
            skuInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        }
        catch (Exception e) {
            this.logger.error("\u67e5\u8be2\u6570\u636e\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
        }
        return skuInDb != null && skuInDb.size() > 0 && UPCConstants.ISSKU_DEFAULT.equals(((Map)skuInDb.get(0)).get("isSKU"));
    }

    public boolean queryProductIsApplied(String productId, String productApplyRangeOrgId) {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").eq((Object)productApplyRangeOrgId)}));
        List isAppliedProductCount = null;
        try {
            isAppliedProductCount = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        }
        catch (Exception e) {
            this.logger.error("\u67e5\u8be2\u6570\u636e\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
        }
        return isAppliedProductCount != null && isAppliedProductCount.size() > 0;
    }

    public boolean isCheckProductApply(String productId) {
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"applyProductId").eq((Object)productId), QueryCondition.name((String)"applyType").eq((Object)ProductApplyType.modify.getValue())}));
        List queryResult = new ArrayList();
        try {
            queryResult = MetaDaoHelper.query((String)"pc.productapply.ProductApply", (QuerySchema)querySchema);
        }
        catch (Exception e) {
            this.logger.error("\u7269\u6599\u5220\u9664\u5f15\u7528\u6821\u9a8c\uff0c\u7269\u6599\u7533\u8bf7\u5355\u6570\u636e\u67e5\u8be2\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801051);
        }
        return !CollectionUtils.isEmpty(queryResult);
    }
}

