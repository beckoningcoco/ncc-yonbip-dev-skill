/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.tenant.sdk.TenantCenter
 *  com.yonyou.iuap.yms.id.generator.YmsOidGenerator
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.base.user.User
 *  com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.OpenTenantRuleHandler
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.sys.service.RegisterService
 *  com.yonyou.ucf.mdd.ext.sys.service.TenantDataCopyService
 *  com.yonyou.ucf.mdd.ext.util.ExtSwitchUtil
 *  com.yonyoucloud.upc.base.tenant.TenantPO
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.BizException
 *  org.imeta.core.lang.NumberUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.tenant.sdk.TenantCenter;
import com.yonyou.iuap.yms.id.generator.YmsOidGenerator;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.base.user.User;
import com.yonyou.ucf.mdd.ext.bill.bathinit.service.BathInitUiMetaService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.rule.base.OpenTenantRuleHandler;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.sys.service.RegisterService;
import com.yonyou.ucf.mdd.ext.sys.service.TenantDataCopyService;
import com.yonyou.ucf.mdd.ext.util.ExtSwitchUtil;
import com.yonyoucloud.upc.base.tenant.TenantPO;
import com.yonyoucloud.upc.billrule.regist.ModifyOptionData;
import com.yonyoucloud.upc.billrule.regist.RegistInitRegistInfo;
import com.yonyoucloud.upc.billrule.userdefine.UserDefineUretailRule;
import com.yonyoucloud.upc.service.MaterialLifeCycleDataUpgradeService;
import com.yonyoucloud.upc.service.UPCTenantService;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.BizException;
import org.imeta.core.lang.NumberUtils;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
@Primary
public class UPCRegisterService
extends RegisterService {
    Logger logger = LoggerFactory.getLogger(UPCRegisterService.class);
    @Autowired
    private RegistInitRegistInfo registInitRegistInfo;
    @Autowired
    private ModifyOptionData modifyOptionData;
    @Autowired
    private UserDefineUretailRule userDefineUretailRule;
    @Autowired
    private OpenTenantRuleHandler openTenantRuleHandler;
    @Autowired
    BathInitUiMetaService bathInitUiMetaService;
    @Autowired
    YmsOidGenerator ymsOidGenerator;
    @Autowired
    MaterialLifeCycleDataUpgradeService materialLifeCycleDataUpgradeService;
    @Autowired
    private UPCTenantService tenantService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public List getRegistInfoList() throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").is_not_null()});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)conditionGroup).addOrderBy("pubts");
        List query = MetaDaoHelper.query((String)"aa.registInfo.RegistInfo", (QuerySchema)schema);
        QueryConditionGroup commonGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"tenant").eq((Object)0)});
        QuerySchema commonSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)commonGroup).addOrderBy("orderNumber");
        List commonQuery = MetaDaoHelper.query((String)"aa.registInfo.RegistInfo", (QuerySchema)commonSchema, null, (boolean)false);
        Iterator iterator = commonQuery.iterator();
        while (iterator.hasNext()) {
            Object systemCode = ((Map)iterator.next()).get("systemCode");
            for (Map objectMap : query) {
                Object code = objectMap.get("systemCode");
                if (!systemCode.equals(code)) continue;
                iterator.remove();
            }
        }
        query.addAll(commonQuery);
        return query;
    }

    @Transactional(rollbackFor={Throwable.class})
    public void sysopen(Map data) throws Exception {
        if (data.get("systemCode") != null && "productcenter".equals(data.get("systemCode"))) {
            this.openProductcenter(data);
        }
    }

    private void openProductcenter(Map data) throws Exception {
        String ytenantId = (String)data.get("ytenantId");
        if (!this.tenantService.existTenant(ytenantId).booleanValue()) {
            Tenant tenant = this.openCoreoDoc(data);
            String lifeCycleIsOpen = this.ymsParamConfig.getMaterialLifecycle();
            if (BooleanUtil.isTrue((Object)lifeCycleIsOpen) && tenant != null) {
                this.materialLifeCycleDataUpgradeService.dataUpgradeByTenantId((Long)tenant.getId());
            }
        }
    }

    public Tenant openCoreoDoc(Map data) throws Exception {
        Tenant tenant = this.getTenantFromYht(data);
        if (tenant != null) {
            try {
                this.tenantService.saveTenant(this.buildTenantPO(tenant));
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("tenantId", tenant.getId());
                map.put("yTenantId", tenant.getYTenantId());
                map.put("hasYTenantId", ExtSwitchUtil.isUiMetaWithYTenantId());
                map.put("yhtMode", false);
                SqlHelper.delete((String)"com.yonyoucloud.upc.dao.meta.init.clearOpenData", map);
                TenantDataCopyService.getInstance().copy0TenantData(map);
                this.afterRegisterRule(tenant, new User(), new String[0]);
                this.registInitRegistInfo.save(tenant, "productCenter");
                return tenant;
            }
            catch (Exception e) {
                this.logger.error("\u65b0\u589e\u79df\u6237\u5931\u8d25" + e.getMessage(), (Throwable)e);
                throw new BizException("tenant_add_failed", e.getMessage());
            }
        }
        return tenant;
    }

    private Tenant getTenantFromYht(Map data) {
        String yTenantId = (String)data.get("tenantId");
        String result = TenantCenter.getUpcTenantById((String)yTenantId);
        Map resultMap = (Map)JSON.parseObject((String)result, Map.class);
        this.logger.info("com.yonyoucloud.upc.service.UPCRegisterService#openProductcenter\uff0c\u8c03\u7528\u53cb\u4e92\u901asdk\u63a5\u53e3\uff0c\u8fd4\u56de\u4fe1\u606f\uff1a" + resultMap);
        if (resultMap != null && resultMap.get("status") != null && 1 == Integer.parseInt(resultMap.get("status").toString())) {
            Map tenantMap = (Map)resultMap.get("tenant");
            Tenant tenant = new Tenant();
            tenant.setEntityStatus(EntityStatus.Insert);
            tenant.setId(tenantMap.get("tenantId"));
            tenant.setTenantCenter((String)tenantMap.get("tenantcenterId"));
            tenant.setYxyTenantId((String)tenantMap.get("tenantcenterId"));
            tenant.setYTenantId((String)tenantMap.get("tenantcenterId"));
            tenant.put("IS_U8C", data.get("isU8C"));
            String tenantName = (String)tenantMap.get("tenantName");
            tenant.setName(tenantName != null && tenantName.length() > 200 ? tenantName.substring(0, 200) : tenantName);
            tenant.setAlias((String)tenantMap.get("tenantcenterId"));
            String contact = (String)tenantMap.get("linkman");
            tenant.setContact(contact != null && contact.length() > 50 ? contact.substring(0, 50) : contact);
            tenant.setSource(Integer.valueOf(99));
            tenant.setIndustry(Short.valueOf((short)99));
            tenant.setIsAvailable(Boolean.valueOf(true));
            tenant.setIsOpen(Boolean.valueOf(true));
            tenant.setCreateTime(Calendar.getInstance().getTime());
            return tenant;
        }
        return null;
    }

    private TenantPO buildTenantPO(Tenant tenant) {
        TenantPO tenantPO = new TenantPO();
        tenantPO.setId(Long.valueOf(Long.parseLong(tenant.getId().toString())));
        tenantPO.setTenantCenterId(tenant.getTenantCenter());
        tenantPO.setYxyTenantId(tenant.getYxyTenantId());
        tenantPO.setYTenantId(tenant.getYTenantId());
        tenantPO.setName(tenant.getName());
        tenantPO.setAlias(tenant.getAlias());
        tenantPO.setContact(tenant.getContact());
        tenantPO.setSource(tenant.getSource());
        tenantPO.setIndustry(tenant.getIndustry());
        tenantPO.setIsAvailable(tenant.getIsAvailable());
        tenantPO.setIsOpen(tenant.getOpen());
        tenantPO.setCreateTime(tenant.getCreateTime());
        return tenantPO;
    }

    public Map<String, Object> open(Map<String, Object> resData) throws Exception {
        Tenant tenant = (Tenant)resData.get("tenant");
        Tenant haveTenant = (Tenant)MetaDaoHelper.findById((String)"base.tenant.Tenant", (Object)NumberUtils.L((Object)tenant.getId()));
        if (haveTenant != null && haveTenant.getId() != null) {
            return resData;
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("tenantId", tenant.getId());
        map.put("yTenantId", tenant.getYTenantId());
        map.put("hasYTenantId", ExtSwitchUtil.isUiMetaWithYTenantId());
        map.put("yhtMode", false);
        TenantDataCopyService.getInstance().copy0TenantData(map);
        User user = (User)resData.get("user");
        Map<String, Object> obj = this.afterRegisterRule(tenant, user, new String[0]);
        obj.put("open_tenant_result", true);
        return obj;
    }

    protected Map<String, Object> afterRegisterRule(Tenant tenant, User user, String ... paramStr) throws Exception {
        Long start = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();
        if (paramStr != null && paramStr.length != 0) {
            requestId = paramStr[0];
        }
        try {
            BillContext billContext = new BillContext();
            billContext.setBillnum("corp");
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("tenant", tenant);
            paramMap.put("user", user);
            paramMap.put("openTenantGlobalTraceId", requestId);
            paramMap.put("openTenantRuleHandler", this.openTenantRuleHandler);
            RuleExecuteResult ruleResult = BillBiz.executeRule((String)"registeraction", (BillContext)billContext, paramMap);
            Object object = ruleResult.getData();
            HashMap<String, Object> resultMap = new HashMap<String, Object>();
            if (ruleResult != null && object != null) {
                if (object instanceof Map) {
                    return (Map)object;
                }
                resultMap.put("data", object);
                return resultMap;
            }
            return resultMap;
        }
        catch (Exception e) {
            this.logger.error("[RegisterService]afterRegisterRule\u6ce8\u518c\u540e\u65f6\u95f4\u5931\u8d25====" + e.getMessage(), (Throwable)e);
            throw e;
        }
    }

    public Boolean saveRegistInfo(Map data) throws Exception {
        String yxyTenantId = data.get("yxyTenantId").toString();
        String systemCode = data.get("systemCode").toString();
        if (StringUtils.isEmpty((CharSequence)yxyTenantId) || StringUtils.isEmpty((CharSequence)systemCode)) {
            throw new CoreDocBusinessException(null, "yxyTenantId is empty or systemCode is empty");
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"yxyTenantId").eq((Object)yxyTenantId)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        Map tenant = MetaDaoHelper.queryOne((String)"base.tenant.Tenant", (QuerySchema)schema);
        if (tenant == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801530);
        }
        HashMap params = new HashMap();
        params.put("tenantId", tenant.get("id"));
        params.put("tenant_id", tenant.get("id"));
        params.put("systemCode", systemCode);
        params.put("isRegist", 1);
        params.put("server", null);
        params.put("registDate", new Date());
        params.put("isRegisted", false);
        params.put("isPreseted", true);
        params.put("iDeleted", 0);
        params.put("ytenantId", data.get("yhtTenantId"));
        params.put("id", IdManager.getInstance().nextId());
        params.put("ytenant_id", data.get("yhtTenantId"));
        List registInfos = SqlHelper.selectList((String)"com.yonyoucloud.upc.dao.meta.init.queryRegistInfoList", params);
        if (CollectionUtils.isEmpty((Collection)registInfos)) {
            SqlHelper.insert((String)"com.yonyoucloud.upc.dao.meta.init.regUPC", params);
        }
        Tenant tenant1 = new Tenant();
        tenant1.init(tenant);
        this.modifyOptionData.updateOptionData(tenant1, systemCode);
        return true;
    }

    public void openSkuAsync(Map data) throws Exception {
        if (null == data.get("company") || !"yonyou".equals(data.get("company"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801531);
        }
        if (null == data.get("tenant_id")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801532);
        }
        if (null == data.get("ytenant_id")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801532);
        }
        data.put("ids", this.ymsOidGenerator.batchGets(4));
        SqlHelper.update((String)"com.yonyoucloud.upc.aa.industryinit.openSkuAsync", (Object)data);
    }
}

