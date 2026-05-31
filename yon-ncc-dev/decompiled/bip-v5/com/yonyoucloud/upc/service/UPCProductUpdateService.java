/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IProductUpdateOtherDbService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class UPCProductUpdateService
implements IUPCProductUpdateService {
    private static final int DATA_FILTER_SIZE = 50;
    @Autowired
    DataSourceService dataSourceService;
    @Autowired
    private IProductUpdateOtherDbService productUpdateOtherDbService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    @Override
    public void UpdateUpDownCountOfCreator(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productapplyrangeid").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        QuerySchema productSkuDetailNewMallUpQuerySchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(map.get("productid")), QueryCondition.name((String)"productApplyRangeId").eq(map.get("productapplyrangeid")), QueryCondition.name((String)"status").eq((Object)true)}));
        List skuDetailNewMallUpCounts = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)productSkuDetailNewMallUpQuerySchema);
        map.put("mallupcount", ((Map)skuDetailNewMallUpCounts.get(0)).get("count"));
        QuerySchema productSkuDetailNewMallDownQuerySchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(map.get("productid")), QueryCondition.name((String)"productApplyRangeId").eq(map.get("productapplyrangeid")), QueryCondition.name((String)"status").in(new Object[]{false, null})}));
        List skuDetailNewMallDownCounts = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)productSkuDetailNewMallDownQuerySchema);
        map.put("malldowncount", ((Map)skuDetailNewMallDownCounts.get(0)).get("count"));
        QuerySchema productSkuDetailNewUOrderUpQuerySchema = QuerySchema.create().addSelect("count(1) as uorderupcount,sum(inventoryCount) as lInventoryCount").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(map.get("productid")), QueryCondition.name((String)"productApplyRangeId").eq(map.get("productapplyrangeid")), QueryCondition.name((String)"ustatus").eq((Object)true)}));
        List skuDetailNewUOrderUpCounts = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)productSkuDetailNewUOrderUpQuerySchema);
        map.put("uorderupcount", ((Map)skuDetailNewUOrderUpCounts.get(0)).get("uorderupcount"));
        map.put("lInventoryCount", ((Map)skuDetailNewUOrderUpCounts.get(0)).get("lInventoryCount"));
        QuerySchema productSkuDetailNewUOrderDownQuerySchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(map.get("productid")), QueryCondition.name((String)"productApplyRangeId").eq(map.get("productapplyrangeid")), QueryCondition.name((String)"ustatus").in(new Object[]{false, null})}));
        List skuDetailNewUOrderDownCounts = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)productSkuDetailNewUOrderDownQuerySchema);
        map.put("uorderdowncount", ((Map)skuDetailNewUOrderDownCounts.get(0)).get("count"));
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailUpDownCount", map);
    }

    @Override
    public void UpdateUpDownCountOfCreatorbyParams(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productApplyRangeId").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailDefaultSkuUpDownCount", map);
    }

    @Override
    public void UpdateUpDownCountOfApplier(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productApplyRangeId").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailUpDownCountOfApplier", map);
    }

    @Override
    public void UpdateUpDownCountOfApplierbyParams(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productApplyRangeId").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailDefaultSkuUpDownCount", map);
    }

    @Override
    public List<Map<String, Object>> SelectSKUBackStatusOfCreator(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productapplyrangeid").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        List list = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.SelectSKUBackStatusOfCreator", map);
        if (!CollectionUtils.isEmpty((Collection)list)) {
            for (Map data : list) {
                if (null != data.get("productiStatus") && Boolean.parseBoolean(data.get("productiStatus").toString()) && null != data.get("skuskuproductiStatus") && Boolean.parseBoolean(data.get("skuskuproductiStatus").toString())) {
                    data.put("iStatus_b", true);
                } else {
                    data.put("iStatus_b", false);
                }
                if (null != data.get("productiUOrderStatus") && Boolean.parseBoolean(data.get("productiUOrderStatus").toString()) && null != data.get("skuskuproductiUStatus") && Boolean.parseBoolean(data.get("skuskuproductiUStatus").toString())) {
                    data.put("iUStatus_b", true);
                } else {
                    data.put("iUStatus_b", false);
                }
                data.put("ytenant", AppContext.getYTenantId());
            }
        }
        return list;
    }

    @Override
    public void UpdateSKUBackStatusOfCreator(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productApplyRangeId").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateSkuDetailNewBackStatusOfCreator", map);
    }

    @Override
    public void UpdateSKUBackStatusOfApplier(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productapplyrangeid").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        map.put("ytenant", AppContext.getYTenantId());
        if (this.dataSourceService.getDataSourceIsOscar()) {
            this.productUpdateOtherDbService.updateSkuBackStatusOfApplierOtherDb(map);
        } else {
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateSkuDetailNewBackStatusOfApplier", map);
        }
    }

    @Override
    public void UpdateDefaultSKUId(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateDefaultSKUId", map);
    }

    @Override
    public void UpdateMaxMinBatchPriceNew(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateMaxMinBatchPriceNew", map);
    }

    @Override
    public void UpdateSKUOrderPropsSKUIDNew(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateSKUOrderPropsSKUIDNew", map);
    }

    @Override
    public void updateTenantInnerUnifiedField(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        if (this.dataSourceService.getDataSourceIsOscar()) {
            this.productUpdateOtherDbService.updateTenantInnerUnifiedFieldOtherDb(map);
        } else {
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailInnerUnifiedField", map);
        }
    }

    @Override
    public void UpdateBusinessUnit(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailBusinessUnit", map);
    }

    @Override
    public void updateProductField(Map<String, Object> map) throws Exception {
        if (!StringUtils.hasText((String)map.get("productApplyRangeId").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800746);
        }
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailFieldsForForceModify", map);
    }

    @Override
    public void updateProductAuditInfo(Map<String, Object> map) throws Exception {
        map.put("ytenantid", AppContext.getYTenantId());
        map.put("modifier", AppContext.getCurrentUser().getName());
        map.put("modifierId", AppContext.getCurrentUser().getId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.UpdateProductDetailAuditInformation", map);
    }

    @Override
    public void UpdateApplyRangeDetailStatus(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductDetailStatus", map);
    }
}

