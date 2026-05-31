/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.itf.arap.tbb.ITBBCtrlService;

public class TBBCtrlValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        try {
            String eventType = "1001";
            if (((AggregatedValueObject[])obj)[0].getParentVO().getPrimaryKey() == null) {
                eventType = "1006";
            }
            ((ITBBCtrlService)NCLocator.getInstance().lookup(ITBBCtrlService.class)).budgetCheck((AggregatedValueObject[])((BaseAggVO[])obj), eventType);
        }
        catch (BusinessException e) {
            return new ValidationFailure(e.getMessage());
        }
        return null;
    }
}

