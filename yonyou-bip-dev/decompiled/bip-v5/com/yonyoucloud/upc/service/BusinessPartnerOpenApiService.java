/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.businesspartner.BusinessPartnerVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.LicenseType
 *  com.yonyoucloud.upc.base.businesspartner.PartnerType
 *  com.yonyoucloud.upc.base.businesspartner.Status
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.vo.businesspartner.BusinessPartnerVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.LicenseType;
import com.yonyoucloud.upc.base.businesspartner.PartnerType;
import com.yonyoucloud.upc.base.businesspartner.Status;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class BusinessPartnerOpenApiService {
    private static final Logger log = LoggerFactory.getLogger(BusinessPartnerOpenApiService.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    static String deleteBusinessPartnerField = "id, code, name, partnerType, status, pubts";
    static final String PARTNER_All_FIELD = "id, code, name, shortname, searchcode, comment, status, partnerType, parent, parent.code as parent___code, parent.name as parent___name, country,country.code as country___code, timeZone, timeZone.timename as timeZone___name, newTimeZone,language,language.code as language___code, erpCode, licenseType, creditCode, mobile, legalPerson, legalPersonIdNo, money, currency,currency.code as currency___code, buildDate, businessterm, regionId, regAddress, contactName, contactTel, fax, email, postalCode, website, scope, internalOrgId, internalOrgId.code as internalOrgId___code, businessPartnerCharacterDef";

    public String businessPartnerSave(String matchRule, BusinessPartnerVO businessPartnerVO) throws Exception {
        String id = "";
        BusinessPartner partner = this.convertBusinessPartner(businessPartnerVO);
        this.dataPreprocessing(matchRule, partner);
        partner.put("_fromApi", (Object)true);
        partner.put("specialKeyFromApi", (Object)true);
        DataTransferUtils.fill((String)"base_businesspartner", (String)"base.businesspartner.BusinessPartner", (Object)partner, (int)4);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"base_businesspartner", (Object)partner, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (String)((BusinessPartner)result).getId();
        }
        return id;
    }

    public void dataPreprocessing(String matchRule, BusinessPartner businessPartner) throws Exception {
        QueryConditionGroup condition = new QueryConditionGroup();
        condition = "id".equals(matchRule) ? QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(businessPartner.getId())}) : QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)businessPartner.getCode())});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
        List businessPartnerList = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (boolean)true, (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)businessPartnerList)) {
            businessPartner.setId(((BusinessPartner)businessPartnerList.get(0)).getId());
            businessPartner.setEntityStatus(EntityStatus.Update);
        } else {
            businessPartner.setEntityStatus(EntityStatus.Insert);
        }
    }

    public void matchRuleBusinessPartner(String matchRule, BusinessPartnerVO businessPartnerVO) {
        if ("id".equals(matchRule)) {
            businessPartnerVO.setCountry___code(null);
            businessPartnerVO.setCountry___name(null);
            businessPartnerVO.setCurrency___code(null);
            businessPartnerVO.setCurrency___name(null);
            businessPartnerVO.setInternalOrgId___code(null);
            businessPartnerVO.setInternalOrgId___name(null);
            businessPartnerVO.setLanguage___code(null);
            businessPartnerVO.setLanguage___name(null);
            businessPartnerVO.setParent___code(null);
            businessPartnerVO.setParent___name(null);
            businessPartnerVO.setTimeZone___code(null);
            businessPartnerVO.setTimeZone___name(null);
        } else {
            businessPartnerVO.setCountry(null);
            businessPartnerVO.setCurrency(null);
            businessPartnerVO.setInternalOrgId(null);
            businessPartnerVO.setLanguage(null);
            businessPartnerVO.setParent(null);
            businessPartnerVO.setTimeZone(null);
        }
    }

    public BusinessPartner convertBusinessPartner(BusinessPartnerVO businessPartnerVO) {
        BusinessPartner businessPartner = new BusinessPartner();
        boolean blank = false;
        if (businessPartnerVO.getBlank() != null) {
            blank = businessPartnerVO.getBlank();
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getId())) {
            businessPartner.setId((Object)businessPartnerVO.getId());
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCode())) {
            businessPartner.setCode(businessPartnerVO.getCode());
        }
        if (ObjectUtils.isEmpty((Object)businessPartnerVO.getName())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800049);
        }
        businessPartner.set("name", (Object)businessPartnerVO.getName().toMap());
        if (businessPartnerVO.getBuildDate() != null) {
            businessPartner.setBuildDate(businessPartnerVO.getBuildDate());
        } else if (blank) {
            businessPartner.setBuildDate(null);
        }
        if (businessPartnerVO.getBusinessPartnerCharacterDef() != null) {
            businessPartner.put("businessPartnerCharacterDef", (Object)businessPartnerVO.getBusinessPartnerCharacterDef());
        } else if (blank) {
            businessPartner.put("businessPartnerCharacterDef", null);
        }
        if (businessPartnerVO.getBusinessterm() != null) {
            businessPartner.setBusinessterm(businessPartnerVO.getBusinessterm());
        } else if (blank) {
            businessPartner.setBusinessterm(null);
        }
        if (!ObjectUtils.isEmpty((Object)businessPartnerVO.getComment())) {
            businessPartner.set("comment", (Object)businessPartnerVO.getComment().toMap());
        } else if (blank) {
            businessPartner.set("comment", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getContactName())) {
            businessPartner.setContactName(businessPartnerVO.getContactName());
        } else if (blank) {
            businessPartner.setContactName(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getContactTel())) {
            businessPartner.setContactTel(businessPartnerVO.getContactTel());
        } else if (blank) {
            businessPartner.setContactTel(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCountry())) {
            businessPartner.setCountry(businessPartnerVO.getCountry());
        } else if (blank) {
            businessPartner.setCountry(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCountry___code())) {
            businessPartner.put("country___code", (Object)businessPartnerVO.getCountry___code());
        } else if (blank) {
            businessPartner.put("country___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCountry___name())) {
            businessPartner.put("country___name", (Object)businessPartnerVO.getCountry___name());
        } else if (blank) {
            businessPartner.put("country___name", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCreditCode())) {
            businessPartner.setCreditCode(businessPartnerVO.getCreditCode());
        } else if (blank) {
            businessPartner.setCreditCode(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCurrency())) {
            businessPartner.setCurrency(businessPartnerVO.getCurrency());
        } else if (blank) {
            businessPartner.setCurrency(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCurrency___code())) {
            businessPartner.put("currency___code", (Object)businessPartnerVO.getCurrency___code());
        } else if (blank) {
            businessPartner.put("currency___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getCurrency___name())) {
            businessPartner.put("currency___name", (Object)businessPartnerVO.getCurrency___name());
        } else if (blank) {
            businessPartner.put("currency___name", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getEmail())) {
            businessPartner.setEmail(businessPartnerVO.getEmail());
        } else if (blank) {
            businessPartner.setEmail(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getFax())) {
            businessPartner.setFax(businessPartnerVO.getFax());
        } else if (blank) {
            businessPartner.setFax(null);
        }
        if (businessPartnerVO.getFinancialSynergyFlag() != null) {
            businessPartner.setFinancialSynergyFlag(businessPartnerVO.getFinancialSynergyFlag());
        } else if (blank) {
            businessPartner.setFinancialSynergyFlag(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getInternalOrgId())) {
            businessPartner.setInternalOrgId(businessPartnerVO.getInternalOrgId());
        } else if (blank) {
            businessPartner.setInternalOrgId(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getInternalOrgId___code())) {
            businessPartner.put("internalOrgId___code", (Object)businessPartnerVO.getInternalOrgId___code());
        } else if (blank) {
            businessPartner.put("internalOrgId___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getInternalOrgId___name())) {
            businessPartner.put("internalOrgId___name", (Object)businessPartnerVO.getInternalOrgId___name());
        } else if (blank) {
            businessPartner.put("internalOrgId___name", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getLanguage())) {
            businessPartner.setLanguage(businessPartnerVO.getLanguage());
        } else if (blank) {
            businessPartner.setLanguage(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getLanguage___code())) {
            businessPartner.put("language___code", (Object)businessPartnerVO.getLanguage___code());
        } else if (blank) {
            businessPartner.put("language___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getLanguage___name())) {
            businessPartner.put("language___name", (Object)businessPartnerVO.getLanguage___name());
        } else if (blank) {
            businessPartner.put("language___name", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getLegalPerson())) {
            businessPartner.setLegalPerson(businessPartnerVO.getLegalPerson());
        } else if (blank) {
            businessPartner.setLegalPerson(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getLegalPersonIdNo())) {
            businessPartner.setLegalPersonIdNo(businessPartnerVO.getLegalPersonIdNo());
        } else if (blank) {
            businessPartner.setLegalPersonIdNo(null);
        }
        if (businessPartnerVO.getLicenseType() != null) {
            businessPartner.setLicenseType(LicenseType.find((Number)businessPartnerVO.getLicenseType()));
        } else if (blank) {
            businessPartner.setLicenseType(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getMobile())) {
            businessPartner.setMobile(businessPartnerVO.getMobile());
        } else if (blank) {
            businessPartner.setMobile(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getMoney())) {
            businessPartner.setMoney(businessPartnerVO.getMoney());
        } else if (blank) {
            businessPartner.setMoney(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getNewTimeZone())) {
            businessPartner.setNewTimeZone(businessPartnerVO.getNewTimeZone());
        } else if (blank) {
            businessPartner.setNewTimeZone(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getParent())) {
            businessPartner.setParent(businessPartnerVO.getParent());
        } else if (blank) {
            businessPartner.setParent(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getParent___code())) {
            businessPartner.put("parent___code", (Object)businessPartnerVO.getParent___code());
        } else if (blank) {
            businessPartner.put("parent___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getParent___name())) {
            businessPartner.put("parent___name", (Object)businessPartnerVO.getParent___name());
        } else if (blank) {
            businessPartner.put("parent___name", null);
        }
        if (businessPartnerVO.getPartnerType() != null) {
            businessPartner.setPartnerType(PartnerType.find((Number)businessPartnerVO.getPartnerType()));
        } else if (blank) {
            businessPartner.setPartnerType(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getPostalCode())) {
            businessPartner.setPostalCode(businessPartnerVO.getPostalCode());
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getRegAddress())) {
            businessPartner.setRegAddress(businessPartnerVO.getRegAddress());
        } else if (blank) {
            businessPartner.setRegAddress(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getRegionId())) {
            businessPartner.setRegionId(businessPartnerVO.getRegionId());
        } else if (blank) {
            businessPartner.setRegionId(null);
        }
        if (!ObjectUtils.isEmpty((Object)businessPartnerVO.getScope())) {
            businessPartner.set("scope", (Object)businessPartnerVO.getScope().toMap());
        } else if (blank) {
            businessPartner.set("scope", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getSearchcode())) {
            businessPartner.setSearchcode(businessPartnerVO.getSearchcode());
        } else if (blank) {
            businessPartner.setSearchcode(null);
        }
        if (!ObjectUtils.isEmpty((Object)businessPartnerVO.getShortname())) {
            businessPartner.set("shortname", (Object)businessPartnerVO.getShortname().toMap());
        } else if (blank) {
            businessPartner.set("shortname", null);
        }
        if (businessPartnerVO.getStatus() != null) {
            businessPartner.setStatus(Status.find((Number)businessPartnerVO.getStatus()));
        } else if (blank) {
            businessPartner.setStatus(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getTimeZone())) {
            businessPartner.setTimeZone(businessPartnerVO.getTimeZone());
        } else if (blank) {
            businessPartner.setTimeZone(null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getTimeZone___code())) {
            businessPartner.put("timeZone___code", (Object)businessPartnerVO.getTimeZone___code());
        } else if (blank) {
            businessPartner.put("timeZone___code", null);
        }
        if (StringUtils.hasLength((String)businessPartnerVO.getWebsite())) {
            businessPartner.setWebsite(businessPartnerVO.getWebsite());
        } else if (blank) {
            businessPartner.setWebsite(null);
        }
        return businessPartner;
    }

    public String deleteBusinessPartnerData(String partnerId, String partnerCode) throws Exception {
        if (org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)partnerId) && org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)partnerCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)partnerId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)partnerId));
        } else if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)partnerCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partnerCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect(deleteBusinessPartnerField).addCondition((ConditionExpression)queryConditionGroup);
        List partnerInDbList = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)partnerInDbList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)partnerInDbList);
        bill.setBillnum("base_businesspartnerlist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }

    public CoreDocJsonResult<BusinessPartnerVO> queryBusinessPartner(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = this.getRecordsCount(batchApiQueryParamWithOrg, "base.businesspartner.BusinessPartner");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect(PARTNER_All_FIELD).addCondition((ConditionExpression)BusinessPartnerOpenApiService.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List businessPartnerList = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (boolean)true, (QuerySchema)schema, null);
            ArrayList<BusinessPartnerVO> businessPartnerVOListList = new ArrayList<BusinessPartnerVO>();
            for (BusinessPartner businessPartner : businessPartnerList) {
                BusinessPartnerVO businessPartnerVO = (BusinessPartnerVO)JSON.parseObject((String)JSON.toJSONString((Object)businessPartner), BusinessPartnerVO.class);
                if (businessPartner.get("businessPartnerCharacterDef") != null) {
                    BizObject businessPartnerCharacterDef = (BizObject)businessPartner.get("businessPartnerCharacterDef");
                    HashMap businessPartnerCharacterDefHashMap = new HashMap();
                    businessPartnerCharacterDefHashMap.putAll(businessPartnerCharacterDef);
                    businessPartnerVO.setBusinessPartnerCharacterDef(businessPartnerCharacterDefHashMap);
                }
                if (businessPartner.get("name") != null) {
                    businessPartnerVO.setName(new MultiLangText((Map)businessPartner.get("name")));
                }
                if (businessPartner.get("comment") != null) {
                    businessPartnerVO.setComment(new MultiLangText((Map)businessPartner.get("comment")));
                }
                if (businessPartner.get("scope") != null) {
                    businessPartnerVO.setComment(new MultiLangText((Map)businessPartner.get("scope")));
                }
                if (businessPartner.get("shortname") != null) {
                    businessPartnerVO.setComment(new MultiLangText((Map)businessPartner.get("shortname")));
                }
                businessPartnerVOListList.add(businessPartnerVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(businessPartnerVOListList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    @NotNull
    private static QueryConditionGroup getQueryConditionGroup(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)batchApiQueryParamWithOrg.getCode()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        return queryConditionGroup;
    }

    private int getRecordsCount(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg, String fullName) throws Exception {
        QueryConditionGroup queryConditionGroup = BusinessPartnerOpenApiService.getQueryConditionGroup(batchApiQueryParamWithOrg);
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        int recordCount = 0;
        Map result = MetaDaoHelper.queryOne((String)fullName, (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        return recordCount;
    }
}

