/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.ext.bill.utils.BillUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.common.enums.MicroServiceCodeEnum
 *  com.yonyoucloud.upc.common.enums.UpcFullNameEnum
 *  com.yonyoucloud.upc.constants.CheckDomainDeleteResultDto
 *  com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler
 *  com.yonyoucloud.upc.coredoc.pub.CommonRestDTO
 *  com.yonyoucloud.upc.coredoc.pub.DomainActionRuleRegister
 *  com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO
 *  com.yonyoucloud.upc.coredoc.pub.ExtDomainDeleteEnum
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.lang.BooleanUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.wltea.expression.ExpressionEvaluator
 */
package com.yonyoucloud.upc.coredoc.pub;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.ext.bill.utils.BillUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.common.enums.MicroServiceCodeEnum;
import com.yonyoucloud.upc.common.enums.UpcFullNameEnum;
import com.yonyoucloud.upc.constants.CheckDomainDeleteResultDto;
import com.yonyoucloud.upc.coredoc.IExtDomainDeleteHandler;
import com.yonyoucloud.upc.coredoc.pub.CommonRestDTO;
import com.yonyoucloud.upc.coredoc.pub.DomainActionRuleRegister;
import com.yonyoucloud.upc.coredoc.pub.DomainDeleteDTO;
import com.yonyoucloud.upc.coredoc.pub.ExtDomainDeleteEnum;
import com.yonyoucloud.upc.service.UpcCommonFieldCheckService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.lang.BooleanUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.wltea.expression.ExpressionEvaluator;

@Component
public class CheckDomainDeleteService
implements IExtDomainDeleteHandler {
    Logger logger = LoggerFactory.getLogger(CheckDomainDeleteService.class);
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private UpcCommonFieldCheckService upcCommonFieldCheckService;

    public void checkDomainDeleteDTO(String fullName, String billNum, BizObject bill) throws Exception {
        ExtDomainDeleteEnum extDomainDeleteEnum = ExtDomainDeleteEnum.find((String)fullName);
        if (extDomainDeleteEnum != null) {
            IExtDomainDeleteHandler iExtDomainDeleteHandler = (IExtDomainDeleteHandler)AppContext.getBean((String)extDomainDeleteEnum.getBeanName(), IExtDomainDeleteHandler.class);
            if (iExtDomainDeleteHandler != null) {
                ExecutorCompletionService<CheckDomainDeleteResultDto> completionService = new ExecutorCompletionService<CheckDomainDeleteResultDto>(this.ymsLongTaskExecutorService);
                DomainDeleteDTO domainDeleteDTO = iExtDomainDeleteHandler.getDomainDeleteDTO(bill, billNum, fullName);
                List domainActionRuleRegisterList = iExtDomainDeleteHandler.getDomainActionRuleRegisterList(domainDeleteDTO);
                if (!CollectionUtils.isEmpty((Collection)domainActionRuleRegisterList)) {
                    int num = 0;
                    for (DomainActionRuleRegister domainActionRuleRegister : domainActionRuleRegisterList) {
                        if (!this.getPredicateValue(domainActionRuleRegister.getDataRule(), iExtDomainDeleteHandler.getPredicateParamMap(bill, billNum, fullName))) continue;
                        completionService.submit(() -> {
                            if ("rest".equals(domainActionRuleRegister.getServiceType())) {
                                return iExtDomainDeleteHandler.checkDomainDeleteRest(domainActionRuleRegister, domainDeleteDTO);
                            }
                            if ("rpc".equals(domainActionRuleRegister.getServiceType())) {
                                return iExtDomainDeleteHandler.checkDomainDeleteRpc(domainActionRuleRegister, domainDeleteDTO);
                            }
                            return null;
                        });
                        ++num;
                    }
                    for (int i = 0; i < num; ++i) {
                        Future future = completionService.take();
                        if (future == null || future.get() == null || !"999".equals(((CheckDomainDeleteResultDto)future.get()).getCode())) continue;
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_DELETE_CHECK, new Object[]{((CheckDomainDeleteResultDto)future.get()).getBizObjectCode(), UpcFullNameEnum.getBillName((String)fullName), MicroServiceCodeEnum.getMicroServiceName((String)((CheckDomainDeleteResultDto)future.get()).getMicroServiceCode()), ((CheckDomainDeleteResultDto)future.get()).getMessage()});
                    }
                }
            } else {
                this.logger.error("\u5220\u9664\u9886\u57df\u6821\u9a8c\u4e2d\u6ce8\u518c\u6269\u5c55,\u672a\u627e\u5230\u5b9e\u73b0\u6269\u5c55\u65b9\u6cd5,\u8bf7\u5b9e\u73b0\u6269\u5c55\u89c4\u5219!");
                this.executeDefaultCheck(bill, billNum, fullName);
            }
        } else {
            this.executeDefaultCheck(bill, billNum, fullName);
        }
    }

    private void executeDefaultCheck(BizObject bill, String billNum, String fullName) throws Exception {
        ExecutorCompletionService<CheckDomainDeleteResultDto> completionService = new ExecutorCompletionService<CheckDomainDeleteResultDto>(this.ymsLongTaskExecutorService);
        DomainDeleteDTO domainDeleteDTO = this.getDomainDeleteDTO(bill, billNum, fullName);
        List<DomainActionRuleRegister> domainActionRuleRegisterList = this.getDomainActionRuleRegisterList(domainDeleteDTO);
        if (!CollectionUtils.isEmpty(domainActionRuleRegisterList)) {
            int num = 0;
            for (DomainActionRuleRegister domainActionRuleRegister : domainActionRuleRegisterList) {
                if (!this.getPredicateValue(domainActionRuleRegister.getDataRule(), this.getPredicateParamMap(bill, billNum, fullName))) continue;
                completionService.submit(() -> {
                    if ("rest".equals(domainActionRuleRegister.getServiceType())) {
                        return this.checkDomainDeleteRest(domainActionRuleRegister, domainDeleteDTO);
                    }
                    return null;
                });
                ++num;
            }
            for (int i = 0; i < num; ++i) {
                Future future = completionService.take();
                if (future == null || future.get() == null || !"999".equals(((CheckDomainDeleteResultDto)future.get()).getCode())) continue;
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_DELETE_CHECK, new Object[]{((CheckDomainDeleteResultDto)future.get()).getBizObjectCode(), UpcFullNameEnum.getBillName((String)fullName), MicroServiceCodeEnum.getMicroServiceName((String)((CheckDomainDeleteResultDto)future.get()).getMicroServiceCode()), ((CheckDomainDeleteResultDto)future.get()).getMessage()});
            }
        }
    }

    public DomainDeleteDTO getDomainDeleteDTO(BizObject bill, String billNum, String fullName) {
        DomainDeleteDTO domainDeleteDTO = new DomainDeleteDTO();
        ArrayList<String> ids = new ArrayList<String>();
        ids.add(bill.getId().toString());
        domainDeleteDTO.setIds(ids);
        domainDeleteDTO.setBillNum(billNum);
        domainDeleteDTO.setFullName(fullName);
        domainDeleteDTO.setCode(bill.getString("code"));
        domainDeleteDTO.setToken(InvocationInfoProxy.getYhtAccessToken());
        return domainDeleteDTO;
    }

    public List<DomainActionRuleRegister> getDomainActionRuleRegisterList(DomainDeleteDTO domainDeleteDTO) throws Exception {
        if (domainDeleteDTO == null) {
            return null;
        }
        if (domainDeleteDTO.getBillNum() == null || domainDeleteDTO.getFullName() == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_BILLNUM_OR_FULLNAME_NULL);
        }
        if (CollectionUtils.isEmpty((Collection)domainDeleteDTO.getIds())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_IDS_NULL);
        }
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"billNum").eq((Object)domainDeleteDTO.getBillNum()), QueryCondition.name((String)"fullName").eq((Object)domainDeleteDTO.getFullName()), QueryCondition.name((String)"action").eq((Object)"delete"), QueryCondition.name((String)"use").eq((Object)"Y"), QueryCondition.name((String)"ytenant").eq((Object)"0")})).addOrderBy("order");
        querySchema.setPartitionable(false);
        return MetaDaoHelper.queryObject((String)"coredoc.pub.DomainActionRuleRegister", (QuerySchema)querySchema, null);
    }

    public CheckDomainDeleteResultDto checkDomainDeleteRest(DomainActionRuleRegister domainActionRuleRegister, DomainDeleteDTO domainDeleteDTO) throws Exception {
        CommonRestDTO commonRestDTO = new CommonRestDTO();
        commonRestDTO.setUrl(domainActionRuleRegister.getUrl());
        commonRestDTO.setMicroServiceCode(domainActionRuleRegister.getMicroServiceCode());
        commonRestDTO.setFullName(domainActionRuleRegister.getFullName());
        commonRestDTO.setIds(domainDeleteDTO.getIds());
        commonRestDTO.setOrgId(domainDeleteDTO.getOrgId());
        commonRestDTO.setToken(domainDeleteDTO.getToken());
        commonRestDTO.setCode(domainDeleteDTO.getCode());
        return this.upcCommonFieldCheckService.checkCommonRest(commonRestDTO);
    }

    public boolean getPredicateValue(String dataRule, Map<String, Object> paramMap) {
        if (StringUtils.isEmpty((CharSequence)dataRule)) {
            return true;
        }
        try {
            String afterDataRule = BillUtils.getPredicateValue((String)dataRule, null, paramMap);
            ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
            Object obj = expressionEvaluator.evaluate(afterDataRule);
            return BooleanUtils.b((Object)obj);
        }
        catch (Exception e) {
            this.logger.info("getPredicateValue_error" + e.getMessage(), (Throwable)e);
            return false;
        }
    }

    public Map<String, Object> getPredicateParamMap(BizObject bill, String billNum, String fullName) {
        return null;
    }
}

