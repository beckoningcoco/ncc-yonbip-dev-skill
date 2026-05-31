/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.enums.OperationTypeEnum
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.sys.service.ApiUserService
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.enums.OperationTypeEnum;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.sys.service.ApiUserService;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.enums.GradeManageControlServiceEnum;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.UPCBillService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MQSaveProductDetailTaskService
extends MQSaveTaskService {
    private static final Logger log = LoggerFactory.getLogger(MQSaveProductDetailTaskService.class);
    Logger logger = LoggerFactory.getLogger(MQSaveProductDetailTaskService.class);
    @Autowired
    ApiUserService apiUserService;
    @Autowired
    @Qualifier(value="pc.BillService")
    UPCBillService billService;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    ProductApiDataService productApiDataService;

    @Override
    public void dealWithAck(AsyncTask task) throws Exception {
        Map paramData = (Map)task.getData();
        BillDataDto bill = (BillDataDto)JSON.parseObject((String)JSON.toJSONString((Object)paramData), BillDataDto.class);
        Map<String, Object> param = task.getParam();
        log.error(String.format("MQSaveProductDetailTaskService Begin: productdetailparamoutkafka = %s", JSON.toJSONString(param)));
        Object resource = param.get("resource");
        String url = AppContext.getEnvConfig((String)resource.toString()) + "/gwmanage/erpdata/upc/log";
        Object callbackUrl = param.get("callbackUrl");
        String callBackKey = String.valueOf(param.get("key"));
        List allData = (List)bill.getData();
        try {
            ResultList resultList = this.saveDatas(callBackKey, bill, url, task);
            if (null != resultList) {
                if (resource != null && "ublinker".equals(resource.toString())) {
                    this.sendUblinker(ResultMessage.data((Object)resultList), url, task);
                } else if (callbackUrl != null) {
                    this.sendUblinker(ResultMessage.data((Object)resultList), callbackUrl.toString(), task);
                }
            }
        }
        catch (Exception e) {
            log.error(this.getClass() + ".execute ublinker ", (Throwable)e);
            this.dealCallBackError(task, param, resource, url, callbackUrl, e.getMessage(), allData.size());
        }
    }

    public ResultList saveDatasForTest(BillDataDto bill) throws Exception {
        return this.saveDatas("id", bill, null, null);
    }

    private ResultList saveDatas(String callBackKey, BillDataDto bill, String url, AsyncTask task) throws Exception {
        com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList resultList = null;
        HashSet<Long> productIdSet = new HashSet<Long>();
        HashSet<String> productCodeSet = new HashSet<String>();
        ArrayList<Object> messages = new ArrayList<Object>();
        List<Map<String, Object>> billDatas = this.dealBillDataForUbLinker(bill, productIdSet, productCodeSet, messages, callBackKey);
        if (null != url && null != task) {
            this.callBackError(messages, url, task);
        }
        if (!CollectionUtils.isEmpty(billDatas)) {
            resultList = this.billService.batchSave(bill);
            if (!CollectionUtils.isEmpty(productCodeSet)) {
                QueryConditionGroup queryProductIdCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(productCodeSet)});
                QuerySchema queryProductIdSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryProductIdCondition);
                List productIdMapList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)queryProductIdSchema);
                productIdMapList.forEach(a -> productIdSet.add(Long.parseLong(a.get("id").toString())));
            }
            int tryLockCount = 0;
            for (Long productId : productIdSet) {
                while (!RedisTool.tryGetLock((String)("APPLY_RANGE_" + GradeManageControlServiceEnum.PRODUCT.getBillType() + productId), (String)String.valueOf(productId), (int)60)) {
                    TimeUnit.SECONDS.sleep(20L);
                    if (++tryLockCount <= 30) continue;
                    this.logger.error("\u540c\u6b65\u9002\u7528\u8303\u56f4\u7ec4\u52a0\u9501\u5931\u8d25\uff0c\u4e0d\u52a0\u9501\u5904\u7406");
                    break;
                }
                tryLockCount = 0;
            }
            Tenant tenant = new Tenant();
            tenant.setYTenantId((String)AppContext.getYTenantId());
            tenant.setId(AppContext.getTenantId());
            HashMap<String, Object> deleteRangeGroupParam = new HashMap<String, Object>();
            deleteRangeGroupParam.put("ytenant", AppContext.getYTenantId());
            deleteRangeGroupParam.put("productIdList", new ArrayList<Long>(productIdSet));
            SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByTenantId", deleteRangeGroupParam);
            this.productApplyRangeGroupService.dealOldRangeToNew(new ArrayList<Long>(productIdSet), tenant);
            for (Long productId : productIdSet) {
                RedisTool.releaseLock((String)("APPLY_RANGE_" + GradeManageControlServiceEnum.PRODUCT.getBillType() + productId), (String)String.valueOf(productId));
            }
        }
        return resultList;
    }

    private List<Map<String, Object>> dealBillDataForUbLinker(BillDataDto bill, HashSet<Long> productIdList, HashSet<String> productCodeList, List<Object> messages, String callBackKey) throws Exception {
        ArrayList<Map<String, Object>> billList = new ArrayList<Map<String, Object>>();
        BillContext billContext = new CommonOperator(OperationTypeEnum.QUERY).getBillContext((BaseDto)bill);
        HashMap<String, BillDataDto> paramMap = new HashMap<String, BillDataDto>();
        paramMap.put("param", bill);
        List bills = CommonRuleUtils.getBills((BillContext)billContext, paramMap);
        for (Map billOne : bills) {
            try {
                this.dealData(billOne, productIdList, productCodeList);
                billList.add(billOne);
            }
            catch (Exception e) {
                Map detail;
                HashMap<String, String> msg = new HashMap<String, String>();
                if (null != billOne.get("id")) {
                    msg.put("key", billOne.get("id").toString());
                }
                if (null != billOne.get(callBackKey)) {
                    msg.put("key", billOne.get(callBackKey).toString());
                } else if (null != billOne.get("detail") && billOne.get("detail") instanceof Map && null != (detail = (Map)billOne.get("detail")).get(callBackKey)) {
                    msg.put("key", detail.get(callBackKey).toString());
                }
                msg.put("message", e.getMessage());
                messages.add(msg);
            }
        }
        bill.setData(billList);
        return billList;
    }

    private void dealData(Map<String, Object> billOne, HashSet<Long> productIdList, HashSet<String> productCodeList) throws Exception {
        billOne.put("FROM_UB_LINKER_TAG", "true");
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (billOne.get("id") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq(billOne.get("id")));
            productIdList.add(Long.parseLong(billOne.get("id").toString()));
        } else if (billOne.get("code") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq(billOne.get("code")));
            productCodeList.add(billOne.get("code").toString());
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800587);
        }
        if (billOne.get("belogOrg") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(billOne.get("belogOrg")));
        } else if (billOne.get("belogOrg_Code") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(billOne.get("belogOrg_Code")));
        } else if (billOne.get("orgId") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(billOne.get("orgId")));
        } else if (billOne.get("orgId_Code") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(billOne.get("orgId_Code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800833);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,isApplied,isCreator").addCondition((ConditionExpression)queryConditionGroup);
        List productapplys = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)productapplys)) {
            String errorMsg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080074", (String)"\u5f53\u524d\u7ec4\u7ec7\u4e0b\u6ca1\u6709\u7ec4\u7ec7\u7ea7\u6570\u636e\uff0c\u8bf7\u68c0\u67e5\u6570\u636e\u662f\u5426\u6b63\u786e\uff01");
            throw new CoreDocBusinessException(String.format("%s,productId:%s,OrgId:%s", errorMsg, billOne.get("id"), billOne.get("belogOrg")));
        }
        if (!billOne.containsKey("detail") || billOne.get("detail") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800834);
        }
        Map detail = (Map)billOne.get("detail");
        this.productApiDataService.removeDetailDataForDetailSave(detail);
        billOne.put("productApplyRangeId", ((Map)productapplys.get(0)).get("id").toString());
        billOne.put("isCreator", ((Map)productapplys.get(0)).get("isCreator"));
        billOne.put("isApplied", ((Map)productapplys.get(0)).get("isApplied"));
        BillDataDto billtemp = new BillDataDto("pc_productdetail", ((Map)productapplys.get(0)).get("productId").toString());
        HashMap<String, Comparable<Long>> params = new HashMap<String, Comparable<Long>>();
        params.put("@productApplyRangeId", Long.valueOf(Long.parseLong(((Map)productapplys.get(0)).get("id").toString())));
        params.put("isCreator", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isCreator").toString())));
        params.put("isApplied", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isApplied").toString())));
        billtemp.setMapCondition(params);
        Map map = BillBiz.detail((BillDataDto)billtemp);
        if (map.get("productBarCodes") != null) {
            List productBarCodes = (List)map.get("productBarCodes");
            for (Map productBarCode : productBarCodes) {
                if (!productBarCode.containsKey("pubts")) continue;
                productBarCode.remove("pubts");
            }
        }
        assert (Objects.nonNull(map) && map.size() < 10000);
        for (String key : map.keySet()) {
            if (key.startsWith("detail!")) {
                String newKey = key.replace("detail!", "");
                if (detail.keySet().contains(newKey)) continue;
                detail.put(key.replace("detail!", ""), map.get(key));
                continue;
            }
            billOne.put(key, map.get(key));
        }
        this.productApiDataService.dealDetailDataForDetailSave(detail);
        this.productApiDataService.dealChildObjecType(billOne);
        if (detail.get("productExtendCharacterDef") != null) {
            if (detail.get("productExtendCharacterDef__id") != null) {
                ((Map)detail.get("productExtendCharacterDef")).put("id", detail.get("productExtendCharacterDef__id"));
                ((Map)detail.get("productExtendCharacterDef")).put("_status", "Update");
            } else {
                ((Map)detail.get("productExtendCharacterDef")).put("_status", "Insert");
            }
        }
        billOne.put("detail", detail);
        billOne.put("_status", "Update");
    }
}

