/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;

public class ObjectTypeValidator
extends AbstractValidator
implements Validator {
    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            int i = 0;
            String temp = null;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                Integer objType = (Integer)this.dealItemAttrValue(vo, "objtype");
                String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0088", null, new String[]{String.valueOf(i + 1)});
                if (null == objType || objType.equals(-1)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0089"));
                }
                temp = (String)this.dealItemAttrValue(vo, "customer");
                if (objType.equals(0) && StringUtil.isEmptyWithTrim((String)temp)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0090"));
                }
                temp = (String)this.dealItemAttrValue(vo, "supplier");
                if (objType.equals(1) && StringUtil.isEmptyWithTrim((String)temp)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0091"));
                }
                temp = (String)this.dealItemAttrValue(vo, "checktype");
                String checkNO = (String)this.dealItemAttrValue(vo, "checkno");
                if (!StringUtil.isEmptyWithTrim((String)temp) && StringUtil.isEmptyWithTrim((String)checkNO)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0130"));
                }
                temp = (String)this.dealItemAttrValue(vo, "pk_deptid");
                if (objType.equals(2) && StringUtil.isEmptyWithTrim((String)temp)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0092"));
                }
                temp = (String)this.dealItemAttrValue(vo, "pk_psndoc");
                if (objType.equals(3) && StringUtil.isEmptyWithTrim((String)temp)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0093"));
                }
                temp = (String)this.dealItemAttrValue(vo, "freecust");
                if (objType.equals(4) && StringUtil.isEmptyWithTrim((String)temp)) {
                    return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0094"));
                }
                ++i;
            }
        }
        return null;
    }

    public Object dealHeadAttrValue(String fieldCode) {
        if (null != this.getHeadAttrValue(fieldCode)) {
            return this.getHeadAttrValue(fieldCode);
        }
        return null;
    }

    public Object dealItemAttrValue(CircularlyAccessibleValueObject vo, String fieldCode) {
        if (null != this.getItemAttrValue(vo, fieldCode)) {
            return this.getItemAttrValue(vo, fieldCode);
        }
        return null;
    }
}

