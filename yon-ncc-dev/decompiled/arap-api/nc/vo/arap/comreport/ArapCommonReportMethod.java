/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.bd.accessor.GeneralAccessorFactory
 *  nc.pubitf.bd.accessor.IGeneralAccessor
 *  nc.vo.credit.billcreditquery.entity.BillCreditQueryVO
 *  nc.vo.fipub.report.ReportQueryCondVO
 *  nc.vo.fipub.timecontrol.TimeCtrlDetail
 *  nc.vo.fipub.timecontrol.TimeCtrlVO
 *  nc.vo.fipub.timecontrol.TimeUnit
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.MultiLangText
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.rs.MemoryResultSet
 *  nc.vo.pub.rs.MemoryResultSetMetaData
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.comreport;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.itf.fi.pub.Currency;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.bd.accessor.GeneralAccessorFactory;
import nc.pubitf.bd.accessor.IGeneralAccessor;
import nc.vo.arap.comreport.ArapReportPubUtil;
import nc.vo.arap.comreport.CreditVO;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.credit.billcreditquery.entity.BillCreditQueryVO;
import nc.vo.fipub.report.ReportQueryCondVO;
import nc.vo.fipub.timecontrol.TimeCtrlDetail;
import nc.vo.fipub.timecontrol.TimeCtrlVO;
import nc.vo.fipub.timecontrol.TimeUnit;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.MultiLangText;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.rs.MemoryResultSet;
import nc.vo.pub.rs.MemoryResultSetMetaData;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class ArapCommonReportMethod {
    @Deprecated
    public static void computeEndPeriodBalance(MemoryResultSet resultSet, String sign) throws SQLException {
        if (resultSet == null || !resultSet.next()) {
            return;
        }
        resultSet.beforeFirst();
        String[] fields = new String[]{"bal_qua", "bal_ori", "bal_loc", "gr_bal_loc", "gl_bal_loc"};
        String[] formulas = new String[]{fields[0] + "->init_qua" + sign + "(debt_qua-credit_qua)", fields[1] + "->init_ori" + sign + "(debt_ori-credit_ori)", fields[2] + "->init_loc" + sign + "(debt_loc-credit_loc)", fields[3] + "->gr_init_loc" + sign + "(gr_debt_loc-gr_credit_loc)", fields[4] + "->gl_init_loc" + sign + "(gl_debt_loc-gl_credit_loc)"};
        int[] types = new int[]{4, 3, 3, 3, 3};
        resultSet.setColumnByFormulate_type(fields, types, formulas);
    }

    public static void computeExchanges(MemoryResultSet resultSet, ReportQueryCondVO queryVO) throws InvalidAccperiodExcetion, SQLException {
        if (resultSet == null || !resultSet.next()) {
            return;
        }
        resultSet.beforeFirst();
        String pk_org = null;
        if (ArrayUtils.isNotEmpty((Object[])queryVO.getPk_orgs())) {
            pk_org = queryVO.getPk_orgs()[0];
        }
        AccountCalendar accountCalendar = AccountCalendar.getInstanceByPk_org(pk_org);
        UFDate beginDate = queryVO.getBeginDate();
        UFDate endDate = queryVO.getEndDate();
        String qryMode = queryVO.getQryMode();
        if ("byMonth".equals(qryMode)) {
            accountCalendar.setDate(queryVO.getBeginDate());
            beginDate = accountCalendar.getMonthVO().getBegindate();
            accountCalendar.setDate(queryVO.getEndDate());
            endDate = accountCalendar.getMonthVO().getEnddate();
        }
        int timeinterval = UFDate.getDaysBetween((UFDate)beginDate, (UFDate)endDate) + 1;
        resultSet.appendClumnByDefaultValue("timeinterval", (Object)timeinterval);
        String[] fields = new String[]{"zzl", "zzts"};
        String[] formulates = new String[]{"zzl->200*debt_loc/(init_loc+bal_loc)", "zzts->timeinterval/(2*debt_loc/(init_loc+bal_loc))"};
        int[] types = new int[]{3, 3};
        resultSet.setColumnByFormulate_type(fields, types, formulates);
    }

    public static void fillAllAccountAge(MemoryResultSet resultSet, String accAgePlan) throws BusinessException, SQLException {
        ArrayList resultList = resultSet.getResultArrayList();
        if (resultList == null || resultList.size() == 0) {
            return;
        }
        MemoryResultSetMetaData metaData = resultSet.getMetaData0();
        TimeCtrlVO timeCtrlVO = ArapReportPubUtil.getTimeCtrlVO(accAgePlan);
        TimeCtrlDetail[] timeCtrlDetails = timeCtrlVO.getItems();
        Arrays.sort(timeCtrlDetails, new Comparator<Object>(){

            @Override
            public int compare(Object detail1, Object detail2) {
                if (detail1 == null || detail2 == null) {
                    return 0;
                }
                return ((TimeCtrlDetail)detail1).getPropertyid().compareTo(((TimeCtrlDetail)detail2).getPropertyid());
            }
        });
        int colType = 0;
        String colName = null;
        ArrayList<Integer> integerFieldIndex = new ArrayList<Integer>();
        ArrayList<Integer> doubleFieldIndex = new ArrayList<Integer>();
        for (int i = 0; i < metaData.getColumnCount(); ++i) {
            colType = metaData.getColumnType(i + 1);
            colName = metaData.getColumnName(i + 1);
            if (colType == 3 && colName.toLowerCase().contains("bill_")) continue;
            if (colType == 4) {
                integerFieldIndex.add(i);
                continue;
            }
            if (colType == 3 && "rn".equalsIgnoreCase(colName)) {
                integerFieldIndex.add(i);
                continue;
            }
            if (colType != 3) continue;
            doubleFieldIndex.add(i);
        }
        int idxAccountage = metaData.getNameIndex("accage");
        int idxPropertyid = metaData.getNameIndex("accageid");
        List firstRow = (List)resultList.get(0);
        int idxQryobj0pk = metaData.getNameIndex("qryobj0pk");
        String qryobj0pk = (String)firstRow.get(idxQryobj0pk);
        List currRow = null;
        ArrayList<String> existAges = new ArrayList<String>();
        for (int i = 0; i < resultList.size() && qryobj0pk.equals((currRow = (List)resultList.get(i)).get(idxQryobj0pk)); ++i) {
            existAges.add(String.valueOf(currRow.get(idxPropertyid)));
        }
        List<Object> addRow = null;
        ArrayList<List<Object>> addResultList = new ArrayList<List<Object>>();
        int propid = timeCtrlDetails[0].getPropertyid() - 1;
        if (timeCtrlDetails[0].getStartunit() != null && !existAges.contains(String.valueOf(propid))) {
            addRow = ArapCommonReportMethod.copyLine(firstRow, integerFieldIndex, doubleFieldIndex);
            addRow.set(idxPropertyid, propid);
            addRow.set(idxAccountage, ArapCommonReportMethod.getTimeCtrlDesc(null, timeCtrlVO.getUnit(), null, timeCtrlDetails[0].getStartunit()));
            addResultList.add(addRow);
        }
        for (TimeCtrlDetail detail : timeCtrlDetails) {
            propid = detail.getPropertyid();
            if (existAges.contains(String.valueOf(propid))) continue;
            addRow = ArapCommonReportMethod.copyLine(firstRow, integerFieldIndex, doubleFieldIndex);
            addRow.set(idxPropertyid, propid);
            addRow.set(idxAccountage, ArapCommonReportMethod.getTimeCtrlDesc(detail.getDescr(), timeCtrlVO.getUnit(), detail.getStartunit(), detail.getEndunit()));
            addResultList.add(addRow);
        }
        propid = timeCtrlDetails[timeCtrlDetails.length - 1].getPropertyid() + 1;
        if (timeCtrlDetails[timeCtrlDetails.length - 1].getEndunit() != null && !existAges.contains(String.valueOf(propid))) {
            addRow = ArapCommonReportMethod.copyLine(firstRow, integerFieldIndex, doubleFieldIndex);
            addRow.set(idxPropertyid, propid);
            addRow.set(idxAccountage, ArapCommonReportMethod.getTimeCtrlDesc(null, timeCtrlVO.getUnit(), timeCtrlDetails[timeCtrlDetails.length - 1].getEndunit(), null));
            addResultList.add(addRow);
        }
        resultList.addAll(0, addResultList);
    }

    private static List<Object> copyLine(List<Object> srcRow, List<Integer> integerFieldIndex, List<Integer> doubleFieldIndex) {
        int i;
        ArrayList<Object> newRow = new ArrayList<Object>();
        for (i = 0; i < srcRow.size(); ++i) {
            newRow.add(srcRow.get(i));
        }
        for (i = 0; i < integerFieldIndex.size(); ++i) {
            newRow.set(integerFieldIndex.get(i), 0);
        }
        for (i = 0; i < doubleFieldIndex.size(); ++i) {
            newRow.set(doubleFieldIndex.get(i), new BigDecimal(0));
        }
        return newRow;
    }

    public static void fillAllDatePeriod(MemoryResultSet resultSet, Object[][] datas) throws SQLException {
        if (datas == null || datas.length == 0) {
            return;
        }
        ArrayList resultList = resultSet.getResultArrayList();
        if (resultList == null || resultList.size() == 0) {
            return;
        }
        MemoryResultSetMetaData metaData = resultSet.getMetaData0();
        int colType = 0;
        String colName = null;
        ArrayList<Integer> integerFieldIndex = new ArrayList<Integer>();
        ArrayList<Integer> doubleFieldIndex = new ArrayList<Integer>();
        for (int i = 0; i < metaData.getColumnCount(); ++i) {
            colType = metaData.getColumnType(i + 1);
            colName = metaData.getColumnName(i + 1);
            if (colType == 3 && colName.toLowerCase().contains("bill_")) continue;
            if (colType == 4) {
                integerFieldIndex.add(i);
                continue;
            }
            if (colType == 3 && "rn".equalsIgnoreCase(colName)) {
                integerFieldIndex.add(i);
                continue;
            }
            if (colType != 3) continue;
            doubleFieldIndex.add(i);
        }
        int idxAccountage = metaData.getNameIndex("accage");
        int idxPropertyid = metaData.getNameIndex("accageid");
        List firstRow = (List)resultList.get(0);
        List currRow = null;
        ArrayList<String> existAges = new ArrayList<String>();
        for (int i = 0; i < resultList.size(); ++i) {
            currRow = (List)resultList.get(i);
            if (existAges.contains(currRow.get(idxPropertyid).toString())) continue;
            existAges.add(currRow.get(idxPropertyid).toString());
        }
        ArrayList<Object> addRow = null;
        ArrayList addResultList = new ArrayList();
        for (Object[] data : datas) {
            int i;
            if (existAges.contains(data[0].toString())) continue;
            addRow = new ArrayList<Object>();
            for (i = 0; i < firstRow.size(); ++i) {
                addRow.add(firstRow.get(i));
            }
            for (i = 0; i < integerFieldIndex.size(); ++i) {
                addRow.set((Integer)integerFieldIndex.get(i), 0);
            }
            for (i = 0; i < doubleFieldIndex.size(); ++i) {
                addRow.set((Integer)doubleFieldIndex.get(i), new BigDecimal(0));
            }
            addRow.set(idxPropertyid, data[0]);
            addRow.set(idxAccountage, data[3]);
            addResultList.add(addRow);
        }
        resultList.addAll(0, addResultList);
    }

    public static String getTimeUnitDesc(int timeUnit) {
        String desc = null;
        switch (TimeUnit.valueOf((int)timeUnit)) {
            case DAY: {
                desc = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0591");
                break;
            }
            case MONTH: {
                desc = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0002494");
                break;
            }
            case YEAR: {
                desc = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001787");
                break;
            }
        }
        return desc;
    }

    public static String getTimeCtrlDesc(String desc, int timeUnit, Integer begin, Integer end) {
        if (StringUtils.isEmpty((CharSequence)desc)) {
            String timeUnitDesc = ArapCommonReportMethod.getTimeUnitDesc(timeUnit);
            if (begin != null && end != null) {
                desc = begin.toString() + timeUnitDesc + NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000626") + end + timeUnitDesc;
            } else if (begin != null) {
                desc = begin.toString() + timeUnitDesc + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0592");
            } else if (end != null) {
                desc = end.toString() + timeUnitDesc + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0593");
            }
        }
        return desc;
    }

    public static String convertQueryTemplateSql(String oriSql) {
        if (StringUtils.isEmpty((CharSequence)oriSql)) {
            return "";
        }
        if (oriSql.indexOf("T1.") < 0) {
            return oriSql;
        }
        return oriSql.replace("T1.", TallyAllVO.getDefaultTableName() + ".");
    }

    public static CreditVO[] convert2CreditVO(BillCreditQueryVO[] credits) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])credits)) {
            return new CreditVO[0];
        }
        IGeneralAccessor orgAccessor = GeneralAccessorFactory.getAccessor((String)"b9092cd4-2c9f-4658-8115-98a194c47d00");
        IGeneralAccessor limitTypeAccessor = GeneralAccessorFactory.getAccessor((String)"59f5489b-8f3f-4540-ac7f-2e6c9c17ec91");
        IGeneralAccessor salesOrgAccessor = GeneralAccessorFactory.getAccessor((String)"945f38b6-48ec-43e6-bb09-77ec89a3728f");
        IGeneralAccessor salesDeptAccessor = GeneralAccessorFactory.getAccessor((String)"b26fa3cb-4087-4027-a3b6-c83ab2a086a9");
        IGeneralAccessor salesPsnAccessor = GeneralAccessorFactory.getAccessor((String)"40d39c26-a2b6-4f16-a018-45664cac1a1f");
        IGeneralAccessor cusAccessor = GeneralAccessorFactory.getAccessor((String)"e4f48eaf-5567-4383-a370-a59cb3e8a451");
        CreditVO vo = null;
        MultiLangText lang = null;
        ArrayList<CreditVO> creditvos = new ArrayList<CreditVO>();
        for (BillCreditQueryVO qryvo : credits) {
            vo = new CreditVO();
            vo.setPk_org(qryvo.getPk_org());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_org())) {
                lang = orgAccessor.getDocByPk(qryvo.getPk_org()).getName();
                vo.setOrg(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setPk_climittype(qryvo.getClimittypeid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_climittype())) {
                lang = limitTypeAccessor.getDocByPk(qryvo.getClimittypeid()).getName();
                vo.setClimittype(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setNlimitmny(qryvo.getNlimitmny());
            vo.setPk_csaleorg(qryvo.getCsaleorgid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_csaleorg())) {
                lang = salesOrgAccessor.getDocByPk(qryvo.getCsaleorgid()).getName();
                vo.setCsaleorg(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setPk_cdept(qryvo.getCdeptid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_cdept())) {
                lang = salesDeptAccessor.getDocByPk(qryvo.getCdeptid()).getName();
                vo.setCdept(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setPk_cemployee(qryvo.getCemployeeid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_cemployee())) {
                lang = salesPsnAccessor.getDocByPk(qryvo.getCemployeeid()).getName();
                vo.setCemployee(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setPk_customer(qryvo.getCcustomerid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_customer())) {
                lang = cusAccessor.getDocByPk(qryvo.getCcustomerid()).getName();
                vo.setCustomer(lang.getText(lang.getCurrLangIndex()));
            }
            vo.setPk_currency(qryvo.getCorigcurrencyid());
            if (!StringUtils.isEmpty((CharSequence)vo.getPk_currency())) {
                vo.setCurrency(Currency.getCurrNameByPk((String)qryvo.getCorigcurrencyid()));
            }
            vo.setNmny(qryvo.getNmny());
            vo.setNestarmny(qryvo.getNestarmny());
            vo.setNarmny(qryvo.getNarmny());
            vo.setNnoverifymny(qryvo.getNnoverifymny());
            vo.setNengrossmny(qryvo.getNengrossmny());
            vo.setNbalancemny(qryvo.getNbalancemny());
            creditvos.add(vo);
        }
        return creditvos.toArray(new CreditVO[0]);
    }
}

