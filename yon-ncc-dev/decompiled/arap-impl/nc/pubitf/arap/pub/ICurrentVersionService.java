/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.pub.MapList
 *  nc.vo.vorg.OrgVersionVO
 */
package nc.pubitf.arap.pub;

import java.util.Map;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.pub.MapList;
import nc.vo.vorg.OrgVersionVO;

public interface ICurrentVersionService {
    public MapList<String, OrgVersionVO> getOrgVersionVOsByOrgs(String[] var1) throws BusinessException;

    public String queryDeptPkVidByPKAndDate(String var1, UFDate var2) throws BusinessException;

    public String queryOrgPkVidByPKAndDate(String var1, UFDate var2) throws BusinessException;

    public String[] queryOrgByVids(String[] var1);

    public String[] queryDeptByVid(String[] var1);

    public Map<String, String> queryDeptVidByOidAndDate(String[] var1, UFDate var2) throws BusinessException;
}

