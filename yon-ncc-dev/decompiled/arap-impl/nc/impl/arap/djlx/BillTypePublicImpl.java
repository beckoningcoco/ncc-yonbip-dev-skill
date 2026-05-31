/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.djlx.DjLXBO
 *  nc.bs.arap.djlx.DjLXDMO
 *  nc.bs.arap.util.SqlUtils
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.dbcache.intf.ICacheVersionBS
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.exception.ComponentException
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.pubitf.arap.djlx.IBillTypePublic
 *  nc.pubitf.arap.receivable.IArapReceivableBillPubQueryService
 *  nc.vo.arap.bdcontrastinfo.BdcontrastinfoVO
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.BillTypeVO
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.utils.OrgUtils
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.pftemplate.SystemplateBaseVO
 *  nc.vo.pub.pftemplate.SystemplateVO
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.collections4.CollectionUtils
 */
package nc.impl.arap.djlx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import nc.bs.arap.djlx.DjLXBO;
import nc.bs.arap.djlx.DjLXDMO;
import nc.bs.arap.util.SqlUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.dbcache.intf.ICacheVersionBS;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.exception.ComponentException;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.pubitf.arap.djlx.IBillTypePublic;
import nc.pubitf.arap.receivable.IArapReceivableBillPubQueryService;
import nc.vo.arap.bdcontrastinfo.BdcontrastinfoVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.BillTypeVO;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.utils.OrgUtils;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pftemplate.SystemplateBaseVO;
import nc.vo.pub.pftemplate.SystemplateVO;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

public class BillTypePublicImpl
implements IBillTypePublic {
    private static final String SIGN_HENG = "-";
    public static Map<String, String[]> billtypeMnodekey = new HashMap<String, String[]>();

    public BillTypeVO updateBillType(BillTypeVO billtypevo) throws BusinessException {
        DjLXVO djlx = (DjLXVO)billtypevo.getParentVO();
        BaseDAO dao = new BaseDAO();
        dao.updateVO((SuperVO)djlx);
        this.updatecacherversion(djlx);
        return billtypevo;
    }

    public Hashtable deleteGroupBillType(BillTypeVO billtypeVo, String[] pk_groups) throws BusinessException {
        Hashtable hash = new DjLXBO().deleteGroups(billtypeVo, pk_groups);
        for (int i = 0; i < pk_groups.length; ++i) {
            DjLXVO djlx = (DjLXVO)billtypeVo.getParentVO();
            String pk_group = djlx.getPk_group();
            djlx.setPk_group(pk_group);
            this.updatecacherversion(djlx);
        }
        return hash;
    }

    public Hashtable<String, String> insertBillType2Groups(BillTypeVO billtypevo, String[] pk_groups) throws BusinessException {
        DjLXVO djlx = (DjLXVO)billtypevo.getParentVO();
        try {
            boolean flag = true;
            Hashtable<String, String> corpcode = this.checkDjLX(djlx, pk_groups);
            for (int i = 0; i < pk_groups.length; ++i) {
                if (corpcode.get(pk_groups[i]) != null) continue;
                djlx.setPk_group(pk_groups[i]);
                djlx.setPk_billtype(null);
                flag = this.checkUniqueWithoutException(djlx);
                if (flag) {
                    this.insertDjlx(djlx);
                    continue;
                }
                corpcode.put(pk_groups[i], pk_groups[i]);
            }
            return corpcode;
        }
        catch (BusinessException e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw e;
        }
    }

    public BillTypeVO[] queryBillType(String pk_group) throws BusinessException {
        Object[] djLXs = null;
        Vector<BillTypeVO> vec = new Vector<BillTypeVO>();
        DjLXVO[] headers = null;
        BaseDAO dao = new BaseDAO();
        Collection cl = dao.retrieveByClause(DjLXVO.class, OrgUtils.getGlobalAndGroupSql((String)pk_group));
        headers = new DjLXVO[cl.size()];
        if ((headers = cl.toArray(headers)) == null || headers.length == 0) {
            return djLXs;
        }
        for (int i = 0; i < headers.length; ++i) {
            BillTypeVO atype = new BillTypeVO();
            atype.setParentVO((CircularlyAccessibleValueObject)headers[i]);
            vec.addElement(atype);
        }
        if (vec.size() > 0) {
            djLXs = new BillTypeVO[vec.size()];
            vec.copyInto(djLXs);
        }
        return djLXs;
    }

    public BillTypeVO[] queryBillTypeByBillTypeCode(String billtypeCode, String pk_group) throws BusinessException {
        if (!StringUtil.isEmptyWithTrim((String)pk_group)) {
            String sWhere = "";
            if (billtypeCode != null) {
                sWhere = sWhere + "and djlxbm='" + billtypeCode + "' ";
            }
            if (pk_group != null) {
                sWhere = sWhere + "and ( pk_group = '~'  or pk_group='" + pk_group + "') ";
            }
            if (sWhere.length() > 1) {
                sWhere = sWhere.substring(3);
            }
            Object[] djLXs = null;
            Vector<BillTypeVO> vec = new Vector<BillTypeVO>();
            DjLXVO[] headers = null;
            BaseDAO dao = new BaseDAO();
            Collection cl = dao.retrieveByClause(DjLXVO.class, sWhere);
            headers = new DjLXVO[cl.size()];
            if ((headers = cl.toArray(headers)) == null || headers.length == 0) {
                return djLXs;
            }
            for (int i = 0; i < headers.length; ++i) {
                BillTypeVO atype = new BillTypeVO();
                atype.setParentVO((CircularlyAccessibleValueObject)headers[i]);
                vec.addElement(atype);
            }
            if (vec.size() > 0) {
                djLXs = new BillTypeVO[vec.size()];
                vec.copyInto(djLXs);
            }
            return djLXs;
        }
        return null;
    }

    public DjLXVO[] queryBillTypeByBillTypeCode(String[] billtypeCode, String pk_group) throws BusinessException {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (!ArrayUtils.isEmpty((Object[])billtypeCode)) {
            sb.append(SqlUtils.getInStr((String)"djlxbm", (String[])billtypeCode)).append(" and ");
        }
        if (StringUtils.isNotEmpty((CharSequence)pk_group)) {
            sb.append(OrgUtils.getGlobalAndGroupSql((String)pk_group));
        } else {
            sb.append("pk_group").append("=").append("'").append(pk_group.trim()).append("'");
        }
        sb.append(")");
        Collection cl = new BaseDAO().retrieveByClause(DjLXVO.class, sb.toString());
        if (CollectionUtils.isEmpty((Collection)cl)) {
            return null;
        }
        return cl.toArray(new DjLXVO[0]);
    }

    public DjLXVO[] queryByWhereStr(String where) throws BusinessException {
        return new DjLXBO().queryByWhereStr(where);
    }

    public DjLXVO[] queryAllBillTypeByGroup(String pk_group) throws BusinessException {
        return new DjLXBO().queryAll(pk_group);
    }

    public void deleteBillType(BillTypeVO billtypevo) throws BusinessException {
        DjLXVO vo = (DjLXVO)billtypevo.getParentVO();
        if (this.isRefered(vo)) {
            String djlxjc = vo.getDjlxbm();
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0055") + djlxjc + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0056"));
        }
        BaseDAO dao = new BaseDAO();
        dao.deleteByPK(DjLXVO.class, vo.getPk_billtype());
        String sql = "delete from pub_systemplate where NODEKEY = '" + vo.getDjlxbm() + "'";
        sql = sql + " and pk_corp='" + InvocationInfoProxy.getInstance().getGroupId() + "' ";
        int executeUpdate = dao.executeUpdate(sql);
        if (executeUpdate > 0) {
            Log.getInstance((String)"\u5220\u9664pub_systemplate").debug((Object)"\u5220\u9664\u6210\u529f");
        } else {
            Log.getInstance((String)"\u5220\u9664pub_systemplate").debug((Object)"\u5220\u9664\u5931\u8d25");
        }
        this.updatecacherversion(vo);
    }

    private boolean isRefered(DjLXVO vo) {
        try {
            String djlxbm = vo.getDjlxbm();
            if (StringUtil.isEmpty((String)djlxbm)) {
                return true;
            }
            String pk_billtype = null;
            pk_billtype = djlxbm.contains(SIGN_HENG) ? djlxbm.substring(0, djlxbm.indexOf(SIGN_HENG)).trim() : djlxbm.trim();
            String pk_tradetype = djlxbm.trim();
            boolean isRef = false;
            if ("F0".equals(pk_billtype)) {
                isRef = ((IArapReceivableBillPubQueryService)NCLocator.getInstance().lookup(IArapReceivableBillPubQueryService.class)).checkTradetypeUsed(pk_tradetype, vo.getPk_group());
            }
            return isRef;
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage());
        }
    }

    public BillTypeVO insertBillType(BillTypeVO billtypevo) throws BusinessException {
        DjLXVO djlxVO = (DjLXVO)billtypevo.getParentVO();
        djlxVO.setDr(Integer.valueOf(0));
        Vector<String> parentID = new Vector<String>();
        Vector<String> childID = new Vector<String>();
        for (int i = 0; i < 9; ++i) {
            parentID.addElement("D" + i);
        }
        parentID.addElement("DZ");
        parentID.addElement("DV");
        parentID.addElement("2330");
        parentID.addElement("2340");
        childID.addElement("ys");
        childID.addElement("yf");
        childID.addElement("sk");
        childID.addElement("fk");
        try {
            this.checkUnique(djlxVO);
            this.insertDjlx(djlxVO);
            this.updatecacherversion(djlxVO);
        }
        catch (ComponentException e) {
            Logger.debug((Object)"\u6ca1\u6709\u627e\u5230\u4f1a\u8ba1\u5e73\u53f0\u63d0\u4f9b\u7684\u589e\u52a0\u5355\u636e\u7c7b\u578b\u63a5\u53e3\uff0c\u5e94\u8be5\u662f\u4f1a\u8ba1\u5e73\u53f0\u7684\u95ee\u9898\uff0c\u4e3b\u6d41\u7a0b\u4e0d\u53d7\u5f71\u54cd");
        }
        catch (BusinessException e) {
            ExceptionHandler.handleException((Exception)((Object)e));
        }
        this.copySystemplete(billtypevo.getDjlxbm(), billtypevo.getParentBillType());
        return billtypevo;
    }

    private void insertDjlx(DjLXVO djlx) throws DAOException, BusinessException {
        BaseDAO dao = new BaseDAO();
        dao.insertVO((SuperVO)djlx);
        this.updatecacherversion(djlx);
    }

    private void updatecacherversion(DjLXVO djlx) {
        ICacheVersionBS cv = (ICacheVersionBS)NCLocator.getInstance().lookup(ICacheVersionBS.class);
        cv.updateVersion(FiPubDataCache.STR_BILLTYPE + "_" + djlx.getPk_group());
    }

    public DjLXVO getDjlxvoByDjlxbm(String billTypeCode, String pk_group) throws BusinessException {
        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0057"));
    }

    public DjLXVO[] getBillSsCtlTypes(String pk_group) throws BusinessException {
        ArrayList ret = new ArrayList();
        return ret.toArray(new DjLXVO[0]);
    }

    public DjLXVO[] getBillTypesByWhere(String condition) throws BusinessException {
        BaseDAO dao = new BaseDAO();
        if (condition != null && condition.startsWith("where")) {
            condition = condition.substring(5);
        }
        Collection cl = dao.retrieveByClause(DjLXVO.class, condition);
        return (DjLXVO[])ArapCommonTool.changeCollection2Array((Collection)cl, DjLXVO.class);
    }

    private boolean checkUnique(DjLXVO vo) throws BusinessException {
        boolean bool = this.checkUniqueWithoutException(vo);
        if (!bool) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0054"));
        }
        return bool;
    }

    private boolean checkUniqueWithoutException(DjLXVO vo) throws BusinessException {
        return new DjLXDMO().checkUnique(vo);
    }

    private Hashtable<String, String> checkDjLX(DjLXVO djlx, String[] pk_groups) throws BusinessException {
        Hashtable<String, String> corpcode = new Hashtable<String, String>();
        BillTypeVO[] vos = this.queryBillTypeByBillTypeCode(djlx.getDjlxbm(), null);
        Hashtable<String, BillTypeVO> hash = new Hashtable<String, BillTypeVO>();
        if (vos != null) {
            int i;
            for (i = 0; i < vos.length; ++i) {
                hash.put(((DjLXVO)vos[i].getParentVO()).getPk_group(), vos[i]);
            }
            for (i = 0; i < pk_groups.length; ++i) {
                if (hash.get(pk_groups[i]) == null) continue;
                corpcode.put(pk_groups[i], pk_groups[i]);
            }
        }
        return corpcode;
    }

    public Hashtable<String, String> getDjlxbmbyBillPks(String tabname, ArrayList alPks, Hashtable<String, String> hashResult) throws BusinessException {
        try {
            DjLXDMO dmo = new DjLXDMO();
            return dmo.getDjlxbmbyBillPks(tabname, alPks, hashResult);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    public BdcontrastinfoVO[] queryAllBdcontrastinfoVO(String pk_group) throws BusinessException {
        try {
            return new DjLXDMO().queryAll(pk_group);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
    }

    public Map<String, String> getDjdlByDjlxbm(String[] djlxbms) throws BusinessException {
        HashMap<String, String> retMap = new HashMap<String, String>();
        if (djlxbms != null) {
            for (String djlxbm : djlxbms) {
                retMap.put(djlxbm, FiPubDataCache.getBillType((String)djlxbm, null).getDjdl());
            }
        }
        return retMap;
    }

    public void copySystemplete(String pkTradetype, String parentbilltype) throws BusinessException {
        BilltypeVO billType = PfDataCache.getBillType((String)pkTradetype);
        String str = null;
        str = billType == null ? parentbilltype : billType.getParentbilltype();
        StringBuffer whereSql = new StringBuffer();
        whereSql.append("nodekey ").append(" = '").append(this.getDefaultBilltype(str)).append("'");
        BaseDAO baseDAO = new BaseDAO();
        Collection systemplateBaseVO = baseDAO.retrieveByClause(SystemplateBaseVO.class, whereSql.toString());
        if (systemplateBaseVO.isEmpty()) {
            throw new BusinessException(pkTradetype + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0361") + str + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0362"));
        }
        ArrayList<SystemplateVO> creadedSystemplateVOs = new ArrayList<SystemplateVO>();
        for (SystemplateBaseVO baseVO : systemplateBaseVO) {
            SystemplateVO systemplateVO = baseVO.toSystemplateVO();
            systemplateVO.setPrimaryKey(null);
            systemplateVO.setOrgtypecode("11");
            systemplateVO.setStatus(2);
            systemplateVO.setPk_corp(InvocationInfoProxy.getInstance().getGroupId());
            systemplateVO.setSysflag(Integer.valueOf(1));
            if (baseVO.getAppcode() != null) {
                systemplateVO.setAppcode(baseVO.getAppcode());
            } else {
                systemplateVO.setFunnode(baseVO.getFunnode());
            }
            systemplateVO.setTemplateflag(UFBoolean.TRUE);
            systemplateVO.setNodekey(pkTradetype);
            creadedSystemplateVOs.add(systemplateVO);
        }
        baseDAO.insertVOArray((SuperVO[])creadedSystemplateVOs.toArray(new SystemplateVO[0]));
    }

    private String getDefaultBilltype(String pk_billtype) throws BusinessException {
        String pk_tradetype = null;
        if ("F0".equals(pk_billtype)) {
            pk_tradetype = "D0";
        } else if ("F1".equals(pk_billtype)) {
            pk_tradetype = "D1";
        } else if ("F2".equals(pk_billtype)) {
            pk_tradetype = "D2";
        } else if ("F3".equals(pk_billtype)) {
            pk_tradetype = "D3";
        } else if ("23F0".equals(pk_billtype)) {
            pk_tradetype = "23D0";
        } else if ("23F1".equals(pk_billtype)) {
            pk_tradetype = "23D1";
        } else if ("23F2".equals(pk_billtype)) {
            pk_tradetype = "23D2";
        } else if ("23F3".equals(pk_billtype)) {
            pk_tradetype = "23D3";
        } else if ("23E0".equals(pk_billtype)) {
            pk_tradetype = "23E0";
        } else if ("23E1".equals(pk_billtype)) {
            pk_tradetype = "23E1";
        }
        if (pk_tradetype == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000807") + pk_billtype + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0058"));
        }
        return pk_tradetype;
    }

    static {
        billtypeMnodekey.put("F0", new String[]{"20060ARO", "20060RBC", "20060RBR", "20060RBM"});
        billtypeMnodekey.put("F1", new String[]{"20080APO", "20080SPLC", "20080PBR", "20080PBM"});
        billtypeMnodekey.put("F2", new String[]{"20060RO", "20060GBC", "20060GBR", "20060GBM"});
        billtypeMnodekey.put("F3", new String[]{"20080PO", "20080SPAC", "20080EBR", "20080EBM"});
        billtypeMnodekey.put("23E0", new String[]{"200605ERB"});
        billtypeMnodekey.put("23E1", new String[]{"200805EPB"});
    }
}

