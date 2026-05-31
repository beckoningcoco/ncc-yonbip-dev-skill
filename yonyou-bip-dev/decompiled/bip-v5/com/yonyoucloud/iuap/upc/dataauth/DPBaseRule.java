/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.data.service.itf.FuncOrgDataQryService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.enums.FuncTypeEnum
 *  com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.org.service.itf.core.ISalesOrgQueryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthContent
 *  com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse
 *  com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionRuleAuthReferService
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.upc.dataauth;

import com.google.common.collect.Lists;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.data.service.itf.FuncOrgDataQryService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.enums.FuncTypeEnum;
import com.yonyou.iuap.org.service.itf.core.IBizDeptQueryService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.org.service.itf.core.ISalesOrgQueryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dataauth.PersonService;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.uretail.sys.auth.CustomAuthContent;
import com.yonyoucloud.uretail.sys.auth.CustomAuthRuleResponse;
import com.yonyoucloud.uretail.sys.itf.custom.ICustomVersionRuleAuthReferService;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public abstract class DPBaseRule
implements ICustomVersionRuleAuthReferService {
    private static final Logger log = LoggerFactory.getLogger(DPBaseRule.class);
    public static final String PRINCIPAL = "PRINCIPAL";
    public static final String BRANCH_LEADER = "BRANCH_LEADER";
    @Autowired
    private PersonService personService;
    @Autowired
    private FuncOrgDataQryService funcOrgDataQryService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private IBizDeptQueryService bizDeptQueryService;
    @Autowired
    private ISalesOrgQueryService salesOrgQueryService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public CustomAuthRuleResponse getValues(CustomAuthContent content) throws Exception {
        log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff1a{} \u53c2\u6570\u4e3a {}, \u5f53\u524d\u83b7\u53d6\u5230\u7684 token \u4e3a {}", new Object[]{this.getClass().getName(), this.convertParamToString(content), InvocationInfoProxy.getYhtAccessToken()});
        long start = System.currentTimeMillis();
        CustomAuthRuleResponse customAuthRuleResponse = new CustomAuthRuleResponse();
        customAuthRuleResponse.setiSuccess(Boolean.valueOf(true));
        String personId = null;
        try {
            personId = this.personService.getCurrentPersonId(content.getYhtTenantId(), content.getYhtUserId());
            if (StringUtils.isBlank((CharSequence)personId)) {
                customAuthRuleResponse.setVersion(new Date());
            } else {
                Set<String> values = this.getCustomValues(content, personId);
                customAuthRuleResponse.setVersion(new Date());
                customAuthRuleResponse.setValues(values);
            }
        }
        catch (Exception e) {
            customAuthRuleResponse.setVersion(content.getVersion());
            log.error(e.getMessage(), (Throwable)e);
        }
        Set result = customAuthRuleResponse.getValues();
        int size = CollectionUtils.isEmpty((Collection)result) ? 0 : result.size();
        HashSet<String> logSet = new HashSet<String>();
        if (size > 0) {
            int logCount = 15;
            for (String logId : result) {
                if (logCount <= 0) break;
                logSet.add(logId);
                --logCount;
            }
        }
        log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff1a{} \u7ed3\u675f\uff0c\u8017\u65f6 {} \u6beb\u79d2\uff0cyhtUserId \u4e3a {}\uff0cyhtTenantId \u4e3a {}\uff0c\u4eba\u5458ID\u4e3a {}\uff0c\u67e5\u8be2\u7ed3\u679c\u5171 {} \u6761\uff0c\u5305\u542b {} \u7b49", new Object[]{this.getClass().getName(), System.currentTimeMillis() - start, content.getYhtUserId(), content.getYhtTenantId(), personId, size, logSet});
        return customAuthRuleResponse;
    }

    private String convertParamToString(CustomAuthContent content) {
        LinkedHashMap<String, Object> dpParamMap = new LinkedHashMap<String, Object>();
        dpParamMap.put("yxyUserId", content.getYxyUserId());
        dpParamMap.put("yxyTenantId", content.getYxyTenantId());
        dpParamMap.put("yhtUserId", content.getYhtUserId());
        dpParamMap.put("yhtTenantId", content.getYhtTenantId());
        dpParamMap.put("version", content.getVersion());
        return dpParamMap.toString();
    }

    public Set<String> getSyncValues(CustomAuthContent content) throws Exception {
        Set<String> resultValues;
        log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff08\u540c\u6b65\uff09\uff1a{} \u53c2\u6570\u4e3a {}, \u5f53\u524d\u83b7\u53d6\u5230\u7684 token \u4e3a {}", new Object[]{this.getClass().getName(), this.convertParamToString(content), InvocationInfoProxy.getYhtAccessToken()});
        long start = System.currentTimeMillis();
        String personId = this.personService.getCurrentPersonId(content.getYhtTenantId(), content.getYhtUserId());
        if (StringUtils.isNotBlank((CharSequence)personId)) {
            resultValues = this.getCustomValues(content, personId);
            if (CollectionUtils.isEmpty(resultValues)) {
                resultValues = this.noPermissionSet();
            }
        } else {
            resultValues = this.noPermissionSet();
        }
        HashSet<String> logSet = new HashSet<String>();
        int logCount = 15;
        for (String logId : resultValues) {
            if (logCount <= 0) break;
            logSet.add(logId);
            --logCount;
        }
        log.error("\u6570\u636e\u6743\u9650\u670d\u52a1\u8c03\u7528\u89c4\u5219\u7c7b\uff08\u540c\u6b65\uff09\uff1a{} \u7ed3\u675f\uff0c\u8017\u65f6 {} \u6beb\u79d2\uff0cyhtUserId \u4e3a {}\uff0cyhtTenantId \u4e3a {}\uff0c\u4eba\u5458ID\u4e3a {}\uff0c\u67e5\u8be2\u7ed3\u679c\u5171 {} \u6761\uff0c\u5305\u542b {} \u7b49", new Object[]{this.getClass().getName(), System.currentTimeMillis() - start, content.getYhtUserId(), content.getYhtTenantId(), personId, resultValues.size(), logSet});
        return resultValues;
    }

    protected abstract Set<String> getCustomValues(CustomAuthContent var1, String var2) throws Exception;

    protected List<Map<String, Object>> getPersonMainJob(CustomAuthContent content, String personId) throws Exception {
        return this.getPersonJob(content, personId, "bd.staff.StaffMainJob", "staff");
    }

    protected List<Map<String, Object>> getPersonPtJob(CustomAuthContent content, String personId) throws Exception {
        return this.getPersonJob(content, personId, "bd.staff.StaffPtJob", "staff");
    }

    private List<Map<String, Object>> getPersonJob(CustomAuthContent content, String personId, String fullName, String type) throws Exception {
        QueryCondition condition = "staff".equals(type) ? QueryCondition.name((String)"staff_id").eq((Object)personId) : QueryCondition.name((String)"director").eq((Object)personId);
        Date begin = Date.from(LocalDateTime.now().withHour(23).withMinute(59).withSecond(59).atZone(ZoneId.systemDefault()).toInstant());
        Date end = Date.from(LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).atZone(ZoneId.systemDefault()).toInstant());
        QueryConditionGroup dateGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"enddate").is_null(), QueryCondition.name((String)"enddate").egt((Object)end)});
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{condition, QueryCondition.name((String)"begindate").elt((Object)begin), dateGroup, QueryCondition.name((String)"dr").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("staff_id, org_id, dept_id, director").addCondition((ConditionExpression)conditionGroup);
        return MetaDaoHelper.query((String)fullName, (QuerySchema)schema, (String)"ucf-staff-center");
    }

    protected Set<String> getSaleFuncOrgs(CustomAuthContent content, Set<String> orgs) throws Exception {
        ArrayList<Integer> statusList = new ArrayList<Integer>();
        statusList.add(1);
        statusList.add(2);
        List salesOrgDTOS = this.salesOrgQueryService.listByIds((String)AppContext.getYhtTenantId(), new ArrayList<String>(orgs), statusList);
        if (!CollectionUtils.isEmpty((Collection)salesOrgDTOS)) {
            return salesOrgDTOS.stream().map(dto -> dto.getId()).collect(Collectors.toSet());
        }
        return new HashSet<String>(0);
    }

    protected List<String> getOrgAndSubOrgs(CustomAuthContent content, Set<String> orgIds) throws Exception {
        ArrayList<Integer> statusList = new ArrayList<Integer>();
        statusList.add(1);
        statusList.add(2);
        List funcOrgs = this.funcOrgDataQryService.listAllSubOrgByIds(new ArrayList<String>(orgIds), statusList, (String)AppContext.getYhtTenantId(), "diwork", true, FuncTypeEnum.SALES_ORG.getCode());
        if (!CollectionUtils.isEmpty((Collection)funcOrgs)) {
            return funcOrgs.stream().map(org -> org.getId()).collect(Collectors.toList());
        }
        return new ArrayList<String>();
    }

    protected Set<String> getDepartmentAndSubDepartments(CustomAuthContent content, Set<String> departmentIds) throws Exception {
        HashSet<String> allDeptIds = new HashSet<String>(departmentIds);
        ArrayList<String> deptIdList = new ArrayList<String>(departmentIds);
        List partition = Lists.partition(deptIdList, (int)1000);
        ConditionDTO conditionDTO = ConditionDTO.newDeptCondition().withEnabled().withDisabled();
        String yhtTenantId = (String)AppContext.getYhtTenantId();
        for (List list : partition) {
            List bizDeptDTOS = this.bizDeptQueryService.batchGetChildrenDeptsByCondition(yhtTenantId, list, conditionDTO);
            if (CollectionUtils.isEmpty((Collection)bizDeptDTOS)) continue;
            List deptIds = bizDeptDTOS.stream().map(dto -> dto.getId()).collect(Collectors.toList());
            allDeptIds.addAll(deptIds);
        }
        return allDeptIds;
    }

    protected List<Map<String, Object>> getPersonMainJobSubPersons(CustomAuthContent content, String personId) throws Exception {
        return this.getPersonJob(content, personId, "bd.staff.StaffMainJob", "director");
    }

    protected List<Map<String, Object>> getPersonPtJobSubPersons(CustomAuthContent content, String personId) throws Exception {
        return this.getPersonJob(content, personId, "bd.staff.StaffPtJob", "director");
    }

    protected Set<String> getPersonSubAndSubs(CustomAuthContent content, String personId, String type) throws Exception {
        HashSet<String> personIds = new HashSet<String>();
        personIds.add(personId);
        HashSet<String> allPersonIds = new HashSet<String>();
        allPersonIds.add(personId);
        this.getPersonSubAndSubs(content, personIds, type, allPersonIds);
        return allPersonIds;
    }

    private void getPersonSubAndSubs(CustomAuthContent content, Set<String> personIds, String type, Set<String> allPersonIds) throws Exception {
        Date begin = Date.from(LocalDateTime.now().withHour(23).withMinute(59).withSecond(59).atZone(ZoneId.systemDefault()).toInstant());
        Date end = Date.from(LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).atZone(ZoneId.systemDefault()).toInstant());
        QueryConditionGroup dateGroup = QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"enddate").is_null(), QueryCondition.name((String)"enddate").egt((Object)end)});
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"director").in(personIds), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"begindate").elt((Object)begin), dateGroup});
        QuerySchema schema = QuerySchema.create().addSelect("staff_id").addCondition((ConditionExpression)conditionGroup);
        String fullName = "MAIN_JOB".equals(type) ? "bd.staff.StaffMainJob" : "bd.staff.StaffPtJob";
        List mapList = MetaDaoHelper.query((String)fullName, (QuerySchema)schema, (String)"ucf-staff-center");
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            Set idSet = mapList.stream().map(map -> (String)map.get("staff_id")).collect(Collectors.toSet());
            HashSet<String> tmpSet = new HashSet<String>();
            for (String personId : idSet) {
                if (allPersonIds.contains(personId)) continue;
                tmpSet.add(personId);
            }
            allPersonIds.addAll(idSet);
            if (!tmpSet.isEmpty()) {
                this.getPersonSubAndSubs(content, tmpSet, type, allPersonIds);
            }
        }
    }

    protected Set<String> getBaseOrgsOrDepts(CustomAuthContent content, String personId, int orgType, String type) {
        ConditionDTO conditionDTO = orgType == 1 ? ConditionDTO.newOrgCondition() : ConditionDTO.newDeptCondition();
        ArrayList<String> personList = new ArrayList<String>();
        personList.add(personId);
        if (PRINCIPAL.equals(type)) {
            conditionDTO.andPrincipalsIn(personList);
        } else {
            conditionDTO.andBranchleadersIn(personList);
        }
        conditionDTO.withEnabled().withDisabled();
        List orgUnitDTOS = this.orgUnitQueryService.getByCondition((String)AppContext.getYhtTenantId(), conditionDTO);
        if (!CollectionUtils.isEmpty((Collection)orgUnitDTOS)) {
            return orgUnitDTOS.stream().map(dto -> dto.getId()).collect(Collectors.toSet());
        }
        return new HashSet<String>(0);
    }

    public Set<String> getCustomersBySaleOrgOrDepartment(CustomAuthContent content, Set<String> orgOrDeptIds, String type) throws Exception {
        if ("ORG".equals(type)) {
            QueryCondition condition = QueryCondition.name((String)"merchantApplyRangeExtId.orgId").in(orgOrDeptIds);
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{condition}));
            List mapList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)schema, (String)"productcenter");
            if (!CollectionUtils.isEmpty((Collection)mapList)) {
                return mapList.stream().map(map -> String.valueOf(map.get("id"))).collect(Collectors.toSet());
            }
        } else {
            return this.getCustomersByDepartment(content, orgOrDeptIds, null);
        }
        return new HashSet<String>(0);
    }

    public Set<String> getCustomersByDepartment(CustomAuthContent content, Set<String> deptIds, Set<String> orgSet) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Principal> principalList = this.getCustomersByDepartmentByMinId(deptIds, orgSet, currentRangeId, realMaxRowsValue);
        ArrayList<Principal> principals = new ArrayList<Principal>(principalList);
        while (principalList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)principalList.get(principalList.size() - 1).getId();
            principalList = this.getCustomersByDepartmentByMinId(deptIds, orgSet, currentRangeId, realMaxRowsValue);
            principals.addAll(principalList);
        }
        if (!CollectionUtils.isEmpty(principals)) {
            return principals.stream().map(principal -> String.valueOf(principal.getMerchantId())).collect(Collectors.toSet());
        }
        return new HashSet<String>(0);
    }

    public List<Principal> getCustomersByDepartmentByMinId(Set<String> deptIds, Set<String> orgSet, Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specialManagementDep").in(deptIds), QueryCondition.name((String)"id").gt((Object)minId)});
        if (orgSet != null) {
            if (orgSet.isEmpty()) {
                return new ArrayList<Principal>(0);
            }
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeGroupId.orgGroupId.orgGroupDetailList.orgId").in(orgSet));
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId").addCondition((ConditionExpression)conditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        List principalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            return principalList;
        }
        return new ArrayList<Principal>(0);
    }

    protected Set<Long> getCustomerAndSub(CustomAuthContent content, Set<Long> customerIds) throws Exception {
        HashSet<Long> allCustomerIds = new HashSet<Long>(customerIds);
        this.getCustomerAndSub(content, customerIds, allCustomerIds);
        return allCustomerIds;
    }

    private void getCustomerAndSub(CustomAuthContent content, Set<Long> customerIds, Set<Long> allCustomerIds) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parentCustomer").in(customerIds)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        List mapList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema, (String)"productcenter");
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            Set idSet = mapList.stream().map(map -> (Long)map.get("id")).collect(Collectors.toSet());
            HashSet<Long> tmpSet = new HashSet<Long>();
            for (Long customerId : idSet) {
                if (allCustomerIds.contains(customerId)) continue;
                tmpSet.add(customerId);
            }
            allCustomerIds.addAll(idSet);
            if (!tmpSet.isEmpty()) {
                this.getCustomerAndSub(content, tmpSet, allCustomerIds);
            }
        }
    }

    protected Set<Long> getSaleAreaAndSub(CustomAuthContent content, Set<Long> saleAreaIds) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(saleAreaIds)});
        QuerySchema querySchema = QuerySchema.create().addSelect("path").addCondition((ConditionExpression)condition);
        List pathMapList = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)querySchema, (String)"productcenter");
        ArrayList<QueryCondition> pathList = new ArrayList<QueryCondition>(saleAreaIds.size());
        for (Map map2 : pathMapList) {
            pathList.add(QueryCondition.name((String)"path").left_like(map2.get("path")));
        }
        QueryConditionGroup pathCondition = QueryConditionGroup.or((ConditionExpression[])((ConditionExpression[])pathList.toArray(new QueryCondition[0])));
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{pathCondition, QueryCondition.name((String)"stopstatus").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        List mapList = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema, (String)"productcenter");
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            return mapList.stream().map(map -> (Long)map.get("id")).collect(Collectors.toSet());
        }
        return new HashSet<Long>(saleAreaIds);
    }

    private void getSaleAreaAndSub(CustomAuthContent content, Set<Long> saleAreaIds, Set<Long> allSaleAreaIdsIds) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").in(saleAreaIds), QueryCondition.name((String)"stopstatus").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)conditionGroup);
        List mapList = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema, (String)"productcenter");
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            Set idSet = mapList.stream().map(map -> (Long)map.get("id")).collect(Collectors.toSet());
            HashSet<Long> tmpSet = new HashSet<Long>();
            for (Long saleAreaId : idSet) {
                if (allSaleAreaIdsIds.contains(saleAreaId)) continue;
                tmpSet.add(saleAreaId);
            }
            allSaleAreaIdsIds.addAll(idSet);
            if (!tmpSet.isEmpty()) {
                this.getSaleAreaAndSub(content, tmpSet, allSaleAreaIdsIds);
            }
        }
    }

    protected Set<String> getCustomerBySaleArea(CustomAuthContent content, Set<String> saleAreaIds) throws Exception {
        HashSet saleAreaSet = new HashSet(saleAreaIds.size());
        saleAreaIds.forEach(item -> saleAreaSet.add(Long.parseLong(item)));
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").in(saleAreaSet)});
        QuerySchema schema = QuerySchema.create().addSelect("merchantId").addCondition((ConditionExpression)conditionGroup);
        List mapList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)schema, (String)"productcenter");
        HashSet<String> customerValues = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            for (Map map : mapList) {
                if (map.get("merchantId") == null) continue;
                customerValues.add(String.valueOf(map.get("merchantId")));
            }
        }
        return customerValues;
    }

    protected Set<String> noPermissionSet() {
        HashSet<String> noPermissionSet = new HashSet<String>(1);
        noPermissionSet.add("-999999999999999999");
        return noPermissionSet;
    }

    protected Set<String> getCompeteopponentBySaleOrgOrDepartment(CustomAuthContent content, Set<String> deptIds, String type) throws Exception {
        QueryCondition condition = QueryCondition.name((String)"deptId").in(deptIds);
        QuerySchema schema = QuerySchema.create().addSelect("cpmOpponentId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{condition}));
        List mapList = MetaDaoHelper.query((String)"sfa.competeopponent.CompeteOpponentDept", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            return mapList.stream().map(map -> String.valueOf(map.get("cpmOpponentId"))).collect(Collectors.toSet());
        }
        return new HashSet<String>(0);
    }

    protected Set<String> getCompeteopponentBySaleArea(CustomAuthContent content, Set<String> saleAreaIds) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"areaId").in(saleAreaIds)});
        QuerySchema schema = QuerySchema.create().addSelect("cpmOpponentId").addCondition((ConditionExpression)conditionGroup);
        List mapList = MetaDaoHelper.query((String)"sfa.competeopponent.CompeteOpponentArea", (QuerySchema)schema);
        HashSet<String> returnValues = new HashSet<String>();
        if (!CollectionUtils.isEmpty((Collection)mapList)) {
            for (Map map : mapList) {
                if (map.get("cpmOpponentId") == null) continue;
                returnValues.add(String.valueOf(map.get("cpmOpponentId")));
            }
        }
        return returnValues;
    }
}

