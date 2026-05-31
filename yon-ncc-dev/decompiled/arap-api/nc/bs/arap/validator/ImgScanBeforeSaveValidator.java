/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.itf.arap.bill.image.IArapImgCheckService;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;

public class ImgScanBeforeSaveValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        try {
            for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
                ValidationFailure failure = ((IArapImgCheckService)NCLocator.getInstance().lookup(IArapImgCheckService.class)).checkPermissionBeforeSave(aggvo);
                if (failure == null) continue;
                return failure;
            }
        }
        catch (BusinessException e) {
            throw new BusinessRuntimeException(e.getMessage(), (Throwable)e);
        }
        return null;
    }
}

