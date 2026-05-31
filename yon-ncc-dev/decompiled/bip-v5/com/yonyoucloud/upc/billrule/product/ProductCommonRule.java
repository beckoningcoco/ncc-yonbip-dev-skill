/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ml.provider.ILanguageProvider
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.ProductOrgFieldEnum
 *  com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ml.provider.ILanguageProvider;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.pc.product.ProductOrgFieldEnum;
import com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productCommonRule")
public class ProductCommonRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductCommonRule.class);
    private static int INIT_CAP = 16;
    private static List<Map<String, String>> CROSS_DOMAIN_FIELDS;
    private static String IDKEY;
    private static String NAMEKEY;
    private static String VALUEKEY;
    private static String CLASSNAME;
    private static String DMOAIN;
    private static Map<String, String> multLangField;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    UPCAttachmentTransService attachmentTransService;
    @Autowired
    ILanguageProvider languageProvider;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (paramMap.get("return") == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_FOUND);
        }
        long startTime = System.currentTimeMillis();
        if (("pc_product".equals(billContext.getBillnum()) || "pc_productdetail".equals(billContext.getBillnum())) && "detail".equals(billContext.getAction())) {
            Map map = (Map)paramMap.get("return");
            for (Map<String, String> field : CROSS_DOMAIN_FIELDS) {
                if (!map.containsKey(field.get(IDKEY)) || map.get(field.get(IDKEY)) == null) continue;
                if (field.get(DMOAIN) != null && "umall".equals(field.get(DMOAIN)) && null != map.get(field.get(IDKEY))) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("id, dt_name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(map.get(field.get(IDKEY)))}));
                    querySchema.setPartitionable(false);
                    List list = MetaDaoHelper.query((String)"um.logisticssetting.Deliverytype", (QuerySchema)querySchema, (String)"umall");
                    if (CollectionUtils.isEmpty((Collection)list)) continue;
                    map.put(field.get(NAMEKEY), ((Map)list.get(0)).get("dt_name"));
                    continue;
                }
                Map result = this.upcProductQueryService.getCrossDomainFieldValue(map.get(field.get(IDKEY)), field.get(CLASSNAME), field.get(DMOAIN), field.get(VALUEKEY));
                if (result == null) continue;
                map.put(field.get(NAMEKEY), result.get(field.get(VALUEKEY)));
            }
            HashMap<String, String> translateFields = new HashMap<String, String>(10);
            StringBuilder sb = new StringBuilder();
            Boolean isApplied = (Boolean)billContext.getContext().get("isApplied");
            if (InvocationInfoProxy.getExtendAttribute((String)"multiLanguageFlagForDetail") == null || ((Boolean)InvocationInfoProxy.getExtendAttribute((String)"multiLanguageFlagForDetail")).booleanValue()) {
                List enableLanguages = this.languageProvider.getEnableLanguages();
                HashMap<String, String> multiLangType = new HashMap<String, String>();
                for (LanguageVO languageVO : enableLanguages) {
                    multiLangType.put(languageVO.getLangCode(), languageVO.getLangSequence() == 1 ? "" : String.valueOf(languageVO.getLangSequence()));
                }
                for (Map.Entry entry : multLangField.entrySet()) {
                    if (!map.containsKey(entry.getKey()) || map.get(entry.getKey()) == null) continue;
                    translateFields.put((String)entry.getKey(), (String)entry.getValue());
                    for (String type : multiLangType.values()) {
                        sb.append((String)entry.getValue());
                        sb.append(type);
                        sb.append(",");
                    }
                }
                Long productApplyRangeId = (Long)billContext.getContext().get("productApplyRangeId");
                Object v = billContext.getContext().get("@productDetailId");
                Long productId = (Long)billContext.getContext().get("productId");
                Boolean isCreator = (Boolean)billContext.getContext().get("isCreator");
                if (translateFields.size() > 0) {
                    Map<String, Object> fieldsById;
                    sb.delete(sb.length() - 1, sb.length());
                    HashMap<String, Object> param = new HashMap<String, Object>();
                    param.put("tenant_id", AppContext.getTenantId());
                    param.put("fields", sb.toString());
                    param.put("productId", productId);
                    if (isCreator.equals(true) || isApplied.equals(false)) {
                        param.put("isCreator", true);
                    }
                    if (productApplyRangeId != null) {
                        param.put("productApplyRangeId", productApplyRangeId);
                    }
                    if (v != null) {
                        param.put("productDetailId", v);
                    }
                    if ((fieldsById = this.upcProductQueryService.getProductMultiLangFields(param)) != null) {
                        for (Map.Entry entry : translateFields.entrySet()) {
                            HashMap<String, Object> result = new HashMap<String, Object>(6);
                            for (Map.Entry type : multiLangType.entrySet()) {
                                String fieldName = (String)entry.getValue() + (String)type.getValue();
                                if (!fieldsById.containsKey(fieldName) || fieldsById.get(fieldName) == null) continue;
                                result.put((String)type.getKey(), fieldsById.get(fieldName));
                            }
                            map.put(entry.getKey(), result);
                        }
                    }
                }
            }
            map.put("productSkuSaveAsync", this.pubOptionService.getProductSkuSaveAsync());
            if (!isApplied.booleanValue()) {
                ProductOrgFieldEnum.dealProductOrgField((Map)map);
                if (null != map.get("productskus")) {
                    List productskus = (List)map.get("productskus");
                    for (Map sku : productskus) {
                        SkuOrgFieldEnum.dealSkuOrgField((Map)sku);
                    }
                }
            }
            if (map.get("homepageBusinessId") != null) {
                this.attachmentTransService.convertUrlNoCover(map, AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE, "url");
            }
        } else if ("pc_productlist_query".equals(billContext.getBillnum()) && "query".equals(billContext.getAction()) || "".equals(billDataDto.getRefEntity().refType)) {
            Pager pager = (Pager)paramMap.get("return");
            if (pager.getRecordList() == null || pager.getRecordList().isEmpty()) {
                return new RuleExecuteResult();
            }
            List list = ((Pager)paramMap.get("return")).getRecordList();
            HashMap records = new HashMap(INIT_CAP);
            HashMap recordRows = new HashMap(INIT_CAP);
            Integer i = 0;
            while (i < list.size()) {
                Map row = (Map)list.get(i);
                this.dealOrgField(row);
                if (row.containsKey("detail!stopstatus") && row.get("detail!stopstatus") != null) {
                    row.put("detail!stopstatus", this.castToBoolean(row.get("detail!stopstatus")));
                }
                if (row.containsKey("detail!iStatus") && row.get("detail!iStatus") != null) {
                    row.put("detail!iStatus", this.castToBoolean(row.get("detail!iStatus")));
                }
                if (row.containsKey("detail!iUOrderStatus") && row.get("detail!iUOrderStatus") != null) {
                    row.put("detail!iUOrderStatus", this.castToBoolean(row.get("detail!iUOrderStatus")));
                }
                for (Map<String, String> map : CROSS_DOMAIN_FIELDS) {
                    if (!row.containsKey(map.get(IDKEY)) || row.get(map.get(IDKEY)) == null) continue;
                    if (!records.containsKey(map.get(CLASSNAME))) {
                        HashMap classRecords = new HashMap(list.size());
                        records.put(map.get(CLASSNAME), classRecords);
                        HashSet<Integer> indexs = new HashSet<Integer>(list.size());
                        indexs.add(i);
                        classRecords.put(row.get(map.get(IDKEY)), indexs);
                    } else if (!((Map)records.get(map.get(CLASSNAME))).containsKey(row.get(map.get(IDKEY)))) {
                        HashSet<Integer> indexs = new HashSet<Integer>(list.size());
                        indexs.add(i);
                        ((Map)records.get(map.get(CLASSNAME))).put(row.get(map.get(IDKEY)), indexs);
                    } else {
                        ((Set)((Map)records.get(map.get(CLASSNAME))).get(row.get(map.get(IDKEY)))).add(i);
                    }
                    if (!recordRows.containsKey(map.get(CLASSNAME))) {
                        HashMap<Integer, Map> targetRow = new HashMap<Integer, Map>(list.size());
                        targetRow.put(i, row);
                        recordRows.put(map.get(CLASSNAME), targetRow);
                        continue;
                    }
                    ((Map)recordRows.get(map.get(CLASSNAME))).put(i, row);
                }
                Integer n = i;
                i = i + 1;
            }
            HashMap<String, List<Map>> results = new HashMap<String, List<Map>>(INIT_CAP);
            for (Map<String, String> field : CROSS_DOMAIN_FIELDS) {
                if (!records.containsKey(field.get(CLASSNAME)) || results.containsKey(field.get(CLASSNAME))) continue;
                List<Map> list2 = this.upcProductQueryService.getCrossDomainFieldValues(((Map)records.get(field.get(CLASSNAME))).keySet(), field.get(CLASSNAME), field.get(DMOAIN), field.get(VALUEKEY));
                results.put(field.get(CLASSNAME), list2);
            }
            for (Map<String, String> field : CROSS_DOMAIN_FIELDS) {
                if (null == results.get(field.get(CLASSNAME))) continue;
                for (Map result : (List)results.get(field.get(CLASSNAME))) {
                    for (Integer i2 : (Set)((Map)records.get(field.get(CLASSNAME))).get(result.get("id"))) {
                        if (!((Map)((Map)recordRows.get(field.get(CLASSNAME))).get(i2)).containsKey(field.get(IDKEY)) || ((Map)((Map)recordRows.get(field.get(CLASSNAME))).get(i2)).get(field.get(IDKEY)) == null || !((Map)((Map)recordRows.get(field.get(CLASSNAME))).get(i2)).get(field.get(IDKEY)).equals(result.get("id"))) continue;
                        ((Map)((Map)recordRows.get(field.get(CLASSNAME))).get(i2)).put(field.get(NAMEKEY), result.get(field.get(VALUEKEY)));
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        log.info("ProductCommonRule [{}] take [{}] ms", (Object)billContext.getBillnum(), (Object)(endTime - startTime));
        return new RuleExecuteResult();
    }

    private void dealOrgField(Map map) {
        if (null != map.get("isApplied") && !Boolean.parseBoolean(map.get("isApplied").toString())) {
            ProductOrgFieldEnum.dealProductOrgField((Map)map);
        }
    }

    private boolean castToBoolean(Object value) {
        if (BooleanUtils.b((Object)value)) {
            return true;
        }
        return value.equals(true);
    }

    static {
        IDKEY = "idkey";
        NAMEKEY = "namekey";
        VALUEKEY = "valuekey";
        CLASSNAME = "classname";
        DMOAIN = "domain";
        CROSS_DOMAIN_FIELDS = new ArrayList<Map<String, String>>(INIT_CAP);
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!dlyFeeRuleId");
                this.put(NAMEKEY, "detail!dlyFeeRuleId_Name");
                this.put(VALUEKEY, "dt_name");
                this.put(CLASSNAME, "um.logisticssetting.Deliverytype");
                this.put(DMOAIN, "umall");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!deliveryWarehouse");
                this.put(NAMEKEY, "detail!deliveryWarehouse_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "aa.warehouse.Warehouse");
                this.put(DMOAIN, "productcenter");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!returnWarehouse");
                this.put(NAMEKEY, "detail!returnWarehouse_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "aa.warehouse.Warehouse");
                this.put(DMOAIN, "productcenter");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!inTaxrate");
                this.put(NAMEKEY, "detail!inTaxrate_Name");
                this.put(VALUEKEY, "ntaxrate");
                this.put(CLASSNAME, "archive.taxArchives.TaxRateArchive");
                this.put(DMOAIN, "yonbip-fi-taxpubdoc");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!outTaxrate");
                this.put(NAMEKEY, "detail!outTaxrate_Name");
                this.put(VALUEKEY, "ntaxrate");
                this.put(CLASSNAME, "archive.taxArchives.TaxRateArchive");
                this.put(DMOAIN, "yonbip-fi-taxpubdoc");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!productBuyer");
                this.put(NAMEKEY, "detail!productBuyer_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DMOAIN, "ucf-staff-center");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!warehouseManager");
                this.put(NAMEKEY, "detail!warehouseManager_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DMOAIN, "ucf-staff-center");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!manufacturePlanner");
                this.put(NAMEKEY, "detail!manufacturePlanner_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "bd.staff.Staff");
                this.put(DMOAIN, "ucf-staff-center");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!planStrategy");
                this.put(NAMEKEY, "detail!planStrategy_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "mr.timefence.TimeFence");
                this.put(DMOAIN, "requirementsplanning");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!productVendor");
                this.put(NAMEKEY, "detail!productVendor_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "aa.vendor.Vendor");
                this.put(DMOAIN, "yssupplier");
            }
        });
        CROSS_DOMAIN_FIELDS.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put(IDKEY, "detail!produceDepartment");
                this.put(NAMEKEY, "detail!produceDepartment_Name");
                this.put(VALUEKEY, "name");
                this.put(CLASSNAME, "org.func.Dept");
                this.put(DMOAIN, "ucf-org-center");
            }
        });
        multLangField = new HashMap<String, String>(10);
        multLangField.put("detail!receiptName", "receiptName");
        multLangField.put("detail!receiptModel", "receiptModel");
        multLangField.put("detail!receiptSpec", "receiptSpec");
        multLangField.put("detail!metaDescription", "metaDescription");
        multLangField.put("detail!displayName", "cDisplayName");
        multLangField.put("detail!titleMemo", "cTitleMemo");
        multLangField.put("detail!remark", "remark");
    }
}

