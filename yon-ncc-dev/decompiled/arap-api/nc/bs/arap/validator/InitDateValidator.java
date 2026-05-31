/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.validator;

import java.util.List;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractDateValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;

public class InitDateValidator
extends AbstractDateValidator {
    @Override
    protected ValidationFailure getMessage(UFDate billdate, List<UFDate> busidate, UFDate effectdate, UFDateTime approvedate) {
        try {
            UFDate period = ArapBillPubUtil.getOrgModuleperiodDate(ArapBillPubUtil.isARSysBilltype((String)this.getHeadAttrValue("pk_billtype")), (String)this.getHeadAttrValue("pk_org"));
            if (!billdate.ufBefore(period)) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0513"));
            }
            if (effectdate != null && !effectdate.ufBefore(period)) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0515"));
            }
            if (approvedate != null && !approvedate.getDate().ufBefore(period)) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0516"));
            }
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0517"));
        }
        return null;
    }
}

