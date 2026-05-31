/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.bs.arap.validator;

import java.util.Map;
import nc.bs.arap.validator.AbstractStatusValidator;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class BillStatusUnApproveValidator
extends AbstractStatusValidator {
    @Override
    protected ValidationFailure getMessage(Integer billStatus, Integer effectstaus, Integer approvestatus) {
        if (billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0505"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.TEMPEORARY.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0506"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.HANGUP.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0507"));
        }
        ValidationFailure failure = null;
        CircularlyAccessibleValueObject parentVO = this.getObj().getParentVO();
        Object attributeValue = parentVO.getAttributeValue("isqr");
        if (attributeValue != null && ((Boolean)attributeValue).booleanValue()) {
            failure = new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0307"));
        }
        return failure;
    }

    @Override
    protected ValidationFailure getMsgfromOtherSys(Integer billStatus, Integer effectstaus, Integer approvestatus, Map<String, Object> extra) {
        String top_billtype = (String)extra.get("top_billtype");
        String billtype = (String)extra.get("pk_billtype");
        if (billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.TEMPEORARY.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.HANGUP.VALUE.intValue()) {
            String msg = "" + PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0026") + PfDataCache.getBillType((String)billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0027");
            return new ValidationFailure(msg);
        }
        return null;
    }
}

