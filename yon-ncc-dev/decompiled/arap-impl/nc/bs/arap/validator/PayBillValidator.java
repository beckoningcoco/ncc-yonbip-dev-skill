/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.pubitf.arap.payable.IArapPayableBillPubServiceForPS
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.scmpub.res.billtype.CTBillType
 *  nc.vo.scmpub.res.billtype.POBillType
 */
package nc.bs.arap.validator;

import java.util.HashSet;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.pubitf.arap.payable.IArapPayableBillPubServiceForPS;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.scmpub.res.billtype.CTBillType;
import nc.vo.scmpub.res.billtype.POBillType;

public class PayBillValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        HashSet<String> topbillids = new HashSet<String>();
        String topbilltype = null;
        String srcbilltype = null;
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            for (CircularlyAccessibleValueObject item : aggvo.getChildrenVO()) {
                topbilltype = (String)item.getAttributeValue("top_billtype");
                srcbilltype = (String)item.getAttributeValue("src_billtype");
                if (!POBillType.Order.getCode().equals(topbilltype) && !CTBillType.PurDaily.getCode().equals(topbilltype) && (!"F1".equals(topbilltype) || "FCT1".equals(srcbilltype))) continue;
                topbillids.add((String)item.getAttributeValue("top_billid"));
            }
        }
        if (topbillids.size() > 0) {
            return ((IArapPayableBillPubServiceForPS)NCLocator.getInstance().lookup(IArapPayableBillPubServiceForPS.class)).checkNextBillFromContract(topbillids.toArray(new String[0]));
        }
        return null;
    }
}

