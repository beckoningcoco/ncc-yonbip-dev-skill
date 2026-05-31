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
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.sysinit.SysinitConst
 *  nc.vo.arap.termendtransact.AgiotageBzVO
 *  nc.vo.arap.termendtransact.AgiotageVO
 *  nc.vo.arap.termendtransact.FilterCondVO
 *  nc.vo.arap.termendtransact.RemoteTransferVO
 *  nc.vo.arap.termendtransact.TermEndVO
 *  nc.vo.arap.transaction.AccountInfo
 *  nc.vo.arap.transaction.FirstNotClosedAccountMonthVO
 *  nc.vo.arap.transaction.SystemInfoVO
 *  nc.vo.arap.utils.CloseAccinfoVO
 *  nc.vo.bd.accessor.IBDData
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.utils.SqlBuilder
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.CloseAccBookVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.dto.arap.arappub.BatchSettleReportVO
 *  nccloud.dto.arap.arappub.CloseAccountVO
 *  nccloud.dto.arap.arappub.NccCloseAccountVO
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.INccBatchCloseAccountService
 *  nccloud.vo.arap.bdprovision.BdProvisionVO
 *  nccloud.vo.arap.bdprovisionrule.ProvisionFreqEnum
 *  nccloud.vo.arap.indiprovision.IndiProvisionVO
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
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
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.termendtransact.AgiotageBzVO;
import nc.vo.arap.termendtransact.AgiotageVO;
import nc.vo.arap.termendtransact.FilterCondVO;
import nc.vo.arap.termendtransact.RemoteTransferVO;
import nc.vo.arap.termendtransact.TermEndVO;
import nc.vo.arap.transaction.AccountInfo;
import nc.vo.arap.transaction.FirstNotClosedAccountMonthVO;
import nc.vo.arap.transaction.SystemInfoVO;
import nc.vo.arap.utils.CloseAccinfoVO;
import nc.vo.bd.accessor.IBDData;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.utils.SqlBuilder;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.CloseAccBookVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.dto.arap.arappub.BatchSettleReportVO;
import nccloud.dto.arap.arappub.CloseAccountVO;
import nccloud.dto.arap.arappub.NccCloseAccountVO;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.INccBatchCloseAccountService;
import nccloud.vo.arap.bdprovision.BdProvisionVO;
import nccloud.vo.arap.bdprovisionrule.ProvisionFreqEnum;
import nccloud.vo.arap.indiprovision.IndiProvisionVO;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class NccBatchCloseAccountServiceImpl
implements INccBatchCloseAccountService {
    private String m_sAccount = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0206");
    private String m_sDisAccount = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0207");

    public HashMap<String, Object> getCloseAccountData(String[] pk_orgs, String[] pk_orgNames, String moudleId, boolean isCloseAccount) throws BusinessException {
        ArrayList<NccCloseAccountVO> nccCloseAccountVOs = new ArrayList<NccCloseAccountVO>();
        Map minNotEndedAccMap = ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).getMinNotEndedAccByOrg(moudleId, pk_orgs);
        Map accountCalenderMap = AccountCalendar.getInstanceByPk_orgs((String[])pk_orgs);
        HashMap<String, IBDData> userMap = new HashMap<String, IBDData>();
        IGeneralAccessor accessor = GeneralAccessorFactory.getAccessor((String)"f6f9a473-56c0-432f-8bc7-fbf8fde54fee");
        for (int i = 0; i < pk_orgs.length; ++i) {
            if (minNotEndedAccMap.get(pk_orgs[i]) == null) continue;
            NccCloseAccountVO nccCloseAccountVO = new NccCloseAccountVO();
            String period = (String)minNotEndedAccMap.get(pk_orgs[i]);
            String pk_org = pk_orgs[i];
            AccountCalendar ac = (AccountCalendar)accountCalenderMap.get(pk_org);
            ac.set(period.substring(0, 4), period.substring(5, 7));
            if (!isCloseAccount) {
                String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
                if (cal.equals(period)) continue;
                ac.roll(AccountCalendar.MONTH, -1);
            }
            AccperiodmonthVO monthVO = ac.getMonthVO();
            CloseAccBookVO[] accBookVO = ((ICloseAccBookQryService)NCLocator.getInstance().lookup(ICloseAccBookQryService.class)).queryCloseAccBookVoByPk(monthVO.getPk_accperiod(), pk_org, pk_org, moudleId, null);
            ArrayList<String> userIds = new ArrayList<String>();
            CloseAccBookVO closeAccBookVO = new CloseAccBookVO();
            for (CloseAccBookVO bookVO : accBookVO) {
                if (!bookVO.getPk_accperiodmonth().equals(monthVO.getPk_accperiodmonth())) continue;
                if (bookVO.getEndaccuser() != null && !"".equals(bookVO.getEndaccuser()) && userMap.get(bookVO.getEndaccuser()) == null) {
                    userIds.add(bookVO.getEndaccuser());
                }
                if (bookVO.getUnendaccuser() != null && !"".equals(bookVO.getUnendaccuser()) && userMap.get(bookVO.getUnendaccuser()) == null) {
                    userIds.add(bookVO.getUnendaccuser());
                }
                closeAccBookVO = bookVO;
            }
            if (userIds.size() > 0) {
                IBDData[] userData = accessor.getDocbyPks(userIds.toArray(new String[userIds.size()]));
                for (int j = 0; j < userData.length; ++j) {
                    if (userData[j] == null) continue;
                    userMap.put(userData[j].getPk(), userData[j]);
                }
            }
            nccCloseAccountVO.setPk_org(pk_org);
            nccCloseAccountVO.setPk_orgName(pk_orgNames[i]);
            nccCloseAccountVO.setPeriod(monthVO.getYearmth());
            nccCloseAccountVO.setPk_accperiodmonth(monthVO.getPk_accperiodmonth());
            nccCloseAccountVO.setStartDate(monthVO.getBegindate().toLocalString().substring(0, 10));
            nccCloseAccountVO.setEndDate(monthVO.getEnddate().toLocalString().substring(0, 10));
            nccCloseAccountVO.setEndacctime(closeAccBookVO.getEndacctime() == null ? null : closeAccBookVO.getEndacctime().toStdString());
            nccCloseAccountVO.setUnendacctime(closeAccBookVO.getUnendacctime() == null ? null : closeAccBookVO.getUnendacctime().toStdString());
            nccCloseAccountVO.setEndaccuser(userMap.get(closeAccBookVO.getEndaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getEndaccuser())).getName()));
            nccCloseAccountVO.setUnendaccuser(userMap.get(closeAccBookVO.getUnendaccuser()) == null ? null : String.valueOf(((IBDData)userMap.get(closeAccBookVO.getUnendaccuser())).getName()));
            if (isCloseAccount) {
                nccCloseAccountVO.setDispReckedOrNot(this.m_sDisAccount);
            } else {
                nccCloseAccountVO.setDispReckedOrNot(this.m_sAccount);
            }
            nccCloseAccountVOs.add(nccCloseAccountVO);
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("nccCloseAccountVOs", nccCloseAccountVOs);
        return map;
    }

    public HashMap<String, Object> getBatchCloseAccountReport(HashMap<String, FilterCondVO> filterMap) throws BusinessException {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        for (Map.Entry<String, FilterCondVO> entry : filterMap.entrySet()) {
            String pk_org = entry.getKey();
            FilterCondVO voCond = entry.getValue();
            AgiotageVO m_voCurrency = new AgiotageVO();
            Vector<AgiotageBzVO> vBzData = new Vector<AgiotageBzVO>();
            String localPk = Currency.getLocalCurrPK((String)voCond.getDwbm());
            m_voCurrency.setDwbm(voCond.getDwbm());
            m_voCurrency.setSfbz(voCond.getSfbz());
            m_voCurrency.setBzbm(localPk);
            m_voCurrency.setLocal(localPk);
            Hashtable hBz = m_voCurrency.getAllBz();
            Enumeration em = hBz.keys();
            while (em.hasMoreElements()) {
                AgiotageBzVO bzvo = new AgiotageBzVO();
                String bzbm = em.nextElement().toString().trim();
                UFDouble[] hls = null;
                try {
                    hls = Currency.getAdjustRateBoth((String)voCond.getDwbm(), (String)bzbm, null, (String)voCond.getYear(), (String)voCond.getQj());
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
            Vector vResult = voRemote.getTranData1();
            boolean state = voRemote.getReckoningState();
            ArrayList<CloseAccountVO> list = new ArrayList<CloseAccountVO>();
            BatchSettleReportVO batchVo = new BatchSettleReportVO();
            batchVo.setState(state);
            if (!vResult.isEmpty()) {
                for (int i = 0; i < vResult.size(); ++i) {
                    CloseAccountVO vo = new CloseAccountVO();
                    Vector obj = (Vector)vResult.get(i);
                    vo.setSerial((String)obj.get(0));
                    vo.setNotQualified((String)obj.get(1));
                    vo.setResult((String)obj.get(2));
                    list.add(vo);
                }
                batchVo.setListReportVO(list);
            }
            resultMap.put(pk_org, batchVo);
        }
        return resultMap;
    }

    public String closeAccountCheck(String pk_org, String moudleId, String prodId, String period) throws BusinessException {
        String[] accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
        String nodeName = this.checkInitClosed(moudleId, pk_org);
        if (nodeName != null) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0881", null, new String[]{nodeName});
        }
        SystemInfoVO sysInfo = new SystemInfoVO();
        sysInfo.setPk_org(pk_org);
        sysInfo.setProdID(prodId);
        String selMonth = period.substring(5, period.length());
        String selYear = period.substring(0, 4);
        String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
        String initEnabledYear = cal.substring(0, 4);
        String initEnabledMonth = cal.substring(5, 7);
        FirstNotClosedAccountMonthVO vo = AccountInfo.getFirstNotClosedAccountMonth((String[])new String[]{initEnabledYear, initEnabledMonth}, (String[])accountInfo, (SystemInfoVO)sysInfo);
        String YearOfFirDisAccMonth = vo.getNotAccYear();
        String CopeOfFirDisAccMonth = vo.getNotAccMonth();
        if (selYear.equals(YearOfFirDisAccMonth)) {
            if (!selMonth.equals(CopeOfFirDisAccMonth)) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0235");
            }
        } else {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0236", null, new String[]{YearOfFirDisAccMonth + "-" + CopeOfFirDisAccMonth});
        }
        return null;
    }

    public void closeAccountOver(String pk_org, String moudleId, String period, String pk_accperiodmonth) throws Exception {
        Integer isProvision;
        String year = period.substring(0, 4);
        String cope = period.substring(5, period.length());
        Map res = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).isCloseByModuleIdAndPk_org(moudleId, pk_org, new String[]{period});
        if (!((Boolean)res.get(period)).booleanValue()) {
            ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).closeAcc(moudleId, pk_org, pk_org, pk_accperiodmonth);
        }
        if ("2006".equals(moudleId) && (isProvision = this.clossAccValidator(pk_org, pk_accperiodmonth)) != null) {
            if (isProvision == 1) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0958") + "\n");
            }
            if (isProvision == 2) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0959") + "\n");
            }
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

    private Integer clossAccValidatorBatch(String[] pk_org, Map<String, String> orgPkaccMap) throws BusinessException {
        ArapBillDAO dao = new ArapBillDAO();
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        Map pfreqMap = dao.getProvisionfreq(pk_org, pk_group);
        for (String org : pk_org) {
            String period = orgPkaccMap.get(org);
            AccperiodmonthVO accperiodvo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByPk(period);
            if (pfreqMap.get(org) == null && (pfreqMap != null && pfreqMap.size() == 0 || pfreqMap == null)) continue;
            Integer type = null;
            type = pfreqMap.get(org) == null ? Integer.valueOf(Integer.parseInt(pfreqMap.values().toArray(new String[0])[0])) : Integer.valueOf(Integer.parseInt((String)pfreqMap.get(org)));
            List<SuperVO> indi = this.getProvisionVO(org, accperiodvo.getYearmth(), ProvisionFreqEnum.valueOf((Integer)type), 0);
            if (indi != null && indi.size() > 0) {
                return 1;
            }
            List<SuperVO> proMonth = this.getProvisionVO(org, accperiodvo.getYearmth(), ProvisionFreqEnum.valueOf((Integer)type), 1);
            if (proMonth == null || proMonth.size() <= 0) continue;
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

    public String onCancelCloseAccount(String pk_org, String moudleId, String prodId, String period, String pk_accperiodmonth) throws BusinessException {
        String[] accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfo(moudleId, pk_org);
        String accYear = accountInfo[0];
        String accMonth = accountInfo[1];
        if (accYear == null || "".equals(accYear) || accMonth == null || "".equals(accMonth)) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0880");
        }
        String cal = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pk_org, moudleId);
        String[] enableInfo = new String[]{cal.substring(0, 4), cal.substring(5, 7)};
        String selMonth = period.substring(5, period.length());
        String selYear = period.substring(0, 4);
        if (selYear.equals(accYear)) {
            if (!selMonth.equals(accMonth)) {
                return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0237");
            }
        } else {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0238");
        }
        if (accYear == null || accYear.length() == 0) {
            return NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0237");
        }
        TermEndVO termEndVO = new TermEndVO(pk_org, accYear, accMonth);
        termEndVO.setNodecode(moudleId);
        termEndVO.setPk_periodmonth(pk_accperiodmonth);
        termEndVO.setEnableyear(enableInfo[0]);
        termEndVO.setEnablemonth(enableInfo[1]);
        ((ITermEndPrivate)NCLocator.getInstance().lookup(ITermEndPrivate.class.getName())).termEndOperation(prodId, termEndVO, true);
        return null;
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

    private String checkInitClosedBatch(String moudleId, String[] pk_orgs) throws BusinessException {
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
        int retIndex = 0;
        service.isInitBillClosedBatch(paramCodes, pk_orgs);
        if (retIndex != -1) {
            return NodeNames[retIndex];
        }
        return null;
    }

    public HashMap<String, FilterCondVO> initInfo(String module, String[] pk_orgs, String[] pk_accmonth, CloseAccinfoVO[] info, int type) throws BusinessException {
        HashMap<String, FilterCondVO> filterMap;
        block5: {
            ArrayList<Map<String, String>> numList;
            block4: {
                if (type == 1 && ArrayUtils.isEmpty((Object[])pk_accmonth) || ArrayUtils.isEmpty((Object[])pk_orgs) || type == 0 && ArrayUtils.isEmpty((Object[])info)) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1208"));
                }
                filterMap = new HashMap<String, FilterCondVO>();
                String sNum = "AR5";
                String sNum1 = "AR7";
                String sNum2 = "AR8";
                String sNum3 = "AR9";
                String sNum4 = "AR10";
                if (ArapConstant.ARAP_AP_BILLCLASS.equals(module)) {
                    sNum = "AP3";
                    sNum1 = "AP5";
                    sNum2 = "AP6";
                    sNum3 = "AP7";
                    sNum4 = "AP8";
                }
                Map numMap = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getBatchParaString(pk_orgs, sNum);
                Map numMap1 = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getBatchParaString(pk_orgs, sNum1);
                Map numMap2 = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getBatchParaString(pk_orgs, sNum2);
                Map numMap3 = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getBatchParaString(pk_orgs, sNum3);
                Map numMap4 = ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getBatchParaString(pk_orgs, sNum4);
                numList = new ArrayList<Map<String, String>>();
                numList.add(numMap);
                numList.add(numMap1);
                numList.add(numMap2);
                numList.add(numMap3);
                numList.add(numMap4);
                if (type != 1) break block4;
                for (String pk_org : pk_orgs) {
                    FilterCondVO voCond = new FilterCondVO();
                    AccountCalendar vo = AccountCalendar.getInstanceByAccperiodMonth((String)pk_accmonth[0]);
                    String beginmonth = vo.getMonthVO().getAccperiodmth();
                    String periodyear = vo.getYearVO().getPeriodyear();
                    UFDate begindate = vo.getMonthVO().getBegindate();
                    UFDate enddate = vo.getMonthVO().getEnddate();
                    String accperoid = vo.getMonthVO().getPk_accperiod();
                    voCond.setPeriodSate("N");
                    voCond.setSfbz(module);
                    voCond.setYear(periodyear);
                    voCond.setQj(beginmonth);
                    voCond.setPeriodSate(accperoid);
                    voCond.setBegDate(begindate.toString().substring(0, 10));
                    voCond.setEndDate(enddate.toString().substring(0, 10));
                    this.getfilterVO(pk_org, voCond, numList);
                    filterMap.put(pk_org, voCond);
                }
                break block5;
            }
            if (type != 0) break block5;
            for (int i = 0; i < info.length; ++i) {
                FilterCondVO voCond = new FilterCondVO();
                String pk_org = info[i].getPk_org();
                voCond.setSfbz(module);
                voCond.setYear(info[i].getPeriod().substring(0, 4));
                voCond.setQj(info[i].getPeriod().substring(5, 7));
                voCond.setBegDate(info[i].getBegDate());
                voCond.setEndDate(info[i].getEndDate());
                this.getfilterVO(pk_org, voCond, numList);
                filterMap.put(pk_org, voCond);
            }
        }
        return filterMap;
    }

    private void getfilterVO(String pkorg, FilterCondVO voCond, List<Map<String, String>> numlist) {
        HashMap<String, String> sysCodeMap = new HashMap<String, String>();
        sysCodeMap.put("1", null);
        sysCodeMap.put("2", "check");
        sysCodeMap.put("3", "control");
        String mode = numlist.get(0).get(pkorg);
        String mode1 = numlist.get(1).get(pkorg);
        String mode2 = numlist.get(2).get(pkorg);
        String mode3 = numlist.get(3).get(pkorg);
        String mode4 = numlist.get(4).get(pkorg);
        boolean isMonthEnd = false;
        if (SysinitConst.AGIOTAGE_END.equals(mode)) {
            isMonthEnd = true;
        }
        mode1 = (String)sysCodeMap.get(mode1);
        mode2 = (String)sysCodeMap.get(mode2);
        mode3 = (String)sysCodeMap.get(mode3);
        mode4 = isMonthEnd ? (String)sysCodeMap.get(mode4) : null;
        voCond.setMode1(mode1);
        voCond.setMode2(mode2);
        voCond.setMode3(mode3);
        voCond.setMode4(mode4);
        voCond.setDwbm(pkorg);
        voCond.setPk_org(pkorg);
    }

    public HashMap<String, Object> getBatchCloseAccountReports(HashMap<String, FilterCondVO> filterMap) throws BusinessException {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        for (Map.Entry<String, FilterCondVO> entry : filterMap.entrySet()) {
            String pk_org = entry.getKey();
            FilterCondVO voCond = entry.getValue();
            AgiotageVO m_voCurrency = new AgiotageVO();
            Vector<AgiotageBzVO> vBzData = new Vector<AgiotageBzVO>();
            String localPk = Currency.getLocalCurrPK((String)voCond.getDwbm());
            m_voCurrency.setDwbm(voCond.getDwbm());
            m_voCurrency.setSfbz(voCond.getSfbz());
            m_voCurrency.setBzbm(localPk);
            m_voCurrency.setLocal(localPk);
            Hashtable hBz = m_voCurrency.getAllBz();
            Enumeration em = hBz.keys();
            while (em.hasMoreElements()) {
                AgiotageBzVO bzvo = new AgiotageBzVO();
                String bzbm = em.nextElement().toString().trim();
                UFDouble[] hls = null;
                try {
                    hls = Currency.getAdjustRateBoth((String)voCond.getDwbm(), (String)bzbm, null, (String)voCond.getYear(), (String)voCond.getQj());
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
            List onReckoningReportCheck = ((ITermEndPrivate)NCLocator.getInstance().lookup(ITermEndPrivate.class.getName())).onReckoningReportCheck(voCond, m_voCurrency);
            resultMap.put(pk_org, onReckoningReportCheck);
        }
        return resultMap;
    }

    public HashMap<String, String> closeAccountCheck(Map<String, String> clossinfoMap, String moudleId, String prodId) throws BusinessException {
        ArrayList<String> pk_org = new ArrayList<String>();
        ArrayList<String> period = new ArrayList<String>();
        ArrayList<SystemInfoVO> sysVO = new ArrayList<SystemInfoVO>();
        HashMap<String, String[]> enableInfoMap = new HashMap<String, String[]>();
        HashMap<String, String> retmap = new HashMap<String, String>();
        for (Map.Entry<String, String> parm : clossinfoMap.entrySet()) {
            pk_org.add(parm.getKey());
            period.add(parm.getValue());
        }
        Map orgName = new ArapBillDAO().getOrgNamebyPks(pk_org.toArray(new String[0]));
        this.checkInitClosedBatch(moudleId, pk_org.toArray(new String[0]));
        Map accountInfo = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).getCloseAccountInfoBatch(moudleId, pk_org.toArray(new String[0]));
        Map<String, String> orgperiodMap = this.getOrgModulePerid(pk_org.toArray(new String[0]), moudleId);
        for (String org : pk_org) {
            String cal = orgperiodMap.get(org);
            String initEnabledYear = cal.substring(0, 4);
            String initEnabledMonth = cal.substring(5, 7);
            enableInfoMap.put(org, new String[]{initEnabledYear, initEnabledMonth});
            SystemInfoVO vo = new SystemInfoVO();
            vo.setPk_org(org);
            vo.setProdID(prodId);
            sysVO.add(vo);
        }
        Map resultMap = AccountInfo.getFirstNotClosedAccountMonth(enableInfoMap, (Map)accountInfo, (SystemInfoVO[])sysVO.toArray(new SystemInfoVO[0]));
        for (String org : pk_org) {
            String perd = clossinfoMap.get(org);
            String message = null;
            if (StringUtils.isEmpty((CharSequence)perd)) continue;
            String selMonth = perd.substring(5, perd.length());
            String selYear = perd.substring(0, 4);
            FirstNotClosedAccountMonthVO vo = (FirstNotClosedAccountMonthVO)resultMap.get(org);
            if (vo == null) continue;
            String YearOfFirDisAccMonth = vo.getNotAccYear();
            String CopeOfFirDisAccMonth = vo.getNotAccMonth();
            if (selYear.equals(YearOfFirDisAccMonth)) {
                if (!selMonth.equals(CopeOfFirDisAccMonth)) {
                    message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0235");
                }
            } else {
                message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0236", null, new String[]{YearOfFirDisAccMonth + "-" + CopeOfFirDisAccMonth});
            }
            if (message == null) continue;
            retmap.put((String)orgName.get(org), message);
            return retmap;
        }
        return null;
    }

    private Map<String, String> getOrgModulePerid(String[] pkorgs, String moduleid) throws BusinessException {
        HashMap<String, String> retMap = new HashMap<String, String>();
        Object[] OrgModulePeriodVOs = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgModulePeriodByOrgIDAndModuleID(pkorgs, new String[]{moduleid});
        if (ArrayUtils.isEmpty((Object[])OrgModulePeriodVOs)) {
            return retMap;
        }
        for (Object vo : OrgModulePeriodVOs) {
            retMap.put(vo.getPk_org(), vo.getPk_accperiod());
        }
        return retMap;
    }

    public void closeAccountOver(Map<String, String> orgPeriodMap, String moudleId, Map<String, String> orgPkaccMap) throws Exception {
        String pk_org;
        Integer isProvision;
        HashMap<String, String> closeinfoMap = new HashMap<String, String>();
        String[] pkorgs = orgPeriodMap.keySet().toArray(new String[0]);
        if ("2006".equals(moudleId) && (isProvision = this.clossAccValidatorBatch(pkorgs, orgPkaccMap)) != null) {
            if (isProvision == 1) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0958") + "\n");
            }
            if (isProvision == 2) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0959") + "\n");
            }
        }
        for (Map.Entry<String, String> parm : orgPeriodMap.entrySet()) {
            pk_org = parm.getKey();
            String period = parm.getValue();
            String year = period.substring(0, 4);
            String cope = period.substring(5, period.length());
            closeinfoMap.put(pk_org, year + "-" + cope);
            Map res = ((ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class)).isCloseByModuleIdAndPk_org(moudleId, parm.getKey(), new String[]{period});
            if (((Boolean)res.get(period)).booleanValue()) continue;
            ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).closeAcc(moudleId, pk_org, pk_org, orgPkaccMap.get(pk_org));
        }
        ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).updateCloseAccountInfoBatch(moudleId, closeinfoMap);
        for (Map.Entry<String, String> p : orgPkaccMap.entrySet()) {
            pk_org = p.getKey();
            String pk_accpeiod = p.getValue();
            ((ICloseAccPubServicer)NCLocator.getInstance().lookup(ICloseAccPubServicer.class)).account(moudleId, pk_org, pk_org, pk_accpeiod);
        }
    }
}

