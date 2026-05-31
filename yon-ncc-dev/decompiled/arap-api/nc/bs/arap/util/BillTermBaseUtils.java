/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.bd.income.IncomeChVO
 *  nc.vo.bd.payment.PaymentChVO
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.util;

import nc.vo.arap.termitem.ArapTermDateVO;
import nc.vo.bd.income.IncomeChVO;
import nc.vo.bd.payment.PaymentChVO;
import nc.vo.pub.lang.UFDate;

public class BillTermBaseUtils {
    public static UFDate getExpiredateByTermDateVO(ArapTermDateVO termDateVO) {
        UFDate busidate = termDateVO.getPaydate();
        UFDate expiredate = null;
        if (termDateVO.isIncome()) {
            IncomeChVO payItem = termDateVO.getIncomevo();
            Integer afterdate = payItem.getEffectdateadddate() == null ? 0 : payItem.getEffectdateadddate();
            if (null != payItem.getCheckdata() && 0 <= payItem.getCheckdata()) {
                boolean nextmonth = "1".equals(payItem.getEffectmonth());
                expiredate = BillTermBaseUtils.getDate(busidate, payItem.getCheckdata(), payItem.getAccountday(), nextmonth, payItem.getEffectaddmonth(), afterdate);
            } else {
                expiredate = busidate.getDateAfter((payItem.getPaymentday() == null ? 0 : payItem.getPaymentday()) + afterdate);
            }
        } else {
            PaymentChVO paychVO = termDateVO.getPaymentvo();
            Integer afterdate = paychVO.getEffectdateadddate() == null ? 0 : paychVO.getEffectdateadddate();
            if (null != paychVO.getCheckdata() && 0 <= paychVO.getCheckdata()) {
                boolean nextmonth = "1".equals(paychVO.getEffectmonth());
                expiredate = BillTermBaseUtils.getDate(busidate, paychVO.getCheckdata(), paychVO.getAccountday(), nextmonth, paychVO.getEffectaddmonth(), afterdate);
            } else {
                expiredate = busidate.getDateAfter((paychVO.getPaymentday() == null ? 0 : paychVO.getPaymentday()) + afterdate);
            }
        }
        termDateVO.setExpiredate(expiredate);
        return expiredate;
    }

    protected static UFDate getDate(UFDate effectdate, Integer fixedDate, Integer accountDate, boolean nextMonth, Integer afterMonth, Integer afterdate) {
        int totalMonth;
        int fixedDay;
        int countMonth = 0;
        UFDate date = effectdate.getDateAfter(afterdate.intValue());
        int dayOfDate = date.getDay();
        int monthOfDate = date.getMonth();
        int yearOfDate = date.getYear();
        if (accountDate != null) {
            int accountDay = accountDate;
            if (accountDay != 0 && dayOfDate > accountDay) {
                if (monthOfDate + 1 > 12) {
                    ++yearOfDate;
                }
                if ((monthOfDate = (monthOfDate + 1) % 12) == 0) {
                    monthOfDate = 12;
                }
            }
            if (UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate) < accountDay) {
                accountDay = UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate);
            }
            dayOfDate = accountDay;
        }
        if (nextMonth) {
            ++countMonth;
        }
        if ((fixedDay = fixedDate.intValue()) == 0) {
            fixedDay = dayOfDate;
        }
        if (dayOfDate > fixedDay) {
            ++countMonth;
        }
        if (afterMonth != null) {
            countMonth += afterMonth.intValue();
        }
        if ((totalMonth = monthOfDate + countMonth) > 12) {
            yearOfDate += totalMonth / 12;
        }
        if ((monthOfDate = totalMonth % 12) == 0) {
            monthOfDate = 12;
        }
        if (UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate) < fixedDay) {
            fixedDay = UFDate.getDaysMonth((int)yearOfDate, (int)monthOfDate);
        }
        return new UFDate(yearOfDate + "-" + monthOfDate + "-" + fixedDay);
    }
}

