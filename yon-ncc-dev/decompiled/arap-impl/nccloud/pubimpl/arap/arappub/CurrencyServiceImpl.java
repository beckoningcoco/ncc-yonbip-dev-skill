/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapVOUtils
 *  nc.itf.fi.pub.Currency
 *  nc.vo.bd.currinfo.CurrinfoVO
 *  nc.vo.bd.currtype.CurrtypeVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.List;
import java.util.Map;
import nc.bs.arap.util.ArapVOUtils;
import nc.itf.fi.pub.Currency;
import nc.vo.bd.currinfo.CurrinfoVO;
import nc.vo.bd.currtype.CurrtypeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.pubitf.arap.arappub.ICurrencyService;

public class CurrencyServiceImpl
implements ICurrencyService {
    public String getOrgLocalCurrPK(String pk_org) throws BusinessException {
        return Currency.getOrgLocalCurrPK((String)pk_org);
    }

    public String getGroupLocalCurrPK(String pk_group) throws BusinessException {
        return Currency.getGroupLocalCurrPK((String)pk_group);
    }

    public String getGlobalCurrPk(String pk_group) throws BusinessException {
        return Currency.getGlobalCurrPk((String)pk_group);
    }

    public String getLocalCurrPK(String pk_org) throws BusinessException {
        return Currency.getLocalCurrPK((String)pk_org);
    }

    public CurrtypeVO getCurrtypeByPk(String pk_currency) {
        return Currency.getCurrtypeByPk((String)pk_currency);
    }

    public UFDouble getAmountByOpp(String pk_corp, String pk_currtype, String oppcurrtype, UFDouble amount, UFDouble newrate, UFDate date) throws BusinessException {
        return Currency.getAmountByOpp((String)pk_corp, (String)pk_currtype, (String)oppcurrtype, (UFDouble)amount, (UFDouble)newrate, (UFDate)date);
    }

    public UFDouble getRate(String pk_org, String src_currtype, String pk_currtype, UFDate date, int rateType) throws BusinessException {
        return Currency.getRate((String)pk_org, (String)src_currtype, (String)pk_currtype, (UFDate)date, (int)rateType);
    }

    public CurrinfoVO getCurrRateInfo(String pk_corp, String pk_currtype, String oppCurrtype) throws BusinessException {
        return Currency.getCurrRateInfo((String)pk_corp, (String)pk_currtype, (String)oppCurrtype);
    }

    public int getCurrDigit(String pk_currtype) {
        return Currency.getCurrDigit((String)pk_currtype);
    }

    public int[] getCurrDigitAndRoundtype(String pk_currtype) {
        return Currency.getCurrDigitAndRoundtype((String)pk_currtype);
    }

    public CurrtypeVO[] getCurrtypeByPks(String[] pk_currencys) {
        if (pk_currencys == null || pk_currencys.length == 0) {
            return null;
        }
        CurrtypeVO[] vos = new CurrtypeVO[pk_currencys.length];
        for (int i = 0; i < pk_currencys.length; ++i) {
            vos[i] = Currency.getCurrtypeByPk((String)pk_currencys[i]);
        }
        return vos;
    }

    public Map<String, Integer> getDecimalFromSource(List<String> pks) {
        return ArapVOUtils.getDecimalFromSource(pks);
    }
}

