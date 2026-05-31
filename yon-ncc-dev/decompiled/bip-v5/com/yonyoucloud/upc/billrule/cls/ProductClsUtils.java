/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;

public class ProductClsUtils {
    public static final String CODE_SORTED_KEY = "code";
    public static final String MANAGEMENT_CLASS_CODE_SORTED_KEY = "managementClass_Code";
    private static ProductClsUtils productClsUtils = new ProductClsUtils();

    private ProductClsUtils() {
        if (productClsUtils != null) {
            throw new RuntimeException("ProductClsUtils is singleton, do not use reflect");
        }
    }

    public static ProductClsUtils getInstance() {
        return productClsUtils;
    }

    private Object readResolve() {
        return productClsUtils;
    }

    public List<Long> getNodeWithChildren(Long id, String fullname) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"path").like((Object)String.format("%s|", id))});
        List data = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        return data.stream().map(m -> (Long)m.get("id")).collect(Collectors.toList());
    }

    public void setParentData(BillContext billContext, BillDataDto billDataDto, BizObject bizObject) throws Exception {
        List rows = MetaDaoHelper.queryById((String)billContext.getFullname(), (String)"*", (Object)billDataDto.getId());
        if (rows != null && rows.size() > 0) {
            Map parent = (Map)rows.get(0);
            bizObject.put("parent", parent.get("id"));
            bizObject.put("parent_name", parent.get("name"));
        }
    }

    public void sortTree(List<Map> data, String sortedKey) {
        List sorted = data.stream().sorted((a, b) -> {
            int result = Integer.compare(a.get("order") == null ? 0 : (Integer)a.get("order"), b.get("order") == null ? 0 : (Integer)b.get("order"));
            if (result == 0) {
                result = StringUtils.compare((String)((String)a.get(sortedKey)), (String)((String)b.get(sortedKey)));
            }
            return result;
        }).collect(Collectors.toList());
        data.clear();
        data.addAll(sorted);
        data.forEach(map -> {
            if (map.containsKey("children")) {
                List children = (List)map.get("children");
                this.sortTree(children, sortedKey);
            }
        });
    }
}

