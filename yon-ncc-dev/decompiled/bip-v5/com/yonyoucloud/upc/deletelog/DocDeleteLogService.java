/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ypd.bd.api.IDeleteLogService
 *  com.yonyou.ypd.bill.basic.entity.IBillDO
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.deletelog.BDRecycleDO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.deletelog;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ypd.bd.api.IDeleteLogService;
import com.yonyou.ypd.bill.basic.entity.IBillDO;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.deletelog.BDRecycleDO;
import com.yonyoucloud.upc.deletelog.DeleteLogService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class DocDeleteLogService {
    private static final Logger log = LoggerFactory.getLogger(DocDeleteLogService.class);
    @Autowired
    DeleteLogService deleteLogService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    IDeleteLogService iDeleteLogService;

    public void writeDeleteLog(String fullname, BizObject data) {
        try {
            Object carryParams;
            Boolean isCreator;
            String rangeId = null;
            if ("pc.product.Product".equals(fullname)) {
                rangeId = data.get("productApplyRangeId").toString();
                QueryConditionGroup rangeangeCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)rangeId)});
                QuerySchema rangeSchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{rangeangeCondition});
                List ranges = this.query("pc.product.ProductApplyRange", rangeSchema);
                ProductApplyRange range = (ProductApplyRange)ranges.get(0);
                if (!range.getIsCreator().booleanValue()) {
                    fullname = "pc.product.ProductApplyRange";
                }
            } else if ("aa.merchant.Merchant".equalsIgnoreCase(fullname) && !(isCreator = (carryParams = data.get("carryParams")) != null ? (Boolean)((Map)data.get("carryParams")).get("isCreator") : (Boolean)data.get("isCreator")).booleanValue()) {
                List merchantApplyRangeDetails = (List)data.get("merchantAppliedDetail");
                rangeId = !CollectionUtils.isEmpty((Map)((Map)merchantApplyRangeDetails.get(0))) && ((Map)merchantApplyRangeDetails.get(0)).get("merchantApplyRangeId") == null ? (String)data.get("merchantApplyRangeId") : (data.get("carryParams") != null ? (String)((Map)data.get("carryParams")).get("merchantApplyRangeId") : ((Map)merchantApplyRangeDetails.get(0)).get("merchantApplyRangeId").toString());
                fullname = "aa.merchant.MerchantApplyRange";
            }
            this.insertDeleteLog(fullname, data.get("id").toString(), rangeId);
        }
        catch (Exception e) {
            log.error("com.yonyoucloud.upc.deletelog.DocDeleteLogService.insertDeleteLog", new Object[]{e.getMessage(), e, this.getClass()});
        }
    }

    public void insertDeleteLog(String fullName, String id, String rangeId) throws Exception {
        this.deleteLogService.insertDeleteLog(fullName, id);
        Map data = this.getDataById(fullName, id, rangeId);
        this.deleteLogService.insertRecycleData(fullName, data);
    }

    private Map getDataById(String fullName, String id, String rangeId) throws Exception {
        if ("pc.product.Product".equals(fullName) || "pc.product.ProductApplyRange".equals(fullName)) {
            return this.getProductDataById(id, rangeId);
        }
        if ("pc.product.ProductSKU".equals(fullName)) {
            return this.getProductSkuDataByid(id);
        }
        if ("pc.tpl.ProductTpl".equals(fullName)) {
            return this.productTplService.getTemplateData(Long.parseLong(id));
        }
        if ("aa.merchant.Merchant".equals(fullName) || "aa.merchant.MerchantApplyRange".equals(fullName)) {
            return this.getMerchantDataById(id, rangeId);
        }
        return MetaDaoHelper.getById((String)fullName, (Long)Long.parseLong(id));
    }

    private Map getProductSkuDataByid(String id) throws Exception {
        QuerySchema querySchema = this.buildSkuSchema(null, id);
        List skus = this.query("pc.product.ProductSKU", querySchema);
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            return (Map)skus.get(0);
        }
        return null;
    }

    private Map<String, Object> getProductDataById(String productId, String rangeId) throws Exception {
        boolean isCreator = true;
        QueryConditionGroup rangeangeCondition = StringUtils.hasLength((String)rangeId) ? QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"id").eq((Object)rangeId)}) : QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema rangeSchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{rangeangeCondition});
        List ranges = this.query("pc.product.ProductApplyRange", rangeSchema);
        ProductApplyRange range = (ProductApplyRange)ranges.get(0);
        Long detailId = null;
        Long productDepositTimeDetailId = null;
        if (StringUtils.hasLength((String)rangeId) && !(isCreator = range.getIsCreator().booleanValue())) {
            detailId = range.getProductDetailId();
            productDepositTimeDetailId = range.getProductDepositTimeDetailId();
        }
        QuerySchema productSchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        if (isCreator) {
            productSchema.addCompositionSchema(QuerySchema.create().name("productAssistClasses").fullname("pc.product.ProductAssistClass").addSelect("*"));
            productSchema.addCompositionSchema(QuerySchema.create().name("productAssistUnitExchanges").fullname("pc.product.ProductAssistUnitExchange").addSelect("*"));
            productSchema.addCompositionSchema(QuerySchema.create().name("productfreecharacteritems").fullname("pc.product.ProductFreeCharacterItem").addSelect("*"));
        }
        QuerySchema detailSchema = QuerySchema.create().name("productDetail").fullname("pc.product.ProductDetail").addSelect("*");
        QuerySchema productTagSchema = QuerySchema.create().name("productTagNew").fullname("pc.product.ProductTagNew").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)detailId)});
        if (null != detailId) {
            detailSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)detailId)});
            productTagSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)detailId)});
        }
        productSchema.addCompositionSchema(detailSchema);
        QuerySchema timeSchema = QuerySchema.create().name("productDepositTimeDetail").fullname("pc.product.ProductDepositTimeDetail").addSelect("*");
        if (null != productDepositTimeDetailId) {
            timeSchema.addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDepositTimeDetailId)});
        }
        productSchema.addCompositionSchema(timeSchema);
        productSchema.addCompositionSchema(this.buildSkuSchema(detailId, null));
        List products = this.query("pc.product.Product", productSchema);
        Product product = (Product)products.get(0);
        product.setProductApplyRange(ranges);
        return product;
    }

    private QuerySchema buildSkuSchema(Long detailId, String skuId) {
        QuerySchema skuSchema = QuerySchema.create().name("productskus").fullname("pc.product.ProductSKU").addSelect("*");
        if (null != skuId) {
            skuSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId)});
        }
        skuSchema.addCompositionSchema(QuerySchema.create().name("skufreecharacteritems").fullname("pc.product.SkuFreeCharacterItem").addSelect("*"));
        QuerySchema skuDetailNewSchema = QuerySchema.create().name("productSkuDetailNew").fullname("pc.product.ProductSkuDetailNew").addSelect("*");
        QuerySchema skuTagNewSchema = QuerySchema.create().name("skuTagNew").fullname("pc.product.SkuTagNew").addSelect("*");
        QuerySchema skuOrderPropertyNewSchema = QuerySchema.create().name("productSkuOrderProperty").fullname("pc.product.ProductSkuOrderProperty").addSelect("*");
        if (null != detailId) {
            skuDetailNewSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)detailId)});
            skuTagNewSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)detailId)});
            skuOrderPropertyNewSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq((Object)detailId)});
        }
        skuSchema.addCompositionSchema(skuDetailNewSchema);
        skuSchema.addCompositionSchema(skuTagNewSchema);
        skuSchema.addCompositionSchema(skuOrderPropertyNewSchema);
        return skuSchema;
    }

    private List query(String fullname, QuerySchema schema) throws Exception {
        List datas = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        ArrayList<BizObject> resultDatas = new ArrayList<BizObject>();
        if (!CollectionUtils.isEmpty((Collection)datas)) {
            for (Map data : datas) {
                resultDatas.add(Objectlizer.convert((Map)data, (String)fullname));
            }
        }
        return resultDatas;
    }

    private Merchant getMerchantDataById(String merchantId, String rangeId) throws Exception {
        QuerySchema merchantQuerySchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(merchantId))});
        if (StringUtils.hasText((String)rangeId)) {
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantApplyRanges").fullname("aa.merchant.MerchantApplyRange").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(rangeId))}));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantAppliedDetail").fullname("aa.merchant.MerchantApplyRangeDetail").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.parseLong(rangeId))}));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("customerAreas").fullname("aa.merchant.CustomerArea").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.parseLong(rangeId))}));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("principals").fullname("aa.merchant.Principal").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.parseLong(rangeId))}));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("invoicingCustomerss").fullname("aa.merchant.InvoicingCustomers").addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.parseLong(rangeId))}));
        } else {
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantAddressInfos").fullname("aa.merchant.AddressInfo").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantContacterInfos").fullname("aa.merchant.Contacter").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantAgentFinancialInfos").fullname("aa.merchant.AgentFinancial").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantAgentInvoiceInfos").fullname("aa.merchant.AgentInvoice").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantsManager").fullname("aa.merchant.MerchantsManager").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantRole").fullname("aa.merchant.MerchantRoleInfo").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantBusinessRoleTime").fullname("aa.merchant.MerchantBusinessRoleTime").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantApplyRanges").fullname("aa.merchant.MerchantApplyRange").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantAppliedDetail").fullname("aa.merchant.MerchantApplyRangeDetail").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("customerAreas").fullname("aa.merchant.CustomerArea").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("principals").fullname("aa.merchant.Principal").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("invoicingCustomerss").fullname("aa.merchant.InvoicingCustomers").addSelect("*"));
            merchantQuerySchema.addCompositionSchema(QuerySchema.create().name("merchantApplyRangeGroups").fullname("aa.merchant.MerchantApplyRangeGroup").addSelect("*").addCompositionSchema(QuerySchema.create().name("merchantSaleArea").fullname("aa.merchant.MerchantSaleArea").addSelect("*")).addCompositionSchema(QuerySchema.create().name("merchantPrincipal").fullname("aa.merchant.MerchantPrincipal").addSelect("*")).addCompositionSchema(QuerySchema.create().name("merchantInvoice").fullname("aa.merchant.MerchantInvoice").addSelect("*")).addCompositionSchema(QuerySchema.create().name("merchantDetail").fullname("aa.merchant.MerchantDetail").addSelect("*")).addCompositionSchema(QuerySchema.create().name("merchantDetailForCRM").fullname("aa.merchant.MerchantDetailForCRM").addSelect("*")));
        }
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)merchantQuerySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            return (Merchant)merchantList.get(0);
        }
        return null;
    }

    public List<Map<String, Object>> queryDeleteLogByPage(String fullName, String docId, List<String> docIds, Date startTs, Date endTs, Long pageIndex, Long pageSize) {
        List<BDRecycleDO> bdRecycleDOS = this.deleteLogService.selectRecycleDatas(fullName, docId, docIds, startTs, endTs, pageIndex, pageSize);
        List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        List<String> entityNameList = Arrays.asList("pc.unit.UnitGroup", "pc.unit.Unit", "pc.productline.ProductLine", "pc.tag.Tag", "pc.tag.TagClass");
        if (!CollectionUtils.isEmpty(bdRecycleDOS)) {
            if ("pc.product.ProductApplyRange".equals(fullName)) {
                resultList = this.convertToMapForProductRange(bdRecycleDOS, "productApplyRange");
            } else if ("aa.merchant.MerchantApplyRange".equals(fullName)) {
                resultList = this.convertToMapForProductRange(bdRecycleDOS, "merchantApplyRanges");
            } else {
                for (BDRecycleDO bdRecycleDO : bdRecycleDOS) {
                    HashMap<String, Object> data = new HashMap<String, Object>();
                    data.put("id", bdRecycleDO.getDocID());
                    try {
                        if (entityNameList.contains(bdRecycleDO.getDocUri())) {
                            IBillDO iBillDO = this.iDeleteLogService.queryRecycleDataById(bdRecycleDO.getId());
                            Map map = iBillDO.toMap();
                            data.put("code", map.get("code"));
                            data.put("id", map.get("id"));
                        } else {
                            Map<String, Object> map = this.blobStrToMap(bdRecycleDO.getDocData());
                            data.put("code", map.get("code"));
                            data.put("id", map.get("id"));
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    resultList.add(data);
                }
            }
        }
        return resultList;
    }

    private Map<String, Object> blobStrToMap(byte[] docData) {
        String doc = new String(docData);
        int i = doc.indexOf("{");
        String substring = doc.substring(i, doc.length());
        return (Map)JSON.parseObject((String)substring, Map.class);
    }

    public Long queryDeleteLogCountByPage(String fullName, String docId, List<String> docIds, Date startTs, Date endTs) {
        return this.deleteLogService.selectRecycleDatasCount(fullName, docId, docIds, startTs, endTs);
    }

    private List<Map<String, Object>> convertToMapForProductRange(List<BDRecycleDO> bdRecycleDOS, String rangeAssotion) {
        ArrayList<Map<String, Object>> resultMap = new ArrayList<Map<String, Object>>();
        HashSet<String> orgIds = new HashSet<String>();
        HashSet<String> orgIdsLImit = new HashSet<String>();
        HashMap<String, String> orgIdAndCodeMap = new HashMap<String, String>();
        HashMap<String, String> docIdAndCodeMap = new HashMap<String, String>();
        HashMap orgIdDocIds = new HashMap();
        for (BDRecycleDO bdRecycleDO : bdRecycleDOS) {
            Map<String, Object> data = this.blobStrToMap(bdRecycleDO.getDocData());
            JSONArray applyRanges = (JSONArray)data.get(rangeAssotion);
            JSONObject applyRange = (JSONObject)applyRanges.get(0);
            if (null != applyRange.get((Object)"orgId")) {
                String orgId = applyRange.get((Object)"orgId").toString();
                if (!orgIds.contains(orgId)) {
                    orgIds.add(orgId);
                    orgIdsLImit.add(orgId);
                }
                if (!orgIdDocIds.containsKey(orgId)) {
                    orgIdDocIds.put(orgId, new ArrayList());
                }
                if (null != data.get("code")) {
                    String code = data.get("code").toString();
                    docIdAndCodeMap.put(bdRecycleDO.getDocID(), code);
                }
                HashMap<String, String> docRangeId = new HashMap<String, String>(2);
                docRangeId.put("docId", bdRecycleDO.getDocID());
                docRangeId.put("id", applyRange.get((Object)"id").toString());
                ((List)orgIdDocIds.get(orgId)).add(docRangeId);
            }
            if (orgIdsLImit.size() != 1000) continue;
            this.getOrgDatas(orgIdsLImit, orgIdAndCodeMap);
            orgIdsLImit.clear();
        }
        if (orgIdsLImit.size() > 0) {
            this.getOrgDatas(orgIdsLImit, orgIdAndCodeMap);
        }
        for (Map.Entry next : orgIdDocIds.entrySet()) {
            String orgId = (String)next.getKey();
            String orgCode = (String)orgIdAndCodeMap.get(orgId);
            List docRangeIds = (List)next.getValue();
            for (HashMap<String, String> docRangeId : docRangeIds) {
                HashMap data = new HashMap();
                data.putAll(docRangeId);
                data.put("code", docIdAndCodeMap.get(docRangeId.get("docId")));
                data.put("orgCode", orgCode);
                data.put("orgId", orgId);
                resultMap.add(data);
            }
        }
        return resultMap;
    }

    private void getOrgDatas(Set<String> orgIdsLImit, Map<String, String> orgIdAndCodeMap) {
        ArrayList<String> ids = new ArrayList<String>(orgIdsLImit);
        ArrayList<Integer> statusList = new ArrayList<Integer>();
        statusList.add(1);
        statusList.add(2);
        List orgUnitDTOS = this.orgUnitQueryService.listByIds((String)AppContext.getYTenantId(), ids, statusList);
        orgUnitDTOS.forEach(orgUnitDTO -> orgIdAndCodeMap.put(orgUnitDTO.getId(), orgUnitDTO.getCode()));
    }
}

