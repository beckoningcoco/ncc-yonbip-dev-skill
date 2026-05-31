/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.ref.service.IRefEvent
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.eventbean.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.ref.service.IRefEvent;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productAssistUnitRefRule")
public class ProductAssistUnitRefRule
implements IRefEvent {
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public void beforeTreeData(RefEntity refEntity, Map<String, Object> map) {
    }

    public void afterTreeData(RefEntity refEntity, Map<String, Object> map, Object o) {
    }

    public void beforeGridData(RefEntity refEntity, Map<String, Object> refpara) {
        try {
            HashMap mapConditionMap;
            if (!Objects.isNull(refpara) && refpara.containsKey("mapCondition") && !Objects.isNull(mapConditionMap = (HashMap)refpara.get("mapCondition")) && mapConditionMap.containsKey("productId")) {
                mapConditionMap.put("ytenant", AppContext.getYTenantId());
                if (null != refpara.get("likeValue")) {
                    mapConditionMap.put("code", refpara.get("likeValue"));
                    mapConditionMap.put("name", refpara.get("likeValue"));
                }
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("unitUseType");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(mapConditionMap.get("productId"))}));
                Map sqlDefine = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Map)sqlDefine) && sqlDefine.containsKey("unitUseType") && "2".equals(sqlDefine.get("unitUseType").toString())) {
                    refpara.put("unitUseType", sqlDefine.get("unitUseType"));
                }
            }
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.UNIT_REF_EVENT_BEAN_ERROR);
        }
    }

    public void afterGridData(RefEntity refEntity, Map<String, Object> map, Object o) {
        Pager pager = (Pager)o;
        List recordList = pager.getRecordList();
        if (!CollectionUtils.isEmpty((Collection)recordList)) {
            List<Object> assistUnitIds = recordList.stream().filter(Objects::nonNull).map(data -> data.get("assistUnit")).filter(Objects::nonNull).collect(Collectors.toList());
            Map<Long, String> unitNameMap = this.getUnitNameByIds(assistUnitIds);
            for (Map data2 : recordList) {
                if (null == data2.get("assistUnit")) continue;
                data2.put("assistUnit_Name", unitNameMap.get(Long.parseLong(data2.get("assistUnit").toString())));
            }
        }
    }

    private Map<Long, String> getUnitNameByIds(List<Object> unitIds) {
        QuerySchema schema = QuerySchema.create().addSelect("id, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(unitIds)}));
        List billDOList = this.billQueryRepository.queryBySchema("pc.unit.Unit", schema);
        HashMap<Long, String> unitNameMap = new HashMap<Long, String>();
        billDOList.forEach(unitPO -> unitNameMap.put(unitPO.getId(), MultiLangUtils.getLocalValue((Object)unitPO.getName().toMap())));
        return unitNameMap;
    }

    public void beforeGridMeta(RefEntity refEntity) {
    }

    public void afterGridMeta(RefEntity refEntity, Object o) {
    }
}

