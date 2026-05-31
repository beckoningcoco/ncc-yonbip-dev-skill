/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.log.cons.OperCodeTypes
 *  com.yonyou.iuap.log.model.BusinessLogVO
 *  com.yonyou.iuap.log.send.AuditLogSender
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRule
 *  com.yonyou.ucf.mdd.ext.config.billmeta.IBillMetaDaoBiz
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt
 *  com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogOperateTypeExt
 *  com.yonyou.ucf.mdd.ext.util.DomainUtils
 *  com.yonyou.ucf.mdd.ext.vo.OperationActionVO
 *  com.yonyou.ucf.mdd.rule.api.RuleOperatorProxy
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Entity
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.JsonFormatter
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.kafka.listener.MessageListener
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.ext.busilog;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.log.cons.OperCodeTypes;
import com.yonyou.iuap.log.model.BusinessLogVO;
import com.yonyou.iuap.log.send.AuditLogSender;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.iuap.upc.ext.busilog.BusiLogMessage;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRule;
import com.yonyou.ucf.mdd.ext.config.billmeta.IBillMetaDaoBiz;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.i18n.utils.MddMultilingualUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogCustomExt;
import com.yonyou.ucf.mdd.ext.pub.rule.itf.IBusinessLogOperateTypeExt;
import com.yonyou.ucf.mdd.ext.util.DomainUtils;
import com.yonyou.ucf.mdd.ext.vo.OperationActionVO;
import com.yonyou.ucf.mdd.rule.api.RuleOperatorProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Entity;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.JsonFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@ConditionalOnProperty(name={"kafka.cluster.hosts"}, matchIfMissing=false)
public class BusiLogMQListener
implements MessageListener<String, String> {
    private static final Logger log = LoggerFactory.getLogger(BusiLogMQListener.class);
    private AuditLogSender auditLogSender = new AuditLogSender(AppContext.getApplicationContext());

    public void onMessage(ConsumerRecord<String, String> data) {
        String message = (String)data.value();
        BusiLogMessage busiLogMessage = (BusiLogMessage)JSONObject.parseObject((String)message, BusiLogMessage.class);
        try {
            RobotExecutors.runAs((String)busiLogMessage.getTenantId(), () -> this.MDDLogConsumer(busiLogMessage));
        }
        catch (Exception e) {
            log.error("\u5ba1\u8ba1\u65e5\u5fd7\u4e1a\u52a1\u65e5\u5fd7\u6d88\u8d39\u5f02\u5e38:{}", (Object)e.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void MDDLogConsumer(BusiLogMessage message) {
        try {
            this.initLocalByTenantId();
            List<BusinessLogVO> businessLogVoList = this.buildBusinessLogVoList(message.getBillContext(), message.getParamMap(), message.getBills());
            if (CollectionUtils.isEmpty(businessLogVoList)) {
                JsonFormatter formatter = new JsonFormatter(BizContext.getMetaRepository());
                String json = formatter.toJson(message.getBills(), message.getBillContext().getFullname(), false, 32).toString();
                log.error("\u751f\u6210\u4e1a\u52a1\u65e5\u5fd7VO\u5217\u8868\u4e3a\u7a7a\uff0c \u53c2\u6570---billContext:{},bills:{}", (Object)JSONObject.toJSONString((Object)message.getBillContext()), (Object)json);
                return;
            }
            for (BusinessLogVO businessLogVo : businessLogVoList) {
                businessLogVo.setOperator(message.getUserId());
                businessLogVo.setTenantId(message.getTenantId());
                businessLogVo.setServiceCode(message.getServiceCode());
                businessLogVo.setIp(message.getClientIp());
                this.auditLogSender.sendBusinessLog(businessLogVo);
            }
        }
        catch (Throwable th) {
            log.error("\u8bb0\u5f55\u4e1a\u52a1\u65e5\u5fd7\u53d1\u751f\u5f02\u5e38,\u5f02\u5e38\u4fe1\u606f\uff1a", th);
        }
        finally {
            AppContext.clear();
            AppContext.clearAll();
            InvocationInfoProxy.reset();
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
        Map<String, String> codeAndName = this.getCodeAndName(billContext.getFullname());
        Map detailBill = this.executeDetailRule(billContext, bill, paramMap, codeAndName);
        if (detailBill != null) {
            Object pubts;
            detailBill.remove("_viewmodel");
            com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity mainEntity = null;
            try {
                IBillMetaDaoBiz billMetaDaoBiz = (IBillMetaDaoBiz)AppContext.getBean(IBillMetaDaoBiz.class);
                if (billMetaDaoBiz != null) {
                    mainEntity = billMetaDaoBiz.getMainEntityObj(this.getBillNum(billContext), (Object)InvocationInfoProxy.getTenantid());
                }
            }
            catch (Exception e) {
                log.error("\u83b7\u53d6ui\u5143\u6570\u636e\u5931\u8d25\uff01", (Throwable)e);
                throw new RuntimeException(e);
            }
            String opCode = this.getOperCode(billContext, bill);
            businessLogVO.setOperCode(opCode);
            this.fillOperName(businessLogVO, billContext.getAction());
            if (bill.get("_fromBatchModify") != null && BooleanUtil.isTrue((Object)bill.get("_fromBatchModify")) || bill.get("fromBatchModify_") != null && BooleanUtil.isTrue((Object)bill.get("fromBatchModify_"))) {
                businessLogVO.setOperationName("UID:P_COREDOC-UI_17AAAFC8042017E9");
                businessLogVO.setDefaultOperationName("\u6279\u6539");
            }
            if ((pubts = bill.get("operationDate")) instanceof Date) {
                businessLogVO.setOperationDate((Date)bill.get("operationDate"));
            } else {
                businessLogVO.setOperationDate(new Date());
            }
            businessLogVO.setBusiObjId(bill.getId() == null ? "" : bill.getId().toString());
            businessLogVO.setBusiObjCode(detailBill.get(codeAndName.get("code")) == null ? "" : detailBill.get(codeAndName.get("code")).toString());
            String busiObjName = detailBill.get(codeAndName.get("name")) == null ? "" : detailBill.get(codeAndName.get("name")).toString();
            businessLogVO.setBusiObjName(busiObjName);
            businessLogVO.setBusiObjTypeCode(this.getBillNum(billContext));
            if (null != mainEntity) {
                businessLogVO.setBusiObjTypeName(StringUtils.isNotBlank((CharSequence)mainEntity.getEntityNameResid()) ? mainEntity.getEntityNameResid() : mainEntity.getEntityName());
                businessLogVO.setDefaultBusiObjTypeName(StringUtils.isNotBlank((CharSequence)mainEntity.getEntityName()) ? mainEntity.getEntityName() : null);
            }
            businessLogVO.setNewBusiObj(JSONObject.toJSONStringWithDateFormat((Object)detailBill, (String)"yyyy-MM-dd HH:mm:ss", (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
            businessLogVO.setMdUri(billContext.getFullname());
            businessLogVO.setStruct(1);
            businessLogVO.setCsUriStem((String)InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-uri-stem"));
            businessLogVO.setCsRefer((String)InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-refer"));
            businessLogVO.setCsVersion((String)InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.cs-version"));
            businessLogVO.setServerIp((String)InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.s_ip"));
            businessLogVO.setServerPort((String)InvocationInfoProxy.getExtendAttribute((String)"SecurityInfo.s_port"));
            String mw = ((YMSParamConfig)AppContext.getBean(YMSParamConfig.class)).getMwApplicationName();
            businessLogVO.setDomain(StringUtils.isBlank((CharSequence)mw) ? DomainUtils.getAppName() : mw);
        }
        return businessLogVO;
    }

    private String getOperCode(BillContext billContext, BizObject bill) throws Exception {
        OperCodeTypes operCodeType = this.getOperCodeType(billContext, bill);
        return operCodeType.getCode();
    }

    public void fillOperName(BusinessLogVO businessLogVO, String action) throws Exception {
        IBusinessLogOperateTypeExt itfExt;
        if (StringUtils.isEmpty((CharSequence)action)) {
            return;
        }
        OperCodeTypes codeType = OperCodeTypes.getByCode((String)action);
        String operName = null;
        if (codeType == null && null != (itfExt = (IBusinessLogOperateTypeExt)AppContext.getBean(IBusinessLogOperateTypeExt.class))) {
            OperationActionVO defaultOperateNameByCode = itfExt.getMultilAndDefaultOperateNameByCode(action);
            if (defaultOperateNameByCode != null) {
                operName = defaultOperateNameByCode.getOperationNameMultilingual();
                businessLogVO.setDefaultOperationName(defaultOperateNameByCode.getDefaultOperationName());
            }
            if (StringUtils.isBlank(operName)) {
                operName = itfExt.getMultilingualOperateNameByCode(action);
            }
            businessLogVO.setOperationName(operName);
        }
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

    private Map executeDetailRule(BillContext billContext, BizObject bill, Map paramMap, Map<String, String> codeAndName) {
        IBusinessLogCustomExt ext;
        if (EntityStatus.Delete.equals((Object)bill.getEntityStatus()) || null == bill.getId() || billContext.getAction().contains("delete")) {
            return bill;
        }
        String mode = ((YMSParamConfig)AppContext.getBean(YMSParamConfig.class)).getA44dataMode();
        if (mode.equals("incr") || EntityStatus.Insert.equals((Object)bill.getEntityStatus())) {
            ext = (IBusinessLogCustomExt)AppContext.getBean(IBusinessLogCustomExt.class);
            if (null != ext) {
                return ext.getCustomBusinessLogDataForMdf(billContext, bill);
            }
            if (paramMap != null && paramMap.containsKey("requestData")) {
                try {
                    JSONObject requestData = JSONObject.parseObject((String)((String)paramMap.get("requestData")));
                    String codeField = codeAndName.get("code");
                    Object code = bill.get(codeField);
                    if (code != null && StringUtils.isNotBlank((CharSequence)code.toString()) && requestData.containsKey((Object)codeField)) {
                        requestData.put(codeField, code);
                    }
                    return requestData;
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
            String reportGroup = ((YMSParamConfig)AppContext.getBean(YMSParamConfig.class)).getReportGroup();
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
                if (result == null) {
                    log.error("reportGroup execute detailBillRule return null");
                    return bill;
                }
                if (result.getMsgCode() != 1) {
                    throw new CoreDocBusinessException(Long.valueOf(result.getMsgCode()), result.getMessage());
                }
                return (Map)result.getData();
            }
            BillDataDto billDataDto = new BillDataDto(this.getBillNum(billContext), bill.getId().toString());
            return BillBiz.detail((BillDataDto)billDataDto);
        }
        catch (Exception exception) {
            log.error("SaveBusinessLogRule execute detail rule failed", (Throwable)exception);
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
            List bills = CommonRuleUtils.getBills((BillContext)billContext, paramMap);
            bills.forEach(e -> cloneBills.add(e.clone()));
        }
        catch (Exception e2) {
            log.error("\u751f\u6210\u5355\u636e\u5e76clone\u53d1\u751f\u5f02\u5e38\uff0c\u5f02\u5e38\u4fe1\u606f:", (Throwable)e2);
        }
        return cloneBills;
    }

    private Map<String, String> getCodeAndName(String fullName) {
        HashMap<String, String> result = new HashMap<String, String>();
        try {
            Entity entity = MetaDaoHelper.getEntity((String)fullName);
            if (entity.codeAttribute() != null) {
                result.put("code", entity.codeAttribute().name());
            }
            if (entity.nameAttribute() != null) {
                result.put("name", entity.nameAttribute().name());
            }
        }
        catch (Exception e) {
            log.error("\u901a\u8fc7\u5143\u6570\u636e\u67e5\u627ecode\uff0c name\u5c5e\u6027\u53d1\u751f\u5f02\u5e38, \u4f7f\u7528\u9ed8\u8ba4code\uff0cname\u5c1d\u8bd5\u8bb0\u5f55\u3002\u5f02\u5e38\u4fe1\u606f\uff1a{}", (Object)e.getMessage(), (Object)e);
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
}

