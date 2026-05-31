/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import org.apache.commons.lang3.ArrayUtils;

public class EbankDirectValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        AggregatedValueObject[] aggVOs = (AggregatedValueObject[])obj;
        Object[] childrenVO = aggVOs[0].getChildrenVO();
        if (ArrayUtils.isEmpty((Object[])childrenVO)) {
            return null;
        }
        String pk_balatype = "0001Z0100000000000Y2";
        String errormsg = null;
        int rownum = 1;
        ArrayList<String> errorList = new ArrayList<String>();
        for (Object vo : childrenVO) {
            if (pk_balatype.equals(vo.getAttributeValue("pk_balatype")) && ((UFBoolean)vo.getAttributeValue("direct_checkno")).booleanValue()) {
                String row = rownum + "";
                errorList.add(row);
            }
            ++rownum;
        }
        if (errorList.size() > 0) {
            String errorrownum = String.join((CharSequence)",", errorList);
            errormsg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1231") + errorrownum + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1230");
            return new ValidationFailure(errormsg);
        }
        return null;
    }
}

