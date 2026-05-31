/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.busidoc.utils.BDJacksonUtils
 *  com.yonyou.uap.billcode.service.IBillCodeValidate
 *  com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.exceptions.BusinessException
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.collections4.MapUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.billcode;

import com.yonyou.iuap.apdoc.coredoc.busidoc.utils.BDJacksonUtils;
import com.yonyou.uap.billcode.service.IBillCodeValidate;
import com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.exceptions.BusinessException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value="IBillCodeValidate")
public class BillCodeValidateImpl
implements IBillCodeValidate {
    private static final Logger logger = LoggerFactory.getLogger(BillCodeValidateImpl.class);
    private static final String GOODSPOSITION_FILLNAME = "aa.goodsposition.GoodsPosition";

    public boolean isDuplicate(String fullName, String columnName, String billCode, Map<String, Object> extendInfo) {
        if (GOODSPOSITION_FILLNAME.equals(fullName)) {
            return this.isDuplicateGoodsPosition(billCode, extendInfo);
        }
        Object bill = extendInfo.get("bill");
        BizObject billcopy = new BizObject();
        billcopy.init((Map)bill);
        return BillInfoUtils.isDuplicateByFullname((String)fullName, (String)columnName, (BizObject)billcopy);
    }

    public String checkDuplicateExtLockKey(String fullName, String columnName, String billCode, Map<String, Object> extendInfo) {
        if (GOODSPOSITION_FILLNAME.equals(fullName)) {
            BizObject bill = new BizObject();
            Map billMap = (Map)extendInfo.get("bill");
            bill.init(billMap);
            return bill.getString("warehouseId");
        }
        return super.checkDuplicateExtLockKey(fullName, columnName, billCode, extendInfo);
    }

    private boolean isDuplicateGoodsPosition(String billCode, Map<String, Object> extendInfo) {
        List query;
        BizObject bill = new BizObject();
        Map billMap = (Map)extendInfo.get("bill");
        bill.init(billMap);
        EntityStatus entityStatus = bill.getEntityStatus();
        String warehouseId = MapUtils.getString((Map)bill, (Object)"warehouseId");
        QuerySchema querySchema = QuerySchema.create().addSelect("id").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)billCode)}).appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"warehouseId").eq((Object)warehouseId)}).addPager(1, 1);
        if (EntityStatus.Update.equals((Object)entityStatus)) {
            querySchema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(bill.getId())});
        }
        try {
            query = MetaDaoHelper.query((String)GOODSPOSITION_FILLNAME, (QuerySchema)querySchema);
        }
        catch (Exception e) {
            logger.error("\u6267\u884c\u67e5\u8be2\u5f02\u5e38 fullName=[{}],schema=[{}]", new Object[]{GOODSPOSITION_FILLNAME, BDJacksonUtils.toJSONString((Object)querySchema), e});
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
        return !CollectionUtils.isEmpty((Collection)query);
    }
}

