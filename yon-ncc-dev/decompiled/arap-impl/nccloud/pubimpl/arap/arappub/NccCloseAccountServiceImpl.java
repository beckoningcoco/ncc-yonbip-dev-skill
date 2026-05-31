/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.initbill.IInitBillCloseService
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.itf.arap.termendtransact.ITermEndPrivate
 *  nc.itf.fi.pub.Currency
 *  nc.itf.org.ICloseAccBookQryService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.pubitf.org.ICloseAccPubServicer
 *  nc.pubitf.org.ICloseAccQryPubServicer
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.termendtransact.AgiotageBzVO
 *  nc.vo.arap.termendtransact.AgiotageVO
 *  nc.vo.arap.termendtransact.FilterCondVO
 *  nc.vo.arap.termendtransact.RemoteTransferVO
 *  nc.vo.arap.termendtransact.TermEndVO
 *  nc.vo.arap.transaction.AccountInfo
 *  nc.vo.arap.transaction.FirstNotClosedAccountMonthVO
 *  nc.vo.arap.transaction.SystemInfoVO
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.CloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.dto.arap.arappub.CloseAccountVO
 *  nccloud.dto.arap.arappub.NccCloseAccountVO
 *  nccloud.itf.arap.pub.IArapCheckFrozenService
 *  nccloud.pubitf.arap.arappub.INccCloseAccountService
 *  nccloud.vo.arap.bdprovision.BdProvisionVO
 *  nccloud.vo.arap.bdprovisionrule.ProvisionFreqEnum
 *  nccloud.vo.arap.indiprovision.IndiProvisionVO
 */
package nccloud.pubimpl.arap.arappub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.initbill.IInitBillCloseService;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.itf.arap.termendtransact.ITermEndPrivate;
import nc.itf.fi.pub.Currency;
import nc.itf.org.ICloseAccBookQryService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.pubitf.org.ICloseAccPubServicer;
import nc.pubitf.org.ICloseAccQryPubServicer;
import nc.pubitf.org.IOrgUnitPubService;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.termendtransact.AgiotageBzVO;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.RemoteTransferVO;
import nc.vo.arap.termendtransact.TermEndVO;
import nc.vo.arap.transaction.AccountInfo;
import nc.vo.arap.transaction.FirstNotClosedAccountMonthVO;
import nc.vo.arap.transaction.SystemInfoVO;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.CloseAccBookVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nccloud.dto.arap.arappub.CloseAccountVO;
import nccloud.dto.arap.arappub.NccCloseAccountVO;
import nccloud.itf.arap.pub.IArapCheckFrozenService;
import nccloud.pubitf.arap.arappub.INccCloseAccountService;
import nccloud.vo.arap.bdprovision.BdProvisionVO;
import nccloud.vo.arap.bdprovisionrule.ProvisionFreqEnum;
import nccloud.vo.arap.indiprovision.IndiProvisionVO;

public class NccCloseAccountServiceImpl
implements INccCloseAccountService {
    private String m_sAccount = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0206");
    private String m_sDisAccount = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0207");
    private String m_sDisEnabled = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0208");

    public HashMap<String, Object> refreshPeriod(String pk_org, String moudleId, String prodId) throws BusinessException {
        String periodNum;
        int i;
        ArrayList<NccCloseAccountVO> nccCloseAccountVOs = new ArrayList<NccCloseAccountVO>();
        boolean findAccMonth = false;
        boolean findEnabledMonth = false;
        HashMap<String, Object> map = new HashMap<String, Object>();
        String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
        if (cal == null || "".equals(cal)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0879"));
        }
        String enabledYear = cal.substring(0, 4);
        String enabledMonth = cal.substring(5, 7);
        String[] accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
        String accYear = accountInfo[0];
        String accMonth = accountInfo[1];
        String curYear = null;
        curYear = "12".equals(accMonth) ? String.valueOf(Integer.valueOf(accYear) + 1) : (accYear != null && !"".equals(accYear) ? accYear : enabledYear);
        SystemInfoVO sysInfo = new SystemInfoVO();
        sysInfo.setPk_org(pk_org);
        sysInfo.setProdID(prodId);
        FirstNotClosedAccountMonthVO vo = AccountInfo.getFirstNotClosedAccountMonth((String[])new String[]{enabledYear, enabledMonth}, (String[])new String[]{accYear, accMonth}, (SystemInfoVO)sysInfo);
        String yearMonth = vo.getNotAccYear() + "-" + vo.getNotAccMonth();
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)pk_org);
        ac.set(curYear);
        AccperiodmonthVO[] months = ac.getMonthVOsOfCurrentYear();
        HashMap<String, IBDData> userMap = new HashMap<String, IBDData>();
        CloseAccBookVO[] accBookVO = ((ICloseAccBookQryService)NCLocator.getInstance().lookup(ICloseAccBookQryService.class)).queryCloseAccBookVoByPk(months[0].getPk_accperiod(), pk_org, pk_org, moudleId, null);
        HashMap<String, CloseAccBookVO> closeAccBookVOMap = new HashMap<String, CloseAccBookVO>();
        for (CloseAccBookVO closeAccBookVO : accBookVO) {
            closeAccBookVOMap.put(closeAccBookVO.getPk_accperiodmonth(), closeAccBookVO);
            userMap.put(closeAccBookVO.getEndaccuser(), null);
            userMap.put(closeAccBookVO.getUnendaccuser(), null);
        }
        IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee");
        IBDData[] userData = accessor.getDocbyPks(userMap.keySet().toArray(new String[0]));
        for (i = 0; i < userData.length; ++i) {
            if (userData[i] == null) continue;
            userMap.put(userData[i].getPk(), userData[i]);
        }
        if (enabledYear.equals(curYear)) {
            if ("".equals(accYear) && "".equals(accMonth) || accYear == null && accMonth == null || accYear != null && enabledYear != null && Integer.valueOf(accYear) < Integer.valueOf(enabledYear) || accYear != null && accYear.equals(enabledYear) && accMonth != null && enabledMonth != null && Integer.valueOf(accMonth) < Integer.valueOf(enabledMonth)) {
                findAccMonth = true;
            }
            for (i = 0; i < months.length; ++i) {
                periodNum = months[i].getYearmth().substring(5, 7);
                String begDate = months[i].getBegindate().toLocalString().substring(0, 10);
                String endDate = months[i].getEnddate().toLocalString().substring(0, 10);
                NccCloseAccountVO nccCloseAccountVo = new NccCloseAccountVO();
                nccCloseAccountVo.setStartDate(begDate);
                nccCloseAccountVo.setEndDate(endDate);
                if (months[i].getYearmth().equals(yearMonth)) {
                    map.put("pk_noSettleMonth", months[i].getPk_accperiodmonth());
                    map.put("m_sBegDate", begDate);
                    map.put("m_sEndDate", endDate);
                }
                nccCloseAccountVo.setPk_accperiod(months[i].getPk_accperiod());
                nccCloseAccountVo.setPeriod(months[i].getYearmth());
                if (closeAccBookVOMap.get(months[i].getPk_accperiodmonth().trim()) != null) {
                    CloseAccBookVO closeAccBookVO = (CloseAccBookVO)closeAccBookVOMap.get(months[i].getPk_accperiodmonth());
                    nccCloseAccountVo.setEndacctime(closeAccBookVO.getEndacctime() == null ? null : closeAccBookVO.getEndacctime().toStdString());
                    nccCloseAccountVo.setEndaccuser(userMap.get(closeAccBookVO.getEndaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getEndaccuser())).getName()));
                    nccCloseAccountVo.setUnendacctime(closeAccBookVO.getUnendacctime() == null ? null : closeAccBookVO.getUnendacctime().toStdString());
                    nccCloseAccountVo.setUnendaccuser(userMap.get(closeAccBookVO.getUnendaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getUnendaccuser())).getName()));
                }
                if (!findEnabledMonth) {
                    if (periodNum.equals(enabledMonth)) {
                        findEnabledMonth = true;
                        if (!findAccMonth) {
                            if (curYear.equals(accYear) && periodNum.equals(accMonth)) {
                                findAccMonth = true;
                            }
                            nccCloseAccountVo.setDispReckedOrNot(this.m_sAccount);
                        } else {
                            nccCloseAccountVo.setDispReckedOrNot(this.m_sDisAccount);
                        }
                    } else {
                        nccCloseAccountVo.setDispReckedOrNot(this.m_sDisEnabled);
                    }
                } else if (!findAccMonth) {
                    if (curYear.equals(accYear) && periodNum.equals(accMonth)) {
                        findAccMonth = true;
                    }
                    nccCloseAccountVo.setDispReckedOrNot(this.m_sAccount);
                } else {
                    nccCloseAccountVo.setDispReckedOrNot(this.m_sDisAccount);
                }
                nccCloseAccountVOs.add(nccCloseAccountVo);
            }
        } else {
            if (accYear == null || accYear.trim().length() == 0 || Integer.valueOf(curYear) > Integer.valueOf(accYear)) {
                findAccMonth = true;
            }
            for (i = 0; i < months.length; ++i) {
                periodNum = months[i].getYearmth().substring(5, 7);
                String begDate = months[i].getBegindate().toString().substring(0, 10);
                String endDate = months[i].getEnddate().toString().substring(0, 10);
                NccCloseAccountVO nccCloseAccountVO = new NccCloseAccountVO();
                nccCloseAccountVO.setStartDate(begDate);
                nccCloseAccountVO.setEndDate(endDate);
                nccCloseAccountVO.setPk_accperiod(months[i].getPk_accperiod());
                if (months[i].getYearmth().equals(yearMonth)) {
                    map.put("pk_noSettleMonth", months[i].getPk_accperiodmonth());
                    map.put("m_sBegDate", begDate);
                    map.put("m_sEndDate", endDate);
                }
                nccCloseAccountVO.setPk_accperiod(months[i].getPk_accperiod());
                nccCloseAccountVO.setPeriod(months[i].getYearmth());
                if (closeAccBookVOMap.get(months[i].getPk_accperiodmonth().trim()) != null) {
                    CloseAccBookVO closeAccBookVO = (CloseAccBookVO)closeAccBookVOMap.get(months[i].getPk_accperiodmonth());
                    nccCloseAccountVO.setEndacctime(closeAccBookVO.getEndacctime() == null ? null : closeAccBookVO.getEndacctime().toStdString());
                    nccCloseAccountVO.setEndaccuser(userMap.get(closeAccBookVO.getEndaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getEndaccuser())).getName()));
                    nccCloseAccountVO.setUnendacctime(closeAccBookVO.getUnendacctime() == null ? null : closeAccBookVO.getUnendacctime().toStdString());
                    nccCloseAccountVO.setUnendaccuser(userMap.get(closeAccBookVO.getUnendaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getUnendaccuser())).getName()));
                }
                if (!findAccMonth) {
                    if (curYear.equals(accYear) && periodNum.equals(accMonth)) {
                        findAccMonth = true;
                    }
                    nccCloseAccountVO.setDispReckedOrNot(this.m_sAccount);
                } else {
                    nccCloseAccountVO.setDispReckedOrNot(this.m_sDisAccount);
                }
                nccCloseAccountVOs.add(nccCloseAccountVO);
            }
        }
        map.put("nccCloseAccountVOs", nccCloseAccountVOs);
        map.put("noSettleMonth", yearMonth);
        return map;
    }

    public void onCheck(String pk_org, String moudleId, String prodId, String period) throws BusinessException {
        String[] accountInfo = null;
        accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
        String nodeName = this.checkInitClosed(moudleId, pk_org);
        if (nodeName != null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0881", null, new String[]{nodeName}));
        }
        String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
        String initEnabledYear = cal.substring(0, 4);
        String initEnabledMonth = cal.substring(5, 7);
        this.onPeriodValidate("Reckoning", accountInfo, new String[]{initEnabledYear, initEnabledMonth}, pk_org, prodId, period, moudleId);
    }

    public HashMap<String, Object> getSettltReport(SystemInfoVO sysInfo, FilterCondVO voCond) throws BusinessException {
        String dwbm = sysInfo.getCurDwbm();
        String sfbz = sysInfo.getSfbz();
        String calQj = voCond.getBegDate().substring(5, 7);
        String calNd = voCond.getBegDate().substring(0, 4);
        Vector vResult = new Vector();
        voCond.setDwbm(dwbm);
        voCond.setSfbz(sfbz);
        voCond.setMode1(sysInfo.getCheckMode1());
        voCond.setMode2(sysInfo.getCheckMode2());
        voCond.setMode3(sysInfo.getCheckMode3());
        voCond.setMode4(sysInfo.getCheckMode4());
        voCond.setPk_org(sysInfo.getPk_org());
        voCond.setYear(voCond.getBegDate().substring(0, 4));
        voCond.setQj(voCond.getBegDate().substring(5, 7));
        AgiotageVO m_voCurrency = new AgiotageVO();
        Vector<AgiotageBzVO> vBzData = new Vector<AgiotageBzVO>();
        String localPk = Currency.getLocalCurrPK((String)sysInfo.getCurDwbm());
        m_voCurrency.setDwbm(dwbm);
        m_voCurrency.setSfbz(sfbz);
        m_voCurrency.setBzbm(localPk);
        m_voCurrency.setLocal(localPk);
        Hashtable hBz = m_voCurrency.getAllBz();
        Enumeration em = hBz.keys();
        while (em.hasMoreElements()) {
            AgiotageBzVO bzvo = new AgiotageBzVO();
            String bzbm = em.nextElement().toString().trim();
            UFDouble[] hls = null;
            try {
                hls = Currency.getAdjustRateBoth((String)dwbm, (String)bzbm, null, (String)calNd, (String)calQj);
            }
            catch (Exception e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
                continue;
            }
            bzvo.setBzbm(bzbm);
            bzvo.setBbhl(hls[1]);
            if (hls[1] != null && !ArapCommonTool.isZero((UFDouble)hls[1])) {
                bzvo.setState(true);
            }
            vBzData.addElement(bzvo);
        }
        m_voCurrency.setSelBzbm(vBzData);
        RemoteTransferVO voRemote = ((ITermEndPrivate)NCLocator.getInstance().lookup(ITermEndPrivate.class.getName())).onReckoningCheck(voCond, m_voCurrency);
        vResult = voRemote.getTranData1();
        boolean state = voRemote.getReckoningState();
        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<CloseAccountVO> list = new ArrayList<CloseAccountVO>();
        if (!vResult.isEmpty()) {
            for (int i = 0; i < vResult.size(); ++i) {
                CloseAccountVO vo = new CloseAccountVO();
                Vector obj = (Vector)vResult.get(i);
                vo.setSerial((String)obj.get(0));
                vo.setNotQualified((String)obj.get(1));
                vo.setResult((String)obj.get(2));
                list.add(vo);
            }
        }
        map.put("datalist", list);
        map.put("state", state);
        return map;
    }

    public void onReckoningOver(String pk_org, String moudleId, String period, String pk_accperiodmonth) throws Exception {
        Map res;
        Integer isProvision;
        String year = period.substring(0, 4);
        String cope = period.substring(5, period.length());
        if ("2006".equals(moudleId) && (isProvision = this.clossAccValidator(pk_org, pk_accperiodmonth)) != null) {
            if (isProvision == 1) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0958") + "\n");
            }
            if (isProvision == 2) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0959") + "\n");
            }
        }
        if (!((Boolean)(res = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).isCloseByModuleIdAndPk_org(moudleId, pk_org, new String[]{period})).get(period)).booleanValue()) {
            ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).closeAcc(moudleId, pk_org, pk_org, pk_accperiodmonth);
        }
        ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).updateCloseAccountInfo(moudleId, pk_org, year, cope);
        ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).account(moudleId, pk_org, pk_org, pk_accperiodmonth);
    }

    private Integer clossAccValidator(String pk_org, String period) throws BusinessException {
        AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(period);
        ArapBillDAO dao = new ArapBillDAO();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        Map pfreqMap = dao.getProvisionfreq(new String[]{pk_org}, pk_group);
        if (pfreqMap.get(pk_org) == null && (pfreqMap != null && pfreqMap.size() == 0 || pfreqMap == null)) {
            return null;
        }
        Integer type = null;
        type = pfreqMap.get(pk_org) == null ? Integer.valueOf(Integer.parseInt(pfreqMap.values().toArray(new String[0])[0])) : Integer.valueOf(Integer.parseInt((String)pfreqMap.get(pk_org)));
        List<SuperVO> indiMonth = this.getProvisionVO(pk_org, accperiodvo.getYearmth(), ProvisionFreqEnum.valueOf((Integer)type), 0);
        if (indiMonth != null && indiMonth.size() > 0) {
            return 1;
        }
        List<SuperVO> proMonth = this.getProvisionVO(pk_org, accperiodvo.getYearmth(), ProvisionFreqEnum.valueOf((Integer)type), 1);
        if (proMonth != null && proMonth.size() > 0) {
            return 2;
        }
        return null;
    }

    private List<SuperVO> getProvisionVO(String pk_org, String period, ProvisionFreqEnum type, Integer proType) throws BusinessException {
        ArrayList<SuperVO> result = new ArrayList();
        String mnth = period.substring(5, 7);
        String year = period.substring(0, 4);
        String wheresql = "";
        if (ProvisionFreqEnum.MONTH.equals((Object)type)) {
            wheresql = " a.period = '" + period + "'";
        } else if (ProvisionFreqEnum.QUARTER.equals((Object)type)) {
            SqlBuilder sql = new SqlBuilder();
            if ("03".equals(mnth)) {
                String[] mnths = new String[]{year + "-01"};
                sql.append("a.period", mnths);
            } else if ("06".equals(mnth)) {
                String[] mnths = new String[]{year + "-04"};
                sql.append("a.period", mnths);
            } else if ("09".equals(mnth)) {
                String[] mnths = new String[]{year + "-07"};
                sql.append("a.period", mnths);
            } else if ("12".equals(mnth)) {
                String[] mnths = new String[]{year + "-10"};
                sql.append("a.period", mnths);
            }
            wheresql = sql.toString();
        } else if (ProvisionFreqEnum.YERA.equals((Object)type) && "12".equals(mnth)) {
            wheresql = "";
        }
        result = this.getProsionVO(pk_org, wheresql, proType, type);
        return result;
    }

    private List<SuperVO> getProsionVO(String pk_org, String wheresql, final Integer proType, ProvisionFreqEnum type) {
        String tablename = " arap_bdprovision ";
        if (0 == proType) {
            tablename = " arap_indiprovision ";
        }
        String sql = "select a.prostatus prostatus from " + tablename + " a inner join arap_bdprovisionrule r on a.pk_bdprovisionrule = r.pk_bdprovisionrule where " + wheresql + " and r.provisionfreq = '" + type.VALUE + "' and a.pk_org ='" + pk_org + "' and a.prostatus =-1";
        BaseDAO dao = new BaseDAO();
        final ArrayList<SuperVO> result = new ArrayList<SuperVO>();
        try {
            dao.executeQuery(sql, new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        BdProvisionVO provisionVo;
                        if (1 == proType) {
                            provisionVo = new BdProvisionVO();
                            provisionVo.setProstatus(Integer.valueOf(Integer.parseInt(rs.getString("prostatus"))));
                            result.add(provisionVo);
                            continue;
                        }
                        provisionVo = new IndiProvisionVO();
                        provisionVo.setProstatus(Integer.valueOf(Integer.parseInt(rs.getString("prostatus"))));
                        result.add(provisionVo);
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public void onCancelReckoning(String pk_org, String moudleId, String prodId) throws BusinessException {
        AccperiodmonthVO[] months;
        String[] accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
        String accYear = accountInfo[0];
        String accMonth = accountInfo[1];
        if (accYear == null || "".equals(accYear) || accMonth == null || "".equals(accMonth)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0880"));
        }
        String yearMonth = accountInfo[0] + "-" + accountInfo[1];
        String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
        String[] enableInfo = new String[]{cal.substring(0, 4), cal.substring(5, 7)};
        this.onPeriodValidate("CancelReckoning", accountInfo, enableInfo, pk_org, prodId, yearMonth, moudleId);
        String curYear = null;
        curYear = accYear != null && !"".equals(accYear) ? accYear : enableInfo[0];
        TermEndVO termEndVO = new TermEndVO(pk_org, accYear, accMonth);
        termEndVO.setNodecode(moudleId);
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)pk_org);
        ac.set(curYear);
        for (AccperiodmonthVO accperiodmonthVO : months = ac.getMonthVOsOfCurrentYear()) {
            if (!accperiodmonthVO.getYearmth().equals(yearMonth)) continue;
            termEndVO.setPk_periodmonth(accperiodmonthVO.getPk_accperiodmonth());
        }
        termEndVO.setEnableyear(enableInfo[0]);
        termEndVO.setEnablemonth(enableInfo[1]);
        ((ITermEndPrivate)NCLocator.getInstance().lookup(ITermEndPrivate.class.getName())).termEndOperation(prodId, termEndVO, true);
    }

    private void onPeriodValidate(String sign, String[] accountInfo, String[] enableInfo, String pk_org, String prodId, String period, String moudleId) throws BusinessException {
        SystemInfoVO sysInfo = new SystemInfoVO();
        sysInfo.setPk_org(pk_org);
        sysInfo.setProdID(prodId);
        String selMonth = period.substring(5, period.length());
        String selYear = period.substring(0, 4);
        if (sign.equals("Reckoning")) {
            FirstNotClosedAccountMonthVO vo = AccountInfo.getFirstNotClosedAccountMonth((String[])enableInfo, (String[])accountInfo, (SystemInfoVO)sysInfo);
            String YearOfFirDisAccMonth = vo.getNotAccYear();
            String CopeOfFirDisAccMonth = vo.getNotAccMonth();
            if (selYear.equals(YearOfFirDisAccMonth)) {
                if (!selMonth.equals(CopeOfFirDisAccMonth)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0235"));
                }
            } else {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0236", null, new String[]{YearOfFirDisAccMonth + "-" + CopeOfFirDisAccMonth}));
            }
            boolean frozen = ((IArapCheckFrozenService)NCLocator.getInstance().lookup(IArapCheckFrozenService.class)).checkFrozenForCloseAccount(pk_org, period, prodId, moudleId);
            if (!frozen) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1019"));
            }
        }
        if (sign.equals("CancelReckoning")) {
            if (accountInfo == null) {
                accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
            } else {
                String accYear = accountInfo[0];
                String accMonth = accountInfo[1];
                if (!"".equals(accYear) && !"".equals(accMonth)) {
                    if (selYear.equals(accYear)) {
                        if (!selMonth.equals(accMonth)) {
                            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0237"));
                        }
                    } else {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0238"));
                    }
                    if (accYear == null || accYear.length() == 0) {
                        throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0237"));
                    }
                }
            }
        }
    }

    private String checkInitClosed(String moudleId, String pk_org) throws BusinessException {
        String[] paramCodes = new String[]{};
        String[] NodeNames = new String[]{};
        if ("2006".equals(moudleId)) {
            paramCodes = new String[]{"20060RO", "20060ARO"};
            NodeNames = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0204"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0203")};
        } else if ("2008".equals(moudleId)) {
            paramCodes = new String[]{"20080PO", "20080APO"};
            NodeNames = new String[]{NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0202"), NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0201")};
        }
        IInitBillCloseService service = (IInitBillCloseService)NCLocator.getInstance().lookup(IInitBillCloseService.class);
        int retIndex = service.isInitBillClosed(paramCodes, pk_org);
        if (retIndex != -1) {
            return NodeNames[retIndex];
        }
        return null;
    }
}

