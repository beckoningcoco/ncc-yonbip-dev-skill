/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.itf.cmp.IApplyService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 */
package nc.bs.arap.validator;

import java.util.ArrayList;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.cmp.IApplyService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class OriginCMPAPPLYBillValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ArrayList<String> top_billIDs = new ArrayList<String>();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            CircularlyAccessibleValueObject[] childrenVOs;
            this.setObj(aggvo);
            if (!((BaseAggVO)aggvo).isFromClient()) {
                return null;
            }
            for (CircularlyAccessibleValueObject childrenVO : childrenVOs = aggvo.getChildrenVO()) {
                Object top_billtype = childrenVO.getAttributeValue("top_billtype");
                Object top_billId = childrenVO.getAttributeValue("top_billid");
                if (null == top_billtype || !top_billtype.equals("36D1") || null == top_billId) continue;
                top_billIDs.add(top_billId.toString());
            }
            if (top_billIDs == null || top_billIDs.size() <= 0) continue;
            IApplyService applyService = (IApplyService)NCLocator.getInstance().lookup(IApplyService.class);
            try {
                if (!applyService.isHasOpsrctype(top_billIDs.toArray(new String[0]))) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0754"));
            }
            catch (BusinessException e) {
                ExceptionUtils.wrappException((Exception)((Object)e));
            }
        }
        return null;
    }
}

