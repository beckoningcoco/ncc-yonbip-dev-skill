/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.sku.SkuQryDao
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.goodsAchive;

import com.yonyou.iuap.apdoc.coredoc.dao.sku.SkuQryDao;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.BatchBusinessFilesRequest;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileVO;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationSuiteFile;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.upc.pc.product.SkuOrgFieldEnum;
import com.yonyoucloud.upc.service.CoordinatedRefService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productSkuListQueryRule")
public class ProductSkuListQueryRule
extends AbstractCommonRule {
    @Autowired
    CoordinatedRefService coordinatedRefService;
    @Autowired
    SkuQryDao skuQryDao;
    @Autowired
    CooperationFileService cooperationFileService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] vos;
        Pager pager = (Pager)paramMap.get("return");
        boolean withSKUs = false;
        boolean withTags = true;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (billDataDto != null && billDataDto.getCondition() != null && (vos = billDataDto.getCondition().getCommonVOs()) != null) {
            for (FilterCommonVO vo : vos) {
                if ("withsku".equalsIgnoreCase(vo.getItemName())) {
                    withSKUs = "1".equals(vo.getValue1());
                    break;
                }
                if (!"removetags".equalsIgnoreCase(vo.getItemName())) continue;
                withTags = "0".equals(vo.getValue1());
                break;
            }
        }
        if (pager.getRecordList() != null && pager.getRecordList().size() > 0) {
            if (withTags) {
                this.AddTags(pager);
            }
            if (withSKUs) {
                this.AddProducts(pager);
            }
        }
        this.dealSkuOrgField(pager);
        this.dealProductUrl(pager);
        this.dealSkuSpecUrl(pager);
        return new RuleExecuteResult();
    }

    private void dealProductUrl(Pager pager) {
        List records = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)records)) {
            ArrayList<String> productIds = new ArrayList<String>();
            HashMap productsMap = new HashMap();
            records.stream().forEach(record -> {
                record.remove("url");
                Map map = record;
                String productId = map.get("productId").toString();
                productIds.add(productId);
                if (!productsMap.containsKey(productId)) {
                    productsMap.put(productId, new ArrayList());
                }
                List products = (List)productsMap.get(productId);
                products.add(record);
            });
            List<AttachmentInfoCollectDTO> attachmentInfoCollectDTOList = this.coordinatedRefService.getBtachProductUrl(productIds);
            if (!CollectionUtils.isEmpty(attachmentInfoCollectDTOList)) {
                for (AttachmentInfoCollectDTO attachmentInfoCollectDTO : attachmentInfoCollectDTOList) {
                    List products;
                    String businessId = attachmentInfoCollectDTO.getBusinessId();
                    List attachmentInfoDTOS = attachmentInfoCollectDTO.getAttachmentInfoDTOList();
                    if (CollectionUtils.isEmpty((Collection)attachmentInfoDTOS) || CollectionUtils.isEmpty((Collection)(products = (List)productsMap.get(businessId)))) continue;
                    for (Map product : products) {
                        if (null == product) continue;
                        product.put("productId_url", ((AttachmentInfoDTO)attachmentInfoDTOS.get(0)).getDownloadUrl());
                    }
                }
            }
        }
    }

    private void dealSkuSpecUrl(Pager pager) {
        List records = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)records)) {
            List skuFreeCharacterItemPOList;
            HashSet skuIds = new HashSet();
            records.stream().forEach(record -> {
                record.remove("url");
                Map map = record;
                String skuId = map.get("id").toString();
                skuIds.add(skuId);
            });
            if (!CollectionUtils.isEmpty(skuIds) && !CollectionUtils.isEmpty((Collection)(skuFreeCharacterItemPOList = this.skuQryDao.querySpecItemBySkuIds(skuIds)))) {
                HashSet<String> imgBusinessIds = new HashSet<String>();
                HashMap imgIdSkuIdMap = new HashMap();
                for (Map skuFreeCharacterItem : skuFreeCharacterItemPOList) {
                    String imgBusinessId = skuFreeCharacterItem.get("productFreeCharacterItemId_imgBusinessId").toString();
                    imgBusinessIds.add(imgBusinessId);
                    if (null == imgIdSkuIdMap.get(imgBusinessId)) {
                        imgIdSkuIdMap.put(imgBusinessId, new HashSet());
                    }
                    Set imgSkuIds = (Set)imgIdSkuIdMap.get(imgBusinessId);
                    imgSkuIds.add(skuFreeCharacterItem.get("skuId").toString());
                }
                HashMap skuCharacterAlbumMap = new HashMap();
                List<CooperationFileVO> cooperationFileVOS = this.queryFreeCharacterUrl(new ArrayList<String>(imgBusinessIds));
                if (!CollectionUtils.isEmpty(cooperationFileVOS)) {
                    for (CooperationFileVO cooperationFileVO : cooperationFileVOS) {
                        Set imgSkuIds;
                        String businessId = cooperationFileVO.getObjectId();
                        String urlPath = cooperationFileVO.getImageThumbPath();
                        if (!StringUtils.hasText((String)urlPath) || CollectionUtils.isEmpty((Collection)(imgSkuIds = (Set)imgIdSkuIdMap.get(businessId)))) continue;
                        for (String skuId : imgSkuIds) {
                            if (null == skuCharacterAlbumMap.get(skuId)) {
                                skuCharacterAlbumMap.put(skuId, new ArrayList());
                            }
                            List skuCharacterAlbums = (List)skuCharacterAlbumMap.get(skuId);
                            skuCharacterAlbums.add(urlPath);
                        }
                    }
                    records.stream().forEach(record -> {
                        String skuId = record.get("id").toString();
                        if (null != skuCharacterAlbumMap.get(skuId)) {
                            record.put("skuSpecPic", skuCharacterAlbumMap.get(skuId));
                        }
                    });
                }
            }
        }
    }

    private List<CooperationFileVO> queryFreeCharacterUrl(List<String> businessIdList) {
        ArrayList<BatchBusinessFilesRequest> batchBusinessFilesRequestList = new ArrayList<BatchBusinessFilesRequest>();
        BatchBusinessFilesRequest batchBusinessFilesRequest = new BatchBusinessFilesRequest();
        batchBusinessFilesRequest.setBusinessType("iuap-apdoc-material");
        batchBusinessFilesRequest.setBusinessIds(businessIdList);
        batchBusinessFilesRequest.setCancelFileExit(Boolean.valueOf(true));
        batchBusinessFilesRequestList.add(batchBusinessFilesRequest);
        CooperationSuiteFile cooperationSuiteFile = this.cooperationFileService.batchBusinessFiles(batchBusinessFilesRequestList);
        return cooperationSuiteFile.getData();
    }

    private void dealSkuOrgField(Pager pager) {
        List records = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)records)) {
            for (Map data : records) {
                if (null == data.get("isApplied") || Boolean.parseBoolean(data.get("isApplied").toString())) continue;
                SkuOrgFieldEnum.dealSkuOrgField((Map)data);
            }
        }
    }

    private void AddTags(Pager pager) {
        ArrayList skuAndRangeIdList = new ArrayList();
        HashMap<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("ytenant", AppContext.getYTenantId());
        List records = pager.getRecordList();
        records.stream().forEach(record -> {
            if (null != record.get("id") && null != record.get("productApplyRangeId")) {
                HashMap map = new HashMap();
                map.put("skuId", record.get("id"));
                map.put("productApplyRangeId", record.get("productApplyRangeId"));
                skuAndRangeIdList.add(map);
            }
        });
        if (!CollectionUtils.isEmpty(skuAndRangeIdList)) {
            queryParam.put("skuAndRangeIdList", skuAndRangeIdList);
            List tags = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getSKUTagNew", queryParam);
            records.stream().forEach(record -> {
                List itemTags = tags.stream().filter(tag -> tag.get("skuId").toString().equals(record.get("id").toString()) && tag.get("productApplyRangeId").toString().equals(record.get("productApplyRangeId").toString())).collect(Collectors.toList());
                if (!itemTags.isEmpty()) {
                    record.put("tags", itemTags);
                }
            });
        }
    }

    private void AddProducts(Pager pager) throws Exception {
        ArrayList ids = new ArrayList();
        if (pager.getRecordList() == null || pager.getRecordList().isEmpty()) {
            return;
        }
        pager.getRecordList().stream().forEach(m -> {
            Map map = (Map)m;
            if (!ids.contains((Long)map.get("productId"))) {
                ids.add((Long)map.get("productId"));
            }
        });
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids)}));
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        products.stream().forEach(m -> {
            Map map = m;
            List itemSKUs = pager.getRecordList().stream().filter(sku -> {
                Map mapSKU = (Map)sku;
                return ((Long)mapSKU.get("productId")).equals((Long)map.get("id"));
            }).collect(Collectors.toList());
            if (itemSKUs != null && itemSKUs.size() > 0) {
                map.put("productskus", itemSKUs);
            }
        });
        pager.setRecordList(products);
    }
}

