/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.org.dto.BaseOrgDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange
 *  com.yonyoucloud.upc.common.AddRangeMessage
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.addrange;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.org.dto.BaseOrgDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange;
import com.yonyoucloud.upc.common.AddRangeMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class KafkaCustCategoryAddRangeService {
    private static final Logger log = LoggerFactory.getLogger(KafkaCustCategoryAddRangeService.class);
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public void dealAddCustCategorySuitOrg(AddRangeMessage addRangeMessage) throws Exception {
        List funcOrgesByCodeList;
        Boolean isEnd;
        String createOrg;
        String name;
        Long custCategoryId = addRangeMessage.getId();
        List orgIdList = addRangeMessage.getOrgIdList();
        if (CollectionUtils.isEmpty((Collection)orgIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801028);
        }
        if (custCategoryId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801029);
        }
        QueryConditionGroup queryCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)custCategoryId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("name,orgId,isEnd").addCondition((ConditionExpression)queryCondition);
        List custCategoryInDbList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategory", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)custCategoryInDbList)) {
            name = ((CustCategory)custCategoryInDbList.get(0)).getName();
            createOrg = ((CustCategory)custCategoryInDbList.get(0)).getOrgId();
            isEnd = ((CustCategory)custCategoryInDbList.get(0)).getIsEnd();
            ArrayList<String> createOrgList = new ArrayList<String>();
            createOrgList.add(createOrg);
            funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(createOrgList).withEnabled());
            if (CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801030);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801031);
        }
        String createOrgName = ((OrgUnitDTO)funcOrgesByCodeList.get(0)).getName();
        List<String> orgIdListInDb = this.getOrgIdInDb(orgIdList);
        if (CollectionUtils.isEmpty(orgIdListInDb)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801032);
        }
        List<String> authOrgIdList = this.upcControlRuleService.getUserOrgAndVoucherManageOrg("aa.custcategory.CustCategory", "aa_custcategory");
        if (CollectionUtils.isEmpty(authOrgIdList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801033);
        }
        if (!authOrgIdList.contains(createOrg)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801025, new Object[]{name});
        }
        List<String> orgRangeShareList = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("aa.merchant.Merchant", createOrg);
        if (null == orgRangeShareList || orgRangeShareList.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801035, new Object[]{name, createOrgName});
        }
        HashMap<String, String> orgRangeShareMap = new HashMap<String, String>();
        for (String string : orgRangeShareList) {
            orgRangeShareMap.put(string, "orgId");
        }
        ArrayList<String> subtractList = new ArrayList<String>();
        for (String merchantApplyRangeOrgId : orgIdListInDb) {
            if ("orgId".equals(orgRangeShareMap.get(merchantApplyRangeOrgId))) continue;
            subtractList.add(merchantApplyRangeOrgId);
        }
        if (!subtractList.isEmpty()) {
            List list = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(subtractList).withEnabled());
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801036, new Object[]{name, createOrgName, list.stream().map(BaseOrgDTO::getCode).collect(Collectors.toList())});
        }
        Map<String, String> map = this.getRangeMapInDb(custCategoryId, orgIdList);
        ArrayList<CustCategoryApplyRange> custCategoryApplyRangeList = new ArrayList<CustCategoryApplyRange>();
        for (String orgId : orgIdList) {
            if (!CollectionUtils.isEmpty(map) && map.containsKey(custCategoryId + orgId)) continue;
            CustCategoryApplyRange custCategoryApplyRange = this.getCustCategoryApplyRange(custCategoryId, orgId, isEnd);
            custCategoryApplyRangeList.add(custCategoryApplyRange);
        }
        if (!CollectionUtils.isEmpty(custCategoryApplyRangeList)) {
            MetaDaoHelper.insert((String)"aa.custcategory.CustCategoryApplyRange", custCategoryApplyRangeList);
        }
    }

    private List<String> getOrgIdInDb(List<String> orgIdList) {
        List funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(new ArrayList<String>(orgIdList)));
        if (!CollectionUtils.isEmpty((Collection)funcOrgesByCodeList)) {
            return funcOrgesByCodeList.stream().map(BaseOrgDTO::getId).collect(Collectors.toList());
        }
        return null;
    }

    private Map<String, String> getRangeMapInDb(Long clsId, List<String> orgIdList) throws Exception {
        HashMap<String, String> rangeMapInDb = new HashMap<String, String>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,orgId,clsId");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)clsId), QueryCondition.name((String)"orgId").in(orgIdList), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        querySchema.setPartitionable(false);
        List custCategoryApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.custcategory.CustCategoryApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)custCategoryApplyRangeInDbList)) {
            for (CustCategoryApplyRange rangeInDb : custCategoryApplyRangeInDbList) {
                rangeMapInDb.put(rangeInDb.getClsId().toString() + rangeInDb.getOrgId(), rangeInDb.getId().toString());
            }
            return rangeMapInDb;
        }
        return null;
    }

    private CustCategoryApplyRange getCustCategoryApplyRange(Long clsId, String orgId, Boolean isEnd) {
        CustCategoryApplyRange range = new CustCategoryApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.setClsId(clsId);
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(false));
        range.setIsApplied(Boolean.valueOf(false));
        range.setIsEnd(isEnd);
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }
}

