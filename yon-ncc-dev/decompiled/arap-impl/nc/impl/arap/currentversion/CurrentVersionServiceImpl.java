/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.impl.pubapp.pattern.database.DataAccessUtils
 *  nc.pubitf.arap.pub.ICurrentVersionService
 *  nc.vo.fi.pub.SqlUtils
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.pubapp.pattern.pub.SqlBuilder
 *  nc.vo.vorg.DeptVersionVO
 *  nc.vo.vorg.OrgVersionVO
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.impl.arap.currentversion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.pubitf.arap.pub.ICurrentVersionService;
import nc.vo.fi.pub.SqlUtils;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.vorg.DeptVersionVO;
import nc.vo.vorg.OrgVersionVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class CurrentVersionServiceImpl
implements ICurrentVersionService {
    public MapList<String, OrgVersionVO> getOrgVersionVOsByOrgs(String[] pk_orgs) throws BusinessException {
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(SqlUtils.getInStr((String)"pk_org", (String[])pk_orgs, (boolean)true));
        Collection retVOs = new BaseDAO().retrieveByClause(OrgVersionVO.class, sqlBuffer.toString(), "vstartdate");
        MapList voMap = new MapList();
        for (OrgVersionVO orgVO : retVOs) {
            voMap.put((Object)orgVO.getPk_org(), (Object)orgVO);
        }
        return voMap;
    }

    public String queryDeptPkVidByPKAndDate(String pk_dept, UFDate date) throws BusinessException {
        StringBuffer condition = new StringBuffer("PK_DEPT = '" + pk_dept);
        if (date != null) {
            condition.append("' and VSTARTDATE <= '" + date + "' and VENDDATE > '" + date);
        }
        condition.append("' ORDER BY VENDDATE desc");
        Collection result = new BaseDAO().retrieveByClause(DeptVersionVO.class, condition.toString());
        if (result == null || result.size() == 0) {
            return null;
        }
        Iterator iterator = result.iterator();
        if (iterator.hasNext()) {
            DeptVersionVO vo = (DeptVersionVO)iterator.next();
            return vo.getPk_vid();
        }
        return null;
    }

    public String queryOrgPkVidByPKAndDate(String pk_org, UFDate date) throws BusinessException {
        StringBuffer condition = new StringBuffer("PK_ORG = '" + pk_org);
        if (date != null) {
            condition.append("' and VSTARTDATE <= '" + date + "' and VENDDATE > '" + date);
        }
        condition.append("' ORDER BY VENDDATE desc");
        Collection result = new BaseDAO().retrieveByClause(OrgVersionVO.class, condition.toString());
        if (result == null || result.size() == 0) {
            return null;
        }
        Iterator iterator = result.iterator();
        if (iterator.hasNext()) {
            OrgVersionVO vo = (OrgVersionVO)iterator.next();
            return vo.getPk_vid();
        }
        return null;
    }

    public String[] queryOrgByVids(String[] pk_vids) {
        if (ArrayUtils.isEmpty((Object[])pk_vids)) {
            return null;
        }
        SqlBuilder sql = new SqlBuilder();
        DataAccessUtils utils = new DataAccessUtils();
        sql.append("select pk_org from org_orgs_v where ");
        sql.append("pk_vid", pk_vids);
        return utils.query(sql.toString()).toOneDimensionStringArray();
    }

    public String[] queryDeptByVid(String[] pk_vids) {
        if (ArrayUtils.isEmpty((Object[])pk_vids)) {
            return null;
        }
        SqlBuilder sql = new SqlBuilder();
        DataAccessUtils utils = new DataAccessUtils();
        sql.append("select pk_dept from org_dept_v where ");
        sql.append("pk_vid", pk_vids);
        return utils.query(sql.toString()).toOneDimensionStringArray();
    }

    public Map<String, String> queryDeptVidByOidAndDate(String[] pk_oids, UFDate date) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pk_oids)) {
            return null;
        }
        HashMap<String, String> retMap = new HashMap<String, String>();
        if (date != null) {
            SqlBuilder sql = new SqlBuilder();
            sql.append(SqlUtils.getInStr((String)"PK_DEPT", (String[])pk_oids, (boolean)true));
            sql.append(" and VSTARTDATE <= '" + date + "' and VENDDATE > '" + date);
            sql.append("' ORDER BY VENDDATE desc");
            Collection result = new BaseDAO().retrieveByClause(DeptVersionVO.class, sql.toString());
            if (CollectionUtils.isEmpty((Collection)result)) {
                return null;
            }
            for (DeptVersionVO vo : result) {
                retMap.put(vo.getPk_dept(), vo.getPk_vid());
            }
            return retMap;
        }
        return retMap;
    }
}

