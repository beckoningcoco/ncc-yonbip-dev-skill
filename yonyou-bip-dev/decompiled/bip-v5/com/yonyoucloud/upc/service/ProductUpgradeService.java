/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.ArrayListProcessor
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.ArrayListProcessor;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.service.LogicDatasourceService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductUpgradeService {
    private Logger logger = LoggerFactory.getLogger(ProductUpgradeService.class);
    @Autowired
    private LogicDatasourceService logicDatasourceService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public void shopIdUpgrade(Long tenantId) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            this.productShopIdUpgrade(ymsJdbcApi, tenantId);
        }
    }

    private void productApplyRangeShopIdUpgrade(Long tenantId, List<Long> productApplyRangeIdList) {
        try {
            if (tenantId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800858);
            }
            this.logger.info("productApplyRange\u5347\u7ea7shopId\u79df\u6237id{}", (Object)tenantId);
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant", AppContext.getYTenantId());
            params.put("productApplyRangeIdList", productApplyRangeIdList);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.productShopIdUpgrade.shopIdProductApplyRangeUpgrade", params);
        }
        catch (Exception e) {
            this.logger.error("productApplyRange\u7684shopId\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    private void productDetailShopIdUpgrade(Long tenantId, List<Long> productDetailIdList) {
        try {
            if (tenantId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800858);
            }
            this.logger.info("productDetail\u5347\u7ea7shopId\u79df\u6237id{}", (Object)tenantId);
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant", AppContext.getYTenantId());
            params.put("productDetailIdList", productDetailIdList);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.productShopIdUpgrade.shopIdProductDetailUpgrade", params);
        }
        catch (Exception e) {
            this.logger.error("productDetail\u7684shopId\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }

    private void productShopIdUpgrade(IYmsJdbcApi ymsJdbcApi, Long tenantId) {
        String querySQL = "select id from product where (ishopid = 0 or ishopid is null) and ytenant_id = " + AppContext.getYTenantId() + " limit 100000;";
        List idList = ymsJdbcApi.queryForList(querySQL, (ResultSetProcessor)new ArrayListProcessor());
        if (CollectionUtils.isEmpty((Collection)idList)) {
            return;
        }
        List productIdLists = ListSplitUtil.splitListByCapacity((List)idList, (int)500);
        for (List productIdList : productIdLists) {
            this.productShopIdUpgrade(tenantId, productIdList);
            this.productDetailShopIdUpgrade(tenantId, productIdList);
            this.productApplyRangeShopIdUpgrade(tenantId, productIdList);
        }
        if (productIdLists.size() == 100000) {
            this.productShopIdUpgrade(ymsJdbcApi, tenantId);
        }
    }

    private void productShopIdUpgrade(Long tenantId, List<Long> productIdList) {
        try {
            if (tenantId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800858);
            }
            this.logger.info("product\u5347\u7ea7shopId\u79df\u6237id{}", (Object)tenantId);
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant", AppContext.getYTenantId());
            params.put("productIdList", productIdList);
            SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.productShopIdUpgrade.shopIdProductUpgrade", params);
        }
        catch (Exception e) {
            this.logger.error("product\u7684shopId\u6570\u636e\u5347\u7ea7\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
    }
}

