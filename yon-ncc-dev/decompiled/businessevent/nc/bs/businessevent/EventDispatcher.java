/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.common.AbstractCommonConfigKey
 *  com.yonyou.cloud.common.IConfigKey
 *  com.yonyou.cloud.common.IConfigKey$Keys
 *  com.yonyou.cloud.iuap.iris.IrisNCLocator
 *  com.yonyou.cloud.middleware.MiddlewareRuntimeEnvironment
 *  com.yonyou.cloud.middleware.nccloud.transport.NcCodecAdapter
 *  com.yonyou.cloud.ncc.NCCEnv
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.bs.lic.tool.LicCanUseChecker
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.itf.uap.license.service.ICheckSeverStatus
 *  nc.mddb.baseutil.MDBaseUtil
 *  nc.vo.bd.pub.LocalAndIndustryLevelQueryUtil
 *  nc.vo.cache.CacheManager
 *  nc.vo.cache.config.CacheConfig
 *  nc.vo.cache.ext.ICacheVersionMonitor
 *  nc.vo.cache.ext.TableVersionMonitor
 *  nc.vo.cache.ext.VersionSensitiveMap
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.org.GroupVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 */
package nc.bs.businessevent;

import com.yonyou.cloud.common.AbstractCommonConfigKey;
import com.yonyou.cloud.common.IConfigKey;
import com.yonyou.cloud.iuap.iris.IrisNCLocator;
import com.yonyou.cloud.middleware.MiddlewareRuntimeEnvironment;
import com.yonyou.cloud.middleware.nccloud.transport.NcCodecAdapter;
import com.yonyou.cloud.ncc.NCCEnv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.framework.core.util.ObjectCreator;
import nc.bs.lic.tool.LicCanUseChecker;
import nc.bs.logging.Logger;
import nc.itf.businessevent.IEventListenerDispatchService;
import nc.itf.businessevent.IEventListenerQryService;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.license.service.ICheckSeverStatus;
import nc.mddb.baseutil.MDBaseUtil;
import nc.vo.bd.pub.LocalAndIndustryLevelQueryUtil;
import nc.vo.cache.CacheManager;
import nc.vo.cache.config.CacheConfig;
import nc.vo.cache.ext.ICacheVersionMonitor;
import nc.vo.cache.ext.TableVersionMonitor;
import nc.vo.cache.ext.VersionSensitiveMap;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.org.GroupVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.uap.businessevent.EventVOUtil;
import nc.vo.uap.businessevent.UnionVO;

public class EventDispatcher {
    private static Map<String, Map<String, Map<String, UnionVO>>> eventtype_ListenersMap = new ConcurrentHashMap<String, Map<String, Map<String, UnionVO>>>();
    private static Map<String, IBusinessListener> className_InstanceMap = new ConcurrentHashMap<String, IBusinessListener>();
    private static VersionSensitiveMap groupDataCacheMap = null;
    private static String currGroupTableName = "org_group";
    private static Object lockObj = new Object();
    static final String[] DEFAULT_LOCAL_MODULE = new String[]{"baseapp", "uap"};

    public static void fireEvent(IBusinessEvent event) throws BusinessException {
        if (NCCEnv.isMerged() || "uap-init".equalsIgnoreCase((String)MiddlewareRuntimeEnvironment.get((IConfigKey)AbstractCommonConfigKey.APP_CODE))) {
            EventDispatcher.MegedServer(event);
        } else {
            EventDispatcher.unMergedServer(event);
        }
    }

    public static void fireEventWithClasses(Map<String, UnionVO> classNameMap, IBusinessEvent event) throws BusinessException {
        EventDispatcher.DispatchWithClasses(classNameMap, event);
    }

    private static void DispatchWithClasses(Map<String, UnionVO> classNameMap, IBusinessEvent event) throws BusinessException {
        EventDispatcher.MegedDispatch(event, classNameMap);
    }

    private static void MegedServer(IBusinessEvent event) throws BusinessException {
        Map<String, UnionVO> classNameMap = EventDispatcher.getListenersInfo(event.getSourceID(), event.getEventType());
        EventDispatcher.MegedDispatch(event, classNameMap);
    }

    private static void MegedDispatch(IBusinessEvent event, Map<String, UnionVO> classNameMap) throws BusinessException {
        if (classNameMap == null || classNameMap.isEmpty()) {
            return;
        }
        String className2 = null;
        String devModuleCode = null;
        try {
            String currgroup_localtype = EventDispatcher.getCurrGroupLocalType();
            String currgroup_industrytype = EventDispatcher.getCurrGroupIndustryType();
            for (String className2 : classNameMap.keySet()) {
                String industrytype;
                UnionVO unionvo = classNameMap.get(className2);
                if ("0".equals(unionvo.getListenertype())) continue;
                devModuleCode = unionvo.getDevmodulecode();
                String classInfoMsg = "Plugin class [" + className2 + "] modulecode [" + devModuleCode + "] ";
                String localtype = StringUtil.isEmpty((String)unionvo.getLocaltype()) ? "" : unionvo.getLocaltype();
                int level = LocalAndIndustryLevelQueryUtil.getLevelByLocalAndIndustry((String)localtype, (String)(industrytype = StringUtil.isEmpty((String)unionvo.getIndustrytype()) ? "" : unionvo.getIndustrytype()), (String)currgroup_localtype, (String)currgroup_industrytype);
                if (level != 1 && level != 2 && level != 3 && level != 4) continue;
                Logger.debug((Object)(classInfoMsg + " begin."));
                IBusinessListener instance = EventDispatcher.getInstanceByClassName(className2, devModuleCode);
                instance.doAction(event);
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)EventDispatcher.getErrorMsg(event, className2), (Throwable)e);
            throw e;
        }
        catch (RuntimeException e) {
            Logger.error((Object)EventDispatcher.getErrorMsg(event, className2), (Throwable)e);
            throw e;
        }
    }

    private static void unMergedServer(IBusinessEvent event) throws BusinessException {
        block23: {
            Map<String, UnionVO> classNameMap = EventDispatcher.getListenersInfo(event.getSourceID(), event.getEventType());
            if (classNameMap == null || classNameMap.isEmpty()) {
                return;
            }
            String currentServerName = (String)MiddlewareRuntimeEnvironment.get((IConfigKey)AbstractCommonConfigKey.APP_CODE);
            HashMap validatePlugins = new HashMap();
            HashMap writePlugins = new HashMap();
            ArrayList otherPluginsInOrder = new ArrayList();
            String className22 = null;
            String devModuleCode = null;
            try {
                ArrayList<UnionVO> vos;
                String currgroup_localtype = EventDispatcher.getCurrGroupLocalType();
                String currgroup_industrytype = EventDispatcher.getCurrGroupIndustryType();
                for (String className22 : classNameMap.keySet()) {
                    String industrytype;
                    String localtype;
                    int level;
                    ICheckSeverStatus is;
                    UnionVO unionVO = classNameMap.get(className22);
                    devModuleCode = unionVO.getDevmodulecode();
                    String classInfoMsg = "Plugin class [" + className22 + "] modulecode [" + devModuleCode + "] ";
                    Logger.debug((Object)classInfoMsg);
                    if (devModuleCode == null) continue;
                    String owner = unionVO.getOwner();
                    if (RuntimeEnv.getInstance().isRunningOnCloud() && !(is = (ICheckSeverStatus)NCLocator.getInstance().lookup(ICheckSeverStatus.class)).checkAppByService(unionVO.getDevmodulecode()) || (level = LocalAndIndustryLevelQueryUtil.getLevelByLocalAndIndustry((String)(localtype = StringUtil.isEmpty((String)unionVO.getLocaltype()) ? "" : unionVO.getLocaltype()), (String)(industrytype = StringUtil.isEmpty((String)unionVO.getIndustrytype()) ? "" : unionVO.getIndustrytype()), (String)currgroup_localtype, (String)currgroup_industrytype)) != 1 && level != 2 && level != 3 && level != 4) continue;
                    Logger.debug((Object)(classInfoMsg + " begin."));
                    String serverName = IrisNCLocator.getInstance().getServiceByModule(unionVO.getDevmodulecode());
                    if (serverName != null) {
                        HashMap<String, UnionVO> server_plugin;
                        if (currentServerName.equals(serverName)) {
                            server_plugin = new HashMap<String, UnionVO>();
                            server_plugin.put(serverName, unionVO);
                            otherPluginsInOrder.add(server_plugin);
                            continue;
                        }
                        if ("0".equals(unionVO.getListenertype())) {
                            if (validatePlugins.get(serverName) == null) {
                                vos = new ArrayList();
                                vos.add(unionVO);
                                validatePlugins.put(serverName, vos);
                                continue;
                            }
                            ((List)validatePlugins.get(serverName)).add(unionVO);
                            continue;
                        }
                        if ("1".equals(unionVO.getListenertype())) {
                            if (writePlugins.get(serverName) == null) {
                                vos = new ArrayList();
                                vos.add(unionVO);
                                writePlugins.put(serverName, vos);
                                continue;
                            }
                            ((List)writePlugins.get(serverName)).add(unionVO);
                            continue;
                        }
                        server_plugin = new HashMap();
                        server_plugin.put(serverName, unionVO);
                        otherPluginsInOrder.add(server_plugin);
                        continue;
                    }
                    throw new BusinessException(classInfoMsg + " can't find server");
                }
                if (validatePlugins.size() > 0) {
                    for (String string : validatePlugins.keySet()) {
                        EventDispatcher.listenerDispatch((List)validatePlugins.get(string), event, string, true);
                    }
                }
                if (writePlugins.size() > 0) {
                    for (String string : writePlugins.keySet()) {
                        EventDispatcher.listenerDispatch((List)writePlugins.get(string), event, string, false);
                    }
                }
                if (otherPluginsInOrder.size() <= 0) break block23;
                for (Map map : otherPluginsInOrder) {
                    HashMap otherPlugins = new HashMap();
                    boolean toOtherServerFlag = false;
                    for (String server : map.keySet()) {
                        IBusinessListener instance = null;
                        try {
                            instance = EventDispatcher.getInstanceByClassName(((UnionVO)map.get(server)).getImplClassname(), ((UnionVO)map.get(server)).getDevmodulecode());
                        }
                        catch (BusinessRuntimeException e) {
                            if (otherPlugins.get(server) == null) {
                                vos = new ArrayList<UnionVO>();
                                vos.add((UnionVO)map.get(server));
                                otherPlugins.put(server, vos);
                            } else {
                                ((List)otherPlugins.get(server)).add(map.get(server));
                            }
                            toOtherServerFlag = true;
                        }
                        if (instance == null) continue;
                        instance.doAction(event);
                    }
                    if (!toOtherServerFlag) continue;
                    for (String other : otherPlugins.keySet()) {
                        if (other != null && other.equalsIgnoreCase(currentServerName)) {
                            List errorPlugins = (List)otherPlugins.get(other);
                            StringBuilder sb = new StringBuilder("\u4ee5\u4e0b\u76d1\u542c\u5728" + other + "\u670d\u52a1\u4e0a\u627e\u4e0d\u5230:");
                            for (UnionVO plugin : errorPlugins) {
                                sb.append(plugin.getImplClassname());
                                sb.append("\n");
                            }
                            throw new BusinessException(sb.toString());
                        }
                        EventDispatcher.listenerDispatch((List)otherPlugins.get(other), event, other, true);
                    }
                }
            }
            catch (Exception e) {
                Logger.error((Object)EventDispatcher.getErrorMsg(event, className22), (Throwable)e);
                throw new BusinessException(e.getMessage(), (Throwable)e);
            }
        }
    }

    private static void listenerDispatch(List<UnionVO> plugins, IBusinessEvent event, String server, boolean isyn) throws BusinessException {
        try {
            NcCodecAdapter codAdapter = new NcCodecAdapter();
            byte[] eventbyte = codAdapter.encode((Object)event);
            byte[] pluginsVO = codAdapter.encode(plugins);
            IEventListenerDispatchService eventDispatchService = (IEventListenerDispatchService)IrisNCLocator.getInstance().lookup(IEventListenerDispatchService.class, server);
            if (isyn) {
                eventDispatchService.synEventListenerDispatch(pluginsVO, eventbyte);
            } else {
                eventDispatchService.asynEventListenerDispatch(pluginsVO, eventbyte);
            }
        }
        catch (Exception e) {
            EventDispatcher.buildException(plugins, event, server, isyn, e);
        }
    }

    private static void buildException(List<UnionVO> plugins, IBusinessEvent event, String server, boolean isyn, Exception e) throws BusinessException {
        String environmentType = (String)MiddlewareRuntimeEnvironment.get((IConfigKey)IConfigKey.Keys.PROFILE);
        StringBuilder errorLog = new StringBuilder(e.getMessage());
        errorLog.append("\r\nserverName:" + server + "; evSourceID:" + event.getSourceID() + "; evType:" + event.getEventType() + "; isyn:" + isyn + "\r\n");
        for (UnionVO vo : plugins) {
            errorLog.append("Plugin class [" + vo.getImplClassname() + "] modulecode [" + vo.getDevmodulecode() + "] ");
        }
        if ("dev".equals(environmentType)) {
            Logger.error((Object)errorLog.toString());
            throw new BusinessException(errorLog.toString(), (Throwable)e);
        }
        Logger.error((Object)errorLog.toString());
        throw new BusinessException(e.getMessage(), (Throwable)e);
    }

    public static void fireEventSync(IBusinessEvent event) throws BusinessException {
        if (NCCEnv.isMerged() || "uap-init".equalsIgnoreCase((String)MiddlewareRuntimeEnvironment.get((IConfigKey)AbstractCommonConfigKey.APP_CODE))) {
            EventDispatcher.mergedServerSync(event);
        } else {
            EventDispatcher.unMergedServerSync(event);
        }
    }

    private static void mergedServerSync(IBusinessEvent event) throws BusinessException {
        EventDispatcher.writeDebugLog(event);
        Map<String, UnionVO> classNameMap = EventDispatcher.getListenersInfo(event.getSourceID(), event.getEventType());
        if (classNameMap == null || classNameMap.isEmpty()) {
            return;
        }
        String className2 = null;
        String devModuleCode = null;
        try {
            String currgroup_localtype = EventDispatcher.getCurrGroupLocalType();
            String currgroup_industrytype = EventDispatcher.getCurrGroupIndustryType();
            ArrayList<BusinessException> exceptions = new ArrayList<BusinessException>();
            for (String className2 : classNameMap.keySet()) {
                String industrytype;
                UnionVO unionvo = classNameMap.get(className2);
                if ("0".equals(unionvo.getListenertype())) continue;
                devModuleCode = unionvo.getDevmodulecode();
                String classInfoMsg = "Plugin class [" + className2 + "] modulecode [" + devModuleCode + "] ";
                String localtype = StringUtil.isEmpty((String)unionvo.getLocaltype()) ? "" : unionvo.getLocaltype();
                int level = LocalAndIndustryLevelQueryUtil.getLevelByLocalAndIndustry((String)localtype, (String)(industrytype = StringUtil.isEmpty((String)unionvo.getIndustrytype()) ? "" : unionvo.getIndustrytype()), (String)currgroup_localtype, (String)currgroup_industrytype);
                if (level != 1 && level != 2 && level != 3 && level != 4) continue;
                Logger.debug((Object)(classInfoMsg + " begin."));
                Long start = System.currentTimeMillis();
                IBusinessListener instance = EventDispatcher.getInstanceByClassName(className2, devModuleCode);
                try {
                    instance.doAction(event);
                }
                catch (BusinessException e) {
                    Logger.error((Object)EventDispatcher.getErrorMsg(event, className2), (Throwable)e);
                    exceptions.add(e);
                }
                Logger.debug((Object)(classInfoMsg + " end successfully.cost time : " + (System.currentTimeMillis() - start)));
            }
            if (exceptions.size() > 0) {
                StringBuffer sb = new StringBuffer();
                for (BusinessException ex : exceptions) {
                    sb.append(ex.getMessage());
                    sb.append("\n");
                }
                throw new BusinessException(sb.toString());
            }
        }
        catch (RuntimeException e) {
            Logger.error((Object)EventDispatcher.getErrorMsg(event, className2), (Throwable)e);
            throw e;
        }
    }

    private static void unMergedServerSync(IBusinessEvent event) throws BusinessException {
        EventDispatcher.writeDebugLog(event);
        Map<String, UnionVO> classNameMap = EventDispatcher.getListenersInfo(event.getSourceID(), event.getEventType());
        if (classNameMap == null || classNameMap.isEmpty()) {
            return;
        }
        String currentServerName = (String)MiddlewareRuntimeEnvironment.get((IConfigKey)AbstractCommonConfigKey.APP_CODE);
        HashMap validatePlugins = new HashMap();
        HashMap writePlugins = new HashMap();
        ArrayList otherPluginsInOrder = new ArrayList();
        String className22 = null;
        String devModuleCode = null;
        try {
            ArrayList<UnionVO> vos;
            String currgroup_localtype = EventDispatcher.getCurrGroupLocalType();
            String currgroup_industrytype = EventDispatcher.getCurrGroupIndustryType();
            ArrayList<BusinessException> exceptions = new ArrayList<BusinessException>();
            for (String className22 : classNameMap.keySet()) {
                String industrytype;
                String localtype;
                int level;
                UnionVO unionVO = classNameMap.get(className22);
                devModuleCode = unionVO.getDevmodulecode();
                String classInfoMsg = "Plugin class [" + className22 + "] modulecode [" + devModuleCode + "] ";
                Logger.debug((Object)classInfoMsg);
                if (devModuleCode == null) continue;
                String owner = unionVO.getOwner();
                if (!LicCanUseChecker.getInstance().isCanUse(owner) || (level = LocalAndIndustryLevelQueryUtil.getLevelByLocalAndIndustry((String)(localtype = StringUtil.isEmpty((String)unionVO.getLocaltype()) ? "" : unionVO.getLocaltype()), (String)(industrytype = StringUtil.isEmpty((String)unionVO.getIndustrytype()) ? "" : unionVO.getIndustrytype()), (String)currgroup_localtype, (String)currgroup_industrytype)) != 1 && level != 2 && level != 3 && level != 4) continue;
                Logger.debug((Object)(classInfoMsg + " begin."));
                String serverName = IrisNCLocator.getInstance().getServiceByModule(unionVO.getDevmodulecode());
                if (serverName != null) {
                    HashMap<String, UnionVO> server_plugin;
                    if (currentServerName.equals(serverName)) {
                        server_plugin = new HashMap<String, UnionVO>();
                        server_plugin.put(serverName, unionVO);
                        otherPluginsInOrder.add(server_plugin);
                        continue;
                    }
                    if ("0".equals(unionVO.getListenertype())) {
                        if (validatePlugins.get(serverName) == null) {
                            vos = new ArrayList();
                            vos.add(unionVO);
                            validatePlugins.put(serverName, vos);
                            continue;
                        }
                        ((List)validatePlugins.get(serverName)).add(unionVO);
                        continue;
                    }
                    if ("1".equals(unionVO.getListenertype())) {
                        if (writePlugins.get(serverName) == null) {
                            vos = new ArrayList();
                            vos.add(unionVO);
                            writePlugins.put(serverName, vos);
                            continue;
                        }
                        ((List)writePlugins.get(serverName)).add(unionVO);
                        continue;
                    }
                    server_plugin = new HashMap();
                    server_plugin.put(serverName, unionVO);
                    otherPluginsInOrder.add(server_plugin);
                    continue;
                }
                exceptions.add(new BusinessException(classInfoMsg + " can't find server"));
            }
            if (validatePlugins.size() > 0) {
                for (String string : validatePlugins.keySet()) {
                    try {
                        EventDispatcher.listenerDispatch((List)validatePlugins.get(string), event, string, true);
                    }
                    catch (Exception e) {
                        Logger.error((Object)EventDispatcher.getErrorMsg(event, className22), (Throwable)e);
                        BusinessException busie = new BusinessException(e.getMessage(), (Throwable)e);
                        exceptions.add(busie);
                    }
                }
            }
            if (writePlugins.size() > 0) {
                for (String string : writePlugins.keySet()) {
                    EventDispatcher.listenerDispatch((List)writePlugins.get(string), event, string, false);
                }
            }
            if (otherPluginsInOrder.size() > 0) {
                for (Map map : otherPluginsInOrder) {
                    HashMap otherPlugins = new HashMap();
                    boolean toOtherServerFlag = false;
                    for (String server : map.keySet()) {
                        IBusinessListener instance = null;
                        try {
                            instance = EventDispatcher.getInstanceByClassName(((UnionVO)map.get(server)).getImplClassname(), ((UnionVO)map.get(server)).getDevmodulecode());
                        }
                        catch (BusinessRuntimeException e) {
                            if (otherPlugins.get(server) == null) {
                                vos = new ArrayList<UnionVO>();
                                vos.add((UnionVO)map.get(server));
                                otherPlugins.put(server, vos);
                            } else {
                                ((List)otherPlugins.get(server)).add(map.get(server));
                            }
                            toOtherServerFlag = true;
                        }
                        if (instance == null) continue;
                        try {
                            instance.doAction(event);
                        }
                        catch (BusinessException e) {
                            exceptions.add(e);
                        }
                    }
                    if (!toOtherServerFlag) continue;
                    for (String other : otherPlugins.keySet()) {
                        if (other != null && other.equalsIgnoreCase(currentServerName)) {
                            List errorPlugins = (List)otherPlugins.get(other);
                            StringBuilder sb = new StringBuilder("\u4ee5\u4e0b\u76d1\u542c\u5728" + other + "\u670d\u52a1\u4e0a\u627e\u4e0d\u5230:");
                            for (UnionVO plugin : errorPlugins) {
                                sb.append(plugin.getImplClassname());
                                sb.append("\n");
                            }
                            exceptions.add(new BusinessException(sb.toString()));
                        }
                        EventDispatcher.listenerDispatch((List)otherPlugins.get(other), event, other, true);
                    }
                }
            }
            if (exceptions.size() > 0) {
                StringBuffer sb = new StringBuffer();
                for (BusinessException ex : exceptions) {
                    sb.append(ex.getMessage());
                    sb.append("\r\n");
                }
                throw new BusinessException(sb.toString());
            }
        }
        catch (Exception e) {
            Logger.error((Object)EventDispatcher.getErrorMsg(event, className22), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    private static String getCurrGroupIndustryType() throws BusinessException {
        String result = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        GroupCacheObject groupCacheObject = EventDispatcher.getGroupCacheObject(pk_group);
        result = groupCacheObject != null ? groupCacheObject.getIndustry() : MDBaseUtil.getCurrentIndustryCode();
        return result;
    }

    private static String getCurrGroupLocalType() throws BusinessException {
        String result = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        GroupCacheObject groupCacheObject = EventDispatcher.getGroupCacheObject(pk_group);
        result = groupCacheObject != null ? groupCacheObject.getLocal() : LocalAndIndustryLevelQueryUtil.DEFAULTCOUNTRYZONE;
        return result;
    }

    private static synchronized GroupCacheObject getGroupCacheObject(String pk_group) throws BusinessException {
        GroupCacheObject groupCacheObject = null;
        if (StringUtil.isEmpty((String)pk_group)) {
            return groupCacheObject;
        }
        Object object = EventDispatcher.getGroupDataCacheMap().get(pk_group);
        if (object == null) {
            groupCacheObject = new GroupCacheObject();
            String[] selectColumns = new String[]{"countryzone", "ncindustry"};
            String groupLocalByPK = null;
            String groupIndustryByPK = null;
            GroupVO groupvo = (GroupVO)EventDispatcher.getUAPQueryBSService().retrieveByPK(GroupVO.class, pk_group, selectColumns);
            if (groupvo != null) {
                groupLocalByPK = groupvo.getCountryzone();
                groupIndustryByPK = groupvo.getNcindustry();
            }
            if (StringUtil.isEmpty(groupIndustryByPK)) {
                groupIndustryByPK = MDBaseUtil.getCurrentIndustryCode();
            }
            if (StringUtil.isEmpty((String)groupLocalByPK)) {
                groupLocalByPK = LocalAndIndustryLevelQueryUtil.DEFAULTCOUNTRYZONE;
            }
            groupCacheObject.setIndustry(groupIndustryByPK);
            groupCacheObject.setLocal(groupLocalByPK);
            EventDispatcher.getGroupDataCacheMap().put(pk_group, groupCacheObject);
        } else if (object instanceof GroupCacheObject) {
            groupCacheObject = (GroupCacheObject)object;
        }
        return groupCacheObject;
    }

    private static synchronized Map getGroupDataCacheMap() {
        if (groupDataCacheMap == null) {
            CacheConfig config = new CacheConfig();
            config.setRegionName(currGroupTableName);
            config.setCacheType(5);
            config.setMemFileCacheType(2);
            config.setSize(200);
            if (RuntimeEnv.getInstance().isRunningInServer()) {
                config.setCacheType(3);
            }
            Map cache = CacheManager.getInstance().getCache(config).toMap();
            TableVersionMonitor tvm = new TableVersionMonitor(new String[]{currGroupTableName}, 60000L, currGroupTableName + "_monitor");
            groupDataCacheMap = new VersionSensitiveMap(cache, (ICacheVersionMonitor)tvm);
        }
        return groupDataCacheMap;
    }

    static void removeListeners(String dsName) {
        eventtype_ListenersMap.remove(dsName);
    }

    private static String getErrorMsg(IBusinessEvent event, String currentClassName) {
        return "Exception happened in EventDispatcher fireEvent. Plugin Class :" + currentClassName + " EventSourceID: " + event.getSourceID() + " Eventtype: " + event.getEventType();
    }

    public static boolean isNeedFireEvent(String sourceid, String ... eventTypes) throws BusinessException {
        for (String eventType : eventTypes) {
            Map<String, UnionVO> classNameMap = EventDispatcher.getListenersInfo(sourceid, eventType);
            if (classNameMap == null || classNameMap.isEmpty()) continue;
            return true;
        }
        return false;
    }

    private static void writeDebugLog(IBusinessEvent event) {
        if (Logger.isDebugEnabled()) {
            StringBuilder message = new StringBuilder();
            message.append("EventDispatcher ");
            message.append(" EventSourceID\uff1a").append(event.getSourceID());
            message.append(" Eventtype\uff1a").append(event.getEventType());
            Logger.debug((Object)message);
        }
    }

    public static Map<String, UnionVO> getListenersInfo(String docName, String eventType) throws BusinessException {
        Map<String, UnionVO> allTypeMap;
        Map<String, Map<String, UnionVO>> sourceType_ClassNamesMap = EventDispatcher.getEventType_ClassNameMap();
        LinkedHashMap<String, UnionVO> result = new LinkedHashMap<String, UnionVO>();
        String key = EventDispatcher.getKey(docName, eventType);
        Map<String, UnionVO> map = sourceType_ClassNamesMap.get(key);
        if (map != null && !map.isEmpty()) {
            result.putAll(map);
        }
        if (RuntimeEnv.getInstance().isRunningInServer() && (allTypeMap = sourceType_ClassNamesMap.get(key = EventDispatcher.getKey("ALL", eventType))) != null && allTypeMap.size() > 0) {
            result.putAll(allTypeMap);
        }
        return result;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<String, Map<String, UnionVO>> getEventType_ClassNameMap() throws BusinessException {
        String dataSource = InvocationInfoProxy.getInstance().getUserDataSource();
        Map<String, Map<String, UnionVO>> eventType_ClassNamesMap = eventtype_ListenersMap.get(dataSource);
        if (eventType_ClassNamesMap != null) return eventType_ClassNamesMap;
        Class<EventDispatcher> clazz = EventDispatcher.class;
        synchronized (EventDispatcher.class) {
            eventType_ClassNamesMap = eventtype_ListenersMap.get(dataSource);
            if (eventType_ClassNamesMap != null) return eventType_ClassNamesMap;
            eventType_ClassNamesMap = EventDispatcher.getAllListenersMap();
            eventtype_ListenersMap.put(dataSource, eventType_ClassNamesMap);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return eventType_ClassNamesMap;
        }
    }

    private static Map<String, Map<String, UnionVO>> getAllListenersMap() throws BusinessException {
        UnionVO[] vos = EventDispatcher.getAllListenersByOrder();
        ConcurrentHashMap<String, Map<String, UnionVO>> type_ListenerClassNamesMap = new ConcurrentHashMap<String, Map<String, UnionVO>>();
        String key = null;
        LinkedHashMap<String, UnionVO> classNameMap = null;
        for (UnionVO vo : vos) {
            key = EventDispatcher.getKey(vo.getSourceID(), vo.getEventType());
            classNameMap = (LinkedHashMap<String, UnionVO>)type_ListenerClassNamesMap.get(key);
            if (classNameMap == null) {
                classNameMap = new LinkedHashMap<String, UnionVO>();
                type_ListenerClassNamesMap.put(key, classNameMap);
            }
            classNameMap.put(vo.getImplClassname(), vo);
        }
        return type_ListenerClassNamesMap;
    }

    private static UnionVO[] getAllListenersByOrder() throws BusinessException {
        UnionVO[] vos = EventDispatcher.getQueryService().getAllListeners();
        if (vos == null || vos.length == 0) {
            return new UnionVO[0];
        }
        Arrays.sort(vos, EventVOUtil.getUnionVOComparator());
        return vos;
    }

    private static IEventListenerQryService getQueryService() {
        return (IEventListenerQryService)NCLocator.getInstance().lookup(IEventListenerQryService.class);
    }

    private static IUAPQueryBS getUAPQueryBSService() {
        return (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
    }

    private static String getKey(String docName, String eventType) {
        if ("ALL".equals(docName)) {
            return docName + "@" + "ALL";
        }
        return docName + "@" + eventType;
    }

    private static IBusinessListener getInstanceByClassName(String className, String devModuleCode) {
        String key = className + devModuleCode;
        IBusinessListener instance = className_InstanceMap.get(key);
        if (instance == null) {
            instance = EventDispatcher.createInstance(className, devModuleCode);
            className_InstanceMap.put(key, instance);
        }
        return instance;
    }

    private static IBusinessListener createInstance(String className, String devModuleCode) {
        IBusinessListener instance = null;
        try {
            try {
                instance = (IBusinessListener)ObjectCreator.newInstance((String)devModuleCode, (String)className);
            }
            catch (Exception e) {
                Logger.error((Object)("cann't create instance. ClassName: " + className + ", devModuleCode:" + devModuleCode + ". Please check register info in table pub_eventlistener\n"));
                Logger.error((Object)"try to create instance without devModuleCode.");
                instance = (IBusinessListener)ObjectCreator.newInstance((String)className);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException("cann't create instance in all devModuleCode. ClassName: " + className + ". Please check register info in table pub_eventlistener");
        }
        return instance;
    }

    public static void clearCache() {
        eventtype_ListenersMap.clear();
        className_InstanceMap.clear();
    }

    private static class GroupCacheObject {
        private String industry = null;
        private String local = null;

        private GroupCacheObject() {
        }

        public String getIndustry() {
            return this.industry;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public String getLocal() {
            return this.local;
        }

        public void setLocal(String local) {
            this.local = local;
        }
    }
}

