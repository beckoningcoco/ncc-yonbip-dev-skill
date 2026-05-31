/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.businessevent.IEventListenerQryService
 *  nc.itf.businessevent.IEventTypeQryService
 *  nc.vo.pub.BusinessException
 *  nc.vo.sm.funcreg.ModuleVO
 *  nc.vo.uap.businessevent.EventListenerVO
 *  nc.vo.uap.businessevent.EventTypeVO
 *  nc.vo.uap.businessevent.EventVOUtil
 */
package nc.bs.arap.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.businessevent.IEventListenerQryService;
import nc.itf.businessevent.IEventTypeQryService;
import nc.vo.pub.BusinessException;
import nc.vo.sm.funcreg.ModuleVO;
import nc.vo.uap.businessevent.EventListenerVO;
import nc.vo.uap.businessevent.EventTypeVO;
import nc.vo.uap.businessevent.EventVOUtil;

public class ArapBusiPluginCache {
    private static ArapBusiPluginCache instance = new ArapBusiPluginCache();
    private static Map<String, Map<String, EventListenerVO>> ds_pluginsMap = new ConcurrentHashMap<String, Map<String, EventListenerVO>>();

    private ArapBusiPluginCache() {
    }

    public static ArapBusiPluginCache getInstance() {
        return instance;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, EventListenerVO> getListenersInfo(String sourceID, String eventType) throws BusinessException {
        String key = this.getKey(sourceID, eventType);
        Map<String, EventListenerVO> ds_pluginsMap_temp = ds_pluginsMap.get(key);
        if (ds_pluginsMap_temp == null) {
            ArapBusiPluginCache arapBusiPluginCache = instance;
            synchronized (arapBusiPluginCache) {
                ds_pluginsMap_temp = ds_pluginsMap.get(key);
                if (ds_pluginsMap_temp == null) {
                    ds_pluginsMap_temp = this.getArapListenersMap(sourceID, eventType);
                    ds_pluginsMap.put(key, ds_pluginsMap_temp);
                }
            }
        }
        return ds_pluginsMap_temp;
    }

    private Map<String, EventListenerVO> getArapListenersMap(String sourceID, String eventType) throws BusinessException {
        LinkedHashMap<String, EventListenerVO> classNameMap = new LinkedHashMap<String, EventListenerVO>();
        EventListenerVO[] vos = this.getArapPluginListenersByOrder(sourceID, eventType);
        if (vos != null && vos.length > 0) {
            HashMap<String, ArrayList<EventListenerVO>> moduleListenerMap = new HashMap<String, ArrayList<EventListenerVO>>();
            for (EventListenerVO vo : vos) {
                classNameMap.put(vo.getImplclassname(), vo);
                String moduleid = vo.getOwner();
                ArrayList<EventListenerVO> list = (ArrayList<EventListenerVO>)moduleListenerMap.get(moduleid);
                if (list == null) {
                    list = new ArrayList<EventListenerVO>();
                    moduleListenerMap.put(moduleid, list);
                }
                list.add(vo);
            }
            BaseDAO dao = new BaseDAO();
            Collection collection = dao.retrieveByClause(ModuleVO.class, SqlUtils.getInStr("moduleid", moduleListenerMap.keySet().toArray(new String[0])), new String[]{"moduleid", "devmodule"});
            for (ModuleVO moduleVO : collection) {
                List list = (List)moduleListenerMap.get(moduleVO.getModuleid());
                for (EventListenerVO eventListenerVO : list) {
                    eventListenerVO.setOwner(moduleVO.getDevmodule());
                }
            }
        }
        return classNameMap;
    }

    private EventListenerVO[] getArapPluginListenersByOrder(String sourceID, String eventType) throws BusinessException {
        EventTypeVO typevo = ((IEventTypeQryService)NCLocator.getInstance().lookup(IEventTypeQryService.class)).getEventTypeVOBy(sourceID, eventType);
        EventListenerVO[] vos = new EventListenerVO[]{};
        if (typevo != null) {
            vos = this.getQueryService().getListenersBy(sourceID, eventType);
        }
        if (vos == null || vos.length == 0) {
            return new EventListenerVO[0];
        }
        Arrays.sort(vos, EventVOUtil.getEventListenerVOComparator());
        return vos;
    }

    private IEventListenerQryService getQueryService() {
        return (IEventListenerQryService)NCLocator.getInstance().lookup(IEventListenerQryService.class);
    }

    private String getKey(String sourceID, String eventType) {
        String dataSource = InvocationInfoProxy.getInstance().getUserDataSource();
        return dataSource + "@" + sourceID + "@" + eventType;
    }
}

