/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.para.SysInitQuery
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.para.SysInitQuery;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;

public class DeleteOtherBillValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (this.checkObj(obj).booleanValue()) {
            for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
                this.setObj(aggvo);
                if (null == this.getHeadAttrValue("coordflag") || !this.getHeadAttrValue("coordflag").equals(BillEnumCollection.BillCooperate.SURE.VALUE)) continue;
                Integer syscode = (Integer)this.getHeadAttrValue("syscode");
                if (syscode == null) {
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000814") + this.getHeadAttrValue("billno") + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0301"));
                }
                try {
                    UFBoolean isDelete = SysInitQuery.getParaBoolean((String)((String)this.getHeadAttrValue("pk_org")), (String)(syscode.equals(BillEnumCollection.FromSystem.AR.VALUE) ? "AR20" : SysinitConst.AP20));
                    if (null == isDelete || !isDelete.booleanValue()) continue;
                    throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0000814") + this.getHeadAttrValue("billno") + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0511"));
                }
                catch (BusinessException e) {
                    throw new BusinessRuntimeException(e.getMessage());
                }
            }
        }
        return null;
    }
}

