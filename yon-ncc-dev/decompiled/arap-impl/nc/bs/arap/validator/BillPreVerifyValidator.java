/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService;

public class BillPreVerifyValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        AggregatedValueObject[] aggObj = (AggregatedValueObject[])obj;
        try {
            IBillVerifyQueryService service = (IBillVerifyQueryService)NCLocator.getInstance().lookup(IBillVerifyQueryService.class);
            for (AggregatedValueObject aggvo : aggObj) {
                String pk_bill;
                UFBoolean isLinkedBill;
                this.setObj(aggvo);
                BaseBillVO parentVO = (BaseBillVO)aggvo.getParentVO();
                if (parentVO.getIsinit().booleanValue() || !(isLinkedBill = service.isLinkedBill(pk_bill = parentVO.getPrimaryKey())).booleanValue()) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0133"));
            }
        }
        catch (BusinessException e) {
            return new ValidationFailure(e.getMessage());
        }
        return null;
    }
}

