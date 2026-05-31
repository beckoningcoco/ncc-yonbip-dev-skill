/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.ApplicationContext
 *  org.springframework.context.annotation.Primary
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.event;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IOrgEnableEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IOrgEventConsumer;
import com.yonyoucloud.upc.enums.GradeManageControlServiceEnum;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerCostClass;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerCustCategory;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerManageClass;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerMerchant;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerProduct;
import com.yonyoucloud.upc.service.api.OrgEnableEventHandlerSaleArea;
import com.yonyoucloud.upc.service.factory.GradeManageControlServiceFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="orgEventConsumer")
@Primary
public class OrgEventConsumer
implements IOrgEventConsumer {
    private Logger logger = LoggerFactory.getLogger(OrgEventConsumer.class);
    @Autowired
    ApplicationContext appContext;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    @Override
    public Map<String, Object> onMcUpdate(Map bill) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
            String lockKey = null;
            String applyRangeLockKey = "applyRangeLockKey";
            int lockOutTime = 21600;
            String lockValue = UUID.randomUUID().toString();
            try {
                JSONObject obj;
                this.logger.info("\u6863\u6848\u7ba1\u63a7\u89c4\u5219\u4fee\u6539\u6d88\u606f sourceID\uff1a" + bill.get("sourceID") + " eventType:" + bill.get("eventType"));
                if ("BASEDOC".equals(bill.get("sourceID")) && "ENABLE_AFTER".equals(bill.get("eventType")) && RedisTool.tryGetLock((String)(lockKey = (obj = JSONObject.parseObject((String)bill.get("userObject").toString())).get((Object)"uuid") != null && !"".equals(obj.get((Object)"uuid")) ? obj.get((Object)"uuid").toString() : (bill.get("uuid") != null && !"".equals(bill.get("uuid")) ? bill.get("uuid").toString() : (bill.get("id") != null && !"".equals(bill.get("id")) ? bill.get("id").toString() : UUID.randomUUID().toString()))), (String)lockValue, (int)lockOutTime)) {
                    this.logger.info("\u6863\u6848\u7ba1\u63a7\u89c4\u5219\u4fee\u6539\u6d88\u606f doctype\uff1a" + obj.get((Object)"doctype"));
                    if ("mcdoc".equals(obj.get((Object)"doctype").toString())) {
                        this.logger.info("\u6863\u6848\u7ba1\u63a7\u89c4\u5219\u4fee\u6539\u6d88\u606f operator\uff1a" + obj.get((Object)"operator") + " option: " + obj.get((Object)"option"));
                        if ("ENABLE_AFTER".equals(obj.get((Object)"operator").toString()) && "SHARE_AFTER".equals(obj.get((Object)"option").toString())) {
                            Set entityNameSet;
                            Object dataObj = ((Map)obj.get((Object)"data")).get("dataNew");
                            JSONObject data = null;
                            if (dataObj != null) {
                                data = JSONObject.parseObject((String)dataObj.toString());
                            }
                            Object resultObj = ((Map)obj.get((Object)"data")).get("resultNew");
                            JSONObject shareRangeData = null;
                            if (resultObj != null) {
                                shareRangeData = JSONObject.parseObject((String)resultObj.toString());
                            }
                            if (data != null && !data.isEmpty()) {
                                entityNameSet = data.keySet();
                                for (String entityName : entityNameSet) {
                                    if (this.pubOptionService.getOrgGlobalShare(entityName).booleanValue() || data.get((Object)entityName) == null || CollectionUtils.isEmpty((Collection)((List)data.get((Object)entityName)))) continue;
                                    if (GradeManageControlServiceEnum.getByEntityName(entityName) == null) {
                                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_ENTITY_ORG_MANAGEMENT_ERROR, new Object[]{entityName});
                                    }
                                    applyRangeLockKey = "APPLY_RANGE_" + GradeManageControlServiceEnum.getByEntityName(entityName).getBillType() + AppContext.getTenantId();
                                    if (!RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)86400)) {
                                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR);
                                    }
                                    GradeManageControlServiceFactory.getMcUpdateEventHandler(entityName).Handle((List)data.get((Object)entityName));
                                    RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
                                }
                            }
                            if (shareRangeData != null && !shareRangeData.isEmpty()) {
                                entityNameSet = shareRangeData.keySet();
                                for (String entityName : entityNameSet) {
                                    if (this.pubOptionService.getOrgGlobalShare(entityName).booleanValue()) continue;
                                    if (GradeManageControlServiceEnum.getByEntityName(entityName) == null) {
                                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_ENTITY_ORG_MANAGEMENT_ERROR, new Object[]{entityName});
                                    }
                                    applyRangeLockKey = "APPLY_RANGE_" + GradeManageControlServiceEnum.getByEntityName(entityName).getBillType() + AppContext.getTenantId();
                                    if (RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)86400)) {
                                        JSONObject shareRangeDataMap = JSONObject.parseObject((String)shareRangeData.get((Object)entityName).toString());
                                        GradeManageControlServiceFactory.getMcUpdateEventHandler(entityName).HandleShareRange((Map)shareRangeDataMap);
                                        continue;
                                    }
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR);
                                }
                            }
                        }
                    }
                }
            }
            catch (Exception e) {
                this.logger.error("\u6863\u6848\u7ba1\u63a7\u89c4\u5219\u4fee\u6539\u6d88\u606f\u5904\u7406\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            }
            finally {
                if (lockKey != null) {
                    RedisTool.releaseLock(lockKey, (String)lockValue);
                }
                RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
            }
        }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getYmsLongTaskExecutorService());
        response.put("success", "true");
        return response;
    }

    @Override
    public Map<String, Object> onOrgUpdateParent(Map bill, String userObject) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        response.put("success", "true");
        RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
            this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f\u63a5\u6536\u6570\u636e: " + bill);
            try {
                this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f sourceID\uff1a" + bill.get("sourceID") + " eventType:" + bill.get("eventType"));
                if ("BASE_ORG_EVENT".equals(bill.get("sourceID")) && "UPDATE_AFTER".equals(bill.get("eventType"))) {
                    JSONObject obj = JSONObject.parseObject((String)userObject);
                    this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f doctype\uff1a" + obj.get((Object)"doctype"));
                    if ("adminorg".equals(obj.get((Object)"doctype").toString())) {
                        this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f operator\uff1a" + obj.get((Object)"operator") + " option: " + obj.get((Object)"option"));
                        if ("UPDATE_AFTER".equals(obj.get((Object)"operator").toString()) && "updateDept".equals(obj.get((Object)"option").toString())) {
                            JSONObject model = JSONObject.parseObject((String)obj.get((Object)"model").toString());
                            this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f enable\uff1a" + model.get((Object)"enable") + " isbizunit: " + obj.get((Object)"isbizunit"));
                            if (model.get((Object)"enable").equals(1) && obj.containsKey((Object)"ext")) {
                                this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f ext: " + obj.get((Object)"ext"));
                                JSONObject ext = JSONObject.parseObject((String)obj.get((Object)"ext").toString());
                                if (ext.containsKey("oldModel")) {
                                    this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f oldModel: " + obj.get((Object)"oldModel"));
                                    JSONObject oldModel = JSONObject.parseObject((String)ext.get("oldModel").toString());
                                    String oldParent = "";
                                    if (oldModel.containsKey((Object)"parentid")) {
                                        oldParent = oldModel.get((Object)"parentid").toString();
                                    }
                                    String newParent = "";
                                    if (model.containsKey((Object)"parentid")) {
                                        newParent = model.get((Object)"parentid").toString();
                                    }
                                    if (!oldParent.equalsIgnoreCase(newParent)) {
                                        String id = model.get((Object)"id").toString();
                                        Map map = this.appContext.getBeansOfType(IOrgEnableEventHandler.class);
                                        for (IOrgEnableEventHandler handler : map.values()) {
                                            this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f \u5f00\u59cb\u5904\u7406:" + handler.getClass().toString() + " \u53c2\u6570:" + id);
                                            this.doHangler(id, handler);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            catch (Exception e) {
                this.logger.error("\u7ec4\u7ec7\u53d8\u66f4\u4e0a\u7ea7\u6d88\u606f\u5904\u7406\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            }
        }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getYmsLongTaskExecutorService());
        return response;
    }

    private void doHangler(String orgId, IOrgEnableEventHandler handler) throws Exception {
        if (handler instanceof OrgEnableEventHandlerProduct && !this.pubOptionService.getOrgGlobalShare("pc.product.Product").booleanValue()) {
            handler.Handle(orgId);
        }
        if (handler instanceof OrgEnableEventHandlerMerchant && !this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            handler.Handle(orgId);
        }
        if (handler instanceof OrgEnableEventHandlerManageClass && !this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) {
            handler.Handle(orgId);
        }
        if (handler instanceof OrgEnableEventHandlerCostClass && !this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue()) {
            handler.Handle(orgId);
        }
        if (handler instanceof OrgEnableEventHandlerSaleArea && !this.pubOptionService.getOrgGlobalShare("aa.salearea.SaleArea").booleanValue()) {
            handler.Handle(orgId);
        }
        if (handler instanceof OrgEnableEventHandlerCustCategory && !this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory").booleanValue()) {
            handler.Handle(orgId);
        }
    }

    @Override
    public Map<String, Object> onOrgEnabled(Map bill, String userObject) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f\u63a5\u6536\u6570\u636e\uff1a" + bill);
        try {
            this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f sourceID\uff1a" + bill.get("sourceID") + " eventType:" + bill.get("eventType"));
            if ("BASE_ORG_EVENT".equals(bill.get("sourceID")) && "ENABLE_AFTER".equals(bill.get("eventType"))) {
                JSONObject obj = JSONObject.parseObject((String)userObject);
                this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f doctype\uff1a" + obj.get((Object)"doctype"));
                if ("adminorg".equals(obj.get((Object)"doctype").toString())) {
                    this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f operator\uff1a" + obj.get((Object)"operator") + " option: " + obj.get((Object)"option"));
                    if ("ENABLE_AFTER".equals(obj.get((Object)"operator").toString()) && "updateDept".equals(obj.get((Object)"option").toString())) {
                        JSONObject model = JSONObject.parseObject((String)obj.get((Object)"model").toString());
                        this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f enable\uff1a" + model.get((Object)"enable") + " isbizunit: " + obj.get((Object)"isbizunit"));
                        if ("1".equals(model.get((Object)"enable").toString()) && model.containsKey((Object)"isbizunit") && "1".equals(model.get((Object)"isbizunit").toString())) {
                            String id = model.get((Object)"id").toString();
                            Map map = this.appContext.getBeansOfType(IOrgEnableEventHandler.class);
                            for (IOrgEnableEventHandler handler : map.values()) {
                                this.logger.info("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f \u5f00\u59cb\u5904\u7406:" + handler.getClass().toString() + " \u53c2\u6570:" + id);
                                this.doHangler(id, handler);
                            }
                        }
                    }
                }
            }
            response.put("success", "true");
        }
        catch (Exception e) {
            this.logger.error("\u7ec4\u7ec7\u542f\u7528\u6d88\u606f\u5904\u7406\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            response.put("success", "false");
        }
        return response;
    }

    @Override
    public Map<String, Object> onOrgUpdateDoctype(Map bill, String userObject) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u804c\u80fd\u6d88\u606f\u63a5\u6536\u6570\u636e: " + bill);
        try {
            this.logger.info("\u7ec4\u7ec7\u53d8\u66f4\u804c\u80fd\u6d88\u606f sourceID\uff1a" + bill.get("sourceID") + " eventType:" + bill.get("eventType"));
            JSONObject obj = JSONObject.parseObject((String)userObject);
            JSONObject model = JSONObject.parseObject((String)obj.get((Object)"model").toString());
            if ("ADD_AFTER".equals(bill.get("eventType")) && "salesorg".equals(obj.get((Object)"doctype"))) {
                this.logger.info("\u7ec4\u7ec7\u589e\u52a0\u9500\u552e\u804c\u80fd\u6d88\u606f_\u7ec4\u7ec7Id\uff1a" + model.get("id"));
                if (model.get("id") != null && !"".equals(model.get("id"))) {
                    HashMap<String, String> param = new HashMap<String, String>();
                    param.put("orgId", model.get("id").toString());
                    param.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.addOrgUpdateDoctype", param);
                }
            } else if ("DELETE_AFTER".equals(bill.get("eventType")) && "salesorg".equals(obj.get((Object)"doctype"))) {
                this.logger.info("\u7ec4\u7ec7\u53d6\u6d88\u9500\u552e\u804c\u80fd\u6d88\u606f_\u7ec4\u7ec7Id\uff1a" + model.get("id"));
                if (model.get("id") != null && !"".equals(model.get("id"))) {
                    HashMap<String, String> param = new HashMap<String, String>();
                    param.put("orgId", model.get("id").toString());
                    param.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.option.dao.merchant.deleteOrgUpdateDoctype", param);
                }
            }
            response.put("success", "true");
        }
        catch (Exception e) {
            this.logger.error("\u7ec4\u7ec7\u53d8\u66f4\u804c\u80fd\u6d88\u606f\u5904\u7406\u5f02\u5e38" + e.getMessage(), (Throwable)e);
            response.put("success", "false");
        }
        return response;
    }
}

