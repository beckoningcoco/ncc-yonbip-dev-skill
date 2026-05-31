/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.api.ICommonService
 *  com.yonyoucloud.iuap.upc.dto.UpdateErpCodeDTO
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.ICommonService;
import com.yonyoucloud.iuap.upc.dto.UpdateErpCodeDTO;
import com.yonyoucloud.upc.service.api.constant.EntityEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="coreDocCommonService")
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class CommonServiceImpl
implements ICommonService {
    public final Integer MAX_LIST = 1000;
    Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

    public void updateErpCode(List<Map> dataList, String yhtTenantid) throws Exception {
        if (!CollectionUtils.isEmpty(dataList) || dataList.size() >= this.MAX_LIST) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801088);
        }
        ArrayList updateErpCodeDTOList = new ArrayList();
        dataList.forEach(data -> {
            UpdateErpCodeDTO updateErpCodeDTO = new UpdateErpCodeDTO();
            EntityEnum entityEnum = EntityEnum.findValue((String)data.get("entityName"));
            if (entityEnum == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801089);
            }
            updateErpCodeDTO.setTableName(entityEnum.getTableName());
            updateErpCodeDTO.setYTenantId(yhtTenantid);
            updateErpCodeDTO.setColumnName(entityEnum.getColumnName());
            updateErpCodeDTO.setSourceErpCode((String)data.get("sourceerpcode"));
            updateErpCodeDTO.setTargetErpCode((String)data.get("targeterpcode"));
            updateErpCodeDTOList.add(updateErpCodeDTO);
        });
        SqlHelper.update((String)"com.yonyoucloud.upc.mapper.common.updateErpCode", updateErpCodeDTOList);
    }

    private Long changeId(String yhtTenantId) {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.setPartitionable(false);
        if (StringUtils.isBlank((CharSequence)yhtTenantId)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801050);
        }
        querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenantCenter").eq((Object)yhtTenantId)}));
        Map stringObjectMap = new HashMap();
        try {
            stringObjectMap = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)querySchema);
        }
        catch (Exception e) {
            this.logger.error("\u67e5\u8be2\u6570\u636e\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        Long tenanttId = null;
        if (stringObjectMap == null || stringObjectMap.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801050);
        }
        tenanttId = (Long)stringObjectMap.get("id");
        return tenanttId;
    }
}

