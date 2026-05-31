/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.customerdoc.service.itf.ICustomerDocDefApiService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum
 *  com.yonyoucloud.upc.pc.userdef.Userdefine
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.customerdoc.service.itf.ICustomerDocDefApiService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.userdefine.UserdefineUtils;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.pc.userdef.UserDefineTypeEnum;
import com.yonyoucloud.upc.pc.userdef.Userdefine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="userdefineApiSaveRule")
public class UserdefineApiSaveRule
extends AbstractCommonRule {
    @Autowired
    ICustomerDocDefApiService customerDocDefApiService;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        String billNum = billDataDto.getBillnum();
        UserDefineClass udc = (UserDefineClass)bills.get(0);
        if (!billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum()) || !udc.containsKey((Object)"_fromApi") || !((Boolean)udc.get("_fromApi")).booleanValue()) return new RuleExecuteResult();
        if (udc.getEntityStatus().equals((Object)EntityStatus.Insert)) {
            if (UserDefineTypeEnum.CustArchive.getName().equals(udc.getType())) {
                udc.setAchiveDomain("ucfbasedoc");
                if (udc.getAchiveDefineCode() == null || udc.getAchiveDefineCode().isEmpty()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CUSTOM_CODE_NOT_NULL);
                }
                Map achiveDefine = this.customerDocDefApiService.queryByDocDefCodeOrDocDefId(null, udc.getAchiveDefineCode());
                if (CollectionUtils.isEmpty((Map)achiveDefine)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CUSTOM_CODE_NOT_EXISTS, new Object[]{udc.getAchiveDefineCode()});
                }
                udc.setAchiveDefineName(achiveDefine.get("name").toString());
                if (udc.getAchiveReturn() == null) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CUSTOM_RETURN_CODE_NOT_NULL);
                List<Map<String, Object>> refRetList = UserdefineUtils.getInstance().getRefRetList(udc.getAchiveDomain(), null, udc.getType());
                for (Map<String, Object> refRet : refRetList) {
                    if (!udc.getAchiveReturn().equals(refRet.get("cName").toString())) continue;
                    udc.setAchiveReturnCaption(refRet.get("cShowCaption").toString());
                }
                if (udc.getAchiveReturnCaption() != null) return new RuleExecuteResult();
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_CUSTOM_RETURN_CODE_ERROR);
            }
            if (UserDefineTypeEnum.Archive.getName().equals(udc.getType())) return new RuleExecuteResult();
            if (!UserDefineTypeEnum.ReferArchive.getName().equals(udc.getType())) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_SPEC_TYPE_ERROR);
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_IMPORT_API_NOT_SUPPORT_BASIC_TYPE);
        }
        if (!udc.getEntityStatus().equals((Object)EntityStatus.Update)) return new RuleExecuteResult();
        QueryCondition queryCondition = QueryCondition.name((String)"specification").eq(udc.getId());
        QuerySchema querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryCondition}));
        List tplIds = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)querySchema);
        if (UserDefineTypeEnum.CustArchive.getName().equals(udc.getType())) {
            if (!tplIds.isEmpty()) {
                querySchema = QuerySchema.create().addSelect("id,showItem,type,isEnabled,isShowSpec,achiveDefineCode,achiveReturn").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(udc.getId())}));
                Map productSpec = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
                boolean isChanget = false;
                if (!udc.getType().equals(productSpec.get("type"))) {
                    isChanget = true;
                }
                if (!udc.getIsShowSpec().equals(productSpec.get("isShowSpec"))) {
                    isChanget = true;
                }
                if (udc.getAchiveDefineCode() != null && !udc.getAchiveDefineCode().equals(productSpec.get("achiveDefineCode"))) {
                    isChanget = true;
                }
                if (udc.getAchiveReturn() != null && !udc.getAchiveReturn().equals(productSpec.get("achiveReturn"))) {
                    isChanget = true;
                }
                if (!isChanget) return new RuleExecuteResult();
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_IS_REFERENCE);
            }
            if (udc.getAchiveDefineCode() != null) {
                Map achiveDefine = this.customerDocDefApiService.queryByDocDefCodeOrDocDefId(null, udc.getAchiveDefineCode());
                if (CollectionUtils.isEmpty((Map)achiveDefine)) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CUSTOM_CODE_NOT_EXISTS, new Object[]{udc.getAchiveDefineCode()});
                udc.setAchiveDefineName(achiveDefine.get("name").toString());
            }
            if (udc.getAchiveReturn() == null) return new RuleExecuteResult();
            List<Map<String, Object>> refRetList = UserdefineUtils.getInstance().getRefRetList(udc.getAchiveDomain(), null, udc.getType());
            for (Map<String, Object> map : refRetList) {
                if (!udc.getAchiveReturn().equals(map.get("cName").toString())) continue;
                udc.setAchiveReturnCaption(map.get("cShowCaption").toString());
            }
            if (udc.getAchiveReturnCaption() != null) return new RuleExecuteResult();
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CUSTOM_RETURN_CODE_ERROR);
        }
        if (UserDefineTypeEnum.Archive.getName().equals(udc.getType())) {
            void var12_23;
            if (tplIds.isEmpty()) return new RuleExecuteResult();
            querySchema = QuerySchema.create().addSelect("id,showItem,type,isEnabled,isShowSpec").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(udc.getId())}));
            Map productSpec = MetaDaoHelper.queryOne((String)"pc.userdef.UserDefineClass", (QuerySchema)querySchema);
            boolean isChanget = false;
            ArrayList arrayList = new ArrayList();
            if (udc.get("userdefinespecs") != null) {
                List list = udc.getBizObjects("userdefinespecs", Userdefine.class);
            }
            if (!var12_23.isEmpty()) {
                for (Userdefine userdefine : var12_23) {
                    if (!userdefine.getEntityStatus().equals((Object)EntityStatus.Update) && !userdefine.getEntityStatus().equals((Object)EntityStatus.Delete)) continue;
                    QuerySchema schema = QuerySchema.create().addSelect("id,name,isEnabled").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(userdefine.getId())}));
                    Map userdefineOld = MetaDaoHelper.queryOne((String)"pc.userdef.Userdefine", (QuerySchema)schema);
                    schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"specification").eq(udc.getId()), QueryCondition.name((String)"specitem").eq(userdefineOld.get("name"))}));
                    List producttpls = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)schema);
                    if (producttpls == null || producttpls.size() <= 0) continue;
                    if (userdefine.getEntityStatus().equals((Object)EntityStatus.Delete)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_VALUE_IS_REFERENCE);
                    }
                    if (userdefine.getName().equals(userdefineOld.get("name").toString()) || !userdefine.getEntityStatus().equals((Object)EntityStatus.Update)) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_VALUE_IS_REFERENCE_CANNOT_UPDATE_NAME);
                }
            }
            if (!udc.getType().equals(productSpec.get("type"))) {
                isChanget = true;
            }
            if (!udc.getIsShowSpec().equals(productSpec.get("isShowSpec"))) {
                isChanget = true;
            }
            if (!isChanget) return new RuleExecuteResult();
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SPEC_IS_REFERENCE);
        }
        if (!UserDefineTypeEnum.ReferArchive.getName().equals(udc.getType())) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_SPEC_TYPE_ERROR);
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_API_UPDATE_NOT_SUPPORT_BASIC_TYPE);
    }
}

