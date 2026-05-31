/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.validator;

import java.util.List;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;

public abstract class AbstractDateValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getParentVO()) continue;
            UFDate billdate = (UFDate)this.getHeadAttrValue("billdate");
            List<UFDate> busidate = this.getItemAttrValue("busidate");
            UFDate effectdate = (UFDate)this.getHeadAttrValue("effectdate");
            UFDateTime approvedate = (UFDateTime)this.getHeadAttrValue("approvedate");
            return this.getMessage(billdate, busidate, effectdate, approvedate);
        }
        return null;
    }

    protected abstract ValidationFailure getMessage(UFDate var1, List<UFDate> var2, UFDate var3, UFDateTime var4);
}

