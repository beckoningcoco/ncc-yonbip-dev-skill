/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.common.MerchantApplyRangeCancelSuitOrgDTO
 *  com.yonyoucloud.upc.common.MerchantCancelSuitOrgDTO
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryJoin
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.merchantapplyrangegroup;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.common.MerchantApplyRangeCancelSuitOrgDTO;
import com.yonyoucloud.upc.common.MerchantCancelSuitOrgDTO;
import com.yonyoucloud.upc.service.MerchantCommonRefQueryService;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryJoin;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantRangeShareService {
    private static final Logger log = LoggerFactory.getLogger(MerchantRangeShareService.class);
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private MerchantCommonRefQueryService merchantCommonRefQueryService;

    public MerchantApplyRange getMerchantApplyRange(Long merchantId, Integer rangeType, String orgId) {
        MerchantApplyRange range = new MerchantApplyRange();
        range.setId((Object)IdManager.getInstance().nextId());
        range.setMerchantId(merchantId);
        range.setRangeType(rangeType);
        if (rangeType == 3) {
            range.setShop(Long.valueOf(orgId));
        }
        range.setOrgId(orgId);
        range.setIsCreator(Boolean.valueOf(false));
        range.setIsApplied(Boolean.valueOf(false));
        range.setTenant((Long)AppContext.getCurrentUser().getTenant());
        range.setEntityStatus(EntityStatus.Insert);
        return range;
    }

    public String cancelSuitOrg(BillDataDto billDataDto) throws Exception {
        String requestId = UUID.randomUUID().toString();
        String asyncKey = "unassignMerchantApplyRange" + AppContext.getCurrentUser().getYTenantId() + requestId;
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u53d6\u6d88\u5206\u914d-\u5f02\u6b65\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(expireTime));
        int finalExpireTime = expireTime;
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
            try {
                this.syncCancelSuitOrg(billDataDto, asyncKey, finalExpireTime);
            }
            catch (Exception e) {
                log.error("cancelSuitOrg\u53d6\u6d88\u5206\u914d\u5f02\u5e38\u4fe1\u606f:{}", (Object)e.getMessage(), (Object)e);
                ResultList resultList = new ResultList();
                resultList.addFailInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.setFailCount(1);
                resultList.setCount(1);
                ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AC3605980019", (String)"\u5ba2\u6237\u6863\u6848\u53d6\u6d88\u5206\u914d\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(asyncKey, Integer.valueOf(finalExpireTime));
            }
        });
        return asyncKey;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void syncCancelSuitOrg(BillDataDto billDataDto, String asyncKey, int expireTime) throws Exception {
        List<MerchantCancelSuitOrgDTO> merchantUnassignOrgList = this.getMerchantListCancelSuitOrg(billDataDto);
        ProcessData.builder((int)1, (int)200, null, null).percentage("30").build(asyncKey, Integer.valueOf(expireTime));
        int totalCount = merchantUnassignOrgList.size();
        int successCount = 0;
        int failCount = 0;
        ResultList resultList = new ResultList();
        for (MerchantCancelSuitOrgDTO merchantCancelSuitOrg : merchantUnassignOrgList) {
            try {
                this.syncCancelSuitOrgMerchant(merchantCancelSuitOrg);
                ++successCount;
            }
            catch (Exception e) {
                log.error("syncUnassign\u53d6\u6d88\u5206\u914d\u5f02\u5e38\u4fe1\u606f:{}", (Object)e.getMessage(), (Object)e);
                ++failCount;
                String str = MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AC360598001B", (String)"\u5ba2\u6237[{0}-{1}]\u53d6\u6d88\u5206\u914d\u5931\u8d25,\u539f\u56e0\u4e3a\u3010{2}\u3011"), merchantCancelSuitOrg.getMerchantCode(), merchantCancelSuitOrg.getMerchantName(), e.getMessage());
                resultList.addInfo((Object)str);
                resultList.addErrorMessage(str);
                resultList.addFailInfo((Object)str);
            }
            finally {
                String percentage = String.valueOf((successCount + failCount) * 70 / totalCount + 30);
                ProcessData.builder((int)1, (int)200, null, null).percentage(percentage).build(asyncKey, Integer.valueOf(expireTime));
            }
        }
        resultList.setCount(failCount + successCount);
        resultList.setSucessCount(successCount);
        resultList.setFailCount(failCount);
        ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AC360598001A", (String)"\u53d6\u6d88\u5206\u914d\u6267\u884c\u5b8c\u6bd5!")).percentage("100").successCount(successCount).failCount(failCount).build(asyncKey, Integer.valueOf(expireTime));
    }

    public void syncCancelSuitOrgMerchant(MerchantCancelSuitOrgDTO merchantCancelSuitOrg) throws Exception {
        List<MerchantApplyRangeCancelSuitOrgDTO> merchantApplyRangeCancelSuitOrgList = this.getMerchantApplyRangeCancelSuitOrgDTO(merchantCancelSuitOrg);
        if (!CollectionUtils.isEmpty(merchantApplyRangeCancelSuitOrgList)) {
            StringBuilder errorMessage = new StringBuilder();
            boolean error = false;
            for (MerchantApplyRangeCancelSuitOrgDTO merchantApplyRangeCancelSuitOrg : merchantApplyRangeCancelSuitOrgList) {
                try {
                    BillDataDto bill = new BillDataDto();
                    bill.setBillnum("aa_merchantlist");
                    Map<String, Object> params = this.initDeleteParam(merchantApplyRangeCancelSuitOrg);
                    bill.setData((Object)UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(params));
                    RuleExecuteResult ruleExecuteResult = this.billService.executeUpdate("delete", bill);
                    if (ruleExecuteResult == null || ruleExecuteResult.getMsgCode() == 1) continue;
                    errorMessage.append(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AC3605980018", (String)"\u7ec4\u7ec7[{0}-{1}]\u53d6\u6d88\u5206\u914d\u5931\u8d25,\u6821\u9a8c\u4fe1\u606f\u4e3a:{2};"), merchantApplyRangeCancelSuitOrg.getBelongOrgCode(), merchantApplyRangeCancelSuitOrg.getBelongOrgName(), ruleExecuteResult.getMessage()));
                    error = true;
                }
                catch (Exception e) {
                    log.error("syncUnassignMerchant\u53d6\u6d88\u5206\u914d\u5f02\u5e38\u4fe1\u606f:{}", (Object)e.getMessage(), (Object)e);
                    error = true;
                    errorMessage.append(MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1D76AC3605980018", (String)"\u7ec4\u7ec7[{0}-{1}]\u53d6\u6d88\u5206\u914d\u5931\u8d25,\u6821\u9a8c\u4fe1\u606f\u4e3a:{2};"), merchantApplyRangeCancelSuitOrg.getBelongOrgCode(), merchantApplyRangeCancelSuitOrg.getBelongOrgName(), e.getMessage()));
                }
            }
            if (error) {
                throw new CoreDocBusinessException(errorMessage.toString());
            }
        }
    }

    public Map<String, Object> initDeleteParam(MerchantApplyRangeCancelSuitOrgDTO merchantApplyRangeCancelSuitOrgDTO) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("id", merchantApplyRangeCancelSuitOrgDTO.getMerchantId());
        params.put("code", merchantApplyRangeCancelSuitOrgDTO.getMerchantCode());
        params.put("name", merchantApplyRangeCancelSuitOrgDTO.getMerchantName());
        params.put("createOrg", merchantApplyRangeCancelSuitOrgDTO.getCreateOrg());
        params.put("isCreator", merchantApplyRangeCancelSuitOrgDTO.getIsCreator());
        params.put("isApplied", merchantApplyRangeCancelSuitOrgDTO.getIsApplied());
        params.put("belongOrg", merchantApplyRangeCancelSuitOrgDTO.getBelongOrg());
        params.put("merchantApplyRangeId", merchantApplyRangeCancelSuitOrgDTO.getMerchantApplyRangeId());
        params.put("merchantAppliedDetail!id", merchantApplyRangeCancelSuitOrgDTO.getMerchantId());
        HashMap<String, Object> carryParams = new HashMap<String, Object>();
        carryParams.put("isCreator", merchantApplyRangeCancelSuitOrgDTO.getIsCreator());
        carryParams.put("isApplied", merchantApplyRangeCancelSuitOrgDTO.getIsApplied());
        carryParams.put("orgId", merchantApplyRangeCancelSuitOrgDTO.getBelongOrg());
        carryParams.put("merchantApplyRangeId", merchantApplyRangeCancelSuitOrgDTO.getMerchantApplyRangeId());
        params.put("carryParams", carryParams);
        return params;
    }

    public List<MerchantCancelSuitOrgDTO> getMerchantListCancelSuitOrg(BillDataDto billDataDto) throws Exception {
        if (null == billDataDto || null == billDataDto.getData()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMultilingualMessage());
        }
        if (null != billDataDto.getExternalData() && billDataDto.getExternalData() instanceof Map) {
            Map externalData = (Map)billDataDto.getExternalData();
            if ("2".equals(externalData.get("rangeMethod"))) {
                Map orgDataMap;
                List orgIds;
                List<Merchant> merchantList = this.queryMerchantCancelSuitOrg(billDataDto);
                if (!CollectionUtils.isEmpty(merchantList) && billDataDto.getData() instanceof String && !CollectionUtils.isEmpty((Collection)(orgIds = (List)(orgDataMap = (Map)JSONObject.parseObject((String)billDataDto.getData().toString(), Map.class)).get("orgIds")))) {
                    ArrayList<MerchantCancelSuitOrgDTO> merchantCancelSuitOrgDTOList = new ArrayList<MerchantCancelSuitOrgDTO>();
                    for (Merchant merchant : merchantList) {
                        MerchantCancelSuitOrgDTO merchantCancelSuitOrgDTO = new MerchantCancelSuitOrgDTO();
                        merchantCancelSuitOrgDTO.setMerchantId(merchant.getId().toString());
                        merchantCancelSuitOrgDTO.setMerchantCode(merchant.getCode());
                        merchantCancelSuitOrgDTO.setMerchantName(merchant.getName());
                        merchantCancelSuitOrgDTO.setCreateOrg(merchant.getCreateOrg());
                        merchantCancelSuitOrgDTO.setOrgIds(orgIds);
                        merchantCancelSuitOrgDTOList.add(merchantCancelSuitOrgDTO);
                    }
                    return merchantCancelSuitOrgDTOList;
                }
            } else if ("1".equals(externalData.get("rangeMethod"))) {
                JSONArray list = null;
                if (billDataDto.getData() instanceof String) {
                    list = JSON.parseArray((String)((String)billDataDto.getData()));
                } else if (billDataDto.getData() instanceof List) {
                    list = JSON.parseArray((String)JSONObject.toJSONString((Object)billDataDto.getData()));
                }
                if (list != null) {
                    ArrayList<Long> merchantIdList = new ArrayList<Long>();
                    HashMap orgDataMap = new HashMap();
                    for (int i = 0; i < list.size(); ++i) {
                        JSONObject jsonObject = list.getJSONObject(i);
                        String merchantId = jsonObject.getString("merchantId");
                        JSONArray orgIds = jsonObject.getJSONArray("orgIds");
                        ArrayList<String> orgIdList = new ArrayList<String>();
                        for (int j = 0; j < orgIds.size(); ++j) {
                            String orgId = orgIds.getString(j);
                            orgIdList.add(orgId);
                        }
                        merchantIdList.add(Long.parseLong(merchantId));
                        orgDataMap.put(merchantId, orgIdList);
                    }
                    List<Merchant> merchantInDbList = this.queryMerchantByIdList(merchantIdList);
                    if (!CollectionUtils.isEmpty(merchantInDbList)) {
                        ArrayList<MerchantCancelSuitOrgDTO> merchantCancelSuitOrgDTOList = new ArrayList<MerchantCancelSuitOrgDTO>();
                        for (Merchant merchant : merchantInDbList) {
                            String merchantId = merchant.getId().toString();
                            if (!orgDataMap.containsKey(merchantId)) continue;
                            MerchantCancelSuitOrgDTO merchantCancelSuitOrgDTO = new MerchantCancelSuitOrgDTO();
                            merchantCancelSuitOrgDTO.setMerchantId(merchantId);
                            merchantCancelSuitOrgDTO.setMerchantCode(merchant.getCode());
                            merchantCancelSuitOrgDTO.setMerchantName(merchant.getName());
                            merchantCancelSuitOrgDTO.setCreateOrg(merchant.getCreateOrg());
                            merchantCancelSuitOrgDTO.setOrgIds((List)orgDataMap.get(merchantId));
                            merchantCancelSuitOrgDTOList.add(merchantCancelSuitOrgDTO);
                        }
                        return merchantCancelSuitOrgDTOList;
                    }
                }
            }
        }
        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
    }

    public List<MerchantApplyRangeCancelSuitOrgDTO> getMerchantApplyRangeCancelSuitOrgDTO(MerchantCancelSuitOrgDTO merchantCancelSuitOrgDTO) throws Exception {
        List<MerchantApplyRange> merchantApplyRangeList;
        ArrayList<MerchantApplyRangeCancelSuitOrgDTO> merchantApplyRangeCancelSuitOrgList = new ArrayList<MerchantApplyRangeCancelSuitOrgDTO>();
        List orgIds = merchantCancelSuitOrgDTO.getOrgIds();
        HashMap<String, OrgUnitDTO> orgUnitMap = new HashMap<String, OrgUnitDTO>();
        List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(orgIds).withEnabled());
        if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
            for (OrgUnitDTO orgUnit : orgUnitList) {
                orgUnitMap.put(orgUnit.getId(), orgUnit);
            }
        }
        Long merchantId = Long.valueOf(merchantCancelSuitOrgDTO.getMerchantId());
        if (!CollectionUtils.isEmpty((Collection)orgIds) && !CollectionUtils.isEmpty(merchantApplyRangeList = this.queryMerchantApplyRangeCancelSuitOrg(orgIds, merchantId))) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getIsCreator().booleanValue()) continue;
                MerchantApplyRangeCancelSuitOrgDTO merchantApplyRangeCancelSuitOrgDTO = new MerchantApplyRangeCancelSuitOrgDTO();
                merchantApplyRangeCancelSuitOrgDTO.setBelongOrg(merchantApplyRange.getOrgId());
                merchantApplyRangeCancelSuitOrgDTO.setBelongOrgCode(((OrgUnitDTO)orgUnitMap.get(merchantApplyRange.getOrgId())).getCode());
                merchantApplyRangeCancelSuitOrgDTO.setBelongOrgName(((OrgUnitDTO)orgUnitMap.get(merchantApplyRange.getOrgId())).toMultiLang().getName().toString());
                merchantApplyRangeCancelSuitOrgDTO.setMerchantApplyRangeId(merchantApplyRange.getId().toString());
                merchantApplyRangeCancelSuitOrgDTO.setIsApplied(merchantApplyRange.getIsApplied());
                merchantApplyRangeCancelSuitOrgDTO.setIsCreator(merchantApplyRange.getIsCreator());
                merchantApplyRangeCancelSuitOrgDTO.setMerchantId(merchantCancelSuitOrgDTO.getMerchantId());
                merchantApplyRangeCancelSuitOrgDTO.setMerchantCode(merchantCancelSuitOrgDTO.getMerchantCode());
                merchantApplyRangeCancelSuitOrgDTO.setMerchantName(merchantCancelSuitOrgDTO.getMerchantName());
                merchantApplyRangeCancelSuitOrgDTO.setCreateOrg(merchantCancelSuitOrgDTO.getCreateOrg());
                merchantApplyRangeCancelSuitOrgList.add(merchantApplyRangeCancelSuitOrgDTO);
            }
        }
        return merchantApplyRangeCancelSuitOrgList;
    }

    public ResultList getResultList(String key) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("url", "/bill/status/getBatchDoProcess");
        map.put("asyncKey", key);
        ResultList resultList = new ResultList();
        resultList.addInfo(map);
        return resultList;
    }

    public List<Merchant> queryMerchantCancelSuitOrg(BillDataDto billDataDto) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Merchant> merchantList = this.queryMerchantCancelSuitOrgByMinId(billDataDto, currentRangeId, realMaxRowsValue);
        ArrayList<Merchant> merchants = new ArrayList<Merchant>(merchantList);
        while (merchantList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)merchantList.get(merchantList.size() - 1).getId();
            merchantList = this.queryMerchantCancelSuitOrgByMinId(billDataDto, currentRangeId, realMaxRowsValue);
            merchants.addAll(merchantList);
        }
        return merchants;
    }

    public List<Merchant> queryMerchantCancelSuitOrgByMinId(BillDataDto billDataDto, Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup queryConditionGroup = UIMetaUtils.handleQueryCondtion((FilterVO)billDataDto.getCondition());
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.isCreator").eq((Object)1), QueryCondition.name((String)"merchantAppliedDetail.merchantApplyRangeId.rangeType").eq((Object)1), QueryCondition.name((String)"id").gt((Object)minId)}));
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,createOrg");
        if (this.merchantCommonRefQueryService.dealCommonCondition(billDataDto.getCondition(), "principals.professSalesman")) {
            QueryJoin queryJoin = new QueryJoin("principals", ".merchantApplyRangeId=merchantAppliedDetail.merchantApplyRangeId", "inner join");
            querySchema.addJoin(new QueryJoin[]{queryJoin});
        }
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
    }

    public List<Merchant> queryMerchantByIdList(List<Long> merchantIdList) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIdList)}));
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code,name,createOrg");
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
    }

    public List<MerchantApplyRange> queryMerchantApplyRangeCancelSuitOrg(List<String> orgIds, Long merchantId) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false)}));
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,orgId,merchantId,isCreator,isApplied");
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
    }
}

