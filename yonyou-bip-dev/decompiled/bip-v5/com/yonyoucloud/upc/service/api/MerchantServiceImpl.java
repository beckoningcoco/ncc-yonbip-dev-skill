/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantSaleAreaQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.merchant.MerchantPubQueryService
 *  com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.merchant.MerchantQuerySdkServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.DocCollectionUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.data.entity.dto.FuncOrg
 *  com.yonyou.iuap.data.service.itf.FuncOrgDataQryService
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.iuap.graphql.query.feature.QueryFeature
 *  com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.iuap.upc.api.IMerchantServiceV2
 *  com.yonyoucloud.iuap.upc.dto.AddressInfoDTO
 *  com.yonyoucloud.iuap.upc.dto.AddressInfoQryDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentLevelDTO
 *  com.yonyoucloud.iuap.upc.dto.AgentLevelQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ContactDTO
 *  com.yonyoucloud.iuap.upc.dto.ContactQryDTO
 *  com.yonyoucloud.iuap.upc.dto.CustomerCategoryDTO
 *  com.yonyoucloud.iuap.upc.dto.CustomerCategoryQryDTO
 *  com.yonyoucloud.iuap.upc.dto.CustomerTradeDTO
 *  com.yonyoucloud.iuap.upc.dto.CustomerTradeQryDTO
 *  com.yonyoucloud.iuap.upc.dto.InvoicingCustomersDTO
 *  com.yonyoucloud.iuap.upc.dto.InvoicingCustomersQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailErpQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeErpQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantBaseQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantDerivativeBaseQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantManagerDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantManagerQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoQryDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantStaffDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantStaffQryDTO
 *  com.yonyoucloud.iuap.upc.dto.PrincipalDTO
 *  com.yonyoucloud.iuap.upc.dto.PrincipalQryDTO
 *  com.yonyoucloud.iuap.upc.dto.SaleAreaDTO
 *  com.yonyoucloud.iuap.upc.dto.SaleAreaQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCBillDataDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.upc.aa.merchant.IsExistPotential
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.ToolUtils
 *  com.yonyoucloud.upc.utils.UPCResultConverter
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

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantSaleAreaQryDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.MerchantAPIUtils;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.merchant.MerchantPubQueryService;
import com.yonyou.iuap.apdoc.coredoc.sdk.service.impl.merchant.MerchantQuerySdkServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.DocCollectionUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.data.entity.dto.FuncOrg;
import com.yonyou.iuap.data.service.itf.FuncOrgDataQryService;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.iuap.graphql.query.feature.QueryFeature;
import com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.IMerchantService;
import com.yonyoucloud.iuap.upc.api.IMerchantServiceV2;
import com.yonyoucloud.iuap.upc.dto.AddressInfoDTO;
import com.yonyoucloud.iuap.upc.dto.AddressInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentLevelDTO;
import com.yonyoucloud.iuap.upc.dto.AgentLevelQryDTO;
import com.yonyoucloud.iuap.upc.dto.ContactDTO;
import com.yonyoucloud.iuap.upc.dto.ContactQryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerCategoryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerCategoryQryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerTradeDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerTradeQryDTO;
import com.yonyoucloud.iuap.upc.dto.InvoicingCustomersDTO;
import com.yonyoucloud.iuap.upc.dto.InvoicingCustomersQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailErpQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeErpQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDerivativeBaseQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantManagerDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantManagerQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantStaffDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantStaffQryDTO;
import com.yonyoucloud.iuap.upc.dto.PrincipalDTO;
import com.yonyoucloud.iuap.upc.dto.PrincipalQryDTO;
import com.yonyoucloud.iuap.upc.dto.SaleAreaDTO;
import com.yonyoucloud.iuap.upc.dto.SaleAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCBillDataDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.upc.aa.merchant.IsExistPotential;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.api.constant.FieldConstant;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.ToolUtils;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
public class MerchantServiceImpl
extends MerchantPubQueryService
implements IMerchantService,
IMerchantServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(MerchantServiceImpl.class);
    @Autowired
    private FuncOrgDataQryService funcOrgDataQryService;
    @Autowired
    private OrgExternalQryService orgExternalQryService;
    @Autowired
    private IFuncTypeQueryService funcTypeQueryService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private IBDQueryRepository billQueryRepository;
    @Autowired
    private MerchantQuerySdkServiceImpl merchantQueryService;
    @Autowired
    private MerchantSaleAreaQryDao merchantSaleAreaQryDao;

    @Override
    public MerchantDTO getMerchantById(Long merchantId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (DocCollectionUtil.isExist((String[])field, (HashMap)MerchantAPIUtils.merchantDetailFieldMapping)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true));
        }
        schema.addCondition((ConditionExpression)queryConditionGroup);
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        return this.getMerchantDTO(schema);
    }

    @Override
    public MerchantDTO getMerchantOrgInfoById(Long merchantId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        return this.getMerchantDTO(schema);
    }

    @Override
    public MerchantDTO getMerchantByIdAndOrg(Long merchantId, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        return this.getMerchantByIdAndOrg(merchantId, orgId.toString(), field);
    }

    public MerchantDTO getMerchantByIdAndOrg(Long merchantId, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((String[])field);
        ArrayList<String> fieldList = new ArrayList<String>(Arrays.asList(field));
        if (!fieldList.contains("rangesOrgId")) {
            fieldList.add("rangesOrgId");
        }
        field = fieldList.toArray(new String[0]);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)orgId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        }
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        schema.setPartitionable(false);
        return this.getMerchantDTO(schema);
    }

    @Override
    public List<MerchantDTO> getMerchantByIds(List<Long> merchantIds, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{merchantIds});
        UpcAPiTool.checkPara((String[])field);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listMerchantDTOs(schema);
    }

    @Override
    public List<MerchantDTO> listMerchantByQryDTO(MerchantQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        qryDTO = this.getQueryFieldByMerchantQryDTO(qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = this.setQueryConditionGroupByMerchantQryDTO(qryDTO, queryConditionGroup);
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.shopId").eq((Object)qryDTO.getShopId()));
            qryDTO.setShopId(null);
            hasFilterItem = true;
        }
        if (this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup).booleanValue()) {
            hasFilterItem = true;
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        UpcAPiTool.dealNewModelCustomerAreas((String[])qryDTO.getFields(), (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])qryDTO.getFields(), (QuerySchema)schema);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        if (qryDTO.getPotential() != null && BooleanUtil.isTrue((Object)qryDTO.getPotential()) || AppContext.getCurrentUser().getUserType() == UserType.TenantAdmin || AppContext.getCurrentUser().getUserType() == UserType.PlatForm || AppContext.getCurrentUser().getUserType() == UserType.TenantEmployee) {
            AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        }
        return this.listMerchantDTOs(schema);
    }

    private MerchantQryDTO getQueryFieldByMerchantQryDTO(MerchantQryDTO qryDTO) {
        if (qryDTO.getOrgId() != null || !CollectionUtils.isEmpty((Collection)qryDTO.getOrgIdListNew()) || !CollectionUtils.isEmpty((Collection)qryDTO.getOrgIdList()) || !CollectionUtils.isEmpty((Collection)qryDTO.getOrgIdListNew()) || BooleanUtil.isTrue((Object)qryDTO.getCreator())) {
            String[] newSelectFields = Arrays.copyOf(qryDTO.getFields(), qryDTO.getFields().length + 1);
            newSelectFields[newSelectFields.length - 1] = "rangesOrgId";
            qryDTO.setFields(newSelectFields);
        }
        return qryDTO;
    }

    @Override
    public CoreDocJsonResult<MerchantBaseDTO> listMerchantBaseByBaseQryDTO(MerchantBaseQryDTO merchantBaseQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)merchantBaseQryDTO);
        if (merchantBaseQryDTO.getPageIndex() == null) {
            merchantBaseQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (merchantBaseQryDTO.getPageSize() == null) {
            merchantBaseQryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        List merchantBaseDTOS = null;
        CoreDocJsonResult merchantBaseDTOCoreDocJsonResult = new CoreDocJsonResult();
        merchantBaseDTOCoreDocJsonResult.setSuccess(true);
        merchantBaseDTOCoreDocJsonResult.setTotalCount(Integer.valueOf(0));
        merchantBaseDTOCoreDocJsonResult.setCode(Long.valueOf(200L));
        merchantBaseDTOCoreDocJsonResult.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BD9", (String)"\u5904\u7406\u6210\u529f"));
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            merchantBaseQryDTO.setOrgIdListNew(null);
            merchantBaseQryDTO.setOrgIdNew(null);
        }
        if (StringUtils.isNotBlank((CharSequence)merchantBaseQryDTO.getOrgIdNew()) || !CollectionUtils.isEmpty((Collection)merchantBaseQryDTO.getOrgIdListNew())) {
            ArrayList<Long> merchantIdListByOrgIds = new ArrayList<Long>(64);
            QueryConditionGroup queryConditionGroupByOrgId = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            if (StringUtils.isNotBlank((CharSequence)merchantBaseQryDTO.getOrgIdNew())) {
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)merchantBaseQryDTO.getOrgIdNew()));
            } else {
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in((Collection)merchantBaseQryDTO.getOrgIdListNew()));
            }
            if (merchantBaseQryDTO.getMerchantId() != null) {
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantBaseQryDTO.getMerchantId()));
            } else if (!CollectionUtils.isEmpty((Collection)merchantBaseQryDTO.getMerchantIdList())) {
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in((Collection)merchantBaseQryDTO.getMerchantIdList()));
            }
            QuerySchema schemaByOrgId = QuerySchema.create().addSelect("merchantId").addCondition((ConditionExpression)queryConditionGroupByOrgId).distinct();
            List merchantIdByOrgIdList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaByOrgId);
            if (!CollectionUtils.isEmpty((Collection)merchantIdByOrgIdList)) {
                for (Map merchantIdMap : merchantIdByOrgIdList) {
                    merchantIdListByOrgIds.add((Long)merchantIdMap.get("merchantId"));
                }
            }
            if (CollectionUtils.isEmpty(merchantIdListByOrgIds)) {
                return merchantBaseDTOCoreDocJsonResult;
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(merchantIdListByOrgIds));
            merchantBaseQryDTO.setOrgIdNew(null);
            merchantBaseQryDTO.setOrgIdListNew(null);
            merchantBaseQryDTO.setMerchantId(null);
            merchantBaseQryDTO.setMerchantIdList(null);
        }
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)merchantBaseQryDTO, queryConditionGroup);
        this.setQueryConditionGroupByMerchantBaseQryDTO(merchantBaseQryDTO, queryConditionGroup);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])merchantBaseQryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantBaseQryDTO.getPageIndex().intValue(), merchantBaseQryDTO.getPageSize().intValue());
        UpcAPiTool.dealNewModelCustomerAreas((String[])merchantBaseQryDTO.getFields(), (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])merchantBaseQryDTO.getFields(), (QuerySchema)schema);
        if (merchantBaseQryDTO.getPotentialFlag() != null && BooleanUtil.isTrue((Object)merchantBaseQryDTO.getPotentialFlag())) {
            AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        }
        this.setOrderSchemaFieldByBaseQryDTO(merchantBaseQryDTO, schema);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (pager != null) {
            merchantBaseDTOCoreDocJsonResult.setTotalCount(Integer.valueOf(pager.getRecordCount()));
            if (pager.getRecordList() != null) {
                merchantBaseDTOS = JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), MerchantBaseDTO.class);
                pager.setRecordList(merchantBaseDTOS);
            }
            merchantBaseDTOCoreDocJsonResult.setData(merchantBaseDTOS);
        }
        return merchantBaseDTOCoreDocJsonResult;
    }

    @Override
    public CoreDocJsonResult<MerchantDTO> listMerchantByQryDTONew(MerchantQryDTO merchantQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)merchantQryDTO);
        if (merchantQryDTO.getPageIndex() == null) {
            merchantQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (merchantQryDTO.getPageSize() == null) {
            merchantQryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        List merchantDTOS = null;
        boolean hasFilterItem = false;
        CoreDocJsonResult merchantDTOCoreDocJsonResult = new CoreDocJsonResult();
        merchantDTOCoreDocJsonResult.setSuccess(true);
        merchantDTOCoreDocJsonResult.setTotalCount(Integer.valueOf(0));
        merchantDTOCoreDocJsonResult.setCode(Long.valueOf(200L));
        merchantDTOCoreDocJsonResult.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BD9", (String)"\u5904\u7406\u6210\u529f"));
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getFuncTypeList())) {
            ArrayList<Long> merchantIdListByRangeIds = new ArrayList<Long>(64);
            QueryConditionGroup queryConditionGroupByOrgId = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            if (merchantQryDTO.getMerchantId() != null) {
                hasFilterItem = true;
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantQryDTO.getMerchantId()));
            } else {
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getMerchantIdList()) && merchantQryDTO.getMerchantIdList().size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801304);
                }
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getMerchantIdList())) {
                    hasFilterItem = true;
                    queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in((Collection)merchantQryDTO.getMerchantIdList()));
                }
            }
            if (merchantQryDTO.getMerchantApplyRangeId() != null) {
                hasFilterItem = true;
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.id").eq((Object)merchantQryDTO.getMerchantApplyRangeId()));
            } else {
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getMerchantApplyRangeIdList()) && merchantQryDTO.getMerchantApplyRangeIdList().size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801305);
                }
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getMerchantApplyRangeIdList())) {
                    hasFilterItem = true;
                    queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.id").in((Collection)merchantQryDTO.getMerchantApplyRangeIdList()));
                }
            }
            Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
            if (orgGlobalShare.booleanValue()) {
                if (merchantQryDTO.getOrgIdNew() != null) {
                    hasFilterItem = true;
                }
            } else if (merchantQryDTO.getOrgIdNew() != null) {
                hasFilterItem = true;
                queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)merchantQryDTO.getOrgIdNew()));
            } else {
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getOrgIdListNew()) && merchantQryDTO.getOrgIdListNew().size() > UpcAPiTool.List_LENGTH) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801306);
                }
                if (!CollectionUtils.isEmpty((Collection)merchantQryDTO.getMerchantIdList())) {
                    hasFilterItem = true;
                    queryConditionGroupByOrgId.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in((Collection)merchantQryDTO.getOrgIdListNew()));
                }
            }
            if (!hasFilterItem) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801307);
            }
            QuerySchema schemaByOrgId = QuerySchema.create().addSelect("id,orgId").addCondition((ConditionExpression)queryConditionGroupByOrgId).distinct();
            List orgIdByFuncList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaByOrgId);
            if (!CollectionUtils.isEmpty((Collection)orgIdByFuncList)) {
                for (Map orgIdMap : orgIdByFuncList) {
                    boolean satisfyFunction = this.funcTypeQueryService.orgHasFunc((String)AppContext.getYTenantId(), orgIdMap.get("orgId").toString(), "financeorg");
                    if (!satisfyFunction) continue;
                    merchantIdListByRangeIds.add((Long)orgIdMap.get("id"));
                }
            }
            if (CollectionUtils.isEmpty(merchantIdListByRangeIds)) {
                return merchantDTOCoreDocJsonResult;
            }
            merchantQryDTO.setMerchantId(null);
            merchantQryDTO.setMerchantIdList(null);
            merchantQryDTO.setMerchantApplyRangeId(null);
            merchantQryDTO.setMerchantApplyRangeIdList(null);
            merchantQryDTO.setOrgIdListNew(null);
            merchantQryDTO.setOrgIdListNew(null);
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.id").in(merchantIdListByRangeIds));
        }
        this.setQueryConditionGroupByMerchantQryDTO(merchantQryDTO, queryConditionGroup);
        if (merchantQryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.shopId").eq((Object)merchantQryDTO.getShopId()));
            merchantQryDTO.setShopId(null);
        }
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)merchantQryDTO, queryConditionGroup);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])merchantQryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantQryDTO.getPageIndex().intValue(), merchantQryDTO.getPageSize().intValue());
        this.setOrderSchemaFieldByBaseQryDTO((MerchantBaseQryDTO)merchantQryDTO, schema);
        UpcAPiTool.dealNewModelCustomerAreas((String[])merchantQryDTO.getFields(), (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])merchantQryDTO.getFields(), (QuerySchema)schema);
        UpcAPiTool.dealMerchantinvoice((String[])merchantQryDTO.getFields(), (QuerySchema)schema);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (pager != null) {
            merchantDTOCoreDocJsonResult.setTotalCount(Integer.valueOf(pager.getRecordCount()));
            if (pager.getRecordList() != null) {
                merchantDTOS = JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), MerchantDTO.class);
                pager.setRecordList(merchantDTOS);
            }
            merchantDTOCoreDocJsonResult.setData(merchantDTOS);
        }
        return merchantDTOCoreDocJsonResult;
    }

    public UPCPager listMerchantByPageV2(MerchantQryDTO merchantQryPageDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.listMerchantByPage(merchantQryPageDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listMerchantByPage(MerchantQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByMerchantQryDTO(qryDTO, queryConditionGroup);
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.shopId").eq((Object)qryDTO.getShopId()));
            qryDTO.setShopId(null);
        }
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        schema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        UpcAPiTool.dealNewModelCustomerAreas((String[])qryDTO.getFields(), (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])qryDTO.getFields(), (QuerySchema)schema);
        this.setOrderSchemaFieldByBaseQryDTO((MerchantBaseQryDTO)qryDTO, schema);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), MerchantDTO.class));
        }
        return pager;
    }

    @Override
    public List<MerchantDTO> getMerchantByIdsAndOrg(List<Long> merchantIds, Long orgId, String[] field) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{orgId});
        return this.getMerchantByIdsAndOrg(merchantIds, orgId.toString(), field);
    }

    public List<MerchantDTO> getMerchantByIdsAndOrg(List<Long> merchantIds, String orgId, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{merchantIds});
        UpcAPiTool.checkPara((String)orgId);
        UpcAPiTool.checkPara((String[])field);
        ArrayList<String> fieldList = new ArrayList<String>(Arrays.asList(field));
        if (!fieldList.contains("rangesOrgId")) {
            fieldList.add("rangesOrgId");
        }
        field = fieldList.toArray(new String[0]);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        QuerySchema schema = QuerySchema.create().addSelect(qryFields);
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (orgGlobalShare.booleanValue()) {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        } else {
            schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)orgId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        }
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        return this.listMerchantDTOs(schema);
    }

    @Override
    public List<MerchantInvoiceDTO> listMerchantAgentInvoice(AgentInvoiceQryDTO qryDTO) throws Exception {
        return this.listMerchantInvoice(qryDTO);
    }

    public UPCPager listMerchantAgentInvoiceByPageV2(AgentInvoiceQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.listMerchantAgentInvoiceByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listMerchantAgentInvoiceByPage(AgentInvoiceQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        QueryConditionGroup queryConditionGroup;
        UpcAPiTool.checkTenantInfo();
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        if ((queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantInvoiceFieldMapping)) == null) {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantInvoiceFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.AgentInvoice", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), AgentInvoiceQryDTO.class));
        }
        return pager;
    }

    @Override
    public List<MerchantInvoiceDTO> listMerchantShopId(Long shopId, String[] field) throws Exception {
        return null;
    }

    @Override
    public List<MerchantApplyRangeDTO> listMerchantApplyRange(MerchantApplyRangeQryDTO qryDTO) throws Exception {
        Boolean orgGlobalShare;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkListLength((Object)qryDTO);
        boolean hasFilterItem = false;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (qryDTO.getMerchantApplyRangeId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)qryDTO.getMerchantApplyRangeId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getMerchantApplyRangeIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getMerchantApplyRangeIds()));
            hasFilterItem = true;
        }
        if (qryDTO.getMerchantId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)qryDTO.getMerchantId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getMerchantIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in((Collection)qryDTO.getMerchantIdList()));
            hasFilterItem = true;
        }
        if ((orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant")).booleanValue()) {
            if (qryDTO.getOrgId() != null) {
                hasFilterItem = true;
            }
            if (!CollectionUtils.isEmpty((Collection)qryDTO.getOrgIds())) {
                hasFilterItem = true;
            }
        } else {
            if (qryDTO.getOrgId() != null) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)qryDTO.getOrgId().toString()));
                hasFilterItem = true;
            }
            if (!CollectionUtils.isEmpty((Collection)qryDTO.getOrgIds())) {
                ArrayList<String> orgList = new ArrayList<String>();
                for (Long orgId : qryDTO.getOrgIds()) {
                    orgList.add(orgId.toString());
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(orgList));
                hasFilterItem = true;
            }
        }
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"shop").eq((Object)qryDTO.getShopId().toString()));
            hasFilterItem = true;
        }
        if (qryDTO.getPotential() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isPotential").eq((Object)qryDTO.getPotential()));
            hasFilterItem = true;
        }
        if (qryDTO.getRangeType() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"rangeType").eq((Object)qryDTO.getRangeType()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getShopIdList())) {
            ArrayList<String> shopList = new ArrayList<String>();
            for (Long shopId : qryDTO.getShopIdList()) {
                shopList.add(shopId.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"shop").in(shopList));
            hasFilterItem = true;
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantApplyRangeFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        UpcAPiTool.dealNewModelCustomerAreas((String[])qryDTO.getFields(), (QuerySchema)schema, (String)"aa.merchant.MerchantApplyRange");
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        schema.setPartitionable(false);
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        return this.listMerchantApplyRangeDTOs(schema);
    }

    @Override
    public List<CustomerCategoryDTO> listCustomerCategory(CustomerCategoryQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        if (qryDTO.getFields() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801308);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (qryDTO.getParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)qryDTO.getParent()));
            hasFilterItem = true;
        }
        if (qryDTO.getLevel() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"level").eq((Object)qryDTO.getLevel()));
            hasFilterItem = true;
        }
        if (qryDTO.getPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").eq((Object)qryDTO.getPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isEnabled").eq((Object)qryDTO.getStopStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").like((Object)qryDTO.getFuzzyPath()));
            hasFilterItem = true;
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        List merchantMap = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
        if (merchantMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantMap), CustomerCategoryDTO.class);
        }
        return null;
    }

    public UPCPager customerCategoryByPageV2(CustomerCategoryQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        return null;
    }

    @Override
    public Pager CustomerCategoryByPage(CustomerCategoryQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        if (qryDTO.getFields() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801308);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (qryDTO.getParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)qryDTO.getParent()));
        }
        if (qryDTO.getLevel() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"level").eq((Object)qryDTO.getLevel()));
        }
        if (qryDTO.getPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").eq((Object)qryDTO.getPath()));
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isEnabled").eq((Object)qryDTO.getStopStatus()));
        }
        if (qryDTO.getFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").like((Object)qryDTO.getFuzzyPath()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerCategoryFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), CustomerCategoryDTO.class));
        }
        return pager;
    }

    @Override
    public List<MerchantContacterDTO> listMerchantContacter(List<Long> merchantIds, Boolean isDefault) throws Exception {
        QuerySchema schema;
        List merchantMap;
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{merchantIds});
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("merchantId", "merchantId");
        qryFields[1] = new QueryField("fullName", "fullName");
        qryFields[2] = new QueryField("gender", "genderType");
        qryFields[3] = new QueryField("positionName", "positionName");
        qryFields[4] = new QueryField("mobile", "mobile");
        qryFields[5] = new QueryField("telePhone", "telePhone");
        qryFields[6] = new QueryField("email", "email");
        qryFields[7] = new QueryField("isDefault", "isDefault");
        qryFields[8] = new QueryField("custContact", "custContact");
        qryFields[9] = new QueryField("orderContact", "orderContact");
        qryFields[10] = new QueryField("mallContact", "mallContact");
        qryFields[11] = new QueryField("yhtUserId", "yhtUserId");
        qryFields[12] = new QueryField("id", "id");
        qryFields[13] = new QueryField("areaCodeMobile", "areaCodeMobile");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (merchantIds != null && merchantIds.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in(merchantIds));
        }
        if (isDefault != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)isDefault));
        }
        if ((merchantMap = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup)))) != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantMap), MerchantContacterDTO.class);
        }
        return null;
    }

    public UPCPager listMerchantByPageV2(Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        return null;
    }

    @Override
    public Pager listMerchantByPage(Integer pageIndex, Integer pageSize, String[] field) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAllFieldMapping, (String[])field);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())})).addPager(pageIndex.intValue(), pageSize.intValue());
        UpcAPiTool.dealNewModelCustomerAreas((String[])field, (QuerySchema)schema, (String)"aa.merchant.Merchant");
        UpcAPiTool.dealNewModelPrincipals((String[])field, (QuerySchema)schema);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.Merchant", (QuerySchema)schema);
        return pager;
    }

    @Nullable
    private MerchantDTO getMerchantDTO(QuerySchema schema) throws Exception {
        List<MerchantDTO> merchantDTOList = this.listMerchantDTOs(schema);
        return CollectionUtils.isEmpty(merchantDTOList) ? null : merchantDTOList.get(0);
    }

    @Nullable
    private List<MerchantDTO> listMerchantDTOs(QuerySchema schema) throws Exception {
        schema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        schema.configQueryFeature(QueryFeature.MultiLangTextAsMap, false);
        schema.setPartitionable(false);
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        schema.appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())})});
        List merchantMapList = this.billQueryRepository.queryMapBySchema("aa.merchant.Merchant", schema);
        if (!CollectionUtils.isEmpty((Collection)merchantMapList)) {
            for (Map merchantMap : merchantMapList) {
                Object detailCharacter;
                if (merchantMap == null) continue;
                Object character = merchantMap.get("merchantCharacter");
                if (character != null && !(character instanceof Map)) {
                    merchantMap.remove("merchantCharacter");
                }
                if ((detailCharacter = merchantMap.get("merchantDetailCharacter")) == null || detailCharacter instanceof Map) continue;
                merchantMap.remove("merchantDetailCharacter");
            }
            List<MerchantDTO> merchantDTOS = UpcJacksonUtils.conver2List((List)merchantMapList, MerchantDTO.class);
            if (!CollectionUtils.isEmpty((Collection)merchantDTOS)) {
                for (int i = 0; i < merchantDTOS.size() && i < merchantMapList.size(); ++i) {
                    Map merchantMap = (Map)merchantMapList.get(i);
                    MerchantDTO merchantDTO = merchantDTOS.get(i);
                    if (merchantMap.get("merchantCharacter") != null) {
                        merchantDTO.setMerchantCharacter((HashMap)merchantMap.get("merchantCharacter"));
                    }
                    if (merchantMap.get("name") != null) {
                        merchantDTO.setName(merchantMap.get("name").toString());
                    }
                    if (merchantMap.get("shortname") != null) {
                        merchantDTO.setShortname(merchantMap.get("shortname").toString());
                    }
                    merchantDTO.setExchangeratetype___name(MultiLangUtils.convertStringToMultiLangText(merchantMap.get("exchangeratetype___name")));
                    merchantDTO.setSettlementMethod___name(MultiLangUtils.convertStringToMultiLangText(merchantMap.get("settlementMethod___name")));
                    merchantDTO.setShipmentMethod___name(MultiLangUtils.convertStringToMultiLangText(merchantMap.get("shipmentMethod___name")));
                }
            }
            if (this.hasSelectField(schema, "invoicingCustomers") || this.hasSelectField(schema, "invoicingCustomersCode") || this.hasSelectField(schema, "invoicingCustomersName")) {
                merchantDTOS = this.fillDefautlMerchantBilling(merchantDTOS);
            }
            if (this.hasSelectField(schema, "specialManagementDep") || this.hasSelectField(schema, "professSalesmanId") || this.hasSelectField(schema, "specialManagementDepName_multilang")) {
                merchantDTOS = this.fillDefautlMerchantPricipal(merchantDTOS);
            }
            if (this.hasSelectField(schema, "customerArea") || this.hasSelectField(schema, "customerAreaName") || this.hasSelectField(schema, "customerAreaCode")) {
                merchantDTOS = this.fillDefaultMerchantSaleArea(merchantDTOS);
            }
            return merchantDTOS;
        }
        return null;
    }

    private boolean hasSelectField(QuerySchema schema, String alias) {
        List aliasFields = schema.getSelectFieldAlias();
        if (!CollectionUtils.isEmpty((Collection)aliasFields)) {
            for (String fieldName : aliasFields) {
                if (!fieldName.equals(alias)) continue;
                return true;
            }
        }
        return false;
    }

    private List<MerchantDTO> fillDefautlMerchantBilling(List<MerchantDTO> merchantDTOList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantDTOList)) {
            HashMap merchantBillingMap = new HashMap();
            HashSet merchantIds = new HashSet();
            HashSet orgIds = new HashSet();
            merchantDTOList.forEach(merchantDTO -> {
                merchantBillingMap.put(merchantDTO.getId(), merchantDTO);
                merchantIds.add(merchantDTO.getId());
                orgIds.add(merchantDTO.getRangesOrgId());
            });
            HashMap merchantDefaultBillingMap = new HashMap();
            for (String orgId : orgIds) {
                List merchantBillingList = this.merchantQueryService.listMerchantBilling(new ArrayList(merchantIds), orgId, Boolean.valueOf(true));
                if (CollectionUtils.isEmpty((Collection)merchantBillingList)) continue;
                merchantBillingList.forEach(merchantBilling -> merchantDefaultBillingMap.put(merchantBilling.getMerchantId() + "_" + merchantBilling.getOrgId(), merchantBilling));
            }
            merchantDTOList.forEach(merchantDTO -> {
                String key = merchantDTO.getId() + "_" + merchantDTO.getRangesOrgId();
                InvoicingCustomersDTO merchantDefaultBilling = (InvoicingCustomersDTO)merchantDefaultBillingMap.get(key);
                if (merchantDefaultBilling != null) {
                    merchantDTO.setInvoicingCustomers(merchantDefaultBilling.getInvoicingCustomersId());
                    merchantDTO.setInvoicingCustomersCode(merchantDefaultBilling.getInvoicingCustomersCode());
                    merchantDTO.setInvoicingCustomersName(merchantDefaultBilling.getInvoicingCustomersName());
                }
            });
            return merchantDTOList;
        }
        return merchantDTOList;
    }

    private List<MerchantDTO> fillDefautlMerchantPricipal(List<MerchantDTO> merchantDTOList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantDTOList)) {
            HashMap merchantBillingMap = new HashMap();
            HashSet merchantIds = new HashSet();
            HashSet orgIds = new HashSet();
            merchantDTOList.forEach(merchantDTO -> {
                merchantBillingMap.put(merchantDTO.getId(), merchantDTO);
                merchantIds.add(merchantDTO.getId());
                orgIds.add(merchantDTO.getRangesOrgId());
            });
            HashMap merchantDefaultBillingMap = new HashMap();
            for (String orgId : orgIds) {
                List merchantPrincipalList = this.merchantQueryService.listMerchantPrincipal(new ArrayList(merchantIds), orgId, Boolean.valueOf(true));
                if (CollectionUtils.isEmpty((Collection)merchantPrincipalList)) continue;
                merchantPrincipalList.forEach(merchantPrincipal -> merchantDefaultBillingMap.put(merchantPrincipal.getMerchantId() + "_" + merchantPrincipal.getOrgId(), merchantPrincipal));
            }
            merchantDTOList.forEach(merchantDTO -> {
                String key = merchantDTO.getId() + "_" + merchantDTO.getRangesOrgId();
                PrincipalDTO merchantPrincipal = (PrincipalDTO)merchantDefaultBillingMap.get(key);
                if (merchantPrincipal != null) {
                    merchantDTO.setProfessSalesmanId(merchantPrincipal.getProfessSalesmanId());
                    merchantDTO.setProfessSalesmanName(merchantPrincipal.getProfessSalesmanName());
                    merchantDTO.setProfessSalesmanName_multilang(MultiLangUtils.convertStringToMultiLangText((Object)merchantPrincipal.getProfessSalesmanName()));
                    merchantDTO.setSpecialManagementDep(merchantPrincipal.getSpecialManagementDepId());
                    merchantDTO.setSpecialManagementDepName(merchantPrincipal.getSpecialManagementDepName());
                    merchantDTO.setSpecialManagementDepName_multilang(MultiLangUtils.convertStringToMultiLangText((Object)merchantPrincipal.getSpecialManagementDepName()));
                }
            });
            return merchantDTOList;
        }
        return merchantDTOList;
    }

    List<MerchantDTO> fillDefaultMerchantSaleArea(List<MerchantDTO> merchantDTOList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantDTOList)) {
            HashMap merchantMap = new HashMap();
            HashSet merchantIds = new HashSet();
            HashSet orgIds = new HashSet();
            merchantDTOList.forEach(merchantDTO -> {
                merchantMap.put(merchantDTO.getId(), merchantDTO);
                merchantIds.add(merchantDTO.getId());
                orgIds.add(merchantDTO.getRangesOrgId());
            });
            if (CollectionUtils.isEmpty(merchantIds) || CollectionUtils.isEmpty(orgIds)) {
                return merchantDTOList;
            }
            HashMap merchantDefaultAreaMap = new HashMap();
            for (String orgId : orgIds) {
                List merchantSaleAreaList = this.merchantSaleAreaQryDao.listMerchantSaleAreaById(new ArrayList(merchantIds), orgId, Boolean.valueOf(true));
                if (CollectionUtils.isEmpty((Collection)merchantSaleAreaList)) continue;
                merchantSaleAreaList.forEach(merchantSaleArea -> merchantDefaultAreaMap.put(merchantSaleArea.getMerchantId() + "_" + merchantSaleArea.getOrgId(), merchantSaleArea));
            }
            merchantDTOList.forEach(merchantDTO -> {
                String key = merchantDTO.getId() + "_" + merchantDTO.getRangesOrgId();
                MerchantSaleAreaVO merchantSaleArea = (MerchantSaleAreaVO)merchantDefaultAreaMap.get(key);
                if (merchantSaleArea != null) {
                    merchantDTO.setCustomerArea(merchantSaleArea.getSaleAreaId());
                    merchantDTO.setCustomerAreaCode(merchantSaleArea.getSaleAreaId___code());
                    if (merchantSaleArea.getSaleAreaId___name() != null) {
                        merchantDTO.setCustomerAreaName(merchantSaleArea.getSaleAreaId___name().getText(InvocationInfoProxy.getLocale()));
                    }
                }
            });
            return merchantDTOList;
        }
        return merchantDTOList;
    }

    @Nullable
    private List<MerchantApplyRangeDTO> listMerchantApplyRangeDTOs(QuerySchema schema) throws Exception {
        List merchantMap = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        if (merchantMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantMap), MerchantApplyRangeDTO.class);
        }
        return null;
    }

    @Override
    public List<AgentFinancialDTO> listMerchantAgentFinancial(List<Long> ids, List<Long> merchantIds, Boolean stopStatus) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (ids == null && merchantIds == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801171);
        }
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantId", "merchantId");
        qryFields[2] = new QueryField("merchantId.name", "merchantName");
        qryFields[3] = new QueryField("bankAccount", "bankAccount");
        qryFields[4] = new QueryField("bank", "bank");
        qryFields[5] = new QueryField("openBank", "openBank");
        qryFields[6] = new QueryField("currency", "currency");
        qryFields[7] = new QueryField("accountType", "accountType");
        qryFields[8] = new QueryField("isDefault", "isDefault");
        qryFields[9] = new QueryField("bankAccountName", "bankAccountName");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (merchantIds != null && merchantIds.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in(merchantIds));
        }
        if (ids != null && ids.size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(ids));
        }
        if (stopStatus != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)stopStatus));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)false));
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List agentFinancialMap = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (QuerySchema)schema);
        if (agentFinancialMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)agentFinancialMap), AgentFinancialDTO.class);
        }
        return null;
    }

    @Override
    public List<AgentFinancialDTO> listMerchantAgentFinancial(AgentFinancialQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        if (qryDTO.getFields() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801308);
        }
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = false;
        if (qryDTO.getId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_ID).eq((Object)qryDTO.getId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_ID).in((Collection)qryDTO.getIds()));
            hasFilterItem = true;
        }
        if (qryDTO.getIfDefault() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_IS_DEFAULT).eq((Object)qryDTO.getIfDefault()));
            hasFilterItem = true;
        }
        if (qryDTO.getMerchantId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_MERCHANT_ID).eq((Object)qryDTO.getMerchantId()));
            hasFilterItem = true;
        }
        if (qryDTO.getCurrency() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_CURRENCY).eq((Object)qryDTO.getCurrency()));
            hasFilterItem = true;
        }
        if (qryDTO.getBankAccount() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_BANK_ACCOUNT).eq((Object)qryDTO.getBankAccount()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getBankAccountList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_BANK_ACCOUNT).in((Collection)qryDTO.getBankAccountList()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyBankAccount() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_BANK_ACCOUNT).like((Object)qryDTO.getFuzzyBankAccount()));
            hasFilterItem = true;
        }
        if (qryDTO.getOpenBank() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_OPEN_BANK).eq((Object)qryDTO.getOpenBank()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getOpenBankList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_OPEN_BANK).in((Collection)qryDTO.getOpenBankList()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyOpenBank() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_OPEN_BANK).like((Object)qryDTO.getFuzzyBankAccount()));
            hasFilterItem = true;
        }
        if (qryDTO.getCountry() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_COUNTRY).eq((Object)qryDTO.getCountry()));
            hasFilterItem = true;
        }
        if (qryDTO.getProvince() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"province").eq((Object)qryDTO.getProvince()));
            hasFilterItem = true;
        }
        if (qryDTO.getJointLineNo() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_JOINT_LINE_NO).eq((Object)qryDTO.getJointLineNo()));
            hasFilterItem = true;
        }
        if (qryDTO.getRemarks() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_REMARKS).eq((Object)qryDTO.getRemarks()));
            hasFilterItem = true;
        }
        if (qryDTO.getSwiftCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_FINANCIAL_SWIFT_CODE).eq((Object)qryDTO.getSwiftCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"stopstatus").eq((Object)qryDTO.getStopStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getAgentBankForElectronic() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.AGENT_BANK_FOR_ELECTRONIC).eq((Object)qryDTO.getAgentBankForElectronic()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getBankAccountName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"bankAccountName").eq((Object)qryDTO.getBankAccountName()));
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAgentFinancialFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List agentFinancialMap = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (QuerySchema)schema);
        if (agentFinancialMap != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)agentFinancialMap), AgentFinancialDTO.class);
        }
        return null;
    }

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts) throws Exception {
        Pager pager = this.listMerchantApplyRangeByPageDTO(pageIndex, pageSize, funcTypeList, pubts);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long merchantId) throws Exception {
        Pager pager = this.listMerchantApplyRangeByPageDTO(pageIndex, pageSize, funcTypeList, pubts, merchantId);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long merchantId, Boolean isShowGlobal) throws Exception {
        Pager pager = this.listMerchantApplyRangeByPageDTO(pageIndex, pageSize, funcTypeList, pubts, merchantId, isShowGlobal);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeByPageDTOV2(MerchantApplyRangeErpQryDTO merchantApplyRangeErpQryDTO) throws Exception {
        Pager pager = this.listMerchantApplyRangeByPageDTO(merchantApplyRangeErpQryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts) throws Exception {
        Pager pager = this.listMerchantApplyRangeDetailByPageDTO(pageIndex, pageSize, funcTypeList, pubts);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long id) throws Exception {
        Pager pager = this.listMerchantApplyRangeDetailByPageDTO(pageIndex, pageSize, funcTypeList, pubts, id);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long id, Boolean isShowGlobal) throws Exception {
        Pager pager = this.listMerchantApplyRangeDetailByPageDTO(pageIndex, pageSize, funcTypeList, pubts, id, isShowGlobal);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(MerchantApplyRangeDetailErpQryDTO merchantApplyRangeDetailErpQryDTO) throws Exception {
        Pager pager = this.listMerchantApplyRangeDetailByPageDTO(merchantApplyRangeDetailErpQryDTO);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager listMerchantApplyRangeByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts) throws Exception {
        return this.listMerchantApplyRangeByPageDTO(pageIndex, pageSize, funcTypeList, pubts, null);
    }

    @Override
    public Pager listMerchantApplyRangeByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long merchantId) throws Exception {
        return this.listMerchantApplyRangeByPageDTO(pageIndex, pageSize, funcTypeList, pubts, merchantId, true);
    }

    @Override
    public Pager listMerchantApplyRangeByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long merchantId, Boolean isShowGlobal) throws Exception {
        MerchantApplyRangeErpQryDTO merchantApplyRangeErpQryDTO = new MerchantApplyRangeErpQryDTO();
        merchantApplyRangeErpQryDTO.setPageIndex(pageIndex);
        merchantApplyRangeErpQryDTO.setPageSize(pageSize);
        merchantApplyRangeErpQryDTO.setFuncTypeList(funcTypeList);
        merchantApplyRangeErpQryDTO.setPubts(pubts);
        merchantApplyRangeErpQryDTO.setMerchantId(merchantId);
        merchantApplyRangeErpQryDTO.setShowGlobal(isShowGlobal);
        return this.listMerchantApplyRangeByPageDTO(merchantApplyRangeErpQryDTO);
    }

    @Override
    public Pager listMerchantApplyRangeByPageDTO(MerchantApplyRangeErpQryDTO merchantApplyRangeErpQryDTO) throws Exception {
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("orgId", "orgId");
        qryFields[2] = new QueryField("merchantId", "merchantId");
        if (merchantApplyRangeErpQryDTO.getPageSize() == null || merchantApplyRangeErpQryDTO.getPageSize() > 1000) {
            merchantApplyRangeErpQryDTO.setPageSize(Integer.valueOf(1000));
        }
        HashSet<String> funcOrgId = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeErpQryDTO.getFuncTypeList())) {
            for (String funcType : merchantApplyRangeErpQryDTO.getFuncTypeList()) {
                List funcOrgList = this.funcOrgDataQryService.listAll(null, (String)AppContext.getYTenantId(), "diwork", funcType);
                if (CollectionUtils.isEmpty((Collection)funcOrgList)) continue;
                for (FuncOrg funcOrg : funcOrgList) {
                    funcOrgId.add(funcOrg.getId());
                }
            }
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"pubts").egt((Object)merchantApplyRangeErpQryDTO.getPubts())});
        if (!CollectionUtils.isEmpty(funcOrgId)) {
            if (merchantApplyRangeErpQryDTO.getShowGlobal() != null && !merchantApplyRangeErpQryDTO.getShowGlobal().booleanValue()) {
                funcOrgId.remove("666666");
            }
            if (!CollectionUtils.isEmpty(funcOrgId)) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BDA", (String)"\u67e5\u8be2[{}]\u804c\u80fd\u7684\u7ec4\u7ec7id:{}"), (Object)merchantApplyRangeErpQryDTO.getFuncTypeList(), funcOrgId);
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(funcOrgId));
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801309, new Object[]{JSON.toJSONString((Object)merchantApplyRangeErpQryDTO.getFuncTypeList())});
            }
        }
        if (merchantApplyRangeErpQryDTO.getMerchantId() != null) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BEB", (String)"\u67e5\u8be2\u804c\u80fd\u7684\u7ec4\u7ec7\u63a5\u53e3_merchantId:{}"), (Object)merchantApplyRangeErpQryDTO.getMerchantId());
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantApplyRangeErpQryDTO.getMerchantId()));
        }
        if (merchantApplyRangeErpQryDTO.getExistPotential() != null && !merchantApplyRangeErpQryDTO.getExistPotential().booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId.isExistPotential").eq((Object)IsExistPotential.allRegularCust.getValue()));
        } else if (merchantApplyRangeErpQryDTO.getExistPotential() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId.isExistPotential").eq((Object)IsExistPotential.partProspectCust.getValue()));
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantApplyRangeErpQryDTO.getPageIndex().intValue(), merchantApplyRangeErpQryDTO.getPageSize().intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        return pager;
    }

    @Override
    public Pager listMerchantApplyRangeDetailByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts) throws Exception {
        return this.listMerchantApplyRangeDetailByPageDTO(pageIndex, pageSize, funcTypeList, pubts, null);
    }

    @Override
    public Pager listMerchantApplyRangeDetailByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long id) throws Exception {
        return this.listMerchantApplyRangeDetailByPageDTO(pageIndex, pageSize, funcTypeList, pubts, id, true);
    }

    @Override
    public Pager listMerchantApplyRangeDetailByPageDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, String pubts, Long id, Boolean isShowGlobal) throws Exception {
        MerchantApplyRangeDetailErpQryDTO merchantApplyRangeDetailErpQryDTO = new MerchantApplyRangeDetailErpQryDTO();
        merchantApplyRangeDetailErpQryDTO.setPageIndex(pageIndex);
        merchantApplyRangeDetailErpQryDTO.setPageSize(pageSize);
        merchantApplyRangeDetailErpQryDTO.setFuncTypeList(funcTypeList);
        merchantApplyRangeDetailErpQryDTO.setPubts(pubts);
        merchantApplyRangeDetailErpQryDTO.setMerchantId(id);
        merchantApplyRangeDetailErpQryDTO.setShowGlobal(isShowGlobal);
        return this.listMerchantApplyRangeDetailByPageDTO(merchantApplyRangeDetailErpQryDTO);
    }

    @Override
    public Pager listMerchantApplyRangeDetailByPageDTO(MerchantApplyRangeDetailErpQryDTO merchantApplyRangeDetailErpQryDTO) throws Exception {
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantApplyRangeDetailFieldMapping);
        if (merchantApplyRangeDetailErpQryDTO.getPageSize() == null || merchantApplyRangeDetailErpQryDTO.getPageSize() > 1000) {
            merchantApplyRangeDetailErpQryDTO.setPageSize(Integer.valueOf(1000));
        }
        if (merchantApplyRangeDetailErpQryDTO.getPageIndex() == null) {
            merchantApplyRangeDetailErpQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        HashSet<String> funcOrgId = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailErpQryDTO.getFuncTypeList())) {
            for (String funcType : merchantApplyRangeDetailErpQryDTO.getFuncTypeList()) {
                List funcOrgList = this.funcOrgDataQryService.listAll(null, (String)AppContext.getYTenantId(), "diwork", funcType);
                if (CollectionUtils.isEmpty((Collection)funcOrgList)) continue;
                for (FuncOrg funcOrg : funcOrgList) {
                    funcOrgId.add(funcOrg.getId());
                }
            }
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"pubts").egt((Object)merchantApplyRangeDetailErpQryDTO.getPubts()), QueryCondition.name((String)"ytenant").eq((Object)InvocationInfoProxy.getTenantid())});
        if (!CollectionUtils.isEmpty(funcOrgId)) {
            if (merchantApplyRangeDetailErpQryDTO.getShowGlobal() != null && !merchantApplyRangeDetailErpQryDTO.getShowGlobal().booleanValue()) {
                funcOrgId.remove("666666");
            }
            if (!CollectionUtils.isEmpty(funcOrgId)) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BDA", (String)"\u67e5\u8be2[{}]\u804c\u80fd\u7684\u7ec4\u7ec7id:{}"), (Object)merchantApplyRangeDetailErpQryDTO.getFuncTypeList(), funcOrgId);
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(funcOrgId));
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801309, new Object[]{JSON.toJSONString((Object)merchantApplyRangeDetailErpQryDTO.getFuncTypeList())});
            }
        }
        if (merchantApplyRangeDetailErpQryDTO.getMerchantId() != null) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BE0", (String)"\u67e5\u8be2\u804c\u80fd\u7684\u7ec4\u7ec7\u63a5\u53e3listMerchantApplyRangeDetailByPageDTO_Id:{}"), (Object)merchantApplyRangeDetailErpQryDTO.getMerchantId());
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantDetailId.merchantId").eq((Object)merchantApplyRangeDetailErpQryDTO.getMerchantId()));
        }
        if (merchantApplyRangeDetailErpQryDTO.getExistPotential() != null && !merchantApplyRangeDetailErpQryDTO.getExistPotential().booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId.isExistPotential").eq((Object)IsExistPotential.allRegularCust.getValue()));
        } else if (merchantApplyRangeDetailErpQryDTO.getExistPotential() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId.isExistPotential").eq((Object)IsExistPotential.partProspectCust.getValue()));
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantApplyRangeDetailErpQryDTO.getPageIndex().intValue(), merchantApplyRangeDetailErpQryDTO.getPageSize().intValue());
        schema.setPartitionable(false);
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        return pager;
    }

    @Override
    public Pager listMerchantApplyRangeDetailByShopTypeDTO(Integer pageIndex, Integer pageSize, List<String> funcTypeList, Long shopType, Boolean isShowGlobal) throws Exception {
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantApplyRangeDetailFieldMapping);
        if (pageSize == null || pageSize > 1000) {
            pageSize = 1000;
        }
        HashSet<String> funcOrgId = new HashSet<String>();
        if (!CollectionUtils.isEmpty(funcTypeList)) {
            int i = 0;
            for (String funcType : funcTypeList) {
                List orgExternalId;
                List funcOrgList;
                if (i > 50) break;
                if (shopType != 1L && !CollectionUtils.isEmpty((Collection)(funcOrgList = this.funcOrgDataQryService.listAll(null, (String)AppContext.getYTenantId(), "diwork", funcType)))) {
                    for (FuncOrg funcOrg : funcOrgList) {
                        funcOrgId.add(funcOrg.getId());
                    }
                }
                if (shopType != 0L && !CollectionUtils.isEmpty((Collection)(orgExternalId = this.orgExternalQryService.listExternalOrgs((String)AppContext.getYTenantId(), "diwork", funcType)))) {
                    funcOrgId.addAll(orgExternalId);
                }
                ++i;
            }
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!CollectionUtils.isEmpty(funcOrgId)) {
            if (isShowGlobal != null && !isShowGlobal.booleanValue()) {
                funcOrgId.remove("666666");
            }
            if (!CollectionUtils.isEmpty(funcOrgId)) {
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080BDA", (String)"\u67e5\u8be2[{}]\u804c\u80fd\u7684\u7ec4\u7ec7id:{}"), funcTypeList, funcOrgId);
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(funcOrgId));
            }
        }
        if (shopType != null) {
            if (shopType == 0L) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"rangeType").eq((Object)1));
            } else if (shopType == 1L) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"rangeType").eq((Object)3));
            }
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"rangeType").eq((Object)1));
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        return pager;
    }

    @Override
    public void writeBackToNcc(UPCBillDataDTO apiMethodDTO) throws Exception {
        if (StringUtils.isEmpty((CharSequence)apiMethodDTO.getFullname()) || CollectionUtils.isEmpty((Collection)apiMethodDTO.getData())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801310);
        }
        ArrayList<BizObject> initData = new ArrayList<BizObject>();
        List data = new ArrayList();
        if (apiMethodDTO.getData() instanceof List) {
            data = apiMethodDTO.getData();
        }
        if (!CollectionUtils.isEmpty(data)) {
            for (Map dataMap : data) {
                BizObject bizObject = new BizObject();
                bizObject.init(dataMap);
                bizObject.setEntityStatus(EntityStatus.Update);
                bizObject.setId((Object)Long.parseLong(bizObject.getId().toString()));
                initData.add(bizObject);
            }
            MetaDaoHelper.update((String)apiMethodDTO.getFullname(), initData);
        }
    }

    @Override
    public List<InvoicingCustomersDTO> getInvoicingCustomers(Long merchantId, String saleOrgId) throws Exception {
        QuerySchema schema;
        List invoicingCustomers;
        UpcAPiTool.checkTenantInfo();
        if (merchantId == null || saleOrgId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801311);
        }
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantId", "merchantId");
        qryFields[2] = new QueryField("invoicingCustomersId", "invoicingCustomersId");
        qryFields[3] = new QueryField("invoicingCustomersId.code", "invoicingCustomersCode");
        qryFields[4] = new QueryField("merchantApplyRangeId", "merchantApplyRangeId");
        qryFields[5] = new QueryField("isDefault", "ifDefault");
        qryFields[6] = new QueryField("tenant", "tenantId");
        qryFields[7] = new QueryField("invoicingCustomersId.name", "invoicingCustomersName");
        qryFields[8] = new QueryField("merchantApplyRangeId.orgId", "orgId");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantId));
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (!orgGlobalShare.booleanValue()) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)saleOrgId));
        }
        if ((invoicingCustomers = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup)))) != null) {
            return JSON.parseArray((String)JSON.toJSONString((Object)invoicingCustomers), InvoicingCustomersDTO.class);
        }
        List invoicingCustomersDTOs = null;
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomers)) {
            invoicingCustomersDTOs = JSON.parseArray((String)JSON.toJSONString((Object)invoicingCustomers), InvoicingCustomersDTO.class);
            invoicingCustomersDTOs.forEach(invoicingCustomersDTO -> invoicingCustomersDTO.setMerchantApplyRangeOrgId(StringUtils.isNotEmpty((CharSequence)invoicingCustomersDTO.getOrgId()) && ToolUtils.isNumber((String)invoicingCustomersDTO.getOrgId()) ? Long.valueOf(invoicingCustomersDTO.getOrgId()) : null));
        }
        return invoicingCustomersDTOs;
    }

    @Override
    public List<AddressInfoDTO> listAddressInfoDTO(Long merchantId, Long addressInfoId) throws Exception {
        QuerySchema schema;
        List addressInfoList;
        UpcAPiTool.checkTenantInfo();
        if (merchantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801312);
        }
        QueryField[] qryFields = new QueryField[32];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantId", "merchantId");
        qryFields[2] = new QueryField("addressCode", "addressCode");
        qryFields[3] = new QueryField("regionCode", "regionCode");
        qryFields[4] = new QueryField("address", "address");
        qryFields[5] = new QueryField("zipCode", "zipCode");
        qryFields[6] = new QueryField("receiver", "receiver");
        qryFields[7] = new QueryField("mobile", "mobile");
        qryFields[8] = new QueryField("telePhone", "telePhone");
        qryFields[9] = new QueryField("email", "email");
        qryFields[10] = new QueryField("qq", "qq");
        qryFields[11] = new QueryField("weChat", "weChat");
        qryFields[12] = new QueryField("remarks", "remarks");
        qryFields[13] = new QueryField("mergerName", "mergerName");
        qryFields[14] = new QueryField("erpCode", "erpCode");
        qryFields[15] = new QueryField("receivingWarehouse", "receivingWarehouse");
        qryFields[16] = new QueryField("receivingWarehouse.name", "receivingWarehouse_Name");
        qryFields[17] = new QueryField("shipregion", "shipregion");
        qryFields[18] = new QueryField("shipregion.name", "shipregion_Name");
        qryFields[19] = new QueryField("isDefault", "isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantId));
        if (addressInfoId != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)addressInfoId));
        }
        if (!CollectionUtils.isEmpty((Collection)(addressInfoList = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)(schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup)))))) {
            return JSON.parseArray((String)JSON.toJSONString((Object)addressInfoList), AddressInfoDTO.class);
        }
        return null;
    }

    @Override
    public Integer getMerchantApplyRangeCount(List<String> ordIds) throws Exception {
        QuerySchema schema;
        List merchantCount;
        UpcAPiTool.checkTenantInfo();
        if (ordIds != null && ordIds.size() > 500) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801313);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (!orgGlobalShare.booleanValue() && !CollectionUtils.isEmpty(ordIds)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in(ordIds));
        }
        if (!CollectionUtils.isEmpty((Collection)(merchantCount = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1) as merchantCount").addCondition((ConditionExpression)queryConditionGroup)))))) {
            return Integer.parseInt(((Map)merchantCount.get(0)).get("merchantCount").toString());
        }
        return 0;
    }

    @Override
    public List<AddressInfoDTO> getAddressInfoById(List<Long> ids) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{ids});
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty(ids)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(ids));
        }
        QueryField[] qryFields = new QueryField[]{new QueryField("id", "id"), new QueryField("province", "province"), new QueryField("country", "country"), new QueryField("city", "city"), new QueryField("area", "area"), new QueryField("email", "email"), new QueryField("addressId", "addressId"), new QueryField("address", "address"), new QueryField("receiver", "receiver"), new QueryField("region", "region"), new QueryField("regionCode", "regionCode"), new QueryField("longitude", "longitude"), new QueryField("latitude", "latitude"), new QueryField("mobile", "mobile"), new QueryField("telePhone", "telePhone"), new QueryField("isDefault", "isDefault"), new QueryField("zipCode", "zipCode"), new QueryField("shippingAddressErpCode", "shippingAddressErpCode"), new QueryField("weChat", "weChat"), new QueryField("qq", "qq"), new QueryField("remarks", "remarks"), new QueryField("receivingWarehouse", "receivingWarehouse"), new QueryField("shipregion", "shipregion"), new QueryField("stopStatus", "stopStatus")};
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List addressInfo = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)addressInfo)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)addressInfo), AddressInfoDTO.class);
        }
        return null;
    }

    @Override
    public List<AddressInfoDTO> listAddressInfo(AddressInfoQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantAddressInfoFieldMapping);
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAddressInfoFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List addressInfo = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)addressInfo)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)addressInfo), AddressInfoDTO.class);
        }
        return null;
    }

    public UPCPager addressInfoByPageV2(AddressInfoQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.addressInfoByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager addressInfoByPage(AddressInfoQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkListLength((Object)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (qryDTO.getMerchantId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)qryDTO.getMerchantId()));
        }
        if (qryDTO.getAddress() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"address").like((Object)qryDTO.getAddress()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAddressInfoFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), AddressInfoDTO.class));
        }
        return pager;
    }

    @Override
    public List<ContactDTO> listContact(ContactQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        UpcAPiTool.checkPara((String[])qryDTO.getFields());
        UpcAPiTool.checkListLength((Object)qryDTO);
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantContractFieldMapping);
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantContractFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List contactMap = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)contactMap)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)contactMap), ContactDTO.class);
        }
        return null;
    }

    public UPCPager contactByPageV2(ContactQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.contactByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager contactByPage(ContactQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkListLength((Object)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (qryDTO.getId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_ID).eq((Object)qryDTO.getId()));
        }
        if (qryDTO.getMerchantId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_MERCHANT_ID).eq((Object)qryDTO.getMerchantId()));
        }
        if (qryDTO.getMobile() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_MOBILE).eq((Object)qryDTO.getMobile()));
        }
        if (qryDTO.getFullName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_FULL_NAME).eq((Object)qryDTO.getFullName()));
        }
        if (qryDTO.getFuzzyFullName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_FULL_NAME).like((Object)qryDTO.getFuzzyFullName()));
        }
        if (qryDTO.getDefaultContact() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)FieldConstant.CONTACT_DEFAULT_CONTACT).eq((Object)qryDTO.getDefaultContact()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantContractFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), ContactDTO.class));
        }
        return pager;
    }

    @Override
    public Long getStaffMerchantIdByYhtUserId(String yhtUserId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String)yhtUserId);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"yhtUserId").eq((Object)yhtUserId)});
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QuerySchema schema = QuerySchema.create().addSelect("merchantId").addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List merchantIdMap = MetaDaoHelper.query((String)"aa.merchant.MerchantStaff", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantIdMap) && merchantIdMap.get(0) != null) {
            return Long.getLong(((Map)merchantIdMap.get(0)).get("merchantId").toString());
        }
        return null;
    }

    @Override
    public List<SaleAreaDTO> listSaleArea(SaleAreaQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (qryDTO.getParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)qryDTO.getParent()));
            hasFilterItem = true;
        }
        if (qryDTO.getParents() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").in((Collection)qryDTO.getParents()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").like((Object)qryDTO.getFuzzyParent()));
            hasFilterItem = true;
        }
        if (qryDTO.getPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").eq((Object)qryDTO.getPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").like((Object)qryDTO.getFuzzyPath()));
            hasFilterItem = true;
        }
        if (qryDTO.getLevel() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"level").eq((Object)qryDTO.getLevel()));
            hasFilterItem = true;
        }
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List contactMap = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)contactMap)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)contactMap), SaleAreaDTO.class);
        }
        return null;
    }

    public UPCPager saleAreaByPageV2(SaleAreaQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.SaleAreaByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager SaleAreaByPage(SaleAreaQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (qryDTO.getParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").eq((Object)qryDTO.getParent()));
        }
        if (qryDTO.getFuzzyParent() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parent").like((Object)qryDTO.getFuzzyParent()));
        }
        if (qryDTO.getPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").eq((Object)qryDTO.getPath()));
        }
        if (qryDTO.getFuzzyPath() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"path").like((Object)qryDTO.getPath()));
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantSaleAreaFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.salearea.SaleArea", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), SaleAreaDTO.class));
        }
        return pager;
    }

    @Override
    public List<AgentLevelDTO> listAgentLevel(AgentLevelQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAgentLevelFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List contactMap = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)contactMap)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)contactMap), AgentLevelDTO.class);
        }
        return null;
    }

    public UPCPager agentLevelByPageV2(AgentLevelQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.AgentLevelByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager AgentLevelByPage(AgentLevelQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantAgentLevelFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), AgentLevelDTO.class));
        }
        return pager;
    }

    @Override
    public List<CustomerTradeDTO> listCustomerTrade(CustomerTradeQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        boolean hasFilterItem = this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        if (!hasFilterItem) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerTradeFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List contactMap = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)contactMap)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)contactMap), CustomerTradeDTO.class);
        }
        return null;
    }

    public UPCPager customerTradeByPageV2(CustomerTradeQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        Pager pager = this.customerTradeByPage(qryDTO, pageIndex, pageSize);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public UPCPager listMerchantApplyRangeDetailByShopTypeDTOV2(Integer pageIndex, Integer pageSize, List<String> funcTypeList, Long shopType, Boolean isShowGlobal) throws Exception {
        Pager pager = this.listMerchantApplyRangeDetailByShopTypeDTO(pageIndex, pageSize, funcTypeList, shopType, isShowGlobal);
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    @Override
    public Pager customerTradeByPage(CustomerTradeQryDTO qryDTO, Integer pageIndex, Integer pageSize) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkQryDTO((MerchantDerivativeBaseQryDTO)qryDTO);
        if (pageIndex == null) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == null || pageSize > UpcAPiTool.PAGE_MAX_SIZE) {
            pageSize = UpcAPiTool.PAGE_MAX_SIZE;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        this.setQueryConditionGroupByDerivativeBaseQryDTO((MerchantDerivativeBaseQryDTO)qryDTO, queryConditionGroup);
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantCustomerTradeFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex.intValue(), pageSize.intValue());
        Pager pager = MetaDaoHelper.queryByPage((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema);
        if (pager != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), CustomerTradeDTO.class));
        }
        return pager;
    }

    private void setOrderSchemaFieldByBaseQryDTO(MerchantBaseQryDTO baseQryDTO, QuerySchema schema) {
        if (!CollectionUtils.isEmpty((Collection)baseQryDTO.getAscField())) {
            for (String field : baseQryDTO.getAscField()) {
                if (MerchantAPIUtils.merchantAllFieldMapping.get(field) == null) continue;
                schema.addOrderBy((String)MerchantAPIUtils.merchantAllFieldMapping.get(field));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)baseQryDTO.getDescField())) {
            for (String filed : baseQryDTO.getDescField()) {
                if (MerchantAPIUtils.merchantAllFieldMapping.get(filed) == null) continue;
                schema.addOrderBy((String)MerchantAPIUtils.merchantAllFieldMapping.get(filed) + " desc");
            }
        }
    }

    private Boolean setQueryConditionGroupByDerivativeBaseQryDTO(MerchantDerivativeBaseQryDTO qryDTO, QueryConditionGroup queryConditionGroup) {
        Boolean hasFilterItem = false;
        if (qryDTO.getId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)qryDTO.getId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getIds()));
            hasFilterItem = true;
        }
        if (qryDTO.getCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)qryDTO.getCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyCode()));
            hasFilterItem = true;
        }
        if (qryDTO.getName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)qryDTO.getName()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyNameAndCode() != null) {
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyNameAndCode()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyNameAndCode())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getShopId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"shop").eq((Object)qryDTO.getShopId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getCodeList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getCodeList()));
            hasFilterItem = true;
        }
        if (!StringUtils.isEmpty((CharSequence)qryDTO.getTaxRateId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(new Object[]{qryDTO.getTaxRateId()}));
            hasFilterItem = true;
        }
        return hasFilterItem;
    }

    private Boolean setQueryConditionGroupByMerchantQryDTO(MerchantQryDTO qryDTO, QueryConditionGroup queryConditionGroup) {
        Boolean hasFilterItem = false;
        Boolean hasConditionByOrgGlobal = this.isHasConditionByOrgGlobal(qryDTO);
        if (qryDTO.getOrgIdNew() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)qryDTO.getOrgIdNew()));
            hasFilterItem = true;
        } else if (qryDTO.getOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").eq((Object)qryDTO.getOrgId().toString()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getOrgIdListNew())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").in((Collection)qryDTO.getOrgIdListNew()));
            hasFilterItem = true;
        } else if (qryDTO.getOrgIdList() != null && qryDTO.getOrgIdList().size() > 0) {
            ArrayList<String> orgIdList = new ArrayList<String>();
            for (Long orgId : qryDTO.getOrgIdList()) {
                if (orgId == null) continue;
                orgIdList.add(orgId.toString());
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.orgId").in(orgIdList));
            hasFilterItem = true;
        }
        if (qryDTO.getDetailStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.merchantDetailId.stopstatus").eq((Object)qryDTO.getDetailStopStatus()));
            hasFilterItem = true;
        }
        if (qryDTO.getMerchantApplyRangeId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.id").eq((Object)qryDTO.getMerchantApplyRangeId()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreator() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)qryDTO.getCreator()));
            hasFilterItem = true;
        }
        if (qryDTO.getCustomerLevel() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.merchantDetailId.customerLevel").eq((Object)qryDTO.getCustomerLevel()));
            hasFilterItem = true;
        }
        if (qryDTO.getContacterDefault() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantContacterInfos.isDefault").eq((Object)qryDTO.getContacterDefault()));
            hasFilterItem = true;
        }
        if (qryDTO.getAddressInfoDefault() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAddressInfos.isDefault").eq((Object)qryDTO.getAddressInfoDefault()));
            hasFilterItem = true;
        }
        if (qryDTO.getAgentInvoiceBillingType() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAgentInvoiceInfos.billingType").eq((Object)qryDTO.getAgentInvoiceBillingType()));
            hasFilterItem = true;
        }
        if (qryDTO.getAgentInvoiceTaxNo() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAgentInvoiceInfos.taxNo").eq((Object)qryDTO.getAgentInvoiceTaxNo()));
            hasFilterItem = true;
        }
        if (qryDTO.getAgentInvoiceDefaultInvoice() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAgentInvoiceInfos.isDefault").eq((Object)qryDTO.getAgentInvoiceDefaultInvoice()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyTaxNoAndName() != null) {
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantAgentInvoiceInfos.taxNo").like((Object)qryDTO.getFuzzyTaxNoAndName()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyTaxNoAndName())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getSalesOrg() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isSalesOrg").eq((Object)qryDTO.getSalesOrg()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getBusinessRole())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantRole.businessRole").like((Object)qryDTO.getBusinessRole()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getAgentInvoiceBdBillingType())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAgentInvoiceInfos.bdBillingType").eq((Object)qryDTO.getAgentInvoiceBdBillingType()));
            hasFilterItem = true;
        }
        if (qryDTO.getPotential() != null && !"2".equals(qryDTO.getPotential())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isPotential").eq((Object)qryDTO.getPotential()));
            hasFilterItem = true;
        }
        if (qryDTO.getTradeCustomers() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.merchantDetailId.isTradeCustomers").eq((Object)qryDTO.getTradeCustomers()));
            hasFilterItem = true;
        }
        Boolean hasFilterItemByBaseQryDTO = this.setQueryConditionGroupByMerchantBaseQryDTO((MerchantBaseQryDTO)qryDTO, queryConditionGroup);
        return hasFilterItem != false || hasFilterItemByBaseQryDTO != false || hasConditionByOrgGlobal != false;
    }

    private Boolean isHasConditionByOrgGlobal(MerchantQryDTO qryDTO) {
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        boolean isHasConditionByOrgGlobal = false;
        if (orgGlobalShare.booleanValue()) {
            if (qryDTO.getOrgIdNew() != null) {
                qryDTO.setOrgIdNew(null);
                isHasConditionByOrgGlobal = true;
            }
            if (qryDTO.getOrgId() != null) {
                qryDTO.setOrgId(null);
                isHasConditionByOrgGlobal = true;
            }
            if (qryDTO.getOrgIdListNew() != null) {
                qryDTO.setOrgIdListNew(null);
                isHasConditionByOrgGlobal = true;
            }
            if (qryDTO.getOrgIdList() != null) {
                qryDTO.setOrgIdList(null);
                isHasConditionByOrgGlobal = true;
            }
        }
        return isHasConditionByOrgGlobal;
    }

    private Boolean setQueryConditionGroupByMerchantBaseQryDTO(MerchantBaseQryDTO qryDTO, QueryConditionGroup queryConditionGroup) {
        boolean hasFilterItem = false;
        if (qryDTO.getMerchantId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)qryDTO.getMerchantId()));
            hasFilterItem = true;
        }
        if (qryDTO.getMerchantIdList() != null && qryDTO.getMerchantIdList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)qryDTO.getMerchantIdList()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getNames())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").in((Collection)qryDTO.getNames()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyName()));
            hasFilterItem = true;
        }
        if (StringUtils.isNotBlank((CharSequence)qryDTO.getFuzzyName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyName()));
            hasFilterItem = true;
        }
        if (qryDTO.getRetailInvestors() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"retailInvestors").in(new Object[]{qryDTO.getRetailInvestors()}));
            hasFilterItem = true;
        }
        if (qryDTO.getCustomerClass() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"customerClass").eq((Object)qryDTO.getCustomerClass()));
            hasFilterItem = true;
        }
        if (qryDTO.getParentCustomer() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"parentCustomer").eq((Object)qryDTO.getParentCustomer()));
            hasFilterItem = true;
        }
        if (qryDTO.getInternalOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrgId").eq((Object)qryDTO.getInternalOrgId()));
            hasFilterItem = true;
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getInternalOrgIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrgId").in((Collection)qryDTO.getInternalOrgIdList()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreateMerchant() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createMerchant").eq((Object)qryDTO.getCreateMerchant()));
            hasFilterItem = true;
        }
        if (qryDTO.getCodeList() != null && qryDTO.getCodeList().size() > 0) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in((Collection)qryDTO.getCodeList()));
            hasFilterItem = true;
        }
        if (qryDTO.getFuzzyNameAndCode() != null) {
            QueryConditionGroup orConditionGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").like((Object)qryDTO.getFuzzyNameAndCode()), QueryCondition.name((String)"name").like((Object)qryDTO.getFuzzyNameAndCode())});
            queryConditionGroup.addCondition((ConditionExpression)orConditionGroup);
            hasFilterItem = true;
        }
        if (qryDTO.getCreateOrg() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createOrg").eq((Object)qryDTO.getCreateOrg()));
            hasFilterItem = true;
        }
        if (qryDTO.getInternalOrg() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"internalOrg").eq((Object)qryDTO.getInternalOrg()));
            hasFilterItem = true;
        }
        if (qryDTO.getCreditCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)qryDTO.getCreditCode()));
            hasFilterItem = true;
        }
        return hasFilterItem;
    }

    @Override
    public List<MerchantRoleInfoDTO> getMerchantRoleInfo(MerchantRoleInfoQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantRoleInfoFieldMapping);
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantRoleInfoFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List merchantRoleInfo = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantRoleInfo)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantRoleInfo), MerchantRoleInfoDTO.class);
        }
        return null;
    }

    @Override
    public List<MerchantStaffDTO> getMerchantStaff(MerchantStaffQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantStaffFieldMapping);
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantStaffFieldMapping, (String[])qryDTO.getFields());
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List merchantStaff = MetaDaoHelper.query((String)"aa.merchant.MerchantStaff", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantStaff)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantStaff), MerchantStaffDTO.class);
        }
        return null;
    }

    @Override
    public List<MerchantManagerDTO> getMerchantManager(MerchantManagerQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantManagerFieldMapping);
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantManagerFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List merchantManager = MetaDaoHelper.query((String)"aa.merchant.MerchantsManager", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantManager)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantManager), MerchantManagerDTO.class);
        }
        return null;
    }

    @Override
    public List<MerchantApplyRangeDetailDTO> listMerchantApplyRangeDetail(MerchantApplyRangeDetailQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, (Map)MerchantAPIUtils.merchantApplyRangeDetailFieldMapping);
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        if (orgGlobalShare.booleanValue()) {
            if (qryDTO.getMerchantApplyRangeOrgId() != null && queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
            if (!CollectionUtils.isEmpty((Collection)qryDTO.getMerchantApplyRangeOrgIdList()) && queryConditionGroup == null) {
                queryConditionGroup = new QueryConditionGroup();
            }
        } else {
            if (qryDTO.getMerchantApplyRangeOrgId() != null) {
                if (queryConditionGroup == null) {
                    queryConditionGroup = new QueryConditionGroup();
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)qryDTO.getMerchantApplyRangeOrgId()));
            }
            if (!CollectionUtils.isEmpty((Collection)qryDTO.getMerchantApplyRangeOrgIdList())) {
                if (queryConditionGroup == null) {
                    queryConditionGroup = new QueryConditionGroup();
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").in((Collection)qryDTO.getMerchantApplyRangeOrgIdList()));
            }
        }
        if (queryConditionGroup == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801141);
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        QueryField[] qryFields = UpcAPiTool.qryFields((HashMap)MerchantAPIUtils.merchantApplyRangeDetailFieldMapping, (String[])qryDTO.getFields());
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        AppContext.setThreadContext((String)"INCLUDE_SHOP_PARITION_QUERY_SCHEMA", (Object)false);
        schema.setPartitionable(false);
        List merchantManager = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)merchantManager)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)merchantManager), MerchantApplyRangeDetailDTO.class);
        }
        return null;
    }

    @Override
    public List<Long> getMerchantIdBysaleAreaId(Long saleAreaId, Boolean statue) throws Exception {
        QuerySchema schema;
        UpcAPiTool.checkTenantInfo();
        ArrayList<Long> saleAreaIds = new ArrayList<Long>();
        if (statue.booleanValue()) {
            saleAreaIds.add(saleAreaId);
        } else {
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)saleAreaId)}));
            List saleAreaIdList = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)saleAreaIdList)) {
                saleAreaIdList.forEach(map -> saleAreaIds.add((Long)map.get("id")));
            }
        }
        schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerArea").in(saleAreaIds)}));
        schema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List merchantIdList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
        ArrayList<Long> merchantIds = new ArrayList<Long>();
        if (!CollectionUtils.isEmpty((Collection)merchantIdList)) {
            merchantIdList.forEach(map -> merchantIds.add((Long)map.get("id")));
        }
        return merchantIds;
    }

    @Override
    public List<MerchantCustomerAreaDTO> queryMerchantCustomerArea(MerchantCustomerAreaQryDTO merchantCustomerAreaQry) throws Exception {
        Boolean orgGlobalShare;
        if (merchantCustomerAreaQry == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getMerchantIdList()) && CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getSaleAreaIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801314);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getMerchantIdList())) {
            if (merchantCustomerAreaQry.getMerchantIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801315);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in((Collection)merchantCustomerAreaQry.getMerchantIdList()));
        }
        if ((orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant")).booleanValue() && !CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getOrgIdIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
        } else if (!CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getOrgIdIdList())) {
            if (merchantCustomerAreaQry.getOrgIdIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801316);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").in((Collection)merchantCustomerAreaQry.getOrgIdIdList()));
        }
        if (!CollectionUtils.isEmpty((Collection)merchantCustomerAreaQry.getSaleAreaIdList())) {
            if (merchantCustomerAreaQry.getSaleAreaIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801317);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"saleAreaId").in((Collection)merchantCustomerAreaQry.getSaleAreaIdList()));
        }
        if (merchantCustomerAreaQry.getDefaultSaleArea() != null) {
            if (merchantCustomerAreaQry.getDefaultSaleArea().booleanValue()) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)1));
            } else {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)0));
            }
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("merchantId, merchantApplyRangeId.orgId as orgId,saleAreaId,saleAreaId.code as saleAreaCode,saleAreaId.name as saleAreaName,isDefault as defaultSaleArea").addCondition((ConditionExpression)queryConditionGroup);
        querySchema.setLimitCount(Integer.valueOf(UpcAPiTool.MAX_COUNT));
        List query = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)query)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)query), MerchantCustomerAreaDTO.class);
        }
        return null;
    }

    @Override
    public List<InvoicingCustomersDTO> getInvoicingCustomers(InvoicingCustomersQryDTO invoicingCustomersQryDTO) throws Exception {
        Boolean orgGlobalShare;
        UpcAPiTool.checkTenantInfo();
        if (invoicingCustomersQryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (CollectionUtils.isEmpty((Collection)invoicingCustomersQryDTO.getMerchantIdList()) && CollectionUtils.isEmpty((Collection)invoicingCustomersQryDTO.getOrgIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801318);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersQryDTO.getMerchantIdList())) {
            if (invoicingCustomersQryDTO.getMerchantIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801315);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").in((Collection)invoicingCustomersQryDTO.getMerchantIdList()));
        }
        if ((orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant")).booleanValue() && !CollectionUtils.isEmpty((Collection)invoicingCustomersQryDTO.getOrgIdList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
        } else if (!CollectionUtils.isEmpty((Collection)invoicingCustomersQryDTO.getOrgIdList())) {
            if (invoicingCustomersQryDTO.getOrgIdList().size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801316);
            }
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.orgId").in((Collection)invoicingCustomersQryDTO.getOrgIdList()));
        }
        if (invoicingCustomersQryDTO.getIsDefault() != null) {
            if (invoicingCustomersQryDTO.getIsDefault().booleanValue()) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)1));
            } else {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isDefault").eq((Object)0));
            }
        }
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantId", "merchantId");
        qryFields[2] = new QueryField("merchantId.code", "merchantCode");
        qryFields[3] = new QueryField("merchantId.name", "merchantName");
        qryFields[4] = new QueryField("merchantApplyRangeId.orgId", "orgId");
        qryFields[5] = new QueryField("invoicingCustomersId", "invoicingCustomersId");
        qryFields[6] = new QueryField("invoicingCustomersId.code", "invoicingCustomersCode");
        qryFields[7] = new QueryField("invoicingCustomersId.name", "invoicingCustomersName");
        qryFields[8] = new QueryField("isDefault", "ifDefault");
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List results = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)schema);
        List invoicingCustomersDTOs = null;
        if (!CollectionUtils.isEmpty((Collection)results)) {
            invoicingCustomersDTOs = JSON.parseArray((String)JSON.toJSONString((Object)results), InvoicingCustomersDTO.class);
            invoicingCustomersDTOs.forEach(invoicingCustomersDTO -> invoicingCustomersDTO.setMerchantApplyRangeOrgId(StringUtils.isNotEmpty((CharSequence)invoicingCustomersDTO.getOrgId()) && ToolUtils.isNumber((String)invoicingCustomersDTO.getOrgId()) ? Long.valueOf(invoicingCustomersDTO.getOrgId()) : null));
        }
        return invoicingCustomersDTOs;
    }

    @Override
    public Long getMerchantIdByInternalOrgId(String internalOrgId, String orgId) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((String)internalOrgId);
        UpcAPiTool.checkPara((String)orgId);
        QuerySchema schema = QuerySchema.create().addSelect("id,internalOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"internalOrgId").eq((Object)internalOrgId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList) && ((Merchant)merchantList.get(0)).getInternalOrg() != null && ((Merchant)merchantList.get(0)).getInternalOrg().booleanValue()) {
            Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
            QuerySchema schemaRange = QuerySchema.create().addSelect("id");
            if (orgGlobalShare.booleanValue()) {
                schemaRange.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(((Merchant)merchantList.get(0)).getId()), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
            } else {
                schemaRange.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(((Merchant)merchantList.get(0)).getId()), QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
            }
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaRange, null);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                return Long.parseLong(((Merchant)merchantList.get(0)).getId().toString());
            }
        }
        return null;
    }

    @Override
    public List<PrincipalDTO> getPrincipal(PrincipalQryDTO principalQryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        if (principalQryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (principalQryDTO.getMerchantId() == null || StringUtils.isEmpty((CharSequence)principalQryDTO.getMerchantApplyRangeOrgId())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801319);
        }
        Boolean orgGlobalShare = this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant");
        QueryConditionGroup queryConditionGroup = orgGlobalShare != false ? QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)principalQryDTO.getMerchantId()), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}) : QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId").eq((Object)principalQryDTO.getMerchantId()), QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)principalQryDTO.getMerchantApplyRangeOrgId())});
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("specialManagementDep", "specialManagementDepId");
        qryFields[1] = new QueryField("specialManagementDep.code", "specialManagementDepCode");
        qryFields[2] = new QueryField("specialManagementDep.name", "specialManagementDepName");
        qryFields[3] = new QueryField("professSalesman", "professSalesmanId");
        qryFields[4] = new QueryField("professSalesman.code", "professSalesmanCode");
        qryFields[5] = new QueryField("professSalesman.name", "professSalesmanName");
        qryFields[6] = new QueryField("isDefault", "ifDefault");
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List results = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)results)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)results), PrincipalDTO.class);
        }
        return null;
    }

    @Override
    public List<AddressInfoDTO> listAddressInfoByMerchantCodeList(List<String> merchantCodeList, int pageIndex, int pageSize) throws Exception {
        if (CollectionUtils.isEmpty(merchantCodeList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (pageIndex == 0) {
            pageIndex = UpcAPiTool.DEFAULT_PAGE_INDEX;
        }
        if (pageSize == 0 || pageSize > 1000) {
            pageSize = 1000;
        }
        ArrayList<String> checkMerchantCodeList = new ArrayList<String>();
        for (String merchantCode : merchantCodeList) {
            if (StringUtils.isNotBlank((CharSequence)merchantCode)) {
                checkMerchantCodeList.add(merchantCode);
                continue;
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801320);
        }
        QueryField[] qryFields = new QueryField[32];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantId", "merchantId");
        qryFields[2] = new QueryField("addressCode", "addressCode");
        qryFields[3] = new QueryField("regionCode", "regionCode");
        qryFields[4] = new QueryField("shipregion", "shipregion");
        qryFields[5] = new QueryField("address", "address");
        qryFields[6] = new QueryField("zipCode", "zipCode");
        qryFields[7] = new QueryField("receiver", "receiver");
        qryFields[8] = new QueryField("mobile", "mobile");
        qryFields[9] = new QueryField("telePhone", "telePhone");
        qryFields[10] = new QueryField("email", "email");
        qryFields[11] = new QueryField("qq", "qq");
        qryFields[12] = new QueryField("weChat", "weChat");
        qryFields[13] = new QueryField("remarks", "remarks");
        qryFields[14] = new QueryField("receivingWarehouse", "receivingWarehouse");
        qryFields[15] = new QueryField("isDefault", "isDefault");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantId.code").in(checkMerchantCodeList)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex, pageSize);
        List results = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)results)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)results), AddressInfoDTO.class);
        }
        return null;
    }

    public List<MerchantDTO> getMerchantCharacter(Long merchantId, List<String> orgIdList) throws Exception {
        UpcAPiTool.checkPara((Long[])new Long[]{merchantId});
        UpcAPiTool.checkPara((List[])new List[]{orgIdList});
        QueryField[] qryFields = new QueryField[4];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("merchantApplyRanges.orgId", "orgId");
        qryFields[2] = new QueryField("merchantApplyRanges.merchantDetailId.merchantApplyRangeDetailCharacter", "merchantDetailCharacter");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{merchantId}), QueryCondition.name((String)"merchantApplyRanges.orgId").in(orgIdList)});
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup);
        List<MerchantDTO> merchantDTOList = this.listMerchantDTOs(schema);
        return merchantDTOList;
    }
}

