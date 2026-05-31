/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Log
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.bs.arap.djlx;

import java.util.Collection;
import java.util.Hashtable;
import nc.bs.arap.djlx.DjLXDMO;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Log;
import nc.vo.arap.djlx.BillTypeVO;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.utils.OrgUtils;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class DjLXBO {
    public Hashtable deleteGroups(BillTypeVO billtypevo, String[] pk_groups) throws BusinessException {
        DjLXVO vo = (DjLXVO)billtypevo.getParentVO();
        Hashtable result = new Hashtable();
        try {
            int i;
            DjLXDMO dmo = new DjLXDMO();
            Hashtable<String, String> delcorp = new Hashtable<String, String>();
            Hashtable<String, String> failcorp = new Hashtable<String, String>();
            result.put("del", delcorp);
            result.put("fail", failcorp);
            BaseDAO dao = new BaseDAO();
            Collection coll = dao.retrieveByClause(DjLXVO.class, " djlxbm='" + vo.getDjlxbm() + "'");
            Hashtable<String, DjLXVO> hash = new Hashtable<String, DjLXVO>();
            DjLXVO[] djlxvos = (DjLXVO[])ArapCommonTool.changeCollection2Array(coll, DjLXVO.class);
            for (i = 0; i < djlxvos.length; ++i) {
                hash.put(djlxvos[i].getPk_group(), djlxvos[i]);
            }
            for (i = 0; i < pk_groups.length; ++i) {
                DjLXVO checkvo = (DjLXVO)((Object)hash.get(pk_groups[i]));
                if (checkvo == null) {
                    delcorp.put(pk_groups[i], pk_groups[i]);
                    continue;
                }
                if (dmo.isInUse(checkvo)) {
                    failcorp.put(pk_groups[i], pk_groups[i]);
                    continue;
                }
                this.doDelete(dao, checkvo);
            }
        }
        catch (BusinessException e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw e;
        }
        return result;
    }

    private void doDelete(BaseDAO dao, DjLXVO checkvo) throws DAOException {
        dao.deleteByPK(DjLXVO.class, checkvo.getPk_billtype());
    }

    public DjLXVO[] queryAll(String pk_group) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = null;
        cl = pk_group == null ? dao.retrieveAll(DjLXVO.class) : dao.retrieveByClause(DjLXVO.class, OrgUtils.getGlobalAndGroupSql(pk_group));
        DjLXVO[] djlxvos = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        djlxvos = this.queryBusiTypes(djlxvos);
        return djlxvos;
    }

    public DjLXVO[] queryByVO(DjLXVO vo) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = dao.retrieve((SuperVO)vo, true);
        DjLXVO[] djLXs = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        djLXs = this.queryBusiTypes(djLXs);
        return djLXs;
    }

    public DjLXVO[] queryBusiTypes(DjLXVO[] djlxvos) throws BusinessException {
        return djlxvos;
    }

    public DjLXVO[] queryForTreeNode(DjLXVO condDjLXVO) throws BusinessException {
        return this.queryByVO(condDjLXVO);
    }

    public DjLXVO[] queryByWhereStr(String where) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        Collection cl = null;
        cl = dao.retrieveByClause(DjLXVO.class, where);
        DjLXVO[] djlxvos = (DjLXVO[])ArapCommonTool.changeCollection2Array(cl, DjLXVO.class);
        djlxvos = this.queryBusiTypes(djlxvos);
        return djlxvos;
    }
}

