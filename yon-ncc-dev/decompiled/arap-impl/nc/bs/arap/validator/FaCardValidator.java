/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;

public class FaCardValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (ArrayUtils.isEmpty((Object[])this.getChildrenVO()) || this.getChildrenVO().length == 1) continue;
            BaseItemVO[] bodyVOs = (BaseItemVO[])this.getChildrenVO();
            ArrayList<String> list = new ArrayList<String>();
            String facard = bodyVOs[0].getFacard();
            for (int i = 0; i < bodyVOs.length; ++i) {
                BaseItemVO baseItemVO = bodyVOs[i];
                String tempfacard = baseItemVO.getFacard();
                if (facard == null) {
                    if (tempfacard == null) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2008pay_0", "02008pay-0026"));
                }
                if (tempfacard == null) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2008pay_0", "02008pay-0026"));
                }
                if (list.contains(tempfacard)) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2008pay_0", "02008pay-0025"));
                }
                list.add(tempfacard);
            }
        }
        return null;
    }
}

