/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.sf.ICreateCorpQueryService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.exception.ExceptionHandler
 */
package nc.vo.arap.transaction;

import java.util.HashMap;
import java.util.Map;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.sf.ICreateCorpQueryService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.transaction.FirstNotClosedAccountMonthVO;
import nc.vo.arap.transaction.SystemInfoVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.exception.ExceptionHandler;

public class AccountInfo {
    public static FirstNotClosedAccountMonthVO m_voFirstNotClosedAccountMonth;

    public static FirstNotClosedAccountMonthVO getFirstNotClosedAccountMonth(String[] enableInfo, String[] accountInfo, SystemInfoVO vo) {
        FirstNotClosedAccountMonthVO firstNoAccVO = new FirstNotClosedAccountMonthVO();
        String notClosedMonth = null;
        String notClosedYear = null;
        boolean bIsAccounted = false;
        String pkCorp = vo.getCurDwbm();
        String prodID = vo.getProdID();
        try {
            String accYear = accountInfo[0];
            String accMonth = accountInfo[1];
            if (enableInfo == null) {
                enableInfo = ((ICreateCorpQueryService)NCLocator.getInstance().lookup(ICreateCorpQueryService.class)).queryEnabledPeriod(pkCorp, prodID);
            }
            String enabledYear = enableInfo[0];
            String enabledMonth = enableInfo[1];
            if (accMonth == null || accMonth.trim().length() == 0) {
                notClosedMonth = enabledMonth;
                notClosedYear = enabledYear;
                bIsAccounted = true;
            } else {
                int sumMonth;
                AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)vo.getPk_org());
                ac.set(accYear);
                AccperiodmonthVO[] vo_moths = ac.getMonthVOsOfCurrentYear();
                int n = sumMonth = vo_moths == null ? 0 : Integer.parseInt(vo_moths[vo_moths.length - 1].getAccperiodmth().trim());
                if (Integer.valueOf(accMonth) >= sumMonth) {
                    notClosedYear = Integer.valueOf(Integer.valueOf(accYear) + 1).toString();
                    ac.set(accYear);
                    notClosedMonth = ac.getMonthVO().getAccperiodmth().trim();
                } else {
                    notClosedYear = accYear;
                    Integer iMon = Integer.valueOf(accMonth) + 1;
                    notClosedMonth = iMon < 10 ? "0" + iMon.toString() : iMon.toString();
                }
            }
            firstNoAccVO.setNotAccMonth(notClosedMonth);
            firstNoAccVO.setNotAccYear(notClosedYear);
            firstNoAccVO.setIsAccounted(bIsAccounted);
        }
        catch (Exception ex) {
            ExceptionHandler.consume((Throwable)ex);
        }
        return firstNoAccVO;
    }

    public static Map<String, FirstNotClosedAccountMonthVO> getFirstNotClosedAccountMonth(Map<String, String[]> enableInfo, Map<String, String[]> accountInfo, SystemInfoVO[] vos) {
        String notClosedMonth = null;
        String notClosedYear = null;
        boolean bIsAccounted = false;
        HashMap<String, FirstNotClosedAccountMonthVO> retmap = new HashMap<String, FirstNotClosedAccountMonthVO>();
        if (enableInfo == null || enableInfo == null && enableInfo.size() == 0) {
            return retmap;
        }
        try {
            for (Map.Entry<String, String[]> e : enableInfo.entrySet()) {
                String accMonth;
                FirstNotClosedAccountMonthVO firstNoAccVO = new FirstNotClosedAccountMonthVO();
                String enabledYear = e.getValue()[0];
                String enabledMonth = e.getValue()[1];
                String accYear = accountInfo.get(e.getKey()) == null ? null : accountInfo.get(e.getKey())[0];
                String string = accMonth = accountInfo.get(e.getKey()) == null ? null : accountInfo.get(e.getKey())[1];
                if (accMonth == null || accMonth.trim().length() == 0) {
                    notClosedMonth = enabledMonth;
                    notClosedYear = enabledYear;
                    bIsAccounted = true;
                } else {
                    int sumMonth;
                    AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)e.getKey());
                    ac.set(accYear);
                    AccperiodmonthVO[] vo_moths = ac.getMonthVOsOfCurrentYear();
                    int n = sumMonth = vo_moths == null ? 0 : Integer.parseInt(vo_moths[vo_moths.length - 1].getAccperiodmth().trim());
                    if (Integer.valueOf(accMonth) >= sumMonth) {
                        notClosedYear = Integer.valueOf(Integer.valueOf(accYear) + 1).toString();
                        ac.set(accYear);
                        notClosedMonth = ac.getMonthVO().getAccperiodmth().trim();
                    } else {
                        notClosedYear = accYear;
                        Integer iMon = Integer.valueOf(accMonth) + 1;
                        notClosedMonth = iMon < 10 ? "0" + iMon.toString() : iMon.toString();
                    }
                }
                firstNoAccVO.setNotAccMonth(notClosedMonth);
                firstNoAccVO.setNotAccYear(notClosedYear);
                firstNoAccVO.setIsAccounted(bIsAccounted);
                retmap.put(e.getKey(), firstNoAccVO);
            }
        }
        catch (InvalidAccperiodExcetion ex) {
            ExceptionHandler.consume((Throwable)ex);
        }
        return retmap;
    }
}

