/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ProductClass
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.ProductClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="productClassMoveRule")
public class ProductClassMoveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        try {
            Map node = (Map)MetaDaoHelper.queryById((String)billContext.getFullname(), (String)"*", (Object)billDataDto.getId()).get(0);
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "order", "code", "parent"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"parent").eq(node.get("parent")), QueryCondition.name((String)"level").eq(node.get("level"))}));
            List nodes = MetaDaoHelper.query((String)billContext.getFullname(), (QuerySchema)schema);
            nodes = nodes.stream().sorted((a, b) -> {
                int result = Integer.compare(a.get("order") == null ? 0 : (Integer)a.get("order"), b.get("order") == null ? 0 : (Integer)b.get("order"));
                if (result == 0) {
                    result = StringUtils.compare((String)((String)a.get("code")), (String)((String)b.get("code")));
                }
                return result;
            }).collect(Collectors.toList());
            node = nodes.stream().filter(n -> (Long)n.get("id") == Long.parseLong(billDataDto.getId())).findFirst().get();
            int index = nodes.indexOf(node);
            Map other = null;
            if ("moveup".equals(billDataDto.getAction()) && index > 0) {
                other = (Map)nodes.get(index - 1);
            } else if ("movedown".equals(billDataDto.getAction()) && index < nodes.size() - 1) {
                other = (Map)nodes.get(index + 1);
            }
            if (other != null) {
                ArrayList<ProductClass> bizs = new ArrayList<ProductClass>();
                Object order = node.get("order");
                node.put("order", other.get("order"));
                other.put("order", order);
                ProductClass biz = new ProductClass();
                biz.init(node);
                biz.setEntityStatus(EntityStatus.Update);
                bizs.add(biz);
                biz = new ProductClass();
                biz.init(other);
                biz.setEntityStatus(EntityStatus.Update);
                bizs.add(biz);
                MetaDaoHelper.update((String)billContext.getFullname(), bizs);
            }
        }
        catch (Exception ex) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800185);
        }
        return new RuleExecuteResult();
    }
}

