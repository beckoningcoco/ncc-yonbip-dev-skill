/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.BaseProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.org.IOrgRelationDataPubService
 *  nc.vo.cache.CacheManager
 *  nc.vo.cache.config.CacheConfig
 *  nc.vo.cache.config.CacheConfigFactory
 */
package nc.vo.arap.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BaseProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.org.IOrgRelationDataPubService;
import nc.vo.cache.CacheManager;
import nc.vo.cache.config.CacheConfig;
import nc.vo.cache.config.CacheConfigFactory;

public final class OrgConsignationUtils {
    private static CacheConfig cache = CacheConfigFactory.getDefaultCacheConfig((String)"ORG_CONSIGNATION");

    public static Set<String> getOrgConsignationList(String pk_org) throws Exception {
        if (CacheManager.getInstance().getCacheMap(cache).get(pk_org) != null) {
            return (Set)CacheManager.getInstance().getCacheMap(cache).get(pk_org);
        }
        HashSet<String> orgSet = new HashSet<String>();
        IOrgRelationDataPubService service = (IOrgRelationDataPubService)NCLocator.getInstance().lookup(IOrgRelationDataPubService.class);
        Map map = service.queryOrgUnitByPkFinanceorg(new String[]{pk_org});
        if (map != null) {
            orgSet.addAll((Collection)map.get(pk_org));
        }
        String sql = "select pk_adminorg from org_admin_dept where pk_busirole in (select pk_busichild from org_busi_func where pk_org = '" + pk_org + "') and pk_dept <> '~'";
        Object res = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).executeQuery(sql, (ResultSetProcessor)new BaseProcessor(){
            private static final long serialVersionUID = 1L;

            public Object processResultSet(ResultSet rs) throws SQLException {
                ArrayList<String> list = new ArrayList<String>();
                while (rs.next()) {
                    list.add(rs.getString("pk_adminorg"));
                }
                return list;
            }
        });
        orgSet.addAll((List)res);
        CacheManager.getInstance().getCacheMap(cache).put(pk_org, orgSet);
        return orgSet;
    }
}

