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
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;

public class BillRefundValidator
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
            String billtype = (String)this.getHeadAttrValue("pk_billtype");
            UFBoolean isrefund = (UFBoolean)this.getHeadAttrValue("isrefund");
            boolean isauto = this.getHeadAttrValue("isAuto") == null ? Boolean.valueOf(false) : this.getHeadAttrValue("isAuto");
            if (isrefund == null || !isrefund.booleanValue() || !"F0".equals(billtype) && (!"F1".equals(billtype) || isauto) && (!"F2".equals(billtype) || isauto)) continue;
            valida = new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0974"));
        }
        return valida;
    }
}

