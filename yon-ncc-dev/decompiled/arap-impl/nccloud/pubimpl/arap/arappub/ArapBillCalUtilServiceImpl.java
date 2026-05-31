/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillCalUtil
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.pubitf.arap.arappub.IArapBillCalUtilService
 */
package nccloud.pubimpl.arap.arappub;

import nc.bs.arap.bill.ArapBillCalUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.pubitf.arap.arappub.IArapBillCalUtilService;

public class ArapBillCalUtilServiceImpl
implements IArapBillCalUtilService {
    public UFDouble[] getRate(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype) {
        UFDouble[] rate = ArapBillCalUtil.getRate((String)pk_currtype, (String)pk_org, (String)pk_group, (UFDate)date, (String)pk_billtype);
        return rate;
    }

    public UFDouble getOrgRate(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        return ArapBillCalUtil.getOrgRate((String)pk_currtype, (String)pk_group, (String)pk_org, (UFDate)date, (String)pk_billtype);
    }

    public int[] getRateDigits(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype) {
        return ArapBillCalUtil.getRateDigits((String)pk_currtype, (String)pk_org, (String)pk_group, (UFDate)date, (String)pk_billtype);
    }

    public boolean isUseGroupMoney(String pk_group) {
        return ArapBillCalUtil.isUseGroupMoney((String)pk_group);
    }

    public boolean isUseGlobalMoney() {
        return ArapBillCalUtil.isUseGlobalMoney();
    }

    public boolean isOrigCurToGlobalMoney() {
        return ArapBillCalUtil.isOrigCurToGlobalMoney();
    }

    public boolean isOrigCurToGroupMoney(String pk_group) {
        return ArapBillCalUtil.isOrigCurToGroupMoney((String)pk_group);
    }

    public int getRateType(String pk_billtype, String pk_group) throws BusinessException {
        return ArapBillCalUtil.getRateType((String)pk_billtype, (String)pk_group);
    }

    public UFDouble[] getRate(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype, String pk_rateType, Integer object, String[] cusp) {
        return ArapBillCalUtil.getRate((String)pk_currtype, (String)pk_org, (String)pk_group, (UFDate)date, (String)pk_billtype, (String)pk_rateType, (Integer)object, (String[])cusp);
    }
}

