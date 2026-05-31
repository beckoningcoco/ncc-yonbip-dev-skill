/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.StringUtils;

public class CommissionPayValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            for (BaseItemVO item : ((BaseAggVO)aggvo).getItems()) {
                Integer commpaytype = item.getCommpaytype();
                String refuse_reason = item.getRefuse_reason();
                if (commpaytype == null) continue;
                if ((BillEnumCollection.CommissionPayType.REFUSECOMMPAY.VALUE.equals(commpaytype) || BillEnumCollection.CommissionPayType.COMMPAYPARTLY.VALUE.equals(commpaytype)) && StringUtils.isEmpty((CharSequence)refuse_reason)) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0308"));
                }
                if (item.getMoney_de().compareTo((Object)UFDouble.ZERO_DBL) < 0) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0030"));
                }
                if (BillEnumCollection.CommissionPayType.COMMPAYALL.VALUE.equals(commpaytype) && item.getMoney_de().compareTo((Object)item.getAgentreceiveprimal()) != 0) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0031"));
                }
                if (!BillEnumCollection.CommissionPayType.COMMPAYPARTLY.VALUE.equals(commpaytype) || item.getMoney_de().compareTo((Object)item.getAgentreceiveprimal()) <= 0) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0032"));
            }
        }
        return null;
    }
}

