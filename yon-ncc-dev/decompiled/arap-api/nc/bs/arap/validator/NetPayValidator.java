/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import java.util.HashSet;
import java.util.Set;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.StringUtils;

public class NetPayValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        HashSet<BillEnumCollection.PayStatus> payStatus = new HashSet<BillEnumCollection.PayStatus>();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            String msg = null;
            UFBoolean isfromindependent = (UFBoolean)aggvo.getParentVO().getAttributeValue("isfromindependent");
            for (CircularlyAccessibleValueObject item : aggvo.getChildrenVO()) {
                BaseItemVO itemVO = (BaseItemVO)item;
                if (isfromindependent != null && !isfromindependent.booleanValue() && BillEnumCollection.PayStatus.PAYFINISH.VALUE.equals(itemVO.getPayflag())) {
                    payStatus.add(BillEnumCollection.PayStatus.PAYFINISH);
                } else if (BillEnumCollection.PayStatus.PAYING.VALUE.equals(itemVO.getPayflag())) {
                    payStatus.add(BillEnumCollection.PayStatus.PAYING);
                } else if (BillEnumCollection.PayStatus.PAYFAIL.VALUE.equals(itemVO.getPayflag())) {
                    payStatus.add(BillEnumCollection.PayStatus.PAYFAIL);
                } else if (BillEnumCollection.PayStatus.SOMEPAYFINISH.VALUE.equals(itemVO.getPayflag())) {
                    payStatus.add(BillEnumCollection.PayStatus.SOMEPAYFINISH);
                }
                if (!"36J3".equals(itemVO.getTop_billtype()) && !"36S3".equals(itemVO.getTop_billtype()) && !"36S3".equals(itemVO.getSrc_billtype())) continue;
                return null;
            }
            if (payStatus.size() == 1) {
                if (!payStatus.contains((Object)BillEnumCollection.PayStatus.PAYFAIL) && payStatus.contains((Object)BillEnumCollection.PayStatus.PAYFINISH)) {
                    msg = this.getMsg(payStatus, msg);
                }
            } else {
                msg = this.getMsg(payStatus, msg);
            }
            if (StringUtils.isNotEmpty((CharSequence)msg)) {
                return new ValidationFailure(msg + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0375"));
            }
            payStatus.clear();
        }
        return null;
    }

    private String getMsg(Set<BillEnumCollection.PayStatus> payStatus, String msg) {
        if (payStatus.contains((Object)BillEnumCollection.PayStatus.PAYFAIL)) {
            msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UCMP00-V55-03");
        } else if (payStatus.contains((Object)BillEnumCollection.PayStatus.PAYFINISH)) {
            msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0309");
        } else if (payStatus.contains((Object)BillEnumCollection.PayStatus.PAYING)) {
            msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UCMP00-V55-02");
        } else if (payStatus.contains((Object)BillEnumCollection.PayStatus.SOMEPAYFINISH)) {
            msg = NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UCMP00-V55-04");
        }
        return msg;
    }
}

