/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.coredoc.service.utils.OrgPermissionsService
 *  com.yonyou.diwork.model.dto.ControlPointDTO
 *  com.yonyou.diwork.service.ILicenseQueryService
 *  com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.QueryDaoDTO
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.licenseclient.service.UserCountService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
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
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.coredoc.service.utils.OrgPermissionsService;
import com.yonyou.diwork.model.dto.ControlPointDTO;
import com.yonyou.diwork.service.ILicenseQueryService;
import com.yonyou.iuap.apdoc.coredoc.constants.CheckLimitConstant;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantQryDao;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.QueryDaoDTO;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.QueryOperatorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO;
import com.yonyou.iuap.apdoc.coredoc.po.pub.CoreDocBaseEntity;
import com.yonyou.iuap.apdoc.coredoc.po.pub.QueryConditionPO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.licenseclient.service.UserCountService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class UPCMerchantQueryService
implements IUPCMerchantQueryService {
    private static final Logger log = LoggerFactory.getLogger(UPCMerchantQueryService.class);
    @Autowired
    private MerchantQryDao merchantQryDao;
    @Autowired
    BizCache bizCache;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private ILicenseQueryService iLicenseQueryService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private OrgPermissionsService orgPermissionsService;

    public Map<String, Object> setParams(Long merchantId, Long merchantApplyRangeId, String orgId, Long custId, Long shopId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        condition.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantId));
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("merchantId", merchantId);
        params.put("tenantId", AppContext.getCurrentUser().getTenant());
        params.put("yTenantId", AppContext.getCurrentUser().getYTenantId());
        if (merchantApplyRangeId == null || merchantApplyRangeId == 0L) {
            if (orgId != null) {
                params.put("orgId", orgId);
                condition.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)orgId));
            } else if (custId != null) {
                params.put("custId", custId);
            } else if (shopId != null) {
                params.put("shopId", shopId);
            } else {
                params.put("isCreator", true);
                condition.addCondition((ConditionExpression)QueryCondition.name((String)"isCreator").eq((Object)true));
            }
        } else {
            params.put("merchantApplyRangeId", merchantApplyRangeId);
            condition.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)merchantApplyRangeId));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,isCreator,isApplied,merchantDetailId").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800811);
        }
        params.put("@merchantDetailId", ((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantDetailId());
        params.put("@merchantApplyRangeId", ((MerchantApplyRange)merchantApplyRangeList.get(0)).getId());
        params.put("isCreator", ((MerchantApplyRange)merchantApplyRangeList.get(0)).getIsCreator());
        params.put("isApplied", ((MerchantApplyRange)merchantApplyRangeList.get(0)).getIsApplied());
        return params;
    }

    public <T1 extends BizObject, T2 extends BizObject> void exchangeFromExtend(T1 sourceObj, T2 destObj, Map<String, Object> params) {
        try {
            List merchantNotCarryAttrs = null;
            Class dataType = null;
            String bizKey = "cacheMapmerchatnnotcarry";
            if (CollectionUtils.isEmpty((Collection)((Collection)this.bizCache.get(bizKey, dataType)))) {
                merchantNotCarryAttrs = this.merchantQryDao.getMerchantNotCarryAttrs(params);
                if (CollectionUtils.isEmpty((Collection)merchantNotCarryAttrs)) {
                    throw new CoreDocBusinessException(null, "merchant_notcarry_attrdatalost");
                }
                this.bizCache.set(bizKey, merchantNotCarryAttrs);
            } else {
                merchantNotCarryAttrs = (List)this.bizCache.get(bizKey, dataType);
            }
            ArrayList listStr = new ArrayList();
            merchantNotCarryAttrs.forEach(attr -> listStr.add((String)attr.get("cName")));
            for (Map.Entry entry : sourceObj.entrySet()) {
                if (CollectionUtils.isEmpty(listStr) || listStr.contains(entry.getKey().toString())) continue;
                destObj.put(entry.getKey().toString(), entry.getValue());
            }
        }
        catch (Exception e) {
            log.error("querynotcarryattrerror" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(null, "The merchant_NotCarry_attr table is missing prefabricated data!");
        }
    }

    public void setOrgs4U8c(Merchant merchant, Boolean singleOrg, Boolean bAutoShare) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        UserType userType = AppContext.getCurrentUser().getUserType();
        if (this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            orgs.add(merchant.getCreateOrg());
        } else {
            if (singleOrg.booleanValue()) {
                if (userType == UserType.ShopAdminUser || userType == UserType.ShopUser) {
                    merchant.setCreateOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
                    merchant.setCreateMerchant(Long.valueOf((String)AppContext.getCurrentUser().get("singleOrgId")));
                } else {
                    List<String> subOrgs = this.upcControlRuleService.getSubOrgs("666666");
                    subOrgs = subOrgs.stream().filter(orgId -> !orgId.equals("666666")).collect(Collectors.toList());
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080105", (String)"\u5ba2\u6237\u6863\u6848\u5355\u7ec4\u7ec7\u6a21\u5f0f\u4e0b\u83b7\u53d6\u7ec4\u7ec7\u6570\u636e:{}"), subOrgs);
                    if (subOrgs.isEmpty() || subOrgs.size() > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800396);
                    }
                    merchant.setCreateOrg(subOrgs.get(0));
                    if (null != merchant.merchantAppliedDetail()) {
                        ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setBelongOrg(subOrgs.get(0));
                    }
                }
                orgs.add(merchant.getCreateOrg());
            } else if (null != merchant.getCreateOrg()) {
                orgs.add(merchant.getCreateOrg());
                Set<String> shareAll = null;
                if (bAutoShare.booleanValue()) {
                    shareAll = this.orgPermissionsUtil.getShareOrgDetail4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant);
                    orgs.addAll(shareAll);
                }
            }
            Set orgRangeShareSet = this.orgPermissionsService.getShareOrgDetailByManageOrg4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant);
            List merchantApplyRanges = merchant.merchantApplyRanges();
            if (!CollectionUtils.isEmpty((Collection)orgRangeShareSet) && !CollectionUtils.isEmpty((Collection)merchantApplyRanges)) {
                for (MerchantApplyRange merchantApplyRange : merchantApplyRanges) {
                    if (!orgRangeShareSet.contains(merchantApplyRange.getOrgId())) continue;
                    orgs.add(merchantApplyRange.getOrgId());
                }
            }
        }
        List<Object> ranges = new ArrayList(orgs.size());
        if (orgs.size() > 0) {
            List result = this.upcControlRuleService.getOrgDetail(orgs);
            if (userType != UserType.ShopAdminUser && userType != UserType.ShopUser && !CollectionUtils.isEmpty(result)) {
                result = result.parallelStream().filter(map -> map.get("externalorg").equals(0)).collect(Collectors.toList());
            }
            for (Map map2 : result) {
                MerchantApplyRange range = MerchantUtils.getMerchantApplyRange(null, (Integer)1, (String)map2.get("id").toString());
                range.remove("id");
                range.put("orgId", map2.get("id"));
                range.put("orgCode", map2.get("code"));
                range.put("orgName", map2.get("name"));
                if (map2.get("id").toString().equalsIgnoreCase(merchant.getCreateOrg())) {
                    range.setIsCreator(Boolean.valueOf(true));
                    range.setIsApplied(Boolean.valueOf(true));
                }
                ranges.add(range);
            }
            ranges = ranges.stream().sorted(Comparator.comparing(MerchantApplyRange::getOrgId)).sorted(Comparator.comparing(MerchantApplyRange::getIsCreator).reversed()).collect(Collectors.toList());
        }
        merchant.setMerchantApplyRanges(ranges);
    }

    public void setOrgsVoucher(Merchant merchant) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        orgs.add(merchant.getCreateOrg());
        List<Object> ranges = new ArrayList(orgs.size());
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        for (Map org : result) {
            MerchantApplyRange range = MerchantUtils.getMerchantApplyRange(null, (Integer)1, (String)org.get("id").toString());
            range.remove("id");
            range.put("orgId", org.get("id"));
            range.put("orgCode", org.get("code"));
            range.put("orgName", org.get("name"));
            range.put("shopId", (Object)merchant.getCreateOrg());
            if (org.get("id").toString().equalsIgnoreCase(merchant.getCreateOrg())) {
                range.setIsCreator(Boolean.valueOf(true));
                range.setIsApplied(Boolean.valueOf(true));
            }
            ranges.add(range);
        }
        ranges = ranges.stream().sorted(Comparator.comparing(MerchantApplyRange::getOrgId)).sorted(Comparator.comparing(MerchantApplyRange::getIsCreator).reversed()).collect(Collectors.toList());
        merchant.setMerchantApplyRanges(ranges);
    }

    public List<Map<String, Object>> getCustomerDefine(BillDataDto bill) throws Exception {
        return Arrays.asList(new Map[0]);
    }

    public Map<String, Object> getMerchantVendor(BillDataDto bill) throws Exception {
        if (StringUtils.isEmpty((Object)bill.getBillnum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800816);
        }
        HashMap<String, Object> message = new HashMap<String, Object>();
        String billnum = bill.getBillnum();
        Map data = (Map)bill.getData();
        if (data == null || data.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800760);
        }
        QuerySchema querySchema = null;
        List merchantVendor = new ArrayList();
        if ("aa.merchant".equals(billnum)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id,suppliers");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(data.get("id"))}));
            log.debug("getMerchantVendor_Merchant:id{}", (Object)querySchema);
            merchantVendor = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty(merchantVendor) && merchantVendor.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800817);
            }
            if (CollectionUtils.isEmpty(merchantVendor)) {
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,suppliers");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"suppliers").eq(data.get("id"))}));
                log.debug("getMerchantVendor_Merchant:id{}", (Object)querySchema);
                merchantVendor = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                if (CollectionUtils.isEmpty(merchantVendor)) {
                    message.put("code", "404");
                    message.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080100", (String)"\u67e5\u8be2\u5ba2\u6237\u6863\u6848\uff1a\u6ca1\u6709\u8be5\u6761\u5ba2\u6237\u6216\u5bf9\u5e94\u7684\u4f9b\u5e94\u5546\uff01"));
                    return message;
                }
                if (!CollectionUtils.isEmpty(merchantVendor) && merchantVendor.size() != 1) {
                    message.put("code", "403");
                    message.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080101", (String)"\u67e5\u8be2\u5ba2\u6237\u6863\u6848\uff1a\u67e5\u8be2\u5bf9\u5e94\u4f9b\u5e94\u5546\u65f6\u6709\u591a\u4e2a\u5ba2\u6237\u4e0e\u5176\u5bf9\u5e94\u8bf7\u66f4\u6539\u6570\u636e\uff01"));
                    return message;
                }
            }
        } else if ("aa.vendor".equals(billnum)) {
            querySchema = QuerySchema.create();
            querySchema.addSelect("id,correspondingcust");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(data.get("id"))}));
            log.debug("getMerchantVendor_Vendor:id{}", (Object)querySchema);
            merchantVendor = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)querySchema, (String)"yssupplier");
            if (!CollectionUtils.isEmpty(merchantVendor) && merchantVendor.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800818);
            }
            if (CollectionUtils.isEmpty(merchantVendor)) {
                querySchema = QuerySchema.create();
                querySchema.addSelect("id,correspondingcust");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"correspondingcust").eq(data.get("id"))}));
                log.debug("getMerchantVendor_Vendor:id{}", (Object)querySchema);
                merchantVendor = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)querySchema, (String)"yssupplier");
                if (CollectionUtils.isEmpty(merchantVendor)) {
                    message.put("code", "404");
                    message.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080106", (String)"\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\uff1a\u6ca1\u6709\u8be5\u6761\u4f9b\u5e94\u5546\u6216\u5bf9\u5e94\u7684\u5ba2\u6237\uff01"));
                    return message;
                }
                if (!CollectionUtils.isEmpty(merchantVendor) && merchantVendor.size() != 1) {
                    message.put("code", "403");
                    message.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800F1", (String)"\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\uff1a\u67e5\u8be2\u5bf9\u5e94\u5ba2\u6237\u65f6\u6709\u591a\u4e2a\u4f9b\u5e94\u5546\u4e0e\u5176\u5bf9\u5e94\u8bf7\u66f4\u6539\u6570\u636e\uff01"));
                    return message;
                }
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800819);
        }
        return (Map)merchantVendor.get(0);
    }

    public Map<String, Object> getMerchantNamenById(BillDataDto bill) throws Exception {
        HashMap<String, Object> message = new HashMap<String, Object>();
        List data = (List)bill.getData();
        List merchantList = null;
        if (data == null || CollectionUtils.isEmpty((Collection)data)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800760);
        }
        if (!CollectionUtils.isEmpty(data = data.stream().filter(element -> !ObjectUtils.isEmpty((Object)element)).collect(Collectors.toList()))) {
            HashMap params = new HashMap();
            params.put("list", data);
            merchantList = SqlHelper.selectList((String)"com.yonyoucloud.upc.merchant.dao.MerchantQuery.getMerchantNamenById", params);
        }
        if (CollectionUtils.isEmpty(merchantList)) {
            message.put("code", "400");
            message.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800FC", (String)"\u67e5\u8be2\u7ed3\u679c\u4e3a\u7a7a\uff01"));
            return message;
        }
        message.put("code", "200");
        message.put("data", merchantList);
        return message;
    }

    public List<Map<String, Object>> getParentCustomerById(BillDataDto bill) throws Exception {
        Map data = (Map)bill.getData();
        if (!(data == null || data.isEmpty() || data.containsKey("merchantId") || data.get("merchantId") instanceof List)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800760);
        }
        List merchantIdList = (List)data.get("merchantId");
        ArrayList<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        assert (merchantIdList.size() < CheckLimitConstant.FIELD_LIMIT);
        QueryDaoDTO queryDaoDTO = new QueryDaoDTO();
        queryDaoDTO.setCoreDocBaseEntity((CoreDocBaseEntity)new MerchantPO());
        queryDaoDTO.setSelectFieldArr((String[])Stream.of("id", "parentCustomer", "path").toArray(String[]::new));
        queryDaoDTO.setConditionList(Arrays.asList(new QueryConditionPO("id", QueryOperatorEnum.IN, merchantIdList)));
        List merchantPOList = this.merchantQryDao.queryEntityByCondition(queryDaoDTO);
        if (!CollectionUtils.isEmpty((Collection)merchantPOList)) {
            merchantPOList.forEach(merchantPO -> {
                ArrayList<Long> resultParentCustomerList = new ArrayList<Long>();
                if (org.apache.commons.lang3.StringUtils.isNotBlank((CharSequence)merchantPO.getPath())) {
                    String[] pathArr;
                    for (String path : pathArr = merchantPO.getPath().split("\\|")) {
                        if (!org.apache.commons.lang3.StringUtils.isNotEmpty((CharSequence)path) || path.equals(merchantPO.getId().toString())) continue;
                        resultParentCustomerList.add(Long.parseLong(path));
                    }
                }
                if (!CollectionUtils.isEmpty(resultParentCustomerList)) {
                    HashMap<String, ArrayList<Long>> parentCustomer = new HashMap<String, ArrayList<Long>>();
                    parentCustomer.put(merchantPO.getId().toString(), resultParentCustomerList);
                    resultList.add(parentCustomer);
                }
            });
        }
        return resultList;
    }

    public Map<String, List<Map<String, Object>>> getLowerCustomerById(BillDataDto bill) throws Exception {
        Map data = (Map)bill.getData();
        if (data == null || data.isEmpty() || !data.containsKey("merchantId") || !(data.get("merchantId") instanceof List)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800760);
        }
        List merchantIdList = (List)data.get("merchantId");
        HashMap<String, List<Map<String, Object>>> tempMap = new HashMap<String, List<Map<String, Object>>>();
        for (String merchentId : merchantIdList) {
            QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)merchentId)});
            QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("id,parentCustomer").addCondition((ConditionExpression)queryMerchantNameCondition);
            List merchant = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
            tempMap.put(merchentId, merchant);
        }
        return tempMap;
    }

    public ControlPointDTO getCurrentByCode(String tenantId, String controlPointCode) {
        return this.iLicenseQueryService.getCurrentByCode(tenantId, controlPointCode);
    }

    public ControlPointDTO getCurrentByAppCode(String tenantId, String appCode) {
        return this.iLicenseQueryService.getCurrentByAppCode(tenantId, appCode);
    }

    public List<ControlPointDTO> getCurrentByStandardCode(String tenantId, String standardCode) {
        return this.iLicenseQueryService.getCurrentByStandardCode(tenantId, standardCode);
    }

    public ControlPointDTO getCurrentNewByAppCode(String tenantId, String appCode) {
        return this.iLicenseQueryService.getCurrentNewByAppCode(tenantId, appCode);
    }

    public void cancelLicense() {
        UserCountService.cancelLicense((String)UUID.randomUUID().toString(), (String)"ppm0000072808");
    }

    public void regLicense() {
        UserCountService.regLicense((String)UUID.randomUUID().toString(), (String)InvocationInfoProxy.getUsername(), (String)"ppm0000072808");
    }

    public int getRemainLicenseCount() {
        return UserCountService.getRemainLicenseCount((String)"ppm0000072808");
    }

    public boolean getOpenParam(String openParam) {
        Object openParamObj = null;
        try {
            openParamObj = OptionUtils.getOptionByName((String)"u8c-config", (String)openParam, null);
        }
        catch (Exception e) {
            log.error(String.format("\u83b7\u53d6\u5f00\u901a\u53c2\u6570:{}\u5f02\u5e38", openParam), (Object)e.getMessage(), (Object)e);
        }
        return openParamObj != null && ("1".equals(openParamObj.toString()) || "true".equals(openParamObj.toString()));
    }

    public Map<String, Object> selectMerchantForUDH(Map data) throws Exception {
        Object menuObject;
        Map<String, Object> result = new HashMap<String, Object>();
        if (data.containsKey("merchantId") && data.get("merchantId") != null && ((result = (Map)(menuObject = AppContext.cache().getObject(data.get("merchantId").toString()))) == null || result.isEmpty()) && (result = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.option.dao.merchant.selectMerchantForUDH", (Object)data)) != null && !result.isEmpty()) {
            AppContext.cache().setObject(data.get("merchantId").toString(), result, 0);
        }
        return result;
    }

    public Map<String, Object> selectMerchantApplyRangeForUDH(Map data) throws Exception {
        Object menuObject;
        Map<String, Object> result = new HashMap<String, Object>();
        if (data.containsKey("merchantApplyRangeId") && data.get("merchantApplyRangeId") != null && ((result = (Map)(menuObject = AppContext.cache().getObject(data.get("merchantApplyRangeId").toString()))) == null || result.isEmpty()) && (result = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.option.dao.merchant.selectMerchantApplyRangeForUDH", (Object)data)) != null && !result.isEmpty()) {
            AppContext.cache().setObject(data.get("merchantApplyRangeId").toString(), result, 0);
        }
        return result;
    }
}

