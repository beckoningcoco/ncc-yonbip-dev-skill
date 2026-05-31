/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocPubService
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.transtype.model.BillTypeQueryParam
 *  com.yonyou.ucf.transtype.model.TransTypeQueryParam
 *  com.yonyou.ucf.transtype.service.itf.IBillTypeService
 *  com.yonyou.ucf.transtype.service.itf.ITransTypeService
 *  com.yonyoucloud.upc.pc.manage.LifeCycleDetail
 *  com.yonyoucloud.upc.pc.manage.LifeCycleTemplate
 *  com.yonyoucloud.upc.pc.manage.MaterialStatus
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetail
 *  com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction
 *  com.yonyoucloud.upc.pc.manage.ServiceControlType
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
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.service.pub.CoredocPubService;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.transtype.model.BillTypeQueryParam;
import com.yonyou.ucf.transtype.model.TransTypeQueryParam;
import com.yonyou.ucf.transtype.service.itf.IBillTypeService;
import com.yonyou.ucf.transtype.service.itf.ITransTypeService;
import com.yonyoucloud.upc.pc.manage.LifeCycleDetail;
import com.yonyoucloud.upc.pc.manage.LifeCycleTemplate;
import com.yonyoucloud.upc.pc.manage.MaterialStatus;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetail;
import com.yonyoucloud.upc.pc.manage.MaterialStatusDetailAction;
import com.yonyoucloud.upc.pc.manage.ServiceControlType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
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
public class MaterialLifeCycleDataUpgradeService {
    private static final Logger log = LoggerFactory.getLogger(MaterialLifeCycleDataUpgradeService.class);
    private static final String GLOBAL = "0";
    private Logger logger = LoggerFactory.getLogger(MaterialLifeCycleDataUpgradeService.class);
    @Autowired
    private ITransTypeService transTypeService;
    @Autowired
    private IBillTypeService billTypeService;
    @Autowired
    private CoredocPubService coredocPubService;

    public void dataUpgradeByTenantId(Long tenantId) {
        if (null == tenantId) {
            return;
        }
        try {
            Map detailTransTypeMap = this.getGlobalTransTypeId();
            if (!CollectionUtils.isEmpty((Map)detailTransTypeMap)) {
                ArrayList materialStatusDetails = new ArrayList();
                detailTransTypeMap.forEach((materialStatusDetailId, transTypeId) -> {
                    MaterialStatusDetail materialStatusDetail = new MaterialStatusDetail();
                    materialStatusDetail.setId(materialStatusDetailId);
                    materialStatusDetail.setTransType(transTypeId);
                    materialStatusDetail.setEntityStatus(EntityStatus.Update);
                    materialStatusDetails.add(materialStatusDetail);
                });
                MetaDaoHelper.updateNoPartition((String)"pc.manage.MaterialStatusDetail", materialStatusDetails);
            }
        }
        catch (Exception e) {
            this.logger.error("\u83b7\u53d6\u4ea4\u6613\u7c7b\u578b\u914d\u7f6e\u4fe1\u606f\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            return;
        }
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            String sql;
            List tenantList = this.coredocPubService.listAllTenantsBySQL(ymsJdbcApi, sql = "select id,tenantcenter_id,ytenant_id from tenant where id = " + tenantId);
            if (CollectionUtils.isEmpty((Collection)tenantList)) continue;
            try {
                this.logger.info("\u5f00\u59cb\u79df\u6237\u7269\u6599\u72b6\u6001\u5347\u7ea7\uff1a" + LocalDateTime.now());
                this.materialLifeCycleDataUpgradeByTenantList(tenantList);
                this.logger.info("\u79df\u6237\u7269\u6599\u72b6\u6001\u5347\u7ea7\u5b8c\u6210\uff1a" + LocalDateTime.now());
            }
            catch (Exception ignored) {
                this.logger.error("\u79df\u6237\u7269\u6599\u72b6\u6001\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
            }
        }
    }

    public void dataUpgradeByTenantIds(Long beginTenantId, Long endTenantId) {
        if (null == beginTenantId || null == endTenantId) {
            return;
        }
        try {
            Map detailTransTypeMap = this.getGlobalTransTypeId();
            if (!CollectionUtils.isEmpty((Map)detailTransTypeMap)) {
                ArrayList materialStatusDetails = new ArrayList();
                detailTransTypeMap.forEach((materialStatusDetailId, transTypeId) -> {
                    MaterialStatusDetail materialStatusDetail = new MaterialStatusDetail();
                    materialStatusDetail.setId(materialStatusDetailId);
                    materialStatusDetail.setTransType(transTypeId);
                    materialStatusDetail.setEntityStatus(EntityStatus.Update);
                    materialStatusDetails.add(materialStatusDetail);
                });
                MetaDaoHelper.updateNoPartition((String)"pc.manage.MaterialStatusDetail", materialStatusDetails);
            }
        }
        catch (Exception e) {
            this.logger.error("\u83b7\u53d6\u4ea4\u6613\u7c7b\u578b\u914d\u7f6e\u4fe1\u606f\u5f02\u5e38", (Object)e.getMessage(), (Object)e);
            return;
        }
        String sql = "select id,tenantcenter_id,ytenant_id from tenant where id >=" + beginTenantId + " and id <" + endTenantId;
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sql", sql);
        List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
        if (CollectionUtils.isEmpty((Collection)tenantMapList)) {
            return;
        }
        ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
        for (Map tenantMap : tenantMapList) {
            Tenant tenant = new Tenant();
            tenant.setId(tenantMap.get("id"));
            tenant.setTenantCenter(tenantMap.get("tenantcenter_id") == null ? "" : tenantMap.get("tenantcenter_id").toString());
            tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
            tenantList.add(tenant);
        }
        try {
            this.logger.info("\u5f00\u59cb\u79df\u6237\u7269\u6599\u72b6\u6001\u5347\u7ea7\uff1a" + LocalDateTime.now());
            this.materialLifeCycleDataUpgradeByTenantList(tenantList);
            this.logger.info("\u79df\u6237\u7269\u6599\u72b6\u6001\u5347\u7ea7\u5b8c\u6210\uff1a" + LocalDateTime.now());
        }
        catch (Exception ignored) {
            this.logger.error("\u79df\u6237\u7269\u6599\u72b6\u6001\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + LocalDateTime.now() + ignored.getMessage(), (Throwable)ignored);
        }
    }

    public Map getGlobalTransTypeId() throws Exception {
        HashMap<String, String> returnMap = new HashMap<String, String>();
        BillTypeQueryParam billTypeQueryParam = new BillTypeQueryParam();
        TransTypeQueryParam transTypeQueryParam = new TransTypeQueryParam();
        List originalDataList = SqlHelper.selectList((String)"com.yonyoucloud.upc.dao.MaterialStatusDetail.getTenant0TransTypeId");
        if (CollectionUtils.isEmpty((Collection)originalDataList)) {
            return returnMap;
        }
        List formids = originalDataList.stream().map(p -> p.get("formid").toString()).collect(Collectors.toList());
        billTypeQueryParam.setFormIds(formids);
        billTypeQueryParam.setTenantId(GLOBAL);
        List bdBillTypes = this.billTypeService.queryBillTypes(billTypeQueryParam);
        if (CollectionUtils.isEmpty((Collection)bdBillTypes)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800750);
        }
        Map<String, String> billTypeIdMap = bdBillTypes.stream().collect(Collectors.toMap(x -> x.getId(), y -> y.getFormId()));
        transTypeQueryParam.setFormIds(formids);
        transTypeQueryParam.setTenantId(GLOBAL);
        List transTypeList = this.transTypeService.queryTransTypes(transTypeQueryParam);
        if (CollectionUtils.isEmpty((Collection)transTypeList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800751);
        }
        Map<String, String> transTypeMap = transTypeList.stream().collect(Collectors.toMap(x -> x.getCode() + "|" + x.getBillTypeId(), y -> y.getId()));
        for (Map map : originalDataList) {
            String transtypeCode = map.get("transtypecode").toString();
            String formid = map.get("formid").toString();
            for (String key : billTypeIdMap.keySet()) {
                if (null == billTypeIdMap.get(key) || !formid.equals(billTypeIdMap.get(key)) || null == transTypeMap.get(transtypeCode + "|" + key)) continue;
                returnMap.put(map.get("id").toString(), transTypeMap.get(transtypeCode + "|" + key));
            }
        }
        return returnMap;
    }

    private void materialLifeCycleDataUpgradeByTenantList(List<Tenant> tenantList) throws Exception {
        if (CollectionUtils.isEmpty(tenantList)) {
            return;
        }
        ArrayList<ServiceControlType> serviceControlTypeList = new ArrayList<ServiceControlType>();
        ArrayList<MaterialStatus> materialStatusList = new ArrayList<MaterialStatus>();
        ArrayList<String> transTypeIds = new ArrayList<String>();
        ArrayList<MaterialStatusDetail> materialStatusDetailList = new ArrayList<MaterialStatusDetail>();
        ArrayList<MaterialStatusDetailAction> materialStatusDetailActionList = new ArrayList<MaterialStatusDetailAction>();
        ArrayList<LifeCycleDetail> lifeCycleDetailList = new ArrayList<LifeCycleDetail>();
        ArrayList<LifeCycleTemplate> lifecycTplList = new ArrayList<LifeCycleTemplate>();
        this.queryMaterialStatusDatasOfTenant0(serviceControlTypeList, materialStatusList, transTypeIds, materialStatusDetailList, materialStatusDetailActionList, lifeCycleDetailList, lifecycTplList);
        for (Tenant tenant : tenantList) {
            String yTenantId = tenant.getYTenantId() == null || "~".equals(tenant.getYTenantId()) ? tenant.getTenantCenter() : tenant.getYTenantId();
            RobotExecutors.runAs((String)yTenantId, () -> {
                try {
                    this.initMaterialStatusForTenantByTenant0(serviceControlTypeList, materialStatusList, transTypeIds, materialStatusDetailList, materialStatusDetailActionList, lifeCycleDetailList, lifecycTplList, tenant);
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private void initMaterialStatusForTenantByTenant0(List<ServiceControlType> serviceControlTypeList, List<MaterialStatus> materialStatusList, List<String> transTypeIds, List<MaterialStatusDetail> materialStatusDetailList, List<MaterialStatusDetailAction> materialStatusDetailActionList, List<LifeCycleDetail> lifeCycleDetailList, List<LifeCycleTemplate> lifecycTplList, Tenant tenant) throws Exception {
        Map transTypeIdMap = this.transTypeService.getIdMappingsBySourceIds(tenant.getYTenantId(), transTypeIds);
        ArrayList<ServiceControlType> serviceControlTypebyTenantList = new ArrayList<ServiceControlType>();
        HashMap<String, Object> serviceControlTypeIdMap = new HashMap<String, Object>(serviceControlTypeList.size());
        this.dealTenantServiceControlType(serviceControlTypeList, tenant, serviceControlTypebyTenantList, serviceControlTypeIdMap);
        ArrayList<MaterialStatus> materialStatusbyTenantList = new ArrayList<MaterialStatus>();
        HashMap<String, Object> materialStatusIdMap = new HashMap<String, Object>(materialStatusList.size());
        this.dealTenantMaterialStatus(materialStatusList, tenant, materialStatusbyTenantList, materialStatusIdMap);
        ArrayList<MaterialStatusDetail> materialStatusDetailbyTenantList = new ArrayList<MaterialStatusDetail>();
        HashMap<String, Object> materialStatusDetailIdMap = new HashMap<String, Object>(materialStatusDetailList.size());
        this.dealTenantMaterialStatusDetail(materialStatusDetailList, tenant, materialStatusIdMap, transTypeIdMap, materialStatusDetailbyTenantList, materialStatusDetailIdMap);
        ArrayList<MaterialStatusDetailAction> materialStatusDetailActionbyTenantList = new ArrayList<MaterialStatusDetailAction>();
        this.dealTenantMaterialStatusDetailAction(materialStatusDetailActionList, tenant, serviceControlTypeIdMap, materialStatusDetailIdMap, materialStatusDetailActionbyTenantList);
        ArrayList<LifeCycleTemplate> lifecycTplbyTenantList = new ArrayList<LifeCycleTemplate>();
        HashMap<String, Object> lifecycTplIdMap = new HashMap<String, Object>(lifecycTplList.size());
        this.dealTenantLifeCycleTemplate(lifecycTplList, tenant, lifecycTplbyTenantList, lifecycTplIdMap);
        ArrayList<LifeCycleDetail> lifeCycleDetailbyTenantList = new ArrayList<LifeCycleDetail>();
        this.dealTenantLifeCycleDetail(lifeCycleDetailList, tenant, materialStatusIdMap, lifecycTplIdMap, lifeCycleDetailbyTenantList);
        try {
            if (!CollectionUtils.isEmpty(serviceControlTypebyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.ServiceControlType", serviceControlTypebyTenantList);
            }
            if (!CollectionUtils.isEmpty(materialStatusbyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.MaterialStatus", materialStatusbyTenantList);
            }
            if (!CollectionUtils.isEmpty(materialStatusDetailbyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.MaterialStatusDetail", materialStatusDetailbyTenantList);
            }
            if (!CollectionUtils.isEmpty(materialStatusDetailActionbyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.MaterialStatusDetailAction", materialStatusDetailActionbyTenantList);
            }
            if (!CollectionUtils.isEmpty(lifecycTplbyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.LifeCycleTemplate", lifecycTplbyTenantList);
            }
            if (!CollectionUtils.isEmpty(lifeCycleDetailbyTenantList)) {
                MetaDaoHelper.insertNoPartition((String)"pc.manage.LifeCycleDetail", lifeCycleDetailbyTenantList);
            }
        }
        catch (Exception e) {
            log.error("\u79df\u6237\u7269\u6599\u72b6\u6001\u6570\u636e\u5199\u5e93\u64cd\u4f5c\u5931\u8d25" + e.getMessage(), (Throwable)e);
        }
    }

    private void queryMaterialStatusDatasOfTenant0(List<ServiceControlType> serviceControlTypeList, List<MaterialStatus> materialStatusList, List<String> transTypeIds, List<MaterialStatusDetail> materialStatusDetailList, List<MaterialStatusDetailAction> materialStatusDetailActionList, List<LifeCycleDetail> lifeCycleDetailList, List<LifeCycleTemplate> lifecycTplList) {
        RobotExecutors.runAs((String)GLOBAL, () -> {
            try {
                QueryConditionGroup controlTypeCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL)});
                QuerySchema controlTypeSchema = QuerySchema.create().addSelect("id,serviceCode,serviceName,action,actionName,stopstatus, microServiceCode").addCondition((ConditionExpression)controlTypeCondition);
                List serviceControlTypeMapList = null;
                serviceControlTypeMapList = MetaDaoHelper.query((String)"pc.manage.ServiceControlType", (boolean)true, (QuerySchema)controlTypeSchema, null);
                for (Map serviceControlTypeMap : serviceControlTypeMapList) {
                    ServiceControlType serviceControlType = new ServiceControlType();
                    serviceControlType.putAll(serviceControlTypeMap);
                    serviceControlTypeList.add(serviceControlType);
                }
                QueryConditionGroup materialStatusCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL), QueryCondition.name((String)"systemFlag").eq((Object)"1")});
                QuerySchema materialStatusSchema = QuerySchema.create().addSelect("id,code,name,stopstatus,systemFlag, microServiceCode").addCondition((ConditionExpression)materialStatusCondition);
                List materialStatusMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (boolean)true, (QuerySchema)materialStatusSchema, null);
                for (Map materialStatusMap : materialStatusMapList) {
                    MaterialStatus materialStatus = new MaterialStatus();
                    materialStatus.putAll(materialStatusMap);
                    materialStatus.setName((Map)materialStatusMap.get("name"));
                    materialStatusList.add(materialStatus);
                }
                QueryConditionGroup materialStatusDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL), QueryCondition.name((String)"systemFlag").eq((Object)"1")});
                QuerySchema materialStatusDetailSchema = QuerySchema.create().addSelect("id,materialStatusId,serviceCode,serviceName,systemFlag,transType,granularityControl,controlRule").addCondition((ConditionExpression)materialStatusDetailCondition);
                materialStatusDetailSchema.setPartitionable(false);
                List materialStatusDetailMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetail", (QuerySchema)materialStatusDetailSchema, null);
                for (Map materialStatusDetailMap : materialStatusDetailMapList) {
                    if (null != materialStatusDetailMap.get("transType")) {
                        transTypeIds.add(materialStatusDetailMap.get("transType").toString());
                    }
                    MaterialStatusDetail materialStatusDetail = new MaterialStatusDetail();
                    materialStatusDetail.putAll(materialStatusDetailMap);
                    materialStatusDetailList.add(materialStatusDetail);
                }
                QueryConditionGroup materialStatusDetailActionCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL)});
                QuerySchema materialStatusDetailActionSchema = QuerySchema.create().addSelect("id,materialStatusDetailId,action").addCondition((ConditionExpression)materialStatusDetailActionCondition);
                List materialStatusDetailActionMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetailAction", (QuerySchema)materialStatusDetailActionSchema, null);
                for (Map materialStatusDetailActionMap : materialStatusDetailActionMapList) {
                    MaterialStatusDetailAction materialStatusDetailAction = new MaterialStatusDetailAction();
                    materialStatusDetailAction.putAll(materialStatusDetailActionMap);
                    materialStatusDetailActionList.add(materialStatusDetailAction);
                }
                QueryConditionGroup lifecycTplCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL), QueryCondition.name((String)"systemFlag").eq((Object)"1")});
                QuerySchema lifecycTplSchema = QuerySchema.create().addSelect("id,code,name,systemFlag,stopstatus, microServiceCode").addCondition((ConditionExpression)lifecycTplCondition);
                List lifecycTplMapList = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)lifecycTplSchema, null);
                for (Map lifecycTplMap : lifecycTplMapList) {
                    LifeCycleTemplate lifeCycleTemplate = new LifeCycleTemplate();
                    lifeCycleTemplate.putAll(lifecycTplMap);
                    lifeCycleTemplate.setName((Map)lifecycTplMap.get("name"));
                    lifecycTplList.add(lifeCycleTemplate);
                }
                QueryConditionGroup lifeCycleDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)GLOBAL)});
                QuerySchema lifeCycleDetailSchema = QuerySchema.create().addSelect("id,lifeCycleTemplateId,materialStatusId,isDefault").addCondition((ConditionExpression)lifeCycleDetailCondition);
                List lifeCycleDetailMapList = MetaDaoHelper.query((String)"pc.manage.LifeCycleDetail", (QuerySchema)lifeCycleDetailSchema, null);
                for (Map lifeCycleDetailMap : lifeCycleDetailMapList) {
                    LifeCycleDetail lifeCycleDetail = new LifeCycleDetail();
                    lifeCycleDetail.putAll(lifeCycleDetailMap);
                    lifeCycleDetailList.add(lifeCycleDetail);
                }
            }
            catch (Exception e) {
                log.error("\u67e5\u8be20\u79df\u6237\u670d\u52a1\u63a7\u5236\u7c7b\u578b\u6570\u636e\u5f02\u5e38", (Throwable)e);
                throw new RuntimeException("\u67e5\u8be20\u79df\u6237\u670d\u52a1\u63a7\u5236\u7c7b\u578b\u6570\u636e\u5f02\u5e38");
            }
        });
    }

    private void dealTenantServiceControlType(List<ServiceControlType> serviceControlTypeList, Tenant tenant, List<ServiceControlType> serviceControlTypebyTenantList, Map<String, Object> serviceControlTypeIdMap) throws Exception {
        QueryConditionGroup controlTypebyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema controlTypebyTenantSchema = QuerySchema.create().addSelect("id,serviceCode,serviceName,action,actionName,stopstatus,socialSrcid, microServiceCode").addCondition((ConditionExpression)controlTypebyTenantCondition);
        controlTypebyTenantSchema.setPartitionable(false);
        List serviceControlTypebyTenantMapList = MetaDaoHelper.query((String)"pc.manage.ServiceControlType", (boolean)true, (QuerySchema)controlTypebyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)serviceControlTypebyTenantMapList)) {
            for (ServiceControlType serviceControlTypeTenant0 : serviceControlTypeList) {
                ServiceControlType serviceControlType = new ServiceControlType();
                serviceControlType.setId((Object)IdManager.getInstance().nextId());
                serviceControlType.setServiceCode(serviceControlTypeTenant0.getServiceCode());
                serviceControlType.setServiceName(serviceControlTypeTenant0.getServiceName());
                serviceControlType.setAction(serviceControlTypeTenant0.getAction());
                serviceControlType.set("actionName", serviceControlTypeTenant0.get("actionName"));
                serviceControlType.setStopstatus(serviceControlTypeTenant0.getStopstatus());
                serviceControlType.setSocialSrcid((String)serviceControlTypeTenant0.getId());
                serviceControlType.set("microServiceCode", serviceControlTypeTenant0.get("microServiceCode"));
                serviceControlType.setSocialTenantid(GLOBAL);
                serviceControlType.setTenant((Long)tenant.getId());
                serviceControlType.setYTenant(tenant.getYTenantId());
                serviceControlTypeIdMap.put((String)serviceControlTypeTenant0.getId(), serviceControlType.getId());
                serviceControlTypebyTenantList.add(serviceControlType);
            }
        } else {
            Map<String, Map> typebyTenantMap = serviceControlTypebyTenantMapList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (ServiceControlType serviceControlTypeTenant0 : serviceControlTypeList) {
                if (null != typebyTenantMap.get(serviceControlTypeTenant0.getId())) {
                    serviceControlTypeIdMap.put((String)serviceControlTypeTenant0.getId(), typebyTenantMap.get(serviceControlTypeTenant0.getId()).get("id"));
                    continue;
                }
                ServiceControlType serviceControlType = new ServiceControlType();
                serviceControlType.setId((Object)IdManager.getInstance().nextId());
                serviceControlType.setServiceCode(serviceControlTypeTenant0.getServiceCode());
                serviceControlType.setServiceName(serviceControlTypeTenant0.getServiceName());
                serviceControlType.setAction(serviceControlTypeTenant0.getAction());
                serviceControlType.set("actionName", serviceControlTypeTenant0.get("actionName"));
                serviceControlType.setStopstatus(serviceControlTypeTenant0.getStopstatus());
                serviceControlType.setSocialSrcid((String)serviceControlTypeTenant0.getId());
                serviceControlType.set("microServiceCode", serviceControlTypeTenant0.get("microServiceCode"));
                serviceControlType.setSocialTenantid(GLOBAL);
                serviceControlType.setTenant((Long)tenant.getId());
                serviceControlType.setYTenant(tenant.getYTenantId());
                serviceControlTypeIdMap.put((String)serviceControlTypeTenant0.getId(), serviceControlType.getId());
                serviceControlTypebyTenantList.add(serviceControlType);
            }
        }
    }

    private void dealTenantMaterialStatus(List<MaterialStatus> materialStatusList, Tenant tenant, List<MaterialStatus> materialStatusbyTenantList, Map<String, Object> materialStatusIdMap) throws Exception {
        QueryConditionGroup materialStatusbyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema materialStatusbyTenantSchema = QuerySchema.create().addSelect("id,code,name,stopstatus,socialSrcid, microServiceCode").addCondition((ConditionExpression)materialStatusbyTenantCondition);
        materialStatusbyTenantSchema.setPartitionable(false);
        List materialStatusbyTenantMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatus", (QuerySchema)materialStatusbyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)materialStatusbyTenantMapList)) {
            for (MaterialStatus materialStatusTenant0 : materialStatusList) {
                MaterialStatus materialStatus = new MaterialStatus();
                materialStatus.setId((Object)IdManager.getInstance().nextId());
                materialStatus.setCode(materialStatusTenant0.getCode());
                materialStatus.setName(materialStatusTenant0.getName());
                materialStatus.setSystemFlag(materialStatusTenant0.getSystemFlag());
                materialStatus.setStopstatus(materialStatusTenant0.getStopstatus());
                materialStatus.setSocialSrcid((String)materialStatusTenant0.getId());
                materialStatus.set("microServiceCode", materialStatus.get("microServiceCode"));
                materialStatus.setSocialTenantid(GLOBAL);
                materialStatus.setTenant((Long)tenant.getId());
                materialStatus.setYTenant(tenant.getYTenantId());
                materialStatusIdMap.put((String)materialStatusTenant0.getId(), materialStatus.getId());
                materialStatusbyTenantList.add(materialStatus);
            }
        } else {
            Map<String, Map> materialStatusbyTenantMap = materialStatusbyTenantMapList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (MaterialStatus materialStatusTenant0 : materialStatusList) {
                if (null != materialStatusbyTenantMap.get(materialStatusTenant0.getId())) {
                    materialStatusIdMap.put((String)materialStatusTenant0.getId(), materialStatusbyTenantMap.get(materialStatusTenant0.getId()).get("id"));
                    continue;
                }
                MaterialStatus materialStatus = new MaterialStatus();
                materialStatus.setId((Object)IdManager.getInstance().nextId());
                materialStatus.setCode(materialStatusTenant0.getCode());
                materialStatus.setName(materialStatusTenant0.getName());
                materialStatus.setSystemFlag(materialStatusTenant0.getSystemFlag());
                materialStatus.setStopstatus(materialStatusTenant0.getStopstatus());
                materialStatus.setSocialSrcid((String)materialStatusTenant0.getId());
                materialStatus.set("microServiceCode", materialStatus.get("microServiceCode"));
                materialStatus.setSocialTenantid(GLOBAL);
                materialStatus.setTenant((Long)tenant.getId());
                materialStatus.setYTenant(tenant.getYTenantId());
                materialStatusIdMap.put((String)materialStatusTenant0.getId(), materialStatus.getId());
                materialStatusbyTenantList.add(materialStatus);
            }
        }
    }

    private void dealTenantMaterialStatusDetail(List<MaterialStatusDetail> materialStatusDetailList, Tenant tenant, Map<String, Object> materialStatusIdMap, Map<String, String> transTypeIdMap, List<MaterialStatusDetail> materialStatusDetailbyTenantList, Map<String, Object> materialStatusDetailIdMap) throws Exception {
        QueryConditionGroup materialStatusDetailbyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema materialStatusDetailbyTenantSchema = QuerySchema.create().addSelect("id,materialStatusId,serviceCode,serviceName,transType,granularityControl,controlRule,socialSrcid").addCondition((ConditionExpression)materialStatusDetailbyTenantCondition);
        materialStatusDetailbyTenantSchema.setPartitionable(false);
        List materialStatusDetailbyTenantMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetail", (QuerySchema)materialStatusDetailbyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)materialStatusDetailbyTenantMapList)) {
            for (MaterialStatusDetail materialStatusDetailTenant0 : materialStatusDetailList) {
                MaterialStatusDetail materialStatusDetail = new MaterialStatusDetail();
                materialStatusDetail.setId((Object)IdManager.getInstance().nextId());
                materialStatusDetail.setMaterialStatusId(String.valueOf(materialStatusIdMap.get(materialStatusDetailTenant0.getMaterialStatusId())));
                materialStatusDetail.setServiceCode(materialStatusDetailTenant0.getServiceCode());
                materialStatusDetail.setServiceName(materialStatusDetailTenant0.getServiceName());
                materialStatusDetail.setSystemFlag(materialStatusDetailTenant0.getSystemFlag());
                materialStatusDetail.setTransType(transTypeIdMap.get(materialStatusDetailTenant0.getTransType()));
                materialStatusDetail.setGranularityControl(materialStatusDetailTenant0.getGranularityControl());
                materialStatusDetail.setControlRule(materialStatusDetailTenant0.getControlRule());
                materialStatusDetail.setSocialSrcid((String)materialStatusDetailTenant0.getId());
                materialStatusDetail.setSocialTenantid(GLOBAL);
                materialStatusDetail.setTenant((Long)tenant.getId());
                materialStatusDetail.setYTenant(tenant.getYTenantId());
                materialStatusDetailIdMap.put((String)materialStatusDetailTenant0.getId(), materialStatusDetail.getId());
                materialStatusDetailbyTenantList.add(materialStatusDetail);
            }
        } else {
            Map<String, Map> materialStatusDetailbyTenantMap = materialStatusDetailbyTenantMapList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (MaterialStatusDetail materialStatusDetailTenant0 : materialStatusDetailList) {
                if (null != materialStatusDetailbyTenantMap.get(materialStatusDetailTenant0.getId())) {
                    materialStatusDetailIdMap.put((String)materialStatusDetailTenant0.getId(), materialStatusDetailbyTenantMap.get(materialStatusDetailTenant0.getId()).get("id"));
                    continue;
                }
                MaterialStatusDetail materialStatusDetail = new MaterialStatusDetail();
                materialStatusDetail.setId((Object)IdManager.getInstance().nextId());
                materialStatusDetail.setMaterialStatusId(String.valueOf(materialStatusIdMap.get(materialStatusDetailTenant0.getMaterialStatusId())));
                materialStatusDetail.setServiceCode(materialStatusDetailTenant0.getServiceCode());
                materialStatusDetail.setServiceName(materialStatusDetailTenant0.getServiceName());
                materialStatusDetail.setSystemFlag(materialStatusDetailTenant0.getSystemFlag());
                materialStatusDetail.setTransType(transTypeIdMap.get(materialStatusDetailTenant0.getTransType()));
                materialStatusDetail.setGranularityControl(materialStatusDetailTenant0.getGranularityControl());
                materialStatusDetail.setControlRule(materialStatusDetailTenant0.getControlRule());
                materialStatusDetail.setSocialSrcid((String)materialStatusDetailTenant0.getId());
                materialStatusDetail.setSocialTenantid(GLOBAL);
                materialStatusDetail.setTenant((Long)tenant.getId());
                materialStatusDetail.setYTenant(tenant.getYTenantId());
                materialStatusDetailIdMap.put((String)materialStatusDetailTenant0.getId(), materialStatusDetail.getId());
                materialStatusDetailbyTenantList.add(materialStatusDetail);
            }
        }
    }

    private void dealTenantMaterialStatusDetailAction(List<MaterialStatusDetailAction> materialStatusDetailActionList, Tenant tenant, Map<String, Object> serviceControlTypeIdMap, Map<String, Object> materialStatusDetailIdMap, List<MaterialStatusDetailAction> materialStatusDetailActionbyTenantList) throws Exception {
        QueryConditionGroup materialStatusDetailActionbyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema materialStatusDetailActionbyTenantSchema = QuerySchema.create().addSelect("id,materialStatusDetailId,action,socialSrcid").addCondition((ConditionExpression)materialStatusDetailActionbyTenantCondition);
        materialStatusDetailActionbyTenantSchema.setPartitionable(false);
        List materialStatusDetailActionbyTenantMapList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetailAction", (QuerySchema)materialStatusDetailActionbyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)materialStatusDetailActionbyTenantMapList)) {
            for (MaterialStatusDetailAction materialStatusDetailActionTenant0 : materialStatusDetailActionList) {
                MaterialStatusDetailAction materialStatusDetailAction = new MaterialStatusDetailAction();
                materialStatusDetailAction.setId((Object)IdManager.getInstance().nextId());
                materialStatusDetailAction.setMaterialStatusDetailId(String.valueOf(materialStatusDetailIdMap.get(materialStatusDetailActionTenant0.getMaterialStatusDetailId())));
                materialStatusDetailAction.setAction(String.valueOf(serviceControlTypeIdMap.get(materialStatusDetailActionTenant0.getAction())));
                materialStatusDetailAction.setSocialSrcid((String)materialStatusDetailActionTenant0.getId());
                materialStatusDetailAction.setSocialTenantid(GLOBAL);
                materialStatusDetailAction.setTenant((Long)tenant.getId());
                materialStatusDetailAction.setYTenant(tenant.getYTenantId());
                materialStatusDetailActionbyTenantList.add(materialStatusDetailAction);
            }
        } else {
            Map<String, Map> materialStatusDetailbyTenantMap = materialStatusDetailActionbyTenantMapList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (MaterialStatusDetailAction materialStatusDetailActionTenant0 : materialStatusDetailActionList) {
                if (null != materialStatusDetailbyTenantMap.get(materialStatusDetailActionTenant0.getId())) continue;
                MaterialStatusDetailAction materialStatusDetailAction = new MaterialStatusDetailAction();
                materialStatusDetailAction.setId((Object)IdManager.getInstance().nextId());
                materialStatusDetailAction.setId((Object)IdManager.getInstance().nextId());
                materialStatusDetailAction.setMaterialStatusDetailId(String.valueOf(materialStatusDetailIdMap.get(materialStatusDetailActionTenant0.getMaterialStatusDetailId())));
                materialStatusDetailAction.setAction(String.valueOf(serviceControlTypeIdMap.get(materialStatusDetailActionTenant0.getAction())));
                materialStatusDetailAction.setSocialSrcid((String)materialStatusDetailActionTenant0.getId());
                materialStatusDetailAction.setSocialTenantid(GLOBAL);
                materialStatusDetailAction.setTenant((Long)tenant.getId());
                materialStatusDetailAction.setYTenant(tenant.getYTenantId());
                materialStatusDetailActionbyTenantList.add(materialStatusDetailAction);
            }
        }
    }

    private void dealTenantLifeCycleTemplate(List<LifeCycleTemplate> lifecycTplList, Tenant tenant, List<LifeCycleTemplate> lifecycTplbyTenantList, Map<String, Object> lifecycTplIdMap) throws Exception {
        QueryConditionGroup lifecycTplbyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema lifecycTplbyTenantSchema = QuerySchema.create().addSelect("id,code,name,stopstatus,socialSrcid, microServiceCode").addCondition((ConditionExpression)lifecycTplbyTenantCondition);
        lifecycTplbyTenantSchema.setPartitionable(false);
        List lifecycTplbyTenantMapList = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (boolean)true, (QuerySchema)lifecycTplbyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)lifecycTplbyTenantMapList)) {
            for (LifeCycleTemplate lifeCycleTemplateTenant0 : lifecycTplList) {
                LifeCycleTemplate lifeCycleTemplate = new LifeCycleTemplate();
                lifeCycleTemplate.setId((Object)IdManager.getInstance().nextId());
                lifeCycleTemplate.setCode(lifeCycleTemplateTenant0.getCode());
                lifeCycleTemplate.setName(lifeCycleTemplateTenant0.getName());
                lifeCycleTemplate.setSystemFlag(lifeCycleTemplateTenant0.getSystemFlag());
                lifeCycleTemplate.setStopstatus(lifeCycleTemplateTenant0.getStopstatus());
                lifeCycleTemplate.setSocialSrcid((String)lifeCycleTemplateTenant0.getId());
                lifeCycleTemplate.set("microServiceCode", lifeCycleTemplate.get("microServiceCode"));
                lifeCycleTemplate.setSocialTenantid(GLOBAL);
                lifeCycleTemplate.setTenant((Long)tenant.getId());
                lifeCycleTemplate.setYTenant(tenant.getYTenantId());
                lifecycTplIdMap.put((String)lifeCycleTemplateTenant0.getId(), lifeCycleTemplate.getId());
                lifecycTplbyTenantList.add(lifeCycleTemplate);
            }
        } else {
            Map<String, Map> lifecycTplbyTenantMap = lifecycTplbyTenantList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (LifeCycleTemplate lifeCycleTemplateTenant0 : lifecycTplList) {
                if (null != lifecycTplbyTenantMap.get(lifeCycleTemplateTenant0.getId())) {
                    lifecycTplIdMap.put((String)lifeCycleTemplateTenant0.getId(), lifecycTplbyTenantMap.get(lifeCycleTemplateTenant0.getId()).get("id"));
                    continue;
                }
                LifeCycleTemplate lifeCycleTemplate = new LifeCycleTemplate();
                lifeCycleTemplate.setId((Object)IdManager.getInstance().nextId());
                lifeCycleTemplate.setCode(lifeCycleTemplateTenant0.getCode());
                lifeCycleTemplate.setName(lifeCycleTemplateTenant0.getName());
                lifeCycleTemplate.setSystemFlag(lifeCycleTemplateTenant0.getSystemFlag());
                lifeCycleTemplate.setStopstatus(lifeCycleTemplateTenant0.getStopstatus());
                lifeCycleTemplate.setSocialSrcid((String)lifeCycleTemplateTenant0.getId());
                lifeCycleTemplate.set("microServiceCode", lifeCycleTemplate.get("microServiceCode"));
                lifeCycleTemplate.setSocialTenantid(GLOBAL);
                lifeCycleTemplate.setTenant((Long)tenant.getId());
                lifeCycleTemplate.setYTenant(tenant.getYTenantId());
                lifecycTplIdMap.put((String)lifeCycleTemplateTenant0.getId(), lifeCycleTemplate.getId());
                lifecycTplbyTenantList.add(lifeCycleTemplate);
            }
        }
    }

    private void dealTenantLifeCycleDetail(List<LifeCycleDetail> lifeCycleDetailList, Tenant tenant, Map<String, Object> materialStatusIdMap, Map<String, Object> lifecycTplIdMap, List<LifeCycleDetail> lifeCycleDetailbyTenantList) throws Exception {
        QueryConditionGroup lifeCycleDetailbyTenantCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq(tenant.getId()), QueryCondition.name((String)"socialTenantid").eq((Object)GLOBAL)});
        QuerySchema lifeCycleDetailbyTenantSchema = QuerySchema.create().addSelect("id,lifeCycleTemplateId,materialStatusId,isDefault,socialSrcid").addCondition((ConditionExpression)lifeCycleDetailbyTenantCondition);
        lifeCycleDetailbyTenantSchema.setPartitionable(false);
        List lifeCycleDetailbyTenantMapList = MetaDaoHelper.query((String)"pc.manage.LifeCycleDetail", (QuerySchema)lifeCycleDetailbyTenantSchema, null);
        if (CollectionUtils.isEmpty((Collection)lifeCycleDetailbyTenantMapList)) {
            for (LifeCycleDetail lifeCycleDetailTenant0 : lifeCycleDetailList) {
                LifeCycleDetail lifeCycleDetail = new LifeCycleDetail();
                lifeCycleDetail.setId((Object)IdManager.getInstance().nextId());
                lifeCycleDetail.setLifeCycleTemplateId(String.valueOf(lifecycTplIdMap.get(lifeCycleDetailTenant0.getLifeCycleTemplateId())));
                lifeCycleDetail.setMaterialStatusId(String.valueOf(materialStatusIdMap.get(lifeCycleDetailTenant0.getMaterialStatusId())));
                lifeCycleDetail.setIsDefault(lifeCycleDetailTenant0.getIsDefault());
                lifeCycleDetail.setSocialSrcid((String)lifeCycleDetailTenant0.getId());
                lifeCycleDetail.setSocialTenantid(GLOBAL);
                lifeCycleDetail.setTenant((Long)tenant.getId());
                lifeCycleDetail.setYTenant(tenant.getYTenantId());
                lifeCycleDetailbyTenantList.add(lifeCycleDetail);
            }
        } else {
            Map<String, Map> lifeCycleDetailbyTenantMap = lifeCycleDetailbyTenantMapList.stream().collect(Collectors.toMap(p -> p.get("socialSrcid").toString(), p -> p));
            for (LifeCycleDetail lifeCycleDetailTenant0 : lifeCycleDetailList) {
                if (null != lifeCycleDetailbyTenantMap.get(lifeCycleDetailTenant0.getId())) continue;
                LifeCycleDetail lifeCycleDetail = new LifeCycleDetail();
                lifeCycleDetail.setId((Object)IdManager.getInstance().nextId());
                lifeCycleDetail.setLifeCycleTemplateId(String.valueOf(lifecycTplIdMap.get(lifeCycleDetailTenant0.getLifeCycleTemplateId())));
                lifeCycleDetail.setMaterialStatusId(String.valueOf(materialStatusIdMap.get(lifeCycleDetailTenant0.getMaterialStatusId())));
                lifeCycleDetail.setIsDefault(lifeCycleDetailTenant0.getIsDefault());
                lifeCycleDetail.setSocialSrcid((String)lifeCycleDetailTenant0.getId());
                lifeCycleDetail.setSocialTenantid(GLOBAL);
                lifeCycleDetail.setTenant((Long)tenant.getId());
                lifeCycleDetail.setYTenant(tenant.getYTenantId());
                lifeCycleDetailbyTenantList.add(lifeCycleDetail);
            }
        }
    }
}

