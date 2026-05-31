/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.meta.loader.ViewModelLoader
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.data.productPro.ProductProDao
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassEnum
 *  com.yonyoucloud.upc.pc.userdef.UserDefineClass
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.lang.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.userdefine;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.api.interfaces.rpc.IComOperateApi;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.meta.loader.ViewModelLoader;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IProductUpdateOtherDbService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.billrule.userdefine.UserdefineUtils;
import com.yonyoucloud.upc.data.productPro.ProductProDao;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.pc.userdef.UserDefClassEnum;
import com.yonyoucloud.upc.pc.userdef.UserDefineClass;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.utils.MultilangUtil;
import iuap.yms.thread.api.YmsExecutors;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.core.lang.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="userDefineUretailRule")
public class UserDefineUretailRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(UserDefineUretailRule.class);
    private static Logger logger = LoggerFactory.getLogger(UserDefineUretailRule.class);
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    private static final String yhtTenantDomains = "QMS-DFM, QMS-QIT, ucf-amc-ambd";
    @Autowired
    private ProductProDao productProDao;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IProductUpdateOtherDbService productUpdateOtherDbService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        UserDefineClass userDefineClass;
        String tenantId = AppContext.getTenantId().toString();
        if (org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)tenantId) || "0".equals(tenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        String billNum = billContext.getBillnum();
        List bills = this.getBills(billContext, map);
        UserDefineClass udc = (UserDefineClass)bills.get(0);
        if (billNum.equals(UserDefClassEnum.PRODUCTSPEC.getBillnum())) {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(2);
            if (udc.getEntityStatus().equals((Object)EntityStatus.Update)) {
                UserDefineClass oldUDC = this.productProDao.selectUserdefClassById((Long)udc.getId());
                if (!oldUDC.getIsShowSpec().booleanValue()) {
                    return null;
                }
                paramMap.put("defineId", oldUDC.getDefineId());
            } else {
                paramMap.put("defineId", udc.getDefineId());
            }
            paramMap.put("ytenant_id", AppContext.getYTenantId());
            userDefineClass = (UserDefineClass)SqlHelper.selectOne((String)"com.yonyoucloud.upc.aa.industryinit.getUserDefByDefineId", paramMap);
            if (userDefineClass != null && userDefineClass.getType() == null) {
                userDefineClass.setType("Archive");
            }
        } else {
            HashMap<String, Object> paramMap = new HashMap<String, Object>(2);
            if (udc.getEntityStatus().equals((Object)EntityStatus.Update) || udc.getEntityStatus().equals((Object)EntityStatus.Delete)) {
                UserDefineClass oldUDC = this.productProDao.selectUserdefClassById((Long)udc.getId());
                paramMap.put("defineId", oldUDC.getDefineId());
            } else {
                paramMap.put("defineId", udc.getDefineId());
            }
            paramMap.put("ytenant_id", AppContext.getYTenantId());
            userDefineClass = (UserDefineClass)SqlHelper.selectOne((String)"com.yonyoucloud.upc.aa.industryinit.getUserDefByDefineId", paramMap);
        }
        if (userDefineClass != null) {
            userDefineClass.setShowItemResid(udc.getShowItemResid());
            this.updateBillByUserDef(userDefineClass);
            this.updateU8cprint(udc, userDefineClass.getDefineId());
        }
        return new RuleExecuteResult();
    }

    public void updateBillByUserDef(UserDefineClass userDefineClass) throws Exception {
        String ytenantId = (String)AppContext.getYTenantId();
        if (ObjectUtils.isEmpty((Object)ytenantId) || "0".equals(ytenantId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TENANT_INFO_ERROR);
        }
        if (UserDefClassEnum.PRODUCTSPEC.getClassIdValue().equals(userDefineClass.getClassId())) {
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("specid", userDefineClass.getId());
            paramMap.put("ytenant", ytenantId);
            paramMap.put("ytenant", AppContext.getYTenantId());
            if (this.dataSourceService.getDataSourceIsOscar()) {
                this.productUpdateOtherDbService.updateProductSpecItemOrder(paramMap);
            } else {
                SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductSpecItemOrder", paramMap);
            }
        }
        if ("String".equals(userDefineClass.getType()) && 1 == userDefineClass.getUserdefMode()) {
            userDefineClass.setType("Archive");
        }
        String controltype = this.productProDao.selectUserdefType(userDefineClass.getType());
        userDefineClass.set("cControlType", (Object)controltype);
        userDefineClass.setIsSerInput(Boolean.valueOf(false));
        List<Map<String, Object>> userConfigs = UserdefineUtils.getInstance().getUserConfigs("userdef", ytenantId, this.iupcControlRuleService);
        this.sendEventTo(userDefineClass, userConfigs);
        if (!CollectionUtils.isEmpty(userConfigs)) {
            Iterator<Map<String, Object>> var3 = userConfigs.iterator();
            String sql = UserdefineUtils.getInstance().buildUpdateItemSql(userDefineClass);
            String sqlYhttenant = UserdefineUtils.getInstance().buildUpdateItemSqlByYhtTenantid(userDefineClass);
            logger.debug("UserDefineUretailRule.updateBillByUserDef update sql: " + sql);
            RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                HashMap<String, Object> params = new HashMap<String, Object>(4);
                params.put("initUIMeta", true);
                while (var3.hasNext()) {
                    String domain;
                    Map userConfig = (Map)var3.next();
                    if (userConfig.get("domain") == null || "productcenter".equals(domain = userConfig.get("domain").toString()) || "SYS004".equals(domain)) continue;
                    params.put("domain", domain);
                    if (yhtTenantDomains.indexOf(domain) != -1) {
                        params.put("sql", sqlYhttenant);
                    } else {
                        params.put("sql", sql);
                    }
                    IComOperateApi comOperateApi = (IComOperateApi)IrisDynamicInvokeUtil.getService((String)"productcenter", (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IComOperateApi.class);
                    logger.info(MessageFormat.format("{0}=========\u4fee\u6539\u81ea\u5b9a\u4e49\u9879\uff0c\u8c03\u7528{1}\u670d\u52a1============={2}", userDefineClass.getShowItem(), domain, domain));
                    try {
                        int num = comOperateApi.executeSql("com.yonyou.ucf.mdd.ext.meta.dao.update", params);
                        logger.info(MessageFormat.format("{0}=========\u8c03\u7528{1}\u5904\u7406\u7ed3\u679c\uff0c\u5f71\u54cd\u6570\u636e\u6761\u6570============={2}", userDefineClass.getShowItem(), domain, num));
                    }
                    catch (Exception e) {
                        logger.error(MessageFormat.format("{0}\u8c03\u7528{1}\u63a5\u53e3\u5f02\u5e38\uff1a{2}", userDefineClass.getShowItem(), domain, e.getMessage()));
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_INVOKE_ERROR);
                    }
                }
            }, (ExecutorService)YmsExecutors.getYmsExecutor());
        }
        ViewModelLoader.clearCacheByTenant();
    }

    public void sendEventTo(UserDefineClass userDefineClass, List<Map<String, Object>> userConfigs) throws CoreDocBusinessException {
        this.ymsLongTaskExecutorService.execute(() -> {
            HashMap<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("userdefine", userDefineClass);
            paramMap.put("domains", userConfigs);
            paramMap.put("fullname", "pc.userdef.UserDefineClass");
            try {
                this.eventService2.sendEvent("YXYBASEDOC", "UPDATE_NOTIFY", paramMap);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080976", (String)"\u5220\u9664\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
            }
        });
    }

    public void updateU8cprint(UserDefineClass userDefineClass, String defineId) throws Exception {
        String showItem = (String)MultilangUtil.getAttr((String)"pc.userdef.UserDefineClass", (String)"showItem", (BizObject)userDefineClass, null);
        if (showItem == null || !userDefineClass.getIsEnabled().booleanValue()) {
            return;
        }
        HashMap<String, Object> names = new HashMap<String, Object>();
        names.put("name", showItem);
        names.put("name2", userDefineClass.get("showItem2"));
        names.put("name3", userDefineClass.get("showItem3"));
        names.put("name4", userDefineClass.get("showItem4"));
        names.put("name5", userDefineClass.get("showItem5"));
        names.put("name6", userDefineClass.get("showItem6"));
        this.cloudPrintDataSynchronBatch("0", defineId, JSONObject.toJSONString(names), AppContext.getCurrentUser().getYhtTenantId());
    }

    public void cloudPrintDataSynchronBatch(String isHeader, String cSelfDefineType, String nameJson, String tenantId) throws Exception {
        if (this.ymsParamConfig.getUrlU8cprint() == null) {
            return;
        }
        String url = this.ymsParamConfig.getUrlU8cprint() + "/bo/updateDefineAttribute";
        long starttime = System.currentTimeMillis();
        HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("isHeader", isHeader);
        paramMap.put("cSelfDefineType", cSelfDefineType);
        paramMap.put("multiNameJson", nameJson);
        paramMap.put("tenantId", tenantId);
        String paramStr = JSONObject.toJSONString(paramMap);
        logger.info(((Object)((Object)this)).getClass() + " paramStr:" + paramStr);
        HashMap<String, String> headers = new HashMap<String, String>();
        String wb_at = (String)AppContext.getThreadContext((String)"wb_at");
        String cookie = "wb_at=" + wb_at + "; yht_access_token=" + InvocationInfoProxy.getYhtAccessToken() + ";";
        headers.put("cookie", cookie);
        headers.put("domainDataBaseByCode", "SCM");
        this.ymsLongTaskExecutorService.execute(() -> {
            YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
            ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
            YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)paramMap).addHeader(ymsHttpHeader.addAllMap(headers)).build();
            try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
                String result = ymsHttpResponse.getBodyString();
                if (StringUtils.isEmpty((String)result) || !JSON.parseObject((String)result).get((Object)"status").equals(1)) {
                    String paramMapStr = JSONObject.toJSONString((Object)paramMap);
                    logger.error(((Object)((Object)this)).getClass() + " \u8c03\u7528\u4e91\u6253\u5370\u63a5\u53e3\u5931\u8d25:result=" + result + ";paramStr:" + paramMapStr);
                }
            }
            catch (Exception e) {
                logger.error("The YmsHttp call 'cloudPrintDataSynchronBatch' method failed because of the Exception!", (Throwable)e);
            }
            logger.info(((Object)((Object)this)).getClass() + " \u4e91\u6253\u5370\u6570\u636e\u540c\u6b65\u6240\u6d88\u8017\u7684\u65f6\u95f4\uff1a" + (System.currentTimeMillis() - starttime));
        });
    }
}

