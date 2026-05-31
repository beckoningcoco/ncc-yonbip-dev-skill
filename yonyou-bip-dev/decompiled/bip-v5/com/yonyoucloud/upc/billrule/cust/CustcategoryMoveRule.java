/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.permission.util.AuthSdkFacadeUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto
 *  com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.permission.util.AuthSdkFacadeUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.uretail.sys.auth.DataPermissionRequestDto;
import com.yonyoucloud.uretail.sys.auth.DataPermissionResponseDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="custcategoryMoveRule")
public class CustcategoryMoveRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustcategoryMoveRule.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        try {
            ArrayList<CustCategory> bizs;
            List<String> ids;
            Map node = (Map)MetaDaoHelper.queryById((String)billContext.getFullname(), (String)"*", (Object)billDataDto.getId()).get(0);
            QueryConditionGroup conditionGroup = new QueryConditionGroup();
            conditionGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"parent").eq(node.get("parent")), QueryCondition.name((String)"level").eq(node.get("level"))});
            if (!this.upcControlRuleService.checkSingleOrg().booleanValue() && billDataDto.getOrgId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"custCategoryApplyRanges.orgId").eq(billDataDto.getOrgId()));
            }
            if (!CollectionUtils.isEmpty(ids = this.getDataPermission())) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in(ids));
            }
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "order", "code", "parent"}).addCondition((ConditionExpression)conditionGroup);
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
            for (Map handelnode : nodes) {
                if (handelnode.get("order") != null) continue;
                handelnode.put("order", 0);
            }
            node = (Map)nodes.get(index);
            Map other = null;
            if ("moveup".equals(billDataDto.getAction()) && index > 0) {
                other = (Map)nodes.get(index - 1);
                if (((Integer)other.get("order")).equals((Integer)node.get("order"))) {
                    bizs = new ArrayList<CustCategory>();
                    for (int i = index + 1; i < nodes.size(); ++i) {
                        if (nodes.get(i) == null) continue;
                        CustCategory biz = new CustCategory();
                        Map otherNode = (Map)nodes.get(i);
                        int order = (Integer)otherNode.get("order");
                        otherNode.put("order", order + 1);
                        biz.init(otherNode);
                        biz.setEntityStatus(EntityStatus.Update);
                        bizs.add(biz);
                    }
                    CustCategory biz = new CustCategory();
                    int order = (Integer)other.get("order");
                    other.put("order", order + 1);
                    biz.init(other);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    MetaDaoHelper.update((String)billContext.getFullname(), bizs);
                } else if (other != null) {
                    bizs = new ArrayList();
                    Object order = node.get("order");
                    node.put("order", other.get("order"));
                    other.put("order", order);
                    CustCategory biz = new CustCategory();
                    biz.init(node);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    biz = new CustCategory();
                    biz.init(other);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    if (bizs.size() > 500) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800481);
                    }
                    MetaDaoHelper.update((String)billContext.getFullname(), bizs);
                }
            } else if ("movedown".equals(billDataDto.getAction()) && index < nodes.size() - 1) {
                other = (Map)nodes.get(index + 1);
                if (((Integer)other.get("order")).equals((Integer)node.get("order"))) {
                    bizs = new ArrayList();
                    for (int i = index + 2; i < nodes.size(); ++i) {
                        if (nodes.get(i) == null) continue;
                        CustCategory biz = new CustCategory();
                        Map otherNode = (Map)nodes.get(i);
                        int order = (Integer)otherNode.get("order");
                        otherNode.put("order", order + 1);
                        biz.init(otherNode);
                        biz.setEntityStatus(EntityStatus.Update);
                        bizs.add(biz);
                    }
                    CustCategory biz = new CustCategory();
                    int order = (Integer)node.get("order");
                    node.put("order", order + 1);
                    biz.init(node);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    if (bizs.size() > 500) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800481);
                    }
                    MetaDaoHelper.update((String)billContext.getFullname(), bizs);
                } else if (other != null) {
                    bizs = new ArrayList();
                    Object order = node.get("order");
                    node.put("order", other.get("order"));
                    other.put("order", order);
                    CustCategory biz = new CustCategory();
                    biz.init(node);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    biz = new CustCategory();
                    biz.init(other);
                    biz.setEntityStatus(EntityStatus.Update);
                    bizs.add(biz);
                    MetaDaoHelper.update((String)billContext.getFullname(), bizs);
                }
            }
        }
        catch (Exception ex) {
            log.error(ex.getMessage(), (Throwable)ex);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800185);
        }
        return new RuleExecuteResult();
    }

    private List<String> getDataPermission() throws Exception {
        Map result;
        DataPermissionRequestDto requestDto = new DataPermissionRequestDto();
        requestDto.setEntityUri("aa.custcategory.CustCategory");
        requestDto.setSysCode(ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.custcategory.CustCategory"));
        String[] fieldArgs = new String[]{"id"};
        requestDto.setFieldNameArgs(fieldArgs);
        requestDto.setYxyUserId(AppContext.getUserId().toString());
        requestDto.setYxyTenantId(AppContext.getTenantId().toString());
        requestDto.setHaveDetail(true);
        DataPermissionResponseDto res = AuthSdkFacadeUtils.getUserDataPermission((DataPermissionRequestDto)requestDto);
        if (res != null && !CollectionUtils.isEmpty((Collection)res.getDataPermissionMapList()) && !CollectionUtils.isEmpty((Map)(result = (Map)res.getDataPermissionMapList().get(0))) && result.get("values") != null) {
            return (List)result.get("values");
        }
        return null;
    }
}

