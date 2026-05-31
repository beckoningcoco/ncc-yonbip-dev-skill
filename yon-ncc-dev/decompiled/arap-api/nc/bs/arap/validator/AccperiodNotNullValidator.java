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
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;

public class AccperiodNotNullValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        AggregatedValueObject[] bills = (AggregatedValueObject[])obj;
        StringBuffer sb = new StringBuffer();
        for (AggregatedValueObject bill : bills) {
            BaseBillVO parentVO = (BaseBillVO)bill.getParentVO();
            if (null != parentVO.getBillperiod() && null != parentVO.getBillyear()) continue;
            sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0478", null, new String[]{parentVO.getPk_org(), parentVO.getBilldate().toString()}));
            break;
        }
        if (sb.length() > 0) {
            return new ValidationFailure(sb.toString());
        }
        return null;
    }
}

