/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.MerchantStaff
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.MerchantStaff;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="syncUserTypeSaveRule")
public class SyncUserTypeSaveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SyncUserTypeSaveRule.class);
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        MerchantStaff merchantStaffRet = new MerchantStaff();
        for (BizObject bill : bills) {
            List merchantStaffs;
            QuerySchema querySchema;
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080614", (String)"\u4fdd\u5b58\u5458\u5de5\u8bf7\u6c42\u53c2\u6570:{}"), (Object)bill);
            if (!Boolean.valueOf(bill.get("outUser").toString()).booleanValue()) {
                return new RuleExecuteResult(paramMap);
            }
            if (!(MerchantUtils.isExists((Map)bill, (String)"id") || MerchantUtils.isExists((Map)bill, (String)"cPhone") || MerchantUtils.isExists((Map)bill, (String)"cEmail"))) {
                return new RuleExecuteResult((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080617", (String)"\u624b\u673a\u53f7\u90ae\u7bb1\u4e0d\u80fd\u540c\u65f6\u4e3a\u7a7a"));
            }
            MerchantStaff merchantStaff = new MerchantStaff();
            merchantStaff.setMerchantId((Long)bill.get("cust"));
            merchantStaff.setEntityStatus(bill.getEntityStatus());
            if (EntityStatus.Insert.equals((Object)merchantStaff.getEntityStatus())) {
                merchantStaff.setId((Object)IdManager.getInstance().nextId());
                querySchema = QuerySchema.create().addSelect("id");
                if (MerchantUtils.isExists((Map)bill, (String)"cPhone")) {
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("cust")), QueryCondition.name((String)"mobile").eq(bill.get("cPhone"))}));
                } else if (MerchantUtils.isExists((Map)bill, (String)"cEmail")) {
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("cust")), QueryCondition.name((String)"email").eq(bill.get("cEmail"))}));
                }
                merchantStaffs = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantStaff", (QuerySchema)querySchema, null);
                merchantStaff.setSource((String)bill.get("addOperatorSource"));
                merchantStaff.setFullName((String)bill.get("name"));
                merchantStaff.setMobile((String)bill.get("cPhone"));
                merchantStaff.setEmail((String)bill.get("cEmail"));
                merchantStaff.setRemarks((String)bill.get("cIntro"));
                merchantStaff.setCode((String)bill.get("code"));
                merchantStaff.setCHeadPicUrl((String)bill.get("cHeadPicUrl"));
                merchantStaff.setIPosition((String)bill.get("iPosition"));
                merchantStaff.setDEntryTime((Date)bill.get("dEntryTime"));
                merchantStaff.setDLeaveTime((Date)bill.get("dLeaveTime"));
                merchantStaff.setGender((Integer)bill.get("gender"));
                merchantStaff.put("countryCode", bill.get("countryCode"));
                String result = "";
                result = this.saveUserType(merchantStaff, "diwork", bill.get("userType").toString());
                if (StringUtils.isBlank((CharSequence)result)) {
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080613", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:%s"), result);
                    throw new CoreDocBusinessException(str);
                }
                List managerListMap = (List)JSON.parseObject((String)result, List.class);
                if (!CollectionUtils.isEmpty((Collection)managerListMap)) {
                    managerListMap.forEach(managerMap -> merchantStaff.setYhtUserId((String)managerMap.get("yhtUserId")));
                }
                QuerySchema querySchema1 = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("cust")), QueryCondition.name((String)"yhtUserId").eq((Object)merchantStaff.getYhtUserId())}));
                List merchantStaffs1 = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantStaff", (QuerySchema)querySchema1, null);
                if (!CollectionUtils.isEmpty((Collection)merchantStaffs) || !CollectionUtils.isEmpty((Collection)merchantStaffs1)) {
                    merchantStaff.set("id", !CollectionUtils.isEmpty((Collection)merchantStaffs) ? ((MerchantStaff)merchantStaffs.get(0)).get("id") : ((MerchantStaff)merchantStaffs1.get(0)).get("id"));
                    merchantStaff.setEntityStatus(EntityStatus.Update);
                    bill.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantStaff", (BizObject)merchantStaff);
                } else {
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantStaff", (BizObject)merchantStaff);
                }
            } else if (EntityStatus.Update.equals((Object)merchantStaff.getEntityStatus())) {
                querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("cust")), QueryCondition.name((String)"yhtUserId").eq(bill.get("yhtUserId"))}));
                merchantStaffs = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantStaff", (QuerySchema)querySchema, null);
                merchantStaff.setId((Object)Long.parseLong((String)bill.get("id")));
                if (!CollectionUtils.isEmpty((Collection)merchantStaffs) && !bill.get("id").equals(((MerchantStaff)merchantStaffs.get(0)).get("id").toString())) {
                    return new RuleExecuteResult();
                }
                BizObject infos = MetaDaoHelper.findById((String)"aa.merchant.MerchantStaff", (Object)Long.parseLong((String)bill.get("id")));
                if (bill.get("addOperatorSource") == null || bill.get("addOperatorSource").equals(infos.get("source"))) {
                    merchantStaff.setSource((String)infos.get("source"));
                } else {
                    merchantStaff.setSource((String)bill.get("addOperatorSource"));
                }
                if (bill.get("name") == null || bill.get("name").equals(infos.get("fullName"))) {
                    merchantStaff.setFullName((String)infos.get("fullName"));
                } else {
                    merchantStaff.setFullName((String)bill.get("name"));
                }
                if (bill.get("cPhone") == null || bill.get("cPhone").equals(infos.get("mobile"))) {
                    merchantStaff.setMobile((String)infos.get("mobile"));
                } else {
                    merchantStaff.setMobile((String)bill.get("cPhone"));
                }
                if (bill.get("cEmail") == null || bill.get("cEmail").equals(infos.get("email"))) {
                    merchantStaff.setEmail((String)infos.get("email"));
                } else {
                    merchantStaff.setEmail((String)bill.get("cEmail"));
                }
                if (bill.get("cIntro") == null || bill.get("cIntro").equals(infos.get("remarks"))) {
                    merchantStaff.setRemarks((String)infos.get("remarks"));
                } else {
                    merchantStaff.setRemarks((String)bill.get("cIntro"));
                }
                if (bill.get("code") == null || bill.get("code").equals(infos.get("code"))) {
                    merchantStaff.setCode((String)infos.get("code"));
                } else {
                    merchantStaff.setCode((String)bill.get("code"));
                }
                if (bill.get("cHeadPicUrl") == null || bill.get("cHeadPicUrl").equals(infos.get("cHeadPicUrl"))) {
                    merchantStaff.setCHeadPicUrl((String)infos.get("cHeadPicUrl"));
                } else {
                    merchantStaff.setCHeadPicUrl((String)bill.get("cHeadPicUrl"));
                }
                if (bill.get("iPosition") == null || bill.get("iPosition").equals(infos.get("iPosition"))) {
                    merchantStaff.setIPosition((String)infos.get("iPosition"));
                } else {
                    merchantStaff.setIPosition((String)bill.get("iPosition"));
                }
                if (bill.get("dEntryTime") == null || bill.get("dEntryTime").equals(infos.get("dEntryTime"))) {
                    merchantStaff.setDEntryTime((Date)infos.get("dEntryTime"));
                } else {
                    merchantStaff.setDEntryTime((Date)bill.get("dEntryTime"));
                }
                if (bill.get("dEntryTime") == null || bill.get("dEntryTime").equals(infos.get("dEntryTime"))) {
                    merchantStaff.setDEntryTime((Date)infos.get("dEntryTime"));
                } else {
                    merchantStaff.setDEntryTime((Date)bill.get("dEntryTime"));
                }
                if (bill.get("dLeaveTime") == null || bill.get("dLeaveTime").equals(infos.get("dLeaveTime"))) {
                    merchantStaff.setDLeaveTime((Date)infos.get("dLeaveTime"));
                } else {
                    merchantStaff.setDLeaveTime((Date)bill.get("dLeaveTime"));
                }
                if (bill.get("gender") == null || bill.get("gender").equals(infos.get("gender"))) {
                    merchantStaff.setGender((Integer)infos.get("gender"));
                } else {
                    merchantStaff.setGender((Integer)bill.get("gender"));
                }
                merchantStaff.put("countryCode", bill.get("countryCode"));
                if (!bill.get("cust").equals(infos.get("merchantId"))) {
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080616", (String)"syncUserTypeSaveRule\u5220\u9664\u5f00\u59cb:{}"), (Object)bill);
                    ArrayList<String> userIds = new ArrayList<String>(1);
                    userIds.add(bill.get("yhtUserId").toString());
                    this.iupcMerchantSyncService.deleteUserType(AppContext.getCurrentUser().getYhtTenantId(), "5", "diwork", userIds, bill.get("cust").toString());
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080619", (String)"syncUserTypeSaveRule\u5220\u9664\u7ed3\u675fUPCBillServic:{}"), (Object)bill);
                    String result = "";
                    result = this.saveUserType(merchantStaff, "diwork", bill.get("userType").toString());
                    if (StringUtils.isBlank((CharSequence)result)) {
                        String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080613", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:%s"), result);
                        throw new CoreDocBusinessException(str);
                    }
                    List managerListMap = (List)JSON.parseObject((String)result, List.class);
                    if (!CollectionUtils.isEmpty((Collection)managerListMap)) {
                        managerListMap.forEach(managerMap -> merchantStaff.setYhtUserId((String)managerMap.get("yhtUserId")));
                    }
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantStaff", (BizObject)merchantStaff);
            }
            HashMap<String, String> merchantStaffMap = new HashMap<String, String>();
            merchantStaffMap.put("merchantStaff", JSON.toJSONString((Object)merchantStaff));
            if (null == merchantStaff) continue;
            this.putParam(paramMap, "return", merchantStaffMap);
        }
        return new RuleExecuteResult(paramMap);
    }

    private String saveUserType(MerchantStaff merchantStaff, String resCode, String userType) throws Exception {
        ArrayList<MerchantStaff> bizList = new ArrayList<MerchantStaff>();
        bizList.add(merchantStaff);
        String result = "";
        try {
            result = this.iupcMerchantSyncService.saveUserType(bizList, resCode, Integer.valueOf(userType));
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408061A", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:{}") + e.getMessage(), (Throwable)e);
            String str = "".equals(result) ? String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080613", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:%s"), e) : String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080613", (String)"\u521b\u5efa\u53cb\u6237\u901a\u8eab\u4efd\u5f02\u5e38:%s"), result);
            throw new CoreDocBusinessException(str);
        }
        if (StringUtils.isBlank((CharSequence)result)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800374);
        }
        return result;
    }
}

