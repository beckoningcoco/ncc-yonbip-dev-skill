/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.ArapVOUtils
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.pubitf.org.ICloseAccQryPubServicer
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nc.bs.arap.closeacc;

import java.util.Map;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.accperiod.AccountCalendar;
import nc.pubitf.org.ICloseAccQryPubServicer;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class CloseAccCtrlBO {
    public void checkIsCloseAcc(AggregatedValueObject bill) throws BusinessException {
        if (bill == null) {
            return;
        }
        BaseBillVO head = (BaseBillVO)bill.getParentVO();
        UFBoolean isinit = head.getIsinit();
        if (isinit == null) {
            isinit = UFBoolean.FALSE;
            head.setIsinit(isinit);
        }
        if (isinit.booleanValue()) {
            return;
        }
        String billtype = head.getPk_billtype();
        String pk_org = head.getPk_org();
        UFDate date = head.getBilldate();
        String moduleCode = this.getSysCodeByBillType(billtype);
        AccountCalendar calendar = AccountCalendar.getInstanceByPk_org((String)pk_org);
        calendar.setDate(date);
        String period = calendar.getMonthVO().getYearmth();
        ICloseAccQryPubServicer service = (ICloseAccQryPubServicer)NCLocator.getInstance().lookup(ICloseAccQryPubServicer.class);
        Map res = service.isCloseByModuleIdAndPk_org(moduleCode, pk_org, new String[]{period});
        if (res.get(period) != null && ((Boolean)res.get(period)).booleanValue()) {
            boolean passed = false;
            if (head.getBillstatus().intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() || head.getBillstatus().intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue() || head.getBillstatus().intValue() == BillEnumCollection.BillSatus.TEMPEORARY.VALUE.intValue() || head.getBillstatus().intValue() == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue()) {
                return;
            }
            if (head.getPrimaryKey() == null && ArapVOUtils.isOtherSystemPushBill((BaseBillVO)head, (String)((String)bill.getChildrenVO()[0].getAttributeValue("top_billtype")))) {
                try {
                    String firstNoClosePeriodByPkOrg = service.getFirstNoClosePeriodByPk_org(moduleCode, pk_org);
                    if (firstNoClosePeriodByPkOrg != null) {
                        CircularlyAccessibleValueObject[] bodys;
                        String initEnabledYear = firstNoClosePeriodByPkOrg.substring(0, 4);
                        String initEnabledMonth = firstNoClosePeriodByPkOrg.substring(5, 7);
                        AccountCalendar instanceByPkOrg = AccountCalendar.getInstanceByPk_org((String)pk_org);
                        instanceByPkOrg.set(initEnabledYear, initEnabledMonth);
                        UFDate createDate2 = instanceByPkOrg.getMonthVO().getBegindate();
                        head.setBilldate(createDate2);
                        head.setBillyear(initEnabledYear);
                        head.setBillperiod(initEnabledMonth);
                        head.setBusidate(createDate2);
                        if (createDate2.ufBefore(date)) {
                            ExceptionUtils.wrappBusinessException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0123"));
                        }
                        for (CircularlyAccessibleValueObject b : bodys = bill.getChildrenVO()) {
                            BaseItemVO b1 = (BaseItemVO)b;
                            b1.setBilldate(createDate2);
                            b1.setBusidate(createDate2);
                        }
                        passed = true;
                    }
                }
                catch (Exception e) {
                    ExceptionUtils.wrappException((Exception)e);
                }
            }
            if (!passed) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0116"));
            }
        }
    }

    private String getSysCodeByBillType(String billtype) {
        if ("F0".equals(billtype) || "F2".equals(billtype) || "23E0".equals(billtype)) {
            return "2006";
        }
        return "2008";
    }
}

