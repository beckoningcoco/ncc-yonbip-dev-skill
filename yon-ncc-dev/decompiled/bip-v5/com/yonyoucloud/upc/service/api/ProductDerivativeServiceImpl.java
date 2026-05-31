/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.IProductDerivativeServiceV2
 *  com.yonyoucloud.iuap.upc.dto.BrandDTO
 *  com.yonyoucloud.iuap.upc.dto.BrandQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductCheckFreeMergeDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductIdQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductParameterQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductParametersDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSpecItemDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSpecItemQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTagDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplAssistUnitExchangeDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplCyclePropertyDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplExtendPropDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplParameterDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplSpecSumDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplUnitDTO
 *  com.yonyoucloud.iuap.upc.dto.TagDTO
 *  com.yonyoucloud.iuap.upc.dto.TagQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.IProductDerivativeService;
import com.yonyoucloud.iuap.upc.api.IProductDerivativeServiceV2;
import com.yonyoucloud.iuap.upc.dto.BrandDTO;
import com.yonyoucloud.iuap.upc.dto.BrandQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCheckFreeMergeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductIdQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductParameterQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductParametersDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplAssistUnitExchangeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCyclePropertyDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplExtendPropDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplParameterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplSpecSumDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplUnitDTO;
import com.yonyoucloud.iuap.upc.dto.TagDTO;
import com.yonyoucloud.iuap.upc.dto.TagQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO;
import com.yonyoucloud.upc.service.api.ProductCharactorServiceImpl;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductDerivativeServiceImpl
implements IProductDerivativeService,
IProductDerivativeServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(ProductDerivativeServiceImpl.class);
    @Autowired
    private ProductCharactorServiceImpl productCharactorService;

    @Override
    public Pager tagByPage(TagQryDTO qryDTO) throws Exception {
        QuerySchema schema;
        Pager pager;
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        UpcAPiTool.checkPara((String[])qryDTO.getFields());
        if (qryDTO.getPageIndex() == null) {
            qryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (qryDTO.getPageSize() == null || qryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            qryDTO.setPageSize(UpcAPiTool.DEFAULT_PAGE_SIZE);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.tagFieldMap, (String[])qryDTO.getFields());
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getIdList()));
        } else if (qryDTO.getId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)qryDTO.getId()));
        }
        if (qryDTO.getName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)qryDTO.getName()));
        }
        if (qryDTO.getTagClassCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"tagClass.code").eq((Object)qryDTO.getTagClassCode()));
        }
        if (qryDTO.getScope() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"scope").eq((Object)qryDTO.getScope()));
        }
        if ((pager = MetaDaoHelper.queryByPage((String)"pc.tag.Tag", (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(qryDTO.getPageIndex().intValue(), qryDTO.getPageSize().intValue())))) != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), TagDTO.class));
        }
        return pager;
    }

    @Override
    public Pager brandByPage(BrandQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        UpcAPiTool.checkPara((String[])qryDTO.getFields());
        if (qryDTO.getPageIndex() == null) {
            qryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (qryDTO.getPageSize() == null || qryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            qryDTO.setPageSize(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.brandFieldMap, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(qryDTO.getPageIndex().intValue(), qryDTO.getPageSize().intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.brand.Brand", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), BrandDTO.class));
        }
        return pager;
    }

    public UPCPager tagByPageV2(TagQryDTO qryDTO) throws Exception {
        Pager pager = this.tagByPage(qryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager brandByPageV2(BrandQryDTO qryDTO) throws Exception {
        Pager pager = this.brandByPage(qryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public HashSet<Long> getProductIdByQryDTO(ProductIdQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (qryDTO.getProductClassId() == null && CollectionUtils.isEmpty((Collection)qryDTO.getProductClassIdList()) && qryDTO.getProductTemplateId() == null && CollectionUtils.isEmpty((Collection)qryDTO.getProductTemplateIdList()) && qryDTO.getBrandId() == null && CollectionUtils.isEmpty((Collection)qryDTO.getBrandIdList()) && qryDTO.getTagId() == null && CollectionUtils.isEmpty((Collection)qryDTO.getTagIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801123);
        }
        boolean qryFlag = false;
        HashSet<Long> productId = new HashSet<Long>();
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (qryDTO.getProductClassId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass").eq((Object)qryDTO.getProductClassId()));
            qryFlag = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductClassIdList())) {
            if (qryDTO.getProductClassIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801124);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass").in((Collection)qryDTO.getProductClassIdList()));
            qryFlag = true;
        }
        if (qryDTO.getProductTemplateId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate").eq((Object)qryDTO.getProductTemplateId()));
            qryFlag = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductTemplateIdList())) {
            if (qryDTO.getProductTemplateIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801125);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate").in((Collection)qryDTO.getProductTemplateIdList()));
            qryFlag = true;
        }
        if (qryDTO.getBrandId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brand").eq((Object)qryDTO.getBrandId()));
            qryFlag = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getBrandIdList())) {
            if (qryDTO.getBrandIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801126);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brand").in((Collection)qryDTO.getBrandIdList()));
            qryFlag = true;
        }
        if (qryFlag) {
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
            List queryByProduct = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)queryByProduct)) {
                for (Map map : queryByProduct) {
                    productId.add((Long)map.get("id"));
                }
            }
        }
        if (qryDTO.getTagId() != null || !CollectionUtils.isEmpty((Collection)qryDTO.getTagIdList())) {
            QueryConditionGroup queryConditionGroupTag = new QueryConditionGroup();
            if (qryDTO.getTagId() != null) {
                queryConditionGroupTag.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)qryDTO.getTagId()));
            }
            if (!CollectionUtils.isEmpty((Collection)qryDTO.getTagIdList())) {
                if (qryDTO.getTagIdList().size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801127);
                }
                queryConditionGroupTag.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getTagIdList()));
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
            List queryByProductTag = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)queryByProductTag)) {
                for (Map map : queryByProductTag) {
                    productId.add((Long)map.get("id"));
                }
            }
        }
        return productId;
    }

    @Override
    public HashSet<Long> getProductTplParameterId(Long templateId, Boolean filter) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (templateId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801128);
        }
        HashSet<Long> productTplParameter = new HashSet<Long>();
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").eq((Object)templateId));
        if (filter != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isFilter").eq((Object)filter));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTag = MetaDaoHelper.query((String)"pc.tpl.ProductTplParameter", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTag)) {
            for (Map map : queryByProductTag) {
                productTplParameter.add((Long)map.get("id"));
            }
        }
        return productTplParameter;
    }

    @Override
    public List<ProductTplParameterDTO> getProductTplParameterByTemplateId(List<Long> templateIdList, Boolean filter) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801128);
        }
        if (templateIdList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801129);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(templateIdList));
        if (filter != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isFilter").eq((Object)filter));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id, parent, template, group, name, isFilter as filter").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductParameters = MetaDaoHelper.query((String)"pc.tpl.ProductTplParameter", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductParameters)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductParameters), ProductTplParameterDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductParametersDTO> getProductParameters(ProductParameterQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (CollectionUtils.isEmpty((Collection)qryDTO.getProductIdList()) && CollectionUtils.isEmpty((Collection)qryDTO.getParamIdList()) && CollectionUtils.isEmpty((Collection)qryDTO.getProductDetailIdList()) && CollectionUtils.isEmpty((Collection)qryDTO.getParamValueList()) && CollectionUtils.isEmpty((Collection)qryDTO.getProductApplyRangeIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801123);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getParamIdList())) {
            if (qryDTO.getParamIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801131);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"param").in((Collection)qryDTO.getParamIdList()));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getParamValueList())) {
            if (qryDTO.getParamValueList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801132);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"paramValue").in((Collection)qryDTO.getParamValueList()));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductIdList())) {
            if (qryDTO.getProductIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801132);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in((Collection)qryDTO.getProductIdList()));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductApplyRangeIdList())) {
            if (qryDTO.getProductApplyRangeIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801133);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRangeId").in((Collection)qryDTO.getProductApplyRangeIdList()));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductDetailIdList())) {
            if (qryDTO.getProductDetailIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801134);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productDetailId").in((Collection)qryDTO.getProductDetailIdList()));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id, productId, productApplyRangeId, param, paramValue").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductParameters = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductParameters)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductParameters), ProductParametersDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductAssistClassVO> getProductAssistClassByProductId(List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(productIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801135);
        }
        if (productIdList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801136);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        QuerySchema querySchema = QuerySchema.create().addSelect("productId, productClassId").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductAssistClass = MetaDaoHelper.query((String)"pc.product.ProductAssistClass", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductAssistClass)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductAssistClass), ProductAssistClassVO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplDTO> getProductTplById(List<Long> id, String[] fields) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])fields);
        if (CollectionUtils.isEmpty(id)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801137);
        }
        if (id.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801138);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.tplFieldMap, (String[])fields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(id));
        QuerySchema querySchema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTpl = MetaDaoHelper.query((String)"pc.tpl.ProductTpl", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTpl)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTpl), ProductTplDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplUnitDTO> listProductTplUnitByTplId(List<Long> templateList, String[] fields) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])fields);
        if (CollectionUtils.isEmpty(templateList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801139);
        }
        if (templateList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801140);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.tplUnitFieldMap, (String[])fields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(templateList));
        QuerySchema querySchema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTplUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplUnit", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTplUnit)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTplUnit), ProductTplUnitDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplAssistUnitExchangeDTO> listTplAssistUnitExchangeByTplId(List<Long> templateList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801139);
        }
        if (templateList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801140);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(templateList));
        QuerySchema querySchema = QuerySchema.create().addSelect("template,unitExchangeType,assistUnitCount,assistUnit,assistUnit.precision as assistUnitPrecision,assistUnit.truncationType as assistUnitTruncationType,assistUnit.code as assistUnitCode,assistUnit.name as assistUnitName,assistUnit.convertCoefficient as unitConvertCoefficient,mainUnitCount as mainUnitCount,iOrder as order,mainUnitCountNew as mainUnitCountNew,mainUnitRate as mainUnitRate, assistVersValue as assistVerValue").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTplUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplAssistUnitExchange", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTplUnit)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTplUnit), ProductTplAssistUnitExchangeDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplExtendPropDTO> listProductTplExtendPropByTplId(List<Long> templateList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801139);
        }
        if (templateList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801140);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(templateList));
        QuerySchema querySchema = QuerySchema.create().addSelect("template,propertyType,isRequired as required,alias as propertyAlias,isShow as show,order").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTplUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplExtendPropertySum", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTplUnit)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTplUnit), ProductTplExtendPropDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplSpecSumDTO> listProductTplSpecSumByTplId(List<Long> templateList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801139);
        }
        if (templateList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801140);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").in(templateList));
        QuerySchema querySchema = QuerySchema.create().addSelect("template,specification,specitem as specItem,order,twoDimensionalInput,specBusinessDynamic").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTplUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpecSum", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTplUnit)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTplUnit), ProductTplSpecSumDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductSpecItemDTO> listProductSpecItemByProductId(List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(productIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801135);
        }
        if (productIdList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801136);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        QuerySchema querySchema = QuerySchema.create().addSelect("id,productId,haveImg,iOrder as order,iSpecId as specId,lsSpecItems_id as lsSpecItemsId,specValue as specValue").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductSpecItem = MetaDaoHelper.query((String)"pc.product.ProductSpecItem", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductSpecItem)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductSpecItem), ProductSpecItemDTO.class);
        }
        return null;
    }

    public UPCPager listProductSpecItemByPageV2(ProductSpecItemQryDTO productSpecItemQryDTO) throws Exception {
        Pager pager = this.listProductSpecItemByPage(productSpecItemQryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listProductSpecItemByPage(ProductSpecItemQryDTO productSpecItemQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (productSpecItemQryDTO.getPageIndex() == null) {
            productSpecItemQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (productSpecItemQryDTO.getPageSize() == null) {
            productSpecItemQryDTO.setPageSize(UpcAPiTool.DEFAULT_PAGE_SIZE);
        }
        if (productSpecItemQryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            productSpecItemQryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (productSpecItemQryDTO.getProductId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq((Object)productSpecItemQryDTO.getProductId()));
        }
        if (productSpecItemQryDTO.getProductIdList() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in((Collection)productSpecItemQryDTO.getProductIdList()));
        }
        if (productSpecItemQryDTO.getProductCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq((Object)productSpecItemQryDTO.getProductCode()));
        }
        if (productSpecItemQryDTO.getProductCodeList() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").in((Collection)productSpecItemQryDTO.getProductCodeList()));
        }
        QuerySchema querySchema = QuerySchema.create().addCondition((ConditionExpression)queryConditionGroup).addPager(productSpecItemQryDTO.getPageIndex().intValue(), productSpecItemQryDTO.getPageSize().intValue());
        querySchema.addSelect("id,productId,haveImg,iOrder as order,characterId as specId,characterValueId as lsSpecItemsId,imgBusinessId");
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.product.ProductFreeCharacterItem", (QuerySchema)querySchema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), ProductSpecItemDTO.class));
            ArrayList<String> businessIdList = new ArrayList<String>();
            HashMap<String, String> characterBusinessIdMap = new HashMap<String, String>();
            for (Object obj : pager.getRecordList()) {
                ProductSpecItemDTO productSpecItemDtoTemp = (ProductSpecItemDTO)obj;
                businessIdList.add(productSpecItemDtoTemp.getImgBusinessId());
                String businessKey = productSpecItemDtoTemp.getProductId() + "#" + productSpecItemDtoTemp.getSpecId().toString() + "#" + productSpecItemDtoTemp.getLsSpecItemsId();
                characterBusinessIdMap.put(businessKey, productSpecItemDtoTemp.getImgBusinessId());
            }
            if (null != businessIdList && businessIdList.size() > 0) {
                HashMap<String, List<ProductSpecItemAlbumDTO>> albumMap = this.productCharactorService.getAlbumByBusinessIds(businessIdList);
                for (Object obj : pager.getRecordList()) {
                    ProductSpecItemDTO productSpecItemDtoTemp = (ProductSpecItemDTO)obj;
                    String businessKey = productSpecItemDtoTemp.getProductId() + "#" + productSpecItemDtoTemp.getSpecId() + "#" + productSpecItemDtoTemp.getLsSpecItemsId();
                    String businessId = (String)characterBusinessIdMap.get(businessKey);
                    if (!StringUtils.isNotEmpty((CharSequence)businessId)) continue;
                    productSpecItemDtoTemp.setProductSpecItemAlbumDTOs(albumMap.get(businessId));
                }
            }
        }
        return pager;
    }

    @Override
    public List<ProductCheckFreeMergeDTO> listProductCheckFreeMerge(ProductSpecItemQryDTO productSpecItemQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        HashMap<String, Object> param = new HashMap<String, Object>(3);
        if (productSpecItemQryDTO.getProductId() != null) {
            param.put("productId", productSpecItemQryDTO.getProductId());
        }
        if (!CollectionUtils.isEmpty((Collection)productSpecItemQryDTO.getProductIdList())) {
            param.put("productIds", productSpecItemQryDTO.getProductIdList());
        }
        if (productSpecItemQryDTO.getProductCode() != null) {
            param.put("productCode", productSpecItemQryDTO.getProductCode());
        }
        if (!CollectionUtils.isEmpty((Collection)productSpecItemQryDTO.getProductCodeList())) {
            param.put("productCodes", productSpecItemQryDTO.getProductCodeList());
        }
        if (param.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        param.put("ytenant", AppContext.getCurrentUser().getYTenantId());
        List<Object> productCheckFreeMergeList = new ArrayList<ProductCheckFreeMergeDTO>();
        List productCheckFreeMergeMaps = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productcharacter.getProductCheckFreeMergeNewArch", param);
        if (!CollectionUtils.isEmpty((Collection)productCheckFreeMergeMaps)) {
            productCheckFreeMergeList = JSON.parseArray((String)JSON.toJSONString((Object)productCheckFreeMergeMaps), ProductCheckFreeMergeDTO.class);
        }
        return productCheckFreeMergeList;
    }

    @Override
    public List<ProductTagDTO> listProductTagByProductIdAndTagId(List<Long> productIdList, List<Long> tagIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(productIdList) && CollectionUtils.isEmpty(tagIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801142);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty(productIdList)) {
            if (productIdList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801143);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        }
        if (!CollectionUtils.isEmpty(tagIdList)) {
            if (tagIdList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801144);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"tagId").in(productIdList));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("productId, tagId, productApplyRangeId.orgId as orgId").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List queryByProductTag = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)queryByProductTag)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)queryByProductTag), ProductTagDTO.class);
        }
        return null;
    }

    @Override
    public CoreDocJsonResult<ProductTplCyclePropertyDTO> listProductTplCycleProperty(List<Long> templateIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (templateIdList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801145);
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        QuerySchema querySchema = QuerySchema.create().addSelect("id,template as templateId,propertyType,order,showType,dataType,isShow as show,values,alias,propertyType.name as propertyTypeName").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productTplCyclePropertyList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCycleProperty", (boolean)true, (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)productTplCyclePropertyList)) {
            for (Map productTplCycleProperty : productTplCyclePropertyList) {
                HashMap aliasMul = (HashMap)productTplCycleProperty.get("alias");
                aliasMul.put("simplifiedName", (String)aliasMul.get("zh_CN"));
                aliasMul.put("englishName", (String)aliasMul.get("en_US"));
                aliasMul.put("traditionalName", (String)aliasMul.get("zh_TW"));
            }
            List productTplCyclePropertyDTOS = JSON.parseArray((String)JSON.toJSONString((Object)productTplCyclePropertyList), ProductTplCyclePropertyDTO.class);
            return CoreDocJsonResult.success((List)productTplCyclePropertyDTOS);
        }
        return CoreDocJsonResult.success(null);
    }

    public List<ProductTplCharacterDTO> listProductTplCharacterDTO(List<Long> templateIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (CollectionUtils.isEmpty(templateIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (templateIdList.size() > UpcAPiTool.List_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801145);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").in(templateIdList)});
        QuerySchema querySchema = QuerySchema.create().addSelect("template ,characteristicsType,characteristics,character,characterCode,skuSens ,batchSens,SNSens,stockSens,costAffec,BOMAffec,manuAffec,priceAffec as PriceAffec,twoDimensionalInput").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.addPager(0, UpcAPiTool.MAX_COUNT);
        List productTplCharacterList = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (boolean)true, (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)productTplCharacterList)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productTplCharacterList), ProductTplCharacterDTO.class);
        }
        return null;
    }
}

