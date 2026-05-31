/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fi.pub.SysInit
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.arap.agiotage.AgiotageBzVO
 *  nc.vo.arap.agiotage.AgiotageVO
 *  nc.vo.arap.transaction.NumberFormat
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.dto.arap.arappub.agiotageinfo.AgiotageInfo
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 */
package nc.web.arap.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.itf.fi.pub.SysInit;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.agiotage.AgiotageBzVO;
import nc.vo.arap.agiotage.AgiotageVO;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.transaction.DataValidateException;
import nc.vo.arap.transaction.NumberFormat;
import nc.vo.arap.transaction.SystemInfoVO;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.dto.arap.arappub.agiotageinfo.AgiotageInfo;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.IArapRatePubService;

public class AgiotageUtil {
    public static AgiotageVO getAgiotageVO(AgiotageInfo info, SystemInfoVO sysInfoVO) {
        try {
            String pk_org = info.getPk_org();
            String dateStr = info.getDate();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = sf.parse(dateStr);
            UFDate agiotagedate = new UFDate(date);
            String sfbz = info.getSfbz();
            AgiotageBzVO[] agiotageBzVOs = info.getAgiotageBzVOs();
            if (pk_org == null) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0811"));
            }
            sysInfoVO.setCurDwbm(pk_org);
            String prodid = sysInfoVO.getProdID();
            if (prodid.equals("AR")) {
                prodid = "2006";
            } else if (prodid.equals("AP")) {
                prodid = "2008";
            } else if (prodid.equals("Bzzx")) {
                prodid = "EP";
            }
            IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
            AccountCalendar ac = arappubUtilService.getAccountCalendar(pk_org, agiotagedate);
            boolean bPass = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).isAccountClosed(prodid, pk_org, ac.getYearVO().getPeriodyear(), ac.getMonthVO().getAccperiodmth());
            if (!bPass) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0812"));
            }
            return AgiotageUtil.getCurrencyAttribute(agiotagedate, pk_org, ac, sfbz, agiotageBzVOs, sysInfoVO);
        }
        catch (DataValidateException ex) {
            ExceptionHandler.handleRuntimeException((Exception)((Object)ex));
        }
        catch (Exception ex) {
            ExceptionHandler.handleRuntimeException((Exception)ex);
        }
        return null;
    }

    private static AgiotageVO getCurrencyAttribute(UFDate agiotagedate, String pk_org, AccountCalendar ac, String Sfbz, AgiotageBzVO[] agiotageBzVOs, SystemInfoVO sysInfoVO) throws DataValidateException, InvalidAccperiodExcetion, BusinessException {
        AgiotageVO voCond = AgiotageUtil.getInputCond(pk_org, agiotageBzVOs);
        IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
        Vector selBzbm = voCond.getSelBzbm();
        ArrayList<String> bzbms = new ArrayList<String>();
        for (AgiotageBzVO bzvo : selBzbm) {
            bzbms.add(bzvo.getBzbm());
        }
        sysInfoVO.setBzbm(bzbms);
        String dwbm = sysInfoVO.getCurDwbm();
        String user = sysInfoVO.getCurUser();
        boolean isZFB = sysInfoVO.getHsMode();
        UFDate date = agiotagedate;
        sysInfoVO.setClrq(agiotagedate);
        ac.setDate(agiotagedate);
        String nd = ac.getYearVO().getPeriodyear();
        String qj = ac.getMonthVO().getAccperiodmth();
        voCond.setDwbm(dwbm);
        voCond.setSfbz(Sfbz);
        voCond.setCalDate(agiotagedate);
        voCond.setCalQj(qj);
        voCond.setCalNd(nd);
        voCond.setLatitude(sysInfoVO.getLatitude());
        voCond.setMode(sysInfoVO.getModeType());
        voCond.setHsMode(isZFB);
        voCond.setUser(user);
        voCond.setIszgAgiotage(sysInfoVO.getIszgagiotage());
        voCond.setBusiType(pk_org);
        AgiotageVO vo = AgiotageUtil.onCheckHl(voCond);
        vo.setLocal(arappubUtilService.getOrgLocalCurrPK(pk_org));
        AgiotageUtil.checkRateChange(vo.getSelBzbm(), date, pk_org, sysInfoVO);
        return vo;
    }

    private static void checkRateChange(Vector bzbms, UFDate date, String pk_org, SystemInfoVO sysInfoVO) throws BusinessException {
        if (sysInfoVO.getModeType() != 2) {
            return;
        }
        IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
        AccountCalendar accountCalendar = arappubUtilService.getAccountCalendar(pk_org, date);
        for (AgiotageBzVO bzvo : bzbms) {
            UFDate lastCalDate = bzvo.getLastCalDate();
            AccperiodmonthVO monthVO = accountCalendar.getMonthVO();
            UFDate begindate = monthVO.getBegindate();
            UFDate enddate = monthVO.getEnddate();
            if (lastCalDate == null) continue;
            if (lastCalDate.equals((Object)begindate) || lastCalDate.equals((Object)enddate)) {
                throw new DataValidateException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001755") + bzvo.getBzmc() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0024"));
            }
            if (!lastCalDate.ufAfter(begindate) || !lastCalDate.ufBefore(enddate)) continue;
            throw new DataValidateException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001755") + bzvo.getBzmc() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0024"));
        }
    }

    public static UFBoolean getZgyfMode(String dwbm, Integer system) {
        String paraString = system == 0 ? "AR28" : "AP34";
        UFBoolean mode = UFBoolean.FALSE;
        try {
            mode = SysInit.getParaBoolean((String)dwbm, (String)paraString);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return mode;
    }

    private static AgiotageVO onCheckHl(AgiotageVO vo) throws BusinessException {
        try {
            String calQj = vo.getCalQj();
            String dwbm = vo.getDwbm();
            String calNd = vo.getCalNd();
            UFDouble bbhl = null;
            UFDate calDate = vo.getCalDate();
            Vector vBzData = vo.getSelBzbm();
            Hashtable<String, AgiotageBzVO> m_hBzDig = new Hashtable<String, AgiotageBzVO>();
            IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
            String accperiodscheme = arappubUtilService.getAccperiodschemePkByPk_org(vo.getDwbm());
            AccperiodmonthVO accperiodmonthVO = arappubUtilService.queryAccperiodmonthVOByDate(accperiodscheme, vo.getCalDate());
            String yearmth = accperiodmonthVO.getYearmth();
            calNd = yearmth.substring(0, 4);
            calQj = yearmth.substring(5, 7);
            String pk_group = InvocationInfoProxy.getInstance().getGroupId();
            for (int i = 0; i < vBzData.size(); ++i) {
                boolean bState = true;
                AgiotageBzVO bzvo = (AgiotageBzVO)vBzData.elementAt(i);
                String bzbm = bzvo.getBzbm();
                String bzmc = bzvo.getBzmc();
                String LocalPk = arappubUtilService.getOrgLocalCurrPK(dwbm);
                CurrtypeVO currPro = arappubUtilService.getCurrInfo(bzbm);
                if (currPro == null) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0025") + bzmc);
                }
                int iYbDig = currPro.getCurrdigit();
                int iBbDig = arappubUtilService.getCurrInfo(LocalPk).getCurrdigit();
                int groupDig = arappubUtilService.getDigitForGroup(pk_group);
                int globalDig = arappubUtilService.getDigitForGlobal();
                int BbRateDig = 0;
                String currErrMsg = null;
                UFDouble[] groupandGlobalRate = AgiotageUtil.GroupandGlobalRate(dwbm, bzbm, accperiodscheme, calNd, calQj);
                UFDouble grouphl = groupandGlobalRate[0];
                UFDouble globalhl = groupandGlobalRate[1];
                AgiotageBzVO selBzbm = (AgiotageBzVO)vo.getSelBzbm().get(0);
                String pk_rateType = selBzbm.getPk_rateType();
                Map ratedateType = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).isDateType(new String[]{pk_rateType});
                if (!((Boolean)ratedateType.get(pk_rateType)).booleanValue()) {
                    RateReturnObject rateType = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getAdjustRateByRateType(dwbm, pk_rateType, bzbm, null, accperiodscheme, calNd, calQj);
                    UFDouble[] hls = new UFDouble[]{UFDouble.ONE_DBL, rateType.getRate()};
                    bbhl = hls[1];
                } else {
                    Map rateDate = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateDate(pk_rateType, bzbm, dwbm, calDate);
                    bbhl = rateDate.values().toArray(new UFDouble[0])[0];
                }
                if (bzbm.equals(LocalPk)) {
                    bbhl = UFDouble.ONE_DBL;
                }
                BbRateDig = bbhl != null ? AgiotageUtil.getRateDigit(dwbm, bzbm) : 0;
                int groupRateDig = groupandGlobalRate[2].intValue();
                int globalRateDig = groupandGlobalRate[3].intValue();
                bzvo.setBbhl(NumberFormat.onFormatRate((UFDouble)bbhl, (int)BbRateDig));
                bzvo.setGrouphl(NumberFormat.onFormatRate((UFDouble)grouphl, (int)groupRateDig));
                bzvo.setGlobalhl(NumberFormat.onFormatRate((UFDouble)globalhl, (int)globalRateDig));
                if (bbhl == null || bbhl.equals((Object)new UFDouble(0))) {
                    bState = false;
                    currErrMsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0026", null, new String[]{bzmc});
                }
                bzvo.setState(bState);
                bzvo.setCurrErrMsg(currErrMsg);
                bzvo.setDwbm(dwbm);
                bzvo.setBbDig(iBbDig);
                bzvo.setYbDig(iYbDig);
                bzvo.setGroupDig(groupDig);
                bzvo.setGlobalDig(globalDig);
                bzvo.setGroupRateDig(groupRateDig);
                bzvo.setGlobalRateDig(globalRateDig);
                vBzData.setElementAt(bzvo, i);
                AgiotageBzVO digvo = new AgiotageBzVO();
                digvo.setYbDig(iYbDig);
                digvo.setBbDig(iBbDig);
                m_hBzDig.put(bzmc, digvo);
            }
            vo.setSelBzbm(vBzData);
        }
        catch (Exception ex) {
            ExceptionHandler.handleRuntimeException((Exception)ex);
        }
        return vo;
    }

    private static UFDouble[] GroupandGlobalRate(String pk_org, String bzbm, String accperiodscheme, String calNd, String calQj) throws BusinessException {
        IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
        String groupMod = arappubUtilService.getParaString(InvocationInfoProxy.getInstance().getGroupId(), "NC001");
        String globalMod = arappubUtilService.getParaString("GLOBLE00000000000000", "NC002");
        UFDouble[] gr_glrate = new UFDouble[4];
        UFDouble grouphl = UFDouble.ZERO_DBL;
        UFDouble globalhl = UFDouble.ZERO_DBL;
        int groupRateDig = 2;
        int globalRateDig = 2;
        Boolean isGroupUsed = new Boolean(true);
        Boolean isGlobalUsed = new Boolean(true);
        if (groupMod.equals(SysinitConst.NC001_NOT_USED)) {
            isGroupUsed = new Boolean(false);
        }
        if (globalMod.equals(SysinitConst.NC002_NOT_USED)) {
            isGlobalUsed = new Boolean(false);
        }
        CurrtypeVO glb = arappubUtilService.getGlobeDefaultCurrtype();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        CurrtypeVO grp = arappubUtilService.getDefaultCurrtypeByOrgID(pk_group);
        CurrtypeVO org = arappubUtilService.getDefaultCurrtypeByOrgID(pk_org);
        if (isGroupUsed.booleanValue()) {
            if (grp == null) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0347"));
            }
            if (groupMod == null || groupMod.length() == 0) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0348"));
            }
            if (groupMod.equals(SysinitConst.NC001_BASE_ORIG)) {
                grouphl = arappubUtilService.getAdjustGroupRate(pk_group, bzbm, accperiodscheme, calNd, calQj);
            } else if (groupMod.equals(SysinitConst.NC001_BASE_SUPG)) {
                grouphl = arappubUtilService.getAdjustGroupRate(pk_group, org.getPk_currtype(), accperiodscheme, calNd, calQj);
            }
            groupRateDig = arappubUtilService.getGroupRateDigit(pk_org, pk_group, bzbm);
        }
        if (isGlobalUsed.booleanValue()) {
            if (glb == null) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0349"));
            }
            if (globalMod == null || globalMod.length() == 0) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0350"));
            }
            if (globalMod.equals(SysinitConst.NC002_BASE_ORIG)) {
                globalhl = arappubUtilService.getAdjustGlobalRate(pk_org, bzbm, accperiodscheme, calNd, calQj);
            } else if (globalMod.equals(SysinitConst.NC002_BASE_SUPG)) {
                globalhl = arappubUtilService.getAdjustGlobalRate(pk_org, org.getPk_currtype(), accperiodscheme, calNd, calQj);
            }
            globalRateDig = arappubUtilService.getGlobalRateDigit(pk_org, bzbm);
        }
        gr_glrate[0] = grouphl;
        gr_glrate[1] = globalhl;
        gr_glrate[2] = new UFDouble(groupRateDig);
        gr_glrate[3] = new UFDouble(globalRateDig);
        return gr_glrate;
    }

    public static AgiotageVO getInputCond(String busitype, AgiotageBzVO[] agiotageBzVOs) throws DataValidateException {
        AgiotageVO vo = new AgiotageVO();
        Vector<AgiotageBzVO> vSelBzbms = new Vector<AgiotageBzVO>();
        for (int i = 0; i < agiotageBzVOs.length; ++i) {
            AgiotageBzVO voBz = new AgiotageBzVO();
            String bzbm = agiotageBzVOs[i].getBzbm();
            String bzmc = agiotageBzVOs[i].getBzmc();
            Object calDate = null;
            voBz.setBzbm(bzbm);
            voBz.setBzmc(bzmc);
            if (vSelBzbms.contains(voBz)) continue;
            vSelBzbms.addElement(voBz);
        }
        if (busitype == null || busitype.equals("")) {
            throw new DataValidateException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0002"));
        }
        if (vSelBzbms.size() == 0) {
            throw new DataValidateException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0003"));
        }
        vo.setSelBzbm(vSelBzbms);
        return vo;
    }

    public static int getRateDigit(String pk_org, String pk_currtype) {
        IArapBillPubUtilService arappubUtilService = (IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class);
        int local_digit = 5;
        if (null != pk_org) {
            try {
                String local_currtype = arappubUtilService.getLocalCurrPK(pk_org);
                local_digit = arappubUtilService.getRateDigit(pk_org, pk_currtype, local_currtype);
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
        }
        return local_digit;
    }
}

