/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.SQLParameter
 *  nc.jdbc.framework.processor.BeanListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.ui.dbcache.DBCacheQueryFacade
 *  nc.vo.cache.ext.CacheToMapAdapter
 *  nc.vo.cache.ext.ElementVersionSensitiveMap
 *  nc.vo.cache.ext.ICacheVersionMonitor
 *  nc.vo.cache.ext.ObjectCacheVersionMonitor
 *  nc.vo.cache.ext.VersionMonitorFactory
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.cache;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.ui.dbcache.DBCacheQueryFacade;
import nc.vo.arap.cache.BillTypeCacheKey;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.cache.ext.CacheToMapAdapter;
import nc.vo.cache.ext.ElementVersionSensitiveMap;
import nc.vo.cache.ext.ICacheVersionMonitor;
import nc.vo.cache.ext.ObjectCacheVersionMonitor;
import nc.vo.cache.ext.VersionMonitorFactory;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.StringUtils;

public class BillTypeDataCache {
    public static String STR_BILLTYPEINFO = "ARAPBILLTYPEINFO";
    protected static final String CACHE_REGION = "ARAPPlatform";
    private static Hashtable dsName_instance_map = new Hashtable();

    public static DjLXVO getBillType(String billType) {
        return BillTypeDataCache.getBillTypeInfo(billType);
    }

    public static DjLXVO getBillTypeInfo(String billtype) {
        return BillTypeDataCache.getBillTypeInfo(new BillTypeCacheKey().buildBilltype(billtype).buildPkGroup(InvocationInfoProxy.getInstance().getGroupId()));
    }

    public static DjLXVO getBillTypeInfo(BillTypeCacheKey cacheKey) {
        if (cacheKey == null || StringUtils.isEmpty((CharSequence)cacheKey.getBilltype())) {
            return new DjLXVO();
        }
        HashMap<String, DjLXVO> hashCacheObj = (HashMap<String, DjLXVO>)BillTypeDataCache.getVersionSensitiveCache().get((Object)STR_BILLTYPEINFO);
        try {
            if (hashCacheObj == null) {
                hashCacheObj = new HashMap<String, DjLXVO>();
                BillTypeDataCache.setBilltypeVOs(hashCacheObj);
                BillTypeDataCache.getVersionSensitiveCache().put((Object)STR_BILLTYPEINFO, hashCacheObj);
            } else if (!hashCacheObj.containsKey(cacheKey.getKey()) && !hashCacheObj.containsKey(cacheKey.getBilltype())) {
                BillTypeDataCache.setSingleBilltypeVOs(hashCacheObj, cacheKey.getKey(), cacheKey.getBilltype());
            }
        }
        catch (Exception ex) {
            Logger.error((Object)ex.getMessage(), (Throwable)ex);
        }
        DjLXVO btVO = hashCacheObj.get(cacheKey.getKey());
        if (btVO == null) {
            btVO = hashCacheObj.get(cacheKey.getBilltype());
        }
        return btVO;
    }

    private static void setBilltypeVOs(HashMap<String, DjLXVO> hasBillTypeInfo) throws BusinessException {
        Collection coBilltypes;
        if (RuntimeEnv.getInstance().isRunningInServer()) {
            coBilltypes = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DjLXVO.class, "pk_group!='global00000000000000'");
        } else {
            SQLParameter param = new SQLParameter();
            param.addParam("GLOBLE00000000000000");
            String fieldList = "creationtime, creator, djdl, djlxbm, djlxjc_remark, djlxmc_remark, dr, fcbz, iscasign, ischangedeptpsn, iscommit, isidvalidated, ispreparenetbank, isqr, modifiedtime, modifier, pk_billtype, pk_currtype, pk_group, scomment, ts";
            String sql = "select " + fieldList.toLowerCase() + " from arap_billtype where pk_group!=?";
            coBilltypes = (List)DBCacheQueryFacade.runQuery((String)sql, (SQLParameter)param, (ResultSetProcessor)new BeanListProcessor(DjLXVO.class));
        }
        for (DjLXVO billtype : coBilltypes) {
            hasBillTypeInfo.put(new BillTypeCacheKey().buildBilltype(billtype.getDjlxbm()).buildPkGroup(billtype.getPk_group()).getKey(), billtype);
        }
    }

    public static ElementVersionSensitiveMap getVersionSensitiveCache() {
        String currDS = BillTypeDataCache.getCurrentDs();
        if (dsName_instance_map.get(currDS) == null) {
            CacheToMapAdapter adapter = (CacheToMapAdapter)CacheToMapAdapter.getInstance((String)(currDS + CACHE_REGION));
            ElementVersionSensitiveMap versionMap = new ElementVersionSensitiveMap((Map)adapter, (VersionMonitorFactory)new ARAPVersionMonitorFacotry());
            dsName_instance_map.put(currDS, versionMap);
        }
        return (ElementVersionSensitiveMap)dsName_instance_map.get(currDS);
    }

    private static String getCurrentDs() {
        return InvocationInfoProxy.getInstance().getUserDataSource();
    }

    private static void setSingleBilltypeVOs(HashMap<String, DjLXVO> hasBillTypeInfo, String cacheKey, String billtype) throws BusinessException {
        Collection coBilltypes = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DjLXVO.class, " pk_billtypecode = '" + billtype + "'");
        if (coBilltypes == null || coBilltypes.size() == 0) {
            hasBillTypeInfo.put(cacheKey, null);
        } else {
            for (DjLXVO bt : coBilltypes) {
                hasBillTypeInfo.put(new BillTypeCacheKey().buildBilltype(bt.getDjlxbm()).buildPkGroup(bt.getPk_group()).getKey(), bt);
            }
        }
    }

    static class ARAPVersionMonitorFacotry
    implements VersionMonitorFactory {
        ARAPVersionMonitorFacotry() {
        }

        public ICacheVersionMonitor createVersionMonitor(Object arg0) {
            return new ObjectCacheVersionMonitor((String)arg0, 1000L);
        }
    }
}

