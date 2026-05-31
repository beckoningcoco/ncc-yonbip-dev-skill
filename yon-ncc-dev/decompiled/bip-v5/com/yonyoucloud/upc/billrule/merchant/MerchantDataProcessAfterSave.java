/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
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

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantDataProcessAfterSave")
public class MerchantDataProcessAfterSave
extends AbstractCommonRule {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bizObject : bills) {
            String businessRole;
            Merchant merchant = (Merchant)bizObject;
            String userName = "";
            String mobile = "";
            String fullName = "";
            String email = "";
            if (merchant.merchantsManager() != null) {
                userName = merchant.merchantsManager().getUserName();
                mobile = merchant.merchantsManager().getMobile();
                fullName = merchant.merchantsManager().getFullName();
                email = merchant.merchantsManager().getEmail();
            }
            HashMap<String, Object> userMap = new HashMap<String, Object>();
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_user");
            if (!StringUtils.isBlank((CharSequence)userName)) {
                userMap.put("code", userName);
            }
            if (!StringUtils.isBlank((CharSequence)fullName)) {
                userMap.put("name", fullName);
            }
            if (!StringUtils.isBlank((CharSequence)mobile)) {
                userMap.put("mobile", mobile);
            }
            if (!StringUtils.isBlank((CharSequence)email)) {
                userMap.put("email", email);
            }
            if (!StringUtils.isBlank((CharSequence)(businessRole = (String)merchant.get("businessRole"))) && (businessRole.contains("2") || businessRole.contains("4") || businessRole.contains("6"))) {
                userMap.put("userType", UserType.ShopAdminUser.getValue());
                userMap.put("shop", merchant.getId());
                userMap.put("member_scope_level", 2);
                userMap.put("member_scope_id", merchant.getId());
                userMap.put("member_scope_name", merchant.getName());
            } else {
                userMap.put("cust", merchant.getId());
                userMap.put("userType", UserType.TenantShopuser.getValue());
            }
            userMap.put("registersource", 3);
            if (merchant.merchantsManager() != null && EntityStatus.Insert.equals((Object)merchant.merchantsManager().getEntityStatus())) {
                userMap.put("_status", "Insert");
            } else if (merchant.merchantsManager() != null && EntityStatus.Update.equals((Object)merchant.merchantsManager().getEntityStatus())) {
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.merchantsManager().getId())});
                QuerySchema schema = QuerySchema.create().addSelect("userName").addCondition((ConditionExpression)queryConditionGroup);
                List results = MetaDaoHelper.query((String)"aa.merchant.MerchantsManager", (QuerySchema)schema, null);
                if (!CollectionUtils.isEmpty((Collection)results) && results.get(0) != null) {
                    userMap.put("code", ((Map)results.get(0)).get("userName"));
                    QueryConditionGroup queryIdAndYxyUserID = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq(((Map)results.get(0)).get("userName"))});
                    QuerySchema schemaId = QuerySchema.create().addSelect("id,yxyUserId").addCondition((ConditionExpression)queryIdAndYxyUserID);
                    List resultsID = MetaDaoHelper.query((String)"base.user.User", (QuerySchema)schemaId, (String)"bip-usercenter");
                    if (!CollectionUtils.isEmpty((Collection)resultsID) && resultsID.get(0) != null) {
                        userMap.put("id", ((Map)resultsID.get(0)).get("id"));
                        userMap.put("yxyUserId", ((Map)resultsID.get(0)).get("yxyUserId"));
                        userMap.put("_status", "Update");
                    } else {
                        String businessRoleInfo;
                        QueryConditionGroup queryBusinessRole = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.merchantRole().getId())});
                        QuerySchema schemaBusinessRole = QuerySchema.create().addSelect("businessRole").addCondition((ConditionExpression)queryBusinessRole);
                        List resultsBusinessRoles = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)schemaBusinessRole, null);
                        if (!CollectionUtils.isEmpty((Collection)resultsBusinessRoles) && resultsBusinessRoles.get(0) != null && !StringUtils.isBlank((CharSequence)(businessRoleInfo = (String)((Map)resultsBusinessRoles.get(0)).get("businessRole"))) && (businessRoleInfo.contains("2") || businessRoleInfo.contains("4") || businessRoleInfo.contains("6"))) {
                            userMap.put("userType", UserType.ShopAdminUser.getValue());
                            userMap.put("shop", merchant.getId());
                            userMap.put("_status", "Insert");
                        }
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)userName) && StringUtils.isBlank((CharSequence)fullName) && StringUtils.isBlank((CharSequence)mobile) && StringUtils.isBlank((CharSequence)email)) continue;
            JSONObject jsonUserMap = new JSONObject(userMap);
            bill.setData((Object)jsonUserMap.toJSONString());
            this.billService.executeUpdate("save", bill);
        }
        return new RuleExecuteResult();
    }
}

