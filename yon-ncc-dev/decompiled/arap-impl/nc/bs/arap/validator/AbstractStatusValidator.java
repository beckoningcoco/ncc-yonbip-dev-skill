/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.validator;

import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public abstract class AbstractStatusValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            String top_billtype;
            this.setObj(aggvo);
            if (null == this.getParentVO()) continue;
            Object billstatus = this.getHeadAttrValue("billstatus");
            Object effectstaus = this.getHeadAttrValue("effectstatus");
            Object approvestatus = this.getHeadAttrValue("approvestatus");
            approvestatus = approvestatus == null ? BillEnumCollection.ApproveStatus.NOSTATE.VALUE : approvestatus;
            String billtype = (String)this.getParentVO().getAttributeValue("pk_billtype");
            String string = top_billtype = ArrayUtils.isEmpty((Object[])aggvo.getChildrenVO()) ? null : (String)aggvo.getChildrenVO()[0].getAttributeValue("top_billtype");
            if (ArapBillPubUtil.isFromArap((BaseBillVO)this.getParentVO(), (BaseItemVO)aggvo.getChildrenVO()[0])) {
                if (null == effectstaus) continue;
                return this.getMessage((Integer)billstatus, (Integer)effectstaus == null ? Integer.valueOf(-1) : effectstaus, (Integer)approvestatus);
            }
            if (!StringUtils.isNotEmpty((CharSequence)top_billtype) || null == effectstaus) continue;
            HashMap<String, Object> extra = new HashMap<String, Object>();
            extra.put("top_billtype", top_billtype);
            extra.put("pk_billtype", billtype);
            ValidationFailure msgfromOtherSys = this.getMsgfromOtherSys((Integer)billstatus, (Integer)effectstaus == null ? Integer.valueOf(-1) : effectstaus, (Integer)approvestatus, extra);
            if (msgfromOtherSys == null) continue;
            return msgfromOtherSys;
        }
        return null;
    }

    protected abstract ValidationFailure getMessage(Integer var1, Integer var2, Integer var3);

    protected abstract ValidationFailure getMsgfromOtherSys(Integer var1, Integer var2, Integer var3, Map<String, Object> var4);
}

