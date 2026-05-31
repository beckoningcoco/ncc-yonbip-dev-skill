/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantRoleInfoDeleteRule")
public class MerchantRoleInfoDeleteRule
extends AbstractCommonRule {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                Object carryParams = bill.get("carryParams");
                Boolean isCreator = carryParams != null ? (Boolean)((Map)bill.get("carryParams")).get("isCreator") : (Boolean)bill.get("isCreator");
                if (!isCreator.booleanValue()) continue;
                QuerySchema querySchema1 = QuerySchema.create();
                querySchema1.addSelect("id,name");
                querySchema1.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"cust").eq(bill.getId()), QueryCondition.name((String)"org").eq(bill.getId())}));
                List warehouseList = this.billQueryRepository.queryMapBySchema("aa.warehouse.Warehouse", querySchema1);
                if (CollectionUtils.isEmpty((Collection)warehouseList)) continue;
                for (Map warehouse : warehouseList) {
                    warehouse.put("fromMerchantCall", true);
                }
                BillDataDto deleteDto = new BillDataDto();
                deleteDto.setData((Object)warehouseList);
                deleteDto.setBillnum("aa_warehouselist");
                RuleExecuteResult result = this.billService.executeUpdate("delete", deleteDto);
                if (result.getMsgCode() == 1) continue;
                throw new CoreDocBusinessException(result.getMessage());
            }
        }
        return new RuleExecuteResult();
    }
}

