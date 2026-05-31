/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.pf.pub.BillTypeCacheKey
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.cache.ext.CacheToMapAdapter
 *  nc.vo.cache.ext.ElementVersionSensitiveMap
 *  nc.vo.cache.ext.ICacheVersionMonitor
 *  nc.vo.cache.ext.ObjectCacheVersionMonitor
 *  nc.vo.cache.ext.VersionMonitorFactory
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.vo.arap.cache;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.pf.pub.BillTypeCacheKey;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.cache.ext.CacheToMapAdapter;
import nc.vo.cache.ext.ElementVersionSensitiveMap;
import nc.vo.cache.ext.ICacheVersionMonitor;
import nc.vo.cache.ext.ObjectCacheVersionMonitor;
import nc.vo.cache.ext.VersionMonitorFactory;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype.BilltypeVO;

public class FiPubDataCache {
    private static final String CACHE_REGION = "fipubcache";
    public static String STR_BILLTYPE = "fibilltypevo";
    private static Hashtable<String, Map<Object, Object>> dsName_instance_map = new Hashtable();
    public static final Object ARAP_BILLTYPEINFO = new Object();

    private FiPubDataCache() {
    }

    private static String getCurrentDs() {
        if (RuntimeEnv.getInstance().isRunningInServer()) {
            String dsName = InvocationInfoProxy.getInstance().getUserDataSource();
            return dsName;
        }
        return "1111";
    }

    private static Map getVersionSensitiveCache() {
        String currDS = FiPubDataCache.getCurrentDs();
        if (dsName_instance_map.get(currDS) == null) {
            Map adapter = CacheToMapAdapter.getInstance((String)(currDS + CACHE_REGION));
            ElementVersionSensitiveMap versionMap = new ElementVersionSensitiveMap(adapter, (VersionMonitorFactory)new FIPUBVersionMonitorFacotry());
            dsName_instance_map.put(currDS, (Map<Object, Object>)versionMap);
            dsName_instance_map.put(currDS, (Map<Object, Object>)versionMap);
        }
        return dsName_instance_map.get(currDS);
    }

    private static Map<String, DjLXVO> getPkgroupMap(String pk_group) {
        String key = FiPubDataCache.getGroupKey(pk_group);
        HashMap<String, DjLXVO> hash = null;
        hash = (HashMap<String, DjLXVO>)FiPubDataCache.getVersionSensitiveCache().get(key);
        if (hash == null) {
            hash = new HashMap<String, DjLXVO>();
            FiPubDataCache.getVersionSensitiveCache().put(key, hash);
        }
        if (hash != null) {
            hash.values();
        }
        return hash;
    }

    private static String getGroupKey(String pk_group) {
        return STR_BILLTYPE + "_" + pk_group;
    }

    public static BilltypeVO getBillType(String billType) {
        return PfDataCache.getBillType((String)billType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DjLXVO getBillType(String billTypecode, String pk_group) {
        if (StringUtil.isEmpty((String)billTypecode)) {
            return null;
        }
        String key = FiPubDataCache.getGroupKey(pk_group);
        HashMap map = (HashMap)FiPubDataCache.getVersionSensitiveCache().get(key);
        try {
            Object object;
            if (map == null) {
                object = ARAP_BILLTYPEINFO;
                synchronized (object) {
                    map = (Map)FiPubDataCache.getVersionSensitiveCache().get(key);
                    if (map == null) {
                        map = new HashMap();
                        FiPubDataCache.getVersionSensitiveCache().put(key, map);
                    }
                    if (map != null) {
                        map.values();
                    }
                }
            }
            if (!map.containsKey(billTypecode)) {
                object = ARAP_BILLTYPEINFO;
                synchronized (object) {
                    if (!map.containsKey(billTypecode)) {
                        FiPubDataCache.setBilltypeVOs(pk_group);
                    }
                }
            }
            if (map.get(billTypecode) == null) {
                object = ARAP_BILLTYPEINFO;
                synchronized (object) {
                    if (map.get(billTypecode) == null) {
                        FiPubDataCache.setBilltypeVOs(pk_group);
                    }
                }
            }
            return (DjLXVO)((Object)map.get(billTypecode));
        }
        catch (Exception ex) {
            ExceptionHandler.consume((Throwable)ex);
            return new DjLXVO();
        }
    }

    public static BilltypeVO getBillTypeInfo(String pkGroup, String billtype) {
        return PfDataCache.getBillTypeInfo((String)pkGroup, (String)billtype);
    }

    public static BilltypeVO getBillTypeInfo(BillTypeCacheKey cacheKey) {
        return PfDataCache.getBillTypeInfo((BillTypeCacheKey)cacheKey);
    }

    public static Map<String, DjLXVO> getBilltypesMap(String pk_group) {
        Map<String, DjLXVO> map = FiPubDataCache.getPkgroupMap(pk_group);
        if (map == null || map.size() == 0) {
            try {
                FiPubDataCache.setBilltypeVOs(pk_group);
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return FiPubDataCache.getPkgroupMap(pk_group);
    }

    public static DjLXVO[] getAllBilltypeVObypkcorp(String pk_group) {
        Map<String, DjLXVO> map = FiPubDataCache.getBilltypesMap(pk_group);
        DjLXVO[] vos = new DjLXVO[map.size()];
        vos = map.values().toArray(vos);
        return vos;
    }

    private static void setBilltypeVOs(String pk_group) throws BusinessException {
        Map<String, DjLXVO> map = FiPubDataCache.getPkgroupMap(pk_group);
        String sql = "select * from arap_billtype where pk_group = '" + pk_group + "'";
        List list = (List)((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new BeanListProcessor(DjLXVO.class));
        if (list != null) {
            for (DjLXVO billtype : list) {
                map.put(billtype.getDjlxbm(), billtype);
            }
        }
    }

    public static void clearCache(String[] pk_groups) {
        if (pk_groups == null || pk_groups.length == 0) {
            try {
                dsName_instance_map.clear();
            }
            catch (Exception e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        Enumeration<Map<Object, Object>> dssets = dsName_instance_map.elements();
        Map<Object, Object> dsset = null;
        while (dssets.hasMoreElements()) {
            dsset = dssets.nextElement();
            for (String pk_group : pk_groups) {
                dsset.remove(FiPubDataCache.getGroupKey(pk_group));
            }
        }
    }

    static class FIPUBVersionMonitorFacotry
    implements VersionMonitorFactory {
        FIPUBVersionMonitorFacotry() {
        }

        public ICacheVersionMonitor createVersionMonitor(Object adapter) {
            return new ObjectCacheVersionMonitor((String)adapter, 1000L);
        }
    }
}

