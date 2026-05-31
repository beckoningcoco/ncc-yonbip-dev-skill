/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyMap
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.i18n.MessageUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyMap;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component(value="checkUniqueNewRule")
public class CheckUniqueNewRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CheckUniqueNewRule.class);
    BillCodeContext billCodeContext = null;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private BusinessPartnerService partnerService;
    public static final String MAPPER = "com.yonyoucloud.upc.data.checkunique.";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        if (null == billContext) {
            return new RuleExecuteResult();
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        List archiveList = this.getBills(billContext, paramMap);
        Boolean isImport = billDataDto.getAsyncKey() != null && billDataDto.getImportMode() != null && billDataDto.getImportType() != null;
        Boolean isApi = ((BizObject)archiveList.get(0)).get("_fromApi") != null && (Boolean)((BizObject)archiveList.get(0)).get("_fromApi") == true;
        String defaultLocale = MultiLangContext.getInstance().getDefaultLocaleCode();
        String locale = InvocationInfoProxy.getLocale();
        this.billCodeContext = this.billCodeComponentService.getBillCodeContext(billContext.getBillnum(), AppContext.getCurrentUser().getYhtTenantId(), "");
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("ytenant_id", AppContext.getYTenantId());
        param.put("billnum", billContext.getBillnum());
        List myUniqueConfig = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.checkunique.readUniqueConfig", param);
        myUniqueConfig.sort(Comparator.comparing(e -> e.get("constraint_type").toString()));
        HashMap<String, String> finalUnique = new HashMap<String, String>();
        for (int i = 0; i < myUniqueConfig.size(); ++i) {
            Map item = (Map)myUniqueConfig.get(i);
            if (item.get("field_name") != null && ((BizObject)archiveList.get(0)).get(item.get("field_name").toString()).toString().equals(item.get("field_value").toString())) {
                finalUnique.put(item.get("constraint_column").toString(), item.get("constraint_type").toString());
            }
            if (item.get("field_name") == null) {
                finalUnique.put(item.get("constraint_column").toString(), item.get("constraint_type").toString());
            }
            if (!"4".equals(item.get("constraint_type").toString())) continue;
            finalUnique.remove(item.get("constraint_column").toString());
        }
        PropertyMap propertyMap = BizContext.getMetaRepository().entity(billContext.getFullname()).attrMap();
        Integer billnumMode = this.billCodeContext.getBillnumMode();
        for (BizObject bill : archiveList) {
            for (String oneUnique : finalUnique.keySet()) {
                Map externalData;
                Object bizDocParamObj;
                ArrayList<QueryCondition> queryConditionList;
                String information;
                block24: {
                    String lockKey = "";
                    final String requestId = UUID.randomUUID().toString();
                    information = "";
                    String[] fieldList = oneUnique.split(",");
                    if (Arrays.asList(fieldList).contains("code") && billnumMode != 0) continue;
                    queryConditionList = new ArrayList<QueryCondition>();
                    for (int i = 0; i < fieldList.length; ++i) {
                        Property property = propertyMap.get(fieldList[i]);
                        if (property == null) {
                            information = information + fieldList[i] + ",";
                        } else if (!"dr".equals(fieldList[i]) && !"tenant".equals(fieldList[i])) {
                            String title = MessageUtils.getMessage((String)property.getResId());
                            title = "null".equals(title) ? property.title() : title;
                            information = information + title + ",";
                        }
                        Object fieldValue = bill.get(fieldList[i]);
                        lockKey = lockKey + (fieldValue == null ? "" : fieldValue.toString());
                        if (null == fieldValue) {
                            // empty if block
                        }
                        if ("tenant".equals(fieldList[i])) {
                            fieldValue = AppContext.getCurrentUser().getTenant();
                        }
                        if ("dr".equals(fieldList[i])) {
                            fieldValue = 0;
                        }
                        if ("name".equals(fieldList[i])) {
                            fieldValue = this.partnerService.mulLangObjectConvertString(bill.get(fieldList[i]), locale);
                        }
                        queryConditionList.add(QueryCondition.name((String)fieldList[i]).eq(fieldValue));
                    }
                    final String finalLockKey = lockKey;
                    try {
                        if (RedisTool.tryGetLock((String)finalLockKey, (String)requestId, (int)30)) {
                            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                                public void afterCompletion(int status) {
                                    RedisTool.releaseLock((String)finalLockKey, (String)requestId);
                                }
                            });
                            break block24;
                        }
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800323);
                    }
                    catch (IllegalStateException e2) {
                        log.info("warn : ", (Throwable)e2);
                    }
                    finally {
                        RedisTool.releaseLock((String)finalLockKey, (String)requestId);
                    }
                }
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])((ConditionExpression[])queryConditionList.toArray(new QueryCondition[0])));
                QuerySchema selectByUniqueField = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
                List oneRow = MetaDaoHelper.query((String)billContext.getFullname(), (QuerySchema)selectByUniqueField);
                if (oneRow == null || oneRow.size() != 1) continue;
                String fieldNameList = information.substring(0, information.length() - 1);
                String finalInfo = "";
                finalInfo = fieldNameList.contains(",") ? String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080893", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080893", (String)"%s\u7684\u7ec4\u5408\u4e0d\u80fd\u91cd\u590d")), fieldNameList) : String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080894", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080894", (String)"%s\u4e0d\u80fd\u91cd\u590d")), fieldNameList);
                Object externalDataObj = billDataDto.getExternalData();
                Boolean isBizDoc = false;
                Boolean isYql = false;
                if (externalDataObj instanceof Map && (bizDocParamObj = (externalData = (Map)externalDataObj).get("bizDocParam")) instanceof Map) {
                    Map bizDocParam = (Map)bizDocParamObj;
                    isBizDoc = bizDocParam.get("isBizDoc") != null && Boolean.parseBoolean(bizDocParam.get("isBizDoc").toString());
                    isYql = bizDocParam.get("isYql") != null && Boolean.parseBoolean(bizDocParam.get("isBizDoc").toString());
                }
                if (!(!isImport.booleanValue() && !isApi.booleanValue() || isBizDoc.booleanValue() && isYql.booleanValue())) {
                    if ("base_businesspartner".equals(billContext.getBillnum()) && "name,tenant,dr".equals(oneUnique)) continue;
                    if (((String)finalUnique.get(oneUnique)).toString().equals("3")) {
                        bill.set("id", ((Map)oneRow.get(0)).get("id"));
                        bill.setEntityStatus(EntityStatus.Update);
                        continue;
                    }
                    throw new CoreDocBusinessException(finalInfo);
                }
                if (EntityStatus.Insert == bill.getEntityStatus()) {
                    throw new CoreDocBusinessException(finalInfo);
                }
                if (EntityStatus.Update != bill.getEntityStatus() || bill.get("id").toString().equals(((Map)oneRow.get(0)).get("id").toString())) continue;
                throw new CoreDocBusinessException(finalInfo);
            }
        }
        return new RuleExecuteResult();
    }
}

