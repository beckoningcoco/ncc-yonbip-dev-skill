/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.bs.resa.sql.SqlUtil
 *  nc.bs.sm.accountmanage.IUAPUpdateCheck
 *  nc.itf.uap.sf.IProductVersionQueryService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.pub.VOUtils
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.GroupVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.sm.install.ProductVersionVO
 */
package nc.bs.arap.initdata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.resa.sql.SqlUtil;
import nc.bs.sm.accountmanage.IUAPUpdateCheck;
import nc.itf.uap.sf.IProductVersionQueryService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.pub.VOUtils;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.GroupVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.sm.install.ProductVersionVO;

public class ArapDataUpdateCheckBO
implements IUAPUpdateCheck {
    public void check() throws BusinessException {
        String oldVersion = this.getOldVersion();
        if (StringUtil.isEmptyWithTrim((String)oldVersion) || oldVersion.contains("Cloud") && oldVersion.contains("1811")) {
            return;
        }
        Logger.debug((Object)"\u5f00\u59cb\u5e94\u6536\u5e94\u4ed8\u5347\u7ea7\u524d\u68c0\u67e5\uff01");
        Logger.error((Object)"\u6b63\u5728\u68c0\u67e5\uff0c\u8bf7\u7a0d\u540e\u2026\u2026");
        Map<String, Integer> groupMap1 = this.getMap("pk_recbill", "ar_recbill", true);
        Map<String, Integer> groupMap2 = this.getMap("pk_gatherbill", "ar_gatherbill", true);
        Map<String, Integer> groupMap3 = this.getMap("pk_payablebill", "ap_payablebill", true);
        Map<String, Integer> groupMap4 = this.getMap("pk_paybill", "ap_paybill", true);
        Map<String, Integer> groupMap5 = this.getMap("pk_estirecbill", "ar_estirecbill", false);
        Map<String, Integer> groupMap6 = this.getMap("pk_estipayablebill", "ap_estipayablebill", false);
        StringBuffer msg = new StringBuffer();
        if (groupMap1.size() > 0 || groupMap2.size() > 0 || groupMap3.size() > 0 || groupMap4.size() > 0 || groupMap5.size() > 0 || groupMap6.size() > 0) {
            HashSet<String> groupSet = new HashSet<String>();
            groupSet.addAll(groupMap1.keySet());
            groupSet.addAll(groupMap2.keySet());
            groupSet.addAll(groupMap3.keySet());
            groupSet.addAll(groupMap4.keySet());
            groupSet.addAll(groupMap5.keySet());
            groupSet.addAll(groupMap6.keySet());
            Collection groupVOs = new BaseDAO().retrieveByClause(GroupVO.class, SqlUtil.buildInSql((String)"pk_group", (String[])groupSet.toArray(new String[0]), (boolean)false));
            HashMap<String, String> pk2name = new HashMap<String, String>();
            for (GroupVO groupVO : groupVOs) {
                pk2name.put(groupVO.getPk_group(), new VOUtils().getMultiName((SuperVO)groupVO, "name"));
            }
            msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0856") + "\n");
            if (groupMap1.size() > 0) {
                for (String pk_group : groupMap1.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0857", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap1.get(pk_group))}) + "\n");
                }
            }
            if (groupMap2.size() > 0) {
                for (String pk_group : groupMap2.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0858", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap2.get(pk_group))}) + "\n");
                }
            }
            if (groupMap3.size() > 0) {
                for (String pk_group : groupMap3.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0859", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap3.get(pk_group))}) + "\n");
                }
            }
            if (groupMap4.size() > 0) {
                for (String pk_group : groupMap4.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0860", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap4.get(pk_group))}) + "\n");
                }
            }
            if (groupMap5.size() > 0) {
                for (String pk_group : groupMap5.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0861", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap5.get(pk_group))}) + "\n");
                }
            }
            if (groupMap6.size() > 0) {
                for (String pk_group : groupMap6.keySet()) {
                    msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0862", null, new String[]{(String)pk2name.get(pk_group), String.valueOf(groupMap6.get(pk_group))}) + "\n");
                }
            }
        }
        if (msg.length() > 0) {
            throw new BusinessException(msg.toString());
        }
        Logger.debug((Object)"\u5e94\u6536\u5e94\u4ed8\u5347\u7ea7\u68c0\u67e5\u7ed3\u675f\uff01");
    }

    private Map<String, Integer> getMap(String key, String table, boolean isbill) throws DAOException {
        String sql = "select pk_group,count(distinct " + key + ") from " + table + " where (BILLSTATUS  in ('1','2','8') ";
        if (isbill) {
            sql = sql + " or APPROVESTATUS not in ( '-1')";
        }
        sql = sql + ") and EFFECTSTATUS=0 group by pk_group";
        Map groupMap = (Map)new BaseDAO().executeQuery(sql, new ResultSetProcessor(){

            public Object handleResultSet(ResultSet rs) throws SQLException {
                HashMap<String, Integer> groupMap = new HashMap<String, Integer>();
                if (rs.next()) {
                    String pk_group = rs.getString(1);
                    int count = rs.getInt(2);
                    groupMap.put(pk_group, count);
                }
                return groupMap;
            }
        });
        return groupMap;
    }

    private String getOldVersion() throws BusinessException {
        IProductVersionQueryService srv = (IProductVersionQueryService)NCLocator.getInstance().lookup(IProductVersionQueryService.class.getName());
        ProductVersionVO[] versionVos = srv.queryByProductCode("2008");
        String maxVersion = "";
        if (versionVos != null && versionVos.length > 0) {
            maxVersion = versionVos[0].getVersion();
            for (ProductVersionVO versionVo : versionVos) {
                if (maxVersion.compareTo(versionVo.getVersion()) >= 0) continue;
                maxVersion = versionVo.getVersion();
            }
        }
        return maxVersion;
    }
}

