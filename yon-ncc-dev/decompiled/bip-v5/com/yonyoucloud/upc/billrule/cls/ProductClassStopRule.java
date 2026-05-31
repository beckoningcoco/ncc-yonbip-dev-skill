/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.PresentationClass
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.PresentationClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productClassStopRule")
public class ProductClassStopRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        Object data;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String billnum = billContext.getBillnum();
        String errorMessage = "";
        if ("pc_managementclass".equalsIgnoreCase(billnum)) {
            data = billDataDto.getData();
            List clss = new ArrayList<ManagementClass>();
            if (data instanceof Map) {
                clss.add((ManagementClass)data);
            }
            if (data instanceof List) {
                clss = (List)data;
            }
            if (!CollectionUtils.isEmpty(clss)) {
                for (ManagementClass cls : clss) {
                    boolean status = this.checkParentAndChildStopStatus((Map<String, Object>)cls);
                    if (status) {
                        errorMessage = String.format("%s%s", errorMessage, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080140", (String)"\u5f53\u524d\u5206\u7c7b\u6216\u8005\u4e0b\u7ea7\u5206\u7c7b\u5b58\u5728\u542f\u7528\u7684\u7269\u6599\uff0c\u4e0d\u80fd\u505c\u7528\uff01\u5206\u7c7bid\uff1a%s"), cls.get("id").toString()));
                        continue;
                    }
                    HashMap<String, Object> paramMap = new HashMap<String, Object>(2);
                    paramMap.put("id", cls.getId());
                    paramMap.put("table", "product_management_class");
                    paramMap.put("ytenantId", AppContext.getYTenantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateChildStopStatus", paramMap);
                }
            }
        }
        if ("pc_presentationclass".equalsIgnoreCase(billnum)) {
            data = billDataDto.getData();
            PresentationClass cls = null;
            if (data instanceof Map) {
                cls = (PresentationClass)data;
            } else if (data instanceof List) {
                List l = (List)data;
                cls = (PresentationClass)l.get(0);
            } else {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_DATA_TYPE_ERROR);
            }
            HashMap<String, Object> paramMap = new HashMap<String, Object>(2);
            paramMap.put("id", cls.getId());
            paramMap.put("table", "product_presentation_class");
            paramMap.put("ytenantId", AppContext.getYTenantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateChildStopStatus", paramMap);
        }
        if ("".equals(errorMessage)) {
            return new RuleExecuteResult();
        }
        return new RuleExecuteResult(0, errorMessage);
    }

    private boolean checkParentAndChildStopStatus(Map<String, Object> cls) throws Exception {
        if (cls != null && cls.get("id") != null) {
            List<Map<String, Object>> children;
            boolean status = this.checkStatus(cls);
            if (status) {
                return true;
            }
            if (!status && (children = this.getChildren(cls)) != null && children.size() > 0) {
                for (Map<String, Object> child : children) {
                    boolean type = this.checkParentAndChildStopStatus(child);
                    if (!type) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private List<Map<String, Object>> getChildren(Map<String, Object> cls) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq(cls.get("id"))}));
        return MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)schema);
    }

    private boolean checkStatus(Map<String, Object> cls) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"manageClass").eq(cls.get("id")), QueryCondition.name((String)"detail.stopstatus").eq((Object)false)}));
        List query = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        return query != null && query.size() > 0;
    }
}

