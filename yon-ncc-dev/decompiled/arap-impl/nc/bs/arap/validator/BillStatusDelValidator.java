/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.pf.pub.PfDataCache
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractStatusValidator;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class BillStatusDelValidator
extends AbstractStatusValidator {
    private static final long serialVersionUID = 1L;
    private String billno = null;

    @Override
    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ValidationFailure msg = null;
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            ValidationFailure message;
            String top_billtype;
            this.setObj(aggvo);
            this.billno = (String)aggvo.getParentVO().getAttributeValue("billno");
            CircularlyAccessibleValueObject parentVO = this.getParentVO();
            if (null == this.getParentVO()) continue;
            Integer billstatus = (Integer)parentVO.getAttributeValue("billstatus");
            Integer effectstaus = (Integer)parentVO.getAttributeValue("effectstatus");
            Integer approvestatus = (Integer)parentVO.getAttributeValue("approvestatus");
            approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
            String billtype = (String)aggvo.getParentVO().getAttributeValue("pk_billtype");
            String string = top_billtype = ArrayUtils.isEmpty((Object[])aggvo.getChildrenVO()) ? null : (String)aggvo.getChildrenVO()[0].getAttributeValue("top_billtype");
            if (ArapBillPubUtil.isFromArap((BaseBillVO)this.getParentVO(), (BaseItemVO)aggvo.getChildrenVO()[0])) {
                if (null != effectstaus && (message = this.getMessage(billstatus, effectstaus == null ? Integer.valueOf(-1) : effectstaus, approvestatus)) != null) {
                    msg = message;
                }
            } else if (StringUtils.isNotEmpty((CharSequence)top_billtype) && null != effectstaus) {
                HashMap<String, Object> extra = new HashMap<String, Object>();
                extra.put("top_billtype", top_billtype);
                extra.put("pk_billtype", billtype);
                ValidationFailure message2 = this.getMsgfromOtherSys(billstatus, effectstaus == null ? Integer.valueOf(-1) : effectstaus, approvestatus, extra);
                if (message2 != null) {
                    msg = message2;
                }
            }
            if (((UFBoolean)parentVO.getAttributeValue("isinit")).booleanValue()) continue;
            message = null;
            message = this.getMessage(billstatus, null, approvestatus);
            if (message == null) continue;
            msg = message;
        }
        return msg;
    }

    @Override
    protected ValidationFailure getMessage(Integer billStatus, Integer effectstaus, Integer approvestatus) {
        String message;
        String string = message = this.billno == null ? " " : NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1245") + this.billno;
        if (billStatus.intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue()) {
            return new ValidationFailure(message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0499"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue()) {
            return new ValidationFailure(message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0500"));
        }
        if (billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue()) {
            return new ValidationFailure(message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0501"));
        }
        if (approvestatus.intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
            return new ValidationFailure(message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0754"));
        }
        return null;
    }

    @Override
    protected ValidationFailure getMsgfromOtherSys(Integer billStatus, Integer effectstaus, Integer approvestatus, Map<String, Object> extra) {
        String top_billtype = (String)extra.get("top_billtype");
        String billtype = (String)extra.get("pk_billtype");
        if (billStatus.intValue() == BillEnumCollection.BillSatus.AUDIT.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.SIGN.VALUE.intValue() || billStatus.intValue() == BillEnumCollection.BillSatus.CLOSING.VALUE.intValue() || approvestatus.intValue() == BillEnumCollection.ApproveStatus.GOINGON.VALUE.intValue() || approvestatus.intValue() == BillEnumCollection.ApproveStatus.PASSING.VALUE.intValue()) {
            String msg = "" + PfDataCache.getBillType((String)top_billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0026") + PfDataCache.getBillType((String)billtype).getBilltypenameOfCurrLang() + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0027");
            return new ValidationFailure(msg);
        }
        return null;
    }
}

