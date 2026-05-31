/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class InterceptorValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ValidationFailure valida = null;
        try {
            String actionCode = ArapConstant.DELETE;
            if (((AggregatedValueObject[])obj)[0].getParentVO().getPrimaryKey() == null) {
                actionCode = ArapConstant.SAVE;
            }
            ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator((AggregatedValueObject[])obj, actionCode);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
            valida = new ValidationFailure(e.getMessage());
        }
        return valida;
    }
}

