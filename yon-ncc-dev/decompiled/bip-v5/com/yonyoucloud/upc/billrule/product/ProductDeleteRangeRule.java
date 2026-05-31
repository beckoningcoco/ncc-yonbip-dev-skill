/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.deletelog.DocDeleteLogService;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeGroup;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productDeleteRangeRule")
public class ProductDeleteRangeRule
extends AbstractCommonRule {
    @Autowired
    GroupService groupService;
    @Autowired
    DocDeleteLogService docDeleteLogService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (bills == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL_T1);
        }
        for (BizObject bill : bills) {
            if (!bill.containsKey((Object)"id") || !bill.containsKey((Object)"productApplyRangeId")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_FORMAT_ERROR);
            }
            if (Boolean.valueOf(bill.get("isCreator").toString()).booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_CAN_NOT_DELETE_SELF_DATA, new Object[]{bill.get("code").toString()});
            }
            Map map = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("id, orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq(bill.get("productApplyRangeId"))})));
            if (!bill.containsKey((Object)"isCreator") || !bill.containsKey((Object)"isApplied")) {
                Map productApplyMap = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("isCreator, isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("productApplyRangeId"))})));
                bill.set("isCreator", productApplyMap.get("isCreator"));
                bill.set("isApplied", productApplyMap.get("isApplied"));
            }
            ProductApplyRange range = new ProductApplyRange();
            range.setId(bill.get("productApplyRangeId"));
            range.setProductId((Long)bill.get("id"));
            range.setEntityStatus(EntityStatus.Delete);
            this.docDeleteLogService.insertDeleteLog("pc.product.ProductApplyRange", bill.get("id").toString(), bill.get("productApplyRangeId").toString());
            MetaDaoHelper.update((String)"pc.product.ProductApplyRange", (BizObject)range);
            if (BooleanUtil.isTrue((Object)bill.get("isApplied").toString()) || !CollectionUtils.isEmpty((Map)map)) {
                ProductDetail productDetail = new ProductDetail();
                productDetail.setId(map.get("id"));
                productDetail.setEntityStatus(EntityStatus.Delete);
                MetaDaoHelper.update((String)"pc.product.ProductDetail", (BizObject)productDetail);
                Map ProductApplyRangeGroupMap = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productDetailId").eq(map.get("id")), QueryCondition.name((String)"productId").eq(bill.get("id"))})));
                if (ProductApplyRangeGroupMap == null) continue;
                ProductApplyRangeGroup productApplyRangeGroup = new ProductApplyRangeGroup();
                productApplyRangeGroup.setId(ProductApplyRangeGroupMap.get("id"));
                productApplyRangeGroup.setEntityStatus(EntityStatus.Delete);
                MetaDaoHelper.update((String)"pc.product.ProductApplyRangeGroup", (BizObject)productApplyRangeGroup);
                continue;
            }
            String orgId = null == bill.get("productApplyRange_orgId") ? bill.get("productApplyRange_OrgId").toString() : bill.get("productApplyRange_orgId").toString();
            QueryConditionGroup productRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(bill.get("id")), QueryCondition.name((String)"orgGroupType").in(new Object[]{"0", "2"}), QueryCondition.name((String)"orgGroupId.orgGroupDetailList.orgId").eq((Object)orgId)});
            QuerySchema productRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,orgGroupType").addCondition((ConditionExpression)productRangeGroupCondition);
            List originalProductApplyRangeGroupList = MetaDaoHelper.queryObject((String)"pc.product.ProductApplyRangeGroup", (QuerySchema)productRangeGroupSchema, null);
            if (CollectionUtils.isEmpty((Collection)originalProductApplyRangeGroupList)) {
                return new RuleExecuteResult();
            }
            ProductApplyRangeGroup productApplyRangeGroup = (ProductApplyRangeGroup)originalProductApplyRangeGroupList.get(0);
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)productApplyRangeGroup.getOrgGroupId())});
            QuerySchema schema = QuerySchema.create().addSelect("id,orgType,orgId,groupId").addCondition((ConditionExpression)condition);
            List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)schema);
            ArrayList<PubOrgGroupDetail> originalPubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            for (Map a : originalPubOrgGroupDetailMapList) {
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgId(a.get("orgId") == null ? "" : a.get("orgId").toString());
                pubOrgGroupDetail.setGroupId(a.get("groupId") == null ? "" : a.get("groupId").toString());
                pubOrgGroupDetail.setOrgType(a.get("orgType") == null ? "" : a.get("orgType").toString());
                if (pubOrgGroupDetail.getOrgId().equals(orgId)) continue;
                originalPubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
            if (CollectionUtils.isEmpty(originalPubOrgGroupDetailList)) {
                productApplyRangeGroup.setEntityStatus(EntityStatus.Delete);
                MetaDaoHelper.delete((String)"pc.product.ProductApplyRangeGroup", (BizObject)productApplyRangeGroup);
                continue;
            }
            PubOrgGroup newOriginalPubOrgGroup = new PubOrgGroup();
            newOriginalPubOrgGroup.setOrgGroupType(productApplyRangeGroup.getOrgGroupType());
            newOriginalPubOrgGroup.setOrgGroupDetailList(originalPubOrgGroupDetailList);
            String newOriginalGroupId = this.groupService.saveGroup((Map)newOriginalPubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            productApplyRangeGroup.setOrgGroupId(newOriginalGroupId);
            productApplyRangeGroup.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductApplyRangeGroup", (BizObject)productApplyRangeGroup);
        }
        return new RuleExecuteResult();
    }
}

