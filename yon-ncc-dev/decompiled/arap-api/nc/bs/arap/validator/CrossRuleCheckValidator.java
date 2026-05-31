/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.utils.crosscheckrule.CrossControlMsgException
 *  nc.utils.crosscheckrule.FipubCrossCheckRuleChecker
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.utils.crosscheckrule.CrossControlMsgException;
import nc.utils.crosscheckrule.FipubCrossCheckRuleChecker;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class CrossRuleCheckValidator
extends AbstractValidator {
    public ValidationFailure validate(Object obj) throws BusinessException {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        FipubCrossCheckRuleChecker checker = new FipubCrossCheckRuleChecker();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            BaseAggVO billVO = (BaseAggVO)aggvo;
            if (billVO.isCrossCheckPassed()) {
                return null;
            }
            BaseBillVO parentVO = (BaseBillVO)billVO.getParentVO();
            String retMsg = checker.check2(parentVO.getPk_org(), parentVO.getPk_tradetype(), (AggregatedValueObject)billVO);
            if (retMsg == null || retMsg.length() <= 0) continue;
            throw new CrossControlMsgException(retMsg);
        }
        return null;
    }
}

