/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.dto.CheckMCSetDTO
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.model.OptionData
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSKUSpecItem
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.utils;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.dto.CheckMCSetDTO;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.model.OptionData;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.upc.billrule.product.ProductSKUAutoCodeRule;
import com.yonyoucloud.upc.billrule.product.ProductSKUDelCheckRule;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSKUSpecItem;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum;
import com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto;
import com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class ProductUtil {
    private static final Logger log = LoggerFactory.getLogger(ProductUtil.class);
    public static final String PRODUCTSKU_CLASSNAME = "pc.product.ProductSKU";
    public static final String PRODUCTRANGE_CLASS_NAME = "pc.product.ProductApplyRange";
    public static final String FORCE_CONTROL_APPLY_RANGE = "forceControlApplyRange";
    private static Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]*$");

    private ProductUtil() {
    }

    public static <T1 extends BizObject, T2 extends BizObject> void exchangeFromExtend(T1 sourceObj, T2 destObj) {
        for (Map.Entry entry : sourceObj.entrySet()) {
            destObj.put(entry.getKey().toString(), entry.getValue());
        }
    }

    public static boolean checkOpenOption(String optionName) throws Exception {
        OptionData option = OptionUtils.getOptionByName((String)optionName, null);
        log.info("ProductUtil.checkOpenOption() get option [{}], result:[{}]", (Object)optionName, null == option ? null : option.getValue());
        return null != option && ("1".equals(option.getValue().toString()) || "true".equals(option.getValue().toString()));
    }

    public static boolean checkOpenOption(String domain, String optionName) throws Exception {
        if (domain == null || "".equals(domain.trim())) {
            return ProductUtil.checkOpenOption(optionName);
        }
        if (optionName.contains(",")) {
            String[] options;
            for (String option : options = optionName.split(",")) {
                Object optionValue = OptionUtils.getOptionByName((String)domain, (String)option, null);
                if (null == optionValue || !"1".equals(optionValue.toString()) && !"true".equals(optionValue.toString())) continue;
                return true;
            }
        } else {
            Object optionValue = OptionUtils.getOptionByName((String)domain, (String)optionName, null);
            log.info("ProductUtil.checkOpenOption_domain() get option [{}], result:[{}]", (Object)optionName, null == optionValue ? null : optionValue);
            return null != optionValue && ("1".equals(optionValue.toString()) || "true".equals(optionValue.toString()));
        }
        return false;
    }

    public static RuleRegister getBillRuleRegister(String billNum, String action, String ruleId, String domain) {
        RuleRegister register = new RuleRegister();
        register.setBillnum(billNum);
        register.setAction(action);
        register.setRuleId(ruleId);
        register.setDomain(domain);
        register.setIorder(Float.valueOf("10"));
        register.setAsyn(false);
        return register;
    }

    public static ProductApplyRange buildProductApplyRange(Long productId, Integer rangeType, String orgId, Long shopId) {
        ProductApplyRange range = new ProductApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.setProductId(productId);
        range.setRangeType(rangeType);
        range.setOrgId(orgId);
        range.setCustomerId(shopId);
        range.setShopId(Long.valueOf(null == shopId ? -1L : shopId));
        range.setIsCreator(Boolean.valueOf(false));
        range.setIsApplied(Boolean.valueOf(false));
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setAllocatorName(AppContext.getCurrentUser().getName());
        range.setAllocatorId((Long)AppContext.getCurrentUser().getId());
        range.setAllocateTime(new Date());
        range.set("ytenantId", AppContext.getYTenantId());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public static ProductApplyRangeGroup buildProductApplyRangeGroup(Long productId) {
        ProductApplyRangeGroup productApplyRangeGroup = new ProductApplyRangeGroup();
        productApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
        productApplyRangeGroup.setProductId(productId);
        productApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
        productApplyRangeGroup.setTenant((Long)AppContext.getCurrentUser().getTenant());
        productApplyRangeGroup.set("ytenantId", AppContext.getYTenantId());
        return productApplyRangeGroup;
    }

    public static CheckMCSetDTO getCheckMCSetDTO(String sysId, String docType, String tenantId, List<String> orgIds, Boolean isMc, Boolean isShare) {
        CheckMCSetDTO dto = new CheckMCSetDTO();
        dto.setSysid(sysId);
        dto.setDoctype(docType);
        dto.setTenantid(tenantId);
        dto.setOrglist(orgIds);
        dto.setIsmc(isMc);
        dto.setIsshare(isShare);
        return dto;
    }

    public static BillContext getBillContext(String billNum, String name, String fullName, String action) {
        BillContext context = new BillContext();
        context.setBillnum(billNum);
        context.setName(name);
        context.setCardKey(billNum);
        context.setFullname(fullName);
        context.setSubid("PC");
        context.setBilltype("Archive");
        context.setEntityCode(billNum);
        context.setbMain(Boolean.valueOf(true));
        context.setAction(action);
        context.setbRowAuthControl(false);
        context.setRowAuthControled(false);
        context.setExcludeRelated(false);
        context.setSupportBpm(false);
        context.setBpmInited(false);
        context.setTransaction(false);
        context.setI18ndoc(false);
        context.setIsBizFlow(Boolean.valueOf(false));
        return context;
    }

    public static BillDataDto getBillDataDto(String billNum, String action, Object data) {
        BillDataDto dataDto = new BillDataDto();
        dataDto.setBillnum(billNum);
        dataDto.setAction(action);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(data);
        dataDto.setData(list);
        dataDto.setIsIncludeMeta(false);
        dataDto.setIsOnlyTotal(false);
        dataDto.setIsOnlyCount(false);
        dataDto.setPublish(false);
        dataDto.setIsPrint(false);
        dataDto.setIsMasterOrg(false);
        dataDto.setFromApi(false);
        dataDto.setIsSum(false);
        dataDto.setIsDistinct(false);
        dataDto.setIsFromKanban(false);
        return dataDto;
    }

    public static Map<String, Object> getParamMap(BillDataDto dto) {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("param", dto);
        return param;
    }

    public static ProductSKU generateSKUByFixedSpecs(Long productId, String productName, Long rangeId, Map<String, String> fixedSpecs, Map<String, List<Map<String, Object>>> specItemsInDb, String skuNameModel, Map<String, Map<String, Object>> custValuesListMap, Long productTemplate) throws Exception {
        ProductSKU sku = new ProductSKU();
        sku.setIsSKU(Integer.valueOf(1));
        sku.setId((Object)IdManager.getInstance().nextId());
        sku.setEntityStatus(EntityStatus.Insert);
        sku.setProductId(productId);
        String specIds = "";
        String specs = "";
        String specName = productName;
        String skuName = skuNameModel;
        String specCode = "";
        String skuNameAuto = "";
        String nameSpacer = ProductUtil.getNameSpacerBytemplateId(productTemplate);
        Map templateMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("productTemplate.involveSKUNaming as involveSKUNaming").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)})));
        if (templateMap.isEmpty() || ((Boolean)templateMap.get("involveSKUNaming")).booleanValue()) {
            specName = productName;
        }
        ArrayList<ProductSKUSpecItem> skuSpecItems = new ArrayList<ProductSKUSpecItem>();
        for (Map.Entry<String, String> entry : fixedSpecs.entrySet()) {
            sku.put(entry.getKey(), (Object)entry.getValue().trim());
            Map specItemData = null;
            if (custValuesListMap != null && !custValuesListMap.isEmpty()) {
                specItemData = custValuesListMap.get(entry.getKey() + "_" + entry.getValue().trim());
            }
            if (specItemData == null || specItemData.isEmpty()) {
                List<Map<String, Object>> specItems = specItemsInDb.get(entry.getKey());
                if (null == specItems || specItems.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800852, new Object[]{entry.getKey()});
                }
                Optional<Map> specItemName = specItems.stream().filter(m -> null != m.get("specItemName") && m.get("specItemName").toString().trim().equals(((String)entry.getValue()).trim())).findAny();
                if (!specItemName.isPresent()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808152, new Object[]{entry.getKey(), entry.getValue()});
                }
                specItemData = specItemName.get();
            }
            ProductSKUSpecItem skuSpecItem = new ProductSKUSpecItem();
            skuSpecItem.setSpecItemId(Long.valueOf(Long.parseLong(specItemData.get("specItemId").toString())));
            skuSpecItem.setSpecId(Long.valueOf(Long.parseLong(specItemData.get("specId").toString())));
            skuSpecItem.setProductId(productId);
            skuSpecItem.setSkuId((Long)sku.getId());
            skuSpecItem.setEntityStatus(EntityStatus.Insert);
            skuSpecItem.setId((Object)IdManager.getInstance().nextId());
            skuSpecItems.add(skuSpecItem);
            specIds = specIds + specItemData.get("specItemId").toString() + ";";
            skuName = "free10".equals(entry.getKey()) ? skuName.replace("free#10", nameSpacer + entry.getValue().trim()) : skuName.replace(entry.getKey(), nameSpacer + entry.getValue().trim());
            specs = specs + specItemData.get("specName").toString() + ":" + specItemData.get("specItemName").toString() + ";";
            String itemName = "";
            if (null != specItemData.get("specItemName")) {
                itemName = specItemData.get("specItemName").toString();
            }
            skuNameAuto = skuNameAuto + itemName;
            String itemCode = "";
            if (null != specItemData.get("specItemCode")) {
                itemCode = specItemData.get("specItemCode").toString();
            }
            specCode = specCode + itemCode;
        }
        sku.setName(specName + skuName);
        sku.setSpecIds(specIds.substring(0, specIds.length() - 1));
        sku.setSpecs(specs);
        sku.setProductSKUSpecItems(skuSpecItems);
        sku.set(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName(), (Object)skuNameAuto);
        sku.set(SkuAutoCodeFieldEnum.specCode.getFieldName(), (Object)specCode);
        ProductSKUExtend skuDetail = new ProductSKUExtend();
        skuDetail.setId((Object)IdManager.getInstance().nextId());
        skuDetail.setEntityStatus(EntityStatus.Insert);
        skuDetail.setSkuId((Long)sku.getId());
        skuDetail.setProductId(productId);
        skuDetail.setProductApplyRangeId(rangeId);
        skuDetail.setStopstatus(Boolean.valueOf(false));
        sku.setProductSKUDetail(skuDetail);
        return sku;
    }

    public static List<ProductSpecItem> generateProductSpecItemsByFixedSpecs(Long productId, Map<String, String> fixedSpecs, Map<String, List<Map<String, Object>>> specItemsInDb, List<Map<String, Object>> productSpecItemInDb, Map<String, Map<String, Object>> custValuesList) {
        ArrayList<ProductSpecItem> result = new ArrayList<ProductSpecItem>(fixedSpecs.keySet().size());
        for (Map.Entry<String, String> entry : fixedSpecs.entrySet()) {
            Map specItem = null;
            if (custValuesList != null && !custValuesList.isEmpty()) {
                specItem = custValuesList.get(entry.getKey() + "_" + entry.getValue());
            }
            if (specItem == null || specItem.isEmpty()) {
                List<Map<String, Object>> specItems = specItemsInDb.get(entry.getKey());
                Optional<Map> optionalSpecItem = specItems.stream().filter(map -> map.get("specItemName").toString().equals(entry.getValue())).findAny();
                if (!optionalSpecItem.isPresent()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800853, new Object[]{entry.getKey(), entry.getValue()});
                }
                specItem = optionalSpecItem.get();
            }
            boolean isgenerate = false;
            if (null == productSpecItemInDb || productSpecItemInDb.isEmpty()) {
                isgenerate = true;
            } else {
                String specId = specItem.get("specId").toString();
                String specItemId = specItem.get("specItemId").toString();
                Optional<Map> optionalSpecItemIbDb = productSpecItemInDb.stream().filter(map -> map.get("iSpecId").toString().equals(specId) && map.get("lsSpecItems_id").toString().equals(specItemId)).findAny();
                if (!optionalSpecItemIbDb.isPresent()) {
                    isgenerate = true;
                }
            }
            if (!isgenerate) continue;
            ProductSpecItem productSpecItem = new ProductSpecItem();
            productSpecItem.setId((Object)IdManager.getInstance().nextId());
            productSpecItem.setEntityStatus(EntityStatus.Insert);
            productSpecItem.setProductId(productId);
            productSpecItem.setISpecId(Long.valueOf(Long.parseLong(specItem.get("specId").toString())));
            productSpecItem.setLsSpecItems_id(Long.valueOf(Long.parseLong(specItem.get("specItemId").toString())));
            productSpecItem.setSpecValue(entry.getValue());
            result.add(productSpecItem);
        }
        return result;
    }

    public static void addDistinctProductSKU(Map<Long, List<ProductSKU>> skus, Map<String, String> fixedSpecs, ProductSKU sku, String productCode, List<Map<String, Object>> productSKUInDb, Integer billnumMode, ProductSKUAutoCodeRule productSKUAutoCodeRule) throws Exception {
        if (null == skus || null == fixedSpecs || fixedSpecs.isEmpty() || null == sku || sku.isEmpty()) {
            return;
        }
        ArrayList<ProductSKU> skuList = new ArrayList<ProductSKU>();
        skuList.add(sku);
        if (skus.isEmpty() || !skus.keySet().contains(sku.getProductId())) {
            ProductUtil.autoGenerateProductSKUCode(productSKUInDb, null, (ProductSKU)skuList.get(0), productCode, true);
            skus.put(sku.getProductId(), skuList);
        } else {
            List<ProductSKU> productSKUs = skus.get(sku.getProductId());
            boolean isExists = false;
            for (ProductSKU map : productSKUs) {
                boolean isEqual = true;
                for (Map.Entry<String, String> entry : fixedSpecs.entrySet()) {
                    if (entry.getValue().trim().equals(map.get(entry.getKey()).toString().trim())) continue;
                    isEqual = false;
                    break;
                }
                if (!isEqual) continue;
                isExists = true;
                break;
            }
            if (!isExists) {
                Product productSave;
                if (null == skus.get(sku.getProductId())) {
                    if (billnumMode == null || billnumMode != null && Integer.parseInt(billnumMode.toString()) == 0) {
                        ProductUtil.autoGenerateProductSKUCode(productSKUInDb, null, (ProductSKU)skuList.get(0), productCode, true);
                    } else {
                        productSave = new Product();
                        productSave.setProductskus(skuList);
                        productSave.setEntityStatus(EntityStatus.Insert);
                        productSKUAutoCodeRule.skuBatchAutoCode(productSave, billnumMode);
                    }
                    skus.put(sku.getProductId(), skuList);
                } else {
                    if (billnumMode == null || Integer.parseInt(billnumMode.toString()) == 0) {
                        ProductUtil.autoGenerateProductSKUCode(productSKUInDb, skus.get(sku.getProductId()), sku, productCode, false);
                    } else {
                        productSave = new Product();
                        productSave.setProductskus(skuList);
                        productSave.setEntityStatus(EntityStatus.Insert);
                        productSKUAutoCodeRule.skuBatchAutoCode(productSave, billnumMode);
                    }
                    skus.get(sku.getProductId()).add(sku);
                }
            }
        }
    }

    public static ProductSKU findProductSKUBySpecs(List<ProductSKU> skus, Map<String, String> fixedSpecs) throws Exception {
        if (null == skus || null == fixedSpecs) {
            return null;
        }
        for (ProductSKU map : skus) {
            boolean isEqual = true;
            for (Map.Entry<String, String> entry : fixedSpecs.entrySet()) {
                if (entry.getValue().trim().equals(map.get(entry.getKey()).toString().trim())) continue;
                isEqual = false;
                break;
            }
            if (!isEqual) continue;
            return map;
        }
        return null;
    }

    public static void addDistinctProductSpecItem(Map<Long, List<ProductSpecItem>> specItemsInsert, Long productId, List<ProductSpecItem> specItemInsert) throws Exception {
        if (null == specItemsInsert || null == specItemInsert || specItemInsert.isEmpty()) {
            return;
        }
        if (specItemsInsert.isEmpty() || !specItemsInsert.keySet().contains(productId)) {
            specItemsInsert.put(productId, specItemInsert);
        } else {
            List<ProductSpecItem> specItems = specItemsInsert.get(productId);
            for (ProductSpecItem item : specItemInsert) {
                Optional<ProductSpecItem> any = specItems.stream().filter(map -> map.getISpecId().equals(item.getISpecId()) && map.getLsSpecItems_id().equals(item.getLsSpecItems_id())).findAny();
                if (any.isPresent()) continue;
                specItems.add(item);
            }
        }
    }

    private static void autoGenerateProductSKUCode(List<Map<String, Object>> productSKUInDb, List<ProductSKU> productSKUs, ProductSKU productSKU, String productCode, boolean checkDb) throws Exception {
        if (null == productSKUInDb || productSKUInDb.isEmpty()) {
            return;
        }
        AtomicInteger maxCode = new AtomicInteger(0);
        if (checkDb) {
            for (Map<String, Object> sku : productSKUInDb) {
                Integer value;
                String numberStr;
                String code;
                if (!sku.containsKey("code") || sku.get("code") == null || StringUtils.isEmpty((CharSequence)(code = sku.get("code").toString())) || code.length() <= 4 || !productCode.equals(code.substring(0, code.length() - 4)) || !NUMBER_PATTERN.matcher(numberStr = code.substring(code.length() - 4)).matches() || (value = Integer.valueOf(numberStr)) <= maxCode.get()) continue;
                maxCode.set(value);
            }
        } else {
            for (ProductSKU sku : productSKUs) {
                int value;
                String numberStr;
                String code;
                if (!sku.containsKey((Object)"code") || sku.get("code") == null || StringUtils.isEmpty((CharSequence)(code = sku.get("code").toString())) || code.length() <= 4 || !productCode.equals(code.substring(0, code.length() - 4)) || !NUMBER_PATTERN.matcher(numberStr = code.substring(code.length() - 4)).matches() || (value = Integer.parseInt(numberStr)) <= maxCode.get()) continue;
                maxCode.set(value);
            }
        }
        int val = maxCode.addAndGet(1);
        productSKU.setCode(productCode + StringUtils.leftPad((String)Integer.toString(val), (int)4, (char)'0'));
    }

    public static List<String> get10FixedFrees() {
        ArrayList<String> frees = new ArrayList<String>(10);
        for (int i = 1; i <= 10; ++i) {
            frees.add("free" + i);
        }
        return frees;
    }

    public static Long getNewTransactionId() {
        return IdManager.getInstance().nextId();
    }

    public static void checkCanDelSKU(Long id, Long productApplyRangeId) throws Exception {
        ProductSKU sku = new ProductSKU();
        sku.setId((Object)id);
        sku.put("productApplyRangeId", (Object)productApplyRangeId);
        BillDataDto dto = ProductUtil.getBillDataDto("pc_product", "skudelete", sku);
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("param", dto);
        ProductSKUDelCheckRule checkRule = (ProductSKUDelCheckRule)((Object)AppContext.getBean((String)"productSKUDelCheckRule"));
        BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408074B", (String)"\u5546\u54c1\u6863\u6848"), "pc.product.Product", "skudelete");
        RuleExecuteResult result = checkRule.execute(billContext, param);
    }

    public static int checkUserTyoe(LoginUser user) {
        int userType = -1;
        if (user != null && user.getUserType() != null) {
            switch (user.getUserType()) {
                case TenantAdmin: 
                case TenantEmployee: {
                    userType = 1;
                    break;
                }
                case TenantShopuser: 
                case JoinUser: {
                    userType = 2;
                    break;
                }
                case ShopAdminUser: 
                case ShopUser: {
                    userType = 3;
                    break;
                }
                default: {
                    userType = -1;
                }
            }
        }
        return userType;
    }

    public static List<Boolean> checkOpenOptions(Map<String, String> optionDomainMap) throws Exception {
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408074C", (String)"checkOpenOptions==\u300boptionDomainMap\uff1a") + optionDomainMap.toString());
        ArrayList<Boolean> results = new ArrayList<Boolean>(20);
        Set<Map.Entry<String, String>> entrySet = optionDomainMap.entrySet();
        for (Map.Entry<String, String> optionDomainEntry : entrySet) {
            boolean result = ProductUtil.checkOpenOption(optionDomainEntry.getValue(), optionDomainEntry.getKey());
            results.add(result);
        }
        log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080751", (String)"checkOpenOptions==\u300bresults\uff1a") + ((Object)results).toString());
        return results;
    }

    public static Boolean checkOpenOptionsOrResult(Map<String, String> optionDomainMap) throws Exception {
        List<Boolean> results = ProductUtil.checkOpenOptions(optionDomainMap);
        for (Boolean result : results) {
            if (!result.booleanValue()) continue;
            return true;
        }
        return false;
    }

    public static String Arrays2String(Object[] array, Character splitor) {
        if (array == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            if (ProductUtil.isNull(array[i])) continue;
            sb.append(array[i].toString());
            if (splitor == null || i >= array.length - 1) continue;
            sb.append(splitor);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean isNull(Object obj) {
        return null == obj || "".equals(obj.toString().trim());
    }

    public static List<Long> getDataPermission(String fullName) throws Exception {
        Map result;
        ArrayList<Long> ids = new ArrayList<Long>();
        List idList = new ArrayList();
        DataPermissionRequestDto requestDto = new DataPermissionRequestDto();
        requestDto.setEntityUri(fullName);
        requestDto.setSysCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)fullName));
        String[] fieldArgs = new String[]{"id"};
        requestDto.setFieldNameArgs(fieldArgs);
        requestDto.setYxyUserId(AppContext.getUserId().toString());
        requestDto.setYxyTenantId(AppContext.getTenantId().toString());
        requestDto.setHaveDetail(true);
        DataPermissionResponseDto res = AuthSdkFacadeUtils.getUserDataPermission((DataPermissionRequestDto)requestDto);
        if (res != null && !CollectionUtils.isEmpty((Collection)res.getDataPermissionMapList()) && !CollectionUtils.isEmpty((Map)(result = (Map)res.getDataPermissionMapList().get(0))) && result.get("values") != null) {
            idList = (List)result.get("values");
        }
        if (!CollectionUtils.isEmpty(idList)) {
            for (String id : idList) {
                ids.add(Long.valueOf(id));
            }
        }
        return ids;
    }

    public static String getNameSpacerBytemplateId(Long templateId) throws Exception {
        String nameSpacer = "";
        Map templateMap = ProductUtil.getTplMap(templateId);
        if (templateMap != null && !templateMap.isEmpty() && templateMap.containsKey("nameSpacer") && templateMap.get("nameSpacer") != null) {
            nameSpacer = ProductUtil.convertNameSpacer(templateMap.get("nameSpacer").toString());
        }
        nameSpacer = ProductUtil.convertNameSpacer(nameSpacer);
        return nameSpacer;
    }

    public static Map getTplMap(Long templateId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("nameSpacer, involveSKUNaming").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)templateId)}));
        Map templateMap = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
        return templateMap;
    }

    public static String convertNameSpacer(String nameSpacer) {
        if ("0".equals(nameSpacer)) {
            nameSpacer = " ";
        }
        if ("1".equals(nameSpacer)) {
            nameSpacer = "\u3001";
        }
        if ("2".equals(nameSpacer)) {
            nameSpacer = "/";
        }
        if ("3".equals(nameSpacer)) {
            nameSpacer = "\uff0c";
        }
        return nameSpacer;
    }

    public static String getSKUNameModelByProductId(Long templateId, ProductSKU sku, String nameSpacer) throws Exception {
        String skuName = "";
        String skuNameAutoCode = "";
        String skuCode = "";
        sku.set(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName(), (Object)skuNameAutoCode);
        sku.set(SkuAutoCodeFieldEnum.specCode.getFieldName(), (Object)skuCode);
        return skuName;
    }

    public static boolean checkOptionNames(List<String> optionNameList) throws Exception {
        List optionByValueList;
        if (!CollectionUtils.isEmpty(optionNameList) && !CollectionUtils.isEmpty((Collection)(optionByValueList = OptionUtils.getOptionByNames((String)"u8c-config", optionNameList, null)))) {
            List optionByValueResultList = optionByValueList.stream().filter(optionValue -> "true".equals(optionValue) || "1".equals(optionValue)).collect(Collectors.toList());
            return !CollectionUtils.isEmpty(optionByValueResultList);
        }
        return false;
    }

    public static boolean checkOptionNameList() {
        try {
            ArrayList<String> optionNameList = new ArrayList<String>(2);
            if (AppContext.getCurrentUser() != null) {
                optionNameList.add("app:ECCA");
            }
            return ProductUtil.checkOptionNames(optionNameList);
        }
        catch (Exception e) {
            log.error("invoke checkOptionNames error", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR);
        }
    }

    public static boolean isReferencedByDerivedMaterial(Long productId) throws Exception {
        QueryConditionGroup queryDerivedMaterialConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"optionalMaterialId").eq((Object)productId)});
        QuerySchema queryDerivedMaterialSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryDerivedMaterialConditionGroup);
        List derivedMatariaList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryDerivedMaterialSchema);
        return derivedMatariaList != null && derivedMatariaList.size() > 0;
    }

    public static void dealMutilField(Product product, String[] mutilFieldNames) {
        for (String mutilFieldName : mutilFieldNames) {
            BizObject mutilNames;
            Map map;
            if (product.get(mutilFieldName) != null && product.get(mutilFieldName) instanceof Map) {
                map = (Map)product.get(mutilFieldName);
                mutilNames = new BizObject();
                for (Map.Entry entry : map.entrySet()) {
                    mutilNames.put(entry.getKey().toString(), entry.getValue());
                }
                product.put(mutilFieldName, (Object)mutilNames);
            }
            if (product.detail() == null || product.detail().get(mutilFieldName) == null || !(product.detail().get(mutilFieldName) instanceof Map)) continue;
            map = (Map)product.detail().get(mutilFieldName);
            mutilNames = new BizObject();
            for (Map.Entry entry : map.entrySet()) {
                mutilNames.put(entry.getKey().toString(), entry.getValue());
            }
            product.detail().put(mutilFieldName, (Object)mutilNames);
        }
    }

    public static boolean getIsUpdateProductGlobalFields() {
        try {
            Object optionValue = OptionUtils.getOptionByName((String)"productcenter", (String)"isUpdateProductGlobalFields", (String)null);
            if (optionValue == null) {
                return false;
            }
            return BooleanUtil.isTrue((Object)optionValue.toString());
        }
        catch (Exception e) {
            log.error("getIsUpdateMerchantGlobalFields:" + e.getMessage(), (Throwable)e);
            return false;
        }
    }

    public static boolean getIgnoreMainOrgPermission(String serviceCode) {
        try {
            Object optionValue = OptionUtils.getOptionByName((String)"productcenter", (String)"ignoreMainOrgPermission", (String)null);
            if (optionValue == null) {
                return false;
            }
            if (StringUtils.isNotBlank((CharSequence)serviceCode)) {
                String[] serviceCodes;
                for (String serviceCodeItem : serviceCodes = optionValue.toString().split(",")) {
                    if (!serviceCodeItem.equals(serviceCode)) continue;
                    return true;
                }
            }
        }
        catch (Exception e) {
            log.error("getIgnoreMainOrgPermission:" + e.getMessage(), (Throwable)e);
            return false;
        }
        return false;
    }

    public static void checkProductReceiptName(Product product) {
        if (product.detail() != null) {
            if (product.detail().get("receiptName") != null && ProductUtil.beyondLength(product.detail().get("receiptName"), 100)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_NAME_LENGTH_ERROR);
            }
            if (product.detail().get("receiptSpec") != null && ProductUtil.beyondLength(product.detail().get("receiptSpec"), 40)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_SPEC_LENGTH_ERROR);
            }
            if (product.detail().get("receiptModel") != null && ProductUtil.beyondLength(product.detail().get("receiptModel"), 40)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_SPEC_LENGTH_ERROR);
            }
        }
        if (product.productApplyRange() != null && product.productApplyRange().size() > 0 && ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail() != null) {
            ProductApplyRangeDetail detail = ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail();
            if (detail.get("receiptName") != null && ProductUtil.beyondLength(detail.get("receiptName"), 100)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_NAME_LENGTH_ERROR);
            }
            if (detail.get("receiptSpec") != null && ProductUtil.beyondLength(detail.get("receiptSpec"), 40)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_SPEC_LENGTH_ERROR);
            }
            if (detail.get("receiptModel") != null && ProductUtil.beyondLength(detail.get("receiptModel"), 40)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_RECEIPT_SPEC_LENGTH_ERROR);
            }
        }
    }

    public static boolean beyondLength(Object mutilFieValue, int length) {
        if (mutilFieValue instanceof BizObject) {
            BizObject mutilFieValueBiz = (BizObject)mutilFieValue;
            LinkedList languageVOS = MultiLangContext.getInstance().getEnableLangVOs();
            for (LanguageVO languageVO : languageVOS) {
                String langVal = mutilFieValueBiz == null || mutilFieValueBiz.get(languageVO.getLangCode()) == null ? null : mutilFieValueBiz.get(languageVO.getLangCode()).toString();
                if (!StringUtils.isNotBlank(langVal) || !ProductUtil.strBeyondLength(langVal, length)) continue;
                return true;
            }
        } else if (mutilFieValue instanceof String) {
            return ProductUtil.strBeyondLength(mutilFieValue.toString(), length);
        }
        return false;
    }

    private static boolean strBeyondLength(String str, int length) {
        if (str == null) {
            return false;
        }
        return str.length() > length;
    }

    public static boolean AutoGenerateRangeData(Product product) {
        return BooleanUtil.isTrue((Object)product.get("autoGenerateRangeData_"));
    }

    public static boolean ForceControlApplyRange(Product product) {
        return BooleanUtil.isTrue((Object)product.get(FORCE_CONTROL_APPLY_RANGE));
    }
}

