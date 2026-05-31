/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.constants.MerchantApplyRpcUtils;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.service.IMerchantApplyRpcService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.api.FormulaPubFuntion;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class MerchantApplyRpcService
extends FormulaPubFuntion
implements IMerchantApplyRpcService {
    private static final Logger log = LoggerFactory.getLogger(MerchantApplyRpcService.class);
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;

    @Override
    public Object getMerchantApplyValue(String field, Long customerApplyId) {
        try {
            if (field == null || customerApplyId == null) {
                return null;
            }
            ArrayList<Long> customerApplyIdList = new ArrayList<Long>();
            customerApplyIdList.add(customerApplyId);
            Map<Long, Object> customerApplyValue = this.getCustomerApplyValue(field, customerApplyIdList);
            if (customerApplyValue != null) {
                return customerApplyValue.get(customerApplyId);
            }
            Map<Long, String> customerDataList = this.getCustomerDataList(customerApplyIdList);
            if (customerDataList == null) {
                return null;
            }
            Merchant merchant = this.initMerchant(customerDataList.get(customerApplyId));
            if (merchant == null) {
                return null;
            }
            return this.getMerchantValue(field, merchant);
        }
        catch (Exception e) {
            log.error("getMerchantApplyValue:" + e.getMessage(), (Throwable)e);
            return null;
        }
    }

    @Override
    public Object getMerchantApplyValues(String field, List<Long> customerApplyIdList) {
        try {
            if (field == null || CollectionUtils.isEmpty(customerApplyIdList)) {
                return null;
            }
            ArrayList<Object> customerApplyValueList = new ArrayList<Object>();
            Map<Long, Object> customerApplyValue = this.getCustomerApplyValue(field, customerApplyIdList);
            if (customerApplyValue != null) {
                for (Long customerApplyId : customerApplyIdList) {
                    customerApplyValueList.add(customerApplyValue.get(customerApplyId));
                }
                return customerApplyValueList;
            }
            Map<Long, String> customerDataList = this.getCustomerDataList(customerApplyIdList);
            if (customerDataList == null) {
                return null;
            }
            for (Long customApplyId : customerApplyIdList) {
                Merchant merchant = this.initMerchant(customerDataList.get(customApplyId));
                if (merchant == null) continue;
                customerApplyValueList.add(this.getMerchantValue(field, merchant));
            }
            return customerApplyValueList;
        }
        catch (Exception e) {
            log.error("getMerchantApplyValue:" + e.getMessage(), (Throwable)e);
            return null;
        }
    }

    public Map<Long, Object> getCustomerApplyValue(String field, List<Long> customerApplyIdList) throws Exception {
        if (!field.contains("applyCustomer.")) {
            HashMap<Long, Object> customerApplyMap = new HashMap<Long, Object>();
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id," + field);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(customerApplyIdList)});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List customerApplyInDbList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)customerApplyInDbList)) {
                String analyzeField = field.replace("\\.", "_");
                for (CustomerApply customerApply : customerApplyInDbList) {
                    customerApplyMap.put((Long)customerApply.getId(), customerApply.get(analyzeField));
                }
                return customerApplyMap;
            }
        }
        return null;
    }

    public Object getMerchantValue(String field, Merchant merchant) {
        Object retValue = null;
        if (field.contains("applyCustomer.merchantAppliedDetail.")) {
            String replace = field.replace("applyCustomer.merchantAppliedDetail.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.merchantAppliedDetail(), MerchantApplyRpcUtils.MERCHANT_APPLY_RANGE_DETAIL_FIELD_MAPPING);
        } else if (field.contains("applyCustomer.merchantRole.")) {
            String replace = field.replace("applyCustomer.merchantRole.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectValue(replace, merchant.merchantRole());
        } else if (field.contains("applyCustomer.merchantsManager.")) {
            String replace = field.replace("applyCustomer.merchantsManager.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectValue(replace, merchant.merchantsManager());
        } else if (field.contains("applyCustomer.merchantAddressInfos.")) {
            String replace = field.replace("applyCustomer.merchantAddressInfos.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.merchantAddressInfos());
        } else if (field.contains("applyCustomer.merchantContacterInfos.")) {
            String replace = field.replace("applyCustomer.merchantContacterInfos.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.merchantContacterInfos());
        } else if (field.contains("applyCustomer.merchantAgentFinancialInfos.")) {
            String replace = field.replace("applyCustomer.merchantAgentFinancialInfos.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.merchantAgentFinancialInfos());
        } else if (field.contains("applyCustomer.merchantAgentInvoiceInfos.")) {
            String replace = field.replace("applyCustomer.merchantAgentInvoiceInfos.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.merchantAgentInvoiceInfos());
        } else if (field.contains("applyCustomer.customerAreas.")) {
            String replace = field.replace("applyCustomer.customerAreas.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.customerAreas());
        } else if (field.contains("applyCustomer.principals.")) {
            String replace = field.replace("applyCustomer.principals.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectListValue(replace, merchant.principals());
        } else if (field.contains("applyCustomer.merchantCharacter.")) {
            String replace = field.replace("applyCustomer.merchantCharacter.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectValue(replace, (BizObject)merchant.get("merchantCharacter"));
        } else if (field.contains("applyCustomer.")) {
            String replace = field.replace("applyCustomer.", "");
            if (replace.isEmpty()) {
                return retValue;
            }
            retValue = this.getMerchantBizObjectValue(replace, merchant, MerchantApplyRpcUtils.MERCHANT_FIELD_MAPPING);
        }
        return retValue;
    }

    public <T extends BizObject> Object getMerchantBizObjectListValue(String field, List<T> bizObjectList) {
        return this.getMerchantBizObjectListValue(field, bizObjectList, null);
    }

    public <T extends BizObject> Object getMerchantBizObjectListValue(String field, List<T> bizObjectList, Map<String, String> qryFieldsMap) {
        Object retValue = null;
        if (!CollectionUtils.isEmpty(bizObjectList)) {
            if (qryFieldsMap != null && !qryFieldsMap.isEmpty() && qryFieldsMap.get(field) != null) {
                retValue = ((BizObject)bizObjectList.get(0)).get(qryFieldsMap.get(field));
            } else {
                String fieldName = field.replace(".", "_");
                if (((BizObject)bizObjectList.get(0)).get(fieldName) != null) {
                    retValue = ((BizObject)bizObjectList.get(0)).get(fieldName);
                } else {
                    String fieldItemName = fieldName.replace("_name", "_Name");
                    if (((BizObject)bizObjectList.get(0)).get(fieldItemName) != null) {
                        retValue = ((BizObject)bizObjectList.get(0)).get(fieldItemName);
                    }
                }
            }
        }
        return this.getMultiValue(retValue);
    }

    public <T extends BizObject> Object getMerchantBizObjectValue(String field, T bizObject) {
        return this.getMerchantBizObjectValue(field, bizObject, null);
    }

    public <T extends BizObject> Object getMerchantBizObjectValue(String field, T bizObject, Map<String, String> qryFieldsMap) {
        Object retValue = null;
        if (!CollectionUtils.isEmpty(bizObject)) {
            if (qryFieldsMap != null && !qryFieldsMap.isEmpty() && qryFieldsMap.get(field) != null) {
                retValue = bizObject.get(qryFieldsMap.get(field));
            } else {
                String fieldName = field.replace(".", "_");
                if (bizObject.get(fieldName) != null) {
                    retValue = bizObject.get(fieldName);
                } else {
                    String fieldItemName = fieldName.replace("_name", "_Name");
                    if (bizObject.get(fieldItemName) != null) {
                        retValue = bizObject.get(fieldItemName);
                    }
                }
            }
        }
        return this.getMultiValue(retValue);
    }

    public Map<Long, String> getCustomerDataList(List<Long> customerApplyIdList) throws Exception {
        if (!CollectionUtils.isEmpty(customerApplyIdList)) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,customerData");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(customerApplyIdList)});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List customerApplyInDbList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)customerApplyInDbList)) {
                HashMap<Long, String> customerDataMap = new HashMap<Long, String>();
                for (CustomerApply customerApply : customerApplyInDbList) {
                    customerDataMap.put((Long)customerApply.getId(), customerApply.getCustomerData());
                }
                return customerDataMap;
            }
            return null;
        }
        return null;
    }

    public Merchant initMerchant(String customerData) throws Exception {
        Map currCustomerData = (Map)JSONObject.parseObject((String)customerData, Map.class);
        return this.merchantCheckService.checkInitMerchantFromCustomerApply(currCustomerData);
    }

    public Object getMultiValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof BizObject) {
            String defaultLocale;
            String text = null;
            BizObject bizObject = (BizObject)value;
            String currentLocale = InvocationInfoProxy.getLocale();
            if (currentLocale != null) {
                text = (String)bizObject.get(currentLocale);
            }
            if ((text == null || text.isEmpty()) && (defaultLocale = InvocationInfoProxy.getDefaultLocale()) != null) {
                text = (String)bizObject.get(defaultLocale);
            }
            if (text == null || text.isEmpty()) {
                text = (String)bizObject.get("zh_CN");
            }
            if (text == null || text.isEmpty()) {
                return value;
            }
            return text;
        }
        return value;
    }

    @Override
    public Object orgIsExistMerchantApplyRange(String orgCode, String orgName, Long customerApplyId) {
        try {
            Merchant merchant;
            List merchantApplyRangeList;
            List funcOrgeList = new ArrayList();
            if (StringUtils.hasText((String)orgCode)) {
                ArrayList<String> orgCodeList = new ArrayList<String>();
                orgCodeList.add(orgCode);
                funcOrgeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
            } else if (StringUtils.hasText((String)orgName)) {
                ArrayList<String> orgNameList = new ArrayList<String>();
                orgNameList.add(orgName);
                funcOrgeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andNameIn(orgNameList).withEnabled());
            }
            if (CollectionUtils.isEmpty(funcOrgeList) || funcOrgeList.size() != 1) {
                return false;
            }
            String orgId = ((OrgUnitDTO)funcOrgeList.get(0)).getId();
            ArrayList<Long> customerApplyIdList = new ArrayList<Long>();
            customerApplyIdList.add(customerApplyId);
            List<CustomerApply> customerApplyList = this.getCustomerApply(customerApplyIdList);
            if (CollectionUtils.isEmpty(customerApplyList)) {
                return false;
            }
            CustomerApply customerApply = customerApplyList.get(0);
            if (customerApply.getApplyType() == CustomerApplyType.add) {
                Merchant merchant2 = this.initMerchant(customerApply.getCustomerData());
                List merchantApplyRangeList2 = merchant2.merchantApplyRanges();
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList2)) {
                    return this.orgIsExistMerchantApplyRange(orgId, merchantApplyRangeList2);
                }
                Set<String> shareAll = this.orgPermissionsUtil.getShareOrgDetail4BillDate("aa.merchant.Merchant", merchant2.getCreateOrg(), (BizObject)merchant2);
                if (!CollectionUtils.isEmpty(shareAll) && shareAll.contains(orgId)) {
                    return true;
                }
            } else if (customerApply.getApplyType() == CustomerApplyType.modify && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeList = (merchant = this.initMerchant(customerApply.getCustomerData())).merchantApplyRanges()))) {
                return this.orgIsExistMerchantApplyRange(orgId, merchantApplyRangeList);
            }
        }
        catch (Exception e) {
            log.error("orgIsExistMerchantApply_error:{}", (Object)e.getMessage(), (Object)e);
        }
        return false;
    }

    @Override
    public Object orgIsExistMerchantApplyRanges(String orgCode, String orgName, List<Long> customerApplyIds) {
        try {
            List funcOrgeList = new ArrayList();
            if (StringUtils.hasText((String)orgCode)) {
                ArrayList<String> orgCodeList = new ArrayList<String>();
                orgCodeList.add(orgCode);
                funcOrgeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
            } else if (StringUtils.hasText((String)orgName)) {
                ArrayList<String> orgNameList = new ArrayList<String>();
                orgNameList.add(orgName);
                funcOrgeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andNameIn(orgNameList).withEnabled());
            }
            if (CollectionUtils.isEmpty(funcOrgeList) || funcOrgeList.size() != 1) {
                return null;
            }
            String orgId = ((OrgUnitDTO)funcOrgeList.get(0)).getId();
            List<CustomerApply> customerApplyList = this.getCustomerApply(customerApplyIds);
            if (CollectionUtils.isEmpty(customerApplyList)) {
                return null;
            }
            ArrayList<Boolean> resultList = new ArrayList<Boolean>();
            for (CustomerApply customerApply : customerApplyList) {
                List merchantApplyRangeList;
                Merchant merchant;
                if (customerApply.getApplyType() == CustomerApplyType.add) {
                    merchant = this.initMerchant(customerApply.getCustomerData());
                    merchantApplyRangeList = merchant.merchantApplyRanges();
                    if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                        resultList.add(this.orgIsExistMerchantApplyRange(orgId, merchantApplyRangeList));
                        continue;
                    }
                    Set<String> shareAll = this.orgPermissionsUtil.getShareOrgDetail4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant);
                    if (!CollectionUtils.isEmpty(shareAll) && shareAll.contains(orgId)) {
                        resultList.add(true);
                        continue;
                    }
                    resultList.add(false);
                    continue;
                }
                if (customerApply.getApplyType() != CustomerApplyType.modify) continue;
                merchant = this.initMerchant(customerApply.getCustomerData());
                merchantApplyRangeList = merchant.merchantApplyRanges();
                resultList.add(this.orgIsExistMerchantApplyRange(orgId, merchantApplyRangeList));
            }
            return resultList;
        }
        catch (Exception e) {
            log.error("orgIsExistMerchantApplyRanges_error:{}", (Object)e.getMessage(), (Object)e);
            return null;
        }
    }

    public boolean orgIsExistMerchantApplyRange(String orgId, List<MerchantApplyRange> merchantApplyRangeList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeList) && StringUtils.hasText((String)orgId)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (!orgId.equals(merchantApplyRange.getOrgId())) continue;
                return true;
            }
        }
        return false;
    }

    public List<CustomerApply> getCustomerApply(List<Long> customerApplyIdList) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,applyType,customerData");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(customerApplyIdList)});
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        List customerApplyInDbList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerApplyInDbList)) {
            return customerApplyInDbList;
        }
        return null;
    }

    @Override
    public Boolean orgIsLikeMerchantApplyRange(String orgName, Long customerApplyId) {
        try {
            if (!StringUtils.hasText((String)orgName)) {
                return false;
            }
            String[] orgNames = orgName.split(",");
            ArrayList<Long> customerApplyIdList = new ArrayList<Long>();
            customerApplyIdList.add(customerApplyId);
            List<CustomerApply> customerApplyList = this.getCustomerApply(customerApplyIdList);
            if (CollectionUtils.isEmpty(customerApplyList)) {
                return false;
            }
            CustomerApply customerApply = customerApplyList.get(0);
            Merchant merchant = (Merchant)Objectlizer.decodeObj((Json)new Json(customerApply.getCustomerData().toString()), (String)"aa.merchant.Merchant");
            List<MerchantApplyRange> merchantApplyRangeList = merchant.merchantApplyRanges().stream().filter(range -> !range.getEntityStatus().equals((Object)EntityStatus.Delete)).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
                boolean result = false;
                for (String name : orgNames) {
                    result = this.orgIsLikeMerchantApplyRange(name, merchantApplyRangeList);
                    if (!result) continue;
                    return result;
                }
            }
        }
        catch (Exception e) {
            log.error("orgIsLikeMerchantApplyRange_error:{}", (Object)e.getMessage(), (Object)e);
        }
        return false;
    }

    @Override
    public Boolean orgIsNotLikeMerchantApplyRange(String orgName, Long customerApplyId) {
        return this.orgIsLikeMerchantApplyRange(orgName, customerApplyId) == false;
    }

    public boolean orgIsLikeMerchantApplyRange(String orgName, List<MerchantApplyRange> merchantApplyRangeList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeList) && StringUtils.hasText((String)orgName)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (Objects.isNull(merchantApplyRange.get("orgName")) || !merchantApplyRange.get("orgName").toString().contains(orgName)) continue;
                return true;
            }
        }
        return false;
    }
}

