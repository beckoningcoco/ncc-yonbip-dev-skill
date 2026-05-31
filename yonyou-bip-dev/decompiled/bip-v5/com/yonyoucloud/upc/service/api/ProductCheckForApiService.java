/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.utils.UPCFunctionUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.utils.UPCFunctionUtils;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class ProductCheckForApiService {
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public void checkProductBefore(Product product) throws Exception {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        this.checkMustInputForProductSave(product);
    }

    public void checkMustInputForProductSave(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        if (product.detail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (product.getRealProductAttribute() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801240);
        }
        if (product.getOrgId() == null && product.get("orgId_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801241);
        }
        if (product.getCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801242);
        }
        if (product.getManageClass() == null && product.get("manageClass_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801243);
        }
        if (product.getUnitUseType() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801244);
        }
        ProductExtend detail = product.detail();
        if (UnitUseTypeEnum.USE_PRODUCT.getValue() == product.getUnitUseType().shortValue()) {
            if (product.getUnit() == null && product.get("unit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801245);
            }
            if (detail.getPurchaseUnit() == null && detail.get("purchaseUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801246);
            }
            if (detail.getPurchasePriceUnit() == null && detail.get("purchasePriceUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801247);
            }
            if (detail.getStockUnit() == null && detail.get("stockUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801248);
            }
            if (detail.getProduceUnit() == null && detail.get("produceUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801249);
            }
            if (detail.getBatchPriceUnit() == null && detail.get("batchPriceUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801250);
            }
            if (detail.getBatchUnit() == null && detail.get("batchUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801251);
            }
            if (detail.getOnlineUnit() == null && detail.get("onlineUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801252);
            }
            if (detail.getOfflineUnit() == null && detail.get("offlineUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801253);
            }
            if (detail.getRequireUnit() == null && detail.get("requireUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801254);
            }
            if (detail.get("inspectionUnit") == null && detail.get("inspectionUnit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801255);
            }
        }
    }

    public void checkMustInputForProductApplySave(ProductApply productApply) {
        if (productApply == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801256);
        }
        String billNum = "pc_productapply";
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(billNum, AppContext.getTenantId().toString(), "");
        Integer billnumMode = context.getBillnumMode();
        if (!StringUtils.hasText((String)productApply.getApplyCode())) {
            BillNumberPO billNumberPO;
            Integer handleWorkDuplicatePolicy;
            if (null != billnumMode && billnumMode == 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801257);
            }
            Object billNumber = context.getBillNumber();
            if (null != billNumber && billNumber instanceof BillNumberPO && null != (handleWorkDuplicatePolicy = (billNumberPO = (BillNumberPO)billNumber).getHandleWorkDuplicatePolicy()) && 1 == handleWorkDuplicatePolicy) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801257);
            }
            productApply.setApplyCode("wudi666");
        }
        if (productApply.getApplyType() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801258);
        }
        if (productApply.getEffectType() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801259);
        }
        if (productApply.get("productData") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
    }

    public void setProductDefault(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (detail.getCanSale() == null) {
            detail.setCanSale(Boolean.valueOf(false));
        }
        if (detail.getIsBatchManage() == null) {
            detail.setIsBatchManage(Boolean.valueOf(false));
        }
        if (detail.getIsExpiryDateManage() == null) {
            detail.setIsExpiryDateManage(Boolean.valueOf(false));
        }
        if (detail.getIsSerialNoManage() == null) {
            detail.setIsSerialNoManage(Boolean.valueOf(false));
        }
        if (detail.getIsBarcodeManage() == null) {
            detail.setIsBarcodeManage(Boolean.valueOf(false));
        }
        if (detail.getAllowNegativeInventory() == null) {
            detail.setAllowNegativeInventory(Boolean.valueOf(false));
        }
        if (detail.get("scanCountUnit") == null) {
            detail.put("scanCountUnit", (Object)0);
        }
        if (detail.get("reservation") == null) {
            detail.put("reservation", (Object)false);
        }
        if (detail.get("inspectionType") == null) {
            detail.put("inspectionType", (Object)0);
        }
        if (detail.getWarehousingByResult() == null) {
            detail.setWarehousingByResult(Boolean.valueOf(false));
        }
        if (detail.get("testRule") == null) {
            detail.put("testRule", (Object)1);
        }
        if (detail.getSupplyType() == null) {
            detail.setSupplyType(Short.valueOf((short)0));
        }
        if (detail.get("ECNControl") == null) {
            detail.put("ECNControl", (Object)false);
        }
        if (detail.get("fullSetInspection") == null) {
            detail.put("fullSetInspection", (Object)0);
        }
        if (detail.getKeySubPart() == null) {
            detail.setKeySubPart(Boolean.valueOf(false));
        }
        if (detail.getBatchRule() == null) {
            detail.setBatchRule(Short.valueOf((short)0));
        }
        if (detail.get("lossType") == null) {
            detail.put("lossType", (Object)0);
        }
        if (detail.get("prepareFeed") == null) {
            detail.put("prepareFeed", (Object)false);
        }
        if (detail.get("specialMaterials") == null) {
            detail.put("specialMaterials", (Object)false);
        }
        if (detail.get("virtualPart") == null) {
            detail.put("virtualPart", (Object)false);
        }
        if (detail.getDirectProduction() == null) {
            detail.setDirectProduction(Integer.valueOf(0));
        }
        if (detail.get("demandConsolidation") == null) {
            detail.put("demandConsolidation", (Object)0);
        }
        if (detail.get("demandConsolidationType") == null) {
            detail.put("demandConsolidationType", (Object)0);
        }
        if (detail.get("demandConsolidationType") == null) {
            detail.put("demandConsolidationType", (Object)0);
        }
        if (detail.get("demandConsolidationUnit") == null) {
            detail.put("demandConsolidationUnit", (Object)0);
        }
        if (detail.get("demandConsolidationNumber") == null) {
            detail.put("demandConsolidationNumber", (Object)0);
        }
        if (detail.get("demandConsolidationDateType") == null) {
            detail.put("demandConsolidationDateType", (Object)0);
        }
        if (detail.get("logisticsRelated") == null) {
            detail.put("logisticsRelated", (Object)false);
        }
        if (detail.get("weighingMode") == null) {
            detail.put("weighingMode", (Object)0);
        }
        if (detail.get("reviewGrossWeight") == null) {
            detail.put("reviewGrossWeight", (Object)false);
        }
        if (detail.get("specialCarTransport") == null) {
            detail.put("specialCarTransport", (Object)false);
        }
        if (detail.getValueManageType() == null) {
            detail.setValueManageType(Short.valueOf((short)0));
        }
        if (detail.getCheckByBatch() == null) {
            detail.setCheckByBatch(Boolean.valueOf(false));
        }
        if (detail.getSaleStyle() == null) {
            detail.setSaleStyle("1");
        }
        if (detail.getEnableSubscribe() == null) {
            detail.setEnableSubscribe(Boolean.valueOf(false));
        }
        if (detail.getEnableDeposit() == null) {
            detail.setEnableDeposit(Boolean.valueOf(false));
        }
        if (detail.getIEnableCyclePurchase() == null) {
            detail.setIEnableCyclePurchase(Boolean.valueOf(false));
        }
        if (detail.getIsRecommend() == null) {
            detail.setIsRecommend(Boolean.valueOf(false));
        }
        if (detail.getAllowStorePurchase() == null) {
            detail.setAllowStorePurchase(Boolean.valueOf(true));
        }
        if (detail.getIsSaleInOfflineStore() == null) {
            detail.setIsSaleInOfflineStore(Boolean.valueOf(true));
        }
        if (detail.getIsPriceChangeAllowed() == null) {
            detail.setIsPriceChangeAllowed(Boolean.valueOf(false));
        }
        if (detail.getIsOfflineStoreOrder() == null) {
            detail.setIsOfflineStoreOrder(Boolean.valueOf(true));
        }
        if (detail.getIsOfflineStoreReturn() == null) {
            detail.setIsOfflineStoreReturn(Boolean.valueOf(true));
        }
        if (detail.getRetailPriceDimension() == null) {
            detail.setRetailPriceDimension(Short.valueOf((short)1));
        }
        if (detail.getDeliverQuantityChange() == null) {
            detail.setDeliverQuantityChange(Short.valueOf((short)1));
        }
        if (detail.getIsProcess() == null) {
            detail.setIsProcess(Boolean.valueOf(false));
        }
        if (detail.getIsMaterial() == null) {
            detail.setIsMaterial(Boolean.valueOf(false));
        }
        if (detail.getIsWeight() == null) {
            detail.setIsWeight(Boolean.valueOf(false));
        }
        if (product.getProductFamily() == null) {
            product.setProductFamily(Integer.valueOf(0));
        }
        if (detail.getIsDisplayPrice() == null) {
            detail.setIsDisplayPrice(Boolean.valueOf(true));
        }
        if (detail.getIStatus() == null) {
            detail.setIStatus(Boolean.valueOf(false));
        }
        if (detail.getIUOrderStatus() == null) {
            detail.setIUOrderStatus(Boolean.valueOf(false));
        }
        if (product.getSalesAndOperations() == null) {
            product.setSalesAndOperations(Integer.valueOf(0));
        }
        if (product.getIsRegistrationManager() == null) {
            product.setIsRegistrationManager(Boolean.valueOf(false));
        }
        if (product.getIsAuthorizationManager() == null) {
            product.setIsAuthorizationManager(Boolean.valueOf(false));
        }
        if (product.getEnableAssistUnit() == null) {
            product.setIsAuthorizationManager(Boolean.valueOf(false));
        }
        if (detail.get("stopstatus") == null) {
            detail.put("stopstatus", (Object)false);
        }
        if (product.getIsOptionalMaterial() == null) {
            product.setIsOptionalMaterial(Integer.valueOf(0));
        }
        if (product.getIsDerivedMaterial() == null) {
            product.setIsDerivedMaterial(Integer.valueOf(0));
        }
    }

    public void checkAndSetProductOrg(Product product) {
        List assistUnitData;
        ArrayList<String> orgIdList = new ArrayList<String>();
        ArrayList<String> orgCodeList = new ArrayList<String>();
        if (product.get("orgId") != null) {
            orgIdList.add(product.get("orgId").toString());
        } else if (product.get("orgId_Code") != null) {
            orgCodeList.add(product.get("orgId_Code").toString());
        }
        if (product.get("productOrgs") != null) {
            List productOrgs = (List)product.get("productOrgs");
            productOrgs.forEach(applyRange -> {
                if (applyRange.get("orgId") != null && StringUtils.hasText((String)applyRange.get("orgId").toString())) {
                    orgIdList.add(applyRange.get("orgId").toString());
                } else if (applyRange.get("orgId_code") != null && StringUtils.hasText((String)applyRange.get("orgId_code").toString())) {
                    orgCodeList.add(applyRange.get("orgId_code").toString());
                }
            });
        }
        List funcOrgesByCode = new ArrayList();
        List funcOrgesById = new ArrayList();
        if (!CollectionUtils.isEmpty(orgCodeList)) {
            funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
        }
        if (!CollectionUtils.isEmpty(orgIdList)) {
            funcOrgesById = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIdList).withEnabled());
        }
        ArrayList<OrgUnitDTO> adminOrges = new ArrayList<OrgUnitDTO>();
        if (!CollectionUtils.isEmpty(funcOrgesByCode)) {
            adminOrges.addAll(funcOrgesByCode);
        }
        if (!CollectionUtils.isEmpty(funcOrgesById)) {
            adminOrges.addAll(funcOrgesById);
        }
        if (CollectionUtils.isEmpty(adminOrges)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800887);
        }
        if (product.containsKey((Object)"code") && product.get("code") != null) {
            product.put("code", (Object)product.get("code").toString().trim());
        }
        if (product.containsKey((Object)"orgId") && product.get("orgId") != null || product.containsKey((Object)"orgId_Code") && product.get("orgId_Code") != null) {
            OrgUnitDTO adminOrg = new OrgUnitDTO();
            if (product.get("orgId") != null) {
                adminOrg = this.judgeData(product.get("orgId").toString(), adminOrges);
            } else if (product.get("orgId_Code") != null) {
                adminOrg = this.judgeData(product.get("orgId_Code").toString(), adminOrges);
            }
            if (adminOrg == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801260, new Object[]{product.get("orgId").toString()});
            }
            if (product.get("productOrgs") != null && ((List)product.get("productOrgs")).size() > 0) {
                boolean oradminOrg = false;
                List applyRanges = ((List)product.get("productOrgs")).stream().filter(p -> p.containsKey("orgId") && this.judgeData(p.get("orgId").toString(), adminOrges) != null || p.containsKey("orgId_code") && this.judgeData(p.get("orgId_code").toString(), adminOrges) != null).collect(Collectors.toList());
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
                product.put("productOrgs", applyRanges);
            } else {
                final ProductApplyRange tempData = new ProductApplyRange();
                tempData.setRangeType(Integer.valueOf(1));
                tempData.setIsCreator(Boolean.valueOf(true));
                tempData.setIsApplied(Boolean.valueOf(true));
                tempData.setOrgId(adminOrg.getId());
                tempData.setEntityStatus(EntityStatus.Insert);
                product.put("productOrgs", (Object)new ArrayList<ProductApplyRange>(){
                    {
                        this.add(tempData);
                    }
                });
            }
        }
        if (product.get("productAssistUnitExchanges") != null && ((List)product.get("productAssistUnitExchanges")).size() > 0 && !CollectionUtils.isEmpty(assistUnitData = ((List)product.get("productAssistUnitExchanges")).stream().filter(m -> m.get("assistUnit") != null).collect(Collectors.toList()))) {
            product.put("productAssistUnitExchanges", assistUnitData.stream().filter(UPCFunctionUtils.distinctByKey(o -> o.get("assistUnit"))).collect(Collectors.toList()));
        }
    }

    public void checkAndSetProductApplyOrg(Product product) {
        List list;
        ArrayList<String> orgIdList = new ArrayList<String>();
        ArrayList<String> orgCodeList = new ArrayList<String>();
        if (product.get("orgId") != null) {
            orgIdList.add(product.get("orgId").toString());
        } else if (product.get("orgId_Code") != null) {
            orgCodeList.add(product.get("orgId_Code").toString());
        }
        if (product.get("productOrgs") != null) {
            List productOrgs = (List)product.get("productOrgs");
            productOrgs.forEach(applyRange -> {
                if (applyRange.get("orgId") != null) {
                    orgIdList.add(applyRange.get("orgId").toString());
                } else if (applyRange.get("orgId_code") != null) {
                    orgCodeList.add(applyRange.get("orgId_code").toString());
                }
            });
        }
        List funcOrgesByCode = new ArrayList();
        List funcOrgesById = new ArrayList();
        if (!CollectionUtils.isEmpty(orgCodeList)) {
            funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
        }
        if (!CollectionUtils.isEmpty(orgIdList)) {
            funcOrgesById = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIdList).withEnabled());
        }
        ArrayList<OrgUnitDTO> adminOrges = new ArrayList<OrgUnitDTO>();
        if (!CollectionUtils.isEmpty(funcOrgesByCode)) {
            adminOrges.addAll(funcOrgesByCode);
        }
        if (!CollectionUtils.isEmpty(funcOrgesById)) {
            adminOrges.addAll(funcOrgesById);
        }
        if (CollectionUtils.isEmpty(adminOrges)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800887);
        }
        if (product.containsKey((Object)"code") && product.get("code") != null) {
            product.put("code", (Object)product.get("code").toString().trim());
        }
        if (product.containsKey((Object)"orgId") && product.get("orgId") != null || product.containsKey((Object)"orgId_Code") && product.get("orgId_Code") != null) {
            OrgUnitDTO adminOrg = new OrgUnitDTO();
            if (product.get("orgId") != null) {
                adminOrg = this.judgeData(product.get("orgId").toString(), adminOrges);
            } else if (product.get("orgId_Code") != null) {
                adminOrg = this.judgeData(product.get("orgId_Code").toString(), adminOrges);
            }
            if (adminOrg == null) {
                String createOrg = product.get("orgId") != null ? product.get("orgId").toString() : product.get("orgId_Code").toString();
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801260, new Object[]{createOrg});
            }
            if (product.get("productOrgs") != null && ((List)product.get("productOrgs")).size() > 0) {
                boolean oradminOrg = false;
                List list2 = ((List)product.get("productOrgs")).stream().filter(p -> p.containsKey("orgId") && this.judgeData(p.get("orgId").toString(), adminOrges) != null || p.containsKey("orgId_code") && this.judgeData(p.get("orgId_code").toString(), adminOrges) != null).collect(Collectors.toList());
                for (Map range : list2) {
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
                    list2.add(tempData);
                }
                product.put("productOrgs", list2);
            } else {
                final ProductApplyRange tempData = new ProductApplyRange();
                tempData.setRangeType(Integer.valueOf(1));
                tempData.setIsCreator(Boolean.valueOf(true));
                tempData.setIsApplied(Boolean.valueOf(true));
                tempData.setOrgId(adminOrg.getId());
                tempData.setEntityStatus(EntityStatus.Insert);
                product.put("productOrgs", (Object)new ArrayList<ProductApplyRange>(){
                    {
                        this.add(tempData);
                    }
                });
            }
        }
        HashMap<String, OrgUnitDTO> orgUnitDTOHashMap = new HashMap<String, OrgUnitDTO>(adminOrges.size());
        for (OrgUnitDTO orgUnitDTO : adminOrges) {
            orgUnitDTOHashMap.put(orgUnitDTO.getId(), orgUnitDTO);
        }
        OrgUnitDTO creatorOrgId = (OrgUnitDTO)orgUnitDTOHashMap.get(product.getOrgId());
        product.put("orgId_Code", (Object)creatorOrgId.getCode());
        product.put("orgId_Name", (Object)creatorOrgId.getName());
        for (HashMap applyRange2 : (List)product.get("productOrgs")) {
            OrgUnitDTO orgUnitDTO = (OrgUnitDTO)orgUnitDTOHashMap.get(applyRange2.get("orgId"));
            applyRange2.put("orgCode", orgUnitDTO.getCode());
            applyRange2.put("orgName", orgUnitDTO.getName());
        }
        if (product.get("productAssistUnitExchanges") != null && ((List)product.get("productAssistUnitExchanges")).size() > 0 && !CollectionUtils.isEmpty(list = ((List)product.get("productAssistUnitExchanges")).stream().filter(m -> m.get("assistUnit") != null).collect(Collectors.toList()))) {
            product.put("productAssistUnitExchanges", list.stream().filter(UPCFunctionUtils.distinctByKey(o -> o.get("assistUnit"))).collect(Collectors.toList()));
        }
    }

    private OrgUnitDTO judgeData(String orgidOrCode, List<OrgUnitDTO> adminOrgs) {
        OrgUnitDTO adminOrg = new OrgUnitDTO();
        if (orgidOrCode != null) {
            adminOrg = adminOrgs.stream().filter(m -> m.getId().equals(orgidOrCode) || m.getCode().equals(orgidOrCode)).findFirst().orElse(null);
        }
        return adminOrg;
    }

    public List<Map> getTransTypeForProduct() throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"service_code").eq((Object)"pc_product"), QueryCondition.name((String)"sysid").eq((Object)ApplicationCodeConstant.getApplicationCodeByFullName((String)"pc.product.Product")), QueryCondition.name((String)"form_id").eq((Object)"PC.pc_product")}));
        return MetaDaoHelper.query((String)"bd.bill.BillTypeVO", (QuerySchema)querySchema, (String)"transtype");
    }

    public List<Map> getTransTypeName(List<Map> billTypeVOList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"billtype_id").eq(billTypeVOList.get(0).get("id")), QueryCondition.name((String)"code").eq((Object)"SYCSR002")}));
        List transTypeList = MetaDaoHelper.query((String)"bd.bill.TransType", (QuerySchema)querySchema, (String)"transtype");
        return transTypeList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void checkOptionalMaterial(final Product product) throws Exception {
        Iterator iterator;
        HashSet<Long> optionMaterialOption;
        HashSet<Long> optionalMaterialProp;
        HashSet<Long> derivedMaterial;
        HashSet<Long> derivedMaterialProp;
        block22: {
            block21: {
                if (product == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
                }
                if (product.getIsOptionalMaterial() == null) return;
                if (!"0".equals(product.getIsOptionalMaterial().toString())) break block21;
                if (product.getIsDerivedMaterial() == null) return;
                if ("1".equals(product.getIsDerivedMaterial().toString())) {
                    if (product.getOptionalMaterialId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800696);
                    }
                    QueryConditionGroup productQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getOptionalMaterialId())});
                    QuerySchema schema = QuerySchema.create().addSelect("isOptionalMaterial, productTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{productQueryConditionGroup}));
                    final Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
                    if (productMap == null || productMap.isEmpty()) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800702);
                    if (productMap.get("isOptionalMaterial") != null && "0".equals(productMap.get("isOptionalMaterial").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800697);
                    }
                    if (productMap.get("productTemplate") == null) {
                        if (product.getProductTemplate() == null) return;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800698);
                    }
                    if (product.getProductTemplate() == null || productMap.get("productTemplate").toString().equals(product.getProductTemplate().toString())) return;
                    QueryConditionGroup tplQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())});
                    QuerySchema tplSchema = QuerySchema.create().addSelect("isOptionalTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{tplQueryConditionGroup}));
                    Map tpl = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)tplSchema);
                    if (tpl == null || tpl.isEmpty()) return;
                    if (tpl.get("isOptionalTemplate") != null && "1".equals(tpl.get("isOptionalTemplate").toString())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_OPTIONAL_NO_PRODUCT_TEMPLATE_CHOOSE_ERROR);
                    }
                    ArrayList<Long> productTemplate = new ArrayList<Long>(){
                        {
                            this.add(product.getProductTemplate());
                            this.add((Long)productMap.get("productTemplate"));
                        }
                    };
                    QueryConditionGroup tplCharacterQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").in((Collection)productTemplate)});
                    QuerySchema tplCharacterSchema = QuerySchema.create().addSelect("template,characteristicsType,character").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{tplCharacterQueryConditionGroup}));
                    List tplCharacter = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)tplCharacterSchema);
                    if (CollectionUtils.isEmpty((Collection)tplCharacter)) {
                        return;
                    }
                    derivedMaterialProp = new HashSet<Long>(tplCharacter.size());
                    derivedMaterial = new HashSet<Long>(tplCharacter.size());
                    optionalMaterialProp = new HashSet<Long>(tplCharacter.size());
                    optionMaterialOption = new HashSet<Long>(tplCharacter.size());
                    iterator = tplCharacter.iterator();
                    break block22;
                } else {
                    if (!"0".equals(product.getIsDerivedMaterial().toString()) || product.getOptionalMaterialId() == null) return;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800703);
                }
            }
            if (!"1".equals(product.getIsOptionalMaterial().toString())) return;
            if (product.getIsDerivedMaterial() != null && ("1".equals(product.getIsDerivedMaterial().toString()) || product.getOptionalMaterialId() != null)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800704);
            }
            if (product.getProductTemplate() == null) return;
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())});
            QuerySchema schema = QuerySchema.create().addSelect("isOptionalTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
            Map map = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
            if (map == null || map.get("isOptionalTemplate") == null || !"0".equals(map.get("isOptionalTemplate").toString())) return;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801261);
        }
        while (iterator.hasNext()) {
            Map map = (Map)iterator.next();
            if (product.getProductTemplate().toString().equals(map.get("template").toString())) {
                if ("1".equals(map.get("characteristicsType").toString())) {
                    derivedMaterialProp.add((Long)map.get("character"));
                    derivedMaterial.add((Long)map.get("character"));
                    continue;
                }
                if (!"3".equals(map.get("characteristicsType").toString())) continue;
                derivedMaterial.add((Long)map.get("character"));
                continue;
            }
            if ("1".equals(map.get("characteristicsType").toString())) {
                optionalMaterialProp.add((Long)map.get("character"));
                continue;
            }
            if (!"4".equals(map.get("characteristicsType").toString())) continue;
            optionMaterialOption.add((Long)map.get("character"));
        }
        if (!CollectionUtils.isEmpty(optionalMaterialProp)) {
            for (Long aLong : optionalMaterialProp) {
                if (derivedMaterialProp.contains(aLong)) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800699);
            }
        }
        if (CollectionUtils.isEmpty(optionMaterialOption)) return;
        for (Long aLong : optionMaterialOption) {
            if (derivedMaterial.contains(aLong)) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800700);
        }
    }

    public void checkInspectionType(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (detail.get("inspectionType") != null) {
            if (detail.get("inspectionType").equals(0) && detail.getWarehousingByResult() != null && detail.getWarehousingByResult().equals(true)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800642);
            }
        } else if (detail.getWarehousingByResult() != null && detail.getWarehousingByResult().equals(true)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801262);
        }
    }

    public void checkIsDisplayPrice(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (detail.getIsDisplayPrice() != null && detail.getIsDisplayPrice().equals(true) && detail.getPriceAreaMessage() != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800644);
        }
    }

    public void addRowNumForProductSubData(Product product) {
        int i;
        if (product.get("productOrgs") != null) {
            List productOrgs = (List)product.get("productOrgs");
            for (i = 0; i < productOrgs.size(); ++i) {
                ((Map)productOrgs.get(i)).put("poiExcelRowNum", i);
            }
        }
        if (product.get("productAssistUnitExchanges") != null) {
            List productAssistUnitExchanges = (List)product.get("productAssistUnitExchanges");
            for (i = 0; i < productAssistUnitExchanges.size(); ++i) {
                ((Map)productAssistUnitExchanges.get(i)).put("poiExcelRowNum", i);
            }
        }
        if (product.get("productTags") != null) {
            List productTags = (List)product.get("productTags");
            for (i = 0; i < productTags.size(); ++i) {
                ((Map)productTags.get(i)).put("poiExcelRowNum", i);
            }
        }
        if (product.get("productAssistClasses") != null) {
            List productAssistClasses = (List)product.get("productAssistClasses");
            for (i = 0; i < productAssistClasses.size(); ++i) {
                ((Map)productAssistClasses.get(i)).put("poiExcelRowNum", i);
            }
        }
        if (product.get("productLoadWays") != null) {
            List productLoadWays = (List)product.get("productLoadWays");
            for (i = 0; i < productLoadWays.size(); ++i) {
                ((Map)productLoadWays.get(i)).put("poiExcelRowNum", i);
            }
        }
    }

    public void handleDataSavePriority(ProductApiVO dto) {
        if (dto.getPurchaseClass() != null) {
            dto.setPurchaseClassCode(null);
            dto.setPurchaseClassName(null);
        } else if (StringUtil.isNotEmpty((String)dto.getPurchaseClassCode())) {
            dto.setPurchaseClassName(null);
        }
    }

    public void checkManageOrg(Product product) throws Exception {
        List<String> orgIds;
        if (!(this.iupcControlRuleService.checkSingleOrg().booleanValue() || product.getOrgId() == null || !CollectionUtils.isEmpty(orgIds = this.iupcControlRuleService.getUserOrgAndVoucherManageOrg("pc.product.Product", "pc_product")) && orgIds.contains(product.getOrgId()))) {
            String msg = product.getOrgId();
            if (product.get("orgId_Code") != null) {
                msg = product.get("orgId_Code").toString();
            } else if (product.get("orgId_Name") != null) {
                msg = product.get("orgId_Name").toString();
            }
            throw new CoreDocBusinessException(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D9B28EE05E00007", (String)"\u6ca1\u6709\u5f53\u524d\u7ba1\u7406\u7ec4\u7ec7[{0}]\u7684\u7ec4\u7ec7\u6743\u9650\u6216\u8be5\u7ba1\u7406\u7ec4\u7ec7\u6ca1\u6709\u6863\u6848\u7ba1\u7406\u6743\uff0c\u8bf7\u68c0\u67e5\u5206\u7ea7\u7ba1\u63a7\u662f\u5426\u5f00\u542f\u6863\u6848\u7ba1\u7406\u6743\uff01"), msg));
        }
        if (product.productOrgs() != null) {
            Optional<ProductApplyRange> orgs = product.productOrgs().stream().filter(m -> m.getIsCreator().equals(true)).findAny();
            if (!orgs.isPresent()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_CREATE_ORG_CODE, new Object[]{product.getCode()});
            }
            if (product.getOrgId() == null) {
                product.setOrgId(orgs.get().getOrgId());
            }
        }
    }
}

