/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.AccperiodAccessor
 *  nc.bd.accperiod.AccperiodParamAccessor
 *  nc.bd.accperiod.AccperiodmonthAccessor
 *  nc.vo.bd.period.AccperiodVO
 *  nc.vo.bd.period2.AccperiodmonthVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import nc.bd.accperiod.AccperiodAccessor;
import nc.bd.accperiod.AccperiodParamAccessor;
import nc.bd.accperiod.AccperiodmonthAccessor;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.bd.period.AccperiodVO;
import nc.vo.bd.period2.AccperiodmonthVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nccloud.commons.lang.ArrayUtils;

public final class BillAccountCalendarUtils {
    public static void setAccperiodYearMonth(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        String pk_org = null;
        UFDate currDate = null;
        AccperiodVO yearVO = null;
        AccperiodmonthVO monthVO = null;
        String billPeriod = null;
        String billYear = null;
        for (AggregatedValueObject bill : bills) {
            Integer value;
            int previous;
            Object isInitObj;
            boolean isInit;
            pk_org = (String)bill.getParentVO().getAttributeValue("pk_org");
            currDate = (UFDate)bill.getParentVO().getAttributeValue("billdate");
            if (currDate == null) {
                currDate = new UFDate();
            }
            boolean bl = isInit = (isInitObj = bill.getParentVO().getAttributeValue("isinit")) != null && ((UFBoolean)isInitObj).booleanValue();
            if (isInit) {
                String pk_billtype = (String)bill.getParentVO().getAttributeValue("pk_billtype");
                boolean isAr = ArapBillPubUtil.isARSysBilltype(pk_billtype);
                currDate = ArapBillPubUtil.getOrgModuleperiodDate(isAr, pk_org);
            }
            if (currDate != null) {
                yearVO = BillAccountCalendarUtils.getYearVO(pk_org, currDate);
                monthVO = BillAccountCalendarUtils.getMonthVO(pk_org, currDate);
            }
            if (null == yearVO || null == monthVO) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0578"));
            }
            billPeriod = isInit ? (String.valueOf(previous = (value = Integer.valueOf(monthVO.getAccperiodmth().trim())) - 1).length() == monthVO.getAccperiodmth().trim().length() ? String.valueOf(previous) : "0" + String.valueOf(previous)) : monthVO.getAccperiodmth().trim();
            billYear = yearVO.getPeriodyear();
            BaseBillVO parentVO = (BaseBillVO)bill.getParentVO();
            parentVO.setBillperiod(billPeriod);
            parentVO.setBillyear(billYear);
        }
    }

    public static AccperiodVO getYearVO(String pk_org, UFDate currDate) throws BusinessException {
        return AccperiodAccessor.getInstance().queryAccperiodVOByPk(BillAccountCalendarUtils.getMonthVO(pk_org, currDate).getPk_accperiod());
    }

    public static AccperiodmonthVO getMonthVO(String pk_org, UFDate currDate) throws BusinessException {
        AccperiodmonthVO vo = AccperiodmonthAccessor.getInstance().queryAccperiodmonthVOByDate(AccperiodParamAccessor.getInstance().getAccperiodschemePkByPk_org(pk_org), currDate);
        if (vo == null) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0579"));
        }
        return vo;
    }
}

