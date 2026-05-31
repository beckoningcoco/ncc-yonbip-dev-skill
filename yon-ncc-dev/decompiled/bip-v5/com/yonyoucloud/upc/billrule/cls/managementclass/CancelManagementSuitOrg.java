/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.imeta.orm.base.BizObject
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
package com.yonyoucloud.upc.billrule.cls.managementclass;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassMethodDTO;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.ProductClsService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="cancelManagementSuitOrg")
public class CancelManagementSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CancelManagementSuitOrg.class);
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    private ProductClsService productClsService;
    @Autowired
    GroupService groupService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        ArrayList<String> messagesList = new ArrayList<String>();
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
        }
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        if (UserType.TenantAdmin != user.getUserType() && UserType.TenantEmployee != user.getUserType()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_SALE_BY_NOT_CURRENT_ORG, new Object[]{user.getName()});
        }
        for (BizObject data : bills) {
            List orgIds;
            if (!data.containsKey((Object)"orgIds") || data.get("orgIds") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ORG_IS_NULL);
            }
            if (!data.containsKey((Object)"clsId") || data.get("clsId") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PRODUCT_IS_NULL);
            }
            Long clsId = Long.valueOf((String)data.get("clsId"));
            List<String> notDelteOrgId = this.cancelManagementSuitOrg(clsId, orgIds = (List)data.get("orgIds"));
            if (CollectionUtils.isEmpty(notDelteOrgId)) continue;
            StringBuilder orgMsg = new StringBuilder();
            List orgs = this.orgUnitQueryService.getByCondition((String)AppContext.getYTenantId(), ConditionDTO.newCondition().andIdIn(notDelteOrgId));
            for (OrgUnitDTO org : orgs) {
                orgMsg.append(org.getName()).append("\u3001");
            }
            messagesList.add(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E0A4F9E05C00005", (String)"\u7269\u6599\u5206\u7c7b\u3010%s\u3011\u7684\u7ec4\u7ec7\u7ea7\u6570\u636e\u5b58\u5728\u5f15\u7528\uff0c\u65e0\u6cd5\u5bf9\u8fd9\u4e9b\u7ec4\u7ec7\u7684\u6570\u636e\u53d6\u6d88\u5206\u914d\uff0c\u5bf9\u5e94\u7ec4\u7ec7\u4e3a\u3010%s\u3011"), data.get("cls_name").toString(), orgMsg.substring(0, orgMsg.toString().length() - 1)));
        }
        if (!CollectionUtils.isEmpty(messagesList)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < messagesList.size(); ++i) {
                stringBuilder.append(messagesList.get(i).toString());
            }
            throw new CoreDocBusinessException(stringBuilder.toString());
        }
        return new RuleExecuteResult();
    }

    private List<String> cancelManagementSuitOrg(Long clsId, List<String> orgIds) throws Exception {
        ArrayList<String> canNotDeleteOrgList = new ArrayList<String>();
        ManagementClassMethodDTO managementClassMethodDTO = new ManagementClassMethodDTO();
        managementClassMethodDTO.setId(clsId);
        managementClassMethodDTO.setOrgIds(orgIds);
        Set<String> orgIdSet = this.productClsService.checkManagementOrg(managementClassMethodDTO);
        for (String orgId : orgIds) {
            if (!orgIdSet.contains(orgId)) continue;
            canNotDeleteOrgList.add(orgId);
        }
        QueryConditionGroup managementClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)clsId), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
        QuerySchema managementClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)managementClassRangeGroupCondition);
        List originalManagementClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)managementClassRangeGroupSchema);
        if (null == originalManagementClassApplyRangeGroupList || originalManagementClassApplyRangeGroupList.size() == 0) {
            return orgIds;
        }
        ManagementClassApplyRangeGroup managementClassApplyRangeGroup = (ManagementClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalManagementClassApplyRangeGroupList.get(0)), ManagementClassApplyRangeGroup.class);
        QuerySchema originalManagementClassApplyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)managementClassApplyRangeGroup.getOrgGroupId())}));
        List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)originalManagementClassApplyRangeGroupDetailSchema);
        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
        for (Map originalPubOrgGroupDetailMap : originalPubOrgGroupDetailMapList) {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setId(originalPubOrgGroupDetailMap.get("id"));
            pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId") == null ? null : originalPubOrgGroupDetailMap.get("orgId").toString());
            pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? null : originalPubOrgGroupDetailMap.get("groupId").toString());
            pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? null : originalPubOrgGroupDetailMap.get("orgType").toString());
            newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
        }
        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapListTemp = new ArrayList<PubOrgGroupDetail>();
        HashSet<String> set = new HashSet<String>(orgIds);
        QueryConditionGroup managementClassCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)clsId)});
        QuerySchema managementClassSchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)managementClassCondition);
        Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)managementClassSchema);
        if (queryOrgId != null && queryOrgId.get("orgId") != null) {
            set.remove(queryOrgId.get("orgId").toString());
        }
        for (PubOrgGroupDetail strings : newPubOrgGroupDetailMapList) {
            if (!orgIdSet.contains(strings.get("orgId").toString()) && set.contains(strings.getOrgId())) continue;
            newPubOrgGroupDetailMapListTemp.add(strings);
        }
        newPubOrgGroupDetailMapList = newPubOrgGroupDetailMapListTemp;
        for (PubOrgGroupDetail orgGroupDetail : newPubOrgGroupDetailMapList) {
            orgGroupDetail.remove("id");
        }
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenantid", AppContext.getCurrentUser().getYTenantId());
        params.put("groupId", groupId);
        params.put("clsId", clsId);
        SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateGroupIdByClsIdAndTenantId", params);
        SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateManageMentGroupIdByClsId", params);
        return canNotDeleteOrgList;
    }
}

