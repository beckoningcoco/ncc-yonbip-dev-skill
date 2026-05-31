/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.exception.CarrierRuntimeException
 */
package nc.bs.arap.validator;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.exception.CarrierRuntimeException;

public class BillDateValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ValidationFailure valida = null;
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getParentVO()) continue;
            UFDate billDate = (UFDate)this.getHeadAttrValue("billdate");
            if (null == billDate) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0118"));
            }
            String syscode = this.getModuleCode((Integer)this.getHeadAttrValue("syscode"));
            UFDate calendar = null;
            try {
                calendar = this.getHeadAttrValue("isinit") != null && ((UFBoolean)this.getHeadAttrValue("isinit")).booleanValue() ? ArapBillPubUtil.getArapCreateDate(syscode.equals("2006"), (String)this.getHeadAttrValue("pk_org")) : ArapBillPubUtil.getOrgModuleperiodDate(syscode.equals("2006"), (String)this.getHeadAttrValue("pk_org"));
            }
            catch (CarrierRuntimeException e) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0487"));
            }
            if (null == calendar) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0487"));
            }
            if (this.getHeadAttrValue("isinit") != null && ((UFBoolean)this.getHeadAttrValue("isinit")).booleanValue()) {
                if (!billDate.ufAfter(calendar)) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0488"));
            }
            if (billDate.ufAfter(calendar) || billDate.isSameDate(calendar)) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0489"));
        }
        return valida;
    }
}

