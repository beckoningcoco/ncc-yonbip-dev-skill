/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.util.BooleanUtil
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.businesspartner.BusinessPartnerQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.businesspartner.BusinessPartnerPO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.upc.api.IBusinessPartnerServiceV2
 *  com.yonyoucloud.iuap.upc.api.businesspartnerdto.BusinessPartnerQryDTO
 *  com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerBoundMerchantAndVendorDTO
 *  com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerCapitalComparisonDTO
 *  com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerSyncRangeConditionsDTO
 *  com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO
 *  com.yonyoucloud.iuap.upc.dto.BusinessPartnerInfoQryDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerComparisonSaveDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.base.businesspartner.AssocMultiObjRules
 *  com.yonyoucloud.upc.base.businesspartner.AutoSyncAction
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.ConditionRelation
 *  com.yonyoucloud.upc.base.businesspartner.LicenseType
 *  com.yonyoucloud.upc.base.businesspartner.LinkMode
 *  com.yonyoucloud.upc.base.businesspartner.LinkObject
 *  com.yonyoucloud.upc.base.businesspartner.MatchFieldValueChange
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerConditionOperator
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkRule
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule
 *  com.yonyoucloud.upc.base.businesspartner.PartnerType
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.base.businesspartner.RoleClass
 *  com.yonyoucloud.upc.base.businesspartner.RoleClassName
 *  com.yonyoucloud.upc.base.businesspartner.SyncMode
 *  com.yonyoucloud.upc.base.businesspartner.SyncRange
 *  com.yonyoucloud.upc.base.businesspartner.SyncRangeDivDimension
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorVO
 *  com.yonyoucloud.upc.service.IBusinessPartnerService
 *  com.yonyoucloud.upc.utils.APIExtPropertiesUtil
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  javax.validation.constraints.NotNull
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import cn.hutool.core.util.BooleanUtil;
import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.businesspartner.BusinessPartnerQryDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.businesspartner.BusinessPartnerPO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService;
import com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.upc.api.IBusinessPartnerServiceV2;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.BusinessPartnerQryDTO;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerBoundMerchantAndVendorDTO;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerCapitalComparisonDTO;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerSyncRangeConditionsDTO;
import com.yonyoucloud.iuap.upc.constants.BusinessPartnerFieldUtils;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonSaveDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.base.businesspartner.AssocMultiObjRules;
import com.yonyoucloud.upc.base.businesspartner.AutoSyncAction;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.ConditionRelation;
import com.yonyoucloud.upc.base.businesspartner.LicenseType;
import com.yonyoucloud.upc.base.businesspartner.LinkMode;
import com.yonyoucloud.upc.base.businesspartner.LinkObject;
import com.yonyoucloud.upc.base.businesspartner.MatchFieldValueChange;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerConditionOperator;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkRule;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule;
import com.yonyoucloud.upc.base.businesspartner.PartnerType;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.base.businesspartner.RoleClass;
import com.yonyoucloud.upc.base.businesspartner.RoleClassName;
import com.yonyoucloud.upc.base.businesspartner.SyncMode;
import com.yonyoucloud.upc.base.businesspartner.SyncRange;
import com.yonyoucloud.upc.base.businesspartner.SyncRangeDivDimension;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorVO;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.IBusinessPartnerService;
import com.yonyoucloud.upc.utils.APIExtPropertiesUtil;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import com.yonyoucloud.upc.utils.PartnerConstant;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class BusinessPartnerServiceImpl
implements IBusinessPartnerService,
IBusinessPartnerServiceV2 {
    private static final Logger log = LoggerFactory.getLogger(BusinessPartnerServiceImpl.class);
    Logger logger = LoggerFactory.getLogger(BusinessPartnerService.class);
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    private MakeBillRuleClientService makeBillRuleClientService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    @Autowired
    BusinessPartnerQryDao businessPartnerQryDao;

    public CoreDocJsonResultForOpenApi<BusinessPartnerDTO> handleSaveBusinessPartner(BusinessPartnerDTO businessPartnerDTO) {
        try {
            BusinessPartnerDTO businessPartnerDTOResult = this.saveBusinessPartner(businessPartnerDTO);
            return CoreDocJsonResultForOpenApi.success((Object)businessPartnerDTOResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error("\u4e1a\u52a1\u4f19\u4f34\u4fdd\u5b58\u63a5\u53e3\u6709\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public PartnerMerchantComparisonDTO saveMerchantComparison(PartnerMerchantComparisonQryDTO dto) throws Exception {
        PartnerMerchantComparison mc = new PartnerMerchantComparison();
        mc.setPartnerId(dto.getPartnerId());
        mc.setMerchantId(dto.getMerchantId());
        mc.setIsDefault(Boolean.valueOf(true));
        mc.setEntityStatus(EntityStatus.Insert);
        QuerySchema qs = QuerySchema.create().addSelect("partnerId,merchantId, isDefault").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"partnerId").eq((Object)dto.getPartnerId())}));
        List comparisonList = MetaDaoHelper.query((String)"base.businesspartner.PartnerMerchantComparison", (QuerySchema)qs, (String)"productcenter");
        if (this.partnerService.empty(comparisonList).booleanValue()) {
            try {
                mc.setId((Object)IdManager.getInstance().nextId());
                MetaDaoHelper.insert((String)"base.businesspartner.PartnerMerchantComparison", (BizObject)mc);
                RoleClass roleClass = new RoleClass();
                roleClass.setIsCheck(Boolean.valueOf(true));
                roleClass.setPartnerId(mc.getPartnerId());
                roleClass.setRoleClassName(RoleClassName.merchant);
                this.refreshRoleClass(roleClass);
                return this.convertMerchantComparisonDTO(mc);
            }
            catch (Exception e) {
                this.logger.error("\u4fdd\u5b58\u4e1a\u52a1\u4f19\u4f34\u5ba2\u6237\u5bf9\u7167\u5f02\u5e38" + e.getMessage());
                return null;
            }
        }
        boolean defaultFlag = true;
        for (Map item : comparisonList) {
            if (item.get("partnerId").toString().equals(dto.getPartnerId()) && item.get("merchantId").toString().equals(dto.getMerchantId() + "")) {
                return this.convertMerchantComparisonDTO(mc);
            }
            if (item.get("isDefault") == null || !item.get("isDefault").toString().equals("true")) continue;
            defaultFlag = false;
        }
        try {
            mc.setIsDefault(Boolean.valueOf(defaultFlag));
            mc.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"base.businesspartner.PartnerMerchantComparison", (BizObject)mc);
            RoleClass roleClass = new RoleClass();
            roleClass.setIsCheck(Boolean.valueOf(true));
            roleClass.setPartnerId(mc.getPartnerId());
            roleClass.setRoleClassName(RoleClassName.merchant);
            this.refreshRoleClass(roleClass);
            return this.convertMerchantComparisonDTO(mc);
        }
        catch (Exception e) {
            this.logger.error("\u4fdd\u5b58\u4e1a\u52a1\u4f19\u4f34\u5ba2\u6237\u5bf9\u7167\u5f02\u5e38" + e.getMessage());
            return null;
        }
    }

    public Boolean delMerchantComparison(PartnerMerchantComparisonQryDTO dto) throws Exception {
        HashMap<String, Object> p = new HashMap<String, Object>();
        p.put("partnerId", dto.getPartnerId());
        p.put("merchant_id", dto.getMerchantId());
        p.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.businesspartner.delOneMerchantComparison", p);
        List partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)dto.getPartnerId());
        if (CollectionUtils.isEmpty((Collection)partnerMerchantComparisons)) {
            RoleClass roleClass = new RoleClass();
            roleClass.setIsCheck(Boolean.valueOf(false));
            roleClass.setPartnerId(dto.getPartnerId());
            roleClass.setRoleClassName(RoleClassName.merchant);
            this.refreshRoleClass(roleClass);
        }
        return true;
    }

    public PartnerVendorComparisonDTO saveVendorComparison(PartnerVendorComparisonQryDTO dto) throws Exception {
        PartnerVendorComparison vc = new PartnerVendorComparison();
        vc.setPartnerId(dto.getPartnerId());
        vc.setVendorId(dto.getVendorId());
        vc.setIsDefault(Boolean.valueOf(true));
        vc.setEntityStatus(EntityStatus.Insert);
        QuerySchema qs = QuerySchema.create().addSelect("partnerId,vendorId, isDefault").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"partnerId").eq((Object)dto.getPartnerId())}));
        List comparisonList = MetaDaoHelper.query((String)"base.businesspartner.PartnerVendorComparison", (QuerySchema)qs, (String)"productcenter");
        if (this.partnerService.empty(comparisonList).booleanValue()) {
            try {
                vc.setId((Object)IdManager.getInstance().nextId());
                MetaDaoHelper.insert((String)"base.businesspartner.PartnerVendorComparison", (BizObject)vc);
                RoleClass roleClass = new RoleClass();
                roleClass.setIsCheck(Boolean.valueOf(true));
                roleClass.setPartnerId(vc.getPartnerId());
                roleClass.setRoleClassName(RoleClassName.vendor);
                this.refreshRoleClass(roleClass);
                return this.convertVendorComparisonDTO(vc);
            }
            catch (Exception e) {
                this.logger.error("\u4fdd\u5b58\u4e1a\u52a1\u4f19\u4f34\u4f9b\u5e94\u5546\u5bf9\u7167\u5f02\u5e38" + e.getMessage());
                return null;
            }
        }
        boolean defaultFlag = true;
        for (Map item : comparisonList) {
            if (item.get("partnerId").toString().equals(dto.getPartnerId()) && item.get("vendorId").toString().equals(dto.getVendorId() + "")) {
                return this.convertVendorComparisonDTO(vc);
            }
            if (item.get("isDefault") == null || !item.get("isDefault").toString().equals("true")) continue;
            defaultFlag = false;
        }
        try {
            vc.setIsDefault(Boolean.valueOf(defaultFlag));
            vc.setId((Object)IdManager.getInstance().nextId());
            MetaDaoHelper.insert((String)"base.businesspartner.PartnerVendorComparison", (BizObject)vc);
            RoleClass roleClass = new RoleClass();
            roleClass.setIsCheck(Boolean.valueOf(true));
            roleClass.setPartnerId(vc.getPartnerId());
            roleClass.setRoleClassName(RoleClassName.vendor);
            this.refreshRoleClass(roleClass);
            return this.convertVendorComparisonDTO(vc);
        }
        catch (Exception e) {
            this.logger.error("\u4fdd\u5b58\u4e1a\u52a1\u4f19\u4f34\u4f9b\u5e94\u5546\u5bf9\u7167\u5f02\u5e38" + e.getMessage());
            return null;
        }
    }

    public Boolean delVendorComparison(PartnerVendorComparisonQryDTO dto) throws Exception {
        HashMap<String, Object> p = new HashMap<String, Object>();
        p.put("partnerId", dto.getPartnerId());
        p.put("vendor_id", dto.getVendorId());
        p.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.businesspartner.delOneVendorComparison", p);
        List partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)dto.getPartnerId());
        if (CollectionUtils.isEmpty((Collection)partnerVendorComparisons)) {
            RoleClass roleClass = new RoleClass();
            roleClass.setIsCheck(Boolean.valueOf(false));
            roleClass.setPartnerId(dto.getPartnerId());
            roleClass.setRoleClassName(RoleClassName.vendor);
            this.refreshRoleClass(roleClass);
        }
        return true;
    }

    public Boolean existsMerToPartnerSyncRule() throws Exception {
        PartnerSyncPlan syncPlan = this.partnerService.getSyncPlan();
        if (syncPlan.getStopstatus().booleanValue()) {
            return false;
        }
        List syncRules = syncPlan.planSyncRules();
        for (PartnerSyncRule item : syncRules) {
            if (item.getSourceObject() != LinkObject.MERCHANT || item.getTargetObject() != LinkObject.BUSINESS_PARTNER) continue;
            return true;
        }
        return false;
    }

    public ResultList merchantToPartner(Long merchantId, String partnerId) throws Exception {
        return new ResultList();
    }

    public ResultList merchantToPartner(Merchant merchant, final String partnerId) throws Exception {
        List<Object> partners = new ArrayList();
        if (partnerId == null) {
            partners = this.partnerService.batchInsertPartnerByMerchant(merchant);
            if (!CollectionUtils.isEmpty(partners)) {
                ((BusinessPartner)partners.get(0)).put("merchantToPartner", (Object)true);
                ((BusinessPartner)partners.get(0)).put(PartnerConstant.MERCHANT_ID, merchant.getId());
            }
        } else {
            LinkedList<String> partnerIds = new LinkedList<String>(){
                {
                    this.add(partnerId);
                }
            };
            Map<String, BusinessPartner> partnerMap = this.partnerService.getPartnerByIds((List<String>)partnerIds);
            BusinessPartner partner = partnerMap.get(partnerId);
            List<Map<String, Object>> partnerFieldMap = this.partnerService.readPartnerFieldMap(0);
            this.partnerService.partnerMerchantMainSync(partner, merchant, 1, partnerFieldMap);
            partners.add(partner);
        }
        if (CollectionUtils.isEmpty(partners)) {
            return new ResultList();
        }
        ((BusinessPartner)partners.get(0)).put("associationRequired", (Object)true);
        try {
            if (!CollectionUtils.isEmpty((Map)merchant) && merchant.getId() != null) {
                List targetList;
                BusinessPartner partner = (BusinessPartner)partners.get(0);
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("merchant_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                ArrayList<String> merchantIds = new ArrayList<String>();
                merchantIds.add(merchant.getId().toString());
                pushAndPullVO.setChildIds(merchantIds);
                HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
                isUseBusiQuery.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(isUseBusiQuery);
                Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                if (targetMap != null && targetMap.get("tarList") != null && !CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        if (StringUtils.isNotBlank((CharSequence)merchant.getCode()) && businessPartner.getCode() != null) {
                            businessPartner.setCode(merchant.getCode());
                        }
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        businessPartner.remove("id");
                        this.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)partner, "businessPartnerCharacterDef");
                        partner.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        return this.partnerService.batchSave(partners, "base.businesspartner.BusinessPartner", "", false);
    }

    public ResultList merchantToPartner(MerchantPO merchantPO, final String partnerId) throws Exception {
        List<Object> partners = new ArrayList();
        if (partnerId == null) {
            partners = this.partnerService.batchInsertPartnerByMerchant(merchantPO);
            if (!CollectionUtils.isEmpty(partners)) {
                ((BusinessPartner)partners.get(0)).put("merchantToPartner", (Object)true);
                ((BusinessPartner)partners.get(0)).put(PartnerConstant.MERCHANT_ID, (Object)merchantPO.getId());
            }
        } else {
            LinkedList<String> partnerIds = new LinkedList<String>(){
                {
                    this.add(partnerId.toString());
                }
            };
            Map<String, BusinessPartner> partnerMap = this.partnerService.getPartnerByIds((List<String>)partnerIds);
            BusinessPartner partner = partnerMap.get(partnerId);
            List<Map<String, Object>> partnerFieldMap = this.partnerService.readPartnerFieldMap(0);
            this.partnerService.mapMerchantDataToBusinessPartner(partner, merchantPO, partnerFieldMap);
            partners.add(partner);
        }
        if (CollectionUtils.isEmpty(partners)) {
            return new ResultList();
        }
        ((BusinessPartner)partners.get(0)).put("associationRequired", (Object)true);
        try {
            if (merchantPO != null && merchantPO.getId() != null) {
                List targetList;
                BusinessPartner partner = (BusinessPartner)partners.get(0);
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("merchant_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                ArrayList<String> merchantIds = new ArrayList<String>();
                merchantIds.add(merchantPO.getId().toString());
                pushAndPullVO.setChildIds(merchantIds);
                HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
                isUseBusiQuery.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(isUseBusiQuery);
                Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                if (targetMap != null && targetMap.get("tarList") != null && !CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        if (StringUtils.isNotBlank((CharSequence)merchantPO.getCode()) && businessPartner.getCode() != null) {
                            businessPartner.setCode(merchantPO.getCode());
                        }
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        businessPartner.remove("id");
                        this.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)partner, "businessPartnerCharacterDef");
                        partner.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        return this.partnerService.batchSave(partners, "base.businesspartner.BusinessPartner", "", false);
    }

    public void putMapFieldInTargetObject(BizObject source, BizObject target, String characterDefFieldName) {
        if (source.get(characterDefFieldName) != null && source.get(characterDefFieldName) instanceof Map && target.get(characterDefFieldName) != null && target.get(characterDefFieldName) instanceof Map) {
            BizObject characterMap = this.mergeMap((Map)target.get(characterDefFieldName), (Map)source.get(characterDefFieldName));
            characterMap.setEntityStatus(EntityStatus.Update);
            target.put(characterDefFieldName, (Object)characterMap);
            source.remove(characterDefFieldName);
        }
    }

    private BizObject mergeMap(Map<String, Object> businessPartnerCharacterDefNeedReturn, Map<String, Object> businessPartnerCharacterDef) {
        BizObject res = new BizObject(businessPartnerCharacterDefNeedReturn);
        for (String key : businessPartnerCharacterDef.keySet()) {
            res.put(key, businessPartnerCharacterDef.get(key));
        }
        return res;
    }

    public UPCResultList merchantToPartnerV2(Long merchantId, String partnerId) throws Exception {
        ResultList resultList = this.merchantToPartner(merchantId, partnerId);
        return UPCResultConverter.resultConvert((ResultList)resultList);
    }

    public ResultList vendorToPartner(final Long vendorId, final String partnerId) throws Exception {
        List<Object> partners;
        if (null == vendorId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801275);
        }
        LinkedList<Long> venIds = new LinkedList<Long>(){
            {
                this.add(vendorId);
            }
        };
        if (partnerId == null) {
            partners = this.partnerService.batchInsertPartnerByVendor((List<Long>)venIds);
            if (!CollectionUtils.isEmpty(partners)) {
                ((BusinessPartner)partners.get(0)).put("vendorToPartner", (Object)true);
                ((BusinessPartner)partners.get(0)).put(PartnerConstant.VENDOR_ID, (Object)vendorId);
            }
        } else {
            partners = new ArrayList();
            LinkedList<String> partnerIds = new LinkedList<String>(){
                {
                    this.add(partnerId);
                }
            };
            Map<String, BusinessPartner> partnerMap = this.partnerService.getPartnerByIds((List<String>)partnerIds);
            BusinessPartner partner = partnerMap.get(partnerId);
            if (!CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons())) {
                for (PartnerVendorComparison partnerVendorComparison : partner.partnerVendorComparisons()) {
                    if (partnerVendorComparison.getVendorId() == null || !partnerVendorComparison.getVendorId().equals(vendorId) || BooleanUtil.isTrue((Boolean)partnerVendorComparison.getIsDefault())) continue;
                    return new ResultList();
                }
            }
            List<Map<String, Object>> partnerFieldMap = this.partnerService.readPartnerFieldMap(1);
            Map<String, Vendor> vendorMap = this.partnerService.getVendorByIds((List<Long>)venIds);
            this.partnerService.partnerVendorMainSync(partner, vendorMap.get(vendorId.toString()), 1, partnerFieldMap);
            partners.add(partner);
        }
        if (CollectionUtils.isEmpty(partners)) {
            return new ResultList();
        }
        try {
            if (!CollectionUtils.isEmpty((Collection)venIds)) {
                BusinessPartner partner = (BusinessPartner)partners.get(0);
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("vendor_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                pushAndPullVO.setChildIds(venIds.stream().map(x -> x + "").collect(Collectors.toList()));
                HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
                isUseBusiQuery.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(isUseBusiQuery);
                Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                List targetList = null;
                if (targetMap != null && targetMap.get("tarList") != null && !CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        businessPartner.remove("id");
                        if (partner == null) continue;
                        this.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)partner, "businessPartnerCharacterDef");
                        partner.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u4f9b\u5e94\u5546\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        return this.partnerService.batchSave(partners, "base.businesspartner.BusinessPartner", "", false);
    }

    public UPCResultList vendorToPartnerV2(Long vendorId, String partnerId) throws Exception {
        ResultList resultList = this.vendorToPartner(vendorId, partnerId);
        return UPCResultConverter.resultConvert((ResultList)resultList);
    }

    public Boolean merCanToPartner(Long merchantId, String partnerId, String transTypeId, String customerClassId) throws Exception {
        PartnerSyncRangeConditionsDTO partnerSyncRangeConditionsDTO = this.getMerchantSyncRangeConditionsDTO(merchantId, partnerId, transTypeId, customerClassId);
        return this.processSyncRules(LinkObject.MERCHANT, partnerSyncRangeConditionsDTO, this.partnerService.getSyncPlan());
    }

    public PartnerSyncRangeConditionsDTO getMerchantSyncRangeConditionsDTO(Long merchantId, String partnerId, String transTypeId, String customerClassId) {
        PartnerSyncRangeConditionsDTO partnerSyncRangeConditionsDTO = new PartnerSyncRangeConditionsDTO();
        partnerSyncRangeConditionsDTO.setMerchantId(merchantId);
        partnerSyncRangeConditionsDTO.setPartnerId(partnerId);
        partnerSyncRangeConditionsDTO.setTransTypeId(transTypeId);
        partnerSyncRangeConditionsDTO.setCustomerClassId(customerClassId);
        return partnerSyncRangeConditionsDTO;
    }

    public Boolean processSyncRules(LinkObject sourceObject, PartnerSyncRangeConditionsDTO rangeConditionsDTO, PartnerSyncPlan syncPlan) throws Exception {
        if (syncPlan == null) {
            syncPlan = this.partnerService.getSyncPlan();
        }
        if (syncPlan == null || !this.isAutoSync(syncPlan).booleanValue()) {
            return false;
        }
        if (rangeConditionsDTO.getPartnerId() != null && !this.evaluatePartnerAssociationUpdateStrategy(sourceObject, rangeConditionsDTO, syncPlan).booleanValue()) {
            return false;
        }
        List syncRules = syncPlan.planSyncRules();
        if (CollectionUtils.isEmpty((Collection)syncRules)) {
            return false;
        }
        for (PartnerSyncRule syncRule : syncRules) {
            if (!this.isSourceObjectMatch(syncRule, sourceObject) || syncRule.getTargetObject() != LinkObject.VENDOR) continue;
            return true;
        }
        for (PartnerSyncRule syncRule : syncRules) {
            if (!this.isSourceObjectMatch(syncRule, sourceObject) || syncRule.getTargetObject() != LinkObject.BUSINESS_PARTNER || !StringUtils.isNotBlank((CharSequence)rangeConditionsDTO.getPartnerId()) && !syncRule.getCreateTarget().booleanValue()) continue;
            if (syncRule.getSyncRange() == SyncRange.all) {
                return true;
            }
            return this.checkCanToPartnerConditions(rangeConditionsDTO, syncRule);
        }
        return false;
    }

    public Boolean canGenerateVendorFromMerchant() throws Exception {
        return this.canGenerateVendorFromMerchant(null);
    }

    public Boolean canGenerateVendorFromMerchant(PartnerSyncPlan syncPlan) throws Exception {
        if (syncPlan == null) {
            syncPlan = this.partnerService.getSyncPlan();
        }
        if (syncPlan == null || !this.isAutoSync(syncPlan).booleanValue()) {
            return false;
        }
        List syncRules = syncPlan.planSyncRules();
        if (CollectionUtils.isEmpty((Collection)syncRules)) {
            return false;
        }
        for (PartnerSyncRule syncRule : syncRules) {
            if (!this.isSourceObjectMatch(syncRule, LinkObject.MERCHANT) || syncRule.getTargetObject() != LinkObject.VENDOR || !syncRule.getCreateTarget().booleanValue()) continue;
            if (syncRule.getSyncRange() == SyncRange.all) {
                return true;
            }
            return false;
        }
        return false;
    }

    private Boolean evaluatePartnerAssociationUpdateStrategy(LinkObject sourceObject, PartnerSyncRangeConditionsDTO rangeConditionsDTO, PartnerSyncPlan syncPlan) throws Exception {
        if (AssocMultiObjRules.UPDATE_WITH_DEFAULT_MERCHANT_PARTNER.equals((Object)syncPlan.getAssocMultiObjRules()) && sourceObject != LinkObject.MERCHANT) {
            return false;
        }
        if (AssocMultiObjRules.UPDATE_WITH_DEFAULT_VENDOR_PARTNER.equals((Object)syncPlan.getAssocMultiObjRules()) && sourceObject != LinkObject.VENDOR) {
            return false;
        }
        if (AssocMultiObjRules.UPDATE_WITH_DEFAULT_CAPITAL_PARTNER.equals((Object)syncPlan.getAssocMultiObjRules()) && sourceObject != LinkObject.CAPITAL_BUSINESS_OBJECT) {
            return false;
        }
        if (LinkObject.MERCHANT == sourceObject) {
            if (!this.validateDefaultMerchantComparison(rangeConditionsDTO)) {
                return false;
            }
        } else if (LinkObject.VENDOR == sourceObject) {
            if (!this.validateDefaultVendorComparison(rangeConditionsDTO)) {
                return false;
            }
        } else if (LinkObject.CAPITAL_BUSINESS_OBJECT != sourceObject || !this.validateDefaultCAPITALComparison(rangeConditionsDTO)) {
            // empty if block
        }
        return true;
    }

    private boolean validateDefaultMerchantComparison(PartnerSyncRangeConditionsDTO rangeConditionsDTO) throws Exception {
        List partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)rangeConditionsDTO.getPartnerId());
        return this.containsDefaultMerchantComparison(rangeConditionsDTO.getMerchantId(), partnerMerchantComparisons);
    }

    private boolean containsDefaultMerchantComparison(Long merchant, List<PartnerMerchantComparison> partnerMerchantComparisons) {
        if (!CollectionUtils.isEmpty(partnerMerchantComparisons)) {
            for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantComparisons) {
                if (partnerMerchantComparison.getMerchantId() == null || !partnerMerchantComparison.getMerchantId().equals(merchant) || partnerMerchantComparison.getIsDefault() == null || !partnerMerchantComparison.getIsDefault().booleanValue()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean validateDefaultVendorComparison(PartnerSyncRangeConditionsDTO rangeConditionsDTO) throws Exception {
        List partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)rangeConditionsDTO.getPartnerId());
        return this.containsDefaultVendorComparison(rangeConditionsDTO.getVendorId(), partnerVendorComparisons);
    }

    private boolean containsDefaultVendorComparison(Long vendorId, List<PartnerVendorComparison> vendorComparisons) {
        for (PartnerVendorComparison vendorComparison : vendorComparisons) {
            if (vendorComparison.getVendorId() == null || !vendorComparison.getVendorId().equals(vendorId) || vendorComparison.getIsDefault() == null || !vendorComparison.getIsDefault().booleanValue()) continue;
            return true;
        }
        return false;
    }

    private boolean validateDefaultCAPITALComparison(PartnerSyncRangeConditionsDTO rangeConditionsDTO) throws Exception {
        List partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)rangeConditionsDTO.getPartnerId());
        return this.containsDefaultCAPITALComparison(rangeConditionsDTO.getCapitalId(), partnerCapitalComparisons);
    }

    private boolean containsDefaultCAPITALComparison(String capitalId, List<PartnerCapitalComparison> partnerCapitalComparisons) {
        if (!CollectionUtils.isEmpty(partnerCapitalComparisons)) {
            for (PartnerCapitalComparison partnerCapitalComparison : partnerCapitalComparisons) {
                if (partnerCapitalComparison.getCapitalId() == null || !partnerCapitalComparison.getCapitalId().equals(capitalId) || partnerCapitalComparison.getIsDefault() == null || !partnerCapitalComparison.getIsDefault().booleanValue()) continue;
                return true;
            }
        }
        return false;
    }

    public Boolean isAutoSync(PartnerSyncPlan syncPlan) {
        if (syncPlan.getStopstatus().booleanValue() || syncPlan.getSyncMode() != SyncMode.autoSync || syncPlan.getAutoSyncAction() != AutoSyncAction.sourceSave) {
            return false;
        }
        return true;
    }

    private boolean isSourceObjectMatch(PartnerSyncRule syncRule, LinkObject sourceObject) {
        return syncRule != null && syncRule.getSourceObject() == sourceObject;
    }

    private Boolean checkCanToPartnerConditions(PartnerSyncRangeConditionsDTO rangeConditionsDTO, PartnerSyncRule syncRule) {
        boolean flag = false;
        for (int i = 1; i <= 3; ++i) {
            SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
            if (divDimension == null) continue;
            String syncRangeField = "syncRange" + i;
            String conditionalOperatorField = "conditionalOperator" + i;
            switch (divDimension) {
                case MERCHANT: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getMerchantId(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case TRANS_TYPE: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getTransTypeId(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case CUSTOMER_CLASS: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getCustomerClassId(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case VENDOR: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getVendorId(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case VENDOR_CLASS: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getVendorClassId(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case CAPITAL_BUSINESS_OBJECT: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(rangeConditionsDTO.getCapitalId(), syncRangeField, conditionalOperatorField, syncRule);
                }
            }
            if (syncRule.getConditionRelation() != null && syncRule.getConditionRelation() == ConditionRelation.or && flag) {
                return true;
            }
            if (syncRule.getConditionRelation() == null || syncRule.getConditionRelation() != ConditionRelation.and || flag) continue;
            return false;
        }
        return flag;
    }

    public static Boolean checkDivDimensionMatch(Object value, String valueField, String conditionalOperatorField, PartnerSyncRule syncRule) {
        if (value != null && syncRule.get(valueField) != null && syncRule.get(conditionalOperatorField) != null) {
            boolean falg = false;
            if (syncRule.get(conditionalOperatorField).toString().equalsIgnoreCase(PartnerConditionOperator.IN.getOperator())) {
                falg = syncRule.get(valueField).toString().contains(value.toString());
            } else if (syncRule.get(conditionalOperatorField).toString().equalsIgnoreCase(PartnerConditionOperator.NOT_IN.getOperator())) {
                falg = !syncRule.get(valueField).toString().contains(value.toString());
            }
            return falg;
        }
        return false;
    }

    public Boolean venCanToPartner(Long vendorId, String partnerId, String vendorClassId) throws Exception {
        PartnerSyncRangeConditionsDTO partnerSyncRangeConditionsDTO = this.getVednorPartnerSyncRangeConditionsDTO(vendorId, partnerId, vendorClassId);
        return this.processSyncRules(LinkObject.VENDOR, partnerSyncRangeConditionsDTO, this.partnerService.getSyncPlan());
    }

    public PartnerSyncRangeConditionsDTO getVednorPartnerSyncRangeConditionsDTO(Long vendorId, String partnerId, String vendorClassId) {
        PartnerSyncRangeConditionsDTO partnerSyncRangeConditionsDTO = new PartnerSyncRangeConditionsDTO();
        partnerSyncRangeConditionsDTO.setVendorId(vendorId);
        partnerSyncRangeConditionsDTO.setPartnerId(partnerId);
        partnerSyncRangeConditionsDTO.setVendorClassId(vendorClassId);
        return partnerSyncRangeConditionsDTO;
    }

    public BusinessPartnerDTO getPartnerIdByNameOrCreditCode(BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        UpcAPiTool.checkTenantInfo();
        this.validateQryDTO(qryDTO);
        PartnerLinkPlan linkPlan = this.partnerService.getLinkPlan();
        if (!this.checkIsEnableLinkPlan(linkPlan, String.valueOf(qryDTO.getLinkObject())).booleanValue()) {
            return null;
        }
        List partnerLinkRules = linkPlan.planLinkRules();
        if (CollectionUtils.isEmpty((Collection)partnerLinkRules)) {
            return null;
        }
        for (PartnerLinkRule partnerLinkRule : partnerLinkRules) {
            if (!this.isMatchLinkObject(partnerLinkRule.getLinkObject(), qryDTO.getLinkObject())) continue;
            if (this.shouldPreserveOriginalAssociation(partnerLinkRule, qryDTO)) {
                return this.createPartnerDTOWithId(qryDTO.getPartnerId());
            }
            List<BusinessPartnerPO> partners = this.queryPartnersByLinkRule(partnerLinkRule, qryDTO);
            return this.processQueryResult(partners);
        }
        return null;
    }

    private void validateQryDTO(BusinessPartnerInfoQryDTO qryDTO) throws CoreDocBusinessException {
        if (qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        if (qryDTO.getName() == null && qryDTO.getCreditCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801276);
        }
        if (qryDTO.getLinkObject() == null || !this.isMatchLinkObject(LinkObject.MERCHANT, qryDTO.getLinkObject()) && !this.isMatchLinkObject(LinkObject.VENDOR, qryDTO.getLinkObject()) && !this.isMatchLinkObject(LinkObject.CAPITAL_BUSINESS_OBJECT, qryDTO.getLinkObject())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801277);
        }
    }

    private boolean isMatchLinkObject(LinkObject linkObject, String linkObjectValue) {
        return linkObject != null && String.valueOf(linkObject.getValue()).equals(linkObjectValue);
    }

    private boolean shouldPreserveOriginalAssociation(PartnerLinkRule rule, BusinessPartnerInfoQryDTO qryDTO) {
        if (StringUtils.isBlank((CharSequence)qryDTO.getPartnerId())) {
            return false;
        }
        if (rule.getMatchFieldValueChange() != null && rule.getMatchFieldValueChange() == MatchFieldValueChange.PRESERVE_ORIGINAL_ASSOCIATION) {
            return true;
        }
        String changeField = this.getChangeFieldByLinkRule(rule);
        if (StringUtils.isBlank((CharSequence)changeField)) {
            return false;
        }
        if ("creditCodeAndName".equals(changeField)) {
            return !qryDTO.getChangeFieldNameSet().contains("creditCode") && !qryDTO.getChangeFieldNameSet().contains("name");
        }
        return !qryDTO.getChangeFieldNameSet().contains(changeField);
    }

    private String getChangeFieldByLinkRule(PartnerLinkRule rule) {
        if (rule == null || rule.getLinkBy() == null) {
            return "";
        }
        switch (rule.getLinkBy()) {
            case BY_NAME: {
                return "name";
            }
            case BY_CREDIT_CODE: {
                return "creditCode";
            }
            case BY_CODE: {
                return "code";
            }
            case BY_CREDIT_CODE_AND_NAME: {
                return "creditCodeAndName";
            }
        }
        return "";
    }

    private List<BusinessPartnerPO> queryPartnersByLinkRule(PartnerLinkRule rule, BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        if (rule == null || qryDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801122);
        }
        switch (rule.getLinkBy()) {
            case BY_CREDIT_CODE_AND_NAME: {
                return this.handleCreditCodeAndNameQuery(qryDTO);
            }
            case BY_NAME: {
                return this.handleNameQuery(qryDTO);
            }
            case BY_CREDIT_CODE: {
                return this.handleCreditCodeQuery(qryDTO);
            }
            case BY_CODE: {
                return this.handleCodeQuery(qryDTO);
            }
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801277);
    }

    private List<BusinessPartnerPO> handleCreditCodeAndNameQuery(BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        List<BusinessPartnerPO> partnerPOS;
        if (qryDTO.getCreditCode() != null && !CollectionUtils.isEmpty(partnerPOS = this.handleCreditCodeQuery(qryDTO))) {
            return partnerPOS;
        }
        if (qryDTO.getName() != null) {
            return this.handleNameQuery(qryDTO);
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801278);
    }

    private List<BusinessPartnerPO> handleNameQuery(BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        if (qryDTO.getName() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801278);
        }
        return this.businessPartnerQryDao.queryPartners(null, Collections.singletonList(qryDTO.getName()), null);
    }

    private List<BusinessPartnerPO> handleCreditCodeQuery(BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        if (qryDTO.getCreditCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801279);
        }
        return this.businessPartnerQryDao.queryPartners(null, null, Collections.singletonList(qryDTO.getCreditCode()));
    }

    private List<BusinessPartnerPO> handleCodeQuery(BusinessPartnerInfoQryDTO qryDTO) throws Exception {
        if (qryDTO.getCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801627);
        }
        return this.businessPartnerQryDao.queryPartners(Collections.singletonList(qryDTO.getCode()), null, null);
    }

    private BusinessPartnerDTO processQueryResult(List<BusinessPartnerPO> partners) throws CoreDocBusinessException {
        if (CollectionUtils.isEmpty(partners)) {
            return new BusinessPartnerDTO();
        }
        if (partners.size() > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801280);
        }
        BusinessPartnerPO partner = partners.get(0);
        BusinessPartnerDTO dto = new BusinessPartnerDTO();
        dto.setId(partner.getId().toString());
        if (partner.getName() != null) {
            String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
            String name = partner.getName().getText(locale);
            dto.setName(name);
        }
        return dto;
    }

    private BusinessPartnerDTO createPartnerDTOWithId(String partnerId) {
        BusinessPartnerDTO dto = new BusinessPartnerDTO();
        dto.setId(partnerId);
        return dto;
    }

    public Boolean capitalCanToPartner(Boolean newAdd, String linkObject) throws Exception {
        if (newAdd == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801281);
        }
        if (StringUtils.isNotBlank((CharSequence)linkObject) && LinkObject.find((Number)Short.valueOf(linkObject)) == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801282);
        }
        PartnerSyncPlan syncPlan = this.partnerService.getSyncPlan();
        if (!syncPlan.getStopstatus().booleanValue() && syncPlan.getSyncMode() == SyncMode.autoSync && syncPlan.getAutoSyncAction() == AutoSyncAction.sourceSave) {
            boolean existsToPartnerSyncRule = false;
            boolean createTarget = false;
            List syncRules = syncPlan.planSyncRules();
            for (PartnerSyncRule item : syncRules) {
                if (item.getSourceObject() != LinkObject.find((Number)Short.valueOf(linkObject)) || item.getTargetObject() != LinkObject.BUSINESS_PARTNER) continue;
                existsToPartnerSyncRule = true;
                createTarget = item.getCreateTarget();
            }
            return existsToPartnerSyncRule && createTarget;
        }
        return false;
    }

    public ResultList capitalToPartner(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        if (businessPartnerDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801283);
        }
        if (businessPartnerDTO.getCapitalId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801284);
        }
        if (StringUtils.isBlank((CharSequence)businessPartnerDTO.getName())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801285);
        }
        BusinessPartner partner = new BusinessPartner();
        if (businessPartnerDTO.getId() == null) {
            partner = BusinessPartnerUtils.generateCapitalBusinessPartner((String)businessPartnerDTO.getCapitalId(), (Number)PartnerConstant.ROLE_CLASS_NAME_CAPITAL);
            if (businessPartnerDTO.getCode() == null) {
                String businessPartnerCode = this.partnerService.getBillCodeForCodeRule("base_businesspartner", "base.businesspartner.BusinessPartner");
                partner.setCode(businessPartnerCode);
            } else if (businessPartnerDTO.getCode() != null) {
                partner.setCode(businessPartnerDTO.getCode());
            }
            if (partner.getCode() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800744);
            }
        } else {
            partner.setId((Object)businessPartnerDTO.getId());
            partner.setEntityStatus(EntityStatus.Update);
            QuerySchema condition = QuerySchema.create().addSelect("code, partnerType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)businessPartnerDTO.getId())}));
            List comparisonList = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)condition, (String)"productcenter");
            if (!CollectionUtils.isEmpty((Collection)comparisonList)) {
                partner.setCode(((Map)comparisonList.get(0)).get("code").toString());
                partner.setPartnerType(PartnerType.find((Number)((Number)((Map)comparisonList.get(0)).get("partnerType"))));
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801286);
            }
        }
        PartnerSyncRangeConditionsDTO partnerSyncRangeConditionsDTO = new PartnerSyncRangeConditionsDTO();
        partnerSyncRangeConditionsDTO.setCapitalId(businessPartnerDTO.getCapitalId());
        partnerSyncRangeConditionsDTO.setPartnerId(businessPartnerDTO.getId());
        if (!this.processSyncRules(LinkObject.CAPITAL_BUSINESS_OBJECT, partnerSyncRangeConditionsDTO, this.partnerService.getSyncPlan()).booleanValue()) {
            return new ResultList();
        }
        partner.setName(businessPartnerDTO.getName());
        partner.setCountry(businessPartnerDTO.getCountry());
        partner.setCreditCode(businessPartnerDTO.getCreditCode());
        partner.setContactName(businessPartnerDTO.getContactName());
        partner.setContactTel(businessPartnerDTO.getContactTel());
        partner.setFax(businessPartnerDTO.getFax());
        partner.setEmail(businessPartnerDTO.getEmail());
        partner.set("partnerFrom", (Object)"4");
        ArrayList<BusinessPartner> partners = new ArrayList<BusinessPartner>(4);
        partners.add(partner);
        return this.partnerService.batchSave(partners, "base.businesspartner.BusinessPartner", "", false);
    }

    public UPCResultList capitalToPartnerV2(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        ResultList resultList = this.capitalToPartner(businessPartnerDTO);
        return UPCResultConverter.resultConvert((ResultList)resultList);
    }

    public PartnerComparisonDTO saveCapitalComparison(PartnerComparisonSaveDTO SaveDTO) throws Exception {
        if (SaveDTO.getPartnerId() == null && SaveDTO.getFileId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801287);
        }
        PartnerCapitalComparison capitalComparison = new PartnerCapitalComparison();
        capitalComparison.setCapitalId(SaveDTO.getFileId());
        capitalComparison.setPartnerId(SaveDTO.getPartnerId());
        capitalComparison.setIsDefault(Boolean.valueOf(true));
        capitalComparison.setEntityStatus(EntityStatus.Insert);
        QuerySchema qs = QuerySchema.create().addSelect("partnerId,capitalId, isDefault").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"partnerId").eq((Object)SaveDTO.getPartnerId())}));
        List comparisonList = MetaDaoHelper.query((String)"base.businesspartner.PartnerCapitalComparison", (QuerySchema)qs, (String)"productcenter");
        if (!CollectionUtils.isEmpty((Collection)comparisonList)) {
            for (Map item : comparisonList) {
                if (!item.get("partnerId").toString().equals(SaveDTO.getPartnerId()) || !item.get("capitalId").toString().equals(SaveDTO.getFileId())) continue;
                Object isDefault = item.get("isDefault");
                if (isDefault != null) {
                    if (isDefault instanceof Boolean) {
                        capitalComparison.setIsDefault((Boolean)isDefault);
                    } else {
                        capitalComparison.setIsDefault(Boolean.valueOf(String.valueOf(isDefault).equals("1")));
                    }
                }
                return this.convertComparisonDTO(capitalComparison);
            }
            capitalComparison.setIsDefault(Boolean.valueOf(false));
        }
        RoleClass roleClass = new RoleClass();
        roleClass.setIsCheck(Boolean.valueOf(true));
        roleClass.setPartnerId(SaveDTO.getPartnerId());
        roleClass.setRoleClassName(RoleClassName.CAPITAL);
        this.refreshRoleClass(roleClass);
        capitalComparison.setId((Object)IdManager.getInstance().nextId());
        MetaDaoHelper.insert((String)"base.businesspartner.PartnerCapitalComparison", (BizObject)capitalComparison);
        return this.convertComparisonDTO(capitalComparison);
    }

    public Boolean delCapitalComparison(PartnerComparisonSaveDTO delDTO) throws Exception {
        if (delDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801288);
        }
        if (delDTO.getPartnerId() == null || delDTO.getFileId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801289);
        }
        HashMap<String, String> condition = new HashMap<String, String>();
        condition.put("partner_id", delDTO.getPartnerId());
        condition.put("capital_id", delDTO.getFileId());
        condition.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        int delete = SqlHelper.delete((String)"com.yonyoucloud.upc.data.businesspartner.delCapitalComparison", condition);
        List partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)delDTO.getPartnerId());
        if (CollectionUtils.isEmpty((Collection)partnerCapitalComparisons)) {
            RoleClass roleClass = new RoleClass();
            roleClass.setIsCheck(Boolean.valueOf(false));
            roleClass.setPartnerId(delDTO.getPartnerId());
            roleClass.setRoleClassName(RoleClassName.CAPITAL);
            this.refreshRoleClass(roleClass);
        }
        return delete != 0;
    }

    public BusinessPartnerDTO saveBusinessPartner(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        BusinessPartner businessPartner = this.preprocessBusinessPartnerDataForSave(businessPartnerDTO);
        Object businessPartnerResult = this.doSingleSave4Api("base_businesspartner", "save", businessPartner, true, 2);
        if (businessPartnerResult != null) {
            BusinessPartnerDTO result = new BusinessPartnerDTO();
            result.setId((String)((BusinessPartner)businessPartnerResult).getId());
            return result;
        }
        return null;
    }

    private BusinessPartner preprocessBusinessPartnerDataForSave(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        this.checkBusinessPartnerDTOMustField(businessPartnerDTO);
        this.setBusinessPartnerDTOReferenceIdPriority(businessPartnerDTO);
        Map businessPartnerMap = UpcAPiTool.beanToMap((Object)businessPartnerDTO, (HashSet)BusinessPartnerUtils.businessPartnerFieldTypeSet, null, (String)"Insert");
        BusinessPartner businessPartner = new BusinessPartner();
        businessPartner.putAll(businessPartnerMap);
        this.partnerDTOReferenceConversionPartnerMap(businessPartnerDTO, businessPartner);
        this.setNameMultilingualToBizObject(businessPartnerDTO, businessPartner);
        this.processSubtableData(businessPartnerDTO, businessPartner);
        return businessPartner;
    }

    public UPCResultList batchSaveMBusinessPartner(List<BusinessPartnerDTO> businessPartnerDTOList) {
        UPCResultList upcResultList = new UPCResultList();
        Integer successCount = 0;
        Integer failCount = 0;
        ArrayList<String> messages = new ArrayList<String>();
        ArrayList<BusinessPartnerDTO> successInfos = new ArrayList<BusinessPartnerDTO>();
        for (BusinessPartnerDTO businessPartnerDTO : businessPartnerDTOList) {
            Integer n;
            try {
                BusinessPartnerDTO result = this.saveBusinessPartner(businessPartnerDTO);
                n = successCount;
                successCount = successCount + 1;
                successInfos.add(result);
            }
            catch (Exception e) {
                n = failCount;
                failCount = failCount + 1;
                messages.add(e.getMessage());
            }
        }
        upcResultList.setCount(Integer.valueOf(failCount + successCount));
        upcResultList.setFailCount(failCount);
        upcResultList.setSuccessCount(successCount);
        upcResultList.setMessages(messages);
        upcResultList.setInfos(successInfos);
        return upcResultList;
    }

    private void processSubtableData(BusinessPartnerDTO businessPartnerDTO, BusinessPartner businessPartner) {
        this.processPartnerRoleClasses(businessPartner);
        BusinessPartnerServiceImpl.processPartnerVendorComparisons(businessPartnerDTO);
        this.processPartnerMerchantComparisons(businessPartnerDTO, businessPartner);
        this.processPartnerCapitalComparisons(businessPartnerDTO, businessPartner);
        if (businessPartnerDTO.getCustomExtend() != null) {
            businessPartner.put("customExtend", (Object)businessPartnerDTO.getCustomExtend());
            APIExtPropertiesUtil.processExtProperties((Map)businessPartner, (String)"customExtend", null);
        }
        businessPartner.put("specialKeyFromApi", (Object)true);
    }

    private void processPartnerRoleClasses(BusinessPartner businessPartner) {
        if (!CollectionUtils.isEmpty((Collection)businessPartner.partnerRoleClasses())) {
            for (RoleClass partnerRoleClass : businessPartner.partnerRoleClasses()) {
                if (partnerRoleClass.getRoleClassName() == null) {
                    throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B1B99004D0003B", (String)"\u4e1a\u52a1\u4f19\u4f34\u89d2\u8272\u4fe1\u606f\u4e2d\u89d2\u8272\u7c7b\u522b\u4e0d\u80fd\u4e3a\u7a7a\uff0c\u8bf7\u68c0\u67e5\uff01"));
                }
                partnerRoleClass.setIsCheck((Boolean)partnerRoleClass.get("check"));
            }
        }
    }

    private void processPartnerMerchantComparisons(BusinessPartnerDTO businessPartnerDTO, BusinessPartner businessPartner) {
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerMerchantComparisons())) {
            PartnerMerchantComparisonDTO partnerMerchantComparisonDTO = (PartnerMerchantComparisonDTO)businessPartnerDTO.getPartnerMerchantComparisons().get(0);
            final PartnerMerchantComparison merchantComparison = new PartnerMerchantComparison();
            if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getCode())) {
                merchantComparison.put("merchantId_code", (Object)partnerMerchantComparisonDTO.getCode());
            } else if (businessPartnerDTO.getCode() != null) {
                merchantComparison.put("merchantId_code", (Object)businessPartnerDTO.getCode());
            }
            if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getCreateOrgId())) {
                merchantComparison.put("createOrg", (Object)partnerMerchantComparisonDTO.getCreateOrgId());
            } else if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getCreateOrgCode())) {
                merchantComparison.put("createOrg_code", (Object)partnerMerchantComparisonDTO.getCreateOrgCode());
            } else {
                throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B1B99004D0003E", (String)"\u4e1a\u52a1\u4f19\u4f34\u4e0e\u5ba2\u6237\u5bf9\u7167\u4e2d\u7ba1\u7406\u7ec4\u7ec7id\u548c\u7ba1\u7406\u7ec4\u7ec7\u7f16\u7801\u4e8c\u9009\u4e00\u5fc5\u586b\uff01"));
            }
            if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getTransType())) {
                merchantComparison.put("transType", (Object)partnerMerchantComparisonDTO.getTransType());
            } else if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getTransTypeCode())) {
                merchantComparison.put("transType_code", (Object)partnerMerchantComparisonDTO.getTransTypeCode());
            }
            if (partnerMerchantComparisonDTO.getCustomerClass() != null) {
                merchantComparison.put("customerClass", (Object)partnerMerchantComparisonDTO.getCustomerClass());
            } else if (StringUtils.isNotBlank((CharSequence)partnerMerchantComparisonDTO.getCustomerClassCode())) {
                merchantComparison.put("customerClass_code", (Object)partnerMerchantComparisonDTO.getCustomerClassCode());
            }
            merchantComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
            businessPartner.setPartnerMerchantComparisons((List)new ArrayList<PartnerMerchantComparison>(){
                {
                    this.add(merchantComparison);
                }
            });
        }
    }

    private static void processPartnerVendorComparisons(BusinessPartnerDTO businessPartnerDTO) {
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerVendorComparisons())) {
            PartnerVendorComparisonDTO partnerVendorComparisonDTO = (PartnerVendorComparisonDTO)businessPartnerDTO.getPartnerVendorComparisons().get(0);
            if (StringUtils.isNotBlank((CharSequence)partnerVendorComparisonDTO.getCreateOrgId()) && StringUtils.isNotBlank((CharSequence)partnerVendorComparisonDTO.getCreateOrgCode())) {
                partnerVendorComparisonDTO.setCreateOrgCode(null);
            } else if (StringUtils.isBlank((CharSequence)partnerVendorComparisonDTO.getCreateOrgId()) && StringUtils.isBlank((CharSequence)partnerVendorComparisonDTO.getCreateOrgCode())) {
                throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B1B99004D00037", (String)"\u4e1a\u52a1\u4f19\u4f34\u4e0e\u4f9b\u5e94\u5546\u5bf9\u7167\u4e2d\u7ba1\u7406\u7ec4\u7ec7id\u548c\u7ba1\u7406\u7ec4\u7ec7\u7f16\u7801\u4e8c\u9009\u4e00\u5fc5\u586b\uff01"));
            }
            if (partnerVendorComparisonDTO.getVendorClass() != null && StringUtils.isNotBlank((CharSequence)partnerVendorComparisonDTO.getVendorClassCode())) {
                partnerVendorComparisonDTO.setCreateOrgCode(null);
            }
            partnerVendorComparisonDTO.setId(String.valueOf(IdManager.getInstance().nextId()));
        }
    }

    private void processPartnerCapitalComparisons(BusinessPartnerDTO businessPartnerDTO, BusinessPartner businessPartner) {
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerCapitalComparisons())) {
            PartnerCapitalComparisonDTO partnerCapitalComparisonDTO = (PartnerCapitalComparisonDTO)businessPartnerDTO.getPartnerCapitalComparisons().get(0);
            final PartnerCapitalComparison capitalComparison = new PartnerCapitalComparison();
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getCode())) {
                capitalComparison.put("capitalId_code", (Object)partnerCapitalComparisonDTO.getCode());
            } else if (businessPartnerDTO.getCode() != null) {
                capitalComparison.put("capitalId_code", (Object)businessPartnerDTO.getCode());
            }
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getManagementAccountSubjectId())) {
                capitalComparison.put("capitalAccentityManage", (Object)partnerCapitalComparisonDTO.getManagementAccountSubjectId());
            } else if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getManagementAccountSubjectCode())) {
                capitalComparison.put("capitalAccentityManage_code", (Object)partnerCapitalComparisonDTO.getManagementAccountSubjectCode());
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801291);
            }
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getFundBusinessObjectTypeId())) {
                capitalComparison.put("fundbusinobjtypeid", (Object)partnerCapitalComparisonDTO.getFundBusinessObjectTypeId());
            } else if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getFundBusinessObjectTypeCode())) {
                capitalComparison.put("fundBusinessObjectTypeCodeCode", (Object)partnerCapitalComparisonDTO.getFundBusinessObjectTypeCode());
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801292);
            }
            if (partnerCapitalComparisonDTO.getPrivacyOrPublic() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801293);
            }
            capitalComparison.put("isprivated", (Object)partnerCapitalComparisonDTO.getPrivacyOrPublic());
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getSettleCenterId())) {
                capitalComparison.put("settlemencenter", (Object)partnerCapitalComparisonDTO.getSettleCenterId());
            } else if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getSettleCenterCode())) {
                capitalComparison.put("settlemencenter_code", (Object)partnerCapitalComparisonDTO.getSettleCenterCode());
            }
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getBankBranchId())) {
                capitalComparison.put("openaccountbankid", (Object)partnerCapitalComparisonDTO.getBankBranchId());
            } else if (StringUtils.isNotEmpty((CharSequence)partnerCapitalComparisonDTO.getBankBranchCode())) {
                capitalComparison.put("openaccountbankid_code", (Object)partnerCapitalComparisonDTO.getBankBranchCode());
            }
            if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getAccountSubjectId())) {
                capitalComparison.put("accentity", (Object)partnerCapitalComparisonDTO.getAccountSubjectId());
            } else if (StringUtils.isNotBlank((CharSequence)partnerCapitalComparisonDTO.getAccountSubjectCode())) {
                capitalComparison.put("accentity_code", (Object)partnerCapitalComparisonDTO.getAccountSubjectCode());
            }
            capitalComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
            businessPartner.setPartnerCapitalComparisons((List)new ArrayList<PartnerCapitalComparison>(){
                {
                    this.add(capitalComparison);
                }
            });
        }
    }

    public void updateBusinessPartner(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        List partnerCapitalComparisons;
        List partnerVendorComparisons;
        List partnerMerchantComparisons;
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (StringUtils.isBlank((CharSequence)businessPartnerDTO.getId()) && StringUtils.isBlank((CharSequence)businessPartnerDTO.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801294);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)businessPartnerDTO.getId()));
        } else if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)businessPartnerDTO.getCode()));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id, name, code, partnerType").addCondition((ConditionExpression)queryConditionGroup);
        List businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (boolean)true, (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)businessPartners)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801295);
        }
        BusinessPartner businessPartner = (BusinessPartner)businessPartners.get(0);
        this.setBusinessPartnerDTOReferenceIdPriority(businessPartnerDTO);
        businessPartner.putAll(UpcAPiTool.beanToMap((Object)businessPartnerDTO, (HashSet)BusinessPartnerUtils.businessPartnerFieldTypeSet, null, null));
        this.partnerDTOReferenceConversionPartnerMap(businessPartnerDTO, businessPartner);
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerMerchantComparisons()) && !CollectionUtils.isEmpty((Collection)(partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)((String)businessPartner.getId()))))) {
            businessPartnerDTO.setPartnerMerchantComparisons(null);
            businessPartner.setPartnerMerchantComparisons(partnerMerchantComparisons);
        }
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerVendorComparisons()) && !CollectionUtils.isEmpty((Collection)(partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)((String)businessPartner.getId()))))) {
            businessPartnerDTO.setPartnerVendorComparisons(null);
            businessPartner.setPartnerVendorComparisons(partnerVendorComparisons);
        }
        if (!CollectionUtils.isEmpty((Collection)businessPartnerDTO.getPartnerCapitalComparisons()) && !CollectionUtils.isEmpty((Collection)(partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)((String)businessPartner.getId()))))) {
            businessPartnerDTO.setPartnerCapitalComparisons(null);
            businessPartner.setPartnerCapitalComparisons(partnerCapitalComparisons);
        }
        if (!CollectionUtils.isEmpty((Collection)businessPartner.partnerRoleClasses())) {
            for (RoleClass partnerRoleClass : businessPartner.partnerRoleClasses()) {
                if (RoleClassName.merchant.equals((Object)partnerRoleClass.getRoleClassName()) && !CollectionUtils.isEmpty((Collection)businessPartner.partnerMerchantComparisons())) {
                    partnerRoleClass.setIsCheck(Boolean.valueOf(true));
                }
                if (!RoleClassName.vendor.equals((Object)partnerRoleClass.getRoleClassName()) || CollectionUtils.isEmpty((Collection)businessPartner.partnerVendorComparisons())) continue;
                partnerRoleClass.setIsCheck(Boolean.valueOf(true));
            }
        }
        this.processSubtableData(businessPartnerDTO, businessPartner);
        if (businessPartnerDTO.getNameMultilingual() != null) {
            this.setNameMultilingualToBizObject(businessPartnerDTO, businessPartner);
        }
        if (businessPartnerDTO.getPartnerType() != null) {
            if (businessPartnerDTO.getPartnerType() == 0) {
                businessPartner.put("mobile", null);
            } else if (businessPartnerDTO.getPartnerType() == 1) {
                businessPartner.put("legalPersonIdNo", null);
                businessPartner.put("legalPerson", null);
            }
        }
        businessPartner.setEntityStatus(EntityStatus.Update);
        this.doSingleSave4Api("base_businesspartner", "save", businessPartner, true, 2);
    }

    public UPCPager<BusinessPartnerDTO> queryBusinessPartner(BusinessPartnerQryDTO qryDTO) throws Exception {
        if (qryDTO == null || qryDTO.getFields() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801296);
        }
        UpcAPiTool.checkTenantInfo();
        if (qryDTO.getPageIndex() == null) {
            qryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (qryDTO.getPageSize() == null) {
            qryDTO.setPageSize(CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE);
        }
        if (qryDTO.getPageSize() > UpcAPiTool.PAGE_MAX_SIZE) {
            qryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        QueryField[] qryFields = UpcAPiTool.qryFields(BusinessPartnerFieldUtils.businessPartnerFieldMapping, (String[])qryDTO.getFields());
        QueryConditionGroup queryConditionGroup = UpcAPiTool.setAllCondition((Object)qryDTO, BusinessPartnerFieldUtils.businessPartnerFieldMapping);
        if (queryConditionGroup == null) {
            queryConditionGroup = new QueryConditionGroup();
        }
        if (qryDTO.getCharacterDefine() != null && !qryDTO.getCharacterDefine().isEmpty()) {
            for (String[] key : qryDTO.getCharacterDefine().keySet()) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)("businessPartnerCharacterDef." + (String)key)).eq(qryDTO.getCharacterDefine().get(key)));
            }
        }
        QuerySchema schema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(qryDTO.getPageIndex().intValue(), qryDTO.getPageSize().intValue());
        for (String filed : qryDTO.getFields()) {
            if ("partnerRoleClasses".equals(filed)) {
                schema.addCompositionSchema(QuerySchema.create().name("partnerRoleClasses").fullname("base.businesspartner.RoleClass").addSelect(PartnerConstant.ROLE_CLASS_NAME_FIELD_FOR_API));
                continue;
            }
            if ("partnerMerchantComparisons".equals(filed)) {
                schema.addCompositionSchema(QuerySchema.create().name("partnerMerchantComparisons").fullname("base.businesspartner.PartnerMerchantComparison").addSelect(PartnerConstant.MERCHANT_COMPARISON_FIELD_FOR_API));
                continue;
            }
            if ("partnerVendorComparisons".equals(filed)) {
                schema.addCompositionSchema(QuerySchema.create().name("partnerVendorComparisons").fullname("base.businesspartner.PartnerVendorComparison").addSelect(PartnerConstant.VENDOR_COMPARISON_FIELD_FOR_API));
                continue;
            }
            if (!"partnerCapitalComparisons".equals(filed)) continue;
            schema.addCompositionSchema(QuerySchema.create().name("partnerCapitalComparisons").fullname("base.businesspartner.PartnerCapitalComparison").addSelect(PartnerConstant.CAPITAL_COMPARISON_FIELD_FOR_API));
        }
        if (!CollectionUtils.isEmpty((Collection)qryDTO.getRoleClassNameList())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.roleClassName").in((Collection)qryDTO.getRoleClassNameList()));
            schema.distinct();
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.isCheck").eq((Object)true));
        }
        BillContext billContext = new BillContext();
        billContext.setI18ndoc(true);
        billContext.setFullname("base.businesspartner.BusinessPartner");
        Pager pager = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schema);
        UPCPager businessPartnerDTOUPCPager = new UPCPager();
        if (pager == null) {
            return businessPartnerDTOUPCPager;
        }
        businessPartnerDTOUPCPager.setRecordCount(Integer.valueOf(pager.getRecordCount()));
        businessPartnerDTOUPCPager.setPageCount(Integer.valueOf(pager.getPageCount()));
        List businessPartnerList = pager.getRecordList();
        List businessPartnerDTOS = null;
        if (!CollectionUtils.isEmpty((Collection)businessPartnerList)) {
            businessPartnerDTOS = new ArrayList(businessPartnerList.size());
            HashMap<String, Date> dateMap = new HashMap<String, Date>(businessPartnerList.size());
            HashMap<String, HashMap> partnerCharacterMap = new HashMap<String, HashMap>(businessPartnerList.size());
            for (HashMap businessPartner : businessPartnerList) {
                businessPartner.put("nameMultilingual", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)businessPartner.get("nameMultilingual"))));
                businessPartner.put("shortname", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)businessPartner.get("shortName"))));
                businessPartner.put("scope", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)businessPartner.get("scope"))));
                if (businessPartner.get("buildDate") != null) {
                    dateMap.put(businessPartner.get("id").toString(), (Date)businessPartner.get("buildDate"));
                }
                if (businessPartner.get("businessPartnerCharacterDef") == null) continue;
                partnerCharacterMap.put(businessPartner.get("id").toString(), (HashMap)businessPartner.get("businessPartnerCharacterDef"));
            }
            businessPartnerDTOS = JSON.parseArray((String)JSON.toJSONString((Object)businessPartnerList), BusinessPartnerDTO.class);
            for (BusinessPartnerDTO businessPartnerDTO : businessPartnerDTOS) {
                businessPartnerDTO.setBuildDate((Date)dateMap.get(businessPartnerDTO.getId()));
                businessPartnerDTO.setBusinessPartnerCharacterDef((Map)partnerCharacterMap.get(businessPartnerDTO.getId()));
            }
        }
        businessPartnerDTOUPCPager.setRecordList(businessPartnerDTOS);
        return businessPartnerDTOUPCPager;
    }

    public List<PartnerMerchantComparisonDTO> queryMerchantComparisonByMerchantId(List<Long> merchantIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{merchantIdList});
        QueryConditionGroup merchantComparisonConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)PartnerConstant.MERCHANT_ID).in(merchantIdList)});
        merchantComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        QuerySchema merchantComparisonField = QuerySchema.create().addSelect("partnerId,isDefault,merchantId").addCondition((ConditionExpression)merchantComparisonConditionGroup);
        List partnerMerchantComparisons = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerMerchantComparison", (QuerySchema)merchantComparisonField, null);
        if (!CollectionUtils.isEmpty((Collection)partnerMerchantComparisons)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)partnerMerchantComparisons), PartnerMerchantComparisonDTO.class);
        }
        return null;
    }

    public List<PartnerVendorComparisonDTO> queryVendorComparisonByVendorId(List<Long> vendorIdList) throws Exception {
        UpcAPiTool.checkTenantInfo();
        UpcAPiTool.checkPara((List[])new List[]{vendorIdList});
        QueryConditionGroup merchantComparisonConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)PartnerConstant.VENDOR_ID).in(vendorIdList)});
        merchantComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        QuerySchema merchantComparisonField = QuerySchema.create().addSelect("partnerId,isDefault,vendorId").addCondition((ConditionExpression)merchantComparisonConditionGroup);
        List partnerVendorComparisons = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerVendorComparison", (QuerySchema)merchantComparisonField, null);
        if (!CollectionUtils.isEmpty((Collection)partnerVendorComparisons)) {
            return JSON.parseArray((String)JSON.toJSONString((Object)partnerVendorComparisons), PartnerVendorComparisonDTO.class);
        }
        return null;
    }

    private void checkBusinessPartnerDTOMustField(BusinessPartnerDTO businessPartnerDTO) {
        if (businessPartnerDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801297);
        }
        if (businessPartnerDTO.getNameMultilingual() != null) {
            MultilingualVO nameMultilingual = businessPartnerDTO.getNameMultilingual();
            if (nameMultilingual.getSimplifiedName() == null && nameMultilingual.getEnglishName() == null && nameMultilingual.getTraditionalName() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800049);
            }
        } else if (StringUtils.isBlank((CharSequence)businessPartnerDTO.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801298);
        }
        if (businessPartnerDTO.getStatus() == null) {
            businessPartnerDTO.setStatus(Integer.valueOf(1));
        }
        if (businessPartnerDTO.getPartnerType() == null) {
            businessPartnerDTO.setPartnerType(Integer.valueOf(0));
            if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getMobile())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800025);
            }
            if (businessPartnerDTO.getLicenseType() == null) {
                businessPartnerDTO.setLicenseType(Integer.valueOf(LicenseType.socialCodes.getValue()));
            } else if (businessPartnerDTO.getLicenseType().intValue() != LicenseType.otherLicenses.getValue() && businessPartnerDTO.getLicenseType().intValue() != LicenseType.socialCodes.getValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800026);
            }
        } else if (businessPartnerDTO.getPartnerType() == 1) {
            if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getLegalPerson()) || StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getLegalPersonIdNo())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800027);
            }
            if (businessPartnerDTO.getLicenseType() == null) {
                businessPartnerDTO.setLicenseType(Integer.valueOf(LicenseType.IDCard.getValue()));
            } else if (businessPartnerDTO.getLicenseType().intValue() != LicenseType.IDCard.getValue() && businessPartnerDTO.getLicenseType().intValue() != LicenseType.passport.getValue() && businessPartnerDTO.getLicenseType().intValue() != LicenseType.otherIDDocuments.getValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800028);
            }
        } else if (businessPartnerDTO.getPartnerType() == 2) {
            if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getMobile())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800029);
            }
            if (businessPartnerDTO.getLicenseType() == null) {
                businessPartnerDTO.setLicenseType(Integer.valueOf(LicenseType.socialCodes.getValue()));
            } else if (businessPartnerDTO.getLicenseType().intValue() != LicenseType.socialCodes.getValue() && businessPartnerDTO.getLicenseType().intValue() != LicenseType.businessLicense.getValue() && businessPartnerDTO.getLicenseType().intValue() != LicenseType.otherLicenses.getValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800030);
            }
        }
    }

    private void setBusinessPartnerDTOReferenceIdPriority(BusinessPartnerDTO businessPartnerDTO) {
        if (businessPartnerDTO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801297);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getSuperiorBusinessPartnerId()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getSuperiorBusinessPartnerCode())) {
            businessPartnerDTO.setSuperiorBusinessPartnerCode(null);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCountry()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCountryCode())) {
            businessPartnerDTO.setCountryCode(null);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getTimeZone()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getTimeZoneName())) {
            businessPartnerDTO.setTimeZoneName(null);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getLanguage()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getLanguageCode())) {
            businessPartnerDTO.setLanguageCode(null);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCurrency()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCurrencyCode())) {
            businessPartnerDTO.setCountryCode(null);
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getRegionCode()) && StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getRegionId())) {
            businessPartnerDTO.setRegionCode(null);
        }
    }

    private void setNameMultilingualToBizObject(BusinessPartnerDTO businessPartnerDTO, BusinessPartner businessPartner) {
        BizObject name;
        MultilingualVO nameMultilingual;
        if (businessPartner.get("nameMultilingual") != null) {
            nameMultilingual = (MultilingualVO)businessPartner.get("nameMultilingual");
            name = new BizObject();
            if (StringUtils.isNotBlank((CharSequence)nameMultilingual.getSimplifiedName())) {
                name.put("zh_CN", (Object)nameMultilingual.getSimplifiedName());
            }
            if (StringUtils.isNotBlank((CharSequence)nameMultilingual.getEnglishName())) {
                name.put("en_US", (Object)nameMultilingual.getEnglishName());
            }
            if (StringUtils.isNotBlank((CharSequence)nameMultilingual.getTraditionalName())) {
                name.put("zh_TW", (Object)nameMultilingual.getTraditionalName());
            }
            businessPartner.put("name", (Object)name);
        }
        if (businessPartner.get("shortName") != null) {
            nameMultilingual = (MultilingualVO)businessPartner.get("shortName");
            name = new BizObject();
            name.put("zh_CN", (Object)nameMultilingual.getSimplifiedName());
            name.put("en_US", (Object)nameMultilingual.getEnglishName());
            name.put("zh_TW", (Object)nameMultilingual.getTraditionalName());
            businessPartner.put("shortname", (Object)name);
        }
        if (businessPartner.get("scope") != null) {
            nameMultilingual = (MultilingualVO)businessPartner.get("scope");
            name = new BizObject();
            name.put("zh_CN", (Object)nameMultilingual.getSimplifiedName());
            name.put("en_US", (Object)nameMultilingual.getEnglishName());
            name.put("zh_TW", (Object)nameMultilingual.getTraditionalName());
            businessPartner.put("scope", (Object)name);
        }
    }

    private void partnerDTOReferenceConversionPartnerMap(BusinessPartnerDTO businessPartnerDTO, BusinessPartner businessPartner) {
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getSuperiorBusinessPartnerCode())) {
            businessPartner.put("parent_code", (Object)businessPartnerDTO.getSuperiorBusinessPartnerCode());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCountryCode())) {
            businessPartner.put("country_code", (Object)businessPartnerDTO.getCountryCode());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getTimeZoneName())) {
            businessPartner.put("timeZone_name", (Object)businessPartnerDTO.getTimeZoneName());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getLanguageCode())) {
            businessPartner.put("language_code", (Object)businessPartnerDTO.getLanguageCode());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getCurrencyCode())) {
            businessPartner.put("currency_code", (Object)businessPartnerDTO.getCurrencyCode());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getOperatingTermTo())) {
            businessPartner.put("businessterm", (Object)businessPartnerDTO.getOperatingTermTo());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getSuperiorBusinessPartnerId())) {
            businessPartner.put("parent", (Object)businessPartnerDTO.getSuperiorBusinessPartnerId());
        }
        if (StringUtils.isNotBlank((CharSequence)businessPartnerDTO.getSearchCode())) {
            businessPartner.put("searchcode", (Object)businessPartnerDTO.getSearchCode());
        }
    }

    public Object doSingleSave4Api(String billNum, String action, BusinessPartner businessPartner, Boolean fromApi, Integer convertType) throws Exception {
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum(billNum);
        billDataDto.setAction(action);
        billDataDto.setData((Object)businessPartner);
        billDataDto.setFromApi(fromApi.booleanValue());
        billDataDto.setConvertType(convertType);
        return this.apiImportSingleService.singleSave4Api(billDataDto);
    }

    public Boolean checkIsEnableLinkPlan(PartnerLinkPlan linkPlan, String linkObject) throws Exception {
        if (CollectionUtils.isEmpty((Map)linkPlan) || linkPlan.getStopstatus() == null || linkPlan.getStopstatus().equals(true)) {
            return false;
        }
        if (linkPlan.getLinkObject() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801299);
        }
        if (!linkPlan.getLinkObject().contains(linkObject)) {
            return false;
        }
        if (linkPlan.getLinkMode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801300);
        }
        if (linkPlan.getLinkMode().getValue() != LinkMode.autoLink.getValue()) {
            return false;
        }
        return true;
    }

    private PartnerMerchantComparisonDTO convertMerchantComparisonDTO(PartnerMerchantComparison mc) {
        PartnerMerchantComparisonDTO dto = new PartnerMerchantComparisonDTO();
        dto.setPartnerId(mc.getPartnerId());
        dto.setMerchantId(mc.getMerchantId());
        dto.setIsDefault(mc.getIsDefault());
        return dto;
    }

    private PartnerVendorComparisonDTO convertVendorComparisonDTO(PartnerVendorComparison vc) {
        PartnerVendorComparisonDTO dto = new PartnerVendorComparisonDTO();
        dto.setPartnerId(vc.getPartnerId());
        dto.setVendorId(vc.getVendorId());
        dto.setIsDefault(vc.getIsDefault());
        return dto;
    }

    private PartnerComparisonDTO convertComparisonDTO(PartnerCapitalComparison capitalComparison) {
        PartnerComparisonDTO dto = new PartnerComparisonDTO();
        dto.setPartnerId(capitalComparison.getPartnerId());
        dto.setFileId(capitalComparison.getCapitalId());
        dto.setIsDefault(capitalComparison.getIsDefault());
        return dto;
    }

    private void refreshRoleClass(RoleClass roleClass) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("isCheck", roleClass.getIsCheck());
        params.put("partnerId", roleClass.getPartnerId());
        params.put("roleClassName", roleClass.getRoleClassName().getValue());
        params.put("ytenant_id", AppContext.getYhtTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.refreshRoleClass", params);
    }

    public CoreDocJsonResultForOpenApi<String> partnerBoundMerchantAndVendor(PartnerBoundMerchantAndVendorDTO partnerBoundMerchantAndVendorDTO) throws Exception {
        QueryConditionGroup queryPartnerConditionGroup = new QueryConditionGroup();
        if (StringUtils.isNotBlank((CharSequence)partnerBoundMerchantAndVendorDTO.getPartnerId())) {
            queryPartnerConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)partnerBoundMerchantAndVendorDTO.getPartnerId()));
        } else if (StringUtils.isNotBlank((CharSequence)partnerBoundMerchantAndVendorDTO.getPartnerCode())) {
            queryPartnerConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partnerBoundMerchantAndVendorDTO.getPartnerCode()));
        } else {
            return CoreDocJsonResultForOpenApi.success(null);
        }
        QuerySchema partnerSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryPartnerConditionGroup);
        List businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)partnerSchema, null);
        if (CollectionUtils.isEmpty((Collection)businessPartners)) {
            return CoreDocJsonResultForOpenApi.error((Long)118900L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7320548001C", (String)"\u6839\u636e\u4e1a\u52a1\u4f19\u4f34id\u6216\u4e1a\u52a1\u4f19\u4f34\u7f16\u7801\u672a\u67e5\u8be2\u5230\u4e1a\u52a1\u4f19\u4f34\uff0c\u8bf7\u68c0\u67e5\uff01"));
        }
        BusinessPartner businessPartner = (BusinessPartner)businessPartners.get(0);
        if (partnerBoundMerchantAndVendorDTO.getMerchantId() != null || partnerBoundMerchantAndVendorDTO.getMerchantCode() != null) {
            List partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)((String)businessPartner.getId()));
            if (!CollectionUtils.isEmpty((Collection)partnerMerchantComparisons)) {
                return CoreDocJsonResultForOpenApi.error((Long)118903L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7320548001E", (String)"\u4e1a\u52a1\u4f19\u4f34\u5df2\u7ecf\u5b58\u5728\u4e0e\u5ba2\u6237\u7684\u5bf9\u7167\u4e0d\u5141\u8bb8\u518d\u6b21\u7ed1\u5b9a\uff01"));
            }
            QueryConditionGroup queryMerchantConditionGroup = new QueryConditionGroup();
            if (partnerBoundMerchantAndVendorDTO.getMerchantId() != null) {
                queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)partnerBoundMerchantAndVendorDTO.getMerchantId()));
            } else if (StringUtils.isNotBlank((CharSequence)partnerBoundMerchantAndVendorDTO.getMerchantCode())) {
                queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partnerBoundMerchantAndVendorDTO.getMerchantCode()));
            }
            QuerySchema merchantSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List merchants = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)merchantSchema, null);
            if (CollectionUtils.isEmpty((Collection)merchants)) {
                return CoreDocJsonResultForOpenApi.error((Long)118901L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7320548001F", (String)"\u6839\u636e\u5ba2\u6237id\u6216\u5ba2\u6237\u7f16\u7801\u672a\u67e5\u8be2\u5230\u5ba2\u6237\uff0c\u8bf7\u68c0\u67e5\uff01"));
            }
            Long merchantId = (Long)((Merchant)merchants.get(0)).getId();
            if (merchantId != null) {
                final PartnerMerchantComparison merchantComparison = BusinessPartnerUtils.generateMerchantComparison((String)((String)businessPartner.getId()), (Long)merchantId);
                businessPartner.setPartnerMerchantComparisons((List)new LinkedList<PartnerMerchantComparison>(){
                    {
                        this.add(merchantComparison);
                    }
                });
            }
        }
        if (partnerBoundMerchantAndVendorDTO.getVendorId() != null || partnerBoundMerchantAndVendorDTO.getVendorCode() != null) {
            List partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)((String)businessPartner.getId()));
            if (!CollectionUtils.isEmpty((Collection)partnerVendorComparisons)) {
                return CoreDocJsonResultForOpenApi.error((Long)118904L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B73205480020", (String)"\u4e1a\u52a1\u4f19\u4f34\u5df2\u7ecf\u5b58\u5728\u4e0e\u4f9b\u5e94\u5546\u7684\u5bf9\u7167\u4e0d\u5141\u8bb8\u518d\u6b21\u7ed1\u5b9a\uff01"));
            }
            VendorVO vendorVO = partnerBoundMerchantAndVendorDTO.getVendorId() != null ? this.vendorPubQueryService.getVendorFieldById(partnerBoundMerchantAndVendorDTO.getVendorId(), new String[]{"id"}) : this.vendorPubQueryService.getVendorFieldByCode(partnerBoundMerchantAndVendorDTO.getVendorCode(), new String[]{"id"});
            if (vendorVO == null || vendorVO.getId() == null) {
                return CoreDocJsonResultForOpenApi.error((Long)118902L, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B9B7320548001D", (String)"\u6839\u636e\u4f9b\u5e94\u5546id\u6216\u4f9b\u5e94\u5546\u7f16\u7801\u672a\u67e5\u8be2\u5230\u4f9b\u5e94\u5546\uff0c\u8bf7\u68c0\u67e5\uff01"));
            }
            Long vendorId = vendorVO.getId();
            if (vendorId != null) {
                final PartnerVendorComparison partnerVendorComparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)((String)businessPartner.getId()), (Long)vendorId);
                businessPartner.setPartnerVendorComparisons((List)new LinkedList<PartnerVendorComparison>(){
                    {
                        this.add(partnerVendorComparison);
                    }
                });
            }
        }
        if (!CollectionUtils.isEmpty((Collection)businessPartner.partnerMerchantComparisons()) || !CollectionUtils.isEmpty((Collection)businessPartner.partnerVendorComparisons())) {
            List roleClasses;
            ArrayList<Integer> roleClassNameList = new ArrayList<Integer>();
            if (!CollectionUtils.isEmpty((Collection)businessPartner.partnerMerchantComparisons())) {
                roleClassNameList.add(Integer.valueOf(RoleClassName.merchant.getValue()));
            }
            if (!CollectionUtils.isEmpty((Collection)businessPartner.partnerVendorComparisons())) {
                roleClassNameList.add(Integer.valueOf(RoleClassName.vendor.getValue()));
            }
            if (!CollectionUtils.isEmpty((Collection)(roleClasses = BusinessPartnerUtils.queryPartnerRoleClass((String)((String)businessPartner.getId()), roleClassNameList)))) {
                for (RoleClass roleClass : roleClasses) {
                    roleClass.setIsCheck(Boolean.valueOf(true));
                    roleClass.setEntityStatus(EntityStatus.Update);
                }
            }
            businessPartner.setPartnerRoleClasses(roleClasses);
            businessPartner.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"base.businesspartner.BusinessPartner", (BizObject)businessPartner);
        }
        return CoreDocJsonResultForOpenApi.success((Object)businessPartner.getId().toString());
    }

    public void dealBusinessPartnerForNCC(BusinessPartner businessPartner) throws Exception {
        if (StringUtils.isNotBlank((CharSequence)((CharSequence)businessPartner.get("searchCode")))) {
            businessPartner.put(PartnerConstant.SEARCH_CODE, businessPartner.get("searchCode"));
        }
        List roleClasses = BusinessPartnerUtils.generatePartnerRoleClass((BusinessPartner)businessPartner, (Number)null);
        businessPartner.setPartnerRoleClasses(roleClasses);
        for (RoleClass roleClass : roleClasses) {
            if (roleClass.getRoleClassName() == RoleClassName.merchant && StringUtils.isNotBlank((CharSequence)((CharSequence)businessPartner.get(PartnerConstant.NCC_MERCHANT_ID)))) {
                roleClass.setIsCheck(Boolean.valueOf(true));
                final PartnerMerchantComparison merchantComparison = BusinessPartnerUtils.generateMerchantComparison((String)((String)businessPartner.getId()), (Long)Long.parseLong((String)businessPartner.get(PartnerConstant.NCC_MERCHANT_ID)));
                businessPartner.setPartnerMerchantComparisons((List)new ArrayList<PartnerMerchantComparison>(){
                    {
                        this.add(merchantComparison);
                    }
                });
                continue;
            }
            if (roleClass.getRoleClassName() == RoleClassName.vendor && StringUtils.isNotBlank((CharSequence)((CharSequence)businessPartner.get(PartnerConstant.NCC_VENDOR_ID)))) {
                roleClass.setIsCheck(Boolean.valueOf(true));
                final PartnerVendorComparison partnerVendorComparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)((String)businessPartner.getId()), (Long)Long.parseLong((String)businessPartner.get(PartnerConstant.NCC_VENDOR_ID)));
                businessPartner.setPartnerVendorComparisons((List)new ArrayList<PartnerVendorComparison>(){
                    {
                        this.add(partnerVendorComparison);
                    }
                });
                continue;
            }
            if (roleClass.getRoleClassName() != RoleClassName.org || !StringUtils.isNotBlank((CharSequence)((CharSequence)businessPartner.get(PartnerConstant.NCC_INTERNAL_ORG_ID)))) continue;
            roleClass.setIsCheck(Boolean.valueOf(true));
        }
    }

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public BusinessPartnerDTO updateSuperiorsBusinessPartnerOnAssoc(BusinessPartnerDTO businessPartnerDTO) throws Exception {
        if (businessPartnerDTO == null || StringUtils.isBlank((CharSequence)businessPartnerDTO.getId()) && StringUtils.isBlank((CharSequence)businessPartnerDTO.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801301);
        }
        String partnerId = businessPartnerDTO.getId();
        String code = businessPartnerDTO.getCode();
        BusinessPartner businessPartner = this.findBusinessPartner(partnerId, code).orElseThrow(() -> new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1C73D9CA05000019", (String)"\u6839\u636eid\u6216\u8005code\u6ca1\u67e5\u8be2\u5230\u5bf9\u5e94\u7684\u4e1a\u52a1\u4f19\u4f34\uff0c\u8bf7\u68c0\u67e5!")));
        partnerId = (String)businessPartner.getId();
        code = businessPartner.getCode();
        String upMerchantPartnerId = this.getUpMerchantPartnerId(partnerId);
        String upVendorPartnerId = this.getUpVendorPartnerId(partnerId);
        if (upMerchantPartnerId != null && upVendorPartnerId != null && !upMerchantPartnerId.equals(upVendorPartnerId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801302, new Object[]{partnerId, code});
        }
        if (upMerchantPartnerId != null || upVendorPartnerId != null) {
            String superiorBusinessPartnerId = upMerchantPartnerId != null ? upMerchantPartnerId : upVendorPartnerId;
            return BusinessPartnerServiceImpl.updateBusinessPartner(partnerId, code, superiorBusinessPartnerId);
        }
        return null;
    }

    @NotNull
    private static BusinessPartnerDTO updateBusinessPartner(String partnerId, String code, String superiorBusinessPartnerId) throws Exception {
        BusinessPartner businessPartner = new BusinessPartner();
        businessPartner.setId((Object)partnerId);
        businessPartner.setEntityStatus(EntityStatus.Update);
        businessPartner.setParent(superiorBusinessPartnerId);
        MetaDaoHelper.update((String)"base.businesspartner.BusinessPartner", (BizObject)businessPartner);
        BusinessPartnerDTO businessPartnerDTO = new BusinessPartnerDTO();
        businessPartnerDTO.setId(partnerId);
        businessPartnerDTO.setCode(code);
        businessPartnerDTO.setSuperiorBusinessPartnerId(superiorBusinessPartnerId);
        QuerySchema querySchema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)superiorBusinessPartnerId)}));
        Map stringObjectMap = MetaDaoHelper.queryOne((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchema);
        if (stringObjectMap == null || stringObjectMap.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801303, new Object[]{partnerId});
        }
        businessPartnerDTO.setSuperiorBusinessPartnerCode(stringObjectMap.get("code").toString());
        return businessPartnerDTO;
    }

    private String getUpVendorPartnerId(String partnerId) throws Exception {
        Long defaultVendorId = BusinessPartnerUtils.getDefaultVendorId((String)partnerId);
        if (defaultVendorId != null) {
            VendorVO upVendorFieldById;
            Long upVendorId = null;
            VendorVO vendorFieldById = this.vendorPubQueryService.getVendorFieldById(defaultVendorId, new String[]{"parentVendor"});
            if (vendorFieldById != null) {
                upVendorId = vendorFieldById.getParentVendor();
            }
            if (upVendorId != null && (upVendorFieldById = this.vendorPubQueryService.getVendorFieldById(upVendorId, new String[]{"businessPartner"})) != null) {
                return upVendorFieldById.getBusinessPartner();
            }
        }
        return null;
    }

    private String getUpMerchantPartnerId(String partnerId) throws Exception {
        Long parentCustomerId;
        Long defaultMerchantId = BusinessPartnerUtils.getDefaultMerchantId((String)partnerId);
        if (defaultMerchantId != null && (parentCustomerId = this.queryParentCustomerId(defaultMerchantId)) != null) {
            return this.getMerchantPartnerId(parentCustomerId);
        }
        return null;
    }

    private String getMerchantPartnerId(Long parentCustomerId) throws Exception {
        QuerySchema queryParentsPartnerSchema;
        Map upMerchantPartnerIdMap;
        if (parentCustomerId != null && (upMerchantPartnerIdMap = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)(queryParentsPartnerSchema = QuerySchema.create().addSelect("businessPartner").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)parentCustomerId)}))))) != null && !upMerchantPartnerIdMap.isEmpty()) {
            return upMerchantPartnerIdMap.get("businessPartner").toString();
        }
        return null;
    }

    private Long queryParentCustomerId(Long defaultMerchantId) throws Exception {
        Iterator iterator;
        QuerySchema queryParentCustomerIdSchema = QuerySchema.create().addSelect("parentCustomer").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)defaultMerchantId)}));
        List parentCustomers = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)queryParentCustomerIdSchema, null);
        if (!CollectionUtils.isEmpty((Collection)parentCustomers) && (iterator = parentCustomers.iterator()).hasNext()) {
            Merchant parentCustomer = (Merchant)iterator.next();
            return (Long)parentCustomer.get("parentCustomer");
        }
        return null;
    }

    private Optional<BusinessPartner> findBusinessPartner(String partnerId, String code) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id, code");
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (StringUtils.isNotBlank((CharSequence)partnerId)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)partnerId));
        } else {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)code));
        }
        querySchema.addCondition((ConditionExpression)conditionGroup);
        List businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchema, null);
        return businessPartners.stream().findFirst();
    }
}

