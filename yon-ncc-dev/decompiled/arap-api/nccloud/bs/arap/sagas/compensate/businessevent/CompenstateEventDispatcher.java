/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.bs.logging.Logger
 *  nc.itf.businessevent.IEventListenerQryService
 *  nc.itf.uap.IUAPQueryBS
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
 *  nc.vo.uap.businessevent.EventVOUtil
 *  nc.vo.uap.businessevent.UnionVO
 */
package nccloud.bs.arap.sagas.compensate.businessevent;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.framework.core.util.ObjectCreator;
import nc.bs.logging.Logger;
import nc.itf.businessevent.IEventListenerQryService;
import nc.itf.uap.IUAPQueryBS;
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
import nccloud.bs.arap.sagas.compensate.businessevent.ShareComponentListernerList;
import nccloud.bs.arap.sagas.util.SagasUtils;

public class CompenstateEventDispatcher {
    private static final String MODULECODE_ARAP = "arap";
    private static Map<String, Map<String, Map<String, UnionVO>>> eventtype_ListenersMap = new ConcurrentHashMap<String, Map<String, Map<String, UnionVO>>>();
    private static Map<String, IBusinessListener> className_InstanceMap = new ConcurrentHashMap<String, IBusinessListener>();
    private static VersionSensitiveMap groupDataCacheMap = null;
    private static String currGroupTableName = "org_group";
    private static Object lockObj = new Object();
    static final String[] DEFAULT_LOCAL_MODULE = new String[]{"baseapp", "uap"};

    public static void fireEvent(IBusinessEvent event) throws BusinessException {
        if (SagasUtils.isCompensateStage()) {
            CompenstateEventDispatcher.fireCompenstateEvent(event);
        } else {
            EventDispatcher.fireEvent((IBusinessEvent)event);
        }
    }

    private static void fireCompenstateEvent(IBusinessEvent event) throws BusinessException {
        CompenstateEventDispatcher.writeDebugLog(event);
        Map<String, UnionVO> classNameMap = CompenstateEventDispatcher.getListenersInfo(event.getSourceID(), event.getEventType());
        if (classNameMap == null || classNameMap.isEmpty()) {
            return;
        }
        String className2 = null;
        String devModuleCode = null;
        try {
            String currgroup_localtype = CompenstateEventDispatcher.getCurrGroupLocalType();
            String currgroup_industrytype = CompenstateEventDispatcher.getCurrGroupIndustryType();
            for (String className2 : classNameMap.keySet()) {
                String industrytype;
                UnionVO unionvo = classNameMap.get(className2);
                if ("0".equals(unionvo.getListenertype()) || !CompenstateEventDispatcher.isNeedFireEvent(className2, devModuleCode = unionvo.getDevmodulecode())) continue;
                String classInfoMsg = "Plugin class [" + className2 + "] modulecode [" + devModuleCode + "] ";
                String localtype = StringUtil.isEmpty((String)unionvo.getLocaltype()) ? "" : unionvo.getLocaltype();
                int level = LocalAndIndustryLevelQueryUtil.getLevelByLocalAndIndustry((String)localtype, (String)(industrytype = StringUtil.isEmpty((String)unionvo.getIndustrytype()) ? "" : unionvo.getIndustrytype()), (String)currgroup_localtype, (String)currgroup_industrytype);
                if (level != 1 && level != 2 && level != 3 && level != 4) continue;
                Logger.debug((Object)(classInfoMsg + " begin."));
                Long start = System.currentTimeMillis();
                IBusinessListener instance = CompenstateEventDispatcher.getInstanceByClassName(className2, devModuleCode);
                instance.doAction(event);
                Logger.debug((Object)(classInfoMsg + " end successfully.cost time : " + (System.currentTimeMillis() - start)));
            }
        }
        catch (BusinessException e) {
            Logger.error((Object)CompenstateEventDispatcher.getErrorMsg(event, className2), (Throwable)e);
            throw new BusinessException(className2 + e.getMessage(), (Throwable)e);
        }
        catch (RuntimeException e) {
            Logger.error((Object)CompenstateEventDispatcher.getErrorMsg(event, className2), (Throwable)e);
            throw e;
        }
    }

    private static boolean isNeedFireEvent(String className, String devModuleCode) {
        return MODULECODE_ARAP.equals(devModuleCode) || ShareComponentListernerList.getShareListenerList().contains(className);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Map<String, GroupCacheObject> getGroupDataCacheMap() {
        VersionSensitiveMap localCacheMap = groupDataCacheMap;
        if (localCacheMap == null) {
            Object object = lockObj;
            synchronized (object) {
                localCacheMap = groupDataCacheMap;
                if (localCacheMap == null) {
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
                    groupDataCacheMap = localCacheMap = new VersionSensitiveMap(cache, (ICacheVersionMonitor)tvm);
                }
            }
        }
        return localCacheMap;
    }

    private static String getCurrGroupIndustryType() throws BusinessException {
        String result = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        GroupCacheObject groupCacheObject = CompenstateEventDispatcher.getGroupCacheObject(pk_group);
        result = groupCacheObject != null ? groupCacheObject.getIndustry() : MDBaseUtil.getCurrentIndustryCode();
        return result;
    }

    private static String getCurrGroupLocalType() throws BusinessException {
        String result = null;
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        GroupCacheObject groupCacheObject = CompenstateEventDispatcher.getGroupCacheObject(pk_group);
        result = groupCacheObject != null ? groupCacheObject.getLocal() : LocalAndIndustryLevelQueryUtil.DEFAULTCOUNTRYZONE;
        return result;
    }

    private static synchronized GroupCacheObject getGroupCacheObject(String pk_group) throws BusinessException {
        GroupCacheObject groupCacheObject = null;
        if (StringUtil.isEmpty((String)pk_group)) {
            return groupCacheObject;
        }
        GroupCacheObject object = CompenstateEventDispatcher.getGroupDataCacheMap().get(pk_group);
        if (object == null) {
            groupCacheObject = new GroupCacheObject();
            String[] selectColumns = new String[]{"countryzone", "ncindustry"};
            String groupLocalByPK = null;
            String groupIndustryByPK = null;
            GroupVO groupvo = (GroupVO)CompenstateEventDispatcher.getUAPQueryBSService().retrieveByPK(GroupVO.class, pk_group, selectColumns);
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
            CompenstateEventDispatcher.getGroupDataCacheMap().put(pk_group, groupCacheObject);
        } else if (object instanceof GroupCacheObject) {
            groupCacheObject = object;
        }
        return groupCacheObject;
    }

    private static String getErrorMsg(IBusinessEvent event, String currentClassName) {
        return "Exception happened in EventDispatcher fireEvent. Plugin Class :" + currentClassName + " EventSourceID: " + event.getSourceID() + " Eventtype: " + event.getEventType();
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

    private static Map<String, UnionVO> getListenersInfo(String docName, String eventType) throws BusinessException {
        Map<String, UnionVO> allTypeMap;
        Map<String, Map<String, UnionVO>> sourceType_ClassNamesMap = CompenstateEventDispatcher.getEventType_ClassNameMap();
        LinkedHashMap<String, UnionVO> result = new LinkedHashMap<String, UnionVO>();
        String key = CompenstateEventDispatcher.getKey(docName, eventType);
        Map<String, UnionVO> map = sourceType_ClassNamesMap.get(key);
        if (map != null && !map.isEmpty()) {
            result.putAll(map);
        }
        if (RuntimeEnv.getInstance().isRunningInServer() && (allTypeMap = sourceType_ClassNamesMap.get(key = CompenstateEventDispatcher.getKey("ALL", eventType))) != null && allTypeMap.size() > 0) {
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
            eventType_ClassNamesMap = CompenstateEventDispatcher.getAllListenersMap();
            eventtype_ListenersMap.put(dataSource, eventType_ClassNamesMap);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return eventType_ClassNamesMap;
        }
    }

    private static Map<String, Map<String, UnionVO>> getAllListenersMap() throws BusinessException {
        UnionVO[] vos = CompenstateEventDispatcher.getAllListenersByOrder();
        ConcurrentHashMap<String, Map<String, UnionVO>> type_ListenerClassNamesMap = new ConcurrentHashMap<String, Map<String, UnionVO>>();
        String key = null;
        LinkedHashMap<String, UnionVO> classNameMap = null;
        for (UnionVO vo : vos) {
            key = CompenstateEventDispatcher.getKey(vo.getSourceID(), vo.getEventType());
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
        UnionVO[] vos = CompenstateEventDispatcher.getQueryService().getAllListeners();
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
            instance = CompenstateEventDispatcher.createInstance(className, devModuleCode);
            className_InstanceMap.put(key, instance);
        }
        return instance;
    }

    private static IBusinessListener createInstance(String className, String devModuleCode) {
        IBusinessListener instance = null;
        try {
            if (StringUtil.isEmptyWithTrim((String)devModuleCode)) {
                instance = (IBusinessListener)ObjectCreator.newInstance((String)className);
            } else {
                try {
                    instance = (IBusinessListener)ObjectCreator.newInstance((String)devModuleCode, (String)className);
                }
                catch (Exception e) {
                    Logger.error((Object)("cann't create instance. ClassName: " + className + ", devModuleCode:" + devModuleCode + ". Please check register info in table pub_eventlistener\n"));
                    Logger.error((Object)"try to create instance without devModuleCode.");
                    instance = (IBusinessListener)ObjectCreator.newInstance((String)className);
                }
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException("cann't create instance in all devModuleCode. ClassName: " + className + ". Please check register info in table pub_eventlistener");
        }
        return instance;
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

