/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantTradeVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.dto.CustomerTradeDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantTradeVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dto.CustomerTradeDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class CustomerTradeServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(CustomerTradeServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<CustomerTradeDTO> addIdempotent(OpenAPIDTO<CustomerTradeDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            CustomerTradeDTO customerTradeDTO = (CustomerTradeDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)customerTradeDTO), HashMap.class);
            CustomerTrade customerTrade = new CustomerTrade();
            customerTrade.putAll(map);
            customerTrade.put("_fromApi", (Object)true);
            customerTrade.put("_status", (Object)EntityStatus.Insert);
            if (customerTradeDTO.getMultilingualName() != null) {
                customerTrade.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerTradeDTO.getMultilingualName()));
            }
            if (customerTradeDTO.getStopStatus() != null && !customerTradeDTO.getStopStatus().booleanValue()) {
                customerTrade.put("stopstatus", (Object)0);
            } else if (customerTradeDTO.getStopStatus() != null && customerTradeDTO.getStopStatus().booleanValue()) {
                customerTrade.put("stopstatus", (Object)1);
            } else if (customerTradeDTO.getStopStatus() == null) {
                customerTrade.put("stopstatus", (Object)0);
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customertrade", (Object)customerTrade, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            CustomerTradeDTO saveResult = new CustomerTradeDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u884c\u4e1a\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<CustomerTradeDTO> updateIdempotent(OpenAPIDTO<CustomerTradeDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            CustomerTradeDTO customerTradeDTO = (CustomerTradeDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)customerTradeDTO), HashMap.class);
            CustomerTrade customerTrade = new CustomerTrade();
            QueryConditionGroup queryConditionGroup = null;
            if (customerTradeDTO.getCode() != null && customerTradeDTO.getId() == null) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)customerTradeDTO.getCode())});
            } else {
                if (customerTradeDTO.getCode() == null && customerTradeDTO.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                }
                if (customerTradeDTO.getId() != null) {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerTradeDTO.getId())});
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,name,customerTradeCharacter").addCondition(queryConditionGroup);
            List queryResults = MetaDaoHelper.query((String)"aa.customertrade.CustomerTrade", (boolean)true, (QuerySchema)querySchema, null);
            if (queryResults == null || queryResults.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801264);
            }
            Map queryResult = (Map)queryResults.get(0);
            customerTrade.putAll(map);
            customerTrade.put("_fromApi", (Object)true);
            customerTrade.put("_status", (Object)EntityStatus.Update);
            customerTrade.setId(queryResult.get("id"));
            if (customerTradeDTO.getMultilingualName() != null) {
                customerTrade.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)customerTradeDTO.getMultilingualName()));
            }
            if (customerTradeDTO.getStopStatus() != null) {
                customerTrade.put("stopstatus", (Object)customerTradeDTO.getStopStatus());
            }
            if (queryResult != null && queryResult.get("customerTradeCharacter") != null && customerTrade.get("customerTradeCharacter") != null) {
                if (queryResult.get("customerTradeCharacter") instanceof Map) {
                    Map characterId = (Map)queryResult.get("customerTradeCharacter");
                    if (characterId.get("id") != null) {
                        Map character = (Map)customerTrade.get("customerTradeCharacter");
                        character.put("id", characterId.get("id").toString());
                        customerTrade.put("customerTradeCharacter", (Object)character);
                    }
                } else {
                    customerTrade.remove("customerTradeCharacter");
                }
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customertrade", (Object)customerTrade, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            CustomerTradeDTO saveResult = new CustomerTradeDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u884c\u4e1a\u66f4\u65b0-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Long customerTradeSave(String matchRule, MerchantTradeVO customerTradeVO) throws Exception {
        Long id = 0L;
        CustomerTrade customerTrade = this.convertCustomerTrade(matchRule, customerTradeVO);
        this.dataPreprocessing(matchRule, customerTrade);
        customerTrade.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_customertrade", (Object)customerTrade, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((CustomerTrade)result).getId();
        }
        return id;
    }

    public CoreDocJsonResult<MerchantTradeVO> queryCustomerTrade(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (!StringUtils.isEmpty((CharSequence)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (!StringUtils.isEmpty((CharSequence)batchApiQueryParamWithOrg.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)batchApiQueryParamWithOrg.getCode()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"aa.customertrade.CustomerTrade", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,order,parent,parent.code as parent___code,stopstatus,level,customerTradeCharacter").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue()).addOrderBy("level");
            List customerTradeList = MetaDaoHelper.queryObject((String)"aa.customertrade.CustomerTrade", (boolean)true, (QuerySchema)schema, null);
            ArrayList<MerchantTradeVO> customerTradeVOList = new ArrayList<MerchantTradeVO>();
            for (CustomerTrade customerTrade : customerTradeList) {
                MerchantTradeVO customerTradeVO = (MerchantTradeVO)JSON.parseObject((String)JSON.toJSONString((Object)customerTrade), MerchantTradeVO.class);
                if (customerTrade.get("name") != null) {
                    customerTradeVO.setName(new MultiLangText((Map)customerTrade.get("name")));
                }
                customerTradeVO.setCustomerTradeCharacter((Map)customerTrade.get("customerTradeCharacter"));
                customerTradeVOList.add(customerTradeVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(customerTradeVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public void dataPreprocessing(String matchRule, CustomerTrade customerTrade) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)customerTrade.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTradeList = MetaDaoHelper.queryObject((String)"aa.customertrade.CustomerTrade", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTradeList)) {
                customerTrade.setId(((CustomerTrade)customerTradeList.get(0)).getId());
                customerTrade.setEntityStatus(EntityStatus.Update);
            } else {
                customerTrade.setEntityStatus(EntityStatus.Insert);
                if (customerTrade.getStopstatus() == null) {
                    customerTrade.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (customerTrade != null && customerTrade.getId() != null && !"".equals(customerTrade.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerTrade.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTradeList = MetaDaoHelper.queryObject((String)"aa.customertrade.CustomerTrade", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTradeList)) {
                customerTrade.setId(((CustomerTrade)customerTradeList.get(0)).getId());
                customerTrade.setEntityStatus(EntityStatus.Update);
            } else {
                customerTrade.setEntityStatus(EntityStatus.Insert);
                if (customerTrade.getStopstatus() == null) {
                    customerTrade.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            customerTrade.setEntityStatus(EntityStatus.Insert);
            if (customerTrade.getStopstatus() == null) {
                customerTrade.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    public CustomerTrade convertCustomerTrade(String matchRule, MerchantTradeVO customerTradeVO) {
        CustomerTrade customerTrade = new CustomerTrade();
        boolean blank = false;
        if (customerTradeVO.getBlank() != null) {
            blank = customerTradeVO.getBlank();
        }
        if (null != customerTradeVO.getId()) {
            customerTrade.setId((Object)customerTradeVO.getId());
        }
        if (StringUtils.isEmpty((CharSequence)customerTradeVO.getCode())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_CODE_NOT_NULL);
        }
        customerTrade.setCode(customerTradeVO.getCode());
        if (ObjectUtils.isEmpty((Object)customerTradeVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_TRADE_NAME_NOT_NULL);
        }
        customerTrade.set("name", (Object)customerTradeVO.getName().toMap());
        if (customerTradeVO.getOrder() != null && !"".equals(customerTradeVO.getOrder())) {
            customerTrade.setOrder(customerTradeVO.getOrder());
        } else if (blank) {
            customerTrade.setOrder(null);
        }
        if (customerTradeVO.getParent() != null && !"".equals(customerTradeVO.getParent())) {
            customerTrade.setParent((Object)customerTradeVO.getParent());
            customerTrade.remove("parent___code");
        } else if (!StringUtils.isEmpty((CharSequence)customerTradeVO.getParent___code())) {
            customerTrade.set("parent___code", (Object)customerTradeVO.getParent___code());
        } else if (blank && customerTradeVO.getParent() == null) {
            customerTrade.setParent(null);
        }
        if (customerTradeVO.getStopstatus() != null) {
            customerTrade.setStopstatus(customerTradeVO.getStopstatus());
        }
        if (!StringUtils.isEmpty((CharSequence)customerTradeVO.getSourceUnique())) {
            customerTrade.setErpCode(customerTradeVO.getSourceUnique());
        }
        if (!ObjectUtils.isEmpty((Object)customerTradeVO.getCustomerTradeCharacter())) {
            customerTrade.put("customerTradeCharacter", (Object)customerTradeVO.getCustomerTradeCharacter());
        }
        return customerTrade;
    }

    public String delete(String customerTradeId, String customerTradeCode) throws Exception {
        if (StringUtils.isEmpty((CharSequence)customerTradeId) && StringUtils.isEmpty((CharSequence)customerTradeCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!StringUtils.isEmpty((CharSequence)customerTradeId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(customerTradeId)));
        } else if (!StringUtils.isEmpty((CharSequence)customerTradeCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)customerTradeCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,order,pubts,stopstatus,parent,parent.name as parent_name,level,isEnd").addCondition((ConditionExpression)queryConditionGroup);
        List customerTradeList = MetaDaoHelper.queryObject((String)"aa.customertrade.CustomerTrade", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)customerTradeList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)customerTradeList);
        bill.setBillnum("aa_customertradelist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}

