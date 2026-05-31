/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.common.ICoordinatedRefService
 *  com.yonyou.iuap.apdoc.coredoc.utils.WebUrlUtil
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QueryJoin
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.common.ICoordinatedRefService;
import com.yonyou.iuap.apdoc.coredoc.utils.WebUrlUtil;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.constants.ProductFieldMapping;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QueryJoin;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CoordinatedRefService
implements ICoordinatedRefService {
    private static final Logger log = LoggerFactory.getLogger(CoordinatedRefService.class);
    @Autowired
    AttachmentServiceImpl attachmentService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    WebUrlUtil webUrlUtil;

    public Pager getCoordinatedRefData(BillDataDto billDataDto) throws Exception {
        boolean existQueryIdS;
        if (billDataDto == null) {
            throw new CoreDocBusinessException(null, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A205380083", (String)"\u53c2\u7167\u5e26\u503c\u5165\u53c2\u4e0d\u80fd\u4e3a\u7a7a"));
        }
        QuerySchema querySchema = new QuerySchema();
        HashMap<String, String> extendMap = new HashMap<String, String>(4){
            {
                this.put("filterByMasterOrgFlag", "true");
            }
        };
        String refCode = billDataDto.getRefCode();
        String ids = billDataDto.getIds();
        boolean checkFlag = null != ProductFieldMapping.COORDINATED_REFCODES.get(refCode) && !ProductFieldMapping.COORDINATED_REFCODES.get(refCode).isEmpty();
        Boolean hasIdField = false;
        boolean bl = existQueryIdS = ids != null && ids.contains(",");
        if (null == billDataDto.getPage() && existQueryIdS) {
            if (ids.split(",").length > UpcAPiTool.DEFAULT_PAGE_MAX_SIZE) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801019, new Object[]{UpcAPiTool.DEFAULT_PAGE_MAX_SIZE});
            }
            QueryPagerVo queryPagerVo = new QueryPagerVo(UpcAPiTool.DEFAULT_PAGE_INDEX.intValue(), UpcAPiTool.DEFAULT_PAGE_MAX_SIZE.intValue());
            queryPagerVo.setTotalCount(1);
            billDataDto.setPage(queryPagerVo);
        }
        CoordinatedRefService.dealSimpleFilter(billDataDto);
        HashMap urlMap = new HashMap(2);
        this.buildQuerySchema(querySchema, refCode, checkFlag, existQueryIdS, billDataDto.getQuery(), urlMap, hasIdField);
        billDataDto.setQuerySchema(querySchema);
        String extendCondition = JSON.toJSONString((Object)extendMap);
        billDataDto.setExtendCondition(extendCondition);
        Pager result = (Pager)this.billService.getRefData(billDataDto);
        this.getCoordinatedRefDataResult(ids, existQueryIdS, result, urlMap, hasIdField);
        return result;
    }

    private static void dealSimpleFilter(BillDataDto billDataDto) {
        if (null != billDataDto.getCondition() && null != billDataDto.getCondition().getSimpleVOs()) {
            SimpleFilterVO[] simpleFilterVO = billDataDto.getCondition().getSimpleVOs();
            for (int i = 0; i < simpleFilterVO.length; ++i) {
                if (simpleFilterVO[i].getField() == null || !simpleFilterVO[i].getField().contains("productApplyRangeId")) continue;
                Object value1S = simpleFilterVO[i].getValue1();
                ArrayList<String> value1List = new ArrayList<String>();
                if (value1S instanceof List) {
                    for (Object o : (List)value1S) {
                        if (o == null) {
                            value1List.add("1111");
                            continue;
                        }
                        if (o instanceof Long) {
                            value1List.add(String.valueOf(o));
                            continue;
                        }
                        if (!(o instanceof String)) continue;
                        value1List.add((String)o);
                    }
                }
                simpleFilterVO[i].setValue1(value1List);
            }
        }
    }

    private void buildQuerySchema(QuerySchema querySchema, String refCode, boolean checkFlag, boolean existQueryIdS, Map<String, Object> map, Map urlMap, Boolean hasIdField) {
        if (map != null && map.get("selectFields") != null && map.get("selectFields") instanceof List) {
            List list = (List)map.get("selectFields");
            for (Map queryMap : list) {
                boolean ignorTransFlag = true;
                for (String string : ProductFieldMapping.IGNOR_TRANS) {
                    if (!queryMap.get("name").toString().contains(string)) continue;
                    ignorTransFlag = false;
                }
                if (checkFlag && ignorTransFlag) {
                    for (Map.Entry entry : ProductFieldMapping.REPLACE_ALIAS_MAP.entrySet()) {
                        if (!queryMap.get("alias").toString().contains((CharSequence)entry.getKey())) continue;
                        queryMap.replace("alias", queryMap.get("alias").toString().replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue()));
                    }
                    if ("productcenter.productskuref".equalsIgnoreCase(refCode) && queryMap.get("name").toString().contains("productId.")) {
                        if (null != ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(queryMap.get("name").toString())) {
                            queryMap.replace("name", ProductFieldMapping.PRODUCTSKU_CARRY_PRODUCT_MAP.get(queryMap.get("name").toString()));
                        }
                        for (Map.Entry entry : ProductFieldMapping.COORDINATED_SKUREFMAP.entrySet()) {
                            if (!queryMap.get("name").toString().contains((CharSequence)entry.getKey())) continue;
                            queryMap.replace("name", queryMap.get("name").toString().replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue()));
                        }
                        querySchema.addSelect(new QueryField[]{new QueryField(queryMap.get("name").toString(), queryMap.get("alias").toString().replace(".", "!"))});
                    } else if (!ProductFieldMapping.COORDINATED_REFCODES.get(refCode).isEmpty() && StringUtils.isEmpty((CharSequence)ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryMap.get("name").toString()))) {
                        querySchema.addSelect(new QueryField[]{new QueryField(queryMap.get("name").toString(), queryMap.get("alias").toString().replace(".", "!"))});
                    } else {
                        querySchema.addSelect(new QueryField[]{new QueryField(ProductFieldMapping.COORDINATED_REFCODES.get(refCode).get(queryMap.get("name").toString()), queryMap.get("alias").toString().replace(".", "!"))});
                    }
                } else {
                    querySchema.addSelect(new QueryField[]{new QueryField(queryMap.get("name").toString(), queryMap.get("alias").toString().replace(".", "!"))});
                }
                if ("id".equals(queryMap.get("name").toString()) && existQueryIdS) {
                    hasIdField = true;
                    if (existQueryIdS) {
                        existQueryIdS = false;
                    }
                }
                if (!"url".equals(queryMap.get("name").toString())) continue;
                urlMap.putAll(queryMap);
                if (!"id".equals(queryMap.get("name").toString())) continue;
                existQueryIdS = false;
            }
        }
        if (!hasIdField.booleanValue() || existQueryIdS) {
            querySchema.addSelect(new QueryField[]{new QueryField("id", "id")});
        }
    }

    private void getCoordinatedRefDataResult(String ids, boolean existQueryIdS, Pager result, Map urlMap, Boolean hasIdField) {
        ArrayList newList = new ArrayList();
        this.dealResult(result);
        if (ids != null && ids.contains(",")) {
            String[] idlist;
            List list = result.getRecordList();
            for (String id : idlist = ids.split(",")) {
                Map newMap = new HashMap();
                for (Map querymap : list) {
                    if (!querymap.containsKey("id") || !id.equals(querymap.get("id").toString())) continue;
                    newMap = querymap;
                }
                newList.add(newMap);
            }
            result.setRecordList(newList);
        }
        this.dealIdAndUrl(result.getRecordList(), existQueryIdS, urlMap, hasIdField);
    }

    private void dealIdAndUrl(List<Map<String, Object>> newList, boolean existQueryIdS, Map urlMap, Boolean hasIdField) {
        List<AttachmentInfoCollectDTO> attachmentInfoCollectDTOList;
        ArrayList<String> productIds = new ArrayList<String>();
        HashMap<String, Map<String, Object>> productsMap = new HashMap<String, Map<String, Object>>();
        String alias = null;
        for (Map<String, Object> newMap : newList) {
            if (null != newMap.get("id") && null != urlMap && null != urlMap.get("name") && "url".equals(urlMap.get("name").toString())) {
                alias = urlMap.get("alias").toString();
                productIds.add(newMap.get("id").toString());
                productsMap.put(newMap.get("id").toString(), newMap);
            }
            if (!hasIdField.booleanValue() || existQueryIdS) {
                newMap.remove("id");
            }
            if (!StringUtils.isNotEmpty(alias)) continue;
            newMap.put(alias, null);
        }
        if (!CollectionUtils.isEmpty(productIds) && !CollectionUtils.isEmpty(attachmentInfoCollectDTOList = this.getBtachProductUrl(productIds))) {
            for (AttachmentInfoCollectDTO attachmentInfoCollectDTO : attachmentInfoCollectDTOList) {
                Map product;
                String businessId = attachmentInfoCollectDTO.getBusinessId();
                List attachmentInfoDTOS = attachmentInfoCollectDTO.getAttachmentInfoDTOList();
                if (CollectionUtils.isEmpty((Collection)attachmentInfoDTOS) || null == (product = (Map)productsMap.get(businessId))) continue;
                product.put(alias, ((AttachmentInfoDTO)attachmentInfoDTOS.get(0)).getDownloadUrl());
            }
        }
    }

    public String getProductUrl(String productId) {
        AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
        attachmentQueryVO.setArchiveId(productId);
        attachmentQueryVO.setBusinessType(AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
        CoreDocJsonResult attachmentInfoDTOCoreDocJsonResult = this.attachmentService.queryAttachmentDetail(attachmentQueryVO);
        if (!CollectionUtils.isEmpty((Collection)attachmentInfoDTOCoreDocJsonResult.getData())) {
            return ((AttachmentInfoDTO)attachmentInfoDTOCoreDocJsonResult.getData().get(0)).getDownloadUrl();
        }
        return null;
    }

    public List<AttachmentInfoCollectDTO> getBtachProductUrl(List<String> productIds) {
        AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
        attachmentQueryVO.setBusinessType(AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
        attachmentQueryVO.setArchiveIdList(productIds);
        CoreDocJsonResult attachmentInfoDTOCoreDocJsonResult = this.attachmentService.queryAttachmentDetailList(attachmentQueryVO);
        if (!CollectionUtils.isEmpty((Collection)attachmentInfoDTOCoreDocJsonResult.getData())) {
            Boolean isOutForwarded = this.webUrlUtil.isOutForward();
            for (AttachmentInfoCollectDTO attachmentInfoCollectDTO : attachmentInfoDTOCoreDocJsonResult.getData()) {
                for (AttachmentInfoDTO attachmentInfoDTO : attachmentInfoCollectDTO.getAttachmentInfoDTOList()) {
                    if (!isOutForwarded.booleanValue() || !StringUtils.isNotEmpty((CharSequence)attachmentInfoDTO.getDownloadUrl())) continue;
                    String url = attachmentInfoDTO.getDownloadUrl().replace(this.ymsParamConfig.getUrlInnerHost(), this.webUrlUtil.getOutForwardUrl());
                    attachmentInfoDTO.setDownloadUrl(url);
                }
            }
            return attachmentInfoDTOCoreDocJsonResult.getData();
        }
        return null;
    }

    private void dealResult(Pager result) {
        List list = result.getRecordList().stream().map(this::mapAlias).collect(Collectors.toList());
        result.setRecordList(list);
    }

    private Map<String, Object> mapAlias(Map<String, Object> map) {
        HashMap<String, Object> newMap = new HashMap<String, Object>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            String newKey = ProductFieldMapping.REPLACE_ALIAS_MAP.entrySet().stream().filter(e -> key.contains((CharSequence)e.getValue())).map(e -> key.replace((CharSequence)e.getValue(), (CharSequence)e.getKey())).findFirst().orElse(key);
            Object value = entry.getValue();
            newMap.put(newKey, value);
        }
        return newMap;
    }

    public List<Map<String, Object>> getproductRefDetail(List<String> productIds, String masterOrgValue, List<QueryField> queryFieldList) {
        List<Map<String, Object>> productRefQuery = new ArrayList<Map<String, Object>>();
        try {
            QuerySchema productRefDetailSchema = QuerySchema.create().addSelect("id as id,productApplyRangeGroup.productDetailId.shortName as detail!shortName ,productApplyRangeGroup.productDetailId.mnemonicCode as detail!mnemonicCode,orgId as orgId,transType as transType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)}));
            if (null != queryFieldList) {
                for (QueryField queryField : queryFieldList) {
                    if (null == queryField || null == queryField.alias() || !queryField.alias().contains("_userDefine_")) continue;
                    productRefDetailSchema.addSelect(queryField.name() + " as " + queryField.alias());
                }
            }
            if (null == masterOrgValue || "".equals(masterOrgValue) || masterOrgValue.contains(",")) {
                productRefDetailSchema.addJoin(new QueryJoin[]{new QueryJoin("productApplyRangeGroup.orgGroupId.orgGroupDetailList", "orgId=productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId", "inner join")});
            } else {
                productRefDetailSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId").in(new Object[]{masterOrgValue})});
            }
            productRefQuery = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)productRefDetailSchema);
        }
        catch (Exception e) {
            log.error("\u8865\u507f\u67e5\u8be2\u7269\u6599\u53c2\u7167\u5f02\u5e38:{}" + e.getMessage(), (Throwable)e);
        }
        return productRefQuery;
    }

    public List<Map<String, Object>> getProductSKURefDetail(List<String> productSKUIds, String masterOrgValue, List<QueryField> queryFieldList) {
        List<Map<String, Object>> productSKURefQuery = new ArrayList<Map<String, Object>>();
        try {
            QuerySchema productSKURefDetailSchema = QuerySchema.create().addSelect("id as id,productSkuDetailNew.shortName as productSKUDetailNew!shortName ,productSkuDetailNew.mnemonicCode as productSKUDetailNew!mnemonicCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productSKUIds)}));
            for (QueryField queryField : queryFieldList) {
                if (null == queryField || null == queryField.alias() || !queryField.alias().contains("_userDefine_")) continue;
                productSKURefDetailSchema.addSelect(queryField.name() + " as " + queryField.alias());
            }
            if ("".equals(masterOrgValue) || masterOrgValue.contains(",")) {
                productSKURefDetailSchema.addJoin(new QueryJoin[]{new QueryJoin("productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList", "productId.orgId=productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId", "inner join")});
            } else {
                productSKURefDetailSchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId.productApplyRangeGroup.orgGroupId.orgGroupDetailList.orgId").in(new Object[]{masterOrgValue})});
            }
            productSKURefQuery = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)productSKURefDetailSchema);
        }
        catch (Exception e) {
            log.error("\u8865\u507f\u67e5\u8be2SKU\u53c2\u7167\u5f02\u5e38:{}" + e.getMessage(), (Throwable)e);
        }
        return productSKURefQuery;
    }
}

