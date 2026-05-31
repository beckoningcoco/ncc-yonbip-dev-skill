/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import com.yonyoucloud.upc.service.product.ProductAddRangeService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service(value="productRangeApiService")
public class ProductRangeApiService {
    private static final Logger log = LoggerFactory.getLogger(ProductRangeApiService.class);
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    private ProductAddRangeService addRangeService;

    /*
     * Enabled aggressive block sorting
     */
    @Transactional(rollbackFor={Throwable.class})
    public ResultList syncProductRangeByOrgOld(Map dto) throws Exception {
        ResultList result = new ResultList();
        if (this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue()) {
            return result;
        }
        List data = (List)dto.get("data");
        if (data == null || data.isEmpty()) {
            result.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BF", (String)"data\u6570\u636e\u4e3a\u7a7a\uff01"), ""));
            return result;
        }
        log.info("syncProductRangeByOrg recieve data {}", (Object)data);
        ArrayList<Map> errData = new ArrayList<Map>();
        HashSet<String> orgIds = new HashSet<String>();
        HashSet<String> productErpCodes = new HashSet<String>();
        ArrayList productAndOrgs = new ArrayList();
        result.setCount(0);
        result.setFailCount(0);
        int count = 0;
        int failCount = 0;
        int sucessCount = 0;
        for (Map product : data) {
            if (product.get("product_erpCode") != null) {
                productErpCodes.add(product.get("product_erpCode").toString());
            } else {
                errData.add(product);
                ++failCount;
                ++count;
            }
            if (product.get("orgIds") != null) {
                List orgs = (List)product.get("orgIds");
                for (Object org : orgs) {
                    HashMap<String, String> product_org = new HashMap<String, String>(8);
                    product_org.put("product_erpCode", product.get("product_erpCode").toString());
                    product_org.put("orgId", org.get("orgId").toString());
                    product_org.put("erpCode", org.get("erpCode").toString());
                    productAndOrgs.add(product_org);
                    orgIds.add(org.get("orgId").toString());
                }
                count += orgs.size();
                continue;
            }
            errData.add(product);
            ++failCount;
            ++count;
        }
        result.setCount(count);
        if (errData.size() > 0) {
            data.removeAll(errData);
            result.setFailCount(failCount);
            HashMap<String, Object> message = new HashMap<String, Object>(2);
            message.put("message", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BD", (String)"\u6570\u636e\u683c\u5f0f\u9519\u8bef"));
            message.put("key", errData);
            result.addMessage(message);
            log.info("syncProductRangeByOrg checked error data:{}", errData);
        }
        if (productErpCodes.isEmpty()) {
            result.setFailCount(productAndOrgs.size());
            result.setCount(productAndOrgs.size());
            result.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BA", (String)"\u7269\u6599erpCode\u4e3a\u7a7a"), ""));
            return result;
        }
        List productlist = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("id, erpCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"erpCode").in(productErpCodes)})));
        if (CollectionUtils.isEmpty((Collection)productlist)) {
            result.setFailCount(productAndOrgs.size());
            result.setCount(productAndOrgs.size());
            result.addMessage(this.getResultMsg(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BE", (String)"\u7269\u6599\u5168\u90e8\u4e0d\u5b58\u5728%s"), productErpCodes), ""));
            return result;
        }
        List orglist = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIds)})), (String)"ucf-org-center");
        if (CollectionUtils.isEmpty((Collection)orglist)) {
            result.setFailCount(productAndOrgs.size());
            result.setCount(productAndOrgs.size());
            result.addMessage(this.getResultMsg(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BB", (String)"\u7ec4\u7ec7\u5168\u90e8\u4e0d\u5b58\u5728%s"), orgIds), ""));
            return result;
        }
        ArrayList<Long> productIds = new ArrayList<Long>();
        HashMap<String, String> productErpCodesMapInDb = new HashMap<String, String>(productlist.size());
        for (Map product : productlist) {
            productErpCodesMapInDb.put(product.get("erpCode").toString(), product.get("id").toString());
            productIds.add(Long.parseLong(product.get("id").toString()));
        }
        List orgIdsListInDb = orglist.stream().map(t -> t.get("id").toString()).collect(Collectors.toList());
        List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, productId, orgId,productDetailId,productDepositTimeDetailId,isCreator").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"orgId").in(orgIdsListInDb)})));
        Map<String, String> rangeMapsInDb = rangesInDb.stream().collect(Collectors.toMap(x -> x.get("productId").toString() + x.get("orgId").toString(), y -> y.get("id").toString()));
        List creatorRangeIdList = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, productId, orgId,productDetailId,productDepositTimeDetailId,isCreator").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)Boolean.TRUE)})));
        HashMap creatorRangeIdMap = new HashMap();
        creatorRangeIdList.forEach(a -> creatorRangeIdMap.put(a.get("productId").toString(), a));
        ArrayList<ProductApplyRange> ranges2Db = new ArrayList<ProductApplyRange>();
        HashSet<String> allProductOrgNew = new HashSet<String>();
        String lockKeyValue = UUID.randomUUID().toString();
        HashSet<String> lockKeys = new HashSet<String>();
        for (Map map : productAndOrgs) {
            String productOrgId;
            boolean isGetLock;
            if (!productErpCodesMapInDb.containsKey(map.get("product_erpCode"))) {
                result.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805C0", (String)"\u7269\u6599\u4e0d\u5b58\u5728"), (String)map.get("product_erpCode")));
                ++failCount;
                continue;
            }
            Long productId = Long.parseLong((String)productErpCodesMapInDb.get(map.get("product_erpCode")));
            if (!orgIdsListInDb.contains(map.get("orgId"))) {
                result.addMessage(this.getResultMsg(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805BC", (String)"\u7ec4\u7ec7\u4e0d\u5b58\u5728"), (String)map.get("erpCode")));
                ++failCount;
                continue;
            }
            String lockKey = RedisLockKeyConstants.PRODUCT_ORG_ASYNC + productId;
            if (!lockKeys.contains(lockKey)) {
                if (!RedisTool.tryGetLock((String)lockKey, (String)lockKeyValue, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                    this.releaseLock(lockKeys, lockKeyValue);
                    log.error(this.getClass() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805B8", (String)"\u64cd\u4f5c\u7269\u6599\u5206\u914d\u5173\u7cfb\u83b7\u53d6\u5206\u5e03\u5f0f\u9501\u5931\u8d25:") + lockKey);
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801414);
                }
                lockKeys.add(lockKey);
                isGetLock = true;
            } else {
                isGetLock = true;
            }
            if (!isGetLock || allProductOrgNew.contains(productOrgId = productId + (String)map.get("orgId"))) continue;
            allProductOrgNew.add(productOrgId);
            if (!rangeMapsInDb.containsKey(productId + (String)map.get("orgId"))) {
                ProductApplyRange range = ProductUtil.buildProductApplyRange(productId, 1, (String)map.get("orgId"), null);
                if (creatorRangeIdMap.get(productId.toString()) != null) {
                    if (((Map)creatorRangeIdMap.get(productId.toString())).get("productDetailId") != null) {
                        range.setProductDetailId(Long.valueOf(Long.parseLong(((Map)creatorRangeIdMap.get(productId.toString())).get("productDetailId").toString())));
                    }
                    if (((Map)creatorRangeIdMap.get(productId.toString())).get("productDepositTimeDetailId") != null) {
                        range.setProductDepositTimeDetailId(Long.valueOf(Long.parseLong(((Map)creatorRangeIdMap.get(productId.toString())).get("productDepositTimeDetailId").toString())));
                    }
                }
                ranges2Db.add(range);
                range.put("erpCode", map.get("erpCode"));
                ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
                ranges.add(range);
                HashMap<String, Object> info_data = new HashMap<String, Object>(2);
                info_data.put("orgIds", ranges);
                info_data.put("subName", "orgIds");
                HashMap<String, HashMap<String, Object>> info = new HashMap<String, HashMap<String, Object>>(2);
                info.put("data", info_data);
                result.addInfo(info);
                if (ranges2Db.size() > 500) {
                    SqlHelper.insert((String)"com.yonyoucloud.upc.productBatchHandle.dao.productdata.batchinserProductRanges", ranges2Db);
                    ranges2Db.clear();
                }
            }
            ++sucessCount;
        }
        result.setFailCount(failCount);
        result.setSucessCount(sucessCount);
        if (ranges2Db.size() > 0) {
            SqlHelper.insert((String)"com.yonyoucloud.upc.productBatchHandle.dao.productdata.batchinserProductRanges", ranges2Db);
        }
        this.releaseLock(lockKeys, lockKeyValue);
        HashMap<String, Object> deleteRangeGroupParam = new HashMap<String, Object>();
        deleteRangeGroupParam.put("ytenant", AppContext.getYTenantId());
        deleteRangeGroupParam.put("productIdList", productIds);
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductApplyRangeGroupByTenantId", deleteRangeGroupParam);
        Tenant tenant = new Tenant();
        tenant.setYTenantId((String)AppContext.getYTenantId());
        tenant.setId(AppContext.getTenantId());
        this.productApplyRangeGroupService.dealOldRangeToNew(productIds, tenant);
        return result;
    }

    @Transactional(rollbackFor={Throwable.class})
    public ResultList syncProductRangeByOrg(Map dto) throws Exception {
        if (this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue()) {
            return new ResultList();
        }
        return this.addRangeService.syncProductRangeByOrg(dto);
    }

    private void releaseLock(final Set<String> lockKeys, final String lockKeyValue) {
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                if (!lockKeys.isEmpty()) {
                    for (String lockKey : lockKeys) {
                        RedisTool.releaseLock((String)lockKey, (String)lockKeyValue);
                    }
                }
            }
        });
    }

    private Map<String, String> getResultMsg(String msg, String code) {
        HashMap<String, String> data = new HashMap<String, String>(2);
        data.put("message", msg);
        data.put("key", code);
        return data;
    }

    public BillDataDto syncProductAuth(Map bill) {
        BillDataDto tempbill = new BillDataDto();
        if ("SYNCPRODUCTAUTH_NOTIFY".equals(bill.get("eventType")) && "SALE".equals(bill.get("sourceID"))) {
            JSONObject userObject = JSONObject.parseObject((String)bill.get("userObject").toString());
            JSONObject datas = JSONObject.parseObject((String)userObject.get("datas").toString());
            List data = (List)JSONArray.parse((String)datas.get("data").toString());
            tempbill.setBillnum(datas.get("billnum").toString());
            tempbill.setData((Object)data);
        }
        return tempbill;
    }
}

