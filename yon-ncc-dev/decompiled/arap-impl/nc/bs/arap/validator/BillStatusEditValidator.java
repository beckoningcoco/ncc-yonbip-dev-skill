/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.bs.arap.validator;

import java.util.Map;
import nc.bs.arap.validator.AbstractStatusValidator;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;

public class BillStatusEditValidator
extends AbstractStatusValidator {
    @Override
    protected ValidationFailure getMessage(Integer billStatus, Integer effectstaus, Integer approvestatus) {
        if (billStatus.intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0070"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0071"));
        }
        if (effectstaus.intValue() == BillEnumCollection.InureSign.OKINURE.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0072"));
        }
        return null;
    }

    @Override
    protected ValidationFailure getMsgfromOtherSys(Integer billStatus, Integer effectstaus, Integer approvestatus, Map<String, Object> extra) {
        String top_billtype = (String)extra.get("top_billtype");
        String billtype = (String)extra.get("pk_billtype");
        if (billStatus.intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue() || effectstaus.intValue() == BillEnumCollection.InureSign.OKINURE.VALUE.intValue()) {
            String msg = "" + PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0026") + PfDataCache.getBillType((String)billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0027");
            return new ValidationFailure(msg);
        }
        return null;
    }
}

