/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.processor.ProcessorUtils
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.arap.pub.IFunctionPermissionPubServiceForArap
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.org.OrgVO
 *  nc.vo.org.orgmodel.OrgTypeVO
 *  nc.vo.org.util.OrgTypeManager
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.uap.rbac.util.RbacSqlUtils
 *  nc.vo.util.SqlWrapper
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.put;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.jdbc.framework.processor.ProcessorUtils;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.arap.pub.IFunctionPermissionPubServiceForArap;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.org.OrgVO;
import nc.vo.org.orgmodel.OrgTypeVO;
import nc.vo.org.util.OrgTypeManager;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.uap.rbac.util.RbacSqlUtils;
import nc.vo.util.SqlWrapper;
import nccloud.commons.lang.StringUtils;

public class FunctionPermissionPubServiceForArapImpl
implements IFunctionPermissionPubServiceForArap {
    public OrgVO[] getUserPermissionOrg(String cuserid, String funcode, String pkGroup) throws BusinessException {
        OrgTypeVO orgType = OrgTypeManager.getInstance().getOrgTypeByID("FINANCEORGTYPE000000");
        String sqlSuf = this.getSqlSufByFuncode(orgType);
        Map<String, Set<OrgVO>> map = this.queryOrgsByOrgType(sqlSuf, funcode, cuserid, pkGroup);
        return this.getOrgs(map);
    }

    private Map<String, Set<OrgVO>> queryOrgsByOrgType(String sqlSuf, String funcode, String cuserid, String pk_group) throws BusinessException {
        String sql = RbacSqlUtils.QUERY_ORGWITHFUNC_USERPERM_SQL + sqlSuf;
        SqlWrapper wrapper = new SqlWrapper(sql);
        wrapper.bind("funcode", (Object)funcode);
        wrapper.bind("cuserid", (Object)cuserid);
        wrapper.bind("nowtime", (Object)new UFDateTime());
        wrapper.bind("pk_group", (Object)pk_group);
        Map result = (Map)new BaseDAO().executeQuery(wrapper.getSql(), wrapper.getSqlParameter(), (ResultSetProcessor)new SubjectOrgMapProcessor(){});
        Logger.info((Object)("end==" + System.currentTimeMillis()));
        return result;
    }

    private OrgVO[] getOrgs(Map<String, Set<OrgVO>> map) {
        HashSet<OrgVO> set = new HashSet<OrgVO>();
        for (String subjectid : map.keySet()) {
            Set<OrgVO> vos = map.get(subjectid);
            if (vos == null || vos.isEmpty()) continue;
            set.addAll(vos);
        }
        return set.toArray(new OrgVO[0]);
    }

    private String getSqlSufByFuncode(OrgTypeVO orgType) throws BusinessException {
        String fieldName = orgType.getFieldname();
        if (StringUtil.isEmptyWithTrim((String)fieldName)) {
            return "";
        }
        return " and org." + fieldName + "='Y' ";
    }

    class SubjectOrgMapProcessor
    implements ResultSetProcessor {
        private static final long serialVersionUID = 1L;

        SubjectOrgMapProcessor() {
        }

        private void processSubjectAndOrgRelation(Map<String, Set<OrgVO>> result, String subjectid, OrgVO org) {
            if (StringUtils.isNotEmpty((CharSequence)subjectid)) {
                Set<OrgVO> orgSet = result.get(subjectid);
                if (orgSet == null) {
                    orgSet = new HashSet<OrgVO>();
                }
                if (org != null) {
                    orgSet.add(org);
                }
                result.put(subjectid, orgSet);
            }
        }

        public Object handleResultSet(ResultSet rs) throws SQLException {
            HashMap<String, Set<OrgVO>> result = new HashMap<String, Set<OrgVO>>();
            HashMap<String, OrgVO> orgMap = new HashMap<String, OrgVO>();
            while (rs.next()) {
                String subjectid = rs.getString("subjectid");
                String pk_org = rs.getString("pk_org");
                if (!orgMap.containsKey(pk_org)) {
                    OrgVO org = (OrgVO)ProcessorUtils.toBeanOfCurrentRow((ResultSet)rs, OrgVO.class, null);
                    orgMap.put(pk_org, org);
                }
                this.processSubjectAndOrgRelation(result, subjectid, (OrgVO)orgMap.get(pk_org));
            }
            return result;
        }
    }
}

