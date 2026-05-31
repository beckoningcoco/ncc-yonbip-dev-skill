/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistClass
 *  com.yonyoucloud.upc.pc.product.ProductBarCode
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.utils.UPCFunctionUtils
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistClass;
import com.yonyoucloud.upc.pc.product.ProductBarCode;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.service.ApiDataService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.UPCFunctionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.collections4.MapUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class ProductApiDataService
extends ApiDataService {
    private static final Logger log = LoggerFactory.getLogger(ProductApiDataService.class);
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    OrgPermissionsUtil orgPermissionsUtil;

    public void removeDetailDataForDetailSave(Map<String, Object> detail) {
        if (detail.containsKey("checkByCost")) {
            detail.remove("checkByCost");
        }
        if (detail.containsKey("isCheckFree")) {
            detail.remove("isCheckFree");
        }
        if (detail.containsKey("titleMemo")) {
            detail.remove("titleMemo");
        }
    }

    public void dealDetailDataForDetailSave(Map<String, Object> detail) {
        if (detail.containsKey("inspectionType") && detail.get("inspectionType") != null) {
            detail.put("inspectionType", BooleanUtil.isTrue((Object)detail.get("inspectionType").toString()) ? 1 : 0);
        }
        if (detail.containsKey("isAllArea") && detail.get("isAllArea") != null) {
            detail.put("isAllArea", Boolean.parseBoolean(detail.get("isAllArea").toString()));
        }
        if (detail.containsKey("iStatus") && detail.get("iStatus") != null) {
            detail.put("iStatus", Boolean.parseBoolean(detail.get("iStatus").toString()));
        }
        if (detail.containsKey("enableDeposit") && detail.get("enableDeposit") != null) {
            detail.put("enableDeposit", Boolean.parseBoolean(detail.get("enableDeposit").toString()));
        }
        if (detail.containsKey("depositDealPayType") && detail.get("depositDealPayType") != null) {
            detail.put("depositDealPayType", Integer.parseInt(detail.get("depositDealPayType").toString()));
        }
        if (detail.containsKey("enablemodifyDeposit") && detail.get("enablemodifyDeposit") != null) {
            detail.put("enablemodifyDeposit", Boolean.parseBoolean(detail.get("enablemodifyDeposit").toString()));
        }
        if (detail.containsKey("isDisplayPrice") && detail.get("isDisplayPrice") != null) {
            detail.put("isDisplayPrice", Boolean.parseBoolean(detail.get("isDisplayPrice").toString()));
        }
        if (detail.containsKey("depositPayType") && detail.get("depositPayType") != null) {
            detail.put("depositPayType", Integer.parseInt(detail.get("depositPayType").toString()));
        }
        if (detail.containsKey("iEnableEcontract") && detail.get("iEnableEcontract") != null) {
            detail.put("iEnableEcontract", Boolean.parseBoolean(detail.get("iEnableEcontract").toString()));
        }
        if (detail.containsKey("iUOrderStatus") && detail.get("iUOrderStatus") != null) {
            detail.put("iUOrderStatus", Boolean.parseBoolean(detail.get("iUOrderStatus").toString()));
        }
        if (detail.containsKey("directProduction") && detail.get("directProduction") != null) {
            if ("true".equals(detail.get("directProduction").toString())) {
                detail.put("directProduction", 1);
            } else if ("false".equals(detail.get("directProduction").toString())) {
                detail.put("directProduction", 0);
            }
        }
        detail.remove("pubts");
        detail.put("_status", "Update");
    }

    public void dealChildObjecType(Map<String, Object> bill) {
        if (bill.containsKey("productAssistClasses") && null != bill.get("productAssistClasses") && bill.get("productAssistClasses") instanceof List) {
            ArrayList<ProductAssistClass> productAssistClasses = new ArrayList<ProductAssistClass>();
            for (Map data : (List)bill.get("productAssistClasses")) {
                ProductAssistClass productAssistClass = (ProductAssistClass)JSONObject.parseObject((String)JSONObject.toJSONString((Object)data), ProductAssistClass.class);
                productAssistClasses.add(productAssistClass);
            }
            bill.put("productAssistClasses", productAssistClasses);
        }
        if (bill.containsKey("productTags") && null != bill.get("productTags") && bill.get("productTags") instanceof List) {
            ArrayList<ProductTagExtend> productTagExtends = new ArrayList<ProductTagExtend>();
            for (Map data : (List)bill.get("productTags")) {
                ProductTagExtend productTagExtend = (ProductTagExtend)JSONObject.parseObject((String)JSONObject.toJSONString((Object)data), ProductTagExtend.class);
                productTagExtends.add(productTagExtend);
            }
            bill.put("productTags", productTagExtends);
        }
        if (bill.containsKey("productBarCodes") && null != bill.get("productBarCodes") && bill.get("productBarCodes") instanceof List) {
            ArrayList<ProductBarCode> productBarCodes = new ArrayList<ProductBarCode>();
            for (Map data : (List)bill.get("productBarCodes")) {
                ProductBarCode productBarCode = (ProductBarCode)JSONObject.parseObject((String)JSONObject.toJSONString((Object)data), ProductBarCode.class);
                productBarCode.remove("pubts");
                productBarCodes.add(productBarCode);
            }
            bill.put("productBarCodes", productBarCodes);
        }
        bill.remove("pubts");
    }

    public List<Map<String, Object>> checkProductDatasApi(List<Map<String, Object>> billList, List<Object> messages, String callBackKey) throws Exception {
        try {
            this.dealBisSaveDatas(billList);
        }
        catch (Exception e) {
            log.error("MQSaveProductNewArchTaskService.dealBisSaveDatas error", (Throwable)e);
        }
        ArrayList<Map<String, Object>> resultBillList = new ArrayList<Map<String, Object>>();
        ArrayList orgIdList = new ArrayList();
        ArrayList orgCodeList = new ArrayList();
        billList.forEach(productVO -> {
            if (productVO.get("orgId") != null) {
                orgIdList.add(productVO.get("orgId").toString());
            } else if (productVO.get("orgId_Code") != null) {
                orgCodeList.add(productVO.get("orgId_Code").toString());
            }
            if (productVO.get("productOrgs") != null) {
                List productOrgs = (List)productVO.get("productOrgs");
                productOrgs.forEach(applyRange -> {
                    if (applyRange.get("orgId") != null) {
                        orgIdList.add(applyRange.get("orgId").toString());
                    } else if (applyRange.get("orgId_code") != null) {
                        orgCodeList.add(applyRange.get("orgId_code").toString());
                    }
                });
            }
        });
        List funcOrgsByCode = new ArrayList();
        List funcOrgsById = new ArrayList();
        if (!CollectionUtils.isEmpty(orgCodeList)) {
            funcOrgsByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
        }
        if (!CollectionUtils.isEmpty(orgIdList)) {
            funcOrgsById = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIdList).withEnabled());
        }
        ArrayList<OrgUnitDTO> adminOrgs = new ArrayList<OrgUnitDTO>();
        if (!CollectionUtils.isEmpty(funcOrgsByCode)) {
            adminOrgs.addAll(funcOrgsByCode);
        }
        if (!CollectionUtils.isEmpty(funcOrgsById)) {
            adminOrgs.addAll(funcOrgsById);
        }
        if (CollectionUtils.isEmpty(adminOrgs)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801509);
        }
        List<OrgUnitDTO> voucherManageOrgs = this.orgPermissionsUtil.filterVoucherManageOrgs("pc.product.Product", adminOrgs);
        for (Map<String, Object> billOne : billList) {
            try {
                this.dealProductData(adminOrgs, voucherManageOrgs, billOne);
                resultBillList.add(billOne);
            }
            catch (Exception e) {
                if (null != messages) {
                    HashMap<String, String> msg = new HashMap<String, String>();
                    if (null != billOne.get(callBackKey)) {
                        msg.put("key", billOne.get(callBackKey).toString());
                    }
                    msg.put("message", e.getMessage());
                    messages.add(msg);
                    continue;
                }
                throw e;
            }
        }
        return resultBillList;
    }

    private void dealBisSaveDatas(List<Map<String, Object>> allData) throws Exception {
        HashMap<String, Map<String, Object>> idDatas = new HashMap<String, Map<String, Object>>();
        ArrayList<String> ids = new ArrayList<String>();
        for (Map<String, Object> bizObject : allData) {
            if (null == bizObject.get("id")) continue;
            ids.add(bizObject.get("id").toString());
            idDatas.put(bizObject.get("id").toString(), bizObject);
        }
        if (!CollectionUtils.isEmpty(ids)) {
            this.setDatasForBusSave(ids, idDatas);
        }
    }

    private void setDatasForBusSave(List<String> ids, Map<String, Map<String, Object>> idDatas) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids)});
        StringBuilder fields = new StringBuilder();
        fields.append("unit").append(",").append("modelDescription").append(",").append("model").append(",").append("manageClass").append(",").append("orgId").append(",").append("erpCode").append(",").append("name").append(",").append("code").append(",").append("erpCode").append(",").append("realProductAttribute").append(",").append("realProductAttributeType").append(",").append("virtualProductAttribute").append(",").append("id").append(",").append("unitUseType");
        QuerySchema schema = QuerySchema.create().addSelect(fields.toString()).addCondition((ConditionExpression)conditionGroup);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)products)) {
            for (Map product : products) {
                String id = product.get("id").toString();
                Map<String, Object> productData = idDatas.get(id);
                if (!MapUtils.isNotEmpty(productData)) continue;
                if (!productData.containsKey("productOrgs")) {
                    String orgId = product.get("orgId").toString();
                    ArrayList<ProductApplyRange> productApplyRanges = new ArrayList<ProductApplyRange>();
                    ProductApplyRange range = new ProductApplyRange();
                    range.setIsApplied(Boolean.valueOf(true));
                    range.setIsCreator(Boolean.valueOf(true));
                    range.setOrgId(orgId);
                    productApplyRanges.add(range);
                    productData.put("productOrgs", productApplyRanges);
                }
                product.entrySet().forEach(entry -> {
                    String key = (String)entry.getKey();
                    if (!productData.containsKey(key) && null != entry.getValue()) {
                        productData.put(key, entry.getValue());
                    }
                });
            }
        }
    }

    private void dealProductData(List<OrgUnitDTO> adminOrgs, List<OrgUnitDTO> voucherManageOrgs, Map<String, Object> billOne) {
        List assistUnits;
        List assistUnitData;
        if (billOne.containsKey("code") && billOne.get("code") != null) {
            billOne.put("code", billOne.get("code").toString().trim());
        }
        if (billOne.containsKey("orgId") && billOne.get("orgId") != null || billOne.containsKey("orgId_Code") && billOne.get("orgId_Code") != null) {
            OrgUnitDTO adminOrg = new OrgUnitDTO();
            OrgUnitDTO adminOrgVoucherManage = new OrgUnitDTO();
            if (billOne.get("orgId") != null) {
                adminOrg = this.judgeData(billOne.get("orgId").toString(), adminOrgs);
                adminOrgVoucherManage = this.judgeData(billOne.get("orgId").toString(), voucherManageOrgs);
            } else if (billOne.get("orgId_Code") != null) {
                adminOrg = this.judgeData(billOne.get("orgId_Code").toString(), adminOrgs);
                adminOrgVoucherManage = this.judgeData(billOne.get("orgId_Code").toString(), voucherManageOrgs);
            }
            if (adminOrg == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801510, new Object[]{billOne.get("code"), billOne.get("orgId").toString()});
            }
            if (adminOrgVoucherManage == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801511, new Object[]{billOne.get("code"), billOne.get("orgId").toString()});
            }
            if (billOne.get("productOrgs") != null && ((List)billOne.get("productOrgs")).size() > 0) {
                boolean oradminOrg = false;
                List applyRanges = ((List)billOne.get("productOrgs")).stream().filter(p -> p.containsKey("orgId") && this.judgeData(p.get("orgId").toString(), voucherManageOrgs) != null || p.containsKey("orgId_code") && this.judgeData(p.get("orgId_code").toString(), voucherManageOrgs) != null).collect(Collectors.toList());
                for (Map range : applyRanges) {
                    if (range.get("orgId") != null && range.get("orgId").toString().equals(adminOrg.getId()) || range.get("orgId_code") != null && range.get("orgId_code").toString().equals(adminOrg.getCode())) {
                        range.put("isCreator", true);
                        range.put("isApplied", true);
                        oradminOrg = true;
                        continue;
                    }
                    range.put("isCreator", false);
                    range.put("isApplied", false);
                }
                if (!oradminOrg) {
                    ProductApplyRange tempData = new ProductApplyRange();
                    tempData.setRangeType(Integer.valueOf(1));
                    tempData.setIsCreator(Boolean.valueOf(true));
                    tempData.setIsApplied(Boolean.valueOf(true));
                    tempData.setOrgId(adminOrg.getId());
                    tempData.setEntityStatus(EntityStatus.Insert);
                    applyRanges.add(tempData);
                }
                billOne.put("productOrgs", applyRanges);
            }
        }
        if (billOne.get("productAssistUnitExchanges") != null && ((List)billOne.get("productAssistUnitExchanges")).size() > 0 && !CollectionUtils.isEmpty(assistUnitData = (assistUnits = (List)billOne.get("productAssistUnitExchanges")).stream().filter(m -> m.get("assistUnit") != null).collect(Collectors.toList()))) {
            List resultAssistUnits = assistUnitData.stream().filter(UPCFunctionUtils.distinctByKey(o -> o.get("assistUnit"))).collect(Collectors.toList());
            billOne.put("productAssistUnitExchanges", resultAssistUnits);
        }
        if (ObjectUtils.isEmpty((Object)billOne.get("productspecitems"))) {
            billOne.remove("productskus");
        }
    }

    public OrgUnitDTO judgeData(String orgidOrCode, List<OrgUnitDTO> adminOrgs) {
        OrgUnitDTO adminOrg = new OrgUnitDTO();
        if (orgidOrCode != null) {
            adminOrg = adminOrgs.stream().filter(m -> m.getId().equals(orgidOrCode) || m.getCode().equals(orgidOrCode)).findFirst().orElse(null);
        }
        return adminOrg;
    }
}

