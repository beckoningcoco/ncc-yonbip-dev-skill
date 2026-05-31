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
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
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
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.service.UPCUserCenterService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="syncMerchantToYhtRule")
public class SyncMerchantToYhtRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SyncMerchantToYhtRule.class);
    @Autowired
    private UPCUserCenterService upcUserCenterService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        try {
            if (null == billContext || billDataDto == null) {
                return new RuleExecuteResult();
            }
            List bills = this.getBills(billContext, map);
            for (BizObject bill : bills) {
                List contactersListMap;
                String datfroms;
                List<String> datfromsList;
                Merchant merchant = (Merchant)bill;
                if (MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature") && merchant.getEnterpriseNature().getValue() == 1) {
                    return new RuleExecuteResult();
                }
                log.info("====> syncMerchantToYhtRule-entityStatus() " + (merchant.getEntityStatus() == EntityStatus.Unchanged));
                if (merchant.getEntityStatus() == EntityStatus.Unchanged) {
                    merchant.put("_status", (Object)"Update");
                    merchant.put("entityStatus", (Object)"Update");
                }
                if (merchant.getYhttenant() != null) continue;
                HashMap<String, String> paramsMap = new HashMap<String, String>();
                List contacterList = merchant.merchantContacterInfos();
                String enterId = "";
                if (CollectionUtils.isEmpty((Collection)contacterList)) continue;
                Optional<Contacter> contact = contacterList.parallelStream().filter(contacter -> contacter.getIsDefault() == true).findFirst();
                if (contact.isPresent()) {
                    paramsMap.put("contactName", contact.get().getFullName());
                    paramsMap.put("contactMobile", contact.get().getMobile());
                } else {
                    paramsMap.put("contactName", merchant.getContactName());
                    paramsMap.put("contactMobile", merchant.getContactTel());
                }
                log.info("=====> data_from:" + merchant.get("data_from"));
                if (merchant.get("data_from") == null || CollectionUtils.isEmpty(datfromsList = Arrays.asList(StringUtils.split((String)(StringUtils.isEmpty((Object)(datfroms = (String)AppContext.getAppConfig().get("data_from"))) ? "" : datfroms), (String)","))) || !datfromsList.contains(merchant.get("data_from"))) continue;
                ArrayList<Contacter> yhtUserIdContacterList = new ArrayList<Contacter>();
                for (Contacter contacter2 : contacterList) {
                    log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408027B", (String)"=====> \u5165\u53c2 isCreatorYhtUserType:") + contacter2.get("isCreatorYhtUserType") + " | " + contacter2.toString());
                    if (contacter2.get("isCreatorYhtUserType") == null || (Short)contacter2.get("isCreatorYhtUserType") != 1) continue;
                    yhtUserIdContacterList.add(contacter2);
                }
                String contacterStr = this.addYthUserIdentitiese(yhtUserIdContacterList);
                log.info("=====> contacterStr:" + contacterStr);
                if (StringUtils.isEmpty((Object)contacterStr) || CollectionUtils.isEmpty((Collection)(contactersListMap = (List)JSON.parseObject((String)contacterStr, List.class)))) continue;
                ArrayList contactersList = new ArrayList();
                contactersListMap.forEach(contacterMap -> {
                    String[] str;
                    String customerIds = (String)contacterMap.get("customerId");
                    for (String conStr : str = SyncMerchantToYhtRule.dealContacts(customerIds)) {
                        Contacter contacter = new Contacter();
                        contacter.setId((Object)Long.valueOf(conStr));
                        contacter.setYhtUserId((String)contacterMap.get("yhtUserId"));
                        contacter.setEntityStatus(EntityStatus.Update);
                        contactersList.add(contacter);
                        for (Contacter con : contacterList) {
                            if (con.getId().equals(Long.valueOf(conStr))) {
                                con.setYhtUserId((String)contacterMap.get("yhtUserId"));
                            }
                            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408027E", (String)"\u51fa\u53c2\uff1acon.getYhtUserId():") + con.getYhtUserId() + " con:" + con.toString());
                        }
                    }
                });
                log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080280", (String)"\u56de\u586b\u5ba2\u6237\u8054\u7cfb\u4eba\u7684ythuserid\u5f00\u59cb{}"), contactersList);
                MetaDaoHelper.update((String)"aa.merchant.Contacter", contactersList);
            }
        }
        catch (Exception e) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408027F", (String)"\u5ba2\u6237\u540c\u6b65\u53cb\u4e92\u901a\u5931\u8d25,\u539f\u56e0:{}"), (Throwable)e);
        }
        return new RuleExecuteResult();
    }

    private String addYthUserIdentitiese(List<Contacter> contacterList) {
        if (CollectionUtils.isEmpty(contacterList)) {
            return null;
        }
        String userJson = null;
        userJson = this.transferObject(contacterList);
        log.info("requestparams:{}", (Object)userJson);
        return this.upcUserCenterService.addUsersAndIdentity(AppContext.getCurrentUser().getYhtTenantId(), "diwork", 3, userJson);
    }

    private String transferObject(List<Contacter> bizObjects) {
        ArrayList resultMap = new ArrayList();
        HashMap usersMap = null;
        bizObjects.forEach(bizObject -> {
            HashMap<String, Object> userMap = new HashMap<String, Object>();
            userMap.put("userEmail", bizObject.getEmail());
            userMap.put("userMobile", bizObject.getMobile());
            userMap.put("userName", MultilangUtil.getAttr((String)"aa.merchant.Contacter", (String)"fullName", (BizObject)bizObject, null));
            userMap.put("vendorId", bizObject.getMerchantId().toString());
            userMap.put("customId", bizObject.getId().toString());
            resultMap.add(userMap);
            log.info("=====> userMap " + userMap.get("vendorId") + "  customId: " + userMap.get("customId"));
        });
        if (CollectionUtils.isEmpty(resultMap)) {
            return null;
        }
        usersMap = new HashMap();
        usersMap.put("users", resultMap);
        return JSON.toJSONString(usersMap);
    }

    private static String[] dealContacts(String str) {
        if (org.apache.commons.lang3.StringUtils.isNotBlank((CharSequence)str) && str.contains(",")) {
            return str.split(",");
        }
        return new String[]{str};
    }
}

