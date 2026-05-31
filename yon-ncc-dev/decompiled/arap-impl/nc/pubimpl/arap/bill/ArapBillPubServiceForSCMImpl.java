/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.pubitf.arap.bill.IArapBillPubServiceForSCM
 *  nc.vo.arap.basebill.PeriodpaymentParaVO
 *  nc.vo.arap.basebill.PeriodpaymentReturnVO
 *  nc.vo.arap.basebill.ReCaculateARParaVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.StringUtils
 */
package nc.pubimpl.arap.bill;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.pubitf.arap.bill.IArapBillPubServiceForSCM;
import nc.vo.arap.basebill.PeriodpaymentParaVO;
import nc.vo.arap.basebill.PeriodpaymentReturnVO;
import nc.vo.arap.basebill.ReCaculateARParaVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.StringUtils;

public class ArapBillPubServiceForSCMImpl
implements IArapBillPubServiceForSCM {
    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheck(PeriodpaymentParaVO[] paras) throws BusinessException {
        return ArapBillDAO.getInstance().getMoneyForPeriodpaymentCheck(paras);
    }

    public int reCaculateAr(String srctable, ReCaculateARParaVO vo, String intotable) throws BusinessException {
        try {
            if (null == vo) {
                vo = ReCaculateARParaVO.getInstance();
            }
            int count = ArapBillDAO.getInstance().doReCaculate(srctable, vo, intotable);
            return count;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public UFDouble queryConsignorLocalMoneyBalforGather(String pk_org, String consignor, String supplier, String project, String contract) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)pk_org) || StringUtils.isEmpty((CharSequence)consignor)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0870"));
        }
        String gartherSql = "select sum(local_money_cr) local_money_cr from ar_gatheritem where pk_org = '" + pk_org + "' and customer = '" + consignor + "'";
        String commonSql = "and rowtype = '22' and material = '~'";
        if (!StringUtils.isEmpty((CharSequence)project)) {
            gartherSql = gartherSql + " and project = '" + project + "'";
        }
        if (!StringUtils.isEmpty((CharSequence)contract)) {
            gartherSql = gartherSql + " and contractno = '" + contract + "'";
        }
        gartherSql = gartherSql + commonSql + " and pk_gatherbill in (select pk_gatherbill from ar_gatherbill where effectstatus = 10 and dr = 0)";
        UFDouble returnbal = (UFDouble)new BaseDAO().executeQuery(gartherSql, new ResultSetProcessor(){

            public UFDouble handleResultSet(ResultSet rs) throws SQLException {
                UFDouble sum = UFDouble.ZERO_DBL;
                while (rs.next()) {
                    BigDecimal bigDecimal = rs.getBigDecimal("local_money_cr");
                    if (bigDecimal == null) continue;
                    sum = new UFDouble(bigDecimal);
                }
                return sum;
            }
        });
        return returnbal;
    }

    public Map<String, UFDouble> queryConsignorMoneyBalforPay(String pk_org, String consignor, String supplier, String project, String contract) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)pk_org)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0870"));
        }
        String paySql = "select sum(local_money_de) local_money_de , sum(money_de) money_de from ap_payitem where    pk_org = '" + pk_org + "'";
        String commonSql = "and rowtype = '22' and material = '~'";
        if (!StringUtils.isEmpty((CharSequence)supplier)) {
            paySql = paySql + " and supplier = '" + supplier + "'";
        }
        if (!StringUtils.isEmpty((CharSequence)project)) {
            paySql = paySql + " and project = '" + project + "'";
        }
        if (!StringUtils.isEmpty((CharSequence)contract)) {
            paySql = paySql + " and contractno = '" + contract + "'";
        }
        paySql = paySql + commonSql + " and pk_paybill in (select pk_paybill from ap_paybill where billstatus != -99 and dr = 0)";
        Map returnbal = (Map)new BaseDAO().executeQuery(paySql, new ResultSetProcessor(){
            private Map<String, UFDouble> balmap = new HashMap<String, UFDouble>();

            public Map<String, UFDouble> handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    BigDecimal local = rs.getBigDecimal("local_money_de");
                    BigDecimal money_de = rs.getBigDecimal("money_de");
                    if (local != null) {
                        this.balmap.put("local_money_de", new UFDouble(local));
                    } else {
                        this.balmap.put("local_money_de", new UFDouble(0));
                    }
                    if (money_de != null) {
                        this.balmap.put("money_de", new UFDouble(money_de));
                        continue;
                    }
                    this.balmap.put("money_de", new UFDouble(0));
                }
                return this.balmap;
            }
        });
        return returnbal;
    }

    public int reCaculateArByDetail(String srctable, ReCaculateARParaVO vo, String intotable) throws BusinessException {
        try {
            if (null == vo) {
                vo = ReCaculateARParaVO.getInstance();
            }
            int count = ArapBillDAO.getInstance().doReCaculateByDetail(srctable, vo, intotable);
            return count;
        }
        catch (Exception e) {
            throw ExceptionHandler.handleException((Exception)e);
        }
    }

    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheckAll(PeriodpaymentParaVO[] paras) throws BusinessException {
        return ArapBillDAO.getInstance().getMoneyForPeriodpaymentCheckAll(paras);
    }
}

