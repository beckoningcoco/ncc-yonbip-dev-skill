/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.transtype.model.BdBillType
 *  com.yonyoucloud.upc.pc.product.Product
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.transtype.model.BdBillType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.GlobalShareService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productListRefFilter")
public class ProductListRefFilter
extends AbstractCommonRule {
    @Autowired
    ProductDefaultValueService productDefaultValueService;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    GlobalShareService globalShareService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List data;
        FilterVO treeCondition;
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        if (null == (treeCondition = billDataDto.getTreeCondition())) {
            treeCondition = new FilterVO();
        }
        List bills = this.getBills(billContext, map);
        if ("pc_tagref".equals(refEntity.refType)) {
            boolean filterEndTime = true;
            if (billDataDto.getMapCondition() != null && billDataDto.getMapCondition().containsKey("option")) {
                filterEndTime = !"clear".equalsIgnoreCase(billDataDto.getMapCondition().get("option").toString());
                billDataDto.getMapCondition().remove("option");
            }
            if (filterEndTime) {
                gridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("dEndTime", "is_null", null), new SimpleFilterVO("dEndTime", "egt", (Object)new Date())});
                gridFilter.appendCondition(ConditionOperator.or, new SimpleFilterVO[]{new SimpleFilterVO("isManage", "eq", (Object)1), new SimpleFilterVO("isFront", "eq", (Object)1)});
            }
        }
        if (("pc_productlist".equals(billContext.getBillnum()) || "pc_productlist_query".equals(billContext.getBillnum()) || "pc_productdetail".equals(billContext.getBillnum()) || "pc_product".equals(billContext.getBillnum())) && "org_pure_tree_ref_na".equals(refEntity.code)) {
            SimpleFilterVO[] simpleVOs = treeCondition.getSimpleVOs();
            ArrayList<SimpleFilterVO> newSimple = new ArrayList<SimpleFilterVO>();
            for (SimpleFilterVO simpleVO : simpleVOs) {
                if (simpleVO.getField().equals("id")) continue;
                newSimple.add(simpleVO);
            }
            SimpleFilterVO[] array = newSimple.toArray(new SimpleFilterVO[newSimple.size()]);
            treeCondition.setSimpleVOs(array);
        }
        if ("bd_staff_outer_ref".equalsIgnoreCase(refEntity.code) && ("detail!productBuyer_Name".equals(billDataDto.getKey()) || "detail!warehouseManager_Name".equals(billDataDto.getKey()) || "detail!manufacturePlanner_Name".equals(billDataDto.getKey()))) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("biz_man_tag", "eq", (Object)true), new SimpleFilterVO("enable", "eq", (Object)1)});
            if (!CollectionUtils.isEmpty((Collection)bills)) {
                String externalOrgId;
                BizObject bizObject = (BizObject)bills.get(0);
                String string = externalOrgId = null != bizObject.get("productApplyRange_OrgId") ? (String)bizObject.get("productApplyRange_OrgId") : (String)bizObject.get("orgId");
                if (null != externalOrgId && !"666666".equals(externalOrgId)) {
                    HashMap<String, String> externalData = new HashMap<String, String>();
                    externalData.put("orgId", externalOrgId);
                    billDataDto.setExternalData(externalData);
                }
            }
        }
        if ("pc_userdefref".equals(refEntity.refType)) {
            String cSelfDefineType;
            String key = billDataDto.getKey();
            String defineId = billDataDto.getcSelfDefineType();
            if (defineId == null || "".equals(defineId)) {
                defineId = this.getDefineId(key);
            }
            if (defineId != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("defineId", "eq", (Object)defineId)});
                billDataDto.setCondition(gridFilter);
                this.putParam(map, billDataDto);
            }
            if ((cSelfDefineType = billDataDto.getcSelfDefineType()) != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("defineId", "eq", (Object)cSelfDefineType)});
            }
        }
        if ("aa_vendorCreatorref".equals(refEntity.refType) && !this.pubOptionService.getOrgGlobalShare("aa.vendor.Vendor").booleanValue()) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("vendorApplyRange.org", "eq", (Object)AppContext.getCurrentUser().getOrgId())});
        }
        if ("aa_vendor".equals(refEntity.refType) && !CollectionUtils.isEmpty((Collection)bills)) {
            BizObject bizObject = (BizObject)bills.get(0);
            if (!this.pubOptionService.getOrgGlobalShare("aa.vendor.Vendor").booleanValue()) {
                if (null != bizObject.get("productApplyRange_OrgId")) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("vendorApplyRange.org", "eq", bizObject.get("productApplyRange_OrgId"))});
                } else if (null != bizObject.get("orgId")) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("vendorApplyRange.org", "eq", bizObject.get("orgId"))});
                }
            }
        }
        if ("bd_adminorgsharetreeref".equals(refEntity.code)) {
            treeCondition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgtype", "neq", (Object)1)});
        }
        if ("bd_billtyperef".equalsIgnoreCase(refEntity.refType)) {
            List<BdBillType> billTypeVOs = this.coredocTransTypeService.getBillTypeId();
            if (!CollectionUtils.isEmpty(billTypeVOs)) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("billtype_id", "eq", (Object)billTypeVOs.get(0).getId())});
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("billtype_id", "eq", (Object)"0")});
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("enable", "eq", (Object)"1")});
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("dr", "eq", (Object)"0")});
        }
        if ("pc_materialstatusref".equalsIgnoreCase(refEntity.refType) && null != (data = (List)billDataDto.getData()) && !data.isEmpty()) {
            Product product = (Product)data.get(0);
            if (null != product.getLifeCycleTemplate()) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("materialStatusId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"lifeCycleTemplateId").eq((Object)product.getLifeCycleTemplate())}));
                List cycleDetailList = MetaDaoHelper.query((String)"pc.manage.LifeCycleDetail", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)cycleDetailList)) {
                    ArrayList cycleDetailIds = new ArrayList();
                    for (Map cycleDetail : cycleDetailList) {
                        cycleDetailIds.add(cycleDetail.get("materialStatusId"));
                    }
                    if (CollectionUtils.isEmpty(cycleDetailIds)) {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", (Object)"-1")});
                    } else {
                        gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", cycleDetailIds)});
                    }
                }
            } else {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", (Object)"-1")});
            }
        }
        if ("org_admin_dept_tree_ref_disabled_selectable".equalsIgnoreCase(refEntity.refType)) {
            HashMap<String, Boolean> externalData = new HashMap<String, Boolean>();
            externalData.put("orgPermission", false);
            billDataDto.setExternalData(externalData);
        }
        billDataDto.setCondition(gridFilter);
        billDataDto.setTreeCondition(treeCondition);
        this.globalShareService.dealGlobalShareConditionByDto(billDataDto);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }

    public String getDefineId(String key) throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("cFieldName", key);
        param.put("ytenantId", AppContext.getYTenantId());
        List list = SqlHelper.selectList((String)"com.yonyoucloud.upc.userdef.dao.UserDefClass.selectItemByCname", param);
        if (list != null && list.size() == 1) {
            Map data = (Map)list.get(0);
            return data.get("cSelfDefineType").toString();
        }
        return null;
    }
}

