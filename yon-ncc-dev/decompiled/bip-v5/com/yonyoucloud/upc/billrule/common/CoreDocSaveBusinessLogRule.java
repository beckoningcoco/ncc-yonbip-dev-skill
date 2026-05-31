/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.diwork.ott.exexutors.UserExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.log.cons.OperCodeTypes
 *  com.yonyou.iuap.log.model.BusinessLogVO
 *  com.yonyou.iuap.log.send.AuditLogSender
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRule
 *  com.yonyou.ucf.mdd.ext.bill.utils.BillUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt
 *  com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogOperateTypeExt
 *  com.yonyou.ucf.mdd.ext.util.DomainUtils
 *  com.yonyou.ucf.mdd.rule.api.RuleOperatorProxy
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.JsonFormatter
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.ObjectProvider
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.core.annotation.Order
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.diwork.ott.exexutors.UserExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.log.cons.OperCodeTypes;
import com.yonyou.iuap.log.model.BusinessLogVO;
import com.yonyou.iuap.log.send.AuditLogSender;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.iuap.upc.ext.busilog.BusiLogMQSender;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRule;
import com.yonyou.ucf.mdd.ext.bill.utils.BillUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt;
import com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogOperateTypeExt;
import com.yonyou.ucf.mdd.ext.util.DomainUtils;
import com.yonyou.ucf.mdd.rule.api.RuleOperatorProxy;
import com.yonyoucloud.iuap.upc.constants.UpcServiceCodeConstant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.JsonFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Order(value=0x7FFFFFFF)
@Service(value="coreDocSaveBusinessLogRule")
public class CoreDocSaveBusinessLogRule
extends AbstractCommonRule {
    private static final Logger logger = LoggerFactory.getLogger(CoreDocSaveBusinessLogRule.class);
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    private AuditLogSender auditLogSender;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private ObjectProvider<BusiLogMQSender> busiLogMQSenderProvider;
    @Autowired
    private MerchantGroupService merchantGroupService;

    public RuleExecuteResult execute(final BillContext billContext, final Map<String, Object> paramMap) {
        String serviceCode;
        String clientIp;
        String token;
        List<BizObject> bills;
        block22: {
            this.dealProTemplateInfo(billContext, paramMap);
            bills = this.getCloneBills(billContext, paramMap);
            token = InvocationInfoProxy.getYhtAccessToken();
            Object clientIpObj = InvocationInfoProxy.getExtendAttribute((String)"clientIp");
            clientIp = Objects.nonNull(clientIpObj) ? clientIpObj.toString() : null;
            Object serviceCodeObj = InvocationInfoProxy.getExtendAttribute((String)"serviceCode");
            if (serviceCodeObj == null || StringUtils.isBlank((CharSequence)serviceCodeObj.toString())) {
                serviceCodeObj = AppContext.getThreadContext((String)"serviceCode");
            }
            if (StringUtils.isEmpty((CharSequence)(serviceCode = Objects.toString(serviceCodeObj, null)))) {
                try {
                    Map externalData;
                    BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
                    if (null != billDataDto && StringUtils.isEmpty((CharSequence)(serviceCode = (String)(externalData = BillUtils.getExternalData((BillDataDto)billDataDto)).get("serviceCode")))) {
                        serviceCode = UpcServiceCodeConstant.ServiceCodeBillNumMap.get(billDataDto.getBillnum());
                    }
                }
                catch (Exception e) {
                    if (!logger.isErrorEnabled()) break block22;
                    logger.error("\u4eceBillDataDto\u6269\u5c55\u53c2\u6570\u4e2d\u83b7\u53d6serviceCode\u5931\u8d25" + e.getMessage(), (Throwable)e);
                }
            }
        }
        final String finalServiceCode = serviceCode;
        if (!CollectionUtils.isEmpty(bills)) {
            BusiLogMQSender busiLogMQSender;
            BizObject bizObject = bills.get(0);
            bizObject.put("operationDate", (Object)new Date());
            if ("aa_merchant".equals(billContext.getBillnum())) {
                try {
                    List<MerchantApplyRange> creatorMerchantApplyRangeById;
                    if (bizObject.get("merchantApplyRangeId") == null || bizObject.get("merchantAppliedDetail!merchantApplyRangeId") != null) {
                        bizObject.put("merchantApplyRangeId", bizObject.get("merchantAppliedDetail!merchantApplyRangeId"));
                    } else if (!(bizObject.get("merchantApplyRangeId") != null && bizObject.get("merchantAppliedDetail!merchantApplyRangeId") != null || CollectionUtils.isEmpty(creatorMerchantApplyRangeById = this.merchantGroupService.getCreatorMerchantApplyRangeById(Long.valueOf(bizObject.get("id").toString()))))) {
                        bizObject.put("merchantApplyRangeId", creatorMerchantApplyRangeById.get(0).getId());
                        bizObject.put("merchantAppliedDetail!merchantApplyRangeId", creatorMerchantApplyRangeById.get(0).getId());
                    }
                }
                catch (Exception e) {
                    logger.error("\u8865\u5145\u67e5\u8be2\u62a5\u9519\uff1a", (Throwable)e);
                }
            }
            if (this.ymsParamConfig.getAuditLogmqLinkEnable()) {
                busiLogMQSender = (BusiLogMQSender)this.busiLogMQSenderProvider.getIfAvailable();
                busiLogMQSender.init();
            }
            if (this.ymsParamConfig.getAuditLogmqLinkEnable() && BusiLogMQSender.initStatus) {
                busiLogMQSender = (BusiLogMQSender)this.busiLogMQSenderProvider.getIfAvailable();
                if ("aa_merchant".equals(billContext.getBillnum()) && "customerapply".equals(bizObject.get("customerapply")) && bizObject.get("businessLogCreatorYhtUserId") != null) {
                    busiLogMQSender.send(billContext, paramMap, token, clientIp, bills, "aa_customerapply", bills.get(0).get("businessLogCreatorYhtUserId").toString());
                } else if ("pc_product".equals(billContext.getBillnum()) && "productApply".equals(bizObject.get("sourceMarker")) && bizObject.get("businessLogCreatorYhtUserId") != null) {
                    busiLogMQSender.send(billContext, paramMap, token, clientIp, bills, "pc_product", bizObject.get("businessLogCreatorYhtUserId").toString());
                } else {
                    busiLogMQSender.send(billContext, paramMap, token, clientIp, bills, finalServiceCode);
                }
            } else if (TransactionSynchronizationManager.isSynchronizationActive()) {
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                    public void afterCompletion(int status) {
                        if (0 == status) {
                            UserExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> CoreDocSaveBusinessLogRule.this.executeAsync(billContext, paramMap, token, clientIp, bills, finalServiceCode), (ExecutorService)CoreDocSaveBusinessLogRule.this.ymsLongTaskExecutorService);
                        }
                    }
                });
            } else {
                logger.warn("\u4e1a\u52a1\u65e5\u5fd7\u5f02\u6b65\u6267\u884c\uff0c\u672a\u5f00\u542f\u4e8b\u52a1\u3002");
                UserExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> this.executeAsync(billContext, paramMap, token, clientIp, bills, finalServiceCode), (ExecutorService)this.ymsLongTaskExecutorService);
            }
        } else {
            JsonFormatter formatter = new JsonFormatter(BizContext.getMetaRepository());
            String json = formatter.toJson(bills, billContext.getFullname(), false, 32).toString();
            String jsonBillContext = JSONObject.toJSONString((Object)billContext);
            logger.info("\u4e1a\u52a1\u65e5\u5fd7getCloneBills\u4e3a\u7a7a: \u53c2\u6570---billContext:{},bills:{}", (Object)jsonBillContext, (Object)json);
        }
        return new RuleExecuteResult();
    }

    private void executeAsync(BillContext billContext, Map<String, Object> paramMap, String token, String clientIp, List<BizObject> bills, String serviceCode) {
        try {
            this.initLocalByTenantId();
            InvocationInfoProxy.setExtendAttribute((String)"clientIp", (Object)clientIp);
            InvocationInfoProxy.setExtendAttribute((String)"yht_access_token", (Object)token);
            LoginUser currentUser = AppContext.getCurrentUser();
            if (currentUser == null) {
                logger.info("\u4e1a\u52a1\u65e5\u5fd7,\u5f53\u524d\u7528\u6237\u4e3anull\uff0cASYNC--AppContext.TOKEN\uff1a{}, TOKEN:{}", (Object)InvocationInfoProxy.getYhtAccessToken(), (Object)token);
                return;
            }
            if (StringUtils.isBlank((CharSequence)billContext.getFullname())) {
                logger.info("\u8868\u5355\u5143\u6570\u636efullName\u4e3a\u7a7a,\u65e0\u6cd5\u6784\u5efa\u5b9e\u4f53\u3002");
                return;
            }
            List<BusinessLogVO> businessLogVoList = this.buildBusinessLogVoList(billContext, paramMap, bills);
            if (CollectionUtils.isEmpty(businessLogVoList)) {
                JsonFormatter formatter = new JsonFormatter(BizContext.getMetaRepository());
                String json = formatter.toJson(bills, billContext.getFullname(), false, 32).toString();
                String jsonBillContext = JSONObject.toJSONString((Object)billContext);
                logger.info("\u751f\u6210\u4e1a\u52a1\u65e5\u5fd7VO\u5217\u8868\u4e3a\u7a7a\uff0c \u53c2\u6570---billContext:{},bills:{}", (Object)jsonBillContext, (Object)json);
                return;
            }
            for (BusinessLogVO businessLogVo : businessLogVoList) {
                businessLogVo.setOperator(currentUser.getYhtUserId());
                businessLogVo.setTenantId(currentUser.getYhtTenantId());
                businessLogVo.setServiceCode(serviceCode);
                this.auditLogSender.sendBusinessLog(businessLogVo);
            }
        }
        catch (Throwable e) {
            logger.error("\u8bb0\u5f55\u4e1a\u52a1\u65e5\u5fd7\u53d1\u751f\u5f02\u5e38,\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), e);
        }
    }

    private List<BusinessLogVO> buildBusinessLogVoList(BillContext billContext, Map<String, Object> paramMap, List<BizObject> bills) throws Exception {
        ArrayList<BusinessLogVO> businessLogVoList = new ArrayList<BusinessLogVO>(bills.size());
        for (BizObject bill : bills) {
            BusinessLogVO businessLogVO = this.buildBusinessLogVo(billContext, bill, paramMap);
            businessLogVoList.add(businessLogVO);
        }
        return businessLogVoList;
    }

    private BusinessLogVO buildBusinessLogVo(BillContext billContext, BizObject bill, Map paramMap) throws Exception {
        BusinessLogVO businessLogVO = new BusinessLogVO();
        Map detailBill = this.executeDetailRule(billContext, bill, paramMap);
        detailBill.remove("_viewmodel");
        ViewModel viewmodel = UIMetaUtils.getViewModel((String)this.getBillNum(billContext), null, (boolean)false);
        com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity mainEntity = this.getMainEntity(viewmodel.getEntities());
        String opCode = this.getOperCode(billContext, bill);
        businessLogVO.setOperCode(opCode);
        businessLogVO.setOperationName(this.getOperName(billContext.getAction()));
        businessLogVO.setOperationDate(new Date());
        businessLogVO.setBusiObjId(bill.getId() == null ? "" : bill.getId().toString());
        Map<String, String> codeAndName = this.getCodeAndName(billContext.getFullname());
        businessLogVO.setBusiObjCode(detailBill.get(codeAndName.get("code")) == null ? "" : detailBill.get(codeAndName.get("code")).toString());
        String busiObjName = detailBill.get(codeAndName.get("name")) == null ? "" : detailBill.get(codeAndName.get("name")).toString();
        businessLogVO.setBusiObjName(busiObjName);
        businessLogVO.setBusiObjTypeCode(this.getBillNum(billContext));
        if (null != mainEntity) {
            businessLogVO.setBusiObjTypeName(StringUtils.isNotBlank((CharSequence)mainEntity.getEntityNameResid()) ? mainEntity.getEntityNameResid() : mainEntity.getEntityName());
        }
        businessLogVO.setNewBusiObj(JSONObject.toJSONStringWithDateFormat((Object)detailBill, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
        businessLogVO.setMdUri(billContext.getFullname());
        businessLogVO.setStruct(1);
        Function<Object, String> SFunction = obj -> Objects.nonNull(obj) ? obj.toString() : null;
        businessLogVO.setCsUriStem(SFunction.apply(InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-uri-stem")));
        businessLogVO.setCsRefer(SFunction.apply(InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-refer")));
        businessLogVO.setCsVersion(SFunction.apply(InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-version")));
        businessLogVO.setServerIp(SFunction.apply(InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.s_ip")));
        businessLogVO.setServerPort(SFunction.apply(InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.s_port")));
        String mw = this.ymsParamConfig.getMwApplicationName();
        businessLogVO.setDomain(StringUtils.isBlank((CharSequence)mw) ? DomainUtils.getAppName() : mw);
        return businessLogVO;
    }

    private String getOperCode(BillContext billContext, BizObject bill) throws Exception {
        OperCodeTypes operCodeType = this.getOperCodeType(billContext, bill);
        return operCodeType.getCode();
    }

    private String getOperName(String action) throws Exception {
        IBusinessLogOperateTypeExt itfExt;
        if (StringUtils.isEmpty((CharSequence)action)) {
            return null;
        }
        OperCodeTypes codeType = OperCodeTypes.getByCode((String)action);
        if (codeType == null && null != (itfExt = (IBusinessLogOperateTypeExt)AppContext.getBean(IBusinessLogOperateTypeExt.class))) {
            return itfExt.getMultilingualOperateNameByCode(action);
        }
        return null;
    }

    private Map executeDetailRule(BillContext billContext, BizObject bill, Map paramMap) {
        IBusinessLogCustomExt ext;
        if (EntityStatus.Delete.equals((Object)bill.getEntityStatus()) || null == bill.getId() || billContext.getAction().contains("delete")) {
            return bill;
        }
        String mode = this.ymsParamConfig.getA44dataMode();
        if ("incr".equals(mode) || EntityStatus.Insert.equals((Object)bill.getEntityStatus())) {
            ext = (IBusinessLogCustomExt)AppContext.getBean(IBusinessLogCustomExt.class);
            if (null != ext) {
                return ext.getCustomBusinessLogDataForMdf(billContext, bill);
            }
            if (paramMap != null && paramMap.containsKey("requestData")) {
                try {
                    return JSONObject.parseObject((String)((String)paramMap.get("requestData")));
                }
                catch (Exception e) {
                    return bill;
                }
            }
        }
        try {
            ext = (IBusinessLogCustomExt)AppContext.getBean(IBusinessLogCustomExt.class);
            if (null != ext) {
                return ext.getCustomBusinessLogDataForMdf(billContext, bill);
            }
            String reportGroup = this.ymsParamConfig.getReportGroup();
            if (StringUtils.isNotBlank((CharSequence)reportGroup)) {
                Optional<RuleRegister> detailRuleRegister;
                String customDetailRuleId = null;
                BillContext ruleListContext = new BillContext();
                ruleListContext.setBillnum(this.getBillNum(billContext));
                ruleListContext.setAction("detail");
                Queue ruleRegisters = new RuleOperatorProxy("detail").doGetRuleQueue(ruleListContext, null, null);
                if (!CollectionUtils.isEmpty((Collection)ruleRegisters) && (detailRuleRegister = ruleRegisters.stream().filter(ruleRegister -> null != ruleRegister.getOverrule() && (ruleRegister.getOverrule().contains("detailBillRule") || ruleRegister.getOverrule().contains("commonAll"))).findFirst()).isPresent()) {
                    customDetailRuleId = detailRuleRegister.get().getRuleId();
                }
                IRule detailBillRule = StringUtils.isNotBlank(customDetailRuleId) ? (IRule)AppContext.getBean(customDetailRuleId, IRule.class) : (IRule)AppContext.getBean((String)"detailBillRule", IRule.class);
                BillDataDto billDataDto = new BillDataDto(this.getBillNum(billContext), bill.getId().toString());
                billDataDto.setIsIncludeMeta(true);
                HashMap<String, Boolean> partParam = billDataDto.getPartParam();
                if (null == partParam) {
                    partParam = new HashMap<String, Boolean>();
                }
                partParam.put("enableI18n", true);
                billDataDto.setPartParam(partParam);
                HashMap<String, BillDataDto> param = new HashMap<String, BillDataDto>();
                param.put("param", billDataDto);
                BillContext cloneBillContext = (BillContext)billContext.clone();
                cloneBillContext.setBillnum(this.getBillNum(billContext));
                cloneBillContext.setDomain(reportGroup);
                cloneBillContext.setbRowAuthControl(false);
                RuleExecuteResult result = detailBillRule.execute(cloneBillContext, param);
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(Long.valueOf(result.getMsgCode()), result.getMessage());
                }
                return (Map)result.getData();
            }
            BillDataDto billDataDto = new BillDataDto(this.getBillNum(billContext), bill.getId().toString());
            return BillBiz.detail((BillDataDto)billDataDto);
        }
        catch (Exception e) {
            logger.error("SaveBusinessLogRule execute detail rule failed" + e.getMessage(), (Throwable)e);
            return bill;
        }
    }

    private com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity getMainEntity(LinkedHashSet<com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity> entities) {
        for (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity entity : entities) {
            if (!entity.getIsMain().booleanValue()) continue;
            return entity;
        }
        return null;
    }

    private OperCodeTypes getOperCodeType(BillContext billContext, BizObject bill) {
        OperCodeTypes codeType = OperCodeTypes.getByCode((String)billContext.getAction());
        if (codeType == null || OperCodeTypes.save.equals((Object)codeType)) {
            if (bill.getEntityStatus() == EntityStatus.Insert) {
                return OperCodeTypes.insert;
            }
            if (bill.getEntityStatus() == EntityStatus.Update) {
                return OperCodeTypes.update;
            }
            if (bill.getEntityStatus() == EntityStatus.Delete) {
                return OperCodeTypes.delete;
            }
        }
        return codeType == null ? OperCodeTypes.defined : codeType;
    }

    private List<BizObject> getCloneBills(BillContext billContext, Map<String, Object> paramMap) {
        ArrayList<BizObject> cloneBills = new ArrayList<BizObject>();
        try {
            List bills = this.getBills(billContext, paramMap);
            bills.forEach(e -> cloneBills.add(e.clone()));
        }
        catch (Exception e2) {
            logger.error("\u751f\u6210\u5355\u636e\u5e76clone\u53d1\u751f\u5f02\u5e38\uff0c\u5f02\u5e38\u4fe1\u606f:" + e2.getMessage(), (Throwable)e2);
        }
        return cloneBills;
    }

    private Map<String, String> getCodeAndName(String fullName) {
        HashMap<String, String> result = new HashMap<String, String>();
        try {
            Entity entity = MetaDaoHelper.getEntity((String)fullName);
            result.put("code", entity.codeAttribute().name());
            result.put("name", entity.nameAttribute().name());
        }
        catch (Exception e) {
            logger.error("\u901a\u8fc7\u5143\u6570\u636e\u67e5\u627ecode\uff0c name\u5c5e\u6027\u53d1\u751f\u5f02\u5e38, \u4f7f\u7528\u9ed8\u8ba4code\uff0cname\u5c1d\u8bd5\u8bb0\u5f55\u3002\u5f02\u5e38\u4fe1\u606f\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        if (StringUtils.isBlank((CharSequence)((CharSequence)result.get("code")))) {
            result.put("code", "code");
        }
        if (StringUtils.isBlank((CharSequence)((CharSequence)result.get("name")))) {
            result.put("name", "name");
        }
        return result;
    }

    private String getBillNum(BillContext billContext) {
        return StringUtils.isBlank((CharSequence)billContext.getCardKey()) ? billContext.getBillnum() : billContext.getCardKey();
    }

    private Locale initLocalByTenantId() {
        if (MddMultilingualUtil.getI18nConfigEnable()) {
            String locale = MultiLangContext.getInstance().getDefaultLocaleCode();
            if (StringUtils.isEmpty((CharSequence)locale)) {
                return new Locale(Locale.SIMPLIFIED_CHINESE.getLanguage(), Locale.SIMPLIFIED_CHINESE.getCountry());
            }
            if (locale.contains("_")) {
                String[] split = locale.split("_");
                return new Locale(split[0], split[1]);
            }
            return new Locale(locale, locale);
        }
        return new Locale(Locale.SIMPLIFIED_CHINESE.getLanguage(), Locale.SIMPLIFIED_CHINESE.getCountry());
    }

    private void dealProTemplateInfo(BillContext billContext, Map<String, Object> paramMap) {
        try {
            if (billContext.getParamObj() != null && billContext.getParamObj().getData() != null && billContext.getParamObj().getData() instanceof List) {
                List ParamObjList = (List)billContext.getParamObj().getData();
                this.removeProTemplateInfo(ParamObjList);
            }
            if (paramMap.get("param") != null && ((BillDataDto)paramMap.get("param")).getData() != null) {
                List paramList = (List)((BillDataDto)paramMap.get("param")).getData();
                this.removeProTemplateInfo(paramList);
            }
            HashMap resultMap = (HashMap)paramMap.get("requestData");
            resultMap.remove("merchantsManager");
            List requestDataList = (List)((BillDataDto)JSONObject.parseObject((String)JSON.toJSONString((Object)resultMap), BillDataDto.class)).getData();
            if (paramMap.get("requestData") != null && requestDataList != null) {
                this.removeProTemplateInfo(requestDataList);
            }
        }
        catch (Exception e) {
            logger.info("\u4e1a\u52a1\u65e5\u5fd7\u53bb\u9664\u7269\u6599\u6a21\u677f\u89c4\u683c\u5c5e\u6027\u5f02\u5e38,\u4e0d\u505a\u5904\u7406");
        }
    }

    private void removeProTemplateInfo(List list) {
        if (!CollectionUtils.isEmpty((Collection)list)) {
            for (Object o : list) {
                ((Map)o).remove("proTemplateInfo");
            }
        }
    }

    static class BusinessLogPolicy
    extends ThreadPoolExecutor.DiscardPolicy {
        BusinessLogPolicy() {
        }

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
            String msg = String.format("BusinessLog Thread pool is EXHAUSTED! Pool Size: %d (active: %d, core: %d, max: %d, largest: %d), Task: %d (completed: %d), Executor status:(isShutdown:%s, isTerminated:%s, isTerminating:%s)", e.getPoolSize(), e.getActiveCount(), e.getCorePoolSize(), e.getMaximumPoolSize(), e.getLargestPoolSize(), e.getTaskCount(), e.getCompletedTaskCount(), e.isShutdown(), e.isTerminated(), e.isTerminating());
            logger.error(msg);
        }
    }
}

