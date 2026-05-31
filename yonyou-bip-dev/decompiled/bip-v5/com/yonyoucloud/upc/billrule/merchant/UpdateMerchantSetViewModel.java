/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData
 *  com.yonyou.ucf.mdd.ext.poi.service.IPOIExtService
 *  com.yonyou.ucf.mdd.uimeta.model.bill.BillTplGroupPO
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.poi.ss.usermodel.Workbook
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.poi.model.ExcelExportData;
import com.yonyou.ucf.mdd.ext.poi.service.IPOIExtService;
import com.yonyou.ucf.mdd.uimeta.model.bill.BillTplGroupPO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class UpdateMerchantSetViewModel
implements IPOIExtService {
    public void beforeFetchTemplate(Map<String, Object> map) {
    }

    public void afterFetchTemplate(ViewModel viewModel) {
    }

    private void filterSKUExportFild(ViewModel viewModel, Map<String, Object> map) {
    }

    public void afterFetchTemplate4Export(ViewModel viewModel, BillDataDto billDataDto) {
        LinkedHashSet entitylist;
        if (viewModel != null && viewModel.getBillNo() != null && "pc_productimport".equals(viewModel.getBillNo()) && ObjectUtils.isNotEmpty((Object)(entitylist = viewModel.getEntities()))) {
            for (Entity entity : entitylist) {
                if (entity == null || !"pc_product_import".equals(entity.getCode())) continue;
                List fields = entity.getFields();
                fields.removeIf(field -> field.getItemName() != null && field.getItemName().startsWith("productApply_"));
            }
        }
    }

    public void afterFetchTemplate(ViewModel viewModel, Map<String, Object> map) {
        block25: {
            LinkedHashSet entitylist;
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                block24: {
                                    boolean isshop;
                                    boolean bl = isshop = UserType.ShopAdminUser == AppContext.getCurrentUser().getUserType() || UserType.ShopUser == AppContext.getCurrentUser().getUserType();
                                    if (viewModel.getBillNo() == null || !"aa_warehouse".equals(viewModel.getBillNo()) || !isshop) break block24;
                                    LinkedHashSet entitylist2 = viewModel.getEntities();
                                    if (CollectionUtils.isEmpty((Collection)entitylist2)) break block25;
                                    for (Entity entity : entitylist2) {
                                        if (!"aa_warehousestock".equals(entity.getCode())) continue;
                                        entity.setIsTplExport(Boolean.valueOf(false));
                                    }
                                    break block25;
                                }
                                if (viewModel.getBillNo() == null || !"pc_goodsproductskuprolist".equals(viewModel.getBillNo())) break block26;
                                this.filterSKUExportFild(viewModel, map);
                                break block25;
                            }
                            if (viewModel.getBillNo() == null || !"pc_productimport".equals(viewModel.getBillNo())) break block27;
                            this.productImportFetchTemplate(viewModel, map);
                            break block25;
                        }
                        if (viewModel.getBillNo() == null || !"pc_productdetail_import".equals(viewModel.getBillNo())) break block28;
                        this.productDetailImportFetchTemplate(viewModel, map);
                        break block25;
                    }
                    if (viewModel.getBillNo() == null || !"aa_merchant".equals(viewModel.getBillNo())) break block29;
                    LinkedHashSet entitylist3 = viewModel.getEntities();
                    if (CollectionUtils.isEmpty((Collection)entitylist3)) break block25;
                    for (Entity entity : entitylist3) {
                        List fields;
                        if ("aa_merchant".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if ("aa_addressinfo".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if ("aa_contacter".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if ("aa_agentfinancial".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if ("aa_agentinvoice".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if ("aa_customerarea".equals(entity.getCode())) {
                            fields = entity.getFields();
                            for (Field field : fields) {
                                this.setFieldExtProps(field, entity.getCode());
                            }
                            continue;
                        }
                        if (!"aa_principal".equals(entity.getCode())) continue;
                        fields = entity.getFields();
                        for (Field field : fields) {
                            this.setFieldExtProps(field, entity.getCode());
                        }
                    }
                    break block25;
                }
                if (viewModel.getBillNo() == null || !"base_businesspartner".equals(viewModel.getBillNo())) break block30;
                LinkedHashSet entitylist4 = viewModel.getEntities();
                if (CollectionUtils.isEmpty((Collection)entitylist4)) break block25;
                for (Entity entity : entitylist4) {
                    if (!"base_businesspartner".equals(entity.getCode())) continue;
                    List fields = entity.getFields();
                    for (Field field : fields) {
                        this.setFieldExtProps(field, entity.getCode());
                    }
                }
                break block25;
            }
            if (viewModel.getBillNo() != null && "aa_merchant_export_range".equals(viewModel.getBillNo()) && !CollectionUtils.isEmpty((Collection)(entitylist = viewModel.getEntities()))) {
                for (Entity entity : entitylist) {
                    List fields;
                    if ("aa_merchantapplyrangedetail_export_range".equals(entity.getCode())) {
                        fields = entity.getFields();
                        for (Field field : fields) {
                            this.setFieldExtProps(field, entity.getCode());
                        }
                        continue;
                    }
                    if ("aa_customerarea_export_range".equals(entity.getCode())) {
                        fields = entity.getFields();
                        for (Field field : fields) {
                            this.setFieldExtProps(field, entity.getCode());
                        }
                        continue;
                    }
                    if (!"aa_principal_export_range".equals(entity.getCode())) continue;
                    fields = entity.getFields();
                    for (Field field : fields) {
                        this.setFieldExtProps(field, entity.getCode());
                    }
                }
            }
        }
    }

    private static boolean processProductApply(Map<String, Object> map, Iterator<Field> iterator, Field field) {
        if (!"apply".equals(map.get("importCustomParam")) && field.getItemName() != null && field.getItemName().startsWith("productApply_")) {
            iterator.remove();
            return true;
        }
        return false;
    }

    public void afterCreateExcel(Workbook workbook, ExcelExportData excelExportData) {
        if (Objects.nonNull(excelExportData.getBillno()) && "batch_modif_import".equals(excelExportData.getBillno())) {
            workbook.removeSheetAt(0);
        }
    }

    public List<BillTplGroupPO> getTplGroupList(List<String> tplGroupCodeList, String billNumber) throws Exception {
        List<Object> productTplGroupList = new ArrayList<BillTplGroupPO>();
        if ("pc_productimport".equals(billNumber)) {
            HashMap<String, Object> queryMap = new HashMap<String, Object>();
            queryMap.put("ytenant_id", AppContext.getYTenantId());
            queryMap.put("tplGroupCodeList", tplGroupCodeList);
            queryMap.put("billNumber", billNumber);
            productTplGroupList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductBilltplgroupMapper.queryProductBilltplgroupDataBycode", queryMap);
            if (CollectionUtils.isEmpty(productTplGroupList)) {
                queryMap.put("ytenant_id", "0");
                productTplGroupList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductBilltplgroupMapper.queryProductBilltplgroupDataBycode", queryMap);
            }
        }
        return productTplGroupList;
    }

    private void setFieldExtProps(Field field, String entityCode) {
        if ("aa_merchant".equals(entityCode)) {
            if (field.getItemName() != null) {
                if (field.getItemName().startsWith("merchantCharacter_") && !"merchantCharacter__id".equals(field.getItemName())) {
                    this.setFieldExtPropsUpdateImportConfig(field);
                } else if (field.getItemName().startsWith("merchantAppliedDetail!merchantApplyRangeDetailCharacter_") && !"merchantAppliedDetail!merchantApplyRangeDetailCharacter__id".equals(field.getItemName())) {
                    this.setFieldExtPropsUpdateImportConfig(field);
                }
            }
        } else if ("aa_addressinfo".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("addressInfoCharacter_") && !"addressInfoCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_contacter".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("contacterCharacter_") && !"contacterCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_agentfinancial".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("agentFinancialCharacter_") && !"agentFinancialCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_agentinvoice".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("agentInvoiceCharacter_") && !"agentInvoiceCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_customerarea".equals(entityCode) || "aa_customerarea_export_range".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("customerAreaCharacter_") && !"customerAreaCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_principal".equals(entityCode) || "aa_principal_export_range".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("principalCharacter_") && !"principalCharacter__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("base_businesspartner".equals(entityCode)) {
            if (field.getItemName() != null && field.getItemName().startsWith("businessPartnerCharacterDef_") && !"businessPartnerCharacterDef__id".equals(field.getItemName())) {
                this.setFieldExtPropsUpdateImportConfig(field);
            }
        } else if ("aa_merchantapplyrangedetail_export_range".equals(entityCode) && field.getItemName() != null && field.getItemName().startsWith("merchantApplyRangeDetailCharacter_") && !"merchantApplyRangeDetailCharacter__id".equals(field.getItemName())) {
            this.setFieldExtPropsUpdateImportConfig(field);
        }
    }

    public void productImportFetchTemplate(ViewModel viewModel, Map<String, Object> map) {
        LinkedHashSet entitylist = viewModel.getEntities();
        int addOrderType = 0;
        if (!CollectionUtils.isEmpty((Collection)entitylist)) {
            for (Entity entity : entitylist) {
                if (!"pc_product_import".equals(entity.getCode())) continue;
                List fields = entity.getFields();
                Iterator<Field> iterator = fields.iterator();
                while (iterator.hasNext()) {
                    Field field = (Field)iterator.next();
                    if (UpdateMerchantSetViewModel.processProductApply(map, iterator, field) || field.getItemName() == null) continue;
                    if (field.getItemName().startsWith("productPropCharacterDefine_") && !"productPropCharacterDefine__id".equals(field.getItemName())) {
                        HashMap<String, Object> productPropCharacterDefineMap = new HashMap<String, Object>();
                        productPropCharacterDefineMap.put("importTplGroupCode", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800A8", (String)"\u7269\u6599\u81ea\u5b9a\u4e49\u5c5e\u6027"));
                        if (addOrderType == 0) {
                            productPropCharacterDefineMap.put("importTplGroupOrder", 541);
                        }
                        this.setFieldExtPropsForProductImport(field, productPropCharacterDefineMap);
                        ++addOrderType;
                        continue;
                    }
                    if (field.getItemName().startsWith("productCharacterDef_") && !"productCharacterDef__id".equals(field.getItemName())) {
                        HashMap<String, Object> productCharacterDefMap = new HashMap<String, Object>();
                        productCharacterDefMap.put("importTplGroupCode", "\u57fa\u672c\u4fe1\u606f\u9875\u7b7e");
                        this.setFieldExtPropsForProductImport(field, productCharacterDefMap);
                        continue;
                    }
                    if (field.getItemName().startsWith("detail!productExtendCharacterDef_") && !"detail!productExtendCharacterDef__id".equals(field.getItemName())) {
                        HashMap<String, Object> productExtendCharacterDefMap = new HashMap<String, Object>();
                        productExtendCharacterDefMap.put("importTplGroupCode", "\u4e1a\u52a1\u4fe1\u606f\u9875\u7b7e");
                        this.setFieldExtPropsForProductImport(field, productExtendCharacterDefMap);
                        continue;
                    }
                    if (field.getIsNull() == null || field.getIsNull().booleanValue() || field.getIsExport() == null || !field.getIsExport().booleanValue()) continue;
                    HashMap<String, Object> extPropsMap = new HashMap<String, Object>();
                    extPropsMap.put("cantModify", true);
                    this.setFieldExtPropsForProductImport(field, extPropsMap);
                }
            }
        }
    }

    public void productDetailImportFetchTemplate(ViewModel viewModel, Map<String, Object> map) {
        LinkedHashSet entitylist = viewModel.getEntities();
        if (!CollectionUtils.isEmpty((Collection)entitylist)) {
            for (Entity entity : entitylist) {
                if (!"pc_productdetail_product_import".equals(entity.getCode())) continue;
                List fields = entity.getFields();
                Iterator<Field> iterator = fields.iterator();
                while (iterator.hasNext()) {
                    Field field = (Field)iterator.next();
                    if (UpdateMerchantSetViewModel.processProductApply(map, iterator, field) || field.getItemName() == null || !field.getItemName().startsWith("detail!productExtendCharacterDef_") || "detail!productExtendCharacterDef__id".equals(field.getItemName())) continue;
                    HashMap<String, Object> productExtendCharacterDefMap = new HashMap<String, Object>();
                    productExtendCharacterDefMap.put("importTplGroupCode", "\u4e1a\u52a1\u4fe1\u606f\u9875\u7b7e");
                    this.setFieldExtPropsForProductImport(field, productExtendCharacterDefMap);
                }
            }
        }
    }

    private void setFieldExtPropsUpdateImportConfig(Field field) {
        String cExtProps = field.getcExtProps();
        Map object = !StringUtils.isEmpty((CharSequence)cExtProps) ? (Map)JSON.parseObject((String)cExtProps, Map.class) : new HashMap();
        object.put("supportUpdate", true);
        cExtProps = JSON.toJSONString(object);
        field.setcExtProps(cExtProps);
    }

    public void setFieldExtPropsForProductImport(Field field, Map<String, Object> map) {
        String cExtProps = field.getcExtProps();
        Map cExtPropsMap = !StringUtils.isEmpty((CharSequence)cExtProps) ? (Map)JSON.parseObject((String)cExtProps, Map.class) : new HashMap();
        cExtPropsMap.putAll(map);
        field.setcExtProps(JSON.toJSONString(cExtPropsMap));
    }
}

