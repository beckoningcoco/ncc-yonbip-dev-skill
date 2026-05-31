/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.termend;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public class TermEndCtrlBO {
    public void checkIsCloseAcc(AggregatedValueObject bill) throws BusinessException {
        if (bill == null) {
            return;
        }
        BaseBillVO head = (BaseBillVO)bill.getParentVO();
        if (head.getIsinit().booleanValue()) {
            return;
        }
        String billtype = head.getPk_billtype();
        String pk_org = head.getPk_org();
        UFDate date = null;
        if (head.getApprovedate() != null) {
            date = head.getApprovedate().getDate();
        } else if (head.getApprovedate_bak() != null) {
            date = head.getApprovedate_bak().getDate();
        }
        if (date == null) {
            date = head.getBilldate();
        }
        String moduleCode = this.getSysCodeByBillType(billtype);
        AccountCalendar ac = AccountCalendar.getInstanceByPk_org((String)pk_org);
        ac.setDate(date);
        String year = ac.getYearVO().getPeriodyear();
        String month = ac.getMonthVO().getAccperiodmth();
        boolean res = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).isAccountClosed(moduleCode, pk_org, year, month);
        if (!res) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0322"));
        }
    }

    private String getSysCodeByBillType(String billtype) {
        if ("F0".equals(billtype) || "F2".equals(billtype)) {
            return "2006";
        }
        return "2008";
    }
}

