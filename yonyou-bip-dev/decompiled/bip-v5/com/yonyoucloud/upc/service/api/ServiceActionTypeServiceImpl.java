/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.diwork.service.ILabelApplicationServiceCacheService
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.workbench.model.out.Label4DomainDTO
 *  com.yonyoucloud.iuap.upc.api.IServiceActionTypeService
 *  com.yonyoucloud.iuap.upc.vo.ServiceActionTypeApiVO
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
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.diwork.service.ILabelApplicationServiceCacheService;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.workbench.model.out.Label4DomainDTO;
import com.yonyoucloud.iuap.upc.api.IServiceActionTypeService;
import com.yonyoucloud.iuap.upc.vo.ServiceActionTypeApiVO;
import com.yonyoucloud.upc.pc.manage.ServiceControlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
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
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ServiceActionTypeServiceImpl
implements IServiceActionTypeService {
    private static final Logger log = LoggerFactory.getLogger(ServiceActionTypeServiceImpl.class);
    @Autowired
    ILabelApplicationServiceCacheService labelApplicationServiceCacheService;

    public ServiceActionTypeApiVO serviceActionTypeSave(ServiceActionTypeApiVO serviceActionTypeApiVO) throws Exception {
        if (null == serviceActionTypeApiVO) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801236);
        }
        ServiceControlType serviceControlType = new ServiceControlType();
        serviceControlType.init((Map)JSON.parseObject((String)JSON.toJSONString((Object)serviceActionTypeApiVO), Map.class));
        Map map = UpcAPiTool.beanToMap((Object)serviceActionTypeApiVO, null, null, (String)"Insert");
        serviceControlType.putAll(map);
        DataTransferUtils.fill((String)"pc_serviceaction", (String)"pc.manage.ServiceControlType", (Object)serviceControlType, (int)2);
        String yhttenantId = (String)AppContext.getYhtTenantId();
        Label4DomainDTO serviceCodeResult = this.labelApplicationServiceCacheService.findDTOByTenantIdAndServiceCodeInDomain(yhttenantId, serviceControlType.getServiceCode());
        if (null == serviceCodeResult) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801237, new Object[]{serviceControlType.getServiceCode()});
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,action").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"serviceCode").eq((Object)serviceControlType.getServiceCode()), QueryCondition.name((String)"action").eq((Object)serviceControlType.getAction())}));
        List existsServiceAction = MetaDaoHelper.query((String)"pc.manage.ServiceControlType", (QuerySchema)schema);
        ArrayList<ServiceControlType> serviceAction2Db = new ArrayList<ServiceControlType>();
        if (!CollectionUtils.isEmpty((Collection)existsServiceAction)) {
            existsServiceAction.forEach(action -> {
                if (null != serviceControlType.getId() && serviceControlType.getId().equals(action.get("id"))) {
                    ServiceControlType serviceAction = new ServiceControlType();
                    serviceAction.setId(serviceControlType.getId());
                    serviceAction.set("serviceCode", (Object)serviceControlType.getServiceCode());
                    serviceAction.set("serviceName", (Object)serviceControlType.getServiceName());
                    serviceAction.set("action", (Object)serviceControlType.getAction());
                    serviceAction.set("actionName", (Object)serviceControlType.getActionName());
                    serviceAction.set("stopstatus", (Object)(null == serviceControlType.getStopstatus() ? 0 : serviceControlType.getStopstatus()));
                    serviceAction.setEntityStatus(EntityStatus.Update);
                    serviceAction2Db.add(serviceAction);
                }
            });
        } else {
            ServiceControlType serviceAction = new ServiceControlType();
            serviceAction.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
            serviceAction.set("serviceCode", (Object)serviceControlType.getServiceCode());
            serviceAction.set("serviceName", (Object)serviceControlType.getServiceName());
            serviceAction.set("action", (Object)serviceControlType.getAction());
            serviceAction.set("actionName", (Object)serviceControlType.getActionName());
            serviceAction.set("stopstatus", (Object)(null == serviceControlType.getStopstatus() ? 0 : serviceControlType.getStopstatus()));
            serviceAction.setEntityStatus(EntityStatus.Insert);
            serviceAction2Db.add(serviceAction);
        }
        if (!serviceAction2Db.isEmpty()) {
            MetaDaoHelper.update((String)"pc.manage.ServiceControlType", serviceAction2Db);
        }
        serviceActionTypeApiVO.setId((String)((ServiceControlType)serviceAction2Db.get(0)).getId());
        return serviceActionTypeApiVO;
    }
}

