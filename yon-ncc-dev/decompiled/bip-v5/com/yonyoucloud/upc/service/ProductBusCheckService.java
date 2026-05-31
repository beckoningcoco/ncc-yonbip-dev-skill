/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.bd.common.exception.BaseDocException
 *  com.yonyou.iuap.data.service.itf.BizDelegateApi
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dubbo.DubboReference
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.bd.common.exception.BaseDocException;
import com.yonyou.iuap.data.service.itf.BizDelegateApi;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dubbo.DubboReference;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productBusCheckService")
public class ProductBusCheckService {
    @Autowired
    private IVendorPubQueryService vendorQueryService;

    public void checkOrgOfVendor(Object orgId, Object productVendor) throws Exception {
        String orgIdStr;
        Long vendorId;
        boolean hasVendor;
        if (null != orgId && !"666666".equals(orgId.toString()) && null != productVendor && !(hasVendor = this.vendorQueryService.judgeVendorOrgV2(vendorId = Long.valueOf(productVendor.toString()), orgIdStr = orgId.toString()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800492);
        }
    }

    public void checkIDoubleSale(Object iDoubleSale, Object productId) throws Exception {
        int precision;
        if (null == iDoubleSale || null == productId) {
            return;
        }
        BigDecimal decimal = new BigDecimal(iDoubleSale.toString()).stripTrailingZeros();
        int scale = decimal.scale();
        QuerySchema schema = QuerySchema.create().addSelect("unit.precision as precision").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)}));
        List list = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)list) && null != ((Map)list.get(0)).get("precision") && scale > (precision = Integer.parseInt(((Map)list.get(0)).get("precision").toString()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800493);
        }
    }

    public void checkOMSWarehouse(String omsWarehouse, String orgId) throws Exception {
        QueryConditionGroup wareConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)omsWarehouse), QueryCondition.name((String)"org").is_null()});
        List<Map<String, Object>> wareList = this.getMapsByCondition(wareConditionGroup, "id", "aa.warehouse.Warehouse");
        QueryConditionGroup wareStockCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"warehouse").eq((Object)omsWarehouse), QueryCondition.name((String)"org").in(this.getRangeOrgAndStockOrg(orgId))});
        List<Map<String, Object>> wareStockList = this.getMapsByCondition(wareStockCondition, "warehouse", "aa.warehouse.WarehouseStock");
        if (CollectionUtils.isEmpty(wareList) && CollectionUtils.isEmpty(wareStockList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800494);
        }
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
        return MetaDaoHelper.query((String)entityName, (QuerySchema)wareStockQuerySchema);
    }
}

