/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.customerdoc.service.dto.CustDocDTO
 *  com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.file.oss.Object$IObject
 *  com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum
 *  com.yonyoucloud.upc.utils.BizQueryBuilder
 *  com.yonyoucloud.upc.utils.CollectionUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryOrderby
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.customerdoc.service.dto.CustDocDTO;
import com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.file.oss.Object;
import com.yonyoucloud.iuap.upc.api.service.ApiDto;
import com.yonyoucloud.iuap.upc.api.service.IProductApiService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductDeleteService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDTO;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.api.ProductCharactorServiceImpl;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.BizQueryBuilder;
import com.yonyoucloud.upc.utils.CollectionUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryOrderby;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service(value="pc.productApiService")
public class ProductApiService
implements IProductApiService {
    private static final Logger log = LoggerFactory.getLogger(ProductApiService.class);
    public static final String PARAM_METAKEY = "pc.product.ProductParameterExtend";
    public static final String DESCRIPTION_METAKEY = "pc.product.ProductDescription";
    private static final String METAKEY = "pc.product.Product";
    private static final String BIZ_METAKEY = "pc.product.ProductApplyRange";
    private static final String BIZ_DETAIL_METAKEY = "pc.product.ProductApplyRangeDetail";
    private static final String EXTEND_METAKEY = "pc.product.ProductExtend";
    private static final String ALBUM_METAKEY = "pc.product.ProductAlbum";
    private static final String ATTACHMENT_METAKEY = "pc.product.ProductAttachment";
    private static final String ASSISTCLASS_METAKEY = "pc.product.ProductAssistClass";
    private static final String PRODUCTSPECITEM_METAKEY = "pc.product.ProductSpecItem";
    private static final String SKU_METAKEY = "pc.product.ProductSKU";
    private static final String BIZ_SKU_METAKEY = "pc.product.ProductSKUDetail";
    private static final String SKU_SPEC_METAKEY = "pc.product.ProductSKUSpecItem";
    private static final String PRODUCT_LINE = "pc.productline.ProductLine";
    private static final String BRAND_METAKEY = "pc.brand.Brand";
    private static final String TPL_METAKEY = "pc.tpl.ProductTpl";
    private static final String UNIT_METAKEY = "pc.unit.Unit";
    private static final String CLASS_METAKEY = "pc.cls.PresentationClass";
    public static final String ORG_METAKEY = "bd.adminOrg.BaseOrgVO";
    @Autowired
    @Qualifier(value="pc.billApiService")
    IUPCBillService billService;
    @Autowired
    IUPCProductQueryService upcProductQueryService;
    @Lazy
    @Autowired
    IUPCProductUpdateService upcProductUpdateService;
    @Lazy
    @Autowired
    IUPCProductDeleteService upcProductDeleteService;
    @Autowired
    BizCache cache;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    private ProductTplService productTplService;
    @Autowired
    private Object.IObject iObject;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private ProductCharactorServiceImpl productCharactorService;
    @Autowired
    private ProductAddRangeService productAddRangeService;
    @Autowired
    ICustomerDocApiService iCustomerDocApiService;

    @Override
    public List<Map> queryApplayRanges(ApiDto dto) throws Exception {
        dto.setFullname(BIZ_METAKEY);
        String strData = "id,productId,rangeType,orgId,orgId.name,customerId,shopId,isCreator,productDetailId.iOrder as detailOrder";
        dto.setData(strData);
        dto.setPartParam(null);
        String key = this.cache.createHashKey(BIZ_DETAIL_METAKEY, (Object)dto, BizCache.Level.ORG);
        List<Map> data = this.cache.get(key, List.class);
        if (data == null && (data = this.billService.getBizData(dto)) != null) {
            this.cache.setVolatile(key, data);
        }
        return data;
    }

    @Override
    public List<Map> getApplayRanges(ApiDto dto) throws Exception {
        dto.setFullname(BIZ_METAKEY);
        ArrayList<String> detailBatchConve = new ArrayList<String>();
        detailBatchConve.add("1 as productAppliedDetail_batchUnit_conversionRate");
        detailBatchConve.addAll(Arrays.asList("*,id as productApplyRangeId,productDetailId.*,orgId,orgId.name,productDetailId.batchPriceUnit.*,productDetailId.batchUnit.*,productDetailId.outTaxrate,productDetailId.outTaxrate.ntaxrate".split(",")));
        dto.setData(detailBatchConve);
        dto.setPartParam(null);
        String key = this.cache.createHashKey(BIZ_DETAIL_METAKEY, (Object)dto, BizCache.Level.ORG);
        List<Map> data = this.cache.get(key, List.class);
        if (data == null) {
            data = this.billService.getBizData(dto);
            if (data == null || data.size() == 0) {
                return data;
            }
            this.extractTrees(data, "batchUnit", "productAppliedDetail_batchUnit_", new String[0]);
            this.extractTrees(data, "batchPriceUnit", "productAppliedDetail_batchPriceUnit_", new String[0]);
            this.mergeProperties(data, "productAppliedDetail_");
            List list = data.stream().filter(m -> !m.containsKey("productAppliedDetail_id")).collect(Collectors.toList());
            List<Long> productIds = list.stream().map(m -> (Long)m.get("productId")).collect(Collectors.toList());
            List<Map> creatorDatas = this.getProductExtends(productIds);
            Map creatorMap = creatorDatas.stream().collect(Collectors.toMap(m -> (Long)m.get("id"), Function.identity()));
            for (Map item : list) {
                Long productId = (Long)item.get("productId");
                if (!creatorMap.containsKey(productId)) continue;
                this.safeMergeMap((Map)creatorMap.get(productId), item, null);
                this.extractTree(item, "batchUnit", "batchUnit_", new String[0]);
                this.extractTree(item, "batchPriceUnit", "batchPriceUnit_", new String[0]);
                HashMap<String, Integer> cr = new HashMap<String, Integer>();
                cr.put("conversionRate", 1);
                Map batchUnitMap = (Map)item.get("batchUnit");
                batchUnitMap.putAll(cr);
                item.put("batchUnit", batchUnitMap);
            }
            List<Map> exchanges = this.upcProductQueryService.getAssistUnitRate(data);
            if (!CollectionUtils.isEmpty(exchanges)) {
                Map<String, List<Map>> exchanges_map = exchanges.stream().collect(Collectors.groupingBy(map -> map.get("productId").toString()));
                for (Map range : data) {
                    String productId = range.get("productId").toString();
                    if (!exchanges_map.containsKey(productId)) continue;
                    List<Map> exchange = exchanges_map.get(productId);
                    Optional<Map> optionalMap = exchange.stream().filter(map -> map.get("productApplyRangeId").toString().equals(range.get("productApplyRangeId").toString())).findAny();
                    optionalMap.ifPresent(map -> range.put("assistUnitExchanges", map));
                }
            }
            this.cache.setVolatile(key, data);
        }
        return data;
    }

    @Override
    public List<Map> getProductExtends(List<Long> productIds) throws Exception {
        List data = null;
        if (null == productIds || productIds.size() == 0) {
            data = new ArrayList<Map>();
            return data;
        }
        QuerySchema schema = QuerySchema.create().addSelect("*,batchPriceUnit.*,batchUnit.*,outTaxrate,outTaxrate.ntaxrate").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)true)});
        data = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        return data;
    }

    @Override
    public Map getApplayRange(Long id, ApiDto dto) throws Exception {
        log.error("com.yonyoucloud.upc.service.api.ProductApiService.getApplayRange\u5b58\u5728\u8c03\u7528");
        Map result = null;
        String groupKey = null;
        Long productId = null;
        result = this.cache.get(BIZ_METAKEY, id, Map.class);
        if (result == null) {
            QuerySchema schema = QuerySchema.create().addSelect("*,id as productApplyRangeId,productDetailId.*,productDetailId.batchPriceUnit.*,productDetailId.batchUnit.*,productDetailId.outTaxrate,productDetailId.outTaxrate.ntaxrate").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)});
            List data = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)schema);
            if (data != null && data.size() > 0) {
                result = (Map)data.get(0);
            }
            if (result != null) {
                List<Map> creatorDatas;
                productId = (Long)result.get("productId");
                this.extractTree(result, "batchUnit", "productDetailId_batchUnit_", new String[0]);
                this.extractTree(result, "batchPriceUnit", "productDetailId_batchPriceUnit_", new String[0]);
                Map batchUnitMapDetail = (Map)result.get("batchUnit");
                if (batchUnitMapDetail != null) {
                    HashMap<String, Integer> crdetail = new HashMap<String, Integer>();
                    crdetail.put("conversionRate", 1);
                    batchUnitMapDetail.putAll(crdetail);
                    result.put("batchUnit", batchUnitMapDetail);
                }
                this.safeMergeMap(result, result, "productDetailId_");
                if (!result.containsKey("productDetailId_id") && (creatorDatas = this.getProductExtends(Arrays.asList(productId))) != null && creatorDatas.size() > 0) {
                    Map creatorData = creatorDatas.get(0);
                    this.extractTree(creatorData, "batchUnit", "batchUnit_", new String[0]);
                    this.extractTree(creatorData, "batchPriceUnit", "batchPriceUnit_", new String[0]);
                    this.safeMergeMap(creatorData, result, null);
                    HashMap<String, Integer> cr = new HashMap<String, Integer>();
                    cr.put("conversionRate", 1);
                    Map batchUnitMap = (Map)creatorData.get("batchUnit");
                    batchUnitMap.putAll(cr);
                    result.put("batchUnit", batchUnitMap);
                }
                groupKey = this.cache.createBindKey(METAKEY, productId);
                this.cache.set(BIZ_METAKEY, id, result, groupKey);
            }
        }
        if (result != null) {
            Map<Long, List<Map>> skus;
            ApiDto productDto = new ApiDto();
            productDto.setData("*");
            HashMap<String, String> parts = new HashMap<String, String>();
            parts.put("productAssistClasses", "");
            parts.put("productspecitems", "");
            parts.put("productParams", "");
            parts.put("description", "");
            parts.put("productTemplate", "");
            productDto.setPartParam(parts);
            Map product = this.getProduct(Long.parseLong(result.get("productId").toString()), productDto);
            result.put("product", product);
            List<Map> exchanges = this.upcProductQueryService.getAssistUnitRate(Arrays.asList(result));
            if (!CollectionUtils.isEmpty(exchanges)) {
                result.put("assistUnitExchanges", exchanges.get(0));
            }
            if ((skus = this.getSkuDetails(id)) != null && skus.containsKey(id)) {
                result.put("skus", skus.get(id));
            }
        }
        return result;
    }

    @Override
    public List<Map> getProducts(ApiDto dto) throws Exception {
        log.error("com.yonyoucloud.upc.service.api.ProductApiService.getProducts\u5b58\u5728\u8c03\u7528");
        dto.setFullname(METAKEY);
        ArrayList<String> detailBatchConve = new ArrayList<String>();
        detailBatchConve.add("1 as detail_batchUnit_conversionRate");
        detailBatchConve.addAll(Arrays.asList("*,productClass.*,unit.*,productTemplate.*,detail.*,detail.batchUnit.*,detail.batchPriceUnit.*".split(",")));
        dto.setData(detailBatchConve);
        List<Map> result = null;
        String cacheKey = this.cache.createHashKey(METAKEY, (Object)dto, BizCache.Level.TENANT);
        result = this.cache.get(cacheKey, List.class);
        if (result == null && (result = this.billService.getBizData(dto)) != null) {
            for (Map product : result) {
                this.dealMultilangField(product);
            }
            this.extractTrees(result, "productClass", "productClass_", new String[0]);
            this.extractTrees(result, "unit", "unit_", new String[0]);
            this.extractTrees(result, "batchUnit", "detail_batchUnit_", new String[0]);
            this.extractTrees(result, "batchPriceUnit", "detail_batchPriceUnit_", new String[0]);
            this.extractTrees(result, "productTemplate", "productTemplate_", new String[0]);
            this.mergeProperties(result, "detail_");
            this.cache.setVolatile(cacheKey, result);
        }
        return result;
    }

    public void dealMultilangField(Map product) {
        String locale = InvocationInfoProxy.getLocale();
        if (org.apache.commons.lang3.StringUtils.isNotEmpty((CharSequence)locale) && org.apache.commons.lang3.StringUtils.equals((CharSequence)locale, (CharSequence)"en_US")) {
            if (product.get("name2") != null) {
                product.put("name", product.get("name2"));
            }
            if (product.get("model2") != null) {
                product.put("model", product.get("model2"));
            }
            if (product.get("modelDescription2") != null) {
                product.put("modelDescription", product.get("modelDescription2"));
            }
            if (product.get("keywords2") != null) {
                product.put("keywords", product.get("keywords2"));
            }
            if (product.get("shareDescription2") != null) {
                product.put("shareDescription", product.get("shareDescription2"));
            }
        } else if (org.apache.commons.lang3.StringUtils.isNotEmpty((CharSequence)locale) && org.apache.commons.lang3.StringUtils.equals((CharSequence)locale, (CharSequence)"zh_TW")) {
            if (product.get("name3") != null) {
                product.put("name", product.get("name3"));
            }
            if (product.get("model3") != null) {
                product.put("model", product.get("model3"));
            }
            if (product.get("modelDescription3") != null) {
                product.put("modelDescription", product.get("modelDescription3"));
            }
            if (product.get("keywords3") != null) {
                product.put("keywords", product.get("keywords3"));
            }
            if (product.get("shareDescription3") != null) {
                product.put("shareDescription", product.get("shareDescription3"));
            }
        }
    }

    @Override
    public Map getProduct(Long id, ApiDto dto) throws Exception {
        List product = MetaDaoHelper.query((String)METAKEY, (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)})));
        Map data = (Map)product.get(0);
        if (data != null) {
            this.dealMultilangField(data);
            this.getProductRefData(data, "unit", UNIT_METAKEY);
            this.getProductRefData(data, "productClass", CLASS_METAKEY);
            List<Map> creatorDatas = this.getProductExtends(Arrays.asList(id));
            if (creatorDatas != null && creatorDatas.size() > 0) {
                this.safeMergeMap(creatorDatas.get(0), data, null);
                this.getProductRefData(data, "batchPriceUnit", UNIT_METAKEY);
                this.getProductRefData(data, "batchUnit", UNIT_METAKEY);
                HashMap<String, Integer> cr = new HashMap<String, Integer>();
                cr.put("conversionRate", 1);
                Map batchUnitMap = (Map)data.get("batchUnit");
                batchUnitMap.putAll(cr);
                data.put("batchUnit", batchUnitMap);
            }
            if (dto.getPartParam() != null) {
                List<Map> specs;
                if (dto.getPartParam().containsKey("productAlbums")) {
                    this.getProductPartData(data, "productAlbums", ALBUM_METAKEY, "productId", null);
                    List albums = (List)data.get("productAlbums");
                    if (albums != null) {
                        for (Map album : albums) {
                            String folder = (String)album.get("folder");
                            if (!StringUtils.hasText((String)folder)) continue;
                            if (folder.toLowerCase().startsWith("http")) {
                                album.put("url", folder);
                                continue;
                            }
                            album.put("url", String.format("%s%s", this.iObject.getFileServer(), folder));
                        }
                    }
                }
                if (dto.getPartParam().containsKey("productAttachments")) {
                    this.getProductPartData(data, "productAttachments", ATTACHMENT_METAKEY, "productId", null);
                }
                if (dto.getPartParam().containsKey("productAssistClasses")) {
                    this.getProductPartData(data, "productAssistClasses", ASSISTCLASS_METAKEY, "productId", "*,productClassId.*");
                    List classes = (List)data.get("productAssistClasses");
                    if (classes != null) {
                        for (Map map : classes) {
                            this.extractTree(map, "productClass", "productClassId_", new String[0]);
                        }
                    }
                }
                if (dto.getPartParam().containsKey("productspecitems") && (specs = this.getProductSpecs(id)) != null) {
                    data.put("productspecitems", specs);
                }
                if (dto.getPartParam().containsKey("productParams")) {
                    this.getProductPartData(data, "productParams", PARAM_METAKEY, "productId", "*,param.*");
                    List params = (List)data.get("productParams");
                    if (params != null) {
                        for (Map map : params) {
                            this.extractTree(map, "param", "param_", new String[0]);
                        }
                    }
                }
                if (dto.getPartParam().containsKey("description")) {
                    this.getProductRefData(data, "description", DESCRIPTION_METAKEY, "productId");
                    if (data.containsKey("titleMemo")) {
                        HashMap description = (HashMap)data.get("description");
                        if (null == description) {
                            description = new HashMap();
                        }
                        description.put("titleMemo", data.get("titleMemo"));
                        data.put("description", description);
                    }
                }
            }
            if (data.containsKey("productTemplate")) {
                if (dto.getPartParam() != null && dto.getPartParam().containsKey("productTemplate")) {
                    data.put("productTemplate", this.getTemplate((Long)data.get("productTemplate")));
                } else {
                    data.remove("productTemplate");
                }
            }
        }
        return data;
    }

    @Override
    public List<Map> getProductSpecs(Long productId) throws Exception {
        HashMap<String, Long> data = new HashMap<String, Long>();
        data.put("id", productId);
        this.getProductPartData(data, "productspecitems", PRODUCTSPECITEM_METAKEY, "productId", "*,iSpecId.*,lsSpecItems_id.*,productspecitemalbums.*");
        QuerySchema schema = QuerySchema.create().addSelect("productTemplate").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        Map product = MetaDaoHelper.queryOne((String)METAKEY, (QuerySchema)schema);
        if (data.containsKey("productspecitems")) {
            List items = (List)data.get("productspecitems");
            HashMap defineClsMap = new HashMap();
            HashMap custValueIdsMap = new HashMap();
            for (Map specitem : items) {
                String iSpecId = specitem.get("iSpecId").toString();
                Long specId = Long.parseLong(iSpecId);
                if (!defineClsMap.containsKey(specId)) {
                    defineClsMap.put(specId, new ArrayList());
                }
                List itemList = (List)defineClsMap.get(specId);
                itemList.add(specitem);
                if (!custValueIdsMap.containsKey(specId)) {
                    custValueIdsMap.put(specId, new ArrayList());
                }
                List ids = (List)custValueIdsMap.get(specId);
                ids.add(specitem.get("lsSpecItems_id").toString());
            }
            ArrayList<Map> defineClss = new ArrayList<Map>();
            for (Long specId : defineClsMap.keySet()) {
                List productTplSpec;
                List specItems = (List)defineClsMap.get(specId);
                Map specItemFirst = (Map)specItems.get(0);
                Map<String, Map<String, Object>> custValueMap = null;
                if (UserDefineTypeEnum.CustArchive.getName().equals(specItemFirst.get("iSpecId_type").toString())) {
                    custValueMap = this.getCustValue(specItemFirst.get("iSpecId_achiveDefineCode").toString(), (List)custValueIdsMap.get(Long.parseLong(specItemFirst.get("iSpecId").toString())));
                }
                HashMap<String, Object> defineCls = new HashMap<String, Object>();
                this.safeMergeMap((Map)specItems.get(0), defineCls, "iSpecId_");
                ArrayList<HashMap<String, Object>> defineItems = new ArrayList<HashMap<String, Object>>();
                for (Map item : (List)defineClsMap.get(specId)) {
                    if (UserDefineTypeEnum.CustArchive.getName().equals(specItemFirst.get("iSpecId_type").toString())) {
                        Map<String, Object> custValueData = custValueMap.get(item.get("lsSpecItems_id").toString());
                        if (custValueData == null || custValueData.isEmpty()) continue;
                        item.put("lsSpecItems_id_code", custValueData.get("code").toString());
                        String locale = InvocationInfoProxy.getLocale();
                        if (custValueData.get("name") instanceof Map) {
                            Map name = (Map)custValueData.get("name");
                            if (null != name.get(locale)) {
                                item.put("lsSpecItems_id_name", name.get(locale));
                            } else if (null != name.get("zh_CN")) {
                                item.put("lsSpecItems_id_name", name.get("zh_CN"));
                            }
                        } else {
                            item.put("lsSpecItems_id_name", custValueData.get("name").toString());
                        }
                    }
                    HashMap<String, Object> define = new HashMap<String, Object>();
                    this.safeMergeMap(item, define, "lsSpecItems_id_");
                    this.safeMergeMap(item, define, "productspecitemalbums_");
                    define.put("iOrder", item.get("iOrder"));
                    define.put("userdefid", item.get("iSpecId"));
                    define.put("id", item.get("lsSpecItems_id"));
                    defineItems.add(define);
                }
                if (null != product.get("productTemplate") && !CollectionUtils.isEmpty((Collection)(productTplSpec = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)(schema = QuerySchema.create().addSelect("order").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"template").eq(product.get("productTemplate")), QueryCondition.name((String)"specification").eq((Object)specId)})))))) {
                    defineCls.put("specOrderInTpl", ((Map)productTplSpec.get(0)).get("order"));
                }
                defineCls.put("specitems", defineItems);
                defineClss.add(defineCls);
            }
            return defineClss;
        }
        return null;
    }

    private Map<String, Map<String, Object>> getCustValue(String defCode, List<String> ids) throws Exception {
        HashMap<String, Map<String, Object>> custValues = new HashMap<String, Map<String, Object>>();
        CustDocDTO custDocDTO = new CustDocDTO();
        custDocDTO.setCustDocDefCode(defCode);
        custDocDTO.setIds(ids);
        custDocDTO.setPageSize(Integer.valueOf(1000));
        ResultPager resultPager = this.iCustomerDocApiService.queryByCondition(custDocDTO);
        List recordList = resultPager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            for (Map data : recordList) {
                custValues.put(data.get("id").toString(), data);
            }
        }
        return custValues;
    }

    private void getProductPartData(Map product, String property, String fullName, String idFiled, String selectFields) throws Exception {
        QuerySchema schema;
        List data;
        Long productId = Long.parseLong(product.get("id").toString());
        if (productId == null) {
            productId = Long.parseLong(product.get("productId").toString());
        }
        if ((data = this.cache.get(fullName, productId, List.class)) == null && (data = MetaDaoHelper.query((String)fullName, (QuerySchema)(schema = QuerySchema.create().addSelect(StringUtils.hasText((String)selectFields) ? selectFields : "*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)idFiled).eq((Object)productId)})))) != null) {
            this.cache.set(fullName, productId, data, this.cache.createBindKey(METAKEY, productId));
        }
        if (data != null) {
            product.put(property, data);
        }
    }

    private void getProductRefData(Map product, String property, String fullName) throws Exception {
        Map data;
        Long id = null;
        if (null != product.get(property)) {
            id = Long.parseLong(product.get(property).toString());
        }
        if (id != null && (data = this.billService.getBizObject(fullName, id)) != null) {
            product.put(property, data);
        }
    }

    private void getProductRefData(Map product, String property, String fullName, String fkField) throws Exception {
        if (StringUtils.hasText((String)fkField)) {
            QuerySchema schema;
            long productId = Long.parseLong(product.get("id").toString());
            Map data = this.cache.get(fullName, productId, Map.class);
            if (data == null && (data = MetaDaoHelper.queryOne((String)fullName, (QuerySchema)(schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)fkField).eq((Object)productId)})))) != null) {
                this.cache.set(fullName, productId, data, this.cache.createBindKey(METAKEY, productId));
            }
            if (data != null) {
                product.put(property, data);
            }
        }
    }

    @Override
    public Map<Long, List<Map>> getSkuDetails(Long applyRangeId) throws Exception {
        QuerySchema skuDetailNewSchema;
        List skuDetailNewList;
        HashMap<Long, List<Map>> result = new HashMap<Long, List<Map>>();
        List productApplyRangeList = MetaDaoHelper.queryById((String)BIZ_METAKEY, (String)"id,productId,productDetailId", (Object)applyRangeId);
        QuerySchema skuSchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").in(new Object[]{((Map)productApplyRangeList.get(0)).get("productId")})});
        List skus = MetaDaoHelper.query((String)SKU_METAKEY, (QuerySchema)skuSchema);
        if (!CollectionUtils.isEmpty((Collection)skus) && !CollectionUtils.isEmpty((Collection)(skuDetailNewList = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)(skuDetailNewSchema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(((Map)productApplyRangeList.get(0)).get("productId")), QueryCondition.name((String)"productDetailId").eq(((Map)productApplyRangeList.get(0)).get("productDetailId"))})))))) {
            Map<Object, List<Map>> skuDetailNewMap = skuDetailNewList.stream().collect(Collectors.groupingBy(a -> a.get("skuId")));
            skus.forEach(a -> {
                this.dealMultilangField((Map)a);
                a.putAll((Map)((List)skuDetailNewMap.get(a.get("id"))).get(0));
            });
            result.put(applyRangeId, skus);
        }
        return result;
    }

    @Override
    public Map getTemplate(Long id) throws Exception {
        Map data = null;
        QuerySchema schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)id)});
        schema.addCompositionSchema(QuerySchema.create().name("Brands").fullname("pc.tpl.ProductTplBrand").addSelect("*"));
        schema.addCompositionSchema(QuerySchema.create().name("Parameters").fullname("pc.tpl.ProductTplParameter").addSelect("*"));
        List list = MetaDaoHelper.query((String)TPL_METAKEY, (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)list)) {
            data = (Map)list.get(0);
        }
        if (data != null) {
            if (data.containsKey("Brands")) {
                data.put("brands", data.get("Brands"));
                data.remove("Brands");
            }
            if (data.containsKey("Specs")) {
                data.put("specs", data.get("Specs"));
                data.remove("Specs");
            }
            if (data.containsKey("Parameters")) {
                data.put("parameters", data.get("Parameters"));
                data.remove("Parameters");
            }
        }
        return data;
    }

    @Override
    public Map getTemplateData(Long id) throws Exception {
        String userLocale = AppContext.getUserLocale();
        String key = this.cache.createKey(TPL_METAKEY, id + "#" + userLocale);
        Map data = this.cache.get(key, Map.class);
        if (data == null && (data = this.productTplService.getTemplateData(id)) != null) {
            this.cache.set(key, data);
        }
        return data;
    }

    @Override
    public Map getTemplateByProductId(Long productId) throws Exception {
        List productMapList = MetaDaoHelper.queryById((String)METAKEY, (String)"productTemplate", (Object)productId);
        if (!CollectionUtils.isEmpty((Collection)productMapList)) {
            return this.getTemplate(Long.parseLong(((Map)productMapList.get(0)).get("productTemplate").toString()));
        }
        return null;
    }

    @Override
    public Map<String, Object> dealOrgIdAndCustId(ApiDto list) throws Exception {
        List listData = (List)list.getData();
        HashMap<String, Object> result = new HashMap<String, Object>();
        listData.forEach(map -> {
            String productId = (String)map.get("productid");
            List listOrgIds = (List)map.get("orgids");
            ArrayList parList = new ArrayList();
            QuerySchema schema = QuerySchema.create().addSelect("orgId").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId").in((Collection)listOrgIds), QueryCondition.name((String)"productId").eq((Object)productId)});
            List data = null;
            try {
                data = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)schema);
            }
            catch (Exception e) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408045C", (String)"\u67e5\u8be2\u7ec4\u7ec7\u5f02\u5e38\uff1a"), (Throwable)e);
                result.put("message", e.getMessage());
                return;
            }
            Set diffentNoDuplicate = (Set)CollectionUtil.getDiffentNoDuplicate((Collection)listOrgIds, (Collection)CollectionUtil.transferMapToLong((List)data));
            diffentNoDuplicate.forEach(orgId -> {
                ProductApplyRange par = new ProductApplyRange();
                par.setId((Object)IdManager.getInstance().nextId());
                par.setOrgId(orgId);
                par.setProductId(Long.valueOf(Long.parseLong(productId)));
                par.setRangeType(Integer.valueOf(1));
                par.setIsCreator(Boolean.valueOf(false));
                par.setIsApplied(Boolean.valueOf(false));
                parList.add(par);
            });
            try {
                if (!CollectionUtils.isEmpty(parList)) {
                    MetaDaoHelper.insert((String)BIZ_METAKEY, parList);
                }
            }
            catch (Exception e) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080469", (String)"\u4fdd\u5b58\u7ec4\u7ec7\u5f02\u5e38\uff1a"), (Throwable)e);
                result.put("message", e.getMessage());
                return;
            }
            List listCustIds = (List)map.get("customerids");
            ArrayList custIdsList = new ArrayList();
            QuerySchema schemaCust = QuerySchema.create().addSelect("customerId").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"customerId").in((Collection)listCustIds), QueryCondition.name((String)"productId").eq((Object)productId)});
            List dataCustIds = null;
            try {
                dataCustIds = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)schemaCust);
            }
            catch (Exception e) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408046A", (String)"\u67e5\u8be2\u5ba2\u6237\u5f02\u5e38\uff1a"), (Throwable)e);
                result.put("message", e.getMessage());
                return;
            }
            Set diffentCustId = (Set)CollectionUtil.getDiffentNoDuplicate((Collection)listCustIds, (Collection)CollectionUtil.transferMapToLong((List)dataCustIds));
            diffentCustId.forEach(custId -> {
                ProductApplyRange par = new ProductApplyRange();
                par.setId((Object)IdManager.getInstance().nextId());
                par.setCustomerId(Long.valueOf(Long.parseLong(custId)));
                par.setProductId(Long.valueOf(Long.parseLong(productId)));
                par.setRangeType(Integer.valueOf(2));
                par.setIsCreator(Boolean.valueOf(false));
                par.setIsApplied(Boolean.valueOf(false));
                custIdsList.add(par);
            });
            try {
                if (!CollectionUtils.isEmpty(custIdsList)) {
                    MetaDaoHelper.insert((String)BIZ_METAKEY, custIdsList);
                }
            }
            catch (Exception e) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408046E", (String)"\u4fdd\u5b58\u5ba2\u6237\u5f02\u5e38\uff1a"), (Throwable)e);
                result.put("message", e.getMessage());
                return;
            }
        });
        return result;
    }

    @Override
    public List<Map<String, Object>> getAllProductLines() throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,name,code,status");
        List query = MetaDaoHelper.query((String)PRODUCT_LINE, (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)query)) {
            return query;
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getProductLinesByCondition(ApiDto list) throws Exception {
        List query;
        String name;
        String code;
        Map data = (Map)list.getData();
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("id,name,code,status");
        List ids = (List)data.get("id");
        if (!CollectionUtils.isEmpty((Collection)ids)) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)ids)});
        }
        if (StringUtils.hasText((String)(code = (String)data.get("code")))) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)code)});
        }
        if (StringUtils.hasText((String)(name = (String)data.get("name")))) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)});
        }
        if (!CollectionUtils.isEmpty((Collection)(query = MetaDaoHelper.query((String)PRODUCT_LINE, (QuerySchema)schema)))) {
            return query;
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getAllBrands() throws Exception {
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("id,brandDesc,randKeywords,name,brandUrl,brandLogo");
        List query = MetaDaoHelper.query((String)BRAND_METAKEY, (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)query)) {
            return query;
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getBrandsByCondition(ApiDto apiDto) throws Exception {
        List query;
        String name;
        String randKeywords;
        Map data = (Map)apiDto.getData();
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("id,brandDesc,randKeywords,name,brandUrl,brandLogo");
        List ids = (List)data.get("id");
        if (!CollectionUtils.isEmpty((Collection)ids)) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)ids)});
        }
        if (StringUtils.hasText((String)(randKeywords = (String)data.get("randKeywords")))) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"randKeywords").eq((Object)randKeywords)});
        }
        if (StringUtils.hasText((String)(name = (String)data.get("name")))) {
            schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)});
        }
        if (!CollectionUtils.isEmpty((Collection)(query = MetaDaoHelper.query((String)BRAND_METAKEY, (QuerySchema)schema)))) {
            return query;
        }
        return null;
    }

    @Override
    public Pager queryProductsWithSKU(BillDataDto bill, ConditionExpression keyWord) throws Exception {
        String path;
        boolean isPage = true;
        Pager result = new Pager();
        String productfield = "*";
        String productskufield = "*";
        if (bill.getExternalData() != null) {
            HashMap externalData = (HashMap)bill.getExternalData();
            if (externalData.get("productfield") != null) {
                productfield = externalData.get("productfield").toString();
            }
            if (externalData.get("productskufield") != null) {
                productskufield = externalData.get("productskufield").toString();
            }
        }
        QueryConditionGroup conditionGroup = new QueryConditionGroup(ConditionOperator.and);
        QueryConditionGroup bodyConditionGroup = new QueryConditionGroup(ConditionOperator.and);
        if (null != keyWord) {
            conditionGroup.appendCondition(new ConditionExpression[]{keyWord});
        }
        if ((path = bill.getPath()) != null) {
            conditionGroup.appendCondition(new ConditionExpression[]{QueryCondition.name((String)"productClass.path").like((Object)("|" + path + "|"))});
        }
        QuerySchema queryProductsSchema = this.getProductQuerySchema(conditionGroup, productfield);
        QuerySchema querySkuSchema = this.getProductSKUQuerySchema(keyWord, bodyConditionGroup, productskufield);
        String queryMainFields = this.getQueryFieldOfProduct(productfield);
        BillDataDto billnew = new BillDataDto();
        billnew.setIsDistinct(true);
        billnew.setBillnum(bill.getBillnum());
        billnew.setCondition(bill.getCondition());
        billnew.setData((Object)queryMainFields);
        billnew.setFullname(METAKEY);
        billnew.setPage(bill.getPage());
        HashMap<String, QuerySchema> partParam = new HashMap<String, QuerySchema>();
        partParam.put("productskus", querySkuSchema);
        billnew.setPartParam(partParam);
        List<Map> resultList = this.billService.getBizData(billnew);
        result.setRecordList(resultList);
        return result;
    }

    private QuerySchema getProductQuerySchema(QueryConditionGroup conditionGroup, String productfields) throws Exception {
        Long customerId = AppContext.getCurrentUser().getCustomer();
        String queryMainFields = productfields;
        QuerySchema queryProductsSchema = null;
        queryProductsSchema = QuerySchema.create().distinct().addSelect(queryMainFields).addCondition((ConditionExpression)conditionGroup).addOrderBy(new QueryOrderby[]{new QueryOrderby("code")});
        return queryProductsSchema;
    }

    private String getQueryFieldOfProduct(String productfields) throws Exception {
        String queryMainFields = productfields;
        return queryMainFields;
    }

    private QuerySchema getProductSKUQuerySchema(ConditionExpression keyWord, QueryConditionGroup bodyConditionGroup, String productfields) throws Exception {
        String querySkuFields = this.getQueryFieldOfSku(productfields);
        QuerySchema querySkuSchema = QuerySchema.create().distinct().name("productskus").addSelect(querySkuFields).addOrderBy(new QueryOrderby[]{new QueryOrderby("code")});
        if (keyWord instanceof QueryCondition && null != keyWord) {
            QueryCondition skuCondition = null;
            String fieldName = ((QueryCondition)keyWord).field();
            String[] fieldArr = fieldName.split("\\.");
            if (null != fieldArr && fieldArr.length > 0 && "productskus".equalsIgnoreCase(fieldArr[0])) {
                int index = fieldName.indexOf(".");
                String subFileldName = fieldName.substring(++index);
                skuCondition = keyWord.op() == ConditionOperator.in ? QueryCondition.name((String)subFileldName).in(((QueryCondition)keyWord).arr1()) : new QueryCondition(subFileldName, keyWord.op(), ((QueryCondition)keyWord).v1());
                bodyConditionGroup.appendCondition(new ConditionExpression[]{skuCondition});
            }
        }
        if (keyWord instanceof QueryConditionGroup && keyWord != null) {
            QueryConditionGroup skuConditionGroup = new QueryConditionGroup(keyWord.op());
            List expressiones = ((QueryConditionGroup)keyWord).conditions();
            for (ConditionExpression expression : expressiones) {
                QueryCondition skuCondition = null;
                String fieldName = ((QueryCondition)expression).field();
                String[] fieldArr = fieldName.split("\\.");
                if (null != fieldArr && fieldArr.length == 2 && "productskus".equalsIgnoreCase(fieldArr[0])) {
                    skuCondition = expression.op() == ConditionOperator.in ? QueryCondition.name((String)fieldArr[1]).in(((QueryCondition)expression).arr1()) : new QueryCondition(fieldArr[1], expression.op(), ((QueryCondition)expression).v1());
                    skuConditionGroup.addCondition((ConditionExpression)skuCondition);
                }
                if (null == fieldArr || fieldArr.length != 3 || !"productskus".equalsIgnoreCase(fieldArr[0])) continue;
                skuCondition = new QueryCondition(fieldArr[1] + "." + fieldArr[2], expression.op(), ((QueryCondition)expression).v1());
                skuConditionGroup.addCondition((ConditionExpression)skuCondition);
            }
            bodyConditionGroup.appendCondition(new ConditionExpression[]{skuConditionGroup});
        }
        querySkuSchema.appendQueryCondition(new ConditionExpression[]{bodyConditionGroup});
        return querySkuSchema;
    }

    private String getQueryFieldOfSku(String productskufields) throws Exception {
        String querySkuFields = productskufields;
        return querySkuFields;
    }

    private String fieldsToString(List<Field> fields) throws Exception {
        String filedString = "";
        if (fields != null && fields.size() > 0) {
            for (Field field : fields) {
                if (field.getFieldName() == null || field.getItemName() == null || field.getbVmExclude() != 0) continue;
                filedString = filedString + field.getFieldName().toString() + " as " + field.getItemName().toString() + ",";
            }
        }
        if (!"".equals(filedString)) {
            filedString = filedString.substring(0, filedString.length() - 1);
        }
        if ("".equals(filedString)) {
            filedString = "*";
        }
        return filedString;
    }

    private void extractTree(Map<String, Object> data, String property, String prefix, String ... subPrefixs) {
        List keys = data.keySet().stream().filter(key -> key.startsWith(prefix)).collect(Collectors.toList());
        if (keys.size() > 0) {
            HashMap<String, Object> partData = new HashMap<String, Object>();
            for (String key2 : keys) {
                partData.put(key2.substring(prefix.length()), data.get(key2));
                data.remove(key2);
            }
            if (subPrefixs != null) {
                for (String subPrefix : subPrefixs) {
                    this.extractTree(partData, subPrefix, subPrefix + "_", new String[0]);
                }
                this.fixObjectNode(partData, subPrefixs);
            }
            data.put(property, partData);
        }
    }

    private void fixObjectNode(Map<String, Object> data, String ... keys) {
        for (String key : keys) {
            if (!data.containsKey(key) || data.get(key) == null || data.get(key) instanceof Map) continue;
            Object id = data.get(key);
            HashMap<String, Object> obj = new HashMap<String, Object>();
            obj.put("id", id);
            data.put(key, obj);
        }
    }

    private void extractTrees(List<Map> list, String property, String prefix, String ... subPrefixs) {
        if (list != null) {
            for (Map map : list) {
                this.extractTree(map, property, prefix, subPrefixs);
            }
        }
    }

    private void mergeProperties(List<Map> list, String prefix) {
        for (Map map : list) {
            this.safeMergeMap(map, map, prefix);
        }
    }

    private void safeMergeMap(Map<String, Object> source, Map<String, Object> target, String prefix) {
        List sourceKeys = source.keySet().stream().collect(Collectors.toList());
        if (StringUtils.hasText((String)prefix)) {
            sourceKeys = sourceKeys.stream().filter(key -> key.startsWith(prefix)).collect(Collectors.toList());
        }
        Iterator iterator = sourceKeys.iterator();
        while (iterator.hasNext()) {
            String key2;
            String targetKey = key2 = (String)iterator.next();
            if (StringUtils.hasText((String)prefix)) {
                targetKey = key2.substring(prefix.length());
            }
            if (target.containsKey(targetKey) && target.get(targetKey) != null) continue;
            target.put(targetKey, source.get(key2));
            if (!source.equals(target)) continue;
            source.remove(key2);
        }
    }

    @Override
    public List<Map> queryProductSkus(BillDataDto dto) throws Exception {
        log.error("com.yonyoucloud.upc.service.api.ProductApiService.queryProductSkus \u5b58\u5728\u8c03\u7528");
        String cacheKey = this.cache.createHashKey(SKU_METAKEY, dto, BizCache.Level.TENANT);
        List data = this.cache.get(cacheKey, List.class);
        if (data != null) {
            return data;
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto, (boolean)true);
        schema.addSelect("*,productSKUDetail.*,batchUnit.*");
        QuerySchema specSchema = QuerySchema.create().name("productSKUSpecItems").fullname(SKU_SPEC_METAKEY).addSelect("productId,specId,specId.*,specItemId,specItemId.*");
        schema.addCompositionSchema(specSchema);
        data = MetaDaoHelper.query((String)SKU_METAKEY, (QuerySchema)schema);
        this.extractTrees(data, "productSKUDetail", "productSKUDetail_", new String[0]);
        this.extractTrees(data, "productSKUDetail", "productSKUDetail!", new String[0]);
        this.extractTrees(data, "batchUnit", "batchUnit_", new String[0]);
        HashSet<Object> productIds = new HashSet<Object>();
        for (Map map : data) {
            productIds.add(map.get("productId"));
        }
        Map<String, Map<String, Object>> custSpecItmMap = this.getCustSpecItemByProductIdMap(productIds);
        for (Map map : data) {
            Map batchUnit = (Map)map.get("productSKUDetail");
            map.put("productSKUDetail", batchUnit);
            List specItems = (List)map.get("productSKUSpecItems");
            if (specItems != null) {
                for (Map specItem : specItems) {
                    String specItemId = specItem.get("specItemId").toString();
                    if (custSpecItmMap.containsKey(specItemId)) {
                        Map<String, Object> custValueData = custSpecItmMap.get(specItemId);
                        specItem.put("specItemId_code", custValueData.get("code"));
                        String locale = InvocationInfoProxy.getLocale();
                        if (custValueData.get("name") instanceof Map) {
                            Map name = (Map)custValueData.get("name");
                            if (null != name.get(locale)) {
                                specItem.put("specItemId_name", name.get(locale));
                            } else if (null != name.get("zh_CN")) {
                                specItem.put("specItemId_name", name.get("zh_CN"));
                            }
                        } else {
                            specItem.put("specItemId_name", custValueData.get("name").toString());
                        }
                        specItem.put("specItemId_iOrder", custValueData.get("iOrder"));
                    }
                    specItem.put("specItemId_userdefid", specItem.get("specId"));
                    specItem.put("specItemId_id", specItem.get("specItemId"));
                }
                this.extractTrees(specItems, "spec", "specId_", new String[0]);
                this.extractTrees(specItems, "item", "specItemId_", new String[0]);
            }
            ArrayList<Map> mergeItems = new ArrayList<Map>();
            if (specItems != null) {
                for (Map item : specItems) {
                    Map spec = (Map)item.get("spec");
                    Object defItem = item.get("item");
                    if (spec == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801382, new Object[]{item.get("skuId")});
                    }
                    spec.put("userdefines", Arrays.asList(defItem));
                    mergeItems.add(spec);
                }
            }
            map.put("productSKUSpecItems", mergeItems);
        }
        this.cache.setVolatile(cacheKey, data);
        return data;
    }

    private Map<String, Map<String, Object>> getCustSpecItemByProductIdMap(Set<Object> productIds) throws Exception {
        HashMap<String, Map<String, Object>> dataMap = new HashMap<String, Map<String, Object>>();
        if (CollectionUtils.isEmpty(productIds)) {
            return dataMap;
        }
        QuerySchema schema = QuerySchema.create().addSelect("iSpecId, iSpecId.type as type, iSpecId.achiveDefineCode as achiveDefineCode, lsSpecItems_id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)}));
        List productSpecItems = MetaDaoHelper.query((String)PRODUCTSPECITEM_METAKEY, (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)productSpecItems)) {
            HashMap custValueIdsMap = new HashMap();
            for (Map item : productSpecItems) {
                if (!UserDefineTypeEnum.CustArchive.getName().equals(item.get("type").toString())) continue;
                if (!custValueIdsMap.containsKey(item.get("achiveDefineCode").toString())) {
                    custValueIdsMap.put(item.get("achiveDefineCode").toString(), new ArrayList());
                }
                List achiveDefineCode = (List)custValueIdsMap.get(item.get("achiveDefineCode").toString());
                achiveDefineCode.add(item.get("lsSpecItems_id").toString());
            }
            if (!custValueIdsMap.isEmpty()) {
                for (Map.Entry entry : custValueIdsMap.entrySet()) {
                    Map<String, Map<String, Object>> custValue = this.getCustValue((String)entry.getKey(), (List)entry.getValue());
                    dataMap.putAll(custValue);
                }
            }
        }
        return dataMap;
    }

    @Override
    public List<Map> queryBizProductSkus(BillDataDto dto) throws Exception {
        String cacheKey = this.cache.createHashKey(BIZ_SKU_METAKEY, dto, BizCache.Level.TENANT);
        List data = this.cache.get(cacheKey, List.class);
        if (data != null) {
            return data;
        }
        QuerySchema schema = BizQueryBuilder.buildQuerySchema((BillDataDto)dto, (boolean)false);
        if (dto.getData() != null && dto.getData().toString().contains(",batchUnit.*")) {
            dto.setData((Object)dto.getData().toString().replace(",batchUnit.*", ",skuId.batchUnit.*"));
        }
        data = MetaDaoHelper.query((String)dto.getFullname(), (QuerySchema)schema);
        this.extractTrees(data, "batchUnit", "skuId_batchUnit_", new String[0]);
        this.cache.setVolatile(cacheKey, data);
        return data;
    }

    @Override
    public Map<String, String> syncUOrderProductAuthorization(BillDataDto dto) throws Exception {
        return this.productAddRangeService.syncUOrderProductAuthorization(dto);
    }

    private void setMapValue(Map<String, String> map, String key, String value) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key).concat(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080468", (String)"\uff1b") + value));
        } else {
            map.put(key, value);
        }
    }

    @Override
    public ResultList syncProductRangeByOrg(Map dto) throws Exception {
        ResultList result = new ResultList();
        List data = (List)dto.get("data");
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        log.info("syncProductRangeByOrg recieve data {}", (Object)data);
        ArrayList<Map> errData = new ArrayList<Map>();
        HashSet orgIds = new HashSet();
        HashSet<String> productErpCodes = new HashSet<String>();
        result.setCount(0);
        result.setFailCount(0);
        int count = 0;
        int failCount = 0;
        for (Map map2 : data) {
            if (map2.get("product_erpCode") != null) {
                productErpCodes.add(map2.get("product_erpCode").toString());
            } else {
                errData.add(map2);
                ++failCount;
                ++count;
            }
            if (map2.get("orgIds") != null) {
                List orgs = (List)map2.get("orgIds");
                orgIds.addAll(orgs.stream().map(org -> org.get("orgId").toString()).collect(Collectors.toList()));
                count += orgs.size();
                continue;
            }
            errData.add(map2);
            ++failCount;
            ++count;
        }
        result.setCount(count);
        if (errData.size() > 0) {
            data.removeAll(errData);
            result.setFailCount(failCount);
            HashMap<String, Object> message = new HashMap<String, Object>();
            message.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408045B", (String)"\u6570\u636e\u683c\u5f0f\u9519\u8bef"));
            message.put("key", errData);
            result.addMessage(message);
            log.info("syncProductRangeByOrg checked error data:{}", errData);
        }
        if (productErpCodes.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801383);
        }
        List productlist = MetaDaoHelper.query((String)METAKEY, (QuerySchema)QuerySchema.create().addSelect("id, erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(productErpCodes)})));
        if (productlist == null || productlist.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801384);
        }
        List orglist = MetaDaoHelper.query((String)ORG_METAKEY, (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIds)})));
        if (orglist == null || orglist.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801385);
        }
        List productErpCodesInDb = productlist.stream().map(map -> map.get("erpCode").toString()).collect(Collectors.toList());
        List orgIdsInDb = orglist.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
        List notExistsData = data.stream().filter(map -> !productErpCodesInDb.contains(map.get("product_erpCode").toString())).collect(Collectors.toList());
        if (notExistsData.size() > 0) {
            data.removeAll(notExistsData);
            for (Map map3 : notExistsData) {
                List orgs = (List)map3.get("orgIds");
                failCount += orgs.size();
                HashMap<String, String> message = new HashMap<String, String>();
                message.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408047B", (String)"\u7269\u6599\u4e0d\u5b58\u5728"));
                message.put("key", map3.get("product_erpCode").toString());
                result.addMessage(message);
            }
            result.setFailCount(failCount);
            log.info("syncProductRangeByOrg checked product_erpCode not exists data:{}", notExistsData);
        }
        ArrayList<ProductApplyRange> ranges2Db = new ArrayList<ProductApplyRange>();
        for (Map product : data) {
            List orgs = (List)product.get("orgIds");
            Long productId = (Long)productlist.stream().filter(map -> map.get("erpCode").toString().equals(product.get("product_erpCode").toString())).findAny().get().get("id");
            List rangesInDb = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").in((Collection)orgs.stream().map(map -> map.get("orgId")).collect(Collectors.toList()))}))).stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
            for (Map org2 : orgs) {
                if (!orgIdsInDb.contains(org2.get("orgId").toString())) {
                    HashMap<String, String> orgMessage = new HashMap<String, String>();
                    orgMessage.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080456", (String)"\u7ec4\u7ec7\u4e0d\u5b58\u5728"));
                    orgMessage.put("key", org2.get("erpCode").toString());
                    result.addMessage(orgMessage);
                    ++failCount;
                    continue;
                }
                if (!rangesInDb.contains(org2.get("orgId").toString())) {
                    ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, 1, org2.get("orgId").toString(), null);
                    ranges2Db.add(range);
                    range.put("erpCode", org2.get("erpCode"));
                    ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
                    ranges.add(range);
                    HashMap<String, Object> info_data = new HashMap<String, Object>();
                    info_data.put("orgIds", ranges);
                    info_data.put("subName", "orgIds");
                    HashMap<String, HashMap<String, Object>> info = new HashMap<String, HashMap<String, Object>>();
                    info.put("data", info_data);
                    result.addInfo(info);
                    continue;
                }
                HashMap<String, String> rangeMessage = new HashMap<String, String>();
                rangeMessage.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408045E", (String)"\u5206\u914d\u5173\u7cfb\u5df2\u5b58\u5728"));
                rangeMessage.put("key", org2.get("erpCode").toString());
                result.addMessage(rangeMessage);
                ++failCount;
            }
        }
        result.setFailCount(failCount);
        if (ranges2Db.size() > 0) {
            result.setSucessCount(ranges2Db.size());
            MetaDaoHelper.insert((String)BIZ_METAKEY, ranges2Db);
        }
        log.info("syncProductRangeByOrg result:[{}]", (Object)result);
        return result;
    }

    @Override
    public Map<String, String> delProductApplyRange(BillDataDto dto) throws Exception {
        HashMap<String, String> result = new HashMap<String, String>();
        if (!"pc_product".equalsIgnoreCase(dto.getBillnum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800864);
        }
        List data = (List)dto.getData();
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        ArrayList<Map> errData = new ArrayList<Map>();
        ArrayList<Map> wrongData = new ArrayList<Map>();
        log.info("delProductApplyRange recieve data : " + data.toString());
        for (Map map : data) {
            if (!(map.containsKey("productId") && map.containsKey("productApplyRangeId") && map.containsKey("isCreator") && map.containsKey("isApplied"))) {
                errData.add(map);
                continue;
            }
            if (!Boolean.valueOf(map.get("isCreator").toString()).booleanValue() && !Boolean.valueOf(map.get("isApplied").toString()).booleanValue()) continue;
            wrongData.add(map);
        }
        if (!errData.isEmpty()) {
            data.removeAll(errData);
            this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080470", (String)"\u6570\u636e\u683c\u5f0f\u9519\u8bef\uff1a") + ((Object)errData).toString() + "");
        }
        if (!wrongData.isEmpty()) {
            data.removeAll(wrongData);
            this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080471", (String)"\u5546\u54c1\u4e3a\u81ea\u5efa\u5546\u54c1\u6216\u5546\u54c1\u5df2\u88ab\u4f7f\u7528\uff0c\u65e0\u6cd5\u5220\u9664\uff1a") + ((Object)wrongData).toString() + "");
        }
        if (data.isEmpty()) {
            return result;
        }
        ArrayList<ProductApplyRange> list = new ArrayList<ProductApplyRange>();
        for (Map map : data) {
            ProductApplyRange range = new ProductApplyRange();
            range.setId(map.get("productApplyRangeId"));
            range.setProductId((Long)map.get("id"));
            range.setEntityStatus(EntityStatus.Delete);
            list.add(range);
        }
        this.upcProductDeleteService.deleteProductApplyRange(list);
        this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080479", (String)"\u5546\u54c1\u5220\u9664\u6210\u529f\uff1a") + data.toString() + "");
        log.info("delProductApplyRange return data : " + result);
        return result;
    }

    @Override
    public List<Map<String, Object>> getProductClassByIds(ApiDto list) throws Exception {
        List data = (List)list.getData();
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("id");
        ArrayList<QueryCondition> conditions = new ArrayList<QueryCondition>();
        for (Object path : data) {
            conditions.add(QueryCondition.name((String)"productClass.path").like(path));
            conditions.add(QueryCondition.name((String)"productClass.path").left_like(path));
        }
        QueryConditionGroup group = QueryConditionGroup.or((ConditionExpression[])((ConditionExpression[])conditions.toArray(new QueryCondition[conditions.size()])));
        schema.queryConditionGroup(group);
        return MetaDaoHelper.query((String)METAKEY, (QuerySchema)schema);
    }

    @Override
    public List<Map<String, Object>> getOrgsByOrgId(ApiDto list) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("id", list.getData());
        params.put("tenantId", AppContext.getTenantId());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(list.getData())});
        QuerySchema schema = QuerySchema.create().addSelect("code,name,path,fullname,parent,id,tenant,stopstatus").addCondition((ConditionExpression)queryConditionGroup);
        Map panentorg = MetaDaoHelper.queryOne((String)"aa.baseorg.SaleOrgSubMV", (QuerySchema)schema);
        if (panentorg == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801386);
        }
        QueryConditionGroup suborgscondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(list.getData()), QueryCondition.name((String)"path").left_like(panentorg.get("path"))});
        QuerySchema suborgsschema = QuerySchema.create().addSelect("code,name,path,fullname,parent,id,tenant,stopstatus").addCondition((ConditionExpression)suborgscondition);
        List orgs = MetaDaoHelper.query((String)"aa.baseorg.SaleOrgSubMV", (QuerySchema)suborgsschema);
        for (Map org : orgs) {
            if (Integer.parseInt(org.get("stopstatus").toString()) == 0) {
                org.put("stopstatus", false);
            } else {
                org.put("stopstatus", true);
            }
            QueryConditionGroup funcCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"org").eq(list.getData())});
            QuerySchema funcSchema = QuerySchema.create().addSelect("id,org,orgFunc").addCondition((ConditionExpression)funcCondition);
            List funcs = MetaDaoHelper.query((String)"aa.baseorg.OrgAndFuncMV", (QuerySchema)funcSchema);
            org.put("orgAndFuncs", funcs);
        }
        return orgs;
    }

    @Override
    public List<Map<String, Object>> getProductClassByShop(Long shopId, ApiDto dto) throws Exception {
        List ids = null;
        if (shopId != null && shopId > 0L) {
            QuerySchema schema = QuerySchema.create().addSelect("classId").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"shop").eq((Object)shopId)});
            List data = MetaDaoHelper.query((String)"pc.cls.ShopPresentationClass", (QuerySchema)schema, null, (boolean)false);
            ids = data.stream().map(map -> (Long)map.get("classId")).collect(Collectors.toList());
        }
        QuerySchema clsQuery = BizQueryBuilder.buildQuerySchema((BillDataDto)dto, (boolean)true).addSelect("*");
        if (ids != null && ids.size() > 0) {
            clsQuery.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)ids)});
        }
        return MetaDaoHelper.query((String)CLASS_METAKEY, (QuerySchema)clsQuery);
    }

    @Override
    public boolean checkProductByShopId(ApiDto list) throws Exception {
        Map data = (Map)list.getData();
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        List shopIds = (List)data.get("shopIds");
        if (CollectionUtils.isEmpty((Collection)shopIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801387);
        }
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("count(1) as total");
        schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"shopId").in((Collection)shopIds)});
        List result = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)schema);
        boolean flag = false;
        if (!CollectionUtils.isEmpty((Collection)result) && result.get(0) != null) {
            flag = (Long)((Map)result.get(0)).get("total") <= 0L;
        }
        return flag;
    }

    @Override
    public Map<String, String> updateSKUSaled(ApiDto bill) throws Exception {
        log.error("com.yonyoucloud.upc.service.api.ProductApiService.updateSKUSaled\u5b58\u5728\u8c03\u7528");
        if (!"pc_goodsproductskuprolist".equals(bill.getBillnum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801388);
        }
        List list = (List)bill.getData();
        if (list == null || list.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        log.info("updateSKUSaled receive data : " + list);
        ArrayList<Map> errData = new ArrayList<Map>();
        HashMap<String, String> result = new HashMap<String, String>();
        for (Map map : list) {
            if (!(map.containsKey("skuId") && map.containsKey("productApplyRangeId") && map.containsKey("saled"))) {
                errData.add(map);
                continue;
            }
            if (!(map.get("saled") instanceof Boolean)) {
                errData.add(map);
                continue;
            }
            map.put("tenant_Id", AppContext.getCurrentUser().getTenant());
            map.put("ytenant", AppContext.getYhtTenantId());
        }
        if (errData.size() > 0) {
            list.removeAll(errData);
            this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080470", (String)"\u6570\u636e\u683c\u5f0f\u9519\u8bef\uff1a") + ((Object)errData).toString());
        }
        if (list.size() > 0) {
            List<Map> data = this.upcProductQueryService.getSKUSaled(list);
            if (data.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801389);
            }
            ArrayList<ProductSKUExtend> creatorData = new ArrayList<ProductSKUExtend>();
            ArrayList<ProductSKUDetail> applyData = new ArrayList<ProductSKUDetail>();
            for (Map map : data) {
                Optional<Map> optionalMap = list.stream().filter(item -> item.get("skuId").equals(map.get("skuid")) && item.get("productApplyRangeId").equals(map.get("productapplyrangeid"))).findFirst();
                if (!optionalMap.isPresent() || optionalMap.get().get("saled").equals(map.get("saled"))) continue;
                if (map.get("iscreator").equals(true)) {
                    ProductSKUExtend extend = new ProductSKUExtend();
                    extend.setId(map.get("skudetailid"));
                    extend.put("saled", optionalMap.get().get("saled"));
                    extend.setEntityStatus(EntityStatus.Update);
                    creatorData.add(extend);
                    continue;
                }
                if (!map.get("iscreator").equals(false)) continue;
                ProductSKUDetail detail = new ProductSKUDetail();
                detail.setId(map.get("skudetailid"));
                detail.put("saled", optionalMap.get().get("saled"));
                detail.setEntityStatus(EntityStatus.Update);
                applyData.add(detail);
            }
            if (!creatorData.isEmpty()) {
                log.info("updateSKUSaled updating extend data : " + creatorData);
                MetaDaoHelper.update((String)"pc.product.ProductSKUExtend", creatorData);
            }
            if (!applyData.isEmpty()) {
                log.info("updateSKUSaled updating detail data : " + applyData);
                MetaDaoHelper.update((String)BIZ_SKU_METAKEY, applyData);
            }
            this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080458", (String)"\u66f4\u65b0\u6210\u529f\uff0c\u5171\uff1a") + (creatorData.size() + applyData.size()) + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080457", (String)"\u6761"));
        }
        return result;
    }

    @Override
    public Map<String, String> updateProductAllArea(ApiDto bill) throws Exception {
        if (!"pc_product".equals(bill.getBillnum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801388);
        }
        Map data = (Map)bill.getData();
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800865);
        }
        log.info("updateProductAllArea receive data : " + data);
        if (!data.containsKey("productId") || !data.containsKey("isAllArea")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801390);
        }
        QueryCondition condition = !data.containsKey("shopId") ? QueryCondition.name((String)"isCreator").eq((Object)true) : QueryCondition.name((String)"shopId").eq(data.get("shopId"));
        List ranges = MetaDaoHelper.query((String)BIZ_METAKEY, (QuerySchema)QuerySchema.create().addSelect("id, productId, isCreator, isApplied,productDetailId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(data.get("productId")), condition})));
        if (ranges == null || ranges.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801391);
        }
        if (ranges.size() > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801392);
        }
        if (!((Map)ranges.get(0)).containsKey("isApplied") || ((Map)ranges.get(0)).get("isApplied").equals(false)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801393);
        }
        HashMap<String, String> result = new HashMap<String, String>();
        ProductDetail productDetail = new ProductDetail();
        productDetail.setId(((Map)ranges.get(0)).get("productDetailId"));
        productDetail.setIsAllArea(Boolean.valueOf(data.get("isAllArea").toString()));
        productDetail.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"pc.product.ProductDetail", (BizObject)productDetail);
        this.setMapValue(result, "msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408046C", (String)"\u66f4\u65b0\u6210\u529f"));
        return result;
    }

    @Override
    public Map<String, Object> getProductData(Long productId, Long rangeId) throws Exception {
        log.error("com.yonyoucloud.upc.service.api.ProductApiService.getProductData\u5b58\u5728\u8c03\u7528");
        boolean isApply = false;
        Long extendRangeId = null;
        Map<String, Object> result = null;
        if (productId != null) {
            result = this.getProductData(productId);
            if (result == null) {
                return null;
            }
            extendRangeId = (Long)result.get("detail_productApplyRangeId");
        }
        if (rangeId != null) {
            if (!rangeId.equals(extendRangeId)) {
                Map rangData = this.billService.getBizObject(BIZ_METAKEY, rangeId);
                if (rangData != null && rangData.get("productId") != null) {
                    productId = (Long)rangData.get("productId");
                    isApply = (Boolean)rangData.get("isApplied");
                    if (result == null) {
                        result = this.getProductData(productId);
                    }
                } else {
                    rangeId = extendRangeId;
                }
            }
        } else {
            rangeId = extendRangeId;
        }
        if (result != null) {
            Map<String, Object> rangeData = this.getRangeData(productId, rangeId, isApply);
            if (rangeData != null) {
                List details;
                Map<Long, List<Map>> skuMap;
                rangeData.put("applyRangeId", rangeData.get("id"));
                List skus = (List)result.get("productskus");
                if (rangeData.containsKey("defaultSKUAppliedOrderProperties")) {
                    if (skus != null) {
                        List orderPropds = (List)rangeData.get("defaultSKUAppliedOrderProperties");
                        skuMap = orderPropds.stream().collect(Collectors.groupingBy(map -> (Long)map.get("skuId")));
                        skus.forEach(sku -> {
                            Long skuId = (Long)sku.get("id");
                            if (skuMap.containsKey(skuId)) {
                                sku.put("skuOrderProperties", skuMap.get(skuId));
                            }
                        });
                    }
                    rangeData.remove("defaultSKUAppliedOrderProperties");
                }
                if (rangeData.containsKey("productSKUAppliedDetails")) {
                    if (skus != null) {
                        details = (List)rangeData.get("productSKUAppliedDetails");
                        skuMap = details.stream().collect(Collectors.groupingBy(map -> (Long)map.get("skuId")));
                        skus.forEach(sku -> {
                            Long skuId = (Long)sku.get("id");
                            if (skuMap.containsKey(skuId)) {
                                sku.put("productSKUDetail", ((List)skuMap.get(skuId)).get(0));
                            }
                        });
                    }
                    rangeData.remove("productSKUAppliedDetails");
                }
                if (rangeData.containsKey("productSKUAppliedLvPrices")) {
                    if (skus != null) {
                        details = (List)rangeData.get("productSKUAppliedLvPrices");
                        skuMap = details.stream().collect(Collectors.groupingBy(map -> (Long)map.get("skuId")));
                        skus.forEach(sku -> {
                            Long skuId = (Long)sku.get("id");
                            if (skuMap.containsKey(skuId)) {
                                sku.put("productSKULvPrices", skuMap.get(skuId));
                            }
                        });
                    }
                    rangeData.remove("productSKUAppliedLvPrices");
                }
                for (String key : rangeData.keySet()) {
                    if (result.containsKey(key)) continue;
                    result.put(key, rangeData.get(key));
                }
            }
            if (result.get("productTemplate") != null) {
                Map tplData = this.getTemplate((Long)result.get("productTemplate"));
                result.put("productTemplate", tplData);
            }
        }
        return result;
    }

    private Map<String, Object> getRangeData(Long productId, Long rangeId, Boolean isApply) throws Exception {
        BillDataDto dto = new BillDataDto();
        dto.setFullname(BIZ_METAKEY);
        dto.setData((Object)"id");
        dto.setId(rangeId.toString());
        HashMap<String, String> parts = new HashMap<String, String>();
        if (isApply.booleanValue()) {
            parts.put("productAppliedParams", "pc.product.ProductParameters");
            parts.put("productAppliedLvPrices", "pc.product.ProductLvPrice");
        }
        dto.setPartParam(parts);
        List<Map> list = this.billService.getBizData(dto);
        if (list != null && list.size() > 0) {
            Map result = list.get(0);
            if (result.containsKey("productAppliedParams")) {
                result.put("productParams", result.get("productAppliedParams"));
                result.remove("productAppliedParams");
            }
            if (isApply.booleanValue()) {
                QuerySchema schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq((Object)rangeId)});
                result.put("productSKUAppliedDetails", MetaDaoHelper.query((String)BIZ_SKU_METAKEY, (QuerySchema)schema));
                schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq((Object)rangeId)});
                result.put("productSKUAppliedLvPrices", MetaDaoHelper.query((String)"pc.product.ProductSKULvPrice", (QuerySchema)schema));
            }
            return result;
        }
        return null;
    }

    private Map<String, Object> getProductData(Long productId) throws Exception {
        BillDataDto dto = new BillDataDto();
        dto.setFullname(METAKEY);
        dto.setId(productId.toString());
        dto.setData((Object)"id,code,name,productTemplate,detail.productApplyRangeId");
        HashMap<String, String> parts = new HashMap<String, String>();
        parts.put("productAlbums", ALBUM_METAKEY);
        parts.put("productAttachments", ATTACHMENT_METAKEY);
        parts.put("productParams", PARAM_METAKEY);
        parts.put("define", "pc.product.ProductDefine");
        parts.put("description", DESCRIPTION_METAKEY);
        QuerySchema skuSchema = QuerySchema.create().name("productskus").fullname(SKU_METAKEY).addSelect("*");
        QuerySchema skuDefineSchema = QuerySchema.create().name("skudefine").fullname("pc.product.ProductSKUDefine").addSelect("*");
        skuSchema.addCompositionSchema(skuDefineSchema);
        QuerySchema detailSchema = QuerySchema.create().name("productSKUDetail").fullname("pc.product.ProductSKUExtend").addSelect("*");
        skuSchema.addCompositionSchema(detailSchema);
        QuerySchema orderPropSchema = QuerySchema.create().name("skuOrderProperties").fullname("pc.product.SKUOrderPropertyExtend").addSelect("*");
        skuSchema.addCompositionSchema(orderPropSchema);
        QuerySchema lvPriceSchema = QuerySchema.create().name("productSKULvPrices").fullname("pc.product.ProductSKULvPriceExtend").addSelect("*");
        skuSchema.addCompositionSchema(lvPriceSchema);
        parts.put("productskus", (String)skuSchema);
        QuerySchema specSchema = QuerySchema.create().fullname(PRODUCTSPECITEM_METAKEY).addSelect("id,iSpecId,iSpecId.showItem,iSpecId.defineId,iOrder,specValue");
        QuerySchema specAlbumSchema = QuerySchema.create().name("productspecitemalbums").fullname("pc.product.ProductSpecItemAlbum").addSelect("*");
        specSchema.addCompositionSchema(specAlbumSchema);
        parts.put("productspecitems", (String)specSchema);
        dto.setPartParam(parts);
        List<Map> list = this.billService.getBizData(dto);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public Map<String, Object> getProductSpecSet(Long productId) throws Exception {
        BillDataDto dto = new BillDataDto();
        dto.setFullname(METAKEY);
        dto.setId(productId.toString());
        dto.setData((Object)"id,code,name,productTemplate");
        HashMap<String, QuerySchema> parts = new HashMap<String, QuerySchema>();
        QuerySchema specSchema = QuerySchema.create().name("productspecitems").fullname(PRODUCTSPECITEM_METAKEY).addSelect("iSpecId,iSpecId.showItem,iSpecId.defineId,iOrder,specValue");
        parts.put("productspecitems", specSchema);
        QuerySchema skuSchema = QuerySchema.create().name("productskus").fullname(SKU_METAKEY).addSelect("id,code,name");
        QuerySchema skuSpecSchema = QuerySchema.create().name("productSKUSpecItems").fullname(SKU_SPEC_METAKEY).addSelect("skuId,specId,specId.showItem,specId.defineId, specItemId.name as specValue");
        skuSchema.addCompositionSchema(skuSpecSchema);
        parts.put("productskus", skuSchema);
        dto.setPartParam(parts);
        List<Map> list = this.billService.getBizData(dto);
        if (list != null && list.size() > 0) {
            Long tplId;
            Map tplData;
            Map data = list.get(0);
            if (data.get("productTemplate") != null && (tplData = this.productTplService.getTemplateData(tplId = (Long)data.get("productTemplate"))) != null) {
                data.put("productTemplate", tplData);
            }
            return data;
        }
        return null;
    }

    @Override
    public Map<String, Object> getProductSpecSetByPage(Long productId, Integer pageIndex, Integer pageSize) throws Exception {
        BillDataDto dto = new BillDataDto();
        dto.setFullname(METAKEY);
        dto.setId(productId.toString());
        dto.setData((Object)"id,code,name,productTemplate");
        HashMap<String, QuerySchema> parts = new HashMap<String, QuerySchema>();
        pageIndex = pageIndex == null ? 1 : pageIndex;
        pageSize = pageSize == null ? 500 : pageSize;
        pageSize = pageSize > 500 ? 500 : pageSize;
        QuerySchema specSchema = QuerySchema.create().name("productspecitems").fullname(PRODUCTSPECITEM_METAKEY).addSelect("iSpecId,iSpecId.showItem,iSpecId.defineId,iOrder,specValue");
        specSchema.addPager(pageIndex.intValue(), pageSize.intValue());
        parts.put("productspecitems", specSchema);
        QuerySchema skuSchema = QuerySchema.create().name("productskus").fullname(SKU_METAKEY).addSelect("id,code,name");
        skuSchema.addPager(pageIndex.intValue(), pageSize.intValue());
        QuerySchema skuSpecSchema = QuerySchema.create().name("productSKUSpecItems").fullname(SKU_SPEC_METAKEY).addSelect("skuId,specId,specId.showItem,specId.defineId, specItemId.name as specValue");
        skuSpecSchema.addPager(pageIndex.intValue(), pageSize.intValue());
        skuSchema.addCompositionSchema(skuSpecSchema);
        parts.put("productskus", skuSchema);
        dto.setPartParam(parts);
        List<Map> list = this.billService.getBizData(dto);
        if (list != null && list.size() > 0) {
            List<ProductCharacterDTO> productCharacterDTOS;
            Long tplId;
            Map tplData;
            Map data = list.get(0);
            if (data.get("productTemplate") != null && (tplData = this.productTplService.getTemplateData(tplId = (Long)data.get("productTemplate"))) != null) {
                data.put("productTemplate", tplData);
            }
            if ((productCharacterDTOS = this.productCharactorService.listUsedCharactorByProductId(productId)) != null) {
                data.put("productfreecharacteritems", productCharacterDTOS);
            }
            return data;
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getProductSpecSets(List<Long> products) throws Exception {
        ArrayList<Map<String, Object>> productSpecSets = new ArrayList<Map<String, Object>>();
        if (products != null && products.size() > 0) {
            for (Long id : products) {
                Map<String, Object> productSpecSet = this.getProductSpecSetByPage(Long.parseLong(((Object)id).toString()), null, null);
                productSpecSets.add(productSpecSet);
            }
        }
        return productSpecSets;
    }

    @Override
    public Map<String, BigDecimal> getUnitRate(Long unitId, Long assistUnitId, BigDecimal assistUnitCount, BigDecimal mainUnitCount) throws Exception {
        HashMap<String, BigDecimal> data = new HashMap<String, BigDecimal>();
        if (null == unitId || null == assistUnitId || (null == assistUnitCount || assistUnitCount.compareTo(BigDecimal.ZERO) <= 0) && (null == mainUnitCount || mainUnitCount.compareTo(BigDecimal.ZERO) <= 0)) {
            return null;
        }
        int scale = (Integer)OptionUtils.getSysOptionByName((String)"conversionAccuracy");
        Map unitMap = MetaDaoHelper.queryOne((String)UNIT_METAKEY, (QuerySchema)QuerySchema.create().addSelect(new String[]{"convertCoefficient", "unitGroup"}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitId)}));
        if (unitMap == null || null == unitMap.get("convertCoefficient") || ((BigDecimal)unitMap.get("convertCoefficient")).compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        Map assistUnitMap = MetaDaoHelper.queryOne((String)UNIT_METAKEY, (QuerySchema)QuerySchema.create().addSelect(new String[]{"convertCoefficient", "unitGroup"}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)assistUnitId)}));
        if (assistUnitMap == null || null == assistUnitMap.get("convertCoefficient") || ((BigDecimal)assistUnitMap.get("convertCoefficient")).compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        if (!unitMap.get("unitGroup").toString().equals(assistUnitMap.get("unitGroup").toString())) {
            return null;
        }
        Map baseMap = MetaDaoHelper.queryOne((String)UNIT_METAKEY, (QuerySchema)QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"unitGroup").eq(unitMap.get("unitGroup")), QueryCondition.name((String)"bBaseUnit").eq((Object)true), QueryCondition.name((String)"stopstatus").eq((Object)false)}));
        if (null == baseMap) {
            return null;
        }
        if ((null == mainUnitCount || mainUnitCount.compareTo(BigDecimal.ZERO) < 0) && assistUnitCount.compareTo(BigDecimal.ZERO) > 0) {
            data.put("mainUnitCount", assistUnitCount.multiply((BigDecimal)assistUnitMap.get("convertCoefficient")).divide((BigDecimal)unitMap.get("convertCoefficient"), scale, 4));
        }
        if ((null == assistUnitCount || assistUnitCount.compareTo(BigDecimal.ZERO) < 0) && mainUnitCount.compareTo(BigDecimal.ZERO) > 0) {
            data.put("assistUnitCount", mainUnitCount.multiply((BigDecimal)unitMap.get("convertCoefficient")).divide((BigDecimal)assistUnitMap.get("convertCoefficient"), scale, 4));
        }
        return data;
    }
}

