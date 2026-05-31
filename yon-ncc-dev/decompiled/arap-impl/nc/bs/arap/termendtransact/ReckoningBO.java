/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.bd.businessevent.ReportInfo
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.itf.fi.pub.SysInit
 *  nc.itf.uap.sf.ICreateCorpQueryService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.fip.service.IFipQueryService
 *  nc.pubitf.org.IAccountingBookPubService
 *  nc.pubitf.org.ICloseAccPubServicer
 *  nc.pubitf.org.ICloseAccQryPubServicer
 *  nc.vo.arap.dap.RetBillVo
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.termendtransact.AgiotageVO
 *  nc.vo.arap.termendtransact.FilterCondVO
 *  nc.vo.arap.termendtransact.RemoteTransferVO
 *  nc.vo.arap.termendtransact.ReportVO
 *  nc.vo.arap.termendtransact.TermEndVO
 *  nc.vo.arap.transaction.FirstNotClosedAccountMonthVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.termendtransact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bs.arap.termendtransact.ReckoningDMO;
import nc.bs.bd.businessevent.ReportInfo;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.itf.fi.pub.SysInit;
import nc.itf.uap.sf.ICreateCorpQueryService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.fip.service.IFipQueryService;
import nc.pubitf.org.IAccountingBookPubService;
import nc.pubitf.org.ICloseAccPubServicer;
import nc.pubitf.org.ICloseAccQryPubServicer;
import nc.vo.arap.dap.RetBillVo;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.RemoteTransferVO;
import nc.vo.arap.termendtransact.ReportVO;
import nc.vo.arap.termendtransact.TermEndVO;
import nc.vo.arap.transaction.FirstNotClosedAccountMonthVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class ReckoningBO {
    private static final String AP22 = "AP22";
    private static final String AR22 = "AR22";
    private List<ReportInfo> reportInfo = new ArrayList<ReportInfo>();

    private RetBillVo[] getNotCreateVoucherDoc(FilterCondVO vo) throws BusinessException {
        RetBillVo[] voNoCreateVouDocs = null;
        try {
            String year = vo.getYear();
            String month = vo.getQj();
            AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)vo.getPk_org());
            ac.set(year, month);
            String[] billPks = ((IFipQueryService)NCLocator.getInstance().lookup(IFipQueryService.class)).queryOperatingBill(ArapConstant.ARAP_AR_BILLCLASS.equals(vo.getSfbz()) ? "AR" : "AP", null, vo.getPk_org(), ac.getMonthVO().getBegindate(), ac.getMonthVO().getEnddate(), UFBoolean.FALSE);
            if (billPks == null || billPks.length == 0) {
                return null;
            }
            ReckoningDMO dmo = new ReckoningDMO();
            voNoCreateVouDocs = dmo.getRetBillVOByPks(billPks, vo);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        return voNoCreateVouDocs;
    }

    public Vector<Object> getRowTitle(ReportVO vRep) throws BusinessException {
        Vector<Object> vData = new Vector<Object>();
        try {
            vData.add(vRep.getBh());
            vData.add(vRep.getInfo());
            vData.add(vRep.getCount());
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        return vData;
    }

    public RemoteTransferVO onReckoningCheck(FilterCondVO voCond, AgiotageVO voCurrency) throws BusinessException {
        RemoteTransferVO voRemote = new RemoteTransferVO();
        ReportVO repVO = new ReportVO();
        Vector<Object> vCheckData = new Vector();
        Vector<Object> vResult = new Vector<Object>();
        boolean bState = true;
        try {
            Vector<String> vTem;
            ReckoningDMO dmo = new ReckoningDMO();
            int i = 1;
            if (voCond.getMode1() != null) {
                vCheckData = dmo.onReckoningCheckStep1(voCond);
                vResult = vCheckData;
                ++i;
                if (voCond.getMode1().equals("control") && vCheckData.size() > 1) {
                    bState = false;
                }
            }
            if (voCond.getMode2() != null) {
                vCheckData = dmo.onReckoningCheckStep2(voCond);
                vTem = new Vector();
                vTem.addElement(Integer.valueOf(i).toString());
                if (voCond.getSfbz().equals(ArapConstant.ARAP_AR_BILLCLASS)) {
                    vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0048"));
                }
                if (voCond.getSfbz().equals(ArapConstant.ARAP_AP_BILLCLASS)) {
                    vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0049"));
                }
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(vCheckData.size())}));
                vResult.addElement(vTem);
                if (vCheckData.size() != 0) {
                    for (int j = 0; j < vCheckData.size(); ++j) {
                        vResult.addElement(vCheckData.elementAt(j));
                    }
                }
                ++i;
                if (voCond.getMode2().equals("control") && vCheckData.size() != 0) {
                    bState = false;
                }
            }
            if (voCond.getMode3() != null) {
                vTem = new Vector<String>();
                int iSum = 0;
                RetBillVo[] voNotCreateVouDocs = this.getNotCreateVoucherDoc(voCond);
                if (voNotCreateVouDocs == null) {
                    voNotCreateVouDocs = new RetBillVo[]{};
                }
                vTem.addElement(Integer.valueOf(i).toString());
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0051"));
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002282"));
                vResult.addElement(vTem);
                if (voNotCreateVouDocs.length != 0) {
                    for (int j = 0; j < voNotCreateVouDocs.length; ++j) {
                        Vector<String> v = new Vector<String>();
                        v.addElement("");
                        v.addElement(voNotCreateVouDocs[j].getBillType() + voNotCreateVouDocs[j].getBillNo());
                        v.addElement("");
                        vResult.addElement(v);
                    }
                }
                ((Vector)vResult.elementAt(vResult.size() - iSum - 1)).setElementAt(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(voNotCreateVouDocs.length)}), 2);
                ++i;
                if (voCond.getMode3().equals("control") && voNotCreateVouDocs.length != 0) {
                    bState = false;
                }
            }
            if (voCond.getMode4() != null) {
                repVO = dmo.onReckoningCheckStep3(voCond, voCurrency);
                vTem = new Vector();
                vTem.addElement(Integer.valueOf(i).toString());
                vTem.addElement(repVO.getInfo());
                vTem.addElement("");
                vResult.addElement(vTem);
                if (voCond.getMode4().equals("control") && !repVO.getState()) {
                    bState = false;
                }
            }
            voRemote.setTranData1(vResult);
            voRemote.setReckoningState(bState);
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        return voRemote;
    }

    public static String[] getPreviousSettleAccountYearMonth(String[] enableInfo, String[] cancelSettInfo, String prodID, String pk_org) throws BusinessException {
        FirstNotClosedAccountMonthVO firstNoAccVO = new FirstNotClosedAccountMonthVO();
        String accYear = null;
        String accMonth = null;
        try {
            String year = cancelSettInfo[0];
            String cope = cancelSettInfo[1];
            AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)pk_org);
            ac.set(year);
            if (enableInfo == null) {
                enableInfo = ((ICreateCorpQueryService)NCLocator.getInstance().lookup(ICreateCorpQueryService.class)).queryEnabledPeriod(pk_org, prodID);
            }
            String enabledYear = enableInfo[0];
            String enabledMonth = enableInfo[1];
            if (year.equals(enabledYear) && cope.equals(enabledMonth)) {
                return new String[2];
            }
            if (cope.equals("01")) {
                accYear = Integer.valueOf(Integer.valueOf(year) - 1).toString();
                ac.set(accYear);
                AccperiodmonthVO[] tmpMonths = ac.getMonthVOsOfCurrentYear();
                accMonth = tmpMonths[tmpMonths.length - 1].getYearmth().substring(5, 7);
            }
            if (!cope.equals("01")) {
                accYear = year;
                Integer iMon = Integer.valueOf(cope) - 1;
                accMonth = iMon < 10 ? "0" + iMon.toString() : iMon.toString();
            }
            firstNoAccVO.setNotAccMonth(accMonth);
            firstNoAccVO.setNotAccYear(accYear);
        }
        catch (Exception ex) {
            ExceptionHandler.handleException((Exception)ex);
        }
        return new String[]{accYear, accMonth};
    }

    public void termEndOperation(String prodId, TermEndVO endvo, boolean isCancel) throws BusinessException {
        boolean enabled = ARAPModuleEnableUtil.isEnable((String)InvocationInfoProxy.getInstance().getGroupId(), (String)"2002");
        if (enabled) {
            this.checkUnCloseAcc(prodId.equals("AR"), endvo.getYear(), endvo.getMonth(), endvo.getPk_org());
        }
        if (isCancel) {
            String[] previousSettleAccountYearMonth = ReckoningBO.getPreviousSettleAccountYearMonth(new String[]{endvo.getEnableyear(), endvo.getEnablemonth()}, new String[]{endvo.getYear(), endvo.getMonth()}, prodId, endvo.getPk_org());
            endvo.setYear(previousSettleAccountYearMonth[0]);
            endvo.setMonth(previousSettleAccountYearMonth[1]);
        }
        try {
            ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).updateCloseAccountInfo(endvo.getNodecode(), endvo.getPk_org(), endvo.getYear(), endvo.getMonth());
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
        }
        ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).reAccount(endvo.getNodecode(), endvo.getPk_org(), endvo.getPk_org(), endvo.getPk_periodmonth());
    }

    public List<ReportInfo> onReckoningReportCheck(FilterCondVO voCond, AgiotageVO voCurrency) throws BusinessException {
        ReportVO repVO = new ReportVO();
        Vector<Object> vCheckData = new Vector();
        Vector vResult = new Vector();
        UFBoolean bState = UFBoolean.TRUE;
        String periodState = voCond.getPeriodState();
        try {
            Vector<String> vTem;
            ArrayList<String> msg;
            UFBoolean isStrongCheck;
            ReckoningDMO dmo = new ReckoningDMO();
            int i = 1;
            if (voCond.getMode1() != null) {
                isStrongCheck = UFBoolean.FALSE;
                vCheckData = dmo.onReckoningCheckStep1(voCond);
                vResult = vCheckData;
                ++i;
                ArrayList<Object> detail = Collections.list(vCheckData.elements());
                msg = new ArrayList<String>();
                for (int j = 1; j < detail.size(); ++j) {
                    Vector vector = (Vector)detail.get(j);
                    if (vector.elementAt(1) == null) continue;
                    msg.add((String)vector.elementAt(1));
                }
                if ("control".equals(voCond.getMode1()) && vCheckData.size() > 1) {
                    bState = UFBoolean.FALSE;
                }
                if ("control".equals(voCond.getMode1())) {
                    isStrongCheck = UFBoolean.TRUE;
                }
                this.addReprotInfo((String)((Vector)vResult.get(0)).get(1), bState, isStrongCheck, (String)((Vector)vResult.get(0)).get(2), periodState, msg, voCond);
            }
            if (voCond.getMode2() != null) {
                isStrongCheck = UFBoolean.FALSE;
                vCheckData = dmo.onReckoningCheckStep2(voCond);
                vTem = new Vector();
                vTem.addElement(Integer.valueOf(i).toString());
                if (ArapConstant.ARAP_AR_BILLCLASS.equals(voCond.getSfbz())) {
                    vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0048"));
                }
                if (ArapConstant.ARAP_AP_BILLCLASS.equals(voCond.getSfbz())) {
                    vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0049"));
                }
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(vCheckData.size())}));
                if ("control".equals(voCond.getMode2()) && vCheckData.size() != 0) {
                    bState = UFBoolean.FALSE;
                }
                if ("control".equals(voCond.getMode2())) {
                    isStrongCheck = UFBoolean.TRUE;
                }
                vResult.addElement(vTem);
                msg = new ArrayList();
                if (vCheckData.size() != 0) {
                    ArrayList<Object> detail = Collections.list(vCheckData.elements());
                    for (int j = 0; j < detail.size(); ++j) {
                        Vector vector = (Vector)detail.get(j);
                        msg.add((String)vector.elementAt(1));
                    }
                }
                this.addReprotInfo((String)vTem.elementAt(1), bState, isStrongCheck, (String)vTem.elementAt(2), periodState, msg, voCond);
                ++i;
            }
            if (voCond.getMode3() != null) {
                isStrongCheck = UFBoolean.FALSE;
                vTem = new Vector<String>();
                int iSum = 0;
                RetBillVo[] voNotCreateVouDocs = this.getNotCreateVoucherDoc(voCond);
                if (voNotCreateVouDocs == null) {
                    voNotCreateVouDocs = new RetBillVo[]{};
                }
                vTem.addElement(Integer.valueOf(i).toString());
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0051"));
                vTem.addElement(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002282"));
                vResult.addElement(vTem);
                ArrayList<String> detail = new ArrayList<String>();
                if (voNotCreateVouDocs.length != 0) {
                    for (int j = 0; j < voNotCreateVouDocs.length; ++j) {
                        Vector<String> v = new Vector<String>();
                        v.addElement("");
                        v.addElement(voNotCreateVouDocs[j].getBillType() + voNotCreateVouDocs[j].getBillNo());
                        v.addElement("");
                        detail.add((String)v.elementAt(1));
                    }
                }
                ((Vector)vResult.elementAt(vResult.size() - iSum - 1)).setElementAt(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0052", null, new String[]{String.valueOf(voNotCreateVouDocs.length)}), 2);
                ++i;
                if (voCond.getMode3().equals("control") && voNotCreateVouDocs.length != 0) {
                    bState = UFBoolean.FALSE;
                }
                if ("control".equals(voCond.getMode3())) {
                    isStrongCheck = UFBoolean.TRUE;
                }
                this.addReprotInfo((String)vTem.elementAt(1), bState, isStrongCheck, (String)vTem.elementAt(2), periodState, detail, voCond);
            }
            if (voCond.getMode4() != null) {
                isStrongCheck = UFBoolean.FALSE;
                repVO = dmo.onReckoningCheckStep3(voCond, voCurrency);
                vTem = new Vector();
                vTem.addElement(Integer.valueOf(i).toString());
                vTem.addElement(repVO.getInfo());
                vTem.addElement("");
                vResult.addElement(vTem);
                if (voCond.getMode4().equals("control") && !repVO.getState()) {
                    bState = UFBoolean.FALSE;
                }
                if ("control".equals(voCond.getMode4())) {
                    isStrongCheck = UFBoolean.TRUE;
                }
                this.addReprotInfo(repVO.getInfo(), bState, isStrongCheck, null, periodState, null, voCond);
            }
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException(this.getClass(), (Exception)e);
        }
        return this.reportInfo;
    }

    private void addReprotInfo(String checkitem, UFBoolean isPass, UFBoolean isStrongCheck, String explain, String periodState, List<String> detail, FilterCondVO voCond) {
        ReportInfo info = new ReportInfo();
        info.setPk_accperiod(periodState);
        info.setIsPass(isPass);
        info.setIsStrongCheck(isStrongCheck);
        info.setCheckItem(checkitem);
        info.setExplain(explain);
        if (detail != null) {
            info.setDetail(detail);
        }
        this.reportInfo.add(info);
    }

    private void checkUnCloseAcc(boolean isar2, String year, String cope, String pk_org) throws BusinessException {
        Map book = ((IAccountingBookPubService)NCLocator.getInstance().lookup(IAccountingBookPubService.class)).queryAccountingBookIDByFinanceOrgIDWithMainAccountBook(new String[]{pk_org});
        String pkbook = null;
        if (book == null || book.size() == 0) {
            return;
        }
        String param = SysInit.getParaString((String)pk_org, (String)(isar2 ? AR22 : AP22));
        if ("Y".equals(param)) {
            pkbook = (String)book.values().iterator().next();
            String period = year + "-" + cope;
            boolean res = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).isCloseByAccountBookId(pkbook, period);
            String para = SysInit.getParaString((String)pk_org, (String)"GL034");
            if (res && para != null && para.equals(pkbook)) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0475"));
            }
        }
    }
}

