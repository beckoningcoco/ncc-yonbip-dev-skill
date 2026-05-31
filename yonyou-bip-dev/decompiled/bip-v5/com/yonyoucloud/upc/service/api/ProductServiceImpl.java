/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.excel.util.BooleanUtils
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.TypeReference
 *  com.alibaba.fastjson.parser.Feature
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.einvoice.dto.taxrevenue.TaxRevenueDTO
 *  com.yonyou.einvoice.service.itf.ITaxRevenueService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.material.MaterailPubServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService
 *  com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.search.delegate.YmsSearchClientSessionHolder
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.FieldValue
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.BoolQuery$Builder
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.MatchQuery$Builder
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.Operator
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.Query
 *  com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.TermQuery$Builder
 *  com.yonyou.permission.mdd.services.MddDefBillDataPermissionService
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.api.IProductDerivativeServiceV2
 *  com.yonyoucloud.iuap.upc.api.IProductServiceV2
 *  com.yonyoucloud.iuap.upc.dto.CostClassDTO
 *  com.yonyoucloud.iuap.upc.dto.CostClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassDTO
 *  com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.PresentationClassDTO
 *  com.yonyoucloud.iuap.upc.dto.PresentationClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProducClasstDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductApplyRangeDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductAsistUnitDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductAttachDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductBusiUnitDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSecDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTagDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplAssistUnitExchangeDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductTplUnitDTO
 *  com.yonyoucloud.iuap.upc.dto.ResultMessageDTO
 *  com.yonyoucloud.iuap.upc.dto.SyncProductAuthConditionDTO
 *  com.yonyoucloud.iuap.upc.dto.SyncProductAuthDTO
 *  com.yonyoucloud.iuap.upc.dto.TaxRevenueDTO
 *  com.yonyoucloud.iuap.upc.dto.UserDefineDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO
 *  com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.vo.ProductTagQueryVO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity
 *  com.yonyoucloud.upc.data.product.ProductQueryDao
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.excel.util.BooleanUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.einvoice.service.itf.ITaxRevenueService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.ProductAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.material.MaterailPubServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.service.attachment.impl.UPCAttachmentTransService;
import com.yonyou.iuap.apdoc.coredoc.service.elasticsearch.ElasticsearchManager;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.fileservice.sdk.module.pojo.CooperationFileInfo;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.search.delegate.YmsSearchClientSessionHolder;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.FieldValue;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.BoolQuery;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.MatchQuery;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.Operator;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.Query;
import com.yonyou.iuap.yonsearch.client.yonsearch._types.query_dsl.TermQuery;
import com.yonyou.permission.mdd.services.MddDefBillDataPermissionService;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.IProductDerivativeServiceV2;
import com.yonyoucloud.iuap.upc.api.IProductService;
import com.yonyoucloud.iuap.upc.api.IProductServiceV2;
import com.yonyoucloud.iuap.upc.api.service.IProductApiService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.iuap.upc.constants.ProductOldApiUtils;
import com.yonyoucloud.iuap.upc.dto.CostClassDTO;
import com.yonyoucloud.iuap.upc.dto.CostClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassDTO;
import com.yonyoucloud.iuap.upc.dto.MaterialClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.PresentationClassDTO;
import com.yonyoucloud.iuap.upc.dto.PresentationClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProducClasstDTO;
import com.yonyoucloud.iuap.upc.dto.ProductApplyRangeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductAsistUnitDTO;
import com.yonyoucloud.iuap.upc.dto.ProductAttachDTO;
import com.yonyoucloud.iuap.upc.dto.ProductBusiUnitDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSecDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplAssistUnitExchangeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplUnitDTO;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.dto.SyncProductAuthConditionDTO;
import com.yonyoucloud.iuap.upc.dto.SyncProductAuthDTO;
import com.yonyoucloud.iuap.upc.dto.TaxRevenueDTO;
import com.yonyoucloud.iuap.upc.dto.UserDefineDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoCollectDTO;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.ProductTagQueryVO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity;
import com.yonyoucloud.upc.data.product.ProductQueryDao;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.api.PresentationClassServiceImpl;
import com.yonyoucloud.upc.service.api.ProductShelfServiceImpl;
import com.yonyoucloud.upc.service.api.SkuServiceImpl;
import com.yonyoucloud.upc.service.api.UPCBizServiceImpl;
import com.yonyoucloud.upc.service.batchModify.PubBatchModifyEntityServiceImpl;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductServiceImpl
extends MaterailPubServiceImpl
implements IProductService,
IProductServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    IProductApiService productApiService;
    @Autowired
    IUPCBillService billService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Value(value="${cooperationFile.isOpen:false}")
    boolean isOpenCooperation;
    @Autowired
    UPCAttachmentTransService attachmentTransService;
    @Autowired
    ProductClsService productClsService;
    @Autowired
    @Qualifier(value="data")
    MddDefBillDataPermissionService permissionService;
    @Autowired
    private PresentationClassServiceImpl presentationClassService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private IUPCProductQueryService upcProductQueryService;
    @Autowired
    private IProductDerivativeServiceV2 productDerivativeService;
    @Autowired
    SkuServiceImpl skuService;
    @Autowired
    UPCBizServiceImpl upcBizService;
    @Autowired
    ProductShelfServiceImpl productShelfService;
    @Autowired
    private PubBatchModifyEntityServiceImpl pubBatchModifyEntityService;
    @Autowired
    private ProductQueryDao productQueryDao;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private ITaxRevenueService taxRevenueService;

    @Override
    public Pager listProductByPage(Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productMainFieldMapping, (String[])field);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false)})).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.product.Product", (QuerySchema)schema);
        return pager;
    }

    @Override
    public Pager listProductIdByCondition(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.MAX_COUNT) {
            pageSize = UpcAPiTool.MAX_COUNT;
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addPager(pageIndex.intValue(), pageSize.intValue());
        if (qryDTO != null) {
            QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
            this.setQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
            schema.addCondition((ConditionExpression)queryConditionGroup);
        }
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.product.Product", (QuerySchema)schema);
        return pager;
    }

    public UPCPager listProductByPageV2(Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager = this.listProductByPage(pageIndex, pageSize, field);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listProductIdByConditionV2(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager = this.listProductIdByCondition(qryDTO, pageIndex, pageSize, field);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public ProductDTO getProductById(Long productId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)})}));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        schema.addCondition((ConditionExpression)queryConditionGroup);
        this.setProductDerivative(field, schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        ProductDTO productDTO = this.getProductDTO(schema);
        this.attachmentTransService.convertProductAttachmentForRPC(productDTO, field, Boolean.valueOf(true));
        return productDTO;
    }

    @Override
    public ProductDTO getProductByCode(String productCode, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        UpcAPiTool.checkPara((String)productCode);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)productCode)})}));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        schema.addCondition((ConditionExpression)queryConditionGroup);
        return this.getProductDTO(schema);
    }

    @Override
    public ProductDTO getProductByIdAndOrg(Long productId, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        UpcAPiTool.checkPara((Long[])new Long[]{productId, orgId});
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = orgGlobalShare != null && orgGlobalShare != false ? QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").eq((Object)productId)})})) : QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").eq((Object)productId), QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId.toString())})}));
        return this.getProductDTO(schema);
    }

    @Override
    public ProductDTO getProductByIdAndOrg(Long productId, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        UpcAPiTool.checkPara((String)orgId);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = orgGlobalShare != null && orgGlobalShare != false ? QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").eq((Object)productId)})})) : QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").eq((Object)productId), QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId)})}));
        return this.getProductDTO(schema);
    }

    @Override
    public List<ProductDTO> getProductByIds(List<Long> productIds, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})}));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        schema.addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        this.setProductDerivativeSchema(field, schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        List productDTOS = this.listProductDTOS(schema);
        this.convertProductAttachment(productDTOS, field, false);
        return productDTOS;
    }

    public List<ProductDTO> getProductGlobalFieldByIds(List<Long> productIds, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productMainFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").in(productIds)})}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        this.setProductDerivativeSchema(field, schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        List productDTOS = this.listProductDTOS(schema);
        this.convertProductAttachment(productDTOS, field, false);
        return productDTOS;
    }

    @Override
    public List<ProductDTO> getProductByIdsAndOrg(List<Long> productIds, Long orgId, String[] field) throws Exception {
        return this.listProductByIdsAndOrg(productIds, orgId, field);
    }

    @Override
    public List<ProductDTO> getProductByIdsAndOrg(List<Long> productIds, String orgId, String[] field) throws Exception {
        QuerySchema schema;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare != null && orgGlobalShare.booleanValue()) {
            schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").in(productIds)})}));
        } else {
            QueryCondition orgQueryConditin = StringUtils.isEmpty((CharSequence)orgId) ? QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1) : QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId);
            schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)false), QueryCondition.name((String)"id").in(productIds), orgQueryConditin})}));
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductDTOS(schema);
    }

    @Override
    public ProducClasstDTO getProducClasstByIdOrCode(Long productClassId, String productClassCode, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (StringUtils.isBlank((CharSequence)productClassCode) && null == productClassId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productClassFieldMap, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup = null != productClassId ? QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productClassId)}) : QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)productClassCode)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        Map productMap = MetaDaoHelper.queryOne((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        if (productMap != null) {
            return (ProducClasstDTO)JSON.parseObject((String)JSON.toJSONString((Object)productMap), ProducClasstDTO.class);
        }
        return null;
    }

    @Override
    public List<MaterialClassDTO> getMaterialClassByIdOrCode(MaterialClassQryDTO qryDTO, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!this.setQueryConditionGroupByMaterialClassQryDTO(qryDTO, queryConditionGroup).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDeleted").eq((Object)false));
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List<Map<String, Object>> productMap = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        List<String> queryList = Arrays.asList(field);
        if (queryList.contains("id") && queryList.contains("code") && queryList.contains("order") && queryList.contains("parent")) {
            productMap = this.productClsService.sortTree(productMap);
        }
        if (productMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productMap), MaterialClassDTO.class);
        }
        return null;
    }

    public UPCPager listMaterialClassByPageV2(MaterialClassQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager = this.listMaterialClassByPage(qryDTO, pageIndex, pageSize, field);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listMaterialClassByPage(MaterialClassQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.materialClassFieldMap, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        this.setQueryConditionGroupByMaterialClassQryDTO(qryDTO, queryConditionGroup);
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDeleted").eq((Object)false));
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.cls.ManagementClass", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), MaterialClassDTO.class));
        }
        return pager;
    }

    private Boolean setQueryConditionGroupByMaterialClassQryDTO(MaterialClassQryDTO qryDTO, QueryConditionGroup queryConditionGroup) {
        Boolean hasFilterItem = false;
        if (qryDTO.getMaterialClassIdList() != null && qryDTO.getMaterialClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getMaterialClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getMaterialClassCodeList() != null && qryDTO.getMaterialClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getMaterialClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getMaterialClassNameList() != null && qryDTO.getMaterialClassNameList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").in((Collection)qryDTO.getMaterialClassNameList()));
            hasFilterItem = true;
        }
        if (qryDTO.getParentId() != null) {
            if (qryDTO.getParentId() == 0L) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"level").eq((Object)"1"));
            } else {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)qryDTO.getParentId()));
            }
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getParentIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").in((Collection)qryDTO.getParentIds()));
            hasFilterItem = true;
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)qryDTO.getStopStatus()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getPaths())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").in((Collection)qryDTO.getPaths()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").eq((Object)qryDTO.getErpCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCodeList() != null && qryDTO.getErpCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").in((Collection)qryDTO.getErpCodeList()));
            hasFilterItem = true;
        }
        return hasFilterItem;
    }

    @Override
    public MaterialClassDTO listRootMaterailDTO(String[] field) throws Exception {
        return null;
    }

    @Override
    public List<ProductApplyRangeDTO> getProductApplyRange(Long productId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        return this.listMaterialRangeByConditionGroup(QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)}));
    }

    @Override
    public List<ProductApplyRangeDTO> getProductApplyRange(List<Long> materialClassId, Integer productAttributed) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{materialClassId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.manageClass").in(materialClassId)});
        if (productAttributed != null && ProductAPIUtils.productAttributeMap.get(productAttributed) != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)((String)ProductAPIUtils.productAttributeMap.get(productAttributed))).eq((Object)1));
        }
        return this.listMaterialRangeByConditionGroup(queryConditionGroup);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductApplyRange(List<Long> productIds, Integer productAttributed, Integer productAttributedValue) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)});
        if (productAttributed != null && ProductAPIUtils.productAttributeMap.get(productAttributed) != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)((String)ProductAPIUtils.productAttributeMap.get(productAttributed))).eq((Object)productAttributedValue));
        }
        return this.listMaterialRangeByConditionGroup(queryConditionGroup);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductApplyRangeByOrgIds(List<Long> orgIds, Integer productAttributed, Integer productAttributedValue) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIds});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (orgGlobalShare == null || !orgGlobalShare.booleanValue()) {
            ArrayList<String> orgIdStringList = new ArrayList<String>(orgIds.size());
            for (Long aLong : orgIds) {
                orgIdStringList.add(aLong.toString());
            }
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdStringList)});
        }
        if (productAttributed != null && ProductAPIUtils.productAttributeMap.get(productAttributed) != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)((String)ProductAPIUtils.productAttributeMap.get(productAttributed))).eq((Object)productAttributedValue));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductApplyRangeByOrgIdsNew(List<String> orgIds, Integer productAttributed, Integer productAttributedValue) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIds});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (orgGlobalShare == null || !orgGlobalShare.booleanValue()) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIds)});
        }
        if (productAttributed != null && ProductAPIUtils.productAttributeMap.get(productAttributed) != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)((String)ProductAPIUtils.productAttributeMap.get(productAttributed))).eq((Object)productAttributedValue));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public ResultMessageDTO deleteApplyRangeInfo(Long orgId, List<Long> productIds) throws Exception {
        ResultMessageDTO resultMessageDTO;
        List<ProductApplyRangeDTO> productApplyRangeDTOList = this.getProductByOrgIdOld(orgId.toString(), productIds);
        ArrayList tempData = new ArrayList();
        if (productApplyRangeDTOList != null && productApplyRangeDTOList.size() > 0) {
            for (ProductApplyRangeDTO productApplyRangeDTO : productApplyRangeDTOList) {
                if (productApplyRangeDTO.getIsCreator().booleanValue()) continue;
                HashMap<String, Comparable<Long>> tempMap = new HashMap<String, Comparable<Long>>();
                tempMap.put("id", productApplyRangeDTO.getProductId());
                tempMap.put("productApplyRangeId", productApplyRangeDTO.getId());
                tempMap.put("isCreator", Boolean.valueOf(Boolean.parseBoolean(productApplyRangeDTO.getIsCreator().toString())));
                tempMap.put("isApplied", Boolean.valueOf(Boolean.parseBoolean(productApplyRangeDTO.getIsApplied().toString())));
                tempData.add(tempMap);
            }
            if (!tempData.isEmpty()) {
                BillDataDto bill = new BillDataDto();
                bill.setBillnum("pc_productlist_query");
                bill.setData(tempData);
                try {
                    ResultList resultList = this.billService.batchdelete(bill);
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
                }
                catch (Exception e) {
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
                }
            } else {
                resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080485", (String)"\u7269\u6599\u5df2\u88ab\u4f7f\u7528\u7ec4\u7ec7\u4f7f\u7528\uff0c\u53d8\u6210\u79c1\u6709\u5316\u6570\u636e\uff0c\u4e0d\u5141\u8bb8\u5220\u9664\uff01")), ResultMessageDTO.class);
            }
        } else {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080486", (String)"\u5220\u9664\u7684\u6570\u636e\u4e0d\u5b58\u5728\uff01")), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    @Override
    public ResultMessageDTO deleteApplyRangeInfo(String orgId, List<Long> productIds) throws Exception {
        ResultMessageDTO resultMessageDTO;
        List<ProductApplyRangeDTO> productApplyRangeDTOList = this.getProductByOrgId(orgId, productIds);
        ArrayList tempData = new ArrayList();
        if (productApplyRangeDTOList != null && productApplyRangeDTOList.size() > 0) {
            for (ProductApplyRangeDTO productApplyRangeDTO : productApplyRangeDTOList) {
                if (productApplyRangeDTO.getIsCreator().booleanValue()) continue;
                HashMap<String, Object> tempMap = new HashMap<String, Object>();
                tempMap.put("id", productApplyRangeDTO.getProductId());
                tempMap.put("productApplyRangeId", productApplyRangeDTO.getId());
                tempMap.put("productApplyRange_orgId", productApplyRangeDTO.getOrgId());
                tempMap.put("isCreator", Boolean.parseBoolean(productApplyRangeDTO.getIsCreator().toString()));
                tempMap.put("isApplied", Boolean.parseBoolean(productApplyRangeDTO.getIsApplied().toString()));
                tempData.add(tempMap);
            }
            if (!tempData.isEmpty()) {
                BillDataDto bill = new BillDataDto();
                bill.setBillnum("pc_productlist_query");
                bill.setData(tempData);
                try {
                    ResultList resultList = this.billService.batchdelete(bill);
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
                }
                catch (Exception e) {
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
                }
            } else {
                resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080485", (String)"\u7269\u6599\u5df2\u88ab\u4f7f\u7528\u7ec4\u7ec7\u4f7f\u7528\uff0c\u53d8\u6210\u79c1\u6709\u5316\u6570\u636e\uff0c\u4e0d\u5141\u8bb8\u5220\u9664\uff01")), ResultMessageDTO.class);
            }
        } else {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080486", (String)"\u5220\u9664\u7684\u6570\u636e\u4e0d\u5b58\u5728\uff01")), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    @Override
    public ResultMessageDTO deleteApplyRangeInfo(List<Long> orgIds, Long productId) throws Exception {
        ResultMessageDTO resultMessageDTO;
        List<ProductApplyRangeDTO> productApplyRangeDTOList = this.getProductByOrgIdOld(orgIds, productId);
        ArrayList tempData = new ArrayList();
        if (productApplyRangeDTOList != null && productApplyRangeDTOList.size() > 0) {
            for (ProductApplyRangeDTO productApplyRangeDTO : productApplyRangeDTOList) {
                if (productApplyRangeDTO.getIsCreator().booleanValue()) continue;
                HashMap<String, Object> tempMap = new HashMap<String, Object>();
                tempMap.put("id", productApplyRangeDTO.getProductId());
                tempMap.put("productApplyRangeId", productApplyRangeDTO.getId());
                tempMap.put("productApplyRange_orgId", productApplyRangeDTO.getOrgId());
                tempMap.put("isCreator", Boolean.parseBoolean(productApplyRangeDTO.getIsCreator().toString()));
                tempMap.put("isApplied", Boolean.parseBoolean(productApplyRangeDTO.getIsApplied().toString()));
                tempData.add(tempMap);
            }
            if (!tempData.isEmpty()) {
                BillDataDto bill = new BillDataDto();
                bill.setBillnum("pc_productlist_query");
                bill.setData(tempData);
                try {
                    ResultList resultList = this.billService.batchdelete(bill);
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
                }
                catch (Exception e) {
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
                }
            } else {
                resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080485", (String)"\u7269\u6599\u5df2\u88ab\u4f7f\u7528\u7ec4\u7ec7\u4f7f\u7528\uff0c\u53d8\u6210\u79c1\u6709\u5316\u6570\u636e\uff0c\u4e0d\u5141\u8bb8\u5220\u9664\uff01")), ResultMessageDTO.class);
            }
        } else {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080486", (String)"\u5220\u9664\u7684\u6570\u636e\u4e0d\u5b58\u5728\uff01")), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    @Override
    public ResultMessageDTO deleteApplyRangeInfoNew(List<String> orgIds, Long productId) throws Exception {
        ResultMessageDTO resultMessageDTO;
        List<ProductApplyRangeDTO> productApplyRangeDTOList = this.getProductByStringOrgIdOld(orgIds, productId);
        ArrayList tempData = new ArrayList();
        if (productApplyRangeDTOList != null && productApplyRangeDTOList.size() > 0) {
            for (ProductApplyRangeDTO productApplyRangeDTO : productApplyRangeDTOList) {
                if (productApplyRangeDTO.getIsCreator().booleanValue()) continue;
                HashMap<String, Object> tempMap = new HashMap<String, Object>();
                tempMap.put("id", productApplyRangeDTO.getProductId());
                tempMap.put("productApplyRangeId", productApplyRangeDTO.getId());
                tempMap.put("productApplyRange_orgId", productApplyRangeDTO.getOrgId());
                tempMap.put("isCreator", Boolean.parseBoolean(productApplyRangeDTO.getIsCreator().toString()));
                tempMap.put("isApplied", Boolean.parseBoolean(productApplyRangeDTO.getIsApplied().toString()));
                tempData.add(tempMap);
            }
            if (tempData != null && !tempData.isEmpty()) {
                BillDataDto bill = new BillDataDto();
                bill.setBillnum("pc_productlist_query");
                bill.setData(tempData);
                try {
                    ResultList resultList = this.billService.batchdelete(bill);
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.data((Object)resultList), ResultMessageDTO.class);
                }
                catch (Exception e) {
                    resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)e.getMessage()), ResultMessageDTO.class);
                }
            } else {
                resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080485", (String)"\u7269\u6599\u5df2\u88ab\u4f7f\u7528\u7ec4\u7ec7\u4f7f\u7528\uff0c\u53d8\u6210\u79c1\u6709\u5316\u6570\u636e\uff0c\u4e0d\u5141\u8bb8\u5220\u9664\uff01")), ResultMessageDTO.class);
            }
        } else {
            resultMessageDTO = (ResultMessageDTO)JSON.parseObject((String)ResultMessage.error((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080486", (String)"\u5220\u9664\u7684\u6570\u636e\u4e0d\u5b58\u5728\uff01")), ResultMessageDTO.class);
        }
        return resultMessageDTO;
    }

    private Boolean setQueryConditionGroupByQryDTO(ProductQryDTO qryDTO, QueryConditionGroup queryConditionGroup) throws Exception {
        QueryConditionGroup orContitionGroup;
        QueryConditionGroup orConditionGroup;
        Boolean hasFilterItem = false;
        hasFilterItem = this.removeOrgConditionByGlobalShare(qryDTO);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdList()));
            hasFilterItem = true;
        } else if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getProductCodeList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductIdNotInList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in((Collection)qryDTO.getProductIdNotInList()));
            hasFilterItem = true;
        }
        if (qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() != null && !CollectionUtils.isEmpty((Collection)qryDTO.getProductIdOrLikeList())) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"model").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdOrLikeList())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        } else if (qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"model").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (qryDTO.getNameOrCodeOrBarCodeFuzzyValue() != null && !CollectionUtils.isEmpty((Collection)qryDTO.getProductIdOrLikeList())) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdOrLikeList())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        } else if (qryDTO.getNameOrCodeOrBarCodeFuzzyValue() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (qryDTO.getBarCodeOrMultiBarCodeFuzzyValue() != null) {
            this.getProductBarCodeConditionGroup(qryDTO, queryConditionGroup);
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getFuzzyDisplayName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.displayName").like((Object)qryDTO.getFuzzyDisplayName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").like((Object)qryDTO.getProductCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreateOrgList() != null && qryDTO.getCreateOrgList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in((Collection)qryDTO.getCreateOrgList()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductName()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)qryDTO.getProductName()));
            hasFilterItem = true;
        }
        if (qryDTO.getPurchaseClassIdList() != null && qryDTO.getPurchaseClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"purchaseClass").in((Collection)qryDTO.getPurchaseClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getPurchaseClassCodeList() != null && qryDTO.getPurchaseClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"purchaseClass.code").in((Collection)qryDTO.getPurchaseClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassIdList() != null && qryDTO.getManagerClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass").in((Collection)qryDTO.getManagerClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassIdNotInList() != null && qryDTO.getManagerClassIdNotInList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass").not_in((Collection)qryDTO.getManagerClassIdNotInList()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassCodeList() != null && qryDTO.getManagerClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").in((Collection)qryDTO.getManagerClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassCodeList() != null && qryDTO.getProductClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.code").in((Collection)qryDTO.getProductClassCodeList()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductClassPath()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").eq((Object)qryDTO.getProductClassPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassLeftFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").left_like((Object)qryDTO.getProductClassLeftFuzzyPath()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductClassFuzzyPath()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").like((Object)qryDTO.getProductClassFuzzyPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getAssistClassesLeftFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productAssistClasses.productClassId.path").left_like((Object)qryDTO.getAssistClassesLeftFuzzyPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassOrAssistClassesLeftFuzzyPath() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass.path").left_like((Object)qryDTO.getProductClassOrAssistClassesLeftFuzzyPath()), QueryCondition.name((String)"productAssistClasses.productClassId.path").left_like((Object)qryDTO.getProductClassOrAssistClassesLeftFuzzyPath())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getAssistClassIdList() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productAssistClasses.productClassId").in((Collection)qryDTO.getAssistClassIdList()));
            hasFilterItem = true;
        }
        if (null != qryDTO.getProductNameList()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").in((Collection)qryDTO.getProductNameList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCodeOrNameFuzzyValue() != null) {
            orContitionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getCodeOrNameFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getCodeOrNameFuzzyValue())});
            queryConditionGroup.addCondition((ConditionExpression)orContitionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getCodeOrNameValue() != null) {
            orContitionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)qryDTO.getCodeOrNameValue()), QueryCondition.name((String)"name").eq((Object)qryDTO.getCodeOrNameValue())});
            queryConditionGroup.addCondition((ConditionExpression)orContitionGroup);
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getShortName()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.shortName").like((Object)qryDTO.getShortName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getManageClassCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").like((Object)qryDTO.getManageClassCode()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getManageClassLeftFuzzyCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").left_like((Object)qryDTO.getManageClassLeftFuzzyCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductLineIdList() != null && qryDTO.getProductLineIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productLine").in((Collection)qryDTO.getProductLineIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductLineIdNotInList() != null && qryDTO.getProductLineIdNotInList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productLine").not_in((Collection)qryDTO.getProductLineIdNotInList()), QueryCondition.name((String)"productLine").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getBrandIdList() != null && qryDTO.getBrandIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brand").in((Collection)qryDTO.getBrandIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getBrandIdNotINList() != null && qryDTO.getBrandIdNotINList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").not_in((Collection)qryDTO.getBrandIdNotINList()), QueryCondition.name((String)"brand").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass").eq((Object)qryDTO.getCostClassId()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassIdList() != null && qryDTO.getCostClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass").in((Collection)qryDTO.getCostClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass.code").eq((Object)qryDTO.getCostClassCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassCodeList() != null && qryDTO.getCostClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass.code").in((Collection)qryDTO.getCostClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassIdList() != null && qryDTO.getProductClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass").in((Collection)qryDTO.getProductClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassIdNotInList() != null && qryDTO.getProductClassIdNotInList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").not_in((Collection)qryDTO.getProductClassIdNotInList()), QueryCondition.name((String)"productClass").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").eq((Object)qryDTO.getOrgId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getOrgStringList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").in((Collection)qryDTO.getOrgStringList()));
            hasFilterItem = true;
        } else if (qryDTO.getOrgList() != null && qryDTO.getOrgList().size() > 0) {
            ArrayList<String> orgIdStringList = new ArrayList<String>(qryDTO.getOrgList().size());
            for (Long orgId : qryDTO.getOrgList()) {
                if (orgId == null) continue;
                orgIdStringList.add(orgId.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").in(orgIdStringList));
            hasFilterItem = true;
        }
        if (qryDTO.getProductapplyIdList() != null && qryDTO.getProductapplyIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.id").in((Collection)qryDTO.getProductapplyIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreatorTypeList() != null && qryDTO.getCreatorTypeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creatorType").in((Collection)qryDTO.getCreatorTypeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getIsOil() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creatorType").eq((Object)qryDTO.getIsOil()));
            hasFilterItem = true;
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.stopstatus").eq((Object)qryDTO.getStopStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").eq((Object)qryDTO.getErpCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCodeList() != null && qryDTO.getErpCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").in((Collection)qryDTO.getErpCodeList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductTagList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.productTagNew.tagId").in((Collection)qryDTO.getProductTagList()));
            hasFilterItem = true;
        }
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").in((Collection)qryDTO.getShopId()));
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgType").eq((Object)3));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getTaxClassCodeList()) && qryDTO.getTaxClassCodeStatusFlag() != null && !qryDTO.getTaxClassCodeStatusFlag().booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"taxClass.code").not_in((Collection)qryDTO.getTaxClassCodeList()));
            hasFilterItem = true;
        } else if (!CollectionUtils.isEmpty((Collection)qryDTO.getTaxClassCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"taxClass.code").in((Collection)qryDTO.getTaxClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyValue() != null) {
            if (this.ymsParamConfig.getEsReplaceLikeFlag().booleanValue()) {
                List<Long> materialIdList = this.getMaterialIdFromEs(qryDTO.getFuzzyValue());
                if (CollectionUtils.isEmpty(materialIdList)) {
                    materialIdList.add((Long)-1);
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(materialIdList));
            } else {
                orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.shortName").like((Object)qryDTO.getFuzzyValue())});
                queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            }
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModelDescription())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"modelDescription").eq((Object)qryDTO.getModelDescription()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModelDescriptionFuzzy())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getModelDescriptionFuzzy()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModel())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"model").eq((Object)qryDTO.getModel()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getManufacturer())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manufacturer").eq((Object)qryDTO.getManufacturer()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductAttributed() != null && ProductAPIUtils.productOriginalAttributeMap.containsKey(qryDTO.getProductAttributed())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)((String)ProductAPIUtils.productOriginalAttributeMap.get(qryDTO.getProductAttributed()))).eq((Object)1));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductapplyIdList())) {
            if (qryDTO.getProductapplyIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801339);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.id").in((Collection)qryDTO.getProductapplyIdList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductSpecItemIsSpecItems())) {
            if (qryDTO.getProductSpecItemIsSpecItems().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801340);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productspecitems.lsSpecItems_id").in((Collection)qryDTO.getProductSpecItemIsSpecItems()));
            hasFilterItem = true;
        }
        if (qryDTO.getRecommendedMaterials() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isRecommend").eq((Object)qryDTO.getRecommendedMaterials()));
            hasFilterItem = true;
        }
        if (qryDTO.getPlatFormStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"platFormStaus").eq((Object)qryDTO.getPlatFormStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getSaleChannelOfOnlineBatch() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.saleChannelOfOnlineBatch").eq((Object)qryDTO.getSaleChannelOfOnlineBatch()));
            hasFilterItem = true;
        }
        if (qryDTO.getSaleChannelOfDistribution() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.saleChannelOfDistribution").eq((Object)qryDTO.getSaleChannelOfDistribution()));
            hasFilterItem = true;
        }
        if (qryDTO.getMktStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.iStatus").eq((Object)qryDTO.getMktStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getMktUOrderStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.iUOrderStatus").eq((Object)qryDTO.getMktUOrderStatus()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getRealProductAttributeType())) {
            if (qryDTO.getRealProductAttributeType().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801341);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"realProductAttributeType").in((Collection)qryDTO.getRealProductAttributeType()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getVirtualProductAttribute())) {
            if (qryDTO.getVirtualProductAttribute().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801342);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"virtualProductAttribute").in((Collection)qryDTO.getVirtualProductAttribute()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductTemplate() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate").eq((Object)qryDTO.getProductTemplate()));
            hasFilterItem = true;
        }
        if (qryDTO.getSaleInOfflineStore() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isSaleInOfflineStore").eq((Object)qryDTO.getSaleInOfflineStore()));
            hasFilterItem = true;
        }
        if (qryDTO.getCouponId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"couponId").eq((Object)qryDTO.getCouponId()));
            hasFilterItem = true;
        }
        if (qryDTO.getMnemonicCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").eq((Object)qryDTO.getMnemonicCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreatorCustomer() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"cust").eq((Object)qryDTO.getCreatorCustomer()));
            hasFilterItem = true;
        }
        if (qryDTO.getOfflineStoreOrder() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isOfflineStoreOrder").eq((Object)qryDTO.getOfflineStoreOrder()));
            hasFilterItem = true;
        }
        if (qryDTO.getCheckFree() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isCheckFree").eq((Object)qryDTO.getCheckFree()));
            hasFilterItem = true;
        }
        if (qryDTO.getProcess() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isProcess").eq((Object)qryDTO.getProcess()));
            hasFilterItem = true;
        }
        if (qryDTO.getStockSerialNoManage() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isSerialNoManage").eq((Object)qryDTO.getStockSerialNoManage()));
            hasFilterItem = true;
        }
        if (qryDTO.getGtOrderUpCount() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.uorderupcount").gt((Object)qryDTO.getGtOrderUpCount()));
            hasFilterItem = true;
        }
        if (qryDTO.getValueManageType() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.valueManageType").eq((Object)(qryDTO.getValueManageType() != false ? 1 : 0)));
            hasFilterItem = true;
        }
        if (qryDTO.getBeganTime() != null || qryDTO.getEndTime() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)qryDTO.getBeganTime(), (Object)qryDTO.getEndTime()));
            hasFilterItem = true;
        }
        if (qryDTO.getPubts() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"pubts").egt((Object)qryDTO.getPubts()), QueryCondition.name((String)"productApplyRange.productDetailId.pubts").egt((Object)qryDTO.getPubts())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (qryDTO.getPageIndex() != null && qryDTO.getPageSize() != null) {
            hasFilterItem = true;
        }
        if (qryDTO.getRealProductAttribute() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"realProductAttribute").eq((Object)qryDTO.getRealProductAttribute()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductCharacterDef() != null && !qryDTO.getProductCharacterDef().isEmpty()) {
            Map<String, String> characterCodeToTypeMap = this.skuService.buildCharacterCodeToTypeMap("pc_product", "productCharacterDef");
            QueryConditionGroup characterConditionGroup = UpcAPiTool.buildCharacterQueryCondition((Map)qryDTO.getProductCharacterDef(), characterCodeToTypeMap, (String)"productCharacterDef");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getManufacturePlanner() != null && !qryDTO.getManufacturePlanner().isEmpty()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.manufacturePlanner").eq((Object)qryDTO.getManufacturePlanner()));
            hasFilterItem = true;
        }
        if (qryDTO.getInventoryPlanStrategy() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.inventoryPlanStrategy").eq((Object)qryDTO.getInventoryPlanStrategy()));
            hasFilterItem = true;
        }
        if (qryDTO.getBarCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.barCode").eq((Object)qryDTO.getBarCode()));
            hasFilterItem = true;
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDeleted").eq((Object)qryDTO.getDeleteFlag()));
        if (this.needIsCreator(qryDTO)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        }
        return hasFilterItem;
    }

    private boolean needIsCreator(ProductQryDTO qryDTO) {
        boolean needIsCreator;
        boolean bl = needIsCreator = qryDTO.getCreator() != null && BooleanUtil.isTrue((Object)qryDTO.getCreator());
        if (!needIsCreator) {
            needIsCreator = qryDTO.getOrgId() == null && CollectionUtils.isEmpty((Collection)qryDTO.getOrgStringList()) && CollectionUtils.isEmpty((Collection)qryDTO.getOrgList());
        }
        return needIsCreator;
    }

    @NotNull
    private void getProductBarCodeConditionGroup(ProductQryDTO qryDTO, QueryConditionGroup queryConditionGroup) throws Exception {
        QueryConditionGroup orConditionGroup;
        QuerySchema schema = QuerySchema.create().addSelect("productId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"barCode").like((Object)qryDTO.getBarCodeOrMultiBarCodeFuzzyValue())}));
        List productList = MetaDaoHelper.query((String)"pc.product.ProductBarCode", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)productList)) {
            Set ids = productList.stream().map(product -> (Long)product.get("productId")).collect(Collectors.toSet());
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(ids), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getBarCodeOrMultiBarCodeFuzzyValue())});
        } else {
            orConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getBarCodeOrMultiBarCodeFuzzyValue())});
        }
        queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
    }

    @Override
    public List<ProductDTO> listProductInfo(ProductQryDTO qryDTO, String[] field) throws Exception {
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        if (field != null && field.length != 0) {
            qryDTO.setField(field);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        Boolean hasFilterItem = this.setQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (!hasFilterItem.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        schema.addCondition((ConditionExpression)queryConditionGroup);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductAPIUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductAPIUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        if (qryDTO.getPageIndex() != null && qryDTO.getPageSize() != null) {
            schema.addPager(qryDTO.getPageIndex().intValue(), qryDTO.getPageSize().intValue());
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        this.setProductDerivative(field, schema);
        if (!Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        List productDTOS = this.listProductDTOS(schema);
        this.queryProductBarCode(field, productDTOS);
        this.convertProductAttachment(productDTOS, field, true);
        return productDTOS;
    }

    private void queryProductBarCode(String[] field, List<ProductDTO> productDTOS) throws Exception {
        if (!CollectionUtils.isEmpty(productDTOS) && Arrays.asList(field).contains("productBarCodes")) {
            for (ProductDTO productDTO : productDTOS) {
                QuerySchema productBarCodeSchema = QuerySchema.create().addSelect("barCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productDTO.getId())}));
                List productBarCodeList = MetaDaoHelper.query((String)"pc.product.ProductBarCode", (QuerySchema)productBarCodeSchema);
                List barCodeList = productBarCodeList.stream().map(productBarCode -> (String)productBarCode.get("barCode")).collect(Collectors.toList());
                productDTO.setProductBarCodes(barCodeList);
            }
        }
    }

    @Override
    public List<ProductDTO> listOldProductInfo(ProductQryDTO qryDTO, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryOldFields(ProductOldApiUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        Boolean hasFilterItem = this.setOldQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (!hasFilterItem.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        this.setProductDerivative(field, schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        List<ProductDTO> productDTOS = this.listOldProductDTOS(schema);
        this.convertProductAttachment(productDTOS, field, true);
        return productDTOS;
    }

    @Override
    public List<ProductDTO> listOldProductInfoByDataAuth(ProductQryDTO qryDTO, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryOldFields(ProductOldApiUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        Boolean hasFilterItem = this.setOldQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (!hasFilterItem.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        schema.addPager(0, UpcAPiTool.MAX_COUNT);
        this.setProductDerivative(field, schema);
        if (qryDTO.getPageIndex() != null && qryDTO.getPageSize() != null) {
            schema.addPager(qryDTO.getPageIndex().intValue(), qryDTO.getPageSize().intValue());
        }
        BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000CE", (String)"\u7269\u6599\u6863\u6848"), "pc.product.Product", "query");
        this.permissionService.handleAuthPermission((Object)billContext, (Object)schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        List<ProductDTO> productDTOS = this.listOldProductDTOS(schema);
        this.convertProductAttachment(productDTOS, field, true);
        return productDTOS;
    }

    public UPCPager listProductByPageV2(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager = this.listProductByPage(qryDTO, pageIndex, pageSize, field);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listOldProductByPageV2(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager = this.listOldProductByPage(qryDTO, pageIndex, pageSize, field);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listProductByPage(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        this.setQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        if (qryDTO.getCreator() != null && BooleanUtil.isTrue((Object)qryDTO.getCreator())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        }
        schema.addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductAPIUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductAPIUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        this.setProductDerivative(field, schema);
        if (this.isOpenCooperation && !Arrays.asList(field).contains("id")) {
            schema.addSelect("id");
        }
        String customExtentFieldStr = this.queryCustomExtentFieldByFullName("pc.product.Product");
        schema.addSelect(customExtentFieldStr);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductTagList())) {
            schema.distinct();
        }
        if ((pager = MetaDaoHelper.queryByPage((String)"pc.product.Product", (QuerySchema)schema)) != null && pager.getRecordList() != null) {
            this.dealCustomExtendData(pager.getRecordList(), customExtentFieldStr);
            List recordListToProductDTO = JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), ProductDTO.class);
            this.convertProductAttachment(recordListToProductDTO, field, true);
            pager.setRecordList(recordListToProductDTO);
        }
        return pager;
    }

    @Override
    public Pager listOldProductByPage(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        Pager pager;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryOldFields(ProductOldApiUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        this.setOldQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        if ((pager = MetaDaoHelper.queryByPage((String)"pc.product.Product", (QuerySchema)schema)) != null && pager.getRecordList() != null) {
            pager.setRecordList(this.detailReturnProduct(pager.getRecordList()));
        }
        return pager;
    }

    public UPCPager listOldProductByPageAndDataAuth(ProductQryDTO qryDTO, Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryField[] qryFields = UpcAPiTool.qryOldFields(ProductOldApiUtils.productAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        this.setOldQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getAscField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getAscField(), schema, "asc");
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getDescField())) {
            this.splicingSchema(ProductOldApiUtils.productAllFieldMapping, qryDTO.getDescField(), schema, "desc");
        }
        BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000CE", (String)"\u7269\u6599\u6863\u6848"), "pc.product.Product", "query");
        this.permissionService.handleAuthPermission((Object)billContext, (Object)schema);
        Pager pager = MetaDaoHelper.queryByPage((String)"pc.product.Product", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(this.detailReturnProduct(pager.getRecordList()));
        }
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgId(Long orgId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = orgGlobalShare != null && orgGlobalShare != false ? QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType") : QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId.toString())}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgId(String orgId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String)orgId);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = orgGlobalShare != null && orgGlobalShare != false ? QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType") : QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId)}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgId(Long orgId, List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (orgGlobalShare == null || !orgGlobalShare.booleanValue()) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId.toString())});
        }
        if (productIdList != null && productIdList.size() > 0 && productIdList.size() <= UpcAPiTool.List_LENGTH) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,productDetailId,productId.orgId as productOrgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgId(String orgId, List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String)orgId);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!orgGlobalShare.booleanValue()) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId.toString())});
        }
        if (productIdList != null && productIdList.size() > 0 && productIdList.size() <= UpcAPiTool.List_LENGTH) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,productDetailId,productId.orgId as productOrgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    public List<ProductApplyRangeDTO> getProductByOrgIdOld(List<Long> orgIdList, Long productId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && orgIdList != null && orgIdList.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(orgIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,orgId,productDetailId,isCreator,isApplied").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listOldProductApplyRangeDTOS(schema);
    }

    public List<ProductApplyRangeDTO> getProductByStringOrgIdOld(List<String> orgIdList, Long productId) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && orgIdList != null && orgIdList.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(orgIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,orgId,productDetailId,isCreator,isApplied").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listOldProductApplyRangeDTOS(schema);
    }

    public List<ProductApplyRangeDTO> getProductByOrgIdOld(String orgId, List<Long> productIdList) throws Exception {
        UpcAPiTool.checkPara((String)orgId);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue()) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId)});
        }
        if (productIdList != null && productIdList.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").in(productIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,orgId,productDetailId,isCreator,isApplied").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listOldProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgId(List<Long> orgIdList, Long productId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && orgIdList != null && orgIdList.size() > 0 && orgIdList.size() <= UpcAPiTool.List_LENGTH) {
            ArrayList<String> orgIdStringList = new ArrayList<String>(orgIdList.size());
            for (Long aLong : orgIdList) {
                orgIdStringList.add(aLong.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdStringList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,productDetailId,productId.orgId as productOrgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgIdList(List<String> orgIdList, Long productId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{productId});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && orgIdList != null && orgIdList.size() > 0 && orgIdList.size() <= UpcAPiTool.List_LENGTH) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdList));
        }
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,productDetailId,productId.orgId as productOrgId,orgGroupType").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgIds(List<Long> orgIdList) throws Exception {
        QuerySchema schema;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIdList});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (orgGlobalShare.booleanValue()) {
            schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType");
        } else {
            ArrayList<String> orgIdStringList = new ArrayList<String>(orgIdList.size());
            for (Long aLong : orgIdList) {
                orgIdStringList.add(aLong.toString());
            }
            schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdStringList)}));
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> getProductByOrgIdsNew(List<String> orgIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIdList});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        QuerySchema schema = orgGlobalShare != false ? QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType") : QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdList)}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Override
    public List<ProductApplyRangeDTO> listNotExistProductByOrgAndProductIds(List<Long> orgIdList, List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIdList, productIdList});
        ArrayList<String> orgIdStringList = new ArrayList<String>(orgIdList.size());
        for (Long aLong : orgIdList) {
            orgIdStringList.add(aLong.toString());
        }
        return this.listNotExistProductByOrgAndProductIdsNew(orgIdStringList, productIdList);
    }

    @Override
    public List<ProductApplyRangeDTO> listNotExistProductByOrgAndProductIdsNew(List<String> orgIdList, List<Long> productIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{orgIdList, productIdList});
        QuerySchema schema = QuerySchema.create().addSelect("productId,orgGroupId.orgGroupDetailList.orgId as orgId,orgGroupType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").in(orgIdList), QueryCondition.name((String)"productId").not_in(productIdList)}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductApplyRangeDTOS(schema);
    }

    @Nullable
    private List<ProductDTO> listOldProductDTOS(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (productList != null) {
            for (Map product : productList) {
                if (product.get("productPropCharacterDefineMap") == null || !(product.get("productPropCharacterDefineMap") instanceof String)) continue;
                product.remove("productPropCharacterDefineMap");
            }
            return this.detailReturnProduct(productList);
        }
        return null;
    }

    private List<ProductDTO> detailReturnProduct(List<Map<String, Object>> productList) {
        List productDTOS = JSON.parseArray((String)JSON.toJSONString(productList), ProductDTO.class);
        for (int i = 0; i < productDTOS.size() && i < productList.size(); ++i) {
            if (productList.get(i).get("productPropCharacterDefineMap") == null) continue;
            ((ProductDTO)productDTOS.get(i)).setProductPropCharacterDefineMap((HashMap)productList.get(i).get("productPropCharacterDefineMap"));
        }
        return productDTOS;
    }

    @Nullable
    private List<TaxRevenueDTO> listTaxRevenueDTOS(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.tax.TaxRevenue", (QuerySchema)schema);
        if (productList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), TaxRevenueDTO.class);
        }
        return null;
    }

    @Nullable
    private ProductDTO getProductDTO(QuerySchema schema) throws Exception {
        Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
        if (productMap != null && !productMap.isEmpty()) {
            ProductDTO productDTO = (ProductDTO)JSON.parseObject((String)JSON.toJSONString((Object)productMap), ProductDTO.class);
            productDTO.setProductPropCharacterDefineMap((HashMap)productMap.get("productPropCharacterDefineMap"));
            return productDTO;
        }
        return null;
    }

    @Nullable
    private List<ProductApplyRangeDTO> listOldProductApplyRangeDTOS(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (productList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProductApplyRangeDTO.class);
        }
        return null;
    }

    @Nullable
    private List<ProductApplyRangeDTO> listProductApplyRangeDTOS(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)schema);
        if (productList != null) {
            productList.stream().forEach(product -> {
                if (product.get("productOrgId") != null && product.get("orgId") != null && product.get("productOrgId").toString().equals(product.get("orgId").toString())) {
                    product.put("isCreator", true);
                    product.put("isApplied", true);
                } else if (product.get("productOrgId") != null && product.get("orgId") != null && !product.get("productOrgId").toString().equals(product.get("orgId").toString())) {
                    product.put("isCreator", false);
                    if ("0".equals(product.get("orgGroupType"))) {
                        product.put("isApplied", false);
                    } else if ("1".equals(product.get("orgGroupType"))) {
                        product.put("isApplied", true);
                    }
                }
            });
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProductApplyRangeDTO.class);
        }
        return null;
    }

    @Nullable
    private List<ProductApplyRangeDTO> listMaterialRangeByConditionGroup(QueryConditionGroup queryConditionGroup) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"productId", "isCreator", "isApplied", "productDetailId", "orgId", "id"}).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)productList)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProductApplyRangeDTO.class);
        }
        return null;
    }

    @Nullable
    private List<ProductAsistUnitDTO> listProductUnitDTOS(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)schema);
        if (productList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProductAsistUnitDTO.class);
        }
        return null;
    }

    @Nullable
    private List<ProductAsistUnitDTO> listProductUnitDTOSByProduct(QuerySchema schema) throws Exception {
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (productList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productList), ProductAsistUnitDTO.class);
        }
        return null;
    }

    private List<ProductAsistUnitDTO> listProduct4UseTemplateUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        if (null != assistUnitId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate.productTplAssistUnitExchanges.assistUnit").in(new Object[]{assistUnitId}));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("id", "productId"), new QueryField("unit", "unit"), new QueryField("unit.code", "unitCode"), new QueryField("unit.name", "unitName"), new QueryField("unit.precision", "unitPrecision"), new QueryField("unit.truncationType", "unitTruncationType"), new QueryField("productTemplate.productTplAssistUnitExchanges.unitExchangeType", "unitExchangeType"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnitCount", "assistUnitCount"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit", "assistUnit"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.code", "assistUnitCode"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.name", "assistUnitName"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.precision", "assistUnitPrecision"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.truncationType", "assistUnitTruncationType"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.convertCoefficient", "assistUnitConvertCoefficient"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitCount", "mainUnitCount"), new QueryField("enableAssistUnit", "enableAssistUnit"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitCountNew", "mainUnitCountNew"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitRate", "mainUnitRate"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistVersValue", "assistVerValue")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductUnitDTOSByProduct(schema);
    }

    private List<ProductAsistUnitDTO> listProduct4UseProductUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        if (null != assistUnitId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productAssistUnitExchanges.assistUnit").in(new Object[]{assistUnitId}));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("id", "productId"), new QueryField("unit", "unit"), new QueryField("unit.code", "unitCode"), new QueryField("unit.name", "unitName"), new QueryField("unit.precision", "unitPrecision"), new QueryField("unit.truncationType", "unitTruncationType"), new QueryField("productAssistUnitExchanges.unitExchangeType", "unitExchangeType"), new QueryField("productAssistUnitExchanges.assistUnitCount", "assistUnitCount"), new QueryField("productAssistUnitExchanges.assistUnit", "assistUnit"), new QueryField("productAssistUnitExchanges.assistUnit.code", "assistUnitCode"), new QueryField("productAssistUnitExchanges.assistUnit.name", "assistUnitName"), new QueryField("productAssistUnitExchanges.assistUnit.precision", "assistUnitPrecision"), new QueryField("productAssistUnitExchanges.assistUnit.truncationType", "assistUnitTruncationType"), new QueryField("productAssistUnitExchanges.assistUnit.convertCoefficient", "assistUnitConvertCoefficient"), new QueryField("productAssistUnitExchanges.mainUnitCount", "mainUnitCount"), new QueryField("enableAssistUnit", "enableAssistUnit"), new QueryField("productAssistUnitExchanges.mainUnitCountNew", "mainUnitCountNew"), new QueryField("productAssistUnitExchanges.mainUnitRate", "mainUnitRate"), new QueryField("productAssistUnitExchanges.assistVersValue", "assistVerValue")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductUnitDTOSByProduct(schema);
    }

    private List<ProductAsistUnitDTO> listProduct4UseTemplateAsistUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        if (null != assistUnitId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate.productTplAssistUnitExchanges.assistUnit").in(new Object[]{assistUnitId}));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("id", "productId"), new QueryField("productTemplate.productTplAssistUnitExchanges.unitExchangeType", "unitExchangeType"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnitCount", "assistUnitCount"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit", "assistUnit"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.code", "assistUnitCode"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.name", "assistUnitName"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.precision", "assistUnitPrecision"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.convertCoefficient", "assistUnitConvertCoefficient"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitCount", "mainUnitCount"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistUnit.truncationType", "assistUnitTruncationType"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitCountNew", "mainUnitCountNew"), new QueryField("productTemplate.productTplAssistUnitExchanges.mainUnitRate", "mainUnitRate"), new QueryField("productTemplate.productTplAssistUnitExchanges.assistVersValue", "assistVerValue"), new QueryField("productTemplate.productTplAssistUnitExchanges.balance", "balance")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductUnitDTOSByProduct(schema);
    }

    private List<ProductAsistUnitDTO> listProduct4UseProductAsistUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        if (null != assistUnitId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productAssistUnitExchanges.assistUnit").in(new Object[]{assistUnitId}));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("id", "productId"), new QueryField("productAssistUnitExchanges.unitExchangeType", "unitExchangeType"), new QueryField("productAssistUnitExchanges.assistUnitCount", "assistUnitCount"), new QueryField("productAssistUnitExchanges.assistUnit", "assistUnit"), new QueryField("productAssistUnitExchanges.assistUnit.code", "assistUnitCode"), new QueryField("productAssistUnitExchanges.assistUnit.name", "assistUnitName"), new QueryField("productAssistUnitExchanges.assistUnit.precision", "assistUnitPrecision"), new QueryField("productAssistUnitExchanges.assistUnit.convertCoefficient", "assistUnitConvertCoefficient"), new QueryField("productAssistUnitExchanges.mainUnitCount", "mainUnitCount"), new QueryField("productAssistUnitExchanges.assistUnit.truncationType", "assistUnitTruncationType"), new QueryField("productAssistUnitExchanges.mainUnitCountNew", "mainUnitCountNew"), new QueryField("productAssistUnitExchanges.mainUnitRate", "mainUnitRate"), new QueryField("productAssistUnitExchanges.assistVersValue", "assistVerValue"), new QueryField("productAssistUnitExchanges.balance", "balance")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryConditionGroup}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listProductUnitDTOSByProduct(schema);
    }

    @Override
    public List<ProductAsistUnitDTO> listProductUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIdList});
        productIdList = productIdList.stream().map(Long::valueOf).collect(Collectors.toList());
        List<ProductAsistUnitDTO> result = new ArrayList<ProductAsistUnitDTO>();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        QuerySchema unitUseTypeSchema = QuerySchema.create().addSelect(new String[]{"id", "unitUseType", "productTemplate"}).addCondition((ConditionExpression)queryConditionGroup);
        List productDTOList = this.listProductDTOS(unitUseTypeSchema);
        if (!CollectionUtils.isEmpty((Collection)productDTOList)) {
            List<Long> productIds4UseTemplate = productDTOList.stream().filter(product -> UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().intValue()).map(ProductDTO::getId).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(productIds4UseTemplate)) {
                List<Long> productIds4UseProduct = productIdList.stream().filter(productId -> !productIds4UseTemplate.contains(productId)).collect(Collectors.toList());
                result.addAll(this.listProduct4UseTemplateUnit(productIds4UseTemplate, assistUnitId));
                if (!CollectionUtils.isEmpty(productIds4UseProduct)) {
                    result.addAll(this.listProduct4UseProductUnit(productIds4UseProduct, assistUnitId));
                }
            } else {
                result = this.listProduct4UseProductUnit(productIdList, assistUnitId);
            }
        }
        return result;
    }

    @Override
    public List<ProductAsistUnitDTO> listProductAsistUnit(List<Long> productIdList, Long assistUnitId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIdList});
        productIdList = productIdList.stream().collect(Collectors.toList());
        List<ProductAsistUnitDTO> result = new ArrayList<ProductAsistUnitDTO>();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIdList)});
        QuerySchema unitUseTypeSchema = QuerySchema.create().addSelect(new String[]{"id", "unitUseType", "productTemplate"}).addCondition((ConditionExpression)queryConditionGroup);
        List productDTOList = this.listProductDTOS(unitUseTypeSchema);
        if (!CollectionUtils.isEmpty((Collection)productDTOList)) {
            List<Long> productIds4UseTemplate = productDTOList.stream().filter(product -> UnitUseTypeEnum.USE_TIMPLATE.getValue() == product.getUnitUseType().intValue()).map(ProductDTO::getId).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(productIds4UseTemplate)) {
                List<Long> productIds4UseProduct = productIdList.stream().filter(productId -> !productIds4UseTemplate.contains(productId)).collect(Collectors.toList());
                result.addAll(this.listProduct4UseTemplateAsistUnit(productIds4UseTemplate, assistUnitId));
                if (!CollectionUtils.isEmpty(productIds4UseProduct)) {
                    result.addAll(this.listProduct4UseProductAsistUnit(productIds4UseProduct, assistUnitId));
                }
            } else {
                result = this.listProduct4UseProductAsistUnit(productIdList, assistUnitId);
            }
        }
        return result;
    }

    @Override
    public Set<Long> listSubPartProductByOrgId(Long orgId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRange.productDetailId.keySubPart").eq((Object)true)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && null != orgId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId.toString()));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (productList != null && productList.size() > 0) {
            HashSet<Long> productIds = new HashSet<Long>(productList.size());
            productList.stream().forEach(productMap -> {
                if (productMap.get("id") != null) {
                    productIds.add((Long)productMap.get("id"));
                }
            });
            return productIds;
        }
        return null;
    }

    @Override
    public Set<String> listSubPartProductByOrgId(String orgId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRange.productDetailId.keySubPart").eq((Object)true)});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        if (!orgGlobalShare.booleanValue() && null != orgId) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").eq((Object)orgId));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (productList != null && productList.size() > 0) {
            HashSet<String> productIds = new HashSet<String>(productList.size());
            productList.stream().forEach(productMap -> {
                if (productMap.get("id") != null) {
                    productIds.add(productMap.get("id").toString());
                }
            });
            return productIds;
        }
        return null;
    }

    @Override
    public List<ProductAsistUnitDTO> listProductTplUnit(Long templateId, List<Long> unitIds) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{templateId});
        UpcAPiTool.checkPara((List[])new List[]{unitIds});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)templateId), QueryCondition.name((String)"unit").in(unitIds)});
        QueryField[] qryFields = new QueryField[]{new QueryField("template", "template"), new QueryField("unit", "unit"), new QueryField("unit.code", "unitCode"), new QueryField("unit.name", "unitName"), new QueryField("unit.precision", "unitPrecision"), new QueryField("unit.truncationType", "unitTruncationType")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productUnitList = MetaDaoHelper.query((String)"pc.tpl.ProductTplUnit", (QuerySchema)schema);
        if (productUnitList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productUnitList), ProductAsistUnitDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTagDTO> listProductTagByProductId(Long productId, Long skuId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = null;
        if (null != productId) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isCreator").eq((Object)1));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("productId", "productId"), new QueryField("tagId", "tagId")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productTagList = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)schema);
        if (productTagList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productTagList), ProductTagDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductSecDTO> listProductSpec(String specName, Boolean isShowSpec) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec")});
        if (null != specName) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"showItem").eq((Object)specName)});
        }
        if (null != isShowSpec) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isShowSpec").eq((Object)isShowSpec)});
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("productId", "productId"), new QueryField("tagId", "tagId")};
        QuerySchema schema = QuerySchema.create().addSelect("name,defineId,item,type,showItem,length,maxInputLen,decimalDigits,isMultiSel,isShowSpec").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productUnitList = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        if (productUnitList != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productUnitList), ProductSecDTO.class);
        }
        return null;
    }

    @Override
    public List<TaxRevenueDTO> getTaxRevenueByCode(List<String> taxRevenueCodeList, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.taxRevenueFieldMap, (String[])field);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (taxRevenueCodeList != null && taxRevenueCodeList.size() > 0 && taxRevenueCodeList.size() <= UpcAPiTool.List_LENGTH) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(taxRevenueCodeList));
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listTaxRevenueDTOS(schema);
    }

    @Override
    public List<ProductAttachDTO> listProductAttach(List<Long> productIdList, Integer type) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{productIdList});
        String fileAttriName = null;
        String entryName = null;
        switch (type) {
            case 1: {
                entryName = "pc.product.ProductAlbum";
                fileAttriName = "imgName";
                break;
            }
            case 2: 
            case 3: {
                entryName = "pc.product.ProductAttachment";
                fileAttriName = "fileName";
                break;
            }
            default: {
                entryName = null;
            }
        }
        if (this.isOpenCooperation) {
            List ids = productIdList.stream().map(id -> String.valueOf(id)).collect(Collectors.toList());
            ArrayList<ProductAttachDTO> productAttachments = new ArrayList<ProductAttachDTO>();
            if (type == 1) {
                CoreDocJsonResult attachments = this.attachmentTransService.getAttachmentByTypeAndIds(AttachmentBusinessTypeEnum.PRODUCT_ALL_IMAGE, ids);
                if (attachments.isSuccess() && !CollectionUtils.isEmpty((Collection)attachments.getData())) {
                    List<ProductAttachDTO> attachDTOS = this.convertProductAttachDTO(attachments.getData());
                    productAttachments.addAll(attachDTOS);
                }
            } else if (type == 3) {
                CoreDocJsonResult attachments;
                CoreDocJsonResult videoAttachments = this.attachmentTransService.getAttachmentByTypeAndIds(AttachmentBusinessTypeEnum.PRODUCT_VIDEO, ids);
                if (videoAttachments.isSuccess() && !CollectionUtils.isEmpty((Collection)videoAttachments.getData())) {
                    List<ProductAttachDTO> attachDTOS = this.convertProductAttachDTO(videoAttachments.getData());
                    productAttachments.addAll(attachDTOS);
                }
                if ((attachments = this.attachmentTransService.getAttachmentByTypeAndIds(AttachmentBusinessTypeEnum.PRODUCT_ATTACHMENT, ids)).isSuccess() && !CollectionUtils.isEmpty((Collection)attachments.getData())) {
                    List<ProductAttachDTO> attachDTOS = this.convertProductAttachDTO(attachments.getData());
                    productAttachments.addAll(attachDTOS);
                }
            }
            return productAttachments;
        }
        if (entryName != null) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIdList)});
            QueryField[] qryFields = new QueryField[]{new QueryField("productId", "productId"), new QueryField(fileAttriName, "fileName"), new QueryField("folder", "folder"), new QueryField("sort", "sort"), new QueryField("type", "type"), new QueryField("size", "size")};
            QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
            schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
            List productAttachList = MetaDaoHelper.query((String)entryName, (QuerySchema)schema);
            if (productAttachList != null) {
                return JSON.parseArray((String)JSON.toJSONString((Object)productAttachList), ProductAttachDTO.class);
            }
        }
        return null;
    }

    private List<ProductAttachDTO> convertProductAttachDTO(List<AttachmentInfoCollectDTO> attachmentInfoCollectDTOList) {
        ArrayList<ProductAttachDTO> attachDTOS = new ArrayList<ProductAttachDTO>();
        for (AttachmentInfoCollectDTO attachmentInfoCollectDTO : attachmentInfoCollectDTOList) {
            for (AttachmentInfoDTO attachmentInfoDTO : attachmentInfoCollectDTO.getAttachmentInfoDTOList()) {
                ProductAttachDTO productAttach = new ProductAttachDTO();
                productAttach.setProductId(Long.valueOf(attachmentInfoDTO.getBusinessId()));
                productAttach.setFolder(attachmentInfoDTO.getDownloadUrl());
                productAttach.setFileName(attachmentInfoDTO.getName());
                attachDTOS.add(productAttach);
            }
        }
        return attachDTOS;
    }

    @Override
    public List<PresentationClassDTO> getTemplateIdByPresentationId(List<Long> presentationClassIds, String[] fields) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{presentationClassIds});
        UpcAPiTool.checkPara((String[])fields);
        QueryField[] queryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])fields);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(presentationClassIds)});
        QuerySchema querySchema = QuerySchema.create().addSelect(queryFields).addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        for (String field : fields) {
            if ("image".equals(field)) {
                querySchema.addSelect("imageBusinessId");
                continue;
            }
            if (!"adImage".equals(field)) continue;
            querySchema.addSelect("adImageBusinessId");
        }
        List presentationClass = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)querySchema);
        if (presentationClass != null) {
            this.queryAndSetPresentationAttachments(presentationClass);
            return JSON.parseArray((String)JSON.toJSONString((Object)presentationClass), PresentationClassDTO.class);
        }
        return null;
    }

    private void queryAndSetPresentationAttachments(List<Map<String, Object>> presentationList) {
        if (!this.isOpenCooperation) {
            return;
        }
        for (Map<String, Object> presentation : presentationList) {
            List adImageBusinessId;
            List imageBusinessId;
            if (presentation.containsKey("imageBusinessId") && !CollectionUtils.isEmpty((Collection)(imageBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", presentation.get("imageBusinessId").toString(), 1, 50)))) {
                presentation.put("image", ((CooperationFileInfo)imageBusinessId.get(0)).getBucketUrl());
            }
            if (!presentation.containsKey("adImageBusinessId") || CollectionUtils.isEmpty((Collection)(adImageBusinessId = this.cooperationFileService.queryFileList("iuap-apdoc-material", presentation.get("adImageBusinessId").toString(), 1, 50)))) continue;
            presentation.put("adImage", ((CooperationFileInfo)adImageBusinessId.get(0)).getBucketUrl());
        }
    }

    @Override
    public List<PresentationClassDTO> getPresentationByQryDTO(PresentationClassQryDTO presentationClassQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)presentationClassQryDTO, (Map)ProductAPIUtils.presentationClassMap);
        if (queryConditionGroup == null) {
            queryConditionGroup = new QueryConditionGroup();
        }
        if (StringUtils.isNotBlank((CharSequence)presentationClassQryDTO.getCodeOrName())) {
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)presentationClassQryDTO.getCodeOrName()), QueryCondition.name((String)"name").eq((Object)presentationClassQryDTO.getCodeOrName())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (StringUtils.isNotBlank((CharSequence)presentationClassQryDTO.getLeftPathFuzzy())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").left_like((Object)presentationClassQryDTO.getLeftPathFuzzy()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])presentationClassQryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        if (queryConditionGroup != null) {
            schema.addCondition((ConditionExpression)queryConditionGroup);
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        for (String field : presentationClassQryDTO.getFields()) {
            if ("image".equals(field)) {
                schema.addSelect("imageBusinessId");
                continue;
            }
            if (!"adImage".equals(field)) continue;
            schema.addSelect("adImageBusinessId");
        }
        List presentationClass = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)presentationClass)) {
            this.presentationClassService.batchQueryAndSetPresentationAttachments(presentationClass);
            return JSON.parseArray((String)JSON.toJSONString((Object)presentationClass), PresentationClassDTO.class);
        }
        return null;
    }

    @Override
    public List<PresentationClassDTO> getPresentationDataPermission(PresentationClassQryDTO presentationClassQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)presentationClassQryDTO, (Map)ProductAPIUtils.presentationClassMap);
        if (queryConditionGroup == null) {
            queryConditionGroup = new QueryConditionGroup();
        }
        if (StringUtils.isNotBlank((CharSequence)presentationClassQryDTO.getCodeOrName())) {
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)presentationClassQryDTO.getCodeOrName()), QueryCondition.name((String)"name").eq((Object)presentationClassQryDTO.getCodeOrName())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (StringUtils.isNotBlank((CharSequence)presentationClassQryDTO.getLeftPathFuzzy())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").left_like((Object)presentationClassQryDTO.getLeftPathFuzzy()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.presentationClassMap, (String[])presentationClassQryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        List<Long> ids = ProductUtil.getDataPermission("pc.cls.PresentationClass");
        if (!CollectionUtils.isEmpty(ids)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(ids));
        }
        if (queryConditionGroup != null) {
            schema.addCondition((ConditionExpression)queryConditionGroup);
        } else {
            schema.addPager(UpcAPiTool.DEFAULT_PAGE_INDEX.intValue(), UpcAPiTool.PAGE_MAX_SIZE.intValue());
        }
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        for (String field : presentationClassQryDTO.getFields()) {
            if ("image".equals(field)) {
                schema.addSelect("imageBusinessId");
                continue;
            }
            if (!"adImage".equals(field)) continue;
            schema.addSelect("adImageBusinessId");
        }
        List presentationClass = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)presentationClass)) {
            this.presentationClassService.batchQueryAndSetPresentationAttachments(presentationClass);
            return JSON.parseArray((String)JSON.toJSONString((Object)presentationClass), PresentationClassDTO.class);
        }
        return null;
    }

    @Override
    public SyncProductAuthDTO syncProductAuth(List<SyncProductAuthConditionDTO> syncProductAuthConditionDTOS) throws Exception {
        if (CollectionUtils.isEmpty(syncProductAuthConditionDTOS)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801343);
        }
        ArrayList<Map> data = new ArrayList<Map>();
        for (SyncProductAuthConditionDTO dto : syncProductAuthConditionDTOS) {
            Map stringStringMap = (Map)JSON.parseObject((String)JSON.toJSONString((Object)dto), (TypeReference)new TypeReference<Map<String, String>>(){}, (Feature[])new Feature[0]);
            data.add(stringStringMap);
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setData(data);
        billDataDto.setBillnum("pc_product");
        Map<String, String> result = this.productApiService.syncUOrderProductAuthorization(billDataDto);
        SyncProductAuthDTO syncProductAuthDTO = new SyncProductAuthDTO();
        syncProductAuthDTO.setMsg(result.get("msg"));
        return syncProductAuthDTO;
    }

    @Override
    public List<CostClassDTO> listCostClass(CostClassQryDTO qryDTO) throws Exception {
        QueryConditionGroup queryConditionGroup;
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null && qryDTO.getFields() != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801296);
        }
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass");
        if (orgGlobalShare.booleanValue()) {
            if (qryDTO.getCreateOrgId() != null) {
                qryDTO.setCreateOrgId(null);
            }
            if (qryDTO.getOrgId() != null) {
                qryDTO.setOrgId(null);
            }
            if (qryDTO.getCreateOrgIdList() != null) {
                qryDTO.setCreateOrgIdList(null);
            }
            if (qryDTO.getOrgIdList() != null) {
                qryDTO.setOrgIdList(null);
            }
        }
        if ((queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)ProductAPIUtils.costClassFieldMap)) == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)ProductAPIUtils.costClassFieldMap, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List costClass = MetaDaoHelper.query((String)"pc.cls.CostClass", (QuerySchema)schema);
        if (costClass != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)costClass), CostClassDTO.class);
        }
        return null;
    }

    @Override
    public List<ProductTplDTO> listProductTpl(List<Long> productTplIdList) throws Exception {
        Long[] ids = productTplIdList.toArray(new Long[productTplIdList.size()]);
        List productTplList = MetaDaoHelper.queryByIds((String)"pc.tpl.ProductTpl", (String)"id,name,skuBusinessDynamic", (Long[])ids);
        if (productTplList != null && productTplList.size() > 0) {
            return JSON.parseArray((String)JSON.toJSONString((Object)productTplList), ProductTplDTO.class);
        }
        return null;
    }

    @Override
    public List<Long> productEnableSku(List<Long> productId) throws Exception {
        if (productId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801344);
        }
        UpcAPiTool.checkPara((List[])new List[]{productId});
        QueryConditionGroup tplQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productId)});
        QuerySchema tplSchema = QuerySchema.create().addSelect("id,productTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{tplQueryConditionGroup}));
        List tplList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)tplSchema);
        if (CollectionUtils.isEmpty((Collection)tplList)) {
            return new ArrayList<Long>();
        }
        Iterator iterator = tplList.iterator();
        while (iterator.hasNext()) {
            Map next = (Map)iterator.next();
            if (next.get("productTemplate") == null) {
                iterator.remove();
                continue;
            }
            QueryConditionGroup skuSensQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(next.get("productTemplate")), QueryCondition.name((String)"skuSens").eq((Object)1)});
            QuerySchema skuSensSchema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{skuSensQueryConditionGroup}));
            skuSensSchema.addPager(1, 1);
            List skuSens = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)skuSensSchema);
            if (!CollectionUtils.isEmpty((Collection)skuSens)) continue;
            iterator.remove();
        }
        ArrayList<Long> result = new ArrayList<Long>(tplList.size());
        for (Map map : tplList) {
            result.add((Long)map.get("id"));
        }
        return result;
    }

    private Boolean setOldQueryConditionGroupByQryDTO(ProductQryDTO qryDTO, QueryConditionGroup queryConditionGroup) {
        QueryConditionGroup characterConditionGroup;
        List<String> taxClassIdList;
        QueryConditionGroup orContitionGroup;
        QueryConditionGroup orConditionGroup;
        Boolean hasFilterItem = false;
        hasFilterItem = this.removeOrgConditionByGlobalShare(qryDTO);
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductIdNotInList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in((Collection)qryDTO.getProductIdNotInList()));
            hasFilterItem = true;
        }
        if (qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() != null && !CollectionUtils.isEmpty((Collection)qryDTO.getProductIdOrLikeList())) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"model").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdOrLikeList())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        } else if (qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"model").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").like((Object)qryDTO.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (qryDTO.getNameOrCodeOrBarCodeFuzzyValue() != null && !CollectionUtils.isEmpty((Collection)qryDTO.getProductIdOrLikeList())) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"id").in((Collection)qryDTO.getProductIdOrLikeList())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        } else if (qryDTO.getNameOrCodeOrBarCodeFuzzyValue() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.barCode").like((Object)qryDTO.getNameOrCodeOrBarCodeFuzzyValue())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getFuzzyDisplayName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.displayName").like((Object)qryDTO.getFuzzyDisplayName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getFuzzyDisplayNameOrCode())) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyDisplayNameOrCode()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyDisplayNameOrCode()), QueryCondition.name((String)"productApplyRange.productDetailId.displayName").like((Object)qryDTO.getFuzzyDisplayNameOrCode())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").like((Object)qryDTO.getProductCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductCodeList() != null && qryDTO.getProductCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getProductCodeList()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductName()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)qryDTO.getProductName()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassIdList() != null && qryDTO.getManagerClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass").in((Collection)qryDTO.getManagerClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassIdNotInList() != null && qryDTO.getManagerClassIdNotInList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass").not_in((Collection)qryDTO.getManagerClassIdNotInList()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductClassPath()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").eq((Object)qryDTO.getProductClassPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassLeftFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").left_like((Object)qryDTO.getProductClassLeftFuzzyPath()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getProductClassFuzzyPath()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.path").like((Object)qryDTO.getProductClassFuzzyPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getAssistClassesLeftFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productAssistClasses.productClassId.path").left_like((Object)qryDTO.getAssistClassesLeftFuzzyPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassOrAssistClassesLeftFuzzyPath() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass.path").left_like((Object)qryDTO.getProductClassOrAssistClassesLeftFuzzyPath()), QueryCondition.name((String)"productAssistClasses.productClassId.path").left_like((Object)qryDTO.getProductClassOrAssistClassesLeftFuzzyPath())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (null != qryDTO.getProductNameList()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").in((Collection)qryDTO.getProductNameList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCodeOrNameFuzzyValue() != null) {
            orContitionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getCodeOrNameFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getCodeOrNameFuzzyValue())});
            queryConditionGroup.addCondition((ConditionExpression)orContitionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getCodeOrNameValue() != null) {
            orContitionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)qryDTO.getCodeOrNameValue()), QueryCondition.name((String)"name").eq((Object)qryDTO.getCodeOrNameValue())});
            queryConditionGroup.addCondition((ConditionExpression)orContitionGroup);
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getShortName()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.shortName").like((Object)qryDTO.getShortName()));
            hasFilterItem = true;
        }
        if (qryDTO.getManagerClassCodeList() != null && qryDTO.getManagerClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").in((Collection)qryDTO.getManagerClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassCodeList() != null && qryDTO.getProductClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass.code").in((Collection)qryDTO.getProductClassCodeList()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getManageClassCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").like((Object)qryDTO.getManageClassCode()));
            hasFilterItem = true;
        }
        if (StringUtils.isNoneBlank((CharSequence[])new CharSequence[]{qryDTO.getManageClassLeftFuzzyCode()})) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manageClass.code").left_like((Object)qryDTO.getManageClassLeftFuzzyCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductLineIdList() != null && qryDTO.getProductLineIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productLine").in((Collection)qryDTO.getProductLineIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductLineIdNotInList() != null && qryDTO.getProductLineIdNotInList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productLine").not_in((Collection)qryDTO.getProductLineIdNotInList()), QueryCondition.name((String)"productLine").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getBrandIdList() != null && qryDTO.getBrandIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"brand").in((Collection)qryDTO.getBrandIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getBrandIdNotINList() != null && qryDTO.getBrandIdNotINList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").not_in((Collection)qryDTO.getBrandIdNotINList()), QueryCondition.name((String)"brand").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass").eq((Object)qryDTO.getCostClassId()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassIdList() != null && qryDTO.getCostClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass").in((Collection)qryDTO.getCostClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass.code").eq((Object)qryDTO.getCostClassCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getCostClassCodeList() != null && qryDTO.getCostClassCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"costClass.code").in((Collection)qryDTO.getCostClassCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassIdList() != null && qryDTO.getProductClassIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productClass").in((Collection)qryDTO.getProductClassIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductClassIdNotInList() != null && qryDTO.getProductClassIdNotInList().size() > 0) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productClass").not_in((Collection)qryDTO.getProductClassIdNotInList()), QueryCondition.name((String)"productClass").is_null()});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").eq((Object)qryDTO.getOrgId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getOrgStringList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").in((Collection)qryDTO.getOrgStringList()));
            hasFilterItem = true;
        } else if (qryDTO.getOrgList() != null && qryDTO.getOrgList().size() > 0) {
            ArrayList<String> orgIdStringList = new ArrayList<String>(qryDTO.getOrgList().size());
            for (Long orgId : qryDTO.getOrgList()) {
                if (orgId == null) continue;
                orgIdStringList.add(orgId.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.orgId").in(orgIdStringList));
            hasFilterItem = true;
        }
        if (qryDTO.getProductapplyIdList() != null && qryDTO.getProductapplyIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.id").in((Collection)qryDTO.getProductapplyIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreatorTypeList() != null && qryDTO.getCreatorTypeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creatorType").in((Collection)qryDTO.getCreatorTypeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getIsOil() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creatorType").eq((Object)qryDTO.getIsOil()));
            hasFilterItem = true;
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.stopstatus").eq((Object)qryDTO.getStopStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").eq((Object)qryDTO.getErpCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getErpCodeList() != null && qryDTO.getErpCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").in((Collection)qryDTO.getErpCodeList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductTagList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.productTagNew.tagId").in((Collection)qryDTO.getProductTagList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getShopId())) {
            if (qryDTO.getShopId().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801345);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.shopId").in((Collection)qryDTO.getShopId()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreator() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)qryDTO.getCreator()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getTaxClassCodeList()) && qryDTO.getTaxClassCodeStatusFlag() != null && !qryDTO.getTaxClassCodeStatusFlag().booleanValue()) {
            taxClassIdList = this.getTaxClassificationIdByCodes(qryDTO.getTaxClassCodeList());
            if (!CollectionUtils.isEmpty(taxClassIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"taxClass").not_in(taxClassIdList));
            }
            hasFilterItem = true;
        } else if (!CollectionUtils.isEmpty((Collection)qryDTO.getTaxClassCodeList())) {
            taxClassIdList = this.getTaxClassificationIdByCodes(qryDTO.getTaxClassCodeList());
            if (!CollectionUtils.isEmpty(taxClassIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"taxClass").in(taxClassIdList));
            }
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyValue() != null) {
            orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyValue()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.shortName").like((Object)qryDTO.getFuzzyValue()), QueryCondition.name((String)"productApplyRange.productDetailId.receiptName").like((Object)qryDTO.getFuzzyValue())});
            hasFilterItem = true;
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModelDescription())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"modelDescription").eq((Object)qryDTO.getModelDescription()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModelDescriptionFuzzy())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"modelDescription").like((Object)qryDTO.getModelDescriptionFuzzy()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getModel())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"model").eq((Object)qryDTO.getModel()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getManufacturer())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"manufacturer").eq((Object)qryDTO.getManufacturer()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductAttributed() != null && ProductOldApiUtils.productOriginalAttributeMap.containsKey(qryDTO.getProductAttributed())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)ProductOldApiUtils.productOriginalAttributeMap.get(qryDTO.getProductAttributed())).eq((Object)1));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductapplyIdList())) {
            if (qryDTO.getProductapplyIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801339);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.id").in((Collection)qryDTO.getProductapplyIdList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getProductSpecItemIsSpecItems())) {
            if (qryDTO.getProductSpecItemIsSpecItems().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801340);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productspecitems.lsSpecItems_id").in((Collection)qryDTO.getProductSpecItemIsSpecItems()));
            hasFilterItem = true;
        }
        if (qryDTO.getRecommendedMaterials() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isRecommend").eq((Object)qryDTO.getRecommendedMaterials()));
            hasFilterItem = true;
        }
        if (qryDTO.getPlatFormStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"platFormStaus").eq((Object)qryDTO.getPlatFormStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getSaleChannelOfOnlineBatch() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.saleChannelOfOnlineBatch").eq((Object)qryDTO.getSaleChannelOfOnlineBatch()));
            hasFilterItem = true;
        }
        if (qryDTO.getMktUOrderStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.iUOrderStatus").eq((Object)qryDTO.getMktUOrderStatus()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getRealProductAttributeType())) {
            if (qryDTO.getRealProductAttributeType().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801341);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"realProductAttributeType").in((Collection)qryDTO.getRealProductAttributeType()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getVirtualProductAttribute())) {
            if (qryDTO.getVirtualProductAttribute().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801342);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"virtualProductAttribute").in((Collection)qryDTO.getVirtualProductAttribute()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductTemplate() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productTemplate").eq((Object)qryDTO.getProductTemplate()));
            hasFilterItem = true;
        }
        if (qryDTO.getSaleInOfflineStore() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isSaleInOfflineStore").eq((Object)qryDTO.getSaleInOfflineStore()));
            hasFilterItem = true;
        }
        if (qryDTO.getCouponId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"couponId").eq((Object)qryDTO.getCouponId()));
            hasFilterItem = true;
        }
        if (qryDTO.getMnemonicCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.mnemonicCode").eq((Object)qryDTO.getMnemonicCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreatorCustomer() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"cust").eq((Object)qryDTO.getCreatorCustomer()));
            hasFilterItem = true;
        }
        if (qryDTO.getOfflineStoreOrder() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isOfflineStoreOrder").eq((Object)qryDTO.getOfflineStoreOrder()));
            hasFilterItem = true;
        }
        if (qryDTO.getCheckFree() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isCheckFree").eq((Object)qryDTO.getCheckFree()));
            hasFilterItem = true;
        }
        if (qryDTO.getProcess() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isProcess").eq((Object)qryDTO.getProcess()));
            hasFilterItem = true;
        }
        if (qryDTO.getStockSerialNoManage() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.isSerialNoManage").eq((Object)qryDTO.getStockSerialNoManage()));
            hasFilterItem = true;
        }
        if (qryDTO.getGtOrderUpCount() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.uorderupcount").gt((Object)qryDTO.getGtOrderUpCount()));
            hasFilterItem = true;
        }
        if (qryDTO.getManufacturePlanner() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.manufacturePlanner").eq((Object)qryDTO.getManufacturePlanner()));
            hasFilterItem = true;
        }
        if (qryDTO.getPlanClass() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.planClass").eq((Object)qryDTO.getPlanClass()));
            hasFilterItem = true;
        }
        if (qryDTO.getInventoryPlanStrategy() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.productDetailId.inventoryPlanStrategy").eq((Object)qryDTO.getInventoryPlanStrategy()));
            hasFilterItem = true;
        }
        if (qryDTO.getProductCharacterDef() != null && !qryDTO.getProductCharacterDef().isEmpty()) {
            characterConditionGroup = UpcAPiTool.buildCharacterAccurateQueryCondition((Map)qryDTO.getProductCharacterDef(), (String)"productCharacterDef");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getProductPropCharacterDefine() != null && !qryDTO.getProductPropCharacterDefine().isEmpty()) {
            characterConditionGroup = UpcAPiTool.buildCharacterAccurateQueryCondition((Map)qryDTO.getProductPropCharacterDefine(), (String)"productPropCharacterDefine");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getProductExtendCharacterDef() != null && !qryDTO.getProductExtendCharacterDef().isEmpty()) {
            characterConditionGroup = UpcAPiTool.buildCharacterAccurateQueryCondition((Map)qryDTO.getProductExtendCharacterDef(), (String)"productApplyRange.productDetailId.productExtendCharacterDef");
            queryConditionGroup.addCondition((ConditionExpression)characterConditionGroup);
            hasFilterItem = true;
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDeleted").eq((Object)qryDTO.getDeleteFlag()));
        return hasFilterItem;
    }

    private List<String> getTaxClassificationIdByCodes(List<String> taxClassificationCodes) {
        ArrayList<String> taxClassificationIdList = new ArrayList<String>();
        try {
            List taxRevenueDTOList = this.taxRevenueService.getTaxRevenueByCode(taxClassificationCodes, new String[]{"id"});
            if (!CollectionUtils.isEmpty((Collection)taxRevenueDTOList)) {
                for (com.yonyou.einvoice.dto.taxrevenue.TaxRevenueDTO taxRevenueDTO : taxRevenueDTOList) {
                    taxClassificationIdList.add(taxRevenueDTO.getId().toString());
                }
            }
        }
        catch (Exception e) {
            log.error("\u6839\u636e\u7a0e\u7c7b\u7f16\u7801\u83b7\u53d6ID\u5f02\u5e38", (Throwable)e);
        }
        return taxClassificationIdList;
    }

    void setProductDerivative(String[] fields, QuerySchema schema) {
        block10: for (String filed : fields) {
            if ("productParams".equals(filed)) {
                schema.addCompositionSchema(QuerySchema.create().name("productParams").fullname("pc.product.ProductParameters").addSelect("productId, productApplyRangeId,param,paramValue"));
            } else if ("productspecitems".equals(filed)) {
                schema.addCompositionSchema(QuerySchema.create().name("productspecitems").fullname("pc.product.ProductSpecItem").addSelect("productId, haveImg, iOrder as order, iSpecId as specId, lsSpecItems_id as lsSpecItemsId, specValue as specValue"));
            }
            if (!this.isOpenCooperation) {
                if ("productAlbums".equals(filed)) {
                    schema.addCompositionSchema(QuerySchema.create().name("productAlbums").fullname("pc.product.ProductAlbum").addSelect("productId, folder, imgName, sort, type, size"));
                    continue;
                }
                if (!"productAttachments".equals(filed)) continue;
                schema.addCompositionSchema(QuerySchema.create().name("productAttachments").fullname("pc.product.ProductAttachment").addSelect("productId, folder, fileName, sort, type, size"));
                continue;
            }
            switch (filed) {
                case "url": {
                    schema.addSelect("homepageBusinessId");
                    continue block10;
                }
                case "productAlbums": {
                    schema.addSelect("imgBusinessId, homepageBusinessId");
                    continue block10;
                }
                case "productAttachments": {
                    schema.addSelect("videoBusinessId, id as attachments");
                    continue block10;
                }
            }
        }
    }

    @Override
    public boolean existShopProdutApplyRangeInfo(Long customerId) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("orgId", customerId);
        paramMap.put("ytenant_id", AppContext.getYTenantId());
        paramMap.put("orgType", 3);
        Long count = (Long)SqlHelper.selectFirst((String)"com.yonyoucloud.upc.rpc.ProductDaoImpl.existShopProdutApplyRangeInfo", paramMap);
        return count > 0L;
    }

    @Override
    public HashMap<Long, List<UserDefineDTO>> getSensitiveByProductAndType(List<Long> productIds, int sensitiveType) throws Exception {
        HashMap<Long, List<UserDefineDTO>> productFreeDTOMap = new HashMap<Long, List<UserDefineDTO>>();
        QueryConditionGroup checkFreeQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"freeType").eq((Object)sensitiveType), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema schema = QuerySchema.create().addSelect("productId,freeId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{checkFreeQueryConditionGroup}));
        List checkFreeList = MetaDaoHelper.query((String)"pc.product.ProductCheckFreeNew", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)checkFreeList)) {
            List productCheckFreeExtendList = JSON.parseArray((String)JSON.toJSONString((Object)checkFreeList), ProductCheckFreeExtend.class);
            ArrayList freeIdList = new ArrayList();
            HashMap<Long, List> productFreeMap = new HashMap<Long, List>();
            productCheckFreeExtendList.forEach(productCheckFreeExtend -> {
                Long productId = productCheckFreeExtend.getProductId();
                Long freeId = productCheckFreeExtend.getFreeId();
                ArrayList<Long> freeList = (ArrayList<Long>)productFreeMap.get(productId);
                if (freeList == null) {
                    freeList = new ArrayList<Long>();
                    freeList.add(freeId);
                }
                freeIdList.add(freeId);
                productFreeMap.put(productId, freeIdList);
            });
            schema = QuerySchema.create().addSelect("id,defineId,showItem").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(freeIdList)}));
            List userdefineList = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
            HashMap freeMap = new HashMap();
            if (userdefineList != null && userdefineList.size() > 0) {
                List userDefineDTOList = JSON.parseArray((String)JSON.toJSONString((Object)userdefineList), UserDefineDTO.class);
                userDefineDTOList.forEach(userDefineDTO -> freeMap.put(userDefineDTO.getId(), userDefineDTO));
            }
            productFreeMap.forEach((productId, freeIds) -> {
                ArrayList defineList = new ArrayList();
                freeIds.forEach(freeId -> {
                    UserDefineDTO userDefineDTO = (UserDefineDTO)freeMap.get(freeId);
                    defineList.add(userDefineDTO);
                });
                productFreeDTOMap.put((Long)productId, defineList);
            });
        }
        return productFreeDTOMap;
    }

    @Override
    public List<Map<String, Object>> getSKUByProductIdList(List<Long> productIdList, Integer isDeleted, Boolean skuBusinessDynamic, Integer isSKU) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{productIdList});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIdList)});
        if (!Objects.isNull(isDeleted)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isDeleted").eq((Object)isDeleted)}));
        }
        if (!Objects.isNull(skuBusinessDynamic)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId.productTemplate.skuBusinessDynamic").eq((Object)skuBusinessDynamic)}));
        }
        if (!Objects.isNull(isSKU)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isSKU").eq((Object)isSKU)}));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("productId", "productId"), new QueryField("id", "skuid"), new QueryField("name", "skuName"), new QueryField("code", "skuCode"), new QueryField("skuFreeCharacter", "skuFreeCharacter"), new QueryField("isSKU", "isSKU")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List productSkuList = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (productSkuList != null) {
            return productSkuList;
        }
        return null;
    }

    @Override
    public ProductAsistUnitDTO getProductAsistUnit(Long productId, Long unitId) throws Exception {
        if (productId == null || unitId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801346);
        }
        ArrayList<Long> productIds = new ArrayList<Long>();
        productIds.add(productId);
        List<ProductAsistUnitDTO> productAsistUnitDTOList = this.listProductAsistUnit(productIds, unitId);
        if (productAsistUnitDTOList != null && productAsistUnitDTOList.size() > 0) {
            return productAsistUnitDTOList.get(0);
        }
        return new ProductAsistUnitDTO();
    }

    public List<ProductBusiUnitDTO> getProductAsistUnit(List<Long> productIds, String orgId) throws Exception {
        ArrayList<ProductBusiUnitDTO> productBusiUnitDTOList = null;
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        List<ProductDTO> productDTOList = this.getProductByIdsAndOrg(productIds, orgId, new String[]{"upuPurchaseUnit", "upuPurchasePriceUnit", "stockStockUnit", "edProduceUnit", "inspectionUnit", "mktBatchUnit", "mktRequireUnit", "mktBatchPriceUnit", "demandPlanningUnit", "mktOnlineUnit", "mktOfflineUnit", "id", "enableAssistUnit", "unitId", "unitCode", "unitName", "unitConvertCoefficient", "unitConvertCoefficient", "unitPrecision", "unitUseType", "productTemplate", "unitTruncationType"});
        if (productDTOList != null && productDTOList.size() > 0) {
            productBusiUnitDTOList = new ArrayList<ProductBusiUnitDTO>();
            List<ProductAsistUnitDTO> productAsistUnitDTOList = this.listProductAsistUnit(productIds, null);
            Map<String, ProductAsistUnitDTO> productDTOMap = productAsistUnitDTOList.stream().collect(Collectors.toMap(productAsistUnitDTO -> productAsistUnitDTO.getProductId() + "-" + productAsistUnitDTO.getAssistUnit(), productAsistUnitDTO -> productAsistUnitDTO, (existing, replacement) -> existing));
            Map<Long, List<ProductAsistUnitDTO>> productAsistDTOMap = productAsistUnitDTOList.stream().collect(Collectors.groupingBy(ProductAsistUnitDTO::getProductId));
            ArrayList<Long> productTplList = new ArrayList<Long>();
            HashMap<Long, Long> productTplMap = new HashMap<Long, Long>();
            ArrayList<ProductDTO> productTplDTOList = new ArrayList<ProductDTO>();
            for (ProductDTO productDTO : productDTOList) {
                if (UnitUseTypeEnum.USE_TIMPLATE.getValue() == productDTO.getUnitUseType().intValue() && null != productDTO.getProductTemplate()) {
                    productTplList.add(productDTO.getProductTemplate());
                    productTplMap.put(productDTO.getId(), productDTO.getProductTemplate());
                    productTplDTOList.add(productDTO);
                    continue;
                }
                ProductAsistUnitDTO asistUnitDTO = ProductServiceImpl.getAsistUnitDTOFromMainUnit(productDTO);
                ProductBusiUnitDTO productBusiUnitDTO = this.getProductBusiUnitDTO(productDTO, asistUnitDTO, productDTOMap, false);
                if (BooleanUtil.isTrue((Object)productDTO.getEnableAssistUnit())) {
                    productBusiUnitDTO.setAssistUnitDTOList(productAsistDTOMap.get(productDTO.getId()));
                } else {
                    productAsistUnitDTOList = new ArrayList<ProductAsistUnitDTO>();
                    productAsistUnitDTOList.add(asistUnitDTO);
                    productBusiUnitDTO.setAssistUnitDTOList(productAsistUnitDTOList);
                }
                productBusiUnitDTOList.add(productBusiUnitDTO);
            }
            if (productTplDTOList.size() > 0) {
                HashMap<String, ProductAsistUnitDTO> tplAsisUnitDTOMap;
                List tplUnitDTOList = this.productDerivativeService.listProductTplUnitByTplId(productTplList, new String[]{"template", "unit", "enableAssistUnit", "unitCode", "unitName", "unitPrecision", "unitTruncationType", "unitConvertCoefficient"});
                if (CollectionUtils.isEmpty((Collection)tplUnitDTOList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801632);
                }
                Map<Long, ProductTplUnitDTO> tplUnitDTOMap = tplUnitDTOList.stream().collect(Collectors.toMap(tplUnitDTO -> tplUnitDTO.getTemplate(), tplUnitDTO -> tplUnitDTO));
                List tplAsisUnitDTOList = this.productDerivativeService.listTplAssistUnitExchangeByTplId(productTplList);
                HashMap<Long, ArrayList<ProductAsistUnitDTO>> productTplAsistDTOMap = new HashMap<Long, ArrayList<ProductAsistUnitDTO>>();
                if (tplAsisUnitDTOList != null && tplAsisUnitDTOList.size() > 0) {
                    tplAsisUnitDTOMap = tplAsisUnitDTOList.stream().collect(Collectors.toMap(productAsistUnitDTO -> productAsistUnitDTO.getTemplate() + "-" + productAsistUnitDTO.getAssistUnit(), productAsistUnitDTO -> this.convertToAsistUnitDTO((ProductTplAssistUnitExchangeDTO)productAsistUnitDTO)));
                    for (ProductTplAssistUnitExchangeDTO productTplAssistUnitExchangeDTO : tplAsisUnitDTOList) {
                        ArrayList<ProductAsistUnitDTO> productAsistUnitDTOList1 = (ArrayList<ProductAsistUnitDTO>)productTplAsistDTOMap.get(productTplAssistUnitExchangeDTO.getTemplate());
                        if (productAsistUnitDTOList1 == null) {
                            productAsistUnitDTOList1 = new ArrayList<ProductAsistUnitDTO>();
                        }
                        productAsistUnitDTOList1.add(this.convertToAsistUnitDTO(productTplAssistUnitExchangeDTO));
                        productTplAsistDTOMap.put(productTplAssistUnitExchangeDTO.getTemplate(), productAsistUnitDTOList1);
                    }
                } else {
                    tplAsisUnitDTOMap = new HashMap();
                }
                for (ProductDTO productDTO : productTplDTOList) {
                    Long tplId = (Long)productTplMap.get(productDTO.getId());
                    ProductTplUnitDTO tplDTO = tplUnitDTOMap.get(tplId);
                    ProductAsistUnitDTO asistUnitDTO = this.convertToAsistUnitDTO(tplDTO);
                    productDTO.setEnableAssistUnit(asistUnitDTO.getEnableAssistUnit());
                    ProductBusiUnitDTO productBusiUnitDTO = this.getProductBusiUnitDTO(productDTO, asistUnitDTO, tplAsisUnitDTOMap, true);
                    if (BooleanUtils.isTrue((Boolean)productDTO.getEnableAssistUnit())) {
                        productBusiUnitDTO.setAssistUnitDTOList((List)productTplAsistDTOMap.get(productDTO.getProductTemplate()));
                    } else {
                        productAsistUnitDTOList = new ArrayList<ProductAsistUnitDTO>();
                        productAsistUnitDTOList.add(asistUnitDTO);
                        productBusiUnitDTO.setAssistUnitDTOList(productAsistUnitDTOList);
                    }
                    productBusiUnitDTOList.add(productBusiUnitDTO);
                }
            }
        }
        return productBusiUnitDTOList;
    }

    private ProductAsistUnitDTO convertToAsistUnitDTO(ProductTplUnitDTO tplDTO) {
        ProductAsistUnitDTO asistUnitDTO = new ProductAsistUnitDTO();
        if (tplDTO != null) {
            asistUnitDTO.setEnableAssistUnit(tplDTO.getEnableAssistUnit());
            asistUnitDTO.setAssistUnit(tplDTO.getUnit());
            asistUnitDTO.setAssistUnitCode(tplDTO.getUnitCode());
            asistUnitDTO.setAssistUnitName(tplDTO.getUnitName());
            asistUnitDTO.setAssistUnitPrecision(tplDTO.getUnitPrecision());
            asistUnitDTO.setAssistUnitTruncationType(tplDTO.getUnitTruncationType());
            asistUnitDTO.setAssistUnitConvertCoefficient(tplDTO.getUnitConvertCoefficient());
            asistUnitDTO.setUnitExchangeType(Integer.valueOf(UnitExchangeType.fixed.getValue()));
            asistUnitDTO.setMainUnitCount(BigDecimal.ONE);
            asistUnitDTO.setAssistUnitCount(BigDecimal.ONE);
            asistUnitDTO.setMainUnitCountNew(BigDecimal.ONE);
            asistUnitDTO.setAssistVerValue("1/1");
            asistUnitDTO.setMainUnitRate(BigDecimal.ONE);
        }
        return asistUnitDTO;
    }

    private ProductAsistUnitDTO convertToAsistUnitDTO(ProductTplAssistUnitExchangeDTO tplAssistUnitDTO) {
        ProductAsistUnitDTO asistUnitDTO = new ProductAsistUnitDTO();
        asistUnitDTO.setUnitExchangeType(tplAssistUnitDTO.getUnitExchangeType());
        asistUnitDTO.setMainUnitCount(tplAssistUnitDTO.getMainUnitCount());
        asistUnitDTO.setAssistUnit(tplAssistUnitDTO.getAssistUnit());
        asistUnitDTO.setAssistUnitCode(tplAssistUnitDTO.getAssistUnitCode());
        asistUnitDTO.setAssistUnitName(tplAssistUnitDTO.getAssistUnitName());
        asistUnitDTO.setAssistUnitCount(tplAssistUnitDTO.getAssistUnitCount());
        asistUnitDTO.setAssistUnitPrecision(tplAssistUnitDTO.getAssistUnitPrecision());
        asistUnitDTO.setAssistUnitTruncationType(tplAssistUnitDTO.getAssistUnitTruncationType());
        asistUnitDTO.setAssistUnitConvertCoefficient(tplAssistUnitDTO.getUnitConvertCoefficient());
        asistUnitDTO.setMainUnitCountNew(tplAssistUnitDTO.getMainUnitCountNew());
        asistUnitDTO.setAssistVerValue(tplAssistUnitDTO.getAssistVerValue());
        asistUnitDTO.setMainUnitRate(tplAssistUnitDTO.getMainUnitRate());
        return asistUnitDTO;
    }

    private ProductBusiUnitDTO getProductBusiUnitDTO(ProductDTO productDTO, ProductAsistUnitDTO asistUnitDTO, Map<String, ProductAsistUnitDTO> productDTOMap, Boolean byTpl) {
        ProductBusiUnitDTO productBusiUnitDTO = new ProductBusiUnitDTO();
        productBusiUnitDTO.setProductId(productDTO.getId());
        Long keyPreffix = productDTO.getId();
        if (byTpl.booleanValue()) {
            keyPreffix = productDTO.getProductTemplate();
        }
        productDTOMap.put(keyPreffix + "-" + productDTO.getUnitId(), asistUnitDTO);
        productBusiUnitDTO.setMainUnitId(productDTO.getUnitId());
        productBusiUnitDTO.setMainUnitCode(productDTO.getUnitCode());
        productBusiUnitDTO.setMainUnitName(productDTO.getUnitName());
        productBusiUnitDTO.setMainUnitPrecision(productDTO.getUnitPrecision());
        productBusiUnitDTO.setMainUnitConvertCoefficient(productDTO.getUnitConvertCoefficient());
        productBusiUnitDTO.setMainUnitTruncationType(productDTO.getUnitTruncationType());
        if (null != productDTO.getEnableAssistUnit() && productDTO.getEnableAssistUnit().booleanValue()) {
            productBusiUnitDTO.setPurchaseUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getUpuPurchaseUnit()));
            productBusiUnitDTO.setPurchasePriceUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getUpuPurchasePriceUnit()));
            productBusiUnitDTO.setStockUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getStockStockUnit()));
            productBusiUnitDTO.setProduceUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getEdProduceUnit()));
            productBusiUnitDTO.setBatchPriceUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getMktBatchPriceUnit()));
            productBusiUnitDTO.setInspectionUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getInspectionUnit()));
            productBusiUnitDTO.setBatchUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getMktBatchUnit()));
            productBusiUnitDTO.setDemandPlanningUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getDemandPlanningUnit()));
            productBusiUnitDTO.setRequireUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getMktRequireUnit()));
            productBusiUnitDTO.setOnlineUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getMktOnlineUnit()));
            productBusiUnitDTO.setOfflineUnitDTO(productDTOMap.get(keyPreffix + "-" + productDTO.getMktOfflineUnit()));
        } else {
            productBusiUnitDTO.setPurchaseUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setPurchasePriceUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setStockUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setProduceUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setBatchPriceUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setInspectionUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setBatchUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setDemandPlanningUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setRequireUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setOnlineUnitDTO(asistUnitDTO);
            productBusiUnitDTO.setOfflineUnitDTO(asistUnitDTO);
        }
        return productBusiUnitDTO;
    }

    @NotNull
    private static ProductAsistUnitDTO getAsistUnitDTOFromMainUnit(ProductDTO productDTO) {
        ProductAsistUnitDTO asistUnitDTO = new ProductAsistUnitDTO();
        asistUnitDTO.setUnit(productDTO.getUnitId());
        asistUnitDTO.setUnitPrecision(productDTO.getUnitPrecision());
        asistUnitDTO.setUnitTruncationType(productDTO.getUnitTruncationType());
        asistUnitDTO.setUnitConvertCoefficient(productDTO.getUnitConvertCoefficient());
        asistUnitDTO.setUnitExchangeType(Integer.valueOf(UnitExchangeType.fixed.getValue()));
        asistUnitDTO.setMainUnitCount(BigDecimal.ONE);
        asistUnitDTO.setAssistUnit(productDTO.getUnitId());
        asistUnitDTO.setAssistUnitCode(productDTO.getUnitCode());
        asistUnitDTO.setAssistUnitName(productDTO.getUnitName());
        asistUnitDTO.setAssistUnitPrecision(productDTO.getUnitPrecision());
        asistUnitDTO.setAssistUnitTruncationType(productDTO.getUnitTruncationType());
        asistUnitDTO.setAssistUnitConvertCoefficient(productDTO.getUnitConvertCoefficient());
        asistUnitDTO.setAssistUnitCount(BigDecimal.ONE);
        asistUnitDTO.setMainUnitCountNew(BigDecimal.ONE);
        asistUnitDTO.setAssistVerValue("1/1");
        asistUnitDTO.setMainUnitRate(BigDecimal.ONE);
        return asistUnitDTO;
    }

    public List<Map> getAssistUnitRateByOrg(List<Map> products) throws Exception {
        return this.upcProductQueryService.getAssistUnitRateByOrg(products);
    }

    private void splicingSchema(HashMap<String, String> productAllFieldMapping, HashSet<String> ascFields, QuerySchema schema, String type) {
        for (String ascField : ascFields) {
            if (productAllFieldMapping.get(ascField) == null) continue;
            if ("desc".equals(type)) {
                schema.addOrderBy(productAllFieldMapping.get(ascField) + " desc");
                continue;
            }
            if (!"asc".equals(type)) continue;
            schema.addOrderBy(productAllFieldMapping.get(ascField));
        }
    }

    private Boolean removeOrgConditionByGlobalShare(ProductQryDTO qryDTO) {
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("pc.product.Product");
        Boolean flag = false;
        if (orgGlobalShare != null && orgGlobalShare.booleanValue()) {
            if (qryDTO.getOrgId() != null) {
                qryDTO.setOrgId(null);
                flag = true;
            }
            if (qryDTO.getOrgStringList() != null) {
                qryDTO.setOrgStringList(null);
                flag = true;
            }
            if (qryDTO.getOrgList() != null) {
                qryDTO.setOrgList(null);
                flag = true;
            }
        }
        return flag;
    }

    public Integer queryProductListCount(ProductQryDTO qryDTO) throws Exception {
        QuerySchema schema;
        Map result;
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        this.setQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (qryDTO.getCreator() != null && BooleanUtil.isTrue((Object)qryDTO.getCreator())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productApplyRange.isCreator").eq((Object)1));
        }
        if ((result = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup)))) != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public CoreDocJsonResult addProductTag(Long productId, String orgId, List<Long> tagIds) throws Exception {
        this.skuService.checkTagDatas(productId, orgId, tagIds);
        Map<String, Object> tagData = this.buildTagData(productId, orgId, tagIds);
        return this.upcBizService.excuteUpdateOne(tagData, "batchtag", "pc_product");
    }

    public CoreDocJsonResult delProductTag(Long productId, String orgId, List<Long> tagIds) throws Exception {
        this.skuService.checkTagDatas(productId, orgId, tagIds);
        Map<String, Object> tagData = this.buildTagData(productId, orgId, tagIds);
        return this.upcBizService.excuteUpdateOne(tagData, "batchcleartag", "pc_product");
    }

    public List<ProductTagDTO> batchQueryProductTags(List<ProductTagQueryVO> productTagQueryVOList) throws Exception {
        if (ObjectUtils.isEmpty(productTagQueryVOList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801230);
        }
        if (productTagQueryVOList.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801348, new Object[]{CoredocSDKConstant.MAX_NUM_FOR_SIMPLE});
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        AtomicBoolean hasOrgValue = new AtomicBoolean(false);
        List dataList = productTagQueryVOList.stream().map(productTagQueryVO -> {
            HashMap<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("productId", productTagQueryVO.getProductId());
            dataMap.put("orgId", productTagQueryVO.getOrgId());
            if (!StringUtils.isEmpty((CharSequence)productTagQueryVO.getOrgId())) {
                hasOrgValue.set(true);
            }
            return dataMap;
        }).collect(Collectors.toList());
        param.put("dataList", dataList);
        param.put("ytenant", AppContext.getYTenantId());
        List productTagList = hasOrgValue.get() ? SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.queryProductTagNews", param) : SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductQuery.queryProductTagNewsByProductId", param);
        List<Object> productTagDTOS = new ArrayList<ProductTagDTO>();
        if (productTagList != null) {
            productTagDTOS = JSON.parseArray((String)JSON.toJSONString((Object)productTagList), ProductTagDTO.class);
        }
        return productTagDTOS;
    }

    public Map<String, Object> buildTagData(Long productId, String orgId, List<Long> tagIds) throws Exception {
        Map<String, Object> productApplyRange = this.queryRangeByProductIdAndOrgId(productId, orgId);
        List tagIdStrs = tagIds.stream().map(Objects::toString).collect(Collectors.toList());
        HashMap<String, Object> data = new HashMap<String, Object>();
        if (ObjectUtils.isEmpty(productApplyRange)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801349, new Object[]{productId.toString(), orgId});
        }
        data.putAll(productApplyRange);
        data.put("tags", tagIdStrs);
        data.put("productApplyRangeId", productApplyRange.get("id"));
        data.put("id", productApplyRange.get("productId"));
        return data;
    }

    public CoreDocJsonResult disableProduct(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        return this.productShelfService.excuteBatchAction(productId, orgId, "stop", null);
    }

    public CoreDocJsonResult enableProduct(Long productId, String orgId) throws Exception {
        this.skuService.checkShelfData(productId, orgId);
        return this.productShelfService.excuteBatchAction(productId, orgId, "unstop", null);
    }

    public Boolean hasCharacterSku(Long productId) throws Exception {
        QuerySchema queryProductApplyRangeSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)1)}));
        List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)queryProductApplyRangeSchema);
        if (CollectionUtils.isEmpty((Collection)skus)) {
            return false;
        }
        return true;
    }

    public List<ProductDTO> hasCharacterSkus(List<Long> productIds) throws Exception {
        UpcAPiTool.checkPara((List[])new List[]{productIds});
        QuerySchema queryProductApplyRangeSchema = QuerySchema.create().addSelect("productId").distinct().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isSKU").eq((Object)1)}));
        List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)queryProductApplyRangeSchema);
        HashMap haspecProductIdMap = new HashMap();
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            skus.forEach(data -> {
                Long productId = Long.parseLong(data.get("productId").toString());
                haspecProductIdMap.put(productId, productId);
            });
        }
        ArrayList<ProductDTO> productResults = new ArrayList<ProductDTO>();
        productIds.forEach(productId -> {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(productId);
            boolean hasSpecs = haspecProductIdMap.containsKey(productId);
            productDTO.setHasSpecs(Boolean.valueOf(hasSpecs));
            productResults.add(productDTO);
        });
        return productResults;
    }

    public Map<String, Object> queryRangeByProductIdAndOrgId(Long productId, String orgId) throws Exception {
        QuerySchema queryProductApplyRangeSchema = QuerySchema.create().addSelect(new String[]{"id", "productId", "orgId", "isApplied", "isCreator"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").eq((Object)orgId)}));
        Map productApplyRange = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)queryProductApplyRangeSchema);
        return productApplyRange;
    }

    @Transactional(rollbackFor={Throwable.class})
    public String deleteProductById(String productId, String code) throws Exception {
        return this.deleteProductData(productId, code, null, "pc_productlist");
    }

    @Transactional(rollbackFor={Throwable.class})
    public String deleteProductRangeByIdAndOrgCode(String productId, String code, String orgCode) throws Exception {
        return this.deleteProductData(productId, code, orgCode, "pc_productlist_query");
    }

    @Nullable
    private String deleteProductData(String productId, String code, String orgCode, String billnum) throws Exception {
        String selectFiled = "id as productApplyRangeId, productId as id, isCreator as isCreator, isApplied as isApplied, orgId as productApplyRange_orgId, orgId.name as orgName";
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!StringUtils.isEmpty((CharSequence)productId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq((Object)productId));
        } else if (!StringUtils.isEmpty((CharSequence)code)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq((Object)code));
        } else {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_SUBMIT_ID_AND_CODE);
        }
        QuerySchema querySchema = QuerySchema.create().distinct().addSelect(selectFiled).addCondition((ConditionExpression)queryConditionGroup);
        if ("pc_productlist_query".equals(billnum)) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"orgId.code").eq((Object)orgCode)});
        } else {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true)});
        }
        List rangeList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)rangeList)) {
            Map range = (Map)rangeList.get(0);
            BillDataDto bill = new BillDataDto();
            bill.setData((Object)range);
            bill.setBillnum(billnum);
            RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
            if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
                return result.getMessages().get(0).toString();
            }
        }
        return null;
    }

    public String queryCustomExtentFieldByFullName(String fullName) throws Exception {
        PubBatchModifyEntity batchModifyEntity = new PubBatchModifyEntity();
        batchModifyEntity.setFullName(fullName);
        List<ExtBusinessProperty> extBusinessPropertyList = this.pubBatchModifyEntityService.getMetaExtentProperty(batchModifyEntity, null, null);
        StringBuffer extendFieldStringBuffer = new StringBuffer();
        for (ExtBusinessProperty extBusinessProperty : extBusinessPropertyList) {
            if (extendFieldStringBuffer.length() > 0) {
                extendFieldStringBuffer.append(",");
            }
            extendFieldStringBuffer.append(extBusinessProperty.getName());
        }
        return extendFieldStringBuffer.toString();
    }

    public Map<String, Object> queryProductCustomExtendData(Long productId) throws Exception {
        String[] extentFields;
        String extentFieldStr = this.queryCustomExtentFieldByFullName("pc.product.Product");
        Product product = this.productQueryDao.getProduct(productId, extentFieldStr);
        HashMap<String, Object> customExtendDataMap = new HashMap<String, Object>();
        for (String extendField : extentFields = extentFieldStr.split(",")) {
            customExtendDataMap.put(extendField, product.get(extendField));
        }
        return customExtendDataMap;
    }

    public void dealCustomExtendData(List<Map<String, Object>> recordList, String customExtendFields) throws Exception {
        String[] extendFields = customExtendFields.split(",");
        for (Map<String, Object> record : recordList) {
            HashMap<String, Object> customExtendMap = new HashMap<String, Object>();
            for (String extendField : extendFields) {
                customExtendMap.put(extendField, record.get(extendField));
                record.remove(extendField);
            }
            record.put("customExtend", customExtendMap);
        }
    }

    public int queryProductCountByDataAuth(ProductQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801326);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        Boolean hasFilterItem = this.setOldQueryConditionGroupByQryDTO(qryDTO, queryConditionGroup);
        if (!hasFilterItem.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000CE", (String)"\u7269\u6599\u6863\u6848"), "pc.product.Product", "query");
        this.permissionService.handleAuthPermission((Object)billContext, (Object)schema);
        int recordCount = 0;
        Map result = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        return recordCount;
    }

    private List<Long> getMaterialIdFromEs(String qryValue) {
        String shortNameDsl;
        List<Long> materialIdListFromShortCode;
        ArrayList<Long> materialIdList = new ArrayList<Long>();
        String codeNameDsl = this.buildDsl("product", Arrays.asList("code", "name"), qryValue);
        HashSet<Long> materialIdSet = new HashSet<Long>();
        List<Long> materialIdListFromCodeName = this.getMaterialIsByDsl("product", codeNameDsl);
        if (!CollectionUtils.isEmpty(materialIdListFromCodeName)) {
            materialIdSet.addAll(materialIdListFromCodeName);
        }
        if (!CollectionUtils.isEmpty(materialIdListFromShortCode = this.getMaterialIsByDsl("productdetail", shortNameDsl = this.buildDsl("productdetail", Arrays.asList("shortName"), qryValue)))) {
            materialIdSet.addAll(materialIdListFromShortCode);
        }
        materialIdList.addAll(materialIdSet);
        return materialIdList;
    }

    private String buildDsl(String esIndex, List<String> matchFieldList, String qryValue) {
        ArrayList<FieldValue> fieldValueList = new ArrayList<FieldValue>();
        fieldValueList.add(FieldValue.of((String)qryValue.toLowerCase()));
        BoolQuery.Builder boolBuilder = new BoolQuery.Builder();
        TermQuery.Builder termBuilder = new TermQuery.Builder();
        termBuilder.field("ytenant_id").value(AppContext.getYhtTenantId().toString());
        BoolQuery.Builder matchFieldBoolBuilder = new BoolQuery.Builder();
        matchFieldList.forEach(matchField -> {
            MatchQuery.Builder matchFieldQuery = new MatchQuery.Builder();
            matchFieldQuery.operator(Operator.And).field(matchField).query(qryValue).analyzer("ik_max_word").fuzziness("AUTO");
            matchFieldBoolBuilder.should(matchFieldQuery.build()._toQuery(), new Query[0]);
        });
        boolBuilder.must(termBuilder.build()._toQuery(), new Query[]{matchFieldBoolBuilder.build()._toQuery()});
        return ElasticsearchManager.buildSearchRequest((String)esIndex, (BoolQuery.Builder)boolBuilder);
    }

    private List<Long> getMaterialIsByDsl(String esIndex, String dsl) {
        List list;
        List<Long> materialIdList = new ArrayList<Long>();
        try {
            list = YmsSearchClientSessionHolder.searchClientSession((String)"iuap-apdoc-material-search-client").dslBatchSearch(esIndex, dsl, Map.class);
        }
        catch (Exception e) {
            log.error("\u8c03\u7528\u667a\u80fd\u641c\u7d22ES\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            throw new RuntimeException(e);
        }
        if (!CollectionUtils.isEmpty((Collection)list)) {
            for (Map ids : list) {
                if (ids.get("id") == null) continue;
                materialIdList.add(Long.valueOf(ids.get("id").toString()));
            }
        }
        if (materialIdList.size() >= 5000) {
            if (!this.ymsParamConfig.getEsErrorHint().booleanValue()) {
                materialIdList = materialIdList.subList(0, this.ymsParamConfig.getEsSearchMaxPageSize());
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_QUERY_RESULT, new Object[]{"code,name,shortname", 5000});
            }
        }
        return materialIdList;
    }
}

