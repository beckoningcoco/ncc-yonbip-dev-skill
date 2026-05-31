/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.bd.common.exception.BaseDocException
 *  com.yonyou.iuap.data.service.itf.BizDelegateApi
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReference
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
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

import com.yonyou.iuap.bd.common.exception.BaseDocException;
import com.yonyou.iuap.data.service.itf.BizDelegateApi;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReference;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="deliveryWarehouseRefFilterRule")
public class DeliveryWarehouseRefFilterRule
extends AbstractCommonRule {
    @Autowired
    private IBDQueryRepository billQueryRepository;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        billDataDto.setDatasource("deliveryWarehouse");
        if ("pc_product".equals(billDataDto.getBillnum()) || "pc_productdetail".equals(billDataDto.getBillnum())) {
            FilterVO gridFilter = billDataDto.getCondition();
            if (gridFilter == null) {
                gridFilter = new FilterVO();
            }
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("iUsed", "eq", (Object)"enable")});
            if (CollectionUtils.isEmpty((Collection)bills)) {
                return new RuleExecuteResult();
            }
            String org = null;
            if (null != ((BizObject)bills.get(0)).get("productApplyRange_OrgId")) {
                org = (String)((BizObject)bills.get(0)).get("productApplyRange_OrgId");
            }
            if (null == ((BizObject)bills.get(0)).get("productApplyRange_OrgId") && null != ((BizObject)bills.get(0)).get("orgId")) {
                org = (String)((BizObject)bills.get(0)).get("orgId");
            }
            if (null != org) {
                List warehouseIds;
                QueryConditionGroup wareStockCondition;
                List<Map<String, Object>> wareStockList;
                ArrayList wareids = new ArrayList();
                QueryConditionGroup wareConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"org").is_null(), QueryCondition.name((String)"tenant").eq(AppContext.getCurrentUser().getTenant())});
                List<Map<String, Object>> wareList = this.getMapsByCondition(wareConditionGroup, "id", "aa.warehouse.Warehouse");
                if (!CollectionUtils.isEmpty(wareList)) {
                    wareids.addAll(wareList.stream().map(m -> m.get("id").toString()).collect(Collectors.toList()));
                }
                if (!CollectionUtils.isEmpty(wareStockList = this.getMapsByCondition(wareStockCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"org").in(this.getRangeOrgAndStockOrg(org))}), "warehouse", "aa.warehouse.WarehouseStock")) && !CollectionUtils.isEmpty(warehouseIds = wareStockList.stream().map(ware -> ware.get("warehouse").toString()).collect(Collectors.toList()))) {
                    wareids.addAll(warehouseIds);
                }
                if (!CollectionUtils.isEmpty(wareids)) {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "in", wareids)});
                } else {
                    gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("3", "eq", (Object)2)});
                }
            }
            if (null == billDataDto.getCondition()) {
                billDataDto.setCondition(gridFilter);
            }
        }
        return new RuleExecuteResult();
    }

    private List<String> getRangeOrgAndStockOrg(String org) throws BaseDocException {
        BizDelegateApi bizDelegateApi = (BizDelegateApi)DubboReference.getInstance().getReference(BizDelegateApi.class, "orgcenter", null);
        ArrayList<String> stockOrgIds = bizDelegateApi.listInventoryOrgIdsBySalesOrgIdList(Collections.singletonList(org), (String)AppContext.getYhtTenantId(), "diwork");
        if (null == stockOrgIds) {
            stockOrgIds = new ArrayList<String>();
        }
        stockOrgIds.add(org);
        return stockOrgIds;
    }

    private List<Map<String, Object>> getMapsByCondition(QueryConditionGroup wareStockCondition, String fields, String entityName) throws Exception {
        QuerySchema wareStockQuerySchema = QuerySchema.create().addSelect(fields).addCondition((ConditionExpression)wareStockCondition);
        return this.billQueryRepository.queryMapBySchema(entityName, wareStockQuerySchema);
    }
}

