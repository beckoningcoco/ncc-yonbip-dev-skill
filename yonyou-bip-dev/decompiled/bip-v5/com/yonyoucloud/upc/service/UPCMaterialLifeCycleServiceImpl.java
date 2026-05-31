/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.materialLifeCycle.dao.MaterialStatusQryDao
 *  com.yonyou.iuap.apdoc.coredoc.materialLifeCycle.service.MaterialSatausService
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.materialLifeCycle.dao.MaterialStatusQryDao;
import com.yonyou.iuap.apdoc.coredoc.materialLifeCycle.service.MaterialSatausService;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCMaterialLifeCycleService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UPCMaterialLifeCycleServiceImpl
implements IUPCMaterialLifeCycleService {
    private static final Logger log = LoggerFactory.getLogger(UPCMaterialLifeCycleServiceImpl.class);
    @Autowired
    MaterialSatausService materialSatausService;
    @Autowired
    MaterialStatusQryDao materialStatusQryDao;

    @Override
    public List<Map<String, Object>> getLifeCycleDetail(Long materialStatusId) throws Exception {
        if (null == materialStatusId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800535);
        }
        List<Map<String, Object>> lifeCycleDetailList = this.getMaterialStatusDetail(materialStatusId);
        return lifeCycleDetailList;
    }

    private List<Map<String, Object>> getMaterialStatusDetail(Long materialStatusId) throws Exception {
        String lifeCycleMaterialStatusId = String.valueOf(materialStatusId);
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"materialStatusId").eq((Object)lifeCycleMaterialStatusId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("serviceCode as materialStatusId!materialStatusDetail!serviceCode,serviceName as materialStatusId!materialStatusDetail!serviceName,transType as materialStatusId!materialStatusDetail!transType,transType.name as materialStatusId!materialStatusDetail!transTypeName,controlRule as materialStatusId!materialStatusDetail!controlRule,granularityControl as materialStatusId!materialStatusDetail!granularityControl,systemFlag as materialStatusId!materialStatusDetail!systemFlag,id as materialStatusId!materialStatusDetail!id").appendQueryCondition(new ConditionExpression[]{condition});
        List materialStatusDetailList = MetaDaoHelper.query((String)"pc.manage.MaterialStatusDetail", (QuerySchema)querySchema);
        if (null != materialStatusDetailList && !materialStatusDetailList.isEmpty()) {
            this.replaceServiceName(materialStatusDetailList);
            this.addMaterialStatusDetailAction(materialStatusDetailList);
        }
        return materialStatusDetailList;
    }

    private void replaceServiceName(List<Map<String, Object>> materialStatusDetailList) {
        List<String> detailIds = this.getDetailIdsByPOs(materialStatusDetailList);
        List materialStatusDetailPOS = this.materialSatausService.queryMaterialDetailDetailByIds(detailIds);
        if (CollectionUtils.isNotEmpty((Collection)materialStatusDetailPOS)) {
            ArrayList serviceCodes = new ArrayList();
            HashMap detailIdAndSericeCodeMap = new HashMap();
            materialStatusDetailPOS.forEach(materialStatusDetailPO -> {
                serviceCodes.add(materialStatusDetailPO.getServiceCode());
                detailIdAndSericeCodeMap.put(materialStatusDetailPO.getId(), materialStatusDetailPO.getServiceCode());
            });
            Map stringService4DomainDTOMap = this.materialSatausService.queryServiceNameByServiceCodes(serviceCodes);
            if (MapUtils.isNotEmpty((Map)stringService4DomainDTOMap)) {
                for (Map<String, Object> materialStatus : materialStatusDetailList) {
                    String serviceCode;
                    String detailid;
                    if (null == materialStatus.get("materialStatusId!materialStatusDetail!id") || null == detailIdAndSericeCodeMap.get(detailid = materialStatus.get("materialStatusId!materialStatusDetail!id").toString()) || null == stringService4DomainDTOMap.get(serviceCode = (String)detailIdAndSericeCodeMap.get(detailid))) continue;
                    materialStatus.put("materialStatusId!materialStatusDetail!serviceName", stringService4DomainDTOMap.get(serviceCode));
                }
            }
        }
    }

    private void addMaterialStatusDetailAction(List<Map<String, Object>> materialStatusDetailList) {
        List<String> detailIds = this.getDetailIdsByPOs(materialStatusDetailList);
        List actionAndMaterialStatusDetailIdList = this.materialStatusQryDao.queryActionByMaterialStatusDetailId(detailIds);
        if (!actionAndMaterialStatusDetailIdList.isEmpty()) {
            Map actionAndActionNameMap;
            ArrayList actionIds = new ArrayList(actionAndMaterialStatusDetailIdList.size());
            actionAndMaterialStatusDetailIdList.forEach(materialStatusDetailActionPO -> {
                if (null != materialStatusDetailActionPO.getAction()) {
                    actionIds.add(materialStatusDetailActionPO.getAction());
                }
            });
            if (!actionIds.isEmpty() && MapUtils.isNotEmpty((Map)(actionAndActionNameMap = this.materialSatausService.getActionIdAndNamesMap(actionIds)))) {
                materialStatusDetailList.forEach(map -> {
                    List detailActionNames = actionAndMaterialStatusDetailIdList.stream().filter(materialStatusDetailAction -> materialStatusDetailAction.getMaterialStatusDetailId().equals(map.get("materialStatusId!materialStatusDetail!id"))).collect(Collectors.toList());
                    if (detailActionNames.size() > 0) {
                        String actionNames = this.materialSatausService.getActionNamesString(actionAndActionNameMap, detailActionNames);
                        map.put("materialStatusId!materialStatusDetail!action", actionNames);
                    }
                });
            }
        }
    }

    @NotNull
    private List<String> getDetailIdsByPOs(List<Map<String, Object>> materialStatusDetailList) {
        ArrayList<String> detailIds = new ArrayList<String>();
        materialStatusDetailList.stream().forEach(record -> {
            Map map = record;
            if (null != map.get("materialStatusId!materialStatusDetail!id")) {
                detailIds.add(map.get("materialStatusId!materialStatusDetail!id").toString());
            }
        });
        return detailIds;
    }
}

