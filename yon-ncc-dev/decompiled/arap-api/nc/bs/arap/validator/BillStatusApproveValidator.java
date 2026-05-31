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

public class BillStatusApproveValidator
extends AbstractStatusValidator {
    private static final long serialVersionUID = 1L;

    @Override
    protected ValidationFailure getMessage(Integer billStatus, Integer effectstatus, Integer approvestatus) {
        if (billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0493"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0494"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.TEMPEORARY.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0495"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.HANGUP.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0496"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue()) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0497"));
        }
        if (effectstatus == BillEnumCollection.InureSign.OKINURE.VALUE) {
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0498") + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0888"));
        }
        return null;
    }

    @Override
    protected ValidationFailure getMsgfromOtherSys(Integer billStatus, Integer effectstaus, Integer approvestatus, Map<String, Object> extra) {
        String top_billtype = (String)extra.get("top_billtype");
        String billtype = (String)extra.get("pk_billtype");
        if (billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.TEMPEORARY.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.HANGUP.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue() || effectstaus == BillEnumCollection.InureSign.OKINURE.VALUE) {
            String msg = "" + PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0026") + PfDataCache.getBillType((String)billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0027");
            return new ValidationFailure(msg);
        }
        return null;
    }
}

