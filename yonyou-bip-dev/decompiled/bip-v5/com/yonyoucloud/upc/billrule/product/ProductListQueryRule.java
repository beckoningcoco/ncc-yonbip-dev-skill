/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.utils.WebUrlUtil
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
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.utils.WebUrlUtil;
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
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentQueryVO;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productListQueryRule")
public class ProductListQueryRule
extends AbstractCommonRule {
    @Autowired
    AttachmentServiceImpl attachmentService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    WebUrlUtil webUrlUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] vos;
        Pager pager = (Pager)paramMap.get("return");
        boolean withSKUs = false;
        boolean withTags = true;
        boolean withLoadWays = true;
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
        if (pager.getRecordList() != null) {
            HashMap enternMap;
            Object obj;
            Object extenelData;
            this.dealUrl(pager);
            if (withTags) {
                this.addTags(pager);
            }
            if (withSKUs) {
                this.addSKUs(pager);
            }
            if (withLoadWays) {
                this.addLoadWays(pager);
            }
            if ((extenelData = billDataDto.getExternalData()) != null && extenelData instanceof HashMap && (obj = (enternMap = (HashMap)extenelData).get("listSrc")) != null && "fromAPI".equalsIgnoreCase(obj.toString())) {
                this.addProductAssistUnitExchange(pager);
                billDataDto.setExternalData((Object)"");
            }
        }
        return new RuleExecuteResult();
    }

    private void addProductAssistUnitExchange(Pager pager) throws Exception {
        List recordList = pager.getRecordList();
        if (null == recordList || recordList.size() == 0) {
            return;
        }
        List productIds = recordList.stream().filter(record -> ((Map)record).get("id") != null).map(record -> ((Map)record).get("id").toString()).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(productIds)) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)});
            QuerySchema schema = QuerySchema.create().addSelect("productId,unitExchangeType,assistUnitCount,assistUnit,assistUnit.name as assistUnit_Name,mainUnitCount,iOrder").addCondition((ConditionExpression)queryConditionGroup);
            List productAssistUnitExchange = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchange)) {
                Map<String, List<Map>> productAssistUnitExchangeMap = productAssistUnitExchange.stream().filter(assistUnitExchange -> assistUnitExchange.get("productId") != null).collect(Collectors.groupingBy(assistUnitExchange -> assistUnitExchange.get("productId").toString()));
                recordList.stream().forEach(m -> {
                    Map map = (Map)m;
                    if (map.get("id") != null && productAssistUnitExchangeMap.get(map.get("id").toString()) != null) {
                        map.put("productAssistUnitExchanges", productAssistUnitExchangeMap.get(map.get("id").toString()));
                    }
                });
            }
        }
    }

    private void addLoadWays(Pager pager) throws Exception {
        ArrayList detailIds = new ArrayList();
        List recordList = pager.getRecordList();
        if (null == recordList || recordList.size() == 0) {
            return;
        }
        recordList.stream().forEach(record -> {
            Map map = (Map)record;
            detailIds.add((Long)map.get("detail!id"));
        });
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").in(detailIds)});
        QuerySchema schema = QuerySchema.create().addSelect("*, loadWay.name as loadWay_name").addCondition((ConditionExpression)queryConditionGroup);
        List productLoadWays = MetaDaoHelper.query((String)"pc.product.ProductLoadWay", (QuerySchema)schema);
        recordList.stream().forEach(record -> {
            Map map = (Map)record;
            List loadWays = productLoadWays.stream().filter(loadWay -> loadWay.get("productDetailId").equals(map.get("detail!id"))).collect(Collectors.toList());
            if (loadWays.size() > 0) {
                StringBuffer ways = new StringBuffer();
                for (int i = 0; i < loadWays.size(); ++i) {
                    Object loadWay_name = ((Map)loadWays.get(i)).get("loadWay_name");
                    if (null == loadWay_name) continue;
                    ways.append(loadWay_name.toString());
                    if (i >= loadWays.size() - 1) continue;
                    ways.append(";");
                }
                map.put("productLoadWay", new String(ways));
            }
        });
    }

    private void addTags(Pager pager) {
        ArrayList productAndRangeIdList = new ArrayList();
        HashMap<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("ytenant", AppContext.getYTenantId());
        List records = pager.getRecordList();
        records.stream().forEach(record -> {
            if (null != record.get("productApplyRangeId")) {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("productId", record.get("id").toString());
                map.put("productApplyRangeId", record.get("productApplyRangeId").toString());
                map.put("productDetailId", record.get("detail!id").toString());
                productAndRangeIdList.add(map);
            }
        });
        if (!CollectionUtils.isEmpty(productAndRangeIdList)) {
            queryParam.put("productAndRangeIdList", productAndRangeIdList);
            List tags = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.getProductTagNew", queryParam);
            for (Map tag : tags) {
                if (tag.get("tag_business_id") == null) continue;
                AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
                attachmentQueryVO.setArchiveId(tag.get("tagId").toString());
                attachmentQueryVO.setBusinessType(AttachmentBusinessTypeEnum.TAG_IMAGE);
                CoreDocJsonResult attachmentInfoDTOCoreDocJsonResult = this.attachmentService.queryAttachmentDetail(attachmentQueryVO);
                if (CollectionUtils.isEmpty((Collection)attachmentInfoDTOCoreDocJsonResult.getData())) continue;
                tag.put("tagId_tag_image_url", ((AttachmentInfoDTO)attachmentInfoDTOCoreDocJsonResult.getData().get(0)).getDownloadUrl());
            }
            Map<String, List<Map>> tagsMap = tags.stream().collect(Collectors.groupingBy(a -> a.get("productId").toString() + a.get("productDetailId").toString()));
            records.stream().forEach(record -> {
                if (null != record.get("id") && null != record.get("detail!id")) {
                    String id = record.get("id").toString();
                    String productDetailId = record.get("detail!id").toString();
                    record.put("tags", tagsMap.get(id + productDetailId));
                }
            });
        }
    }

    private void addSKUs(Pager pager) throws Exception {
        ArrayList ids = new ArrayList();
        if (pager.getRecordList() == null || pager.getRecordList().size() == 0) {
            return;
        }
        pager.getRecordList().stream().forEach(m -> {
            Map map = (Map)m;
            ids.add((Long)map.get("id"));
        });
        QuerySchema querySchema = QuerySchema.create().addSelect("*, freeidx1.showItem as showItem1,freeidx2.showItem as showItem2, freeidx3.showItem as showItem3, freeidx4.showItem as showItem4, freeidx5.showItem as showItem5");
        QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(ids)});
        QuerySchema schema = querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isSKU").eq((Object)1)}));
        List productSKUs = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        pager.getRecordList().stream().forEach(m -> {
            Map map = (Map)m;
            List itemSKUs = productSKUs.stream().filter(tag -> ((Long)tag.get("productId")).equals((Long)map.get("id"))).collect(Collectors.toList());
            if (itemSKUs != null && itemSKUs.size() > 0) {
                map.put("productskus", itemSKUs);
            }
        });
    }

    private void dealUrl(Pager pager) throws Exception {
        List recordList = pager.getRecordList();
        if (null == recordList || recordList.size() == 0) {
            return;
        }
        ArrayList<String> archiveIdlist = new ArrayList<String>();
        for (Object o : recordList) {
            Map map = (Map)o;
            archiveIdlist.add(map.get("id").toString());
        }
        AttachmentQueryVO attachmentQueryVO = new AttachmentQueryVO();
        attachmentQueryVO.setArchiveIdList(archiveIdlist);
        attachmentQueryVO.setBusinessType(AttachmentBusinessTypeEnum.PRODUCT_HOME_PAGE_IMAGE);
        CoreDocJsonResult attachmentInfoCollectDTOCoreDocJsonResult = this.attachmentService.queryAttachmentDetailList(attachmentQueryVO);
        HashMap<String, String> homepageMap = new HashMap<String, String>();
        if (!CollectionUtils.isEmpty((Collection)attachmentInfoCollectDTOCoreDocJsonResult.getData())) {
            for (AttachmentInfoCollectDTO attachmentInfoCollectDTO : attachmentInfoCollectDTOCoreDocJsonResult.getData()) {
                if (CollectionUtils.isEmpty((Collection)attachmentInfoCollectDTO.getAttachmentInfoDTOList())) continue;
                homepageMap.put(attachmentInfoCollectDTO.getBusinessId(), ((AttachmentInfoDTO)attachmentInfoCollectDTO.getAttachmentInfoDTOList().get(0)).getDownloadUrl());
            }
        }
        Boolean isOutForwarded = this.webUrlUtil.isOutForward();
        recordList.stream().forEach(record -> {
            Map map = (Map)record;
            String url = (String)homepageMap.get(map.get("id").toString());
            if (isOutForwarded.booleanValue() && StringUtils.hasText((String)url)) {
                url = url.replace(this.ymsParamConfig.getUrlInnerHost(), this.webUrlUtil.getOutForwardUrl());
            }
            map.put("url", url);
        });
    }
}

