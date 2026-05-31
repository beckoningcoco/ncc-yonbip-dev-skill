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
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;

public class ApproveBillDateValidator
extends AbstractValidator
implements Validator {
    private static final String DONESIGN = ",";

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        StringBuffer msg = new StringBuffer();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            UFDateTime approvedate = (UFDateTime)this.getParentVO().getAttributeValue("approvedate");
            UFDate billdate = (UFDate)this.getParentVO().getAttributeValue("billdate");
            if (approvedate == null || !billdate.afterDate(approvedate.getDate())) continue;
            msg.append(this.getParentVO().getAttributeValue("billno")).append(DONESIGN);
        }
        if (msg.length() > 0) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0045") + msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0481"));
        }
        return null;
    }
}

