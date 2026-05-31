/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;

public class BillStatusCommitValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            BaseBillVO parent = (BaseBillVO)aggvo.getParentVO();
            BaseItemVO[] items = (BaseItemVO[])aggvo.getChildrenVO();
            if (null != this.getParentVO()) {
                Integer billStatus = (Integer)this.getHeadAttrValue("billstatus");
                Integer approvestatus = (Integer)this.getHeadAttrValue("approvestatus");
                Integer n = approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
                if (billStatus.intValue() == ARAPBillStatus.TEMPSAVE.VALUE.intValue()) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0691"));
                }
                if (billStatus.intValue() == ARAPBillStatus.AUDIT.VALUE.intValue() || billStatus.intValue() == ARAPBillStatus.SIGN.VALUE.intValue()) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0692"));
                }
                if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0693"));
                }
            }
            if (parent.getIsforce() == null || !parent.getIsforce().booleanValue() || !BillEnumCollection.CommissionPayType.COMMPAYALL.VALUE.equals(items[0].getCommpaytype()) && items[0].getCommpaytype() != null || BillEnumCollection.CommissionPayStatus.COMMISSIONPAYING.VALUE.equals(items[0].getCommpaystatus())) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0761"));
        }
        return null;
    }
}

