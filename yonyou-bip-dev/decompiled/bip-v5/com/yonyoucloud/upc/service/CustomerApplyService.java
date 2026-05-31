/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONArray
 *  com.alibaba.fastjson.JSONObject
 *  com.google.common.collect.Maps
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.customerapply.MerchantApplyPO
 *  com.yonyou.iuap.apdoc.coredoc.sqlconstant.merchantApply.MerchantApplyUpdateSQLConstant
 *  com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.org.dto.BizDeptDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.staff.model.MainJobInfoDto
 *  com.yonyou.iuap.staff.model.StaffImportantInfoDto
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.BeanListProcessor
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.sys.service.ApiUserService
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.voucher.enums.Status
 *  com.yonyoucloud.iuap.upc.dto.CustomerApplyDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyBpmCurrentAuditor
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectType
 *  com.yonyoucloud.upc.aa.customerapply.QueryListConditionDto
 *  com.yonyoucloud.upc.aa.customerapply.TripartiteCustomerApplyDto
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.aa.merchant.MerchantsManager
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.ScopeModel
 *  com.yonyoucloud.upc.constants.UPCConstant4Regex
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.customerapply.MerchantApplyPO;
import com.yonyou.iuap.apdoc.coredoc.sqlconstant.merchantApply.MerchantApplyUpdateSQLConstant;
import com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.org.dto.BizDeptDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.staff.model.MainJobInfoDto;
import com.yonyou.iuap.staff.model.StaffImportantInfoDto;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.BeanListProcessor;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.sys.service.ApiUserService;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.voucher.enums.Status;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.CustomerApplyDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyBpmCurrentAuditor;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectType;
import com.yonyoucloud.upc.aa.customerapply.QueryListConditionDto;
import com.yonyoucloud.upc.aa.customerapply.TripartiteCustomerApplyDto;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.aa.merchant.MerchantsManager;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.ScopeModel;
import com.yonyoucloud.upc.constants.UPCConstant4Regex;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.service.CustomerApplyAuditService;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.UpcDeptQueryService;
import com.yonyoucloud.upc.service.UpcOrgQueryService;
import com.yonyoucloud.upc.service.UpcStaffQueryService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.customerapply.CustomerApplyCheckService;
import com.yonyoucloud.upc.service.customerapply.CustomerApplySaveService;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="customerApplyService")
public class CustomerApplyService {
    Logger logger = LoggerFactory.getLogger(CustomerApplyService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    ApiUserService apiUserService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private UpcStaffQueryService upcStaffQueryService;
    @Autowired
    private UpcDeptQueryService upcDeptQueryService;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;
    @Autowired
    private UpcOrgQueryService upcOrgQueryService;
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private CustomerApplyAuditService customerApplyAuditService;
    @Autowired
    private MCServiceUntils mcServiceUntils;
    @Autowired
    CustomerApplyCheckService customerApplyCheckService;
    @Autowired
    CustomerApplySaveService customerApplySaveService;

    public void setApplyInit(BizObject bill) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        if (singleOrg.booleanValue()) {
            OrgUnitDTO orgUnitDTO = this.upcOrgQueryService.getOrgById(AppContext.getCurrentUser().getOrgId());
            if (!ObjectUtils.isEmpty((Object)orgUnitDTO)) {
                bill.set("applicationOrg", (Object)AppContext.getCurrentUser().getOrgId());
                bill.set("applicationOrg_Name", (Object)orgUnitDTO.toMultiLang().getName().toString());
                bill.set("applicationOrg_code", (Object)orgUnitDTO.getCode());
            }
        } else {
            bill.set("applicationOrg", null);
            bill.set("applicationOrg_Name", null);
            bill.set("applicationOrg_code", null);
        }
        StaffImportantInfoDto staffImportantInfoDto = this.upcStaffQueryService.getStaffInfoByUserId(InvocationInfoProxy.getUserid());
        if (!ObjectUtils.isEmpty((Object)staffImportantInfoDto)) {
            bill.put("bizOperator", (Object)staffImportantInfoDto.getId());
            bill.put("bizOperator_Name", (Object)staffImportantInfoDto.getName());
            List mainJobInfoDtoList = staffImportantInfoDto.getMainjobinfo();
            if (!CollectionUtils.isEmpty((Collection)mainJobInfoDtoList)) {
                List orgIdList;
                String applyDepartmentId = null;
                String applicationOrgId = null;
                Date beginDate = null;
                for (MainJobInfoDto mainJobInfoDto : mainJobInfoDtoList) {
                    if (beginDate != null && !beginDate.before(mainJobInfoDto.getBeginDate())) continue;
                    beginDate = mainJobInfoDto.getBeginDate();
                    applyDepartmentId = mainJobInfoDto.getDeptId();
                    applicationOrgId = mainJobInfoDto.getOrgId();
                }
                if (singleOrg.booleanValue()) {
                    BizDeptDTO bizDeptById = this.upcDeptQueryService.getBizDeptById(applyDepartmentId);
                    if (!ObjectUtils.isEmpty((Object)bizDeptById)) {
                        bill.put("applyDepartment", (Object)applyDepartmentId);
                        bill.put("applyDepartment_Name", (Object)bizDeptById.toMultiLang().getName().toString());
                        bill.put("applyDepartment_code", (Object)bizDeptById.getCode());
                    }
                } else if (applicationOrgId != null && applyDepartmentId != null && !CollectionUtils.isEmpty((Collection)(orgIdList = this.iServiceIsolateService.findMainOrgPermission(AppContext.getCurrentUser().getYhtUserId(), "aa_customerapply", AppContext.getCurrentUser().getYhtTenantId()))) && orgIdList.contains(applicationOrgId)) {
                    BizDeptDTO bizDeptById;
                    OrgUnitDTO orgUnitDTO = this.upcOrgQueryService.getOrgById(applicationOrgId);
                    if (!ObjectUtils.isEmpty((Object)orgUnitDTO)) {
                        bill.set("applicationOrg", (Object)applicationOrgId);
                        bill.set("applicationOrg_Name", (Object)orgUnitDTO.toMultiLang().getName().toString());
                        bill.set("applicationOrg_code", (Object)orgUnitDTO.getCode());
                    }
                    if (!ObjectUtils.isEmpty((Object)(bizDeptById = this.upcDeptQueryService.getBizDeptById(applyDepartmentId)))) {
                        bill.put("applyDepartment", (Object)applyDepartmentId);
                        bill.put("applyDepartment_Name", (Object)bizDeptById.toMultiLang().getName().toString());
                        bill.put("applyDepartment_code", (Object)bizDeptById.getCode());
                    }
                }
            }
        }
    }

    public void setInsertDate(CustomerApply customerApply) {
        customerApply.setApplyTime(new Date());
        customerApply.setEffectStatus(CustomerEffectStatus.pending);
        if (null == customerApply.getEffectType()) {
            customerApply.setEffectType(CustomerEffectType.immediately);
        }
        short verifystatus = 0;
        customerApply.setVerifystate(Short.valueOf(verifystatus));
        customerApply.setStatus(Status.newopen);
    }

    public boolean compareEffectTime(Date effectTime) {
        long millis;
        long time = effectTime.getTime();
        return time <= (millis = System.currentTimeMillis());
    }

    public void fillInfoData(CustomerApply customerApply) {
        String customerData = customerApply.getCustomerData();
        if (null != customerData) {
            Map customer = (Map)JSONObject.parseObject((String)customerData, Map.class);
            customer.put("invoicingCustomersId_name", customer.get("name"));
            customer.remove("id");
            customer.remove("pubts");
            customer.remove("createTime");
            customer.remove("createDate");
            customer.remove("modifyTime");
            customer.remove("modifyDate");
            customer.remove("creator");
            customer.remove("modifier");
            customer.remove("creatorId");
            customer.remove("modifierId");
            customer.remove("isDeleted");
            customer.remove("stopstatus");
            customer.remove("stoptime");
            customer.remove("auditor");
            customer.remove("auditorId");
            customer.remove("auditTime");
            customer.remove("auditDate");
            customer.remove("_status");
            customer.remove("resubmitCheckKey");
            customerApply.putAll(customer);
            for (String key : customer.keySet()) {
                Object value = customer.get(key);
                if (value instanceof JSONObject || value instanceof JSONArray) continue;
                key = key.contains("!") ? "applyCustomer." + key.replaceAll("!", ".") : "applyCustomer." + key;
                customerApply.put(key, value);
            }
        }
    }

    public void eventOnAudit(Map bill) throws Exception {
        this.logger.info("\u6d88\u606f\u4e2d\u5fc3\u56de\u8c03\u5ba2\u6237\u7533\u8bf7\u5355\u5ba1\u6838\u7ed3\u679c\u5904\u7406\u5f00\u59cb:{}", (Object)bill);
        if (null == bill || null == bill.get("userObject")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        JSONObject obj = JSONObject.parseObject((String)bill.get("userObject").toString());
        Map customerapplydata = (Map)obj.get((Object)"customerapplyData");
        if (customerapplydata.get("id") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800828);
        }
        long id = Long.parseLong(customerapplydata.get("id").toString());
        try {
            this.auditAddApplyById(id);
        }
        catch (Exception e) {
            this.logger.error("\u6d88\u606f\u4e2d\u5fc3\u56de\u8c03\u5ba2\u6237\u7533\u8bf7\u5355\u5ba1\u6838\u7ed3\u679c\u5904\u7406\u5f02\u5e38:{}" + e.getMessage(), (Throwable)e);
            CustomerApply customerApply = new CustomerApply();
            customerApply.setId((Object)id);
            String failInfo = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F3", (String)"\u5904\u7406\u5ba2\u6237\u6570\u636e\u5f02\u5e38\uff1a") + e.getMessage();
            failInfo = failInfo.length() > 512 ? failInfo.substring(0, 512) : failInfo;
            customerApply.setFailInfo(failInfo);
            customerApply.setEffectStatus(CustomerEffectStatus.fail);
            customerApply.setStatus(Status.confirmed);
            customerApply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
        }
    }

    public void auditCustomerApply(Long customerApplyId) throws Exception {
        try {
            this.auditAddApplyById(customerApplyId);
        }
        catch (Exception e) {
            this.logger.error("\u8c03\u5ba2\u6237\u7533\u8bf7\u5355\u5ba1\u6838\u7ed3\u679c\u5904\u7406\u5f02\u5e38:{}", (Object)e.getMessage(), (Object)e);
            CustomerApply customerApply = new CustomerApply();
            customerApply.setId((Object)customerApplyId);
            String failInfo = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802F3", (String)"\u5904\u7406\u5ba2\u6237\u6570\u636e\u5f02\u5e38\uff1a") + e.getMessage();
            failInfo = failInfo.length() > 512 ? failInfo.substring(0, 512) : failInfo;
            customerApply.setFailInfo(failInfo);
            customerApply.setEffectStatus(CustomerEffectStatus.fail);
            customerApply.setStatus(Status.confirmed);
            customerApply.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
        }
    }

    private void auditAddApplyById(long id) throws Exception {
        boolean isAudit;
        CustomerApply customerApply = (CustomerApply)MetaDaoHelper.findById((String)"aa.customerapply.CustomerApply", (Object)id);
        String status = customerApply.get("status").toString();
        String effectStatus = customerApply.get("effectStatus").toString();
        Boolean isWfControlled = customerApply.getIsWfControlled();
        boolean bl = isAudit = isWfControlled == false && "1".equals(status) || isWfControlled != false && !"2".equals(effectStatus);
        if (!isAudit) {
            this.logger.error("\u5ba2\u6237\u7533\u8bf7\u5355\u5ba1\u6838\u5b8c\u6210\u6267\u884c\u5224\u65ad\u662f\u5426\u7ec8\u5ba1\u72b6\u6001:{}", (Object)customerApply);
            return;
        }
        if (CustomerEffectStatus.success == customerApply.getEffectStatus() || CustomerEffectStatus.fail == customerApply.getEffectStatus()) {
            this.logger.error("\u5ba2\u6237\u7533\u8bf7\u5355\u5ba1\u6838\u5b8c\u6210\u6267\u884c\u5224\u65ad\u5df2\u7ecf\u5ba1\u6838\u8fc7\u7684\u5355\u636e\uff0c\u4e0d\u518d\u5ba1\u6838:{}", (Object)customerApply);
            return;
        }
        if (CustomerApplyType.add == customerApply.getApplyType()) {
            this.auditAddApply(customerApply);
        } else if (CustomerApplyType.modify == customerApply.getApplyType()) {
            this.auditModifyApply(customerApply);
        } else if (CustomerApplyType.ADD_RANGE == customerApply.getApplyType()) {
            this.auditCustomerApplyAddRange(customerApply);
        }
    }

    public void auditModifyApply(CustomerApply customerApply) throws Exception {
        Map customerData = (Map)JSONObject.parseObject((String)customerApply.getCustomerData(), Map.class);
        if (customerData.get("merchantApplyRanges") != null) {
            List merchantApplyRanges = (List)customerData.get("merchantApplyRanges");
            List merchantApplyRangesStatus = merchantApplyRanges.stream().filter(m -> m.get("_status") != null).collect(Collectors.toList());
            customerData.put("merchantApplyRanges", merchantApplyRangesStatus);
        }
        if (null != customerData.get("merchantApplyRangeId")) {
            List range = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeExt", (QuerySchema)QuerySchema.create().addSelect(new String[]{"isCreator", "isApplied"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(customerData.get("merchantApplyRangeId"))})));
            if (null == range || range.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800829, new Object[]{customerApply.getCode()});
            }
            HashMap params = new HashMap(3);
            params.put("@merchantApplyRangeId", customerData.get("merchantApplyRangeId"));
            params.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            params.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            BillDataDto bill = new BillDataDto("aa_merchant", customerApply.getApplyCustomer().toString());
            bill.setMapCondition(params);
            Map detail = this.billService.detail(bill);
            detail.put("merchantApplyRangeId", customerData.get("merchantApplyRangeId"));
            detail.put("isCreator", ((Map)range.get(0)).get("isCreator"));
            detail.put("isApplied", ((Map)range.get(0)).get("isApplied"));
            detail.put("_status", EntityStatus.Update);
            detail.remove("merchantsManager");
            detail.remove("merchantRole");
            detail.putAll(customerData);
            detail.put("needUpdateCode", false);
            this.saveApplyCustomerData(customerApply, detail);
        }
    }

    public void auditAddApply(CustomerApply customerApply) throws Exception {
        HashMap<String, Object> detail = new HashMap<String, Object>(64);
        Map customerData = (Map)JSONObject.parseObject((String)customerApply.getCustomerData(), Map.class);
        detail.putAll(customerData);
        detail.put("_status", EntityStatus.Insert);
        detail.put("needUpdateCode", false);
        detail.put("creatorId", customerApply.getCreatorId());
        detail.put("creator", customerApply.getCreator());
        detail.put("merchantAppliedDetail!creator", customerApply.getCreator());
        detail.put("merchantAppliedDetail!creatorId", customerApply.getCreatorId());
        this.saveApplyCustomerData(customerApply, detail);
    }

    private void saveApplyCustomerData(CustomerApply customerApply, Map detail) throws Exception {
        Object codeObj = detail.get("code");
        detail.put("merchantAppliedDetail!modifier", customerApply.getCreator());
        detail.put("merchantAppliedDetail!modifierId", customerApply.getCreatorId());
        QuerySchema schema = QuerySchema.create().addSelect("yhtUserId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerApply.getCreatorId())}));
        List results = MetaDaoHelper.query((String)"base.user.User", (QuerySchema)schema, (String)"bip-usercenter");
        if (!CollectionUtils.isEmpty((Collection)results)) {
            detail.put("businessLogCreatorYhtUserId", ((Map)results.get(0)).get("yhtUserId"));
        }
        detail.put("customerapply", "customerapply");
        String readlCode = Objects.nonNull(codeObj) ? (String)codeObj : null;
        BillDataDto saveDto = new BillDataDto();
        Object detailObject = JSON.toJSON((Object)detail);
        String escape = UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(detailObject);
        saveDto.setData((Object)escape);
        saveDto.setBillnum("aa_merchant");
        CustomerApply applyupdate = new CustomerApply();
        applyupdate.setId(customerApply.getId());
        Object needUpdateCode = detail.get("needUpdateCode");
        boolean updateCode = needUpdateCode != null && Boolean.valueOf(needUpdateCode.toString()) == false;
        try {
            this.customerApplyAuditService.saveMerchant(saveDto, applyupdate, customerApply, detail, readlCode, updateCode);
        }
        catch (Exception e) {
            String failInfo = e.getMessage().length() > 512 ? e.getMessage().substring(0, 512) : e.getMessage();
            applyupdate.setFailInfo(failInfo);
            applyupdate.setEffectStatus(CustomerEffectStatus.fail);
            applyupdate.setStatus(Status.confirmed);
            this.logger.error("saveApplyCustomerData warn : ", (Throwable)e);
        }
        applyupdate.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)applyupdate);
    }

    public void auditCustomerApplyAddRange(CustomerApply customerApply) throws Exception {
        CustomerApply applyUpdate = new CustomerApply();
        applyUpdate.setId(customerApply.getId());
        try {
            this.kafkaMerchantAddRangeService.sendCustomerApplyAddRange(customerApply);
        }
        catch (Exception e) {
            String failInfo = e.getMessage().length() > 512 ? e.getMessage().substring(0, 512) : e.getMessage();
            applyUpdate.setFailInfo(failInfo);
            applyUpdate.setEffectStatus(CustomerEffectStatus.fail);
            applyUpdate.setStatus(Status.confirmed);
            applyUpdate.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)applyUpdate);
            this.logger.error("auditCustomerApplyAddRange_warn:", (Throwable)e);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void scanCustomerApplyAuditAndNotSuccess() {
        String requestId = UUID.randomUUID().toString();
        try {
            if (RedisTool.tryGetLock((String)"productcenter_timing_lock_customerapply_key", (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
                Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
                List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
                for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
                    List merchantApplyPOList = ymsJdbcApi.queryForList(MerchantApplyUpdateSQLConstant.getPendingMerchantApply, (ResultSetProcessor)new BeanListProcessor((BaseEntity)new MerchantApplyPO()));
                    StringBuffer idBuffer = new StringBuffer();
                    if (CollectionUtils.isEmpty((Collection)merchantApplyPOList)) continue;
                    merchantApplyPOList.forEach(merchantApplyPO -> RobotExecutors.runAs((String)merchantApplyPO.getYtenant(), () -> {
                        try {
                            this.customerApplySaveService.saveMerchant(ymsJdbcApi, merchantApplyPO.getId());
                        }
                        catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }));
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u5b9a\u65f6\u626b\u63cf\u5ef6\u8fdf\u751f\u6548\u6570\u636e\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25", (Throwable)e);
        }
        finally {
            RedisTool.releaseLock((String)"productcenter_timing_lock_customerapply_key", (String)requestId);
        }
    }

    @Transactional(propagation=Propagation.REQUIRED)
    public void processCustomerApplyAudit(CustomerApply apply) throws Exception {
        Callable<Integer> callable;
        Integer res;
        Map tenants = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.customerapply.getTenantById", (Object)apply);
        String yhtTenantId = tenants.get("tenantcenter_id").toString();
        if (null != apply.getId() && (res = (Integer)RobotExecutors.runAs((String)yhtTenantId, callable = () -> {
            try {
                apply.setEffectStatus(CustomerEffectStatus.dealing);
                SqlHelper.update((String)"com.yonyoucloud.upc.mapper.customerapply.updateEffectStatus", (Object)apply);
                this.auditCustomerApply((Long)apply.getId());
                return 1;
            }
            catch (Exception e) {
                this.logger.error("processCustomerApplyAudit warn : ", (Throwable)e);
                return -1;
            }
        })) < 0) {
            throw new Exception("update fail");
        }
    }

    public BillDataDto generateByApplycode(TripartiteCustomerApplyDto customerApplyDto) {
        if (customerApplyDto.getCodeList() != null) {
            customerApplyDto.getCodeList().forEach(codeTimestampObj -> {
                if (codeTimestampObj != null && codeTimestampObj.getEffectTime() != null && codeTimestampObj.getEffectTime().before(new Date())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800830);
                }
            });
        }
        Map<String, Timestamp> codeDateMap = customerApplyDto.getCodeList().stream().collect(Collectors.toMap(item -> item.getCode(), item -> {
            Date date = item.getEffectTime();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
            return Timestamp.valueOf(localDateTime);
        }, (k1, k2) -> k1));
        List codeList = customerApplyDto.getCodeList().stream().map(item -> item.getCode()).collect(Collectors.toList());
        Long tenantId = customerApplyDto.getTenantId();
        BillDataDto billDataDto = null;
        String fields = "id,applyCode";
        QueryConditionGroup query = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)tenantId), QueryCondition.name((String)"applyCode").in(codeList)});
        QuerySchema schema = QuerySchema.create().addSelect(fields).addCondition((ConditionExpression)query);
        try {
            List list = MetaDaoHelper.query((String)"aa.customerapply.CustomerApply", (QuerySchema)schema);
            if (!list.isEmpty()) {
                List ids = list.stream().map(item -> item.get("id").toString()).collect(Collectors.toList());
                List mapList = ids.stream().map(item -> {
                    HashMap params = new HashMap();
                    BillDataDto bill = new BillDataDto("aa_customerapply", item);
                    bill.setMapCondition(params);
                    Map map = null;
                    try {
                        map = this.upcBillService.detail(bill);
                        map.put("effectType", 1);
                        map.put("effectTime", codeDateMap.get(map.get("applyCode")));
                    }
                    catch (Exception e) {
                        this.logger.error("upcBillService.detail warn : ", (Throwable)e);
                        map = null;
                    }
                    return map;
                }).filter(item -> Objects.nonNull(item)).collect(Collectors.toList());
                billDataDto = new BillDataDto();
                billDataDto.setBillnum("aa_customerapplylist");
                billDataDto.setData(JSON.toJSON(mapList));
                HashMap params = Maps.newHashMap();
                params.put("isNewTpl", "true");
                params.put("serviceCode", "aa_customerapply");
                params.put("cmdname", "cmdAudit");
                params.put("terminalType", "1");
                billDataDto.setParameters((Map)params);
            }
        }
        catch (Exception e) {
            this.logger.error("auditByApplycode query warn : ", (Throwable)e);
        }
        return billDataDto;
    }

    public Pager queryList(QueryListConditionDto queryListConditionDto) throws Exception {
        String checkRes = queryListConditionDto.checkParams();
        if (Objects.nonNull(checkRes)) {
            throw new CoreDocBusinessException(checkRes);
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_customerapplylist");
        if (StringUtils.isNotEmpty((CharSequence)InvocationInfoProxy.getTenantid())) {
            queryListConditionDto.setYtenantId(InvocationInfoProxy.getTenantid());
        }
        CustomerApply customerapply = new CustomerApply();
        if (queryListConditionDto.getApplyDepartmentCode() != null) {
            customerapply.put("applyDepartmentCode", (Object)queryListConditionDto.getApplyDepartmentCode());
        }
        if (queryListConditionDto.getBizOperatorCode() != null) {
            customerapply.put("bizOperatorCode", (Object)queryListConditionDto.getBizOperatorCode());
        }
        DataTransferUtils.fill((String)"aa_customerApply", (String)"aa.customerapply.CustomerApply", (Object)customerapply, (int)2);
        if (customerapply.getApplyDepartment() != null && queryListConditionDto.getApplyDepartment() == null) {
            queryListConditionDto.setApplyDepartment(customerapply.getApplyDepartment());
        }
        if (customerapply.getBizOperator() != null && queryListConditionDto.getBizOperator() == null) {
            queryListConditionDto.setBizOperator(customerapply.getBizOperator());
        }
        FilterVO filters = new FilterVO();
        if (queryListConditionDto.getMerchantCode() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantCode", "eq", (Object)queryListConditionDto.getMerchantCode())});
        }
        if (queryListConditionDto.getMerchantName() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("merchantName", "eq", (Object)queryListConditionDto.getMerchantName())});
        }
        if (queryListConditionDto.getApplyType() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("applyType", "eq", (Object)queryListConditionDto.getApplyType())});
        }
        if (queryListConditionDto.getApplyCode() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("applyCode", "eq", (Object)queryListConditionDto.getApplyCode())});
        }
        if (queryListConditionDto.getBizOperator() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("bizOperator", "eq", (Object)queryListConditionDto.getBizOperator())});
        }
        if (queryListConditionDto.getCreateDate() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("createDate", "eq", (Object)queryListConditionDto.getCreateDate())});
        }
        if (queryListConditionDto.getAuditor() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("auditor", "eq", (Object)queryListConditionDto.getAuditor())});
        }
        if (queryListConditionDto.getCreator() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("creator", "eq", (Object)queryListConditionDto.getCreator())});
        }
        if (queryListConditionDto.getEffectType() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("effectType", "eq", (Object)queryListConditionDto.getEffectType())});
        }
        if (queryListConditionDto.getEffectStatus() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("effectStatus", "eq", (Object)queryListConditionDto.getEffectStatus())});
        }
        if (queryListConditionDto.getEffectTime() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("effectTime", "eq", (Object)queryListConditionDto.getEffectTime())});
        }
        if (queryListConditionDto.getVerifyState() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("verifystate", "eq", (Object)queryListConditionDto.getVerifyState())});
        }
        if (queryListConditionDto.getApplyDepartment() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("applyDepartment", "eq", (Object)queryListConditionDto.getApplyDepartment())});
        }
        if (queryListConditionDto.getPrincipalProfessSalesman() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("principalProfessSalesman", "eq", (Object)queryListConditionDto.getPrincipalProfessSalesman())});
        }
        if (queryListConditionDto.getPrincipalSpecialManagementDep() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("principalSpecialManagementDep", "eq", (Object)queryListConditionDto.getPrincipalSpecialManagementDep())});
        }
        if (queryListConditionDto.getTimestamp() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("pubts", "egt", (Object)queryListConditionDto.getTimestamp())});
        }
        if (queryListConditionDto.getPubts() != null) {
            filters.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("pubts", ConditionOperator.egt.name(), (Object)queryListConditionDto.getPubts())});
        }
        billDataDto.setCondition(filters);
        QueryPagerVo pagerVo = new QueryPagerVo();
        Integer pageIndex = queryListConditionDto.getPageIndex();
        Integer pageSize = queryListConditionDto.getPageSize();
        if (pageSize == null || pageSize > UpcAPiTool.MAX_COUNT) {
            pageSize = UpcAPiTool.MAX_COUNT;
        }
        pagerVo.setPageIndex(pageIndex.intValue());
        pagerVo.setPageSize(pageSize.intValue());
        billDataDto.setPage(pagerVo);
        Pager pager = this.billService.queryByPage(billDataDto);
        return pager;
    }

    public void repush(Long customerApplyId) throws Exception {
        if (customerApplyId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800089);
        }
        CustomerApply originalCustomerApply = (CustomerApply)MetaDaoHelper.getById((String)"aa.customerapply.CustomerApply", (Long)customerApplyId);
        CustomerApply customerApply = new CustomerApply();
        customerApply.setId((Object)customerApplyId);
        customerApply.setEffectStatus(CustomerEffectStatus.dealing);
        customerApply.setEntityStatus(EntityStatus.Update);
        customerApply.setFailInfo(null);
        if (originalCustomerApply.getApplyType() == CustomerApplyType.ADD_RANGE && !CollectionUtils.isEmpty((Collection)originalCustomerApply.customerApplyAddRanges())) {
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
            this.auditCustomerApply(customerApplyId);
        } else if ((originalCustomerApply.getApplyType() == CustomerApplyType.add || originalCustomerApply.getApplyType() == CustomerApplyType.modify) && null != originalCustomerApply.getCustomerData()) {
            MetaDaoHelper.update((String)"aa.customerapply.CustomerApply", (BizObject)customerApply);
            this.auditCustomerApply(customerApplyId);
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800090, new Object[]{customerApply.getCode()});
        }
    }

    public CoreDocJsonResult<CustomerApplyDTO> customerApplyAdd(CustomerApplyDTO customerApplyDTO) {
        try {
            customerApplyDTO.setApplyType("0");
            Long id = this.saveCustomerApplyOpenApi(customerApplyDTO, EntityStatus.Insert);
            CustomerApplyDTO resultDTO = new CustomerApplyDTO();
            if (id != null) {
                resultDTO.setId(id);
                return CoreDocJsonResult.success((Object)resultDTO);
            }
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u7533\u8bf7openApi\u65b0\u589e\u4fdd\u5b58\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Long saveCustomerApplyOpenApi(CustomerApplyDTO customerApplyDTO, EntityStatus entityStatus) throws Exception {
        String name;
        Long id = null;
        if (customerApplyDTO.getCustomerData() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800831);
        }
        CustomerApply customerApply = new CustomerApply();
        Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)customerApplyDTO), HashMap.class);
        customerApply.putAll(map);
        customerApply.put("_fromApi", (Object)true);
        customerApply.put("_status", (Object)EntityStatus.Insert);
        Merchant merchant = MerchantOpenApiUtils.getMerchant((MerchantOpenApiSaveDTO)customerApplyDTO.getCustomerData());
        this.setMerchantPoiExcelRowNum(merchant);
        DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)merchant, (int)3);
        MerchantOpenApiUtils.checkTransfer((Merchant)merchant);
        this.merchantCheckService.beforeDataPreprocessCheckFromApi(merchant);
        this.merchantCheckService.dataPreprocessing(merchant, entityStatus);
        this.merchantCheckService.theBeforeSaveCheckFromApi(merchant);
        if (CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            this.upcMerchantQueryService.setOrgs4U8c(merchant, singleOrg, Boolean.valueOf(true));
        }
        if (merchant.get("timeZone_name") != null) {
            merchant.put("timeZone_Name", merchant.get("timeZone_name"));
        }
        DataTransferUtils.fill((String)"aa_customerapply", (String)"aa.customerapply.CustomerApply", (Object)customerApply, (int)3);
        if (CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800832);
        }
        this.setMerchantDefault(merchant);
        this.checkMerchantDefault(merchant);
        this.checkRepeatData(merchant);
        if (merchant.getEnterpriseNature() != null && merchant.getEnterpriseNature().getValue() == 1 && !MerchantUtils.isExists((Map)merchant, (String)"personName")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800406);
        }
        if (customerApplyDTO.getCustomerData().getName() != null && (name = String.valueOf(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, (String)InvocationInfoProxy.getLocale()))) != null && merchant.getEnterpriseNature() != EnterpriseNature.personal) {
            this.mcServiceUntils.validateDocUniquenessAndThrow((BizObject)merchant, "aa.merchant.Merchant");
            this.customerApplyCheckService.uniqueCheckWithCustomerApply((BizObject)merchant, customerApply);
        }
        this.handleMerchant(merchant);
        this.removeConvertMerchant(merchant);
        customerApply.setCustomerData(JSON.toJSONString((Object)merchant));
        if (customerApplyDTO.getWfControlled() != null) {
            customerApply.put("isWfControlled", (Object)customerApplyDTO.getWfControlled());
        } else {
            customerApply.put("isWfControlled", (Object)false);
        }
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_customerapply");
        billDataDto.setAction("save");
        billDataDto.setData((Object)customerApply);
        billDataDto.setFromApi(true);
        billDataDto.setConvertType(Integer.valueOf(3));
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((CustomerApply)result).getId();
        }
        return id;
    }

    public void setMerchantDefault(Merchant merchant) {
        MerchantRoleInfo merchantRoleInfo;
        MerchantApplyRangeDetail merchantApplyRangeDetail;
        if (merchant.getRetailInvestors() == null) {
            merchant.setRetailInvestors(Boolean.valueOf(false));
        }
        if (merchant.getInternalOrg() == null) {
            merchant.setInternalOrg(Boolean.valueOf(false));
        }
        if (merchant.getScopeModel() == null) {
            merchant.setScopeModel(ScopeModel.productionAndProcess);
        }
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail())) {
            merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0);
            if (merchantApplyRangeDetail.getSignBack() == null) {
                merchantApplyRangeDetail.setSignBack(Boolean.valueOf(false));
            }
            if (merchantApplyRangeDetail.getStopstatus() == null) {
                merchantApplyRangeDetail.setStopstatus(Boolean.valueOf(false));
            }
            if (merchantApplyRangeDetail.getIsTradeCustomers() == null) {
                merchantApplyRangeDetail.setIsTradeCustomers("0");
            }
        } else {
            merchantApplyRangeDetail = new MerchantApplyRangeDetail();
            merchantApplyRangeDetail.setSignBack(Boolean.valueOf(false));
            merchantApplyRangeDetail.setStopstatus(Boolean.valueOf(false));
            merchantApplyRangeDetail.setIsTradeCustomers("0");
            ArrayList<MerchantApplyRangeDetail> applyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            applyRangeDetailList.add(merchantApplyRangeDetail);
            merchant.setMerchantAppliedDetail(applyRangeDetailList);
        }
        if (merchant.merchantRole() != null) {
            merchantRoleInfo = merchant.merchantRole();
            if (merchantRoleInfo.getMerchantOptions() == null) {
                merchantRoleInfo.setMerchantOptions(Boolean.valueOf(false));
            }
        } else {
            merchantRoleInfo = new MerchantRoleInfo();
            merchantRoleInfo.setMerchantOptions(Boolean.valueOf(false));
            merchant.setMerchantRole(merchantRoleInfo);
        }
    }

    public void handleMerchant(Merchant merchant) {
        MerchantsManager merchantsManager;
        MerchantRoleInfo merchantRoleInfo;
        Map merchantApplyRangeDetail;
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail()) && (merchantApplyRangeDetail = (Map)merchant.merchantAppliedDetail().get(0)) != null && !CollectionUtils.isEmpty(merchantApplyRangeDetail.keySet())) {
            for (String key : merchantApplyRangeDetail.keySet()) {
                merchant.put("merchantAppliedDetail!" + key, merchantApplyRangeDetail.get(key));
            }
            merchant.remove("merchantAppliedDetail");
        }
        if (merchant.merchantRole() != null && (merchantRoleInfo = merchant.merchantRole()) != null && !CollectionUtils.isEmpty(merchantRoleInfo.keySet())) {
            for (String key : merchantRoleInfo.keySet()) {
                merchant.put("merchantRole!" + key, merchantRoleInfo.get(key));
            }
            merchant.remove("merchantRole");
        }
        if (merchant.merchantsManager() != null && (merchantsManager = merchant.merchantsManager()) != null && !CollectionUtils.isEmpty(merchantsManager.keySet())) {
            for (String key : merchantsManager.keySet()) {
                merchant.put("merchantsManager!" + key, merchantsManager.get(key));
            }
            merchant.remove("merchantsManager");
        }
    }

    public void removeConvertMerchant(Merchant merchant) {
        merchant.remove("_convert_merchantAddressInfos");
        merchant.remove("_convert_merchantContacterInfos");
        merchant.remove("_convert_merchantAgentFinancialInfos");
        merchant.remove("_convert_merchantAgentInvoiceInfos");
        merchant.remove("_convert_merchantApplyRanges");
        merchant.remove("_convert_merchantRole");
        merchant.remove("_convert_merchantsManager");
        merchant.remove("_convert_customerAreas");
        merchant.remove("_convert_principals");
        merchant.remove("_convert_invoicingCustomerss");
        merchant.remove("_convert_merchantQualificationDocuments");
        merchant.remove("_convert_merchantAppliedDetail");
    }

    public void checkMerchantDefault(Merchant merchant) throws Exception {
        HashSet checkIdExist = new HashSet();
        this.checkCustomerArea(merchant);
        this.checkPrincipals(merchant);
        this.checkInvoicingCustomers(merchant);
        this.checkAddressInfo(merchant);
        this.checkContacter(merchant);
        this.checkAgentFinancial(merchant);
        this.checkAgentInvoices(merchant);
    }

    public void checkRepeatData(Merchant merchant) throws Exception {
        List invoicingCustomersList;
        List principalList;
        List customerAreaList = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            HashSet<Long> saleAreaSet = new HashSet<Long>();
            for (CustomerArea customerArea : customerAreaList) {
                saleAreaSet.add(customerArea.getSaleAreaId());
            }
            if (customerAreaList.size() != saleAreaSet.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800412);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(principalList = merchant.principals()))) {
            HashMap<String, String> map0 = new HashMap<String, String>();
            String code = null;
            for (Principal principal : principalList) {
                if (principal.getProfessSalesman() != null && principal.getSpecialManagementDep() != null) {
                    code = "professSalesman" + principal.getProfessSalesman().trim() + ",specialManagementDep" + principal.getSpecialManagementDep().trim();
                } else if (principal.getProfessSalesman() == null && principal.getSpecialManagementDep() != null) {
                    code = "specialManagementDep" + principal.getSpecialManagementDep().trim();
                } else if (principal.getProfessSalesman() != null && principal.getSpecialManagementDep() == null) {
                    code = "professSalesman" + principal.getProfessSalesman().trim();
                }
                if (map0.containsKey(code)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800413);
                }
                map0.put(code, "principal");
            }
        }
        if (!CollectionUtils.isEmpty((Collection)(invoicingCustomersList = merchant.invoicingCustomerss()))) {
            HashSet<Long> invoicingCustomersSet = new HashSet<Long>();
            for (InvoicingCustomers invoicingCustomers : invoicingCustomersList) {
                invoicingCustomersSet.add(invoicingCustomers.getInvoicingCustomersId());
            }
            if (invoicingCustomersList.size() != invoicingCustomersSet.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800414);
            }
        }
    }

    public void checkCustomerArea(Merchant merchant) throws Exception {
        List customerAreaIsDefaultList = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaIsDefaultList)) {
            HashMap<Long, String> distinctMap = new HashMap<Long, String>();
            int isDefaultNum = 0;
            int deleteNum = 0;
            for (CustomerArea ca : customerAreaIsDefaultList) {
                if (merchant.getCreateOrg() != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleArea").eq((Object)ca.getSaleAreaId()), QueryCondition.name((String)"orgId").eq((Object)merchant.getCreateOrg())}));
                    List cas = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)querySchema);
                    if (cas == null || cas.size() == 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800415, new Object[]{ca.get("saleAreaId_code").toString()});
                    }
                }
                if (null == ca.getIsDefault()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800416, new Object[]{ca.get("saleAreaId_code").toString()});
                }
                if (null != ca.getIsDefault() && ca.getIsDefault().booleanValue() && ca.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                if (ca.getEntityStatus() == EntityStatus.Delete) {
                    ++deleteNum;
                    continue;
                }
                if (ca.getEntityStatus() != EntityStatus.Insert) continue;
                distinctMap.put(ca.getSaleAreaId(), "Insert");
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,saleAreaId,isDefault");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
            List originalCustomerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalCustomerAreaList)) {
                Iterator originalCustomerAreaIterator = originalCustomerAreaList.iterator();
                while (originalCustomerAreaIterator.hasNext()) {
                    boolean remove = false;
                    CustomerArea originalCustomerArea = (CustomerArea)originalCustomerAreaIterator.next();
                    for (CustomerArea customerArea : customerAreaIsDefaultList) {
                        if (!originalCustomerArea.getId().equals(customerArea.getId())) continue;
                        originalCustomerAreaIterator.remove();
                        remove = true;
                    }
                    if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(originalCustomerArea.getSaleAreaId()))) continue;
                    originalCustomerAreaIterator.remove();
                }
                if (!CollectionUtils.isEmpty((Collection)originalCustomerAreaList)) {
                    for (CustomerArea customerArea : originalCustomerAreaList) {
                        if (!customerArea.getIsDefault().booleanValue()) continue;
                        ++isDefaultNum;
                    }
                }
            } else {
                for (CustomerArea customerArea : customerAreaIsDefaultList) {
                    if (customerArea.get("importSpecialSaleAreaId") == null) continue;
                    throw new CoreDocBusinessException(null, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F9", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u9500\u552e\u533a\u57df\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), customerArea.get("importSpecialSaleAreaId")));
                }
            }
            if (isDefaultNum != 1 && deleteNum != customerAreaIsDefaultList.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800417);
            }
        }
    }

    public void checkPrincipals(Merchant merchant) throws Exception {
        List principalIsDefaultList = merchant.principals();
        if (!CollectionUtils.isEmpty((Collection)principalIsDefaultList)) {
            HashMap<String, String> distinctMap = new HashMap<String, String>();
            int isDefaultNum = 0;
            int deleteNum = 0;
            for (Principal pc : principalIsDefaultList) {
                if (null == pc.getIsDefault()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800418, new Object[]{(String)pc.get("professSalesman_Name")});
                }
                if (null != pc.getIsDefault() && pc.getIsDefault().booleanValue() && pc.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                if (pc.getEntityStatus() == EntityStatus.Delete) {
                    ++deleteNum;
                    continue;
                }
                if (pc.getEntityStatus() != EntityStatus.Insert) continue;
                distinctMap.put(pc.getSpecialManagementDep() + pc.getProfessSalesman(), "Insert");
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,specialManagementDep,merchantId,merchantApplyRangeId,professSalesman");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
            List originalPrincipalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalPrincipalList)) {
                Iterator originalPrincipalIterator = originalPrincipalList.iterator();
                while (originalPrincipalIterator.hasNext()) {
                    boolean remove = false;
                    Principal originalPrincipal = (Principal)originalPrincipalIterator.next();
                    for (Principal principal : principalIsDefaultList) {
                        if (principal.getId() == null || !principal.getId().equals(originalPrincipal.getId())) continue;
                        originalPrincipalIterator.remove();
                        remove = true;
                    }
                    if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(originalPrincipal.getSpecialManagementDep() + originalPrincipal.getProfessSalesman()))) continue;
                    originalPrincipalIterator.remove();
                }
                if (!CollectionUtils.isEmpty((Collection)originalPrincipalList)) {
                    for (Principal originalPrincipal : originalPrincipalList) {
                        if (!originalPrincipal.getIsDefault().booleanValue()) continue;
                        if (isDefaultNum == 1) {
                            Principal tempData = new Principal();
                            tempData.setEntityStatus(EntityStatus.Update);
                            tempData.setIsDefault(Boolean.valueOf(false));
                            tempData.setMerchantApplyRangeId(originalPrincipal.getMerchantApplyRangeId());
                            tempData.setMerchantId(originalPrincipal.getMerchantId());
                            tempData.setProfessSalesman(originalPrincipal.getProfessSalesman());
                            tempData.setSpecialManagementDep(originalPrincipal.getSpecialManagementDep());
                            tempData.setId(originalPrincipal.getId());
                            principalIsDefaultList.add(tempData);
                            continue;
                        }
                        ++isDefaultNum;
                    }
                }
            } else {
                for (Principal principal : principalIsDefaultList) {
                    if (principal.get("importSpecialPrincipalId") == null) continue;
                    throw new CoreDocBusinessException(null, String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804E1", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u8d1f\u8d23\u4eba\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), principal.get("importSpecialPrincipalId")));
                }
            }
            if (isDefaultNum != 1 && deleteNum != principalIsDefaultList.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800419);
            }
            merchant.setPrincipals(principalIsDefaultList);
        }
    }

    public void checkInvoicingCustomers(Merchant merchant) throws Exception {
        List invoicingCustomersIsDefaultList = merchant.invoicingCustomerss();
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersIsDefaultList)) {
            HashMap<Long, String> distinctMap = new HashMap<Long, String>();
            int isDefaultNum = 0;
            int deleteNum = 0;
            for (InvoicingCustomers ic : invoicingCustomersIsDefaultList) {
                if (!merchant.getCode().equals(ic.get("invoicingCustomersId_code"))) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id,stopstatus");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)ic.getInvoicingCustomersId())}));
                    List cas = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                    if (cas == null || cas.size() == 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800420, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                    }
                    if (((Map)cas.get(0)).get("stopstatus").equals(true)) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800421, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                    }
                } else {
                    ic.setInvoicingCustomersId((Long)merchant.getId());
                }
                if (null == ic.getIsDefault()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800422, new Object[]{(String)ic.get("invoicingCustomersId_code")});
                }
                if (null != ic.getIsDefault() && ic.getIsDefault().booleanValue() && ic.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                if (ic.getEntityStatus() == EntityStatus.Delete) {
                    ++deleteNum;
                    continue;
                }
                if (ic.getEntityStatus() != EntityStatus.Insert) continue;
                distinctMap.put(ic.getInvoicingCustomersId(), "Insert");
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,invoicingCustomersId");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
            List originalInvoicingCustomersList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalInvoicingCustomersList)) {
                Iterator originalInvoicingCustomerIterator = originalInvoicingCustomersList.iterator();
                while (originalInvoicingCustomerIterator.hasNext()) {
                    boolean remove = false;
                    InvoicingCustomers invoicingCustomersId = (InvoicingCustomers)originalInvoicingCustomerIterator.next();
                    for (InvoicingCustomers invoicingCustomers : invoicingCustomersIsDefaultList) {
                        if (!invoicingCustomersId.getId().equals(invoicingCustomers.getId())) continue;
                        originalInvoicingCustomerIterator.remove();
                        remove = true;
                    }
                    if (remove || distinctMap.isEmpty() || !"Insert".equals(distinctMap.get(invoicingCustomersId.getInvoicingCustomersId()))) continue;
                    originalInvoicingCustomerIterator.remove();
                }
                if (!CollectionUtils.isEmpty((Collection)originalInvoicingCustomersList)) {
                    for (InvoicingCustomers icv : originalInvoicingCustomersList) {
                        if (!icv.getIsDefault().booleanValue()) continue;
                        ++isDefaultNum;
                    }
                }
            } else {
                for (InvoicingCustomers invoicingCustomers : invoicingCustomersIsDefaultList) {
                    if (invoicingCustomers.get("importSpecialCustomerId") == null) continue;
                    throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804F2", (String)"\u8be5\u5ba2\u6237[%s]\u7684\u5f00\u7968\u5ba2\u6237\u5b50\u8868ID[%s]\u4e0d\u5b58\u5728\uff01"), merchant.getCode(), invoicingCustomers.get("importSpecialCustomerId")));
                }
            }
            if (isDefaultNum != 1 && deleteNum != invoicingCustomersIsDefaultList.size()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800423);
            }
        }
    }

    public void checkAddressInfo(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            boolean merchantNeedDefaultAddress;
            ArrayList<Long> addressInfoIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800425, new Object[]{merchant.getCode()});
                }
                if (addressInfo.getIsDefault().booleanValue() && addressInfo.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                addressInfoIdList.add((Long)addressInfo.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(addressInfoIdList)}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                isDefaultNum += isDefault.size();
            }
            if ((merchantNeedDefaultAddress = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultAddress")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultAddress && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkContacter(Merchant merchant) throws Exception {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            boolean merchantNeedDefaultContact;
            ArrayList<Long> contacterIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (Contacter contacter : contacterList) {
                if (contacter.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800428, new Object[]{merchant.getCode()});
                }
                if (contacter.getIsDefault().booleanValue() && contacter.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                contacterIdList.add((Long)contacter.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(contacterIdList)}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                isDefaultNum += isDefault.size();
            }
            if ((merchantNeedDefaultContact = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultContact")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultContact && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkAgentFinancial(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        this.checkBankAccount(agentFinancialList);
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            boolean merchantNeedDefaultBank;
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800430, new Object[]{merchant.getCode()});
                }
                if (agentFinancial.getIsDefault().booleanValue() && agentFinancial.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                agentFinancialIdList.add((Long)agentFinancial.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentFinancialIdList)}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                isDefaultNum += isDefault.size();
            }
            if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultBank")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkAgentInvoices(Merchant merchant) throws Exception {
        List agentInvoicesList = merchant.merchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoicesList)) {
            boolean merchantNeedDefaultBank;
            ArrayList<Long> agentInvoiceIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (AgentInvoice agentInvoice : agentInvoicesList) {
                if (agentInvoice.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800433, new Object[]{merchant.getCode()});
                }
                if (agentInvoice.getIsDefault().booleanValue() && agentInvoice.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                agentInvoiceIdList.add((Long)agentInvoice.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,billingType,title");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentInvoiceIdList)}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.AgentInvoice", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault)) {
                isDefaultNum += isDefault.size();
            }
            if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultInvoice")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
            }
        }
    }

    private void checkBankAccount(List<AgentFinancial> agentFinancialList) {
        if (!CollectionUtils.isEmpty(agentFinancialList)) {
            agentFinancialList.forEach(agentFinancial -> {
                if (agentFinancial.getEntityStatus() != EntityStatus.Delete && agentFinancial.getBankAccount() != null) {
                    String bankAccount = agentFinancial.getBankAccount();
                    if ((bankAccount = bankAccount.replace(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408051C", (String)"\uffe5"), "")) != null && bankAccount.length() > 0 && !UPCConstant4Regex.BANK_ACCOUNT.matcher(bankAccount).matches()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800464);
                    }
                }
            });
        }
    }

    public void setMerchantPoiExcelRowNum(Merchant merchant) {
        int i;
        if (merchant.customerAreas() != null) {
            List customerAreas = merchant.customerAreas();
            for (i = 0; i < customerAreas.size(); ++i) {
                ((CustomerArea)customerAreas.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.principals() != null) {
            List principals = merchant.principals();
            for (i = 0; i < principals.size(); ++i) {
                ((Principal)principals.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.invoicingCustomerss() != null) {
            List invoicingCustomerss = merchant.invoicingCustomerss();
            for (i = 0; i < invoicingCustomerss.size(); ++i) {
                ((InvoicingCustomers)invoicingCustomerss.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.merchantAddressInfos() != null) {
            List addressInfos = merchant.merchantAddressInfos();
            for (i = 0; i < addressInfos.size(); ++i) {
                ((AddressInfo)addressInfos.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.merchantContacterInfos() != null) {
            List contacterInfos = merchant.merchantContacterInfos();
            for (i = 0; i < contacterInfos.size(); ++i) {
                ((Contacter)contacterInfos.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.merchantAgentInvoiceInfos() != null) {
            List agentInvoiceInfos = merchant.merchantAgentInvoiceInfos();
            for (i = 0; i < agentInvoiceInfos.size(); ++i) {
                ((AgentInvoice)agentInvoiceInfos.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.merchantAgentFinancialInfos() != null) {
            List agentFinancialInfos = merchant.merchantAgentFinancialInfos();
            for (i = 0; i < agentFinancialInfos.size(); ++i) {
                ((AgentFinancial)agentFinancialInfos.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
        if (merchant.merchantApplyRanges() != null) {
            List merchantApplyRanges = merchant.merchantApplyRanges();
            for (i = 0; i < merchantApplyRanges.size(); ++i) {
                ((MerchantApplyRange)merchantApplyRanges.get(i)).put("poiExcelRowNum", (Object)i);
            }
        }
    }

    public List<CustomerApplyBpmCurrentAuditor> getAuditorById(Long customerApplyId) throws Exception {
        if (customerApplyId != null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("auditor");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerApplyId").eq((Object)customerApplyId)}));
            return MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApplyBpmCurrentAuditor", (QuerySchema)querySchema, null);
        }
        return null;
    }

    public int getCustomerApplyCountByVerifyState(CustomerApply customerApply, List<Short> verifyStates) throws Exception {
        if (CollectionUtils.isEmpty(verifyStates)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800105);
        }
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("ytenant", AppContext.getYhtTenantId());
        param.put("verifyStates", verifyStates);
        if (customerApply != null && customerApply.getId() != null) {
            param.put("id", customerApply.getId());
        }
        return (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.customerapply.getCustomerApplyCountByVerifyState", param);
    }

    public List<CustomerApply> listCustomerApplyByVerifyState(CustomerApply customerApply, List<Short> verifyStates, int pageIndex, int pageSize) throws Exception {
        if (CollectionUtils.isEmpty(verifyStates)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800105);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"verifystate").in(verifyStates)});
        if (customerApply != null && EntityStatus.Update.equals((Object)customerApply.getEntityStatus())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_eq(customerApply.getId()));
        }
        return MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "applyCode", "applyCustomer", "customerData"}).addCondition((ConditionExpression)queryConditionGroup).addPager(pageIndex, pageSize), null);
    }
}

