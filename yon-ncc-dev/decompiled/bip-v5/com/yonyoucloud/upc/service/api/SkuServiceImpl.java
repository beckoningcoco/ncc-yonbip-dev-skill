/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.collection.ListUtil
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.sku.SkuQueryPubServiceImpl
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.support.model.CharacterFieldDescribeDTO
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.upc.api.ISkuServiceV2
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuTagDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuTagQryDTO
 *  com.yonyoucloud.iuap.upc.dto.SpecificationDTO
 *  com.yonyoucloud.iuap.upc.dto.TagDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.ProductSKUSaveVO
 *  com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO
 *  com.yonyoucloud.iuap.upc.vo.sku.ProductSKUDetailCharacterSaveVO
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.CoredocBeanConvert
 *  com.yonyoucloud.upc.utils.DTOCheckUtil
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import cn.hutool.core.collection.ListUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.attachment.service.AttachmentServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.sku.SkuQueryPubServiceImpl;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.support.model.CharacterFieldDescribeDTO;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.upc.api.ISkuService;
import com.yonyoucloud.iuap.upc.api.ISkuServiceV2;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuTagQryDTO;
import com.yonyoucloud.iuap.upc.dto.SpecificationDTO;
import com.yonyoucloud.iuap.upc.dto.TagDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductSKUSaveVO;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUDetailCharacterSaveVO;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ElasticFieldConvertService;
import com.yonyoucloud.upc.service.MultiThreadService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.api.UPCBizServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.CoredocBeanConvert;
import com.yonyoucloud.upc.utils.DTOCheckUtil;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class SkuServiceImpl
extends SkuQueryPubServiceImpl
implements ISkuService,
ISkuServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(SkuServiceImpl.class);
    Logger logger = LoggerFactory.getLogger(SkuServiceImpl.class);
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    AttachmentServiceImpl attachmentService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    ElasticFieldConvertService elasticFieldConvertService;
    @Autowired
    UPCBizServiceImpl upcBizService;
    @Autowired
    private ExecutorService ymsExecutorService;
    @Autowired
    private MultiThreadService multiThreadService;

    @Override
    public ProductSkuDTO getSkuById(Long skuId, String[] field) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{skuId});
        UpcAPiTool.checkPara((String[])field);
        ArrayList fieldList = ListUtil.toList((Object[])field);
        fieldList.add("productApplyRangeId");
        field = fieldList.toArray(new String[fieldList.size()]);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    @Override
    @Deprecated
    public ProductSkuDTO getSkuByIdAndOrg(Long skuId, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{skuId});
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId.toString())}));
        }
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    public ProductSkuDTO getSkuByIdAndOrg(Long skuId, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{skuId});
        UpcAPiTool.checkPara((String)orgId);
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        boolean orgGlobalShareFlag = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShareFlag) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)skuId), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId)}));
        }
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    @Override
    public List<ProductSkuDTO> getSkuByIds(List<Long> skuIdList, String[] field) throws Exception {
        return this.listSkuDTOByIds(skuIdList, field);
    }

    @Override
    @Deprecated
    public List<ProductSkuDTO> getSkuByIdsAndOrg(List<Long> skuIdList, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{skuIdList});
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(skuIdList), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(skuIdList), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId.toString())}));
        }
        this.dealSchema(schema, field, false);
        return this.listProductSKUDTOs(schema);
    }

    public List<ProductSkuDTO> getSkuByIdsAndOrg(List<Long> skuIdList, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{skuIdList});
        UpcAPiTool.checkPara((String)orgId);
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(skuIdList), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(skuIdList), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId)}));
        }
        this.dealSchema(schema, field, false);
        return this.listProductSKUDTOs(schema);
    }

    public List<ProductSkuTagDTO> getSkuTags(ProductSkuTagQryDTO productSkuTagQryDTO) throws Exception {
        QueryConditionGroup queryConditionGroup;
        Boolean hasFilterItem;
        UpcAPiTool.checkTenantInfo();
        if (productSkuTagQryDTO == null && productSkuTagQryDTO.getFields() != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801296);
        }
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuTagFieldMapping, (String[])productSkuTagQryDTO.getFields());
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare.booleanValue()) {
            productSkuTagQryDTO.setOrgIdList(null);
        }
        if (!(hasFilterItem = this.setQueryConditionGroupForProductSkuTagQryDTO(productSkuTagQryDTO, queryConditionGroup = new QueryConditionGroup())).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801325);
        }
        QuerySchema skuTagSceama = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        if (productSkuTagQryDTO.getPageIndex() != null && productSkuTagQryDTO.getPageSize() != null) {
            skuTagSceama.addPager(productSkuTagQryDTO.getPageIndex().intValue(), productSkuTagQryDTO.getPageSize().intValue());
        }
        skuTagSceama.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List skuTags = MetaDaoHelper.query((String)"pc.product.SkuTagNew", (QuerySchema)skuTagSceama);
        List<Object> productSkuTagDTOs = new ArrayList<ProductSkuTagDTO>();
        if (skuTags != null) {
            productSkuTagDTOs = JSON.parseArray((String)JSON.toJSONString((Object)skuTags), ProductSkuTagDTO.class);
        }
        return productSkuTagDTOs;
    }

    private Boolean setQueryConditionGroupForProductSkuTagQryDTO(ProductSkuTagQryDTO productSkuTagQryDTO, QueryConditionGroup queryConditionGroup) {
        Boolean hasFilterItem = false;
        if (StringUtils.isNotBlank((CharSequence)productSkuTagQryDTO.getSkuId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"skuId").eq((Object)productSkuTagQryDTO.getSkuId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)productSkuTagQryDTO.getSkuIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"skuId").in((Collection)productSkuTagQryDTO.getSkuIdList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)productSkuTagQryDTO.getOrgIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRangeId.orgId").in((Collection)productSkuTagQryDTO.getOrgIdList()));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRangeId.isCreator").eq((Object)true));
        }
        return hasFilterItem;
    }

    @Override
    public ProductSkuDTO getSkuByCode(String skuCode, String[] field) throws Exception {
        UpcAPiTool.checkPara((String)skuCode);
        UpcAPiTool.checkPara((String[])field);
        ArrayList fieldList = ListUtil.toList((Object[])field);
        fieldList.add("productApplyRangeId");
        field = fieldList.toArray(new String[fieldList.size()]);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)skuCode), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    @Override
    public List<ProductSkuDTO> getSkuByCodeList(List<String> skuCodeList, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{skuCodeList});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(skuCodeList), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOList(schema);
    }

    @Override
    @Deprecated
    public ProductSkuDTO getSkuByCodeAndOrg(String skuCode, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((String)skuCode);
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)skuCode), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)skuCode), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId.toString())}));
        }
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    @Deprecated
    public ProductSkuDTO getSkuByCodeAndOrg(String skuCode, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((String)skuCode);
        UpcAPiTool.checkPara((String)orgId);
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)skuCode), QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true)}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)skuCode), QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId)}));
        }
        this.dealSchema(schema, field, false);
        return this.getProductSKUDTOs(schema);
    }

    @Override
    public List<ProductSkuDTO> listSkuByProductId(Long productId, String[] field) throws Exception {
        return this.listSkuByProductIds(Arrays.asList(productId), field);
    }

    @Override
    public List<ProductSkuDTO> listSkuByProductIds(List<Long> productIds, String[] field) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIds));
        boolean hasBusiAttrbute = this.dealSchema(schema, field, false);
        if (hasBusiAttrbute) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true));
        }
        schema.addCondition((ConditionExpression)queryConditionGroup);
        return this.listProductSKUDTOs(schema);
    }

    @Override
    public Pager listSkuInfoByPage(ProductSkuQryDTO qryDTO) throws Exception {
        return this.listSkuDTOInfoByPage(qryDTO);
    }

    public UPCPager listSkuInfoByPageV2(ProductSkuQryDTO qryDTO) throws Exception {
        Pager pager = this.listSkuInfoByPage(qryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public List<ProductSkuDTO> listSkuInfo(ProductQryDTO qryDTO, String[] field) throws Exception {
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])field);
        boolean hasFilterItem = false;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (qryDTO.getProductIdList() != null && qryDTO.getProductIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in((Collection)qryDTO.getProductIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductCodeList() != null && qryDTO.getProductCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getProductIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getOrgList() != null && qryDTO.getOrgList().size() > 0) {
            ArrayList<String> orgIdList = new ArrayList<String>(qryDTO.getOrgList().size());
            for (Long orgId : qryDTO.getOrgList()) {
                if (orgId == null) continue;
                orgIdList.add(orgId.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.orgId").in(orgIdList));
            hasFilterItem = true;
        }
        if (qryDTO.getSkuMd5KeyList() != null && qryDTO.getSkuMd5KeyList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"freeValueIdsMd5").in((Collection)qryDTO.getSkuMd5KeyList()));
            hasFilterItem = true;
        }
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.shopId").eq((Object)qryDTO.getShopId()));
            hasFilterItem = true;
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDeleted").in(new Object[]{qryDTO.getDeleteFlag()}));
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        return this.listProductSKUDTOs(schema);
    }

    @Override
    public List<ProductSkuDTO> listSkuInfoNew(ProductSkuQryDTO qryDTO) throws Exception {
        QueryConditionGroup characterConditionGroup;
        Map<String, String> characterCodeToTypeMap;
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        Boolean isAddJoin = false;
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        boolean isEmptyCondition = this.isEmptyCondition(qryDTO, orgGlobalShare);
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)ProductAPIUtils.skuMainFieldMapping);
        if (null != qryDTO.getStopStatus() || null != qryDTO.getMnemonicCode()) {
            isAddJoin = true;
        }
        if (qryDTO.getSkuMd5KeyList() != null && qryDTO.getSkuMd5KeyList().size() > 0) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"freeValueIdsMd5").in((Collection)qryDTO.getSkuMd5KeyList()));
        }
        if (qryDTO.getSkuFreeCharacterFuzzy() != null && !qryDTO.getSkuFreeCharacterFuzzy().isEmpty()) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            characterCodeToTypeMap = this.buildCharacterCodeToTypeMap("pc_productsku", "skuFreeCharacter");
            characterConditionGroup = UpcAPiTool.buildCharacterQueryCondition((Map)qryDTO.getSkuFreeCharacterFuzzy(), characterCodeToTypeMap, (String)"skuFreeCharacter");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
        }
        if (qryDTO.getProductSkuCharacterDefFuzzy() != null && !qryDTO.getProductSkuCharacterDefFuzzy().isEmpty()) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            characterCodeToTypeMap = this.buildCharacterCodeToTypeMap("pc_productsku", "productSkuCharacterDef");
            characterConditionGroup = UpcAPiTool.buildCharacterQueryCondition((Map)qryDTO.getProductSkuCharacterDefFuzzy(), characterCodeToTypeMap, (String)"productSkuCharacterDef");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
        }
        if (qryDTO.getNameOrCodeOrBarCodeFuzzy() != null) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzy()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzy()), QueryCondition.name((String)"productId.productApplyRange.productDetailId.productSkuDetailNew.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzy())});
            isAddJoin = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (qryDTO.getBarCodeList() != null) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            isAddJoin = true;
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.productDetailId.productSkuDetailNew.barCode").in((Collection)qryDTO.getBarCodeList()));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductapplyIdList())) {
            if (queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.id").in((Collection)qryDTO.getProductapplyIdList()));
        }
        if (qryDTO.getSkuTagQry() != null && !CollectionUtils.isEmpty((Collection)qryDTO.getSkuTagQry().getIdList())) {
            isAddJoin = true;
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.productApplyRange.productDetailId.skuTagNew.tagId").in((Collection)qryDTO.getSkuTagQry().getIdList()));
        }
        if (queryConditionGroup == null && isEmptyCondition) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        QueryField[] qryFields = UpcAPiTool.qrySkuFields((HashMap)ProductAPIUtils.skuMainFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        this.dealSchema(schema, qryDTO.getFields(), isAddJoin);
        return this.listProductSKUDTOs(schema);
    }

    @Override
    public ResultList saveProductSKU(List<ProductSKUSaveVO> productSKUSaveVOs) throws Exception {
        ResultList resultList = new ResultList();
        if (!CollectionUtils.isEmpty(productSKUSaveVOs)) {
            ArrayList productSKUs = new ArrayList();
            productSKUSaveVOs.forEach(productSKUSaveVO -> {
                Map productSKUMap = (Map)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productSKUSaveVO), new HashMap().getClass());
                if (productSKUMap != null && !productSKUMap.isEmpty()) {
                    productSKUs.add(productSKUMap);
                }
            });
            if (!CollectionUtils.isEmpty(productSKUs)) {
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_productsku_edit");
                billDataDto.setAction("save");
                billDataDto.setData(productSKUs);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(2));
                resultList = BillBiz.batchSave4Api((BillDataDto)billDataDto);
            }
        }
        return resultList;
    }

    public UPCResultList saveProductSKUs(List<ProductSKUSaveVO> productSKUSaveVOs) throws Exception {
        ResultList resultList = this.saveProductSKU(productSKUSaveVOs);
        return UPCResultConverter.resultConvert((ResultList)resultList);
    }

    public List<ProductSkuDTO> matchSkuBySpecs(String productCode, String specs, int skuType, String[] field) {
        return null;
    }

    @Nullable
    private ProductSkuDTO getProductSKUDTOs(QuerySchema schema) throws Exception {
        Map productSkuMap = MetaDaoHelper.queryOne((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSkuMap != null) {
            ProductSkuDTO productSkuDTO = (ProductSkuDTO)JSON.parseObject((String)JSON.toJSONString((Object)productSkuMap), ProductSkuDTO.class);
            if (null != productSkuDTO.getSkuFreeCharacter()) {
                productSkuDTO.getSkuFreeCharacter().remove("ytenant");
            }
            if (null != productSkuDTO.getSkuPropCharacter()) {
                productSkuDTO.getSkuPropCharacter().remove("ytenant");
            }
            if (null != productSkuDTO.getProductSkuCharacterDef()) {
                productSkuDTO.getProductSkuCharacterDef().remove("ytenant");
            }
            if (productSkuDTO.getId() != null && productSkuDTO.getProductApplyRangeId() != null) {
                QueryConditionGroup conditionGroupTag = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq((Object)productSkuDTO.getId()), QueryCondition.name((String)"productApplyRangeId").eq((Object)productSkuDTO.getProductApplyRangeId())});
                List queryTagRes = this.querySkuTagNew(conditionGroupTag);
                ArrayList<TagDTO> tagDTOS = new ArrayList<TagDTO>();
                HashSet<Long> tagIDSet = new HashSet<Long>();
                for (Map mapTag : queryTagRes) {
                    TagDTO tagDTO = this.convertTagMap(mapTag);
                    if (tagIDSet.contains(tagDTO.getId())) continue;
                    tagDTOS.add(tagDTO);
                    tagIDSet.add(tagDTO.getId());
                }
                productSkuDTO.setTagList(tagDTOS);
            }
            return productSkuDTO;
        }
        return null;
    }

    @Nullable
    private List<ProductSkuDTO> getProductSKUDTOList(QuerySchema schema) throws Exception {
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSkuMap = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSkuMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productSkuMap), ProductSkuDTO.class);
        }
        return null;
    }

    @Override
    public List<SpecificationDTO> getSpecListBySkuId(Long skuId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{skuId});
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)skuId));
        QueryField[] qryFields = new QueryField[]{new QueryField("specIds", "specIds")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSkuMapList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSkuMapList != null) {
            for (Map productSkuMap : productSkuMapList) {
                if (Objects.isNull(productSkuMap.get("specIds"))) continue;
                List<String> userDefineIdList = Arrays.asList(productSkuMap.get("specIds").toString().split(";"));
                UpcAPiTool.checkPara((List[])new List[]{userDefineIdList});
                QueryConditionGroup queryConditionGp = new QueryConditionGroup();
                queryConditionGp.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(userDefineIdList));
                QuerySchema schemaSpec = QuerySchema.create().fullname("pc.userdef.UserDefineSpec").addSelect("userdefid as iSpecId,id as lsSpecItems_id,code as specCode,name as specName,barCode as cBarCode").addCondition((ConditionExpression)queryConditionGp);
                List specificationMap = MetaDaoHelper.query((String)"pc.userdef.UserDefineSpec", (QuerySchema)schemaSpec);
                if (specificationMap == null) continue;
                return JSON.parseArray((String)JSON.toJSONString((Object)specificationMap), SpecificationDTO.class);
            }
        }
        return null;
    }

    public CoreDocJsonResult delSkuById(Long skuId) throws Exception {
        if (Objects.isNull(skuId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801327);
        }
        Map<String, Object> skuParam = this.querySkuParamsBySkuIds(skuId);
        return this.upcBizService.excuteUpdateOne(skuParam, "skudelete", "pc_goodsproductskuprolist");
    }

    public CoreDocJsonResult saveSkuTag(Long skuId, String orgId, List<Long> tagIds) throws Exception {
        this.checkTagDatas(skuId, orgId, tagIds);
        ArrayList tagIdStrs = new ArrayList();
        tagIds.forEach(tagId -> tagIdStrs.add(tagId.toString()));
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("tags", tagIdStrs);
        return this.excuteBatchAction(skuId, orgId, "batchtag", params);
    }

    public CoreDocJsonResult delSkuTag(Long skuId, String orgId, List<Long> tagIds) throws Exception {
        this.checkTagDatas(skuId, orgId, tagIds);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("tags", tagIds);
        return this.excuteBatchAction(skuId, orgId, "batchcleartag", params);
    }

    public CoreDocJsonResult unShelfUmallSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "umall");
        return this.excuteBatchAction(skuId, orgId, "skuunshelve", params);
    }

    public CoreDocJsonResult shelfUmallSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "umall");
        return this.excuteBatchAction(skuId, orgId, "skushelve", params);
    }

    public CoreDocJsonResult unShelfUorderSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "uorder");
        return this.excuteBatchAction(skuId, orgId, "skuunshelve", params);
    }

    public CoreDocJsonResult shelfUorderSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        HashMap<String, Object> params = new HashMap<String, Object>(2);
        params.put("biz", "uorder");
        return this.excuteBatchAction(skuId, orgId, "skushelve", params);
    }

    public CoreDocJsonResult disableSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        return this.excuteBatchAction(skuId, orgId, "stop", null);
    }

    public CoreDocJsonResult enableSku(Long skuId, String orgId) throws Exception {
        this.checkShelfData(skuId, orgId);
        return this.excuteBatchAction(skuId, orgId, "unstop", null);
    }

    private CoreDocJsonResult excuteBatchAction(Long skuId, String orgId, String action, Map<String, Object> params) throws Exception {
        Map<String, Object> skuMap = this.querySkuBySkuIdAndOrgId(skuId, orgId);
        if (params != null && !params.isEmpty()) {
            skuMap.putAll(params);
        }
        return this.upcBizService.excuteUpdateOne(skuMap, action, "pc_goodsproductskuprolist");
    }

    public void checkShelfData(Long skuId, String orgId) {
        if (Objects.isNull(skuId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800774);
        }
        if (Objects.isNull(orgId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801328);
        }
    }

    public void checkTagDatas(Long skuId, String orgId, List<Long> tagIds) throws Exception {
        this.checkShelfData(skuId, orgId);
        this.checkTagDataValidity(tagIds);
    }

    private void checkTagDataValidity(List<Long> tagIds) throws Exception {
        if (ObjectUtils.isEmpty(tagIds)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801329);
        }
        QuerySchema queryTagSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(tagIds)}));
        List tagInDb = MetaDaoHelper.query((String)"pc.tag.Tag", (QuerySchema)queryTagSchema);
        HashSet tagIdsInDb = new HashSet();
        tagInDb.forEach(tagId -> {
            if (null == tagId) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801330, new Object[]{tagId});
            }
            tagIdsInDb.add(tagId.get("id").toString());
        });
        tagIds.forEach(tagId -> {
            if (!tagIdsInDb.contains(tagId.toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801330, new Object[]{tagId});
            }
        });
    }

    private Map<String, Object> querySkuBySkuIdAndOrgId(Long skuId, String orgId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.productApplyRange.orgId").eq((Object)orgId), QueryCondition.name((String)"id").eq((Object)skuId)});
        String selectFields = "id as id, code as code, productId as productId, productId.productApplyRange.orgId as orgId, productId.productApplyRange.id as productApplyRangeId, productId.productApplyRange.isCreator as isCreator";
        QuerySchema schema = QuerySchema.create().addSelect(selectFields).addCondition((ConditionExpression)queryConditionGroup);
        List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)skus)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801150, new Object[]{skuId.toString(), orgId});
        }
        return (Map)skus.get(0);
    }

    private Map<String, Object> querySkuParamsBySkuIds(Long skuId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.productApplyRange.isCreator").eq((Object)true), QueryCondition.name((String)"id").eq((Object)skuId)});
        StringBuilder selectFields = new StringBuilder();
        selectFields.append("id as id").append(", ");
        selectFields.append("code as code").append(", ");
        selectFields.append("productId as productId").append(", ");
        selectFields.append("productId.productApplyRange.id as productApplyRangeId").append(", ");
        selectFields.append("productId.productApplyRange.isCreator as isCreator");
        QuerySchema schema = QuerySchema.create().addSelect(selectFields.toString()).addCondition((ConditionExpression)queryConditionGroup);
        List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)skus)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801331, new Object[]{skuId});
        }
        return (Map)skus.get(0);
    }

    @Override
    public ProductSKUCharacterSaveVO saveProductSKUCharacter(ProductSKUCharacterSaveVO productSKUCharacterSaveVO) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)productSKUCharacterSaveVO)) {
            BizObject productSKUMap = this.handleProductSkuData(productSKUCharacterSaveVO);
            return this.saveSkuData(productSKUMap);
        }
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
    }

    public CoreDocJsonResultForOpenApi<ProductSKUCharacterSaveVO> addProductSKUCharacter(ProductSKUCharacterSaveVO productSKUCharacterSaveVO) {
        try {
            DTOCheckUtil.checkParams((ProductSKUCharacterSaveVO)productSKUCharacterSaveVO);
            ProductSKUCharacterSaveVO resultSkuData = this.saveProductSKUCharacter(productSKUCharacterSaveVO);
            return CoreDocJsonResultForOpenApi.success((Object)resultSkuData);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17A2451E0420004D", (String)"\u65b0\u67b6\u6784\u4e0b\u4fdd\u5b58sku\u5f02\u5e38:") + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    @Override
    public List<String> saveProductSKUCharacter(List<ProductSKUCharacterSaveVO> productSKUCharacterSaveVOList) {
        int count;
        if (productSKUCharacterSaveVOList.size() > UPCConstants.MAX_COUNT) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801332, new Object[]{UPCConstants.MAX_COUNT, productSKUCharacterSaveVOList.size()});
        }
        ArrayList<String> listret = new ArrayList<String>();
        ArrayList<Future> futures = new ArrayList<Future>();
        CountDownLatch downLatch = new CountDownLatch(productSKUCharacterSaveVOList.size());
        for (count = 0; count < productSKUCharacterSaveVOList.size(); ++count) {
            ProductSKUCharacterSaveVO productSKUCharacterSaveVO = productSKUCharacterSaveVOList.get(count);
            Future stringFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                try {
                    ProductSKUCharacterSaveVO result = this.saveProductSKUCharacter(productSKUCharacterSaveVO);
                    String string = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1991FB8C04500012", (String)"SKU\u65b0\u589e/\u66f4\u65b0\u6210\u529f\uff0cID\uff1a") + result.getId();
                    return string;
                }
                catch (BusinessException e) {
                    String string = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1991FB8C04500013", (String)"SKU\u65b0\u589e/\u66f4\u65b0\u5931\u8d25\uff0c\u5f02\u5e38\uff1a") + e.getMessage();
                    return string;
                }
                catch (Exception e) {
                    this.logger.error("\u5faa\u73af\u5f00\u542f\u591a\u7ebf\u7a0b\u65b0\u589eSKU\u62a5\u9519\uff0c\u65b9\u6cd5\u8def\u5f84\u3010com.yonyoucloud.upc.service.api.SkuServiceImpl.saveProductSKUCharacter(java.util.List<com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO>)\u3011\uff0c\u5f02\u5e38\uff1a" + e);
                    String string = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1991FB8C04500013", (String)"SKU\u65b0\u589e/\u66f4\u65b0\u5931\u8d25\uff0c\u5f02\u5e38\uff1a") + e.getMessage();
                    return string;
                }
                finally {
                    downLatch.countDown();
                }
            }, (ExecutorService)this.ymsExecutorService);
            futures.add(stringFuture);
        }
        try {
            downLatch.await();
            for (count = 0; count < futures.size(); ++count) {
                Future stringFuture = (Future)futures.get(count);
                String futureRes = (String)stringFuture.get();
                listret.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1991FB8C04500014", (String)"\u7b2c\u3010%s\u3011\u6761"), count + 1) + futureRes);
            }
        }
        catch (InterruptedException e) {
            this.logger.error("\u83b7\u53d6\u6267\u884c\u7ed3\u679c\u88ab\u4e2d\u65ad\u3010com.yonyoucloud.upc.service.api.SkuServiceImpl.saveProductSKUCharacter(java.util.List<com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO>)\u3011\uff0c\u5f02\u5e38\uff1a" + e);
        }
        catch (Exception e) {
            this.logger.error("\u7b49\u5f85\u8d85\u65f6", (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801333);
        }
        return listret;
    }

    public CoreDocJsonResult<UPCResultList> batchSaveProductSKUCharacter(List<ProductSKUCharacterSaveVO> productSKUCharacterSaveVOList) {
        try {
            if (CollectionUtils.isEmpty(productSKUCharacterSaveVOList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801155);
            }
            if (productSKUCharacterSaveVOList.size() > UPCConstants.MAX_COUNT) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801332, new Object[]{UPCConstants.MAX_COUNT, productSKUCharacterSaveVOList.size()});
            }
            ArrayList<BillDataDto> productSkuList = new ArrayList<BillDataDto>();
            StringBuilder stringBuilder = new StringBuilder();
            for (ProductSKUCharacterSaveVO productSkuSaveVO : productSKUCharacterSaveVOList) {
                if (productSkuSaveVO == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
                }
                String productCode = productSkuSaveVO.getProductCode();
                try {
                    BizObject productSkuData = this.handleProductSkuData(productSkuSaveVO);
                    BillDataDto billDataDto = CoredocBeanConvert.cast2BillDTO((String)"pc_productsku_edit", (String)"save", (BizObject)productSkuData);
                    productSkuList.add(billDataDto);
                }
                catch (BusinessException businessException) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(CoreDocBusinessErrorEnum.MATERIAL_SKU_BATCH_SAVE_ERROR.getMultilingualMessage(new Object[]{productCode, businessException.getMessage()}));
                }
            }
            if (stringBuilder.length() > 0) {
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(stringBuilder.toString()));
            }
            UPCResultList upcResultList = this.multiThreadService.multiThreadSave(productSkuList);
            UpcAPiTool.dealBatchSaveResult((UPCResultList)upcResultList);
            return CoreDocJsonResult.success((Object)upcResultList);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("SKU\u6863\u6848\u6279\u91cf\u4fdd\u5b58\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public BizObject handleProductSkuData(ProductSKUCharacterSaveVO productSKUCharacterSaveVO) throws Exception {
        if (productSKUCharacterSaveVO.getId() != null) {
            productSKUCharacterSaveVO.setId(null);
        }
        if (productSKUCharacterSaveVO.getSkuFreeCharacter() == null || productSKUCharacterSaveVO.getSkuFreeCharacter().isEmpty()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_SAVE_FREECHARACTER_NULL);
        }
        if (productSKUCharacterSaveVO.getOrgCodeForUpdate() != null) {
            HashSet<String> nonUpdateFields = new HashSet<String>(){
                {
                    this.add("name");
                    this.add("code");
                    this.add("modelDescription");
                    this.add("model");
                    this.add("weight");
                    this.add("volume");
                    this.add("batchUnitCode");
                    this.add("batchRate");
                    this.add("skuPropCharacter");
                    this.add("productSkuCharacterDef");
                    this.add("erpCode");
                }
            };
            this.checkNonUpdateFieldsForSkuOrg(productSKUCharacterSaveVO, (Set<String>)nonUpdateFields);
        }
        BizObject productSKUMap = this.convertFieldName(productSKUCharacterSaveVO);
        productSKUMap.setEntityStatus(EntityStatus.Insert);
        return productSKUMap;
    }

    @Override
    public ProductSKUCharacterSaveVO updateProductSKUCharacter(ProductSKUCharacterSaveVO productSKUCharacterSaveVO) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)productSKUCharacterSaveVO)) {
            if (null == productSKUCharacterSaveVO.getId()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801334);
            }
            if (productSKUCharacterSaveVO.getOrgCodeForUpdate() != null) {
                HashSet<String> notALlowUpdateField = new HashSet<String>(){
                    {
                        this.add("productCode");
                        this.add("name");
                        this.add("code");
                        this.add("modelDescription");
                        this.add("model");
                        this.add("weight");
                        this.add("volume");
                        this.add("batchUnitCode");
                        this.add("batchRate");
                        this.add("skuFreeCharacter");
                        this.add("skuPropCharacter");
                        this.add("productSkuCharacterDef");
                        this.add("erpCode");
                    }
                };
                this.checkNonUpdateFieldsForSkuOrg(productSKUCharacterSaveVO, (Set<String>)notALlowUpdateField);
            }
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productSKUCharacterSaveVO.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id, skuFreeCharacter, productId").addCondition((ConditionExpression)queryConditionGroup);
            List skus = this.productSkuService.query("pc.product.ProductSKU", schema);
            if (CollectionUtils.isEmpty((Collection)skus)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_UPDATE_ID_NOT_EXISTS);
            }
            ProductSKU skuInDb = (ProductSKU)skus.get(0);
            productSKUCharacterSaveVO.setSkuFreeCharacter((Map)skuInDb.get("skuFreeCharacter"));
            BizObject productSKUMap = this.convertFieldName(productSKUCharacterSaveVO);
            productSKUMap.put("productId", skuInDb.get("productId"));
            productSKUMap.put("skuFreeCharacter", skuInDb.get("skuFreeCharacter"));
            return this.saveSkuData(productSKUMap);
        }
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
    }

    private void checkNonUpdateFieldsForSkuOrg(ProductSKUCharacterSaveVO productSKUCharacterSaveVO, Set<String> nonUpdateFields) throws Exception {
        Field[] fields;
        Class<?> clazz = productSKUCharacterSaveVO.getClass();
        for (Field field : fields = clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            if ("id".equals(fieldName) || "orgCodeForUpdate".equals(fieldName) || "productSkuDetailNew".equals(fieldName) || !nonUpdateFields.contains(fieldName) || field.get(productSKUCharacterSaveVO) == null) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801335, new Object[]{fieldName});
        }
    }

    private BizObject convertFieldName(ProductSKUCharacterSaveVO productSKUCharacterSaveVO) {
        ProductSKUDetailCharacterSaveVO productSkuDetailNew = productSKUCharacterSaveVO.getProductSkuDetailNew();
        BizObject productSKUMap = (BizObject)JSONObject.parseObject((String)JSONObject.toJSONString((Object)productSKUCharacterSaveVO), new BizObject().getClass());
        if (productSKUCharacterSaveVO.getProductCode() != null) {
            productSKUMap.put("productId_code", (Object)productSKUCharacterSaveVO.getProductCode());
        }
        if (productSKUCharacterSaveVO.getBatchUnitCode() != null) {
            productSKUMap.put("batchUnit_Name", (Object)productSKUCharacterSaveVO.getBatchUnitCode());
        }
        if (ObjectUtils.isNotEmpty((Object)productSkuDetailNew)) {
            Map productSkuDetailNewMap = (Map)productSKUMap.get("productSkuDetailNew");
            if (productSkuDetailNew.getStockUnitCode() != null) {
                productSkuDetailNewMap.put("stockUnit_Code", productSkuDetailNew.getStockUnitCode());
            }
            if (productSkuDetailNew.getBatchPriceUnitCode() != null) {
                productSkuDetailNewMap.put("batchPriceUnit_Code", productSkuDetailNew.getBatchPriceUnitCode());
            }
        }
        return productSKUMap;
    }

    private ProductSKUCharacterSaveVO saveSkuData(BizObject productSKUMap) throws Exception {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("pc_productsku_edit");
        billDataDto.setAction("save");
        billDataDto.setData((Object)productSKUMap);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(2));
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = BillBiz.batchSave4Api((BillDataDto)billDataDto);
        if (!CollectionUtils.isEmpty((Collection)resultList.getInfos())) {
            BizObject bizObject = (BizObject)resultList.getInfos().get(0);
            ProductSKUCharacterSaveVO resultData = new ProductSKUCharacterSaveVO();
            resultData.setId((Long)bizObject.getId());
            return resultData;
        }
        String msg = (String)resultList.getMessages().get(0);
        throw new CoreDocBusinessException(Long.valueOf(999L), msg);
    }

    public Map<String, String> buildCharacterCodeToTypeMap(String billNum, String characterField) throws Exception {
        CharacterFieldDescribeDTO characterFieldDescribeDTO = this.elasticFieldConvertService.elasticFieldConvert(billNum, characterField);
        List characterList = characterFieldDescribeDTO.getChildren();
        HashMap<String, String> characterCodeToTypeMap = new HashMap<String, String>();
        for (int i = 0; i < characterList.size(); ++i) {
            characterCodeToTypeMap.put(((CharacterFieldDescribeDTO)characterList.get(i)).getName(), ((CharacterFieldDescribeDTO)characterList.get(i)).getParamType());
        }
        return characterCodeToTypeMap;
    }
}

