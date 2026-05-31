/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.pubitf.bbd.CurrtypeQuery
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.pubitf.uapbd.DefaultCurrtypeQryUtil
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.OrgVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.termendtransact;

import java.util.Hashtable;
import java.util.Vector;
import nc.bs.framework.common.NCLocator;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.pubitf.bbd.CurrtypeQuery;
import nc.pubitf.org.IOrgUnitPubService;
import nc.pubitf.uapbd.DefaultCurrtypeQryUtil;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.transaction.Je;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;

public class AgiotageVO
extends ValueObject {
    private static final long serialVersionUID = -3441494149924364782L;
    private Boolean m_bXzbz;
    private int mode;
    private boolean m_HsMode;
    private String m_sDwbm;
    private String m_sBzmc;
    private String m_sBzbm;
    private String m_sLocal;
    private String m_sClbh;
    private UFDate m_uLastTime;
    private UFDate m_sCalDate;
    private String m_sCalQj;
    private String m_sCalNd;
    private String m_sQjBeg;
    private String m_sQjEnd;
    private String m_sSfbz;
    private Vector m_sSelBzbm;
    private Hashtable m_pkAccids;
    private String m_sDjlx;
    private String m_sDjbhBeg;
    private String m_sDjbhEnd;
    private String m_sDateBeg;
    private String m_sDateEnd;
    private String m_sCurrency;
    private String m_sMinje;
    private String m_sMaxje;
    private Je m_CalCe;
    private String m_sUser;
    private String m_sSign;
    private Hashtable<String, String> allBz;
    private int queryType;
    private int agiotageType;
    private String queryStr;
    private boolean iszgAgiotage;
    private String queryCond;
    private String busiType;
    private String currType;
    public static final int AGIOTAGE_SX = 2;
    public static final int AGIOTAGE_END = 1;
    public static final int AGIOTAGE_WB = 0;

    public String getCurrType() {
        return this.currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
    }

    public String getBusiType() {
        return this.busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getQueryCond() {
        return this.queryCond;
    }

    public void setQueryCond(String queryCond) {
        this.queryCond = queryCond;
    }

    public boolean isIszgAgiotage() {
        return this.iszgAgiotage;
    }

    public void setIszgAgiotage(boolean iszgAgiotage) {
        this.iszgAgiotage = iszgAgiotage;
    }

    public String getQueryStr() {
        return this.queryStr;
    }

    public void setQueryStr(String queryStr) {
        this.queryStr = queryStr;
    }

    public int getAgiotageType() {
        return this.agiotageType;
    }

    public void setAgiotageType(int agiotageType) {
        this.agiotageType = agiotageType;
    }

    public int getQueryType() {
        return this.queryType;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }

    public Hashtable<String, String> getAllBz() throws BusinessException {
        if (this.allBz == null && this.m_sDwbm != null) {
            try {
                this.getAllBzExceptLocal();
            }
            catch (BusinessException e) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0552") + e.getMessage(), (Throwable)e);
            }
        }
        return this.allBz;
    }

    public void setAllBz(Hashtable<String, String> allBz) {
        this.allBz = allBz;
    }

    public void getAllBzExceptLocal() throws BusinessException {
        String bzbm = Currency.getOrgLocalCurrPK((String)this.getDwbm());
        String[] fieldnames = new String[]{"pk_org", "pk_group"};
        OrgVO[] orgVO = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgs(new String[]{this.getDwbm()}, fieldnames);
        String pkGroup = orgVO[0].getPk_group();
        CurrtypeVO glb = DefaultCurrtypeQryUtil.getInstance().getGlobeDefaultCurrtype();
        CurrtypeVO grp = DefaultCurrtypeQryUtil.getInstance().getDefaultCurrtypeByOrgID(pkGroup);
        String groupcurr = grp.getPk_currtype();
        String globalcurr = glb.getPk_currtype();
        Hashtable<String, String> allBz = new Hashtable<String, String>();
        CurrtypeVO[] allCurrtypeVOs = CurrtypeQuery.getInstance().getAllCurrtypeVOs();
        for (int i = 0; i < allCurrtypeVOs.length; ++i) {
            if (bzbm.equals(allCurrtypeVOs[i].getPk_currtype()) && groupcurr.equals(allCurrtypeVOs[i].getPk_currtype()) && globalcurr.equals(allCurrtypeVOs[i].getPk_currtype())) continue;
            allBz.put(allCurrtypeVOs[i].getPk_currtype(), allCurrtypeVOs[i].getName());
        }
        this.setAllBz(allBz);
    }

    public String getBzbm() {
        return this.m_sBzbm;
    }

    public String getBzmc() {
        return this.m_sBzmc;
    }

    public Je getCalCe() {
        return this.m_CalCe;
    }

    public UFDate getCalDate() {
        return this.m_sCalDate;
    }

    public String getCalNd() {
        return this.m_sCalNd;
    }

    public String getCalQj() {
        return this.m_sCalQj;
    }

    public String getClbh() {
        return this.m_sClbh;
    }

    public String getCurrency() {
        return this.m_sCurrency;
    }

    public String getDateBeg() {
        return this.m_sDateBeg;
    }

    public String getDateEnd() {
        return this.m_sDateEnd;
    }

    public String getDjbhBeg() {
        return this.m_sDjbhBeg;
    }

    public String getDjbhEnd() {
        return this.m_sDjbhEnd;
    }

    public String getDjlx() {
        return this.m_sDjlx;
    }

    public String getDwbm() {
        return this.m_sDwbm;
    }

    public String getEntityName() {
        return null;
    }

    public boolean getHsMode() {
        return this.m_HsMode;
    }

    public int getModeType() {
        return this.mode;
    }

    public UFDate getLastTime() {
        return this.m_uLastTime;
    }

    public String getLocal() {
        return this.m_sLocal;
    }

    public String getMaxJe() {
        return this.m_sMaxje;
    }

    public String getMinJe() {
        return this.m_sMinje;
    }

    public Hashtable getPkAccids() {
        return this.m_pkAccids;
    }

    public String getQjBeg() {
        return this.m_sQjBeg;
    }

    public String getQjEnd() {
        return this.m_sQjEnd;
    }

    public Vector getSelBzbm() {
        return this.m_sSelBzbm;
    }

    public String getSfbz() {
        return this.m_sSfbz;
    }

    public String getSign() {
        return this.m_sSign;
    }

    public String getUser() {
        return this.m_sUser;
    }

    public Boolean getXzbz() {
        return this.m_bXzbz;
    }

    public void setBzbm(String bzbm) {
        this.m_sBzbm = bzbm;
    }

    public void setBzmc(String bzmc) {
        this.m_sBzmc = bzmc;
    }

    public void setCalCe(Je ce) {
        this.m_CalCe = ce;
    }

    public void setCalDate(UFDate calDate) {
        this.m_sCalDate = calDate;
    }

    public void setCalNd(String calNd) {
        this.m_sCalNd = calNd;
    }

    public void setCalQj(String calQj) {
        this.m_sCalQj = calQj;
    }

    public void setClbh(String clbh) {
        this.m_sClbh = clbh;
    }

    public void setCurrency(String currency) {
        this.m_sCurrency = currency;
    }

    public void setDateBeg(String dateBeg) {
        this.m_sDateBeg = dateBeg;
    }

    public void setDateEnd(String dateEnd) {
        this.m_sDateEnd = dateEnd;
    }

    public void setDjbhBeg(String djbhBeg) {
        this.m_sDjbhBeg = djbhBeg;
    }

    public void setDjbhEnd(String djbhEnd) {
        this.m_sDjbhEnd = djbhEnd;
    }

    public void setDjlx(String djlx) {
        this.m_sDjlx = djlx;
    }

    public void setDwbm(String dwbm) {
        this.m_sDwbm = dwbm;
    }

    public void setHsMode(boolean mode) {
        this.m_HsMode = mode;
    }

    public void setLastTime(UFDate date) {
        this.m_uLastTime = date;
    }

    public void setLocal(String Bbpk) {
        this.m_sLocal = Bbpk;
    }

    public void setMaxJe(String maxje) {
        this.m_sMaxje = maxje;
    }

    public void setMinJe(String minje) {
        this.m_sMinje = minje;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setPkAccids(Hashtable accids) {
        this.m_pkAccids = accids;
    }

    public void setQjBeg(String qjBeg) {
        this.m_sQjBeg = qjBeg;
    }

    public void setQjEnd(String qjEnd) {
        this.m_sQjEnd = qjEnd;
    }

    public void setSelBzbm(Vector bzbms) {
        this.m_sSelBzbm = bzbms;
    }

    public void setSfbz(String sfbz) {
        this.m_sSfbz = sfbz;
    }

    public void setSign(String sign) {
        this.m_sSign = sign;
    }

    public void setUser(String user) {
        this.m_sUser = user;
    }

    public void setXzbz(Boolean xzbz) {
        this.m_bXzbz = xzbz;
    }

    public void validate() throws ValidationException {
    }

    public static int getMode(String dwbm, Integer system) throws BusinessException {
        String paraString = system == 0 ? "AR5" : "AP3";
        int smode = 0;
        String mode = SysinitConst.AGIOTAGE_END;
        try {
            mode = SysInit.getParaString((String)dwbm, (String)paraString);
            if (mode.equals(SysinitConst.AGIOTAGE_END)) {
                smode = 1;
            } else if (mode.equals(SysinitConst.AGIOTAGE_SX)) {
                smode = 2;
            }
        }
        catch (BusinessException e) {
            throw ExceptionHandler.handleException((Exception)((Object)e));
        }
        return smode;
    }
}

