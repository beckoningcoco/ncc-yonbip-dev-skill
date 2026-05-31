/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.datatransfer.DataTransferHelper
 *  com.yonyou.yonbip.iuap.xport.common.api.meta.NeedTranslateFields
 *  com.yonyou.yonbip.iuap.xport.common.model.EntityHierarchy
 *  com.yonyou.yonbip.iuap.xport.importing.data.ImportBatchData
 *  com.yonyou.yonbip.iuap.xport.importing.processor.ImportEventExtendProcessor
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventContext
 *  com.yonyou.yonbip.iuap.xport.mdd.common.meta.MddMetaDataProviderImpl
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.data.custcategory.CustCategoryDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.datatransfer.DataTransferHelper;
import com.yonyou.yonbip.iuap.xport.common.api.meta.NeedTranslateFields;
import com.yonyou.yonbip.iuap.xport.common.model.EntityHierarchy;
import com.yonyou.yonbip.iuap.xport.importing.data.ImportBatchData;
import com.yonyou.yonbip.iuap.xport.importing.processor.ImportEventExtendProcessor;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventContext;
import com.yonyou.yonbip.iuap.xport.mdd.common.meta.MddMetaDataProviderImpl;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.data.custcategory.CustCategoryDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductImportSubDataParsingService;
import com.yonyoucloud.upc.service.utils.CoredocDataSourceUtils;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="importDealDataParsingHandle")
public class ImportDealDataParsingHandle
implements ImportEventExtendProcessor {
    public static final String IMPORT_DEAL_DATA_PARSING_HANDLE = "importDealDataParsingHandle";
    @Autowired
    private ProductImportSubDataParsingService dealDataService;
    @Autowired
    private ProductCheckService productCheckService;
    @Autowired
    @Lazy
    private MddMetaDataProviderImpl metaProvider;
    @Autowired
    private CustCategoryDao custCategoryDao;

    public void beforeTranslate(ImportBatchData importBatchData, ImportEventBO importEventBO) {
        ImportEventContext importContext = importEventBO.getImportContextDto();
        List mapList = importBatchData.getDataList();
        List data = importBatchData.getData();
        if ("pc_productimport".equals(importContext.getBillno())) {
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                for (Map productMap : mapList) {
                    productMap.put("isBatch", 1);
                    if (importContext.getImportMode() == null || !"2".equals(importContext.getImportMode().toString())) {
                        productMap.put("source", ProductSource.ExcelImport.getValue());
                    }
                    Product product = (Product)productMap;
                    try {
                        this.productCheckService.commonCheckForImport(product);
                    }
                    catch (BusinessException e) {
                        this.dealDataService.addOneErrorMessages(productMap, e.getMessage());
                    }
                }
                this.dealDataService.dealAssistUnitString(mapList);
                this.dealDataService.dealProductTagsForNewSDK(mapList);
                this.dealDataService.dealProductLoadWay(mapList);
                this.dealDataService.dealAssistClasses(mapList);
                this.dealDataService.dealBarCodes(mapList);
                this.dealDataService.dealProductDescriptionForNewSDK(mapList);
                this.dealDataService.dealProductOrgs(mapList);
            }
        } else if ("pc_producttpl_import".equals(importContext.getBillno())) {
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                for (Map producttplMap : mapList) {
                    producttplMap.remove("productPropCharacters");
                    producttplMap.remove("optionCharacters");
                    producttplMap.remove("skuCharacters");
                }
                this.dealDataService.dealChildrenEntityStatus(mapList, this.getEntityFields("pc_producttpl_import"));
            }
        } else if ("pc_productdetail_import".equals(importContext.getBillno())) {
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                Iterator iterator = mapList.iterator();
                while (iterator.hasNext()) {
                    Map productMap = (Map)iterator.next();
                    Product product = (Product)productMap;
                    try {
                        if (product.detail() == null) continue;
                        ProductExtend productDetail = product.detail();
                        this.productCheckService.checkDecimalForCommonCheck(productDetail);
                    }
                    catch (BusinessException e) {
                        this.dealDataService.addOneErrorMessages(productMap, e.getMessage());
                        iterator.remove();
                    }
                }
                this.dealDataService.dealProductTagsForNewSDK(mapList);
            }
        } else {
            this.dealMerchantImport(importBatchData, importContext);
        }
        this.setDataSource(mapList);
    }

    private List<String> getEntityFields(String billnum) {
        ArrayList<String> childrenEntityFields = new ArrayList<String>();
        if ("pc_producttpl_import".equals(billnum)) {
            childrenEntityFields.add("Brands");
            childrenEntityFields.add("Parameters");
            childrenEntityFields.add("Units");
            childrenEntityFields.add("productTplAssistUnitExchanges");
        }
        return childrenEntityFields;
    }

    public void beforeSave(ImportBatchData importBatchData, ImportEventBO importEventBO) {
        ImportEventContext importContext = importEventBO.getImportContextDto();
        List mapList = importBatchData.getDataList();
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            if ("aa_merchant".equals(importContext.getBillno()) || "aa_merchantexport".equals(importContext.getBillno())) {
                for (Map merchantMap : mapList) {
                    List invoicingCustomerList;
                    if (!(merchantMap.get("invoicingCustomerss") instanceof List) || CollectionUtils.isEmpty((Collection)(invoicingCustomerList = (List)merchantMap.get("invoicingCustomerss")))) continue;
                    for (Map invoicingCustomers : invoicingCustomerList) {
                        if (!merchantMap.get("code").equals(invoicingCustomers.get("invoicingCustomersId_code"))) continue;
                        invoicingCustomers.remove("__errorMessage");
                    }
                }
            } else if ("pc_productdetail_import".equals(importContext.getBillno())) {
                for (Map productMap : mapList) {
                    productMap.remove("name");
                }
            } else if ("pc_productimport".equals(importContext.getBillno())) {
                this.dealDataService.dealProductManageClass(mapList);
                this.dealDataService.dealAssistUnit(mapList);
            }
        }
    }

    private void setDataSource(List<Map<String, Object>> mapList) {
        if (!CollectionUtils.isEmpty(mapList)) {
            for (Map<String, Object> data : mapList) {
                CoredocDataSourceUtils.setExcelImportSoure(data);
            }
        }
    }

    public void dealMerchantImport(ImportBatchData importBatchData, ImportEventContext importContext) throws Exception {
        List mapList;
        if ("aa_merchant".equals(importContext.getBillno())) {
            mapList = importBatchData.getDataList();
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                for (Map merchantMap : mapList) {
                    merchantMap.put("importSpecialKey_merchant", "importSpecialKey_merchant");
                    merchantMap.put("aa_merchant", "aa_merchant");
                    merchantMap.put("_fromApi", true);
                }
                this.transCustClass(mapList);
                this.transChannCustomerClass(mapList);
            }
        } else if ("aa_merchant_export_range".equals(importContext.getBillno())) {
            mapList = importBatchData.getDataList();
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                for (Map merchantMap : mapList) {
                    merchantMap.put("importSpecialKey_merchant", "importSpecialKey_merchant");
                    merchantMap.put("aa_merchant_export_range", "aa_merchant_export_range");
                    if (merchantMap.containsKey("merchantAppliedDetailExt")) {
                        merchantMap.remove("merchantAppliedDetailExt");
                    }
                    merchantMap.put("_fromApi", true);
                }
            }
        } else if ("aa_merchantexport".equals(importContext.getBillno()) && !CollectionUtils.isEmpty((Collection)(mapList = importBatchData.getDataList()))) {
            for (Map merchantMap : mapList) {
                if (merchantMap.containsKey("merchantAppliedDetailExt")) {
                    merchantMap.remove("merchantAppliedDetailExt");
                }
                merchantMap.put("importSpecialKey_merchant", "importSpecialKey_merchant");
                merchantMap.put("aa_merchantexport", "aa_merchantexport");
                merchantMap.put("_fromApi", true);
            }
            this.transCustClass(mapList);
            this.transChannCustomerClass(mapList);
        }
        if (importContext.getBillno() != null && "aa_merchant_export_range".equals(importContext.getBillno())) {
            importContext.setBillno("aa_merchant");
            List entityHierarchyList = importBatchData.getMetaInfo().getEntityStructure().findAllRequiredEntity();
            if (!CollectionUtils.isEmpty((Collection)entityHierarchyList)) {
                List uris = entityHierarchyList.stream().map(EntityHierarchy::getEntityCode).collect(Collectors.toList());
                if (!CollectionUtils.isEmpty(uris)) {
                    Iterator iterator = uris.iterator();
                    while (iterator.hasNext()) {
                        String uri = (String)iterator.next();
                        if (!"aa.merchant.MerchantApplyRangeDetailCharacter".equals(uri) && !"aa.merchant.PrincipalCharacter".equals(uri) && !"aa.merchant.CustomerAreaCharacter".equals(uri)) continue;
                        iterator.remove();
                    }
                }
                NeedTranslateFields needTranslateFields = this.metaProvider.queryTranslateFields("aa_merchant", uris);
                importBatchData.getMetaInfo().getNeedTranslateFields().mergeFields(needTranslateFields);
            }
        }
    }

    private void transChannCustomerClass(List<Map<String, Object>> dataList) throws Exception {
        String CHANN_CUSTOMER_CLASS_NAME = "channCustomerClass_Code";
        List custClassNameList = dataList.stream().filter(data -> data.get(CHANN_CUSTOMER_CLASS_NAME) != null).map(data -> data.get(CHANN_CUSTOMER_CLASS_NAME).toString()).collect(Collectors.toList());
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (CollectionUtils.isEmpty(custClassNameList)) {
            return;
        }
        conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(custClassNameList));
        List custCategories = this.custCategoryDao.queryCustCategoryNoPartion(conditionGroup);
        HashMap<String, CustCategory> custCategoryMap = new HashMap<String, CustCategory>();
        ArrayList<String> duplicateDataCodeList = new ArrayList<String>();
        if (!CollectionUtils.isEmpty((Collection)custCategories)) {
            for (CustCategory custCategory : custCategories) {
                if (custCategoryMap.containsKey(custCategory.getCode())) {
                    duplicateDataCodeList.add(custCategory.getCode());
                    continue;
                }
                custCategoryMap.put(custCategory.getCode(), custCategory);
            }
        }
        for (Map map : dataList) {
            CustCategory custCategory = null;
            if (map != null && !CollectionUtils.isEmpty(custClassNameList)) {
                if (map.get("customerClass_code") != null && duplicateDataCodeList.contains(map.get(CHANN_CUSTOMER_CLASS_NAME).toString())) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000C", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u67e5\u8be2\u5230\u591a\u6761\u6570\u636e"), map.get(CHANN_CUSTOMER_CLASS_NAME)));
                    continue;
                }
                if (map.get(CHANN_CUSTOMER_CLASS_NAME) != null && custCategoryMap.containsKey(map.get(CHANN_CUSTOMER_CLASS_NAME).toString())) {
                    custCategory = (CustCategory)custCategoryMap.get(map.get(CHANN_CUSTOMER_CLASS_NAME).toString());
                } else if (map.get("customerClass_code") != null) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000D", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u672a\u67e5\u8be2\u5230\u5339\u914d\u7684\u6863\u6848\u6570\u636e"), map.get(CHANN_CUSTOMER_CLASS_NAME)));
                    continue;
                }
            }
            if (custCategory == null) continue;
            map.put("channCustomerClass", custCategory.getId());
        }
    }

    private void transCustClass(List<Map<String, Object>> dataList) throws Exception {
        List custClassCodeList = dataList.stream().filter(data -> data.get("customerClass_code") != null).map(data -> data.get("customerClass_code").toString()).collect(Collectors.toList());
        List custClassNameList = null;
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty(custClassCodeList)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(custClassCodeList));
        } else {
            custClassNameList = dataList.stream().filter(data -> data.get("customerClass_Name") != null).map(data -> data.get("customerClass_Name").toString()).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(custClassNameList)) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(custClassNameList));
            } else {
                return;
            }
        }
        List custCategories = this.custCategoryDao.queryCustCategoryNoPartion(conditionGroup);
        HashMap<String, CustCategory> custCategoryMap = new HashMap<String, CustCategory>();
        ArrayList<String> duplicateDataCodeList = new ArrayList<String>();
        if (!CollectionUtils.isEmpty((Collection)custCategories)) {
            for (CustCategory custCategory : custCategories) {
                if (custCategoryMap.containsKey(custCategory.getCode())) {
                    duplicateDataCodeList.add(custCategory.getCode());
                    continue;
                }
                custCategoryMap.put(custCategory.getCode(), custCategory);
            }
        }
        for (Map map : dataList) {
            CustCategory custCategory = null;
            if (map != null && !CollectionUtils.isEmpty(custClassCodeList)) {
                if (map.get("customerClass_code") != null && duplicateDataCodeList.contains(map.get("customerClass_code").toString())) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000C", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u67e5\u8be2\u5230\u591a\u6761\u6570\u636e"), map.get("customerClass_code")));
                    continue;
                }
                if (map.get("customerClass_code") != null && custCategoryMap.containsKey(map.get("customerClass_code").toString())) {
                    custCategory = (CustCategory)custCategoryMap.get(map.get("customerClass_code"));
                } else if (map.get("customerClass_code") != null) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000D", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u672a\u67e5\u8be2\u5230\u5339\u914d\u7684\u6863\u6848\u6570\u636e"), map.get("customerClass_code")));
                    continue;
                }
            } else if (map != null && !CollectionUtils.isEmpty(custClassNameList)) {
                if (map.get("customerClass_code") != null && duplicateDataCodeList.contains(map.get("customerClass_Name").toString())) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000C", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u67e5\u8be2\u5230\u591a\u6761\u6570\u636e"), map.get("customerClass_Name")));
                    continue;
                }
                if (map.get("customerClass_Name") != null && custCategoryMap.containsKey(map.get("customerClass_Name").toString())) {
                    custCategory = (CustCategory)custCategoryMap.get(map.get("customerClass_Name").toString());
                } else if (map.get("customerClass_code") != null) {
                    this.addOneErrorMessages(map, MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DA6A3CE0590000D", (String)"\u53c2\u7167\u5b57\u6bb5(\u5ba2\u6237\u5206\u7c7b)\u5f55\u5165\u7684\u503c\u3010{0}\u3011\u672a\u67e5\u8be2\u5230\u5339\u914d\u7684\u6863\u6848\u6570\u636e"), map.get("customerClass_Name")));
                    continue;
                }
            }
            if (custCategory == null) continue;
            map.put("customerClass", custCategory.getId());
            map.put("customerClass_code", custCategory.getCode());
            map.put("customerClass_isEnd", custCategory.getIsEnd());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addOneErrorMessages(Map<String, Object> data, String errMessage) {
        String errorMessage = (String)data.get("__errorMessage");
        StringBuilder sb = new StringBuilder();
        if (null != errorMessage) {
            sb.append(errorMessage);
            sb.append(";");
        }
        sb.append(errMessage);
        Map<String, Object> map = data;
        synchronized (map) {
            data.put("__errorMessage", sb.toString());
            DataTransferHelper.getInstance().addErrorMsg(data);
        }
    }
}

