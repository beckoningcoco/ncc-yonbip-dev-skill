/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.iuap.iris.IrisNCLocator
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.bs.logging.Logger
 *  nc.itf.businessevent.IEventListenerDispatchService
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.uap.businessevent.EventListenerVO
 */
package nc.bs.arap.cache;

import com.yonyou.cloud.iuap.iris.IrisNCLocator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.busireg.BillVerifyRule;
import nc.bs.arap.cache.ArapBusiPluginCache;
import nc.bs.framework.core.util.ObjectCreator;
import nc.bs.logging.Logger;
import nc.itf.businessevent.IEventListenerDispatchService;
import nc.pubitf.arap.pub.IArapTermDateQueryService;
import nc.vo.arap.termitem.ArapTermDateVO;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.uap.businessevent.EventListenerVO;

public class ArapBusiPluginCenter {
    private static final String AR_BUSIPLUGIN_SOURCEID = "ar-busiplugin";
    private static final String AP_BUSIPLUGIN_SOURCEID = "ap-busiplugin";
    private static final String TYPE_QUERY_TERMDATE = "20062000";
    private static final String TYPE_VERIFYRULE_REG = "20062030";

    public static List<Object> getAllVerifyrulePlugins(Integer syscode) throws BusinessException {
        ArrayList<Object> rules = new ArrayList<Object>();
        String sourceID = syscode == null || syscode == 0 ? AR_BUSIPLUGIN_SOURCEID : AP_BUSIPLUGIN_SOURCEID;
        String eventType = TYPE_VERIFYRULE_REG;
        ArapBusiPluginCenter.writeDebugLog(sourceID, eventType);
        Map<String, EventListenerVO> classNameMap = ArapBusiPluginCache.getInstance().getListenersInfo(sourceID, eventType);
        if (classNameMap == null || classNameMap.isEmpty()) {
            return rules;
        }
        for (String className : classNameMap.keySet()) {
            EventListenerVO listenervo = classNameMap.get(className);
            String devModuleCode = listenervo.getOwner();
            boolean localpugin = true;
            BillVerifyRule instance = null;
            try {
                instance = ArapBusiPluginCenter.getBillVerifyRuleInstance(className, devModuleCode);
            }
            catch (BusinessRuntimeException e) {
                localpugin = false;
            }
            if (localpugin) {
                rules.add(instance);
                continue;
            }
            String serverName = IrisNCLocator.getInstance().getServiceByModule(devModuleCode);
            if (serverName == null) {
                throw new BusinessException("ArapBusiPluginCache cann't find server of instance.ClassName: " + className + ", devModuleCode:" + devModuleCode + ". Please check register info in table pub_eventlistener");
            }
            String remoteInfo = serverName + "#" + className;
            rules.add(remoteInfo);
        }
        return rules;
    }

    private static BillVerifyRule getBillVerifyRuleInstance(String className, String devModuleCode) throws BusinessException {
        BillVerifyRule instance = null;
        Object o = ArapBusiPluginCenter.createInstance(className, devModuleCode);
        if (o != null) {
            if (o instanceof BillVerifyRule) {
                instance = (BillVerifyRule)o;
            } else {
                throw new BusinessException(ArapBusiPluginCenter.getNoInterfaceImpMessage(className, "BillVerifyRule"));
            }
        }
        return instance;
    }

    public static Map<String, ArapTermDateVO[]> queryTermDateVOs(String top_billtype, Map<String, String> toppaymentMap, boolean isincome) throws BusinessException {
        if (toppaymentMap.isEmpty()) {
            return new HashMap<String, ArapTermDateVO[]>();
        }
        String sourceID = isincome ? AR_BUSIPLUGIN_SOURCEID : AP_BUSIPLUGIN_SOURCEID;
        String eventType = TYPE_QUERY_TERMDATE;
        ArapBusiPluginCenter.writeDebugLog(sourceID, eventType);
        Map<String, EventListenerVO> classNameMap = ArapBusiPluginCache.getInstance().getListenersInfo(sourceID, eventType);
        if (classNameMap == null || classNameMap.isEmpty()) {
            return new HashMap<String, ArapTermDateVO[]>();
        }
        String className2 = null;
        String devModuleCode = null;
        IArapTermDateQueryService instance = null;
        String listenerClassName = null;
        String listenerServerName = null;
        for (String className2 : classNameMap.keySet()) {
            IEventListenerDispatchService eventDispatchService;
            Boolean returnVal;
            EventListenerVO listenervo = classNameMap.get(className2);
            devModuleCode = listenervo.getOwner();
            boolean localpugin = true;
            IArapTermDateQueryService tempinstance = null;
            try {
                tempinstance = ArapBusiPluginCenter.getQueryTermdateInstance(className2, devModuleCode);
            }
            catch (BusinessRuntimeException e) {
                localpugin = false;
            }
            if (localpugin) {
                if (!tempinstance.isSupportBilltype(top_billtype)) continue;
                instance = tempinstance;
                break;
            }
            String serverName = IrisNCLocator.getInstance().getServiceByModule(devModuleCode);
            if (serverName == null || !(returnVal = (Boolean)(eventDispatchService = (IEventListenerDispatchService)IrisNCLocator.getInstance().lookup(IEventListenerDispatchService.class, serverName)).synListenerClassDispatch(className2, "isSupportBilltype", new Object[]{top_billtype})).booleanValue()) continue;
            listenerClassName = className2;
            listenerServerName = serverName;
            break;
        }
        if (instance == null && listenerClassName == null) {
            return new HashMap<String, ArapTermDateVO[]>();
        }
        try {
            String classInfoMsg = "Plugin class [" + className2 + "] devModuleCode[" + devModuleCode + "]";
            Logger.debug((Object)(classInfoMsg + " begin."));
            Long start = System.currentTimeMillis();
            Map rs = null;
            if (instance != null) {
                rs = instance.queryTermDataVOs(top_billtype, toppaymentMap);
            } else if (listenerClassName != null) {
                IEventListenerDispatchService eventDispatchService = (IEventListenerDispatchService)IrisNCLocator.getInstance().lookup(IEventListenerDispatchService.class, listenerServerName);
                rs = (Map)eventDispatchService.synListenerClassDispatch(className2, "queryTermDataVOs", new Object[]{top_billtype, toppaymentMap});
            }
            Logger.debug((Object)(classInfoMsg + " end successfully.cost time : " + (System.currentTimeMillis() - start)));
            return rs == null ? new HashMap() : rs;
        }
        catch (BusinessException e) {
            Logger.error((Object)ArapBusiPluginCenter.getErrorMsg(sourceID, eventType, className2), (Throwable)e);
            throw e;
        }
        catch (RuntimeException e) {
            Logger.error((Object)ArapBusiPluginCenter.getErrorMsg(sourceID, eventType, className2), (Throwable)e);
            throw new BusinessException((Throwable)e);
        }
    }

    private static IArapTermDateQueryService getQueryTermdateInstance(String className, String devModuleCode) throws BusinessRuntimeException {
        IArapTermDateQueryService instance = null;
        Object o = ArapBusiPluginCenter.createInstance(className, devModuleCode);
        if (o != null) {
            if (o instanceof IArapTermDateQueryService) {
                instance = (IArapTermDateQueryService)o;
            } else {
                throw new BusinessRuntimeException(ArapBusiPluginCenter.getNoInterfaceImpMessage(className, "IArapTermDateQueryService"));
            }
        }
        return instance;
    }

    private static Object createInstance(String className, String devModuleCode) {
        Object instance = null;
        try {
            if (StringUtil.isEmptyWithTrim((String)devModuleCode)) {
                instance = ObjectCreator.newInstance((String)className);
                Logger.error((Object)"WARRING: ArapBusiPluginCache try to create instance without devModuleCode.");
            } else {
                instance = ObjectCreator.newInstance((String)devModuleCode, (String)className);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException("ArapBusiPluginCache cann't create instance in all devModuleCode. ClassName: " + className + ". Please check register info in table pub_eventlistener");
        }
        return instance;
    }

    private static String getNoInterfaceImpMessage(String classname, String iftname) {
        return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0887", null, new String[]{classname, iftname});
    }

    private static void writeDebugLog(String sourceID, String eventType) {
        if (Logger.isDebugEnabled()) {
            StringBuilder message = new StringBuilder();
            message.append("ArapBusiPluginCenter ");
            message.append(" EventSourceID\uff1a").append(sourceID);
            message.append(" Eventtype\uff1a").append(eventType);
            Logger.debug((Object)message);
        }
    }

    private static String getErrorMsg(String sourceID, String eventType, String currentClassName) {
        return "Exception happened in ArapBusiPluginCenter getPlugin. Plugin Class :" + currentClassName + " EventSourceID: " + sourceID + " Eventtype: " + eventType;
    }
}

