/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.BillContextUtils
 *  com.yonyoucloud.iuap.upc.api.IMerchantListService
 *  com.yonyoucloud.iuap.upc.dto.MerchantListDTO
 *  com.yonyoucloud.iuap.upc.dto.MerchantListQryDTO
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.BillContextUtils;
import com.yonyoucloud.iuap.upc.api.IMerchantListService;
import com.yonyoucloud.iuap.upc.dto.MerchantListDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantListQryDTO;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantListServiceImpl
implements IMerchantListService {
    Logger logger = LoggerFactory.getLogger(MerchantListServiceImpl.class);

    public List<MerchantListDTO> getMerchantListByMerchantListQryDTO(MerchantListQryDTO merchantListQryDTO) throws Exception {
        QuerySchema querySchema;
        Pager pager;
        if (merchantListQryDTO.getPageIndex() == null) {
            merchantListQryDTO.setPageIndex(UpcAPiTool.DEFAULT_PAGE_INDEX);
        }
        if (merchantListQryDTO.getPageSize() == null) {
            merchantListQryDTO.setPageSize(UpcAPiTool.PAGE_MAX_SIZE);
        }
        BillContext billContext = BillContextUtils.getBillContext((String)"aa_merchantlist");
        billContext.setbRowAuthControl(true);
        billContext.setMasterOrgField("merchantAppliedDetail.merchantApplyRangeId.orgId");
        billContext.setFullname("aa.merchant.Merchant");
        billContext.setAction("query");
        QueryField[] qryFields = new QueryField[16];
        qryFields[0] = new QueryField("id", "id");
        qryFields[1] = new QueryField("name", "name");
        qryFields[2] = new QueryField("code", "code");
        qryFields[3] = new QueryField("merchantAppliedDetail.merchantApplyRangeId", "merchantApplyRangeId");
        qryFields[4] = new QueryField("merchantAppliedDetail.stopstatus", "detailStopStatus");
        qryFields[5] = new QueryField("merchantAppliedDetail.merchantApplyRangeId.orgId", "rangeOrgId");
        qryFields[6] = new QueryField("merchantAppliedDetail.merchantApplyRangeId.shopId", "rangeShopId");
        qryFields[7] = new QueryField(" merchantAppliedDetail.transactionCurrency", "detailTransactionCurrency");
        qryFields[8] = new QueryField("merchantAppliedDetail.searchcode", "detailSearchCode");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"merchantRole.businessRole").like((Object)"2")});
        if (merchantListQryDTO.getFuzzyCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").like((Object)merchantListQryDTO.getFuzzyCode()));
        }
        if (merchantListQryDTO.getFuzzyName() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").like((Object)merchantListQryDTO.getFuzzyName()));
        }
        if (merchantListQryDTO.getFuzzySearchCode() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAppliedDetail.searchcode").like((Object)merchantListQryDTO.getFuzzySearchCode()));
        }
        if (merchantListQryDTO.getRangeOrgId() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.orgId").eq((Object)merchantListQryDTO.getRangeOrgId()));
        } else {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.orgId").not_eq((Object)"666666"));
        }
        if (merchantListQryDTO.getDetailStopStatus() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantAppliedDetail.stopstatus").eq((Object)merchantListQryDTO.getDetailStopStatus()));
        }
        if (merchantListQryDTO.getMobile() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantsManager.mobile").eq((Object)merchantListQryDTO.getMobile()));
        }
        if ((pager = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)(querySchema = QuerySchema.create().addSelect(qryFields).addCondition((ConditionExpression)queryConditionGroup).addPager(merchantListQryDTO.getPageIndex().intValue(), merchantListQryDTO.getPageSize().intValue())))) == null || pager.getPageCount() == 0 || CollectionUtils.isEmpty((Collection)pager.getRecordList())) {
            this.logger.error("getMerchantListByMerchantListQryDTO,\u67e5\u8be2\u7ed3\u679c\u4e3a\u7a7a!querySchema\u4e3a" + querySchema);
            return null;
        }
        List merchantList = pager.getRecordList();
        for (Map merchant : merchantList) {
            if (!(merchant.get("name") instanceof Map)) continue;
            merchant.put("name", MerchantOpenApiUtils.getMultilingualVO((Map)((Map)merchant.get("name"))));
        }
        return JSON.parseArray((String)JSON.toJSONString((Object)merchantList), MerchantListDTO.class);
    }
}

